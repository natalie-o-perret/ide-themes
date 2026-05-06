# natalie-perret-monokai-jetbrains

Port of [Monokai Charcoal High Contrast](https://marketplace.visualstudio.com/items?itemName=74th.monokai-charcoal-high-contrast) (by [74th](https://github.com/74th)) to JetBrains IDEs.

Part of [ide-themes](https://github.com/natalie-o-perret/ide-themes).

## Palette

| Role                 | Color     |
| -------------------- | --------- |
| Background           | `#000000` |
| Foreground           | `#FFFFFF` |
| Comment              | `#FD971F` |
| Keyword              | `#F92672` |
| String               | `#E6DB74` |
| Number / Constant    | `#AE81FF` |
| Class / Function     | `#A6E22E` |
| Type / Interface     | `#66D9EF` |
| Parameter            | `#FD971F` |
| Selection            | `#6688CC` |
| Gutter / Line number | `#43B9D8` |

## Variants

| File                                  | Accent                         |
| ------------------------------------- | ------------------------------ |
| `natalie-perret-monokai.icls`         | `#43B9D8` cyan (default)       |
| `natalie-perret-monokai-gray.icls`    | `#8f8f8f`                      |
| `natalie-perret-monokai-green.icls`   | `#A6E22E`                      |
| `natalie-perret-monokai-orange.icls`  | `#FD971F`                      |
| `natalie-perret-monokai-purple.icls`  | `#AE81FF`                      |
| `natalie-perret-monokai-red.icls`     | `#f82a5d`                      |
| `natalie-perret-monokai-white.icls`   | `#f1f1f1`                      |
| `natalie-perret-monokai-yellow.icls`  | `#e7dc60`                      |
| `natalie-perret-monokai-teal.icls` | `#35BF5C` (teal) |

## Install

### From the JetBrains Marketplace (coming soon)

Search for **natalie-perret-monokai** in **Settings > Plugins > Marketplace**. All 9 variants are included — pick one in **Settings > Editor > Color Scheme**.

### Manual (build from source)

Requires Java 17+.

```bash
cd natalie-perret-monokai-jetbrains
./gradlew buildPlugin
# output: build/distributions/natalie-perret-monokai-*.zip
```

Then in the IDE: **Settings > Plugins > gear > Install Plugin from Disk**, pick the `.zip`.

### Import a single .icls

Download the `.icls` you want from `src/main/resources/colors/` and import via **Settings > Editor > Color Scheme > gear > Import Scheme**.

Works with IntelliJ IDEA, GoLand, Rider, WebStorm, PyCharm, RustRover, CLion, DataGrip, etc.

## License

MIT
