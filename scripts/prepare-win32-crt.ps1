param([Parameter(Mandatory=$true)][string]$BuildDirectory)
$ErrorActionPreference = 'Stop'
Add-Type -AssemblyName System.IO.Compression.FileSystem
# Microsoft VC CRT Headers 14.44.35220 package (include directory 14.44.35207).
# Extract source headers only; no installer or downloaded executable is run.
$expected = '852382a9aa73502b7849c1bcadfb603ba7175c4e8b60e6aba03c7de711d4ece5'
$uri = 'https://download.visualstudio.microsoft.com/download/pr/c610cd8c-801b-44b8-a80a-82cc382aeb43/852382a9aa73502b7849c1bcadfb603ba7175c4e8b60e6aba03c7de711d4ece5/Microsoft.VC.14.44.17.14.CRT.Headers.base.vsix'
$root = [IO.Path]::GetFullPath($BuildDirectory)
[IO.Directory]::CreateDirectory($root) | Out-Null
$archive = Join-Path $root 'crt-headers.vsix'
if (!(Test-Path -LiteralPath $archive)) {
    [Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
    $client = New-Object Net.WebClient
    try { $client.DownloadFile($uri, $archive) } finally { $client.Dispose() }
}
$algorithm = [Security.Cryptography.SHA256]::Create()
$stream = [IO.File]::OpenRead($archive)
try { $actual = [BitConverter]::ToString($algorithm.ComputeHash($stream)).Replace('-', '').ToLowerInvariant() }
finally { $stream.Dispose(); $algorithm.Dispose() }
if ($actual -ne $expected) { throw 'Win32 CRT header archive SHA-256 mismatch' }
$include = Join-Path $root 'crt-14.44.35220'
[IO.Directory]::CreateDirectory($include) | Out-Null
$prefix = $include + [IO.Path]::DirectorySeparatorChar
$zip = [IO.Compression.ZipFile]::OpenRead($archive)
try {
    foreach ($entry in $zip.Entries) {
        if ($entry.FullName -notmatch '^Contents/VC/Tools/MSVC/14\.44\.35207/include/(.+)$' -or $entry.Name -eq '') { continue }
        $destination = [IO.Path]::GetFullPath((Join-Path $include $Matches[1]))
        if (!$destination.StartsWith($prefix, [StringComparison]::OrdinalIgnoreCase)) { throw 'Invalid CRT header entry path' }
        [IO.Directory]::CreateDirectory([IO.Path]::GetDirectoryName($destination)) | Out-Null
        [IO.Compression.ZipFileExtensions]::ExtractToFile($entry, $destination, $true)
    }
} finally { $zip.Dispose() }
if (!(Test-Path -LiteralPath (Join-Path $include 'excpt.h'))) { throw 'CRT header extraction incomplete' }
