# Liberation Sans Regular source fixture

The unchanged `LiberationSans-Regular.ttf` comes from the upstream
[Liberation Fonts 2.1.5 archive](https://github.com/liberationfonts/liberation-fonts/files/7261482/liberation-fonts-ttf-2.1.5.tar.gz),
tag `2.1.5`, release commit `4b01920`. It was extracted byte-for-byte, without
subsetting, normalization, hinting changes or regeneration. Its SIL Open Font
License 1.1 is included as `OFL-1.1.txt`.

SHA-256: `76d04c18ea243f426b7de1f3ad208e927008f961dc5945e5aad352d0dfde8ee8`.

An independent audit using `fontTools==4.59.1` (`fontTools.ttLib.TTFont`) under
Python `3.14.7` found U+0041 at glyph ID 36, horizontal advance 1366 and left
side bearing 4, with units/em 2048. These literal values, reviewed independently
of the bindings, imply advances 1366 at numeric font size 2048 and 683 at 1024.

## Same-name advance variant

Tests create an in-memory derivative; the original binary is never overwritten.
Independent inspection of the SFNT directory finds `hmtx` at `0x218`, length
`0x28f0`, directory checksum at `0xd0`, and `hhea.numberOfHMetrics` 2620.
Glyph 36 therefore has its four-byte metric at `0x218 + 36 * 4 = 0x2a8`.
The original advance bytes are `0x0556` (1366), left bearing `0x0004`.
`head` begins at `0x13c`, with checksum adjustment `0xbd239d90` at `0x144`.
The name table at `0x4992c`, length `0xb88`, is unchanged.

The recipe writes `0x07d0` (2000) at `0x2a8`, replaces the `hmtx` directory
checksum `0x7cd4d31d` with `0x7f4ed31d` at `0xd0`, and writes head adjustment
`0xb82f9d90` at `0x144`. The metric and directory checksum each add
`(2000 - 1366) << 16 = 0x027a0000` to the SFNT sum; the adjustment subtracts
`0x04f40000`. The whole-font checksum remains `0xb1b0afba` and the head table
checksum, which excludes the adjustment, remains unchanged.

The independent expected advances are 2000 at font size 2048 and 1000 at 1024.
The unchanged name table makes this distinguish supplied-byte creation from
substitution with a namesake font. The test-only native observer does not
derive these expectations from production getters.
