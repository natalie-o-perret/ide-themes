# jetbrains/monokai

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

| File                                 | Accent                   |
| ------------------------------------ | ------------------------ |
| `natalie-perret.icls`        | `#43B9D8` cyan (default) |
| `natalie-perret-gray.icls`   | `#8f8f8f`                |
| `natalie-perret-green.icls`  | `#A6E22E`                |
| `natalie-perret-orange.icls` | `#FD971F`                |
| `natalie-perret-purple.icls` | `#AE81FF`                |
| `natalie-perret-red.icls`    | `#f82a5d`                |
| `natalie-perret-white.icls`  | `#f1f1f1`                |
| `natalie-perret-yellow.icls` | `#e7dc60`                |
| `natalie-perret-teal.icls`   | `#35BF5C` (teal)         |

## Install

### From the JetBrains Marketplace (coming soon)

Search for **natalie-perret** in **Settings > Plugins > Marketplace**. All 9 variants are included — pick one in **Settings > Editor > Color Scheme**.

### Manual (build from source)

Requires Java 17+.

```bash
cd jetbrains/monokai
./gradlew buildPlugin
# output: build/distributions/natalie-perret-*.zip
```

Then in the IDE: **Settings > Plugins > gear > Install Plugin from Disk**, pick the `.zip`.

### Import a single .icls

Download the `.icls` you want from `src/main/resources/colors/` and import via **Settings > Editor > Color Scheme > gear > Import Scheme**.

Works with IntelliJ IDEA, GoLand, Rider, WebStorm, PyCharm, RustRover, CLion, DataGrip, etc.

## License

MIT
