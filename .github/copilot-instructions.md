# Copilot code review instructions for ide-themes

## General guidelines

- Flag any hardcoded hex color values that are introduced outside of the main theme token files; they should be defined as variables or referenced from the existing palette.
- Warn on duplicate color definitions — if the same hex value is defined more than once under different names, flag it for consolidation.
- Ensure new color tokens follow the existing naming convention (e.g. `keyword`, `string`, `comment`, not ad-hoc names).

## VS Code extension

- Validate that `package.json` version is bumped when theme JSON files change.
- Flag `contributes.themes` entries that reference missing `.json` theme files.
- Warn if `engine.vscode` minimum version is lowered without justification.

## JetBrains plugin

- Ensure the `plugin.xml` `version` is bumped whenever theme files change.
- Flag deprecated `<option>` attributes or XML schema elements that may not be supported in recent IntelliJ platform versions.
- Warn if the Gradle `pluginVerifier` task is removed or skipped.

## Documentation

- README examples should use fenced code blocks with a language tag; flag bare code blocks.
- Screenshot or preview images should be committed to the repo, not hotlinked from external URLs.
