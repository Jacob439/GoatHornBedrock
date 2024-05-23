# Goat Horn Bedrock
## A simple patch for Bedrock players using Geyser
I wrote a plugin to patch this issue which can be found here: https://www.spigotmc.org/resources/goat-horn-bedrock.116914/

I did not make a PR because I don't think this is a very clean solution, but here is my code if someone wants to write a PR based on what I wrote: https://github.com/Jacob439/GoatHornBedrock

Details of my implementation:
1. The music instrument metadata of any goat horn that is added to a player's inventory using an `EntityPickupItemEvent` is saved in item metadata
2. On a `PlayerInteractEvent` I check if the item is a goat horn
3. I reference my previously saved metadata to play the corresponding sound
