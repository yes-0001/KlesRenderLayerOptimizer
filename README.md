<div align="center">
    <h1>Kle's Render Layer Optimizer</h1>
    <a href="https://fabricmc.net"><img src="https://img.shields.io/badge/Mod%20Loader-Fabric-lightyellow?logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAACXBIWXMAAAsTAAALEwEAmpwYAAAFHGlUWHRYTUw6Y29tLmFkb2JlLnhtcAAAAAAAPD94cGFja2V0IGJlZ2luPSLvu78iIGlkPSJXNU0wTXBDZWhpSHpyZVN6TlRjemtjOWQiPz4gPHg6eG1wbWV0YSB4bWxuczp4PSJhZG9iZTpuczptZXRhLyIgeDp4bXB0az0iQWRvYmUgWE1QIENvcmUgNS42LWMxNDIgNzkuMTYwOTI0LCAyMDE3LzA3LzEzLTAxOjA2OjM5ICAgICAgICAiPiA8cmRmOlJERiB4bWxuczpyZGY9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkvMDIvMjItcmRmLXN5bnRheC1ucyMiPiA8cmRmOkRlc2NyaXB0aW9uIHJkZjphYm91dD0iIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtbG5zOmRjPSJodHRwOi8vcHVybC5vcmcvZGMvZWxlbWVudHMvMS4xLyIgeG1sbnM6cGhvdG9zaG9wPSJodHRwOi8vbnMuYWRvYmUuY29tL3Bob3Rvc2hvcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RFdnQ9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZUV2ZW50IyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ0MgMjAxOCAoV2luZG93cykiIHhtcDpDcmVhdGVEYXRlPSIyMDE4LTEyLTE2VDE2OjU0OjE3LTA4OjAwIiB4bXA6TW9kaWZ5RGF0ZT0iMjAxOS0wNy0yOFQyMToxNzo0OC0wNzowMCIgeG1wOk1ldGFkYXRhRGF0ZT0iMjAxOS0wNy0yOFQyMToxNzo0OC0wNzowMCIgZGM6Zm9ybWF0PSJpbWFnZS9wbmciIHBob3Rvc2hvcDpDb2xvck1vZGU9IjMiIHBob3Rvc2hvcDpJQ0NQcm9maWxlPSJzUkdCIElFQzYxOTY2LTIuMSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDowZWRiMWMyYy1mZjhjLWU0NDEtOTMxZi00OTVkNGYxNGM3NjAiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6MGVkYjFjMmMtZmY4Yy1lNDQxLTkzMWYtNDk1ZDRmMTRjNzYwIiB4bXBNTTpPcmlnaW5hbERvY3VtZW50SUQ9InhtcC5kaWQ6MGVkYjFjMmMtZmY4Yy1lNDQxLTkzMWYtNDk1ZDRmMTRjNzYwIj4gPHhtcE1NOkhpc3Rvcnk+IDxyZGY6U2VxPiA8cmRmOmxpIHN0RXZ0OmFjdGlvbj0iY3JlYXRlZCIgc3RFdnQ6aW5zdGFuY2VJRD0ieG1wLmlpZDowZWRiMWMyYy1mZjhjLWU0NDEtOTMxZi00OTVkNGYxNGM3NjAiIHN0RXZ0OndoZW49IjIwMTgtMTItMTZUMTY6NTQ6MTctMDg6MDAiIHN0RXZ0OnNvZnR3YXJlQWdlbnQ9IkFkb2JlIFBob3Rvc2hvcCBDQyAyMDE4IChXaW5kb3dzKSIvPiA8L3JkZjpTZXE+IDwveG1wTU06SGlzdG9yeT4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4/HiGMAAAAtUlEQVRYw+XXrQqAMBQF4D2P2eBL+QIG8RnEJFaNBjEum+0+zMQLtwwv+wV3ZzhhMDgfJ0wUSinxZUQWgKos1JP/AbD4OneIDyQPwCFniA+EJ4CaXm4TxAXCC0BNHgLhAdAnx9hC8PwGSRtAFVMQjF7cNTWED8B1cgwW20yfJgAvrssAsZ1cB3g/xckAxr6FmCDU5N6f488BrpCQ4rQBJkiMYh4ACmLzwOQF0CExinkCsvw7vgGikl+OotaKRwAAAABJRU5ErkJggg=="></a>
    <!-- <a href="https://files.minecraftforge.net/net/minecraftforge/forge"><img src="https://img.shields.io/badge/Mod%20Loader-Forge-lightyellow?logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAYCAYAAACbU/80AAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAALySURBVEhLtZZPaBNBFMbzz42NtoII0aCiRQURVGIFEak3URFEEHqUCkVsPZSKoHjQiwjiQb1UFOlBUXoS0XjowYte1JutF6kKUtYIUQpN1k3zz9+bndos3TabNPng4817b+Z7Mzs7sxtoFKVSaV25XO6BD4vF4nodbi4QD+nmfxDbWqlUnsFfUIHYNZ12gUluI32R/Ed4Uof9g0EGPKVdBUS7nLIumMTbdT7BmLNwjHjOSSuklIAfMLhDN6V9Hx7XrvhrEJtyNOdBfBjzBP5RATcKcDSbzQa1zNJA7A7slTYrGmTwd/Z5tUoCcq+V7NL4DVP07Udjh23b/ooLGHSMwVPY/UJRw97V6QDuJYl54Af9RuBpijb2YqbT6RCr3YTIIQTHEEpiTVEndlj6ENuDW5RYNcj3KZHlAqGD8CrsolgHthv9HPYz+2hIH/y3qqobD5RAM0CxPgTfY3drfx/+NPaG9s+oklUgNm6a5oKj2zAQvI6uje0Xn/Yu2hNsUbJQKBj4k1JYI0/uOfGVavBykM/nIxSRfb7taKvVjUrOsqw425CQNrFeUu+wA7BTYvXC82jkcrlEKBTqjkajbcFg0JIQBfIcpQ+xWEy9AyBMcbEV+vzFrtAUTZXQmKsxrfu54DkBisXpLIVKTkT1s3kqVyKRiGyHraLzhTx1qtAGL6D5yHFrgAmcU8+d/YdWFUuwUQxpeRc8Z05neZPvwQEVqB+zcAKdT9ivLEhOz5hhGF9U1i8YdBS+QOgnnIW1ICfmFnfHzkwmU2tb/APRtbCTI/ZYF/KCfPmO6CGtAadgC0Xki+eFYd2tteDxtlMs7dR04bzuUhcauTblsxx1mi5s17Y14PYLs/q9rDTlLHgBLN6TIfps0EOaB4Tl0zwO/dwDM3CES0tuxZrwdVQQvIm57HgKb4i9ZGLfaK8Kh8MHsD0wLkkgN+RGbj7TcReH3wkkMfIzQrMyyXfilUpUgUe/mfgJmrLyGSb3lInNXdmLIBD4Bw72x5r0eQ99AAAAAElFTkSuQmCC"></a> -->
    <img src="https://img.shields.io/badge/Enviroment-Client-purple">
    <a href="https://discord.gg/klecakes"><img src="https://img.shields.io/discord/1125857151458492539?color=0098DB&label=Discord&logo=discord&logoColor=0098DB"></a>
    <a href="https://modrinth.com/mod/krlo"><img src="https://img.shields.io/badge/dynamic/json?color=158000&label=downloads&prefix=+%20&query=downloads&url=https://api.modrinth.com/v2/project/I7pelLQM&logo=modrinth"></a>
    <p>Kle's Render Layer Optimizer looks to fix the issues of Minecraft's rendering layers on items and armor. Minecraft's rendering layer tanks your fps when many items or players are on your screen.</p>
</div>

## What are rendering layers and what kind of performance hit do they cause?
Rendering layers is Minecraft's system to break down how entities, items, and models are drawn for performance. These are the different rendering layers this mod looks to tackle:
- glint
- armor trim
- pattern layers (banners, shields)
- color layers (leather armor, tipped arrows, potions, etc)

Each layer is another thing for your gpu to draw, from testing, `10` enchanted helmets (`1` layer each) drops your fps by `20-25` compared to `10` non-enchanted helmets.

## What does this mod do at it's current state?
Right now it can only disable the glint layer from being rendered, this greatly improves performance on `1000` armor stands w/ enchanted armor from `36fps` to `47fps` (very unrealistic scenario) but it's only the start of what I'd like this mod to do. The other rendering layers and earlier/later game versions (forge, neoforge, and quilt hopefully too) will come in later updates.

It's the final 2 weeks at my university for this semester so I only had time for the glint layer which was my main goal, stay tuned for more!

## examples of this mod in action:
(I chose 100 armor stands for these tests because `100` is a more daily occurance than `1000`, only mods installed is what's required [no other optimization mods], works with all other optimization mods)
#### 100 armor stands not-enchanted (baseline) - `291fps`
![100 armor stands not-enchanted (baseline)](https://cdn.modrinth.com/data/I7pelLQM/images/50925aafbcce3dd80107b436c8b04b7c81ab5e80.png)
#### 100 armor stands enchanted (mod not enabled) - `261fps`
![100 armor stands enchanted (mod not enabled)](https://cdn.modrinth.com/data/I7pelLQM/images/3ca9eae787920c923ae6120756c98c57efed4675.png)
#### 100 armor stands enchanted (mod enabled) - `293fps`
![100 armor stands enchanted (mod enabled)](https://cdn.modrinth.com/data/I7pelLQM/images/01c4deee389e3795569aa860c4096c647d39d5da.png)

### performance bugs this mod tackles:
- https://bugs-legacy.mojang.com/browse/MC-233604
- https://bugs-legacy.mojang.com/browse/MC-233605
- https://bugs-legacy.mojang.com/browse/MC-166101

### toggles:
```
- Items:   fishing rod, books, tools (flint & steel, carrot on a stick, brush, compass, shears, etc.)
- Weapons: swords, tridents, bows, crossbows, axes, maces, and shields.
- Armor:   player/animal armor and elytra.
- Other:   all items that fall outside these categories (i.e. modded items, custom enchanted items like strength 5 dirt)
```

# Requirements
- [Fabric API](https://modrinth.com/mod/fabric-api)
- [Cloth Config API](https://modrinth.com/mod/cloth-config)
- (optional) [Mod Menu](https://modrinth.com/mod/modmenu)