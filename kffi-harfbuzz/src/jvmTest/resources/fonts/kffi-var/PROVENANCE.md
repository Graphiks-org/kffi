# KffiVar variable-font fixture

## Source

- Origin: project-owned, generated entirely for this repository.
- Generator: [`../../../../../tools/generate_kffi_var_font.py`](../../../../../tools/generate_kffi_var_font.py) (committed alongside this fixture).
- Generator toolchain: fontTools `4.65.0` on CPython.
- Checked-in file: `KffiVar.ttf`
- SHA-256 of `KffiVar.ttf`: `0c349260a7ba8ca8f89e37074a87de5db2904f3b720328ea0acbc7eaef5376b5`
- Size of `KffiVar.ttf`: `1084` bytes
- License: [`LICENSE.txt`](LICENSE.txt), the repository MIT license notice. No third-party font data is included.

No third-party font, table, outline, or metric data is used. Every glyph,
metric, axis and variation delta is produced by the committed generator from
constants declared in that script. Regenerating the script reproduces the
file byte for byte (the `head` timestamps are frozen and `recalcTimestamp` is
disabled).

## Structure

- Units per em: `1000`.
- `fvar`: one `wght` axis, `100` minimum, `400` default, `900` maximum.
- `gvar` + `HVAR`: the horizontal advance of `A` (glyph id `2`) varies with the
  axis; the base `hmtx` advance is `600`.
- `vhea` + `vmtx`: the vertical advance of `A` is a constant `1300` design
  units, so `hb_font_get_glyph_v_advance` has a non-trivial value.

## Independent oracle

The expected metrics below were produced outside the implementation under
test, against this exact `KffiVar.ttf`, using external `hb-shape (HarfBuzz)
14.4.0` at a font size of `1000`:

```sh
hb-shape --no-glyph-names --font-size=1000 KffiVar.ttf 'A'
hb-shape --no-glyph-names --font-size=1000 --variations=wght=100 KffiVar.ttf 'A'
hb-shape --no-glyph-names --font-size=1000 --variations=wght=900 KffiVar.ttf 'A'
hb-shape --no-glyph-names --font-size=1000 --direction=ttb KffiVar.ttf 'A'
```

```text
default:        [2=0+600]
wght=100:       [2=0+500]
wght=900:       [2=0+800]
ttb default:    [2=0@-300,-800+0,-1300]
```

The horizontal advances are `600`, `500` and `800`.

The vertical advance reported by `hb_font_get_glyph_v_advance` was derived
from the checked-in HarfBuzz `14.3.0` source
(`hb-ot-font.cc`, `hb_ot_get_glyph_v_advances`), which computes
`em_scale_y (- (int) vmtx.get_advance_without_var_unscaled (glyph))`. With
`vmtx` advance `1300` at scale `1000 / upem`, that yields `-1300`. The same
magnitude `-1300` is visible as the `ttb` y-advance in the `hb-shape` output
above, cross-checking the sign and value against an independent tool.

The glyph ink extents reported by `hb_font_get_glyph_extents` were produced by
the same external `hb-shape (HarfBuzz) 14.4.0`, with `--show-extents`:

```sh
hb-shape --no-glyph-names --font-size=1000 --show-extents KffiVar.ttf 'A'
hb-shape --no-glyph-names --font-size=1000 --show-extents --variations=wght=100 KffiVar.ttf 'A'
hb-shape --no-glyph-names --font-size=1000 --show-extents --variations=wght=900 KffiVar.ttf 'A'
```

```text
default:        [2=0+600<100,700,400,-700>]
wght=100:       [2=0+500<100,700,300,-700>]
wght=900:       [2=0+800<100,700,600,-700>]
```

`A` is a triangle whose base tracks the advance, so the ink box moves with the
axis even though only the advance is in `HVAR`: its width is `400`, `300` and
`600`, with a constant `x`/`y` bearing of `100`/`700` and height `-700`. The
expectation was cross-checked with Python `ctypes` against the bundled HarfBuzz
`14.3.0` `libharfbuzz.dylib`, which returned the same four `int32` fields at each
location.

The tests call the Kotlin binding once and compare its results with these
frozen literals; they never invoke `hb-shape` at runtime and never use the
binding under test as its own oracle.
