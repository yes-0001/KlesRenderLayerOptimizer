# <p align="center">Kle's Render Layer Optimizer</p>
Kle's Render Layer Optimizer looks to fix the issues of Minecraft's rendering layers on items and armor. Minecraft's rendering layer tanks your fps when many items or players are on your screen.

## What are rendering layers and what kind of performance hit do they cause?
Rendering layers is Minecraft's system to break down how entities and models are drawn for performance and customization. These are the different rendering layers this mod looks to tackle:
- glint
- armor trim
- pattern layers (banners, shields)
- color layers (leather armor, tipped arrows, potions, etc)

Each layer is another thing for your gpu to draw, from testing, 10 enchanted helmets (1 layer each) drops your fps by 20-25 compared to 10 non-enchanted helmets.

## What does this mod do at it's current state?
Right now it can only disable the glint layer from being rendered, this greatly improves performance on 1000 armor stands w/ enchanted armor from 36fps to 47fps but it's only the start of what I'd like this mod to do. The other rendering layers will come in later updates.

### performance bugs this mod tackles:
- https://bugs-legacy.mojang.com/browse/MC-233604
- https://bugs-legacy.mojang.com/browse/MC-233605
- https://bugs-legacy.mojang.com/browse/MC-166101

toggles:
```
- Items:   fishing rod, books, tools (flint & steel, carrot on a stick, brush, compass, shears, etc.)
- Weapons: swords, tridents, bows, crossbows, axes, maces, and shields.
- Armor:   player/animal armor and elytra.
- Other:   all items that fall outside these categories (i.e. modded items, custom enchanted items like strength 5 dirt)
```