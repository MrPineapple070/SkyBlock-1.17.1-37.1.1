MC 1.17.1  
=========  
* * *  
  
Build: 37.1.0  
-------------  
Tuesday November 30 16:58:27 UTC 2021  
lexmanos:  
Bump version for final RB of 1.17's lifecycle. Move on to 1.18!  
  
Build: 37.0.127  
-------------  
Tuesday November 30 16:44:02 UTC 2021  
lexmanos:  
Fix LiquidBlock's fluid field not being redirected to the supplier getFluid. Closes #7922  
  
Build: 37.0.126  
-------------  
Thursday November 25 21:10:10 UTC 2021  
sciwhiz12:  
[1.17.x Omnibus] Fix typos and javadocs across code base (#8144)  
  
  
Build: 37.0.125  
-------------  
Thursday November 25 20:30:40 UTC 2021  
uSkizzik:  
Fix Spectating Part Entity (MC-46486) (#8206)  
  
ateranimavis:  
Fix /forge setdimension command arguments not parsing/suggesting correctly.  
  
  
Build: 37.0.123  
-------------  
Thursday November 25 20:17:03 UTC 2021  
paintninja:  
Use HttpClient for VersionChecker (#8148)  
  
  
Build: 37.0.122  
-------------  
Thursday November 25 20:03:19 UTC 2021  
Harleyoc1:  
Changed control flow of post mouse events to allow listening to events handled by vanilla. (#8133)  
  
  
Build: 37.0.121  
-------------  
Thursday November 25 19:13:10 UTC 2021  
sciwhiz12:  
Deprecate durability bar methods in Item extension (#8214)  
  
To retain compatibility with existing mods, the vanilla methods redirect  
to the extension methods for now.  
  
Users should now use and override the vanilla methods as directed in  
the javadocs of the now-deprecated methods, as the extension methods  
will be removed in the future.  
  
Fixes #8201  
  
  
Build: 37.0.120  
-------------  
Thursday November 25 18:59:09 UTC 2021  
sciwhiz12:  
Reorder image tooltip component to match vanilla (#8213)  
  
Fixes #8212  
  
  
Build: 37.0.119  
-------------  
Thursday November 25 10:14:28 UTC 2021  
contact:  
Fix render pipeline lighting issue with small cubes (#8158)  
  
This will also allow other mods which need to calculate small normalised vectors to be able to use the default classes without needing to write their own, while not effecting any side effects created by how the base game uses this function.  
  
  
Build: 37.0.118  
-------------  
Thursday November 25 02:03:27 UTC 2021  
championash5357:  
Fixes infinite loop when dismounting in `EntityMountEvent` (#8114)  
  
  
Build: 37.0.117  
-------------  
Wednesdaynesday November 24 21:54:07 UTC 2021  
ichttt:  
Fix onChunkUnloaded not gettting called correctly (#8103)  
  
  
Build: 37.0.116  
-------------  
Wednesday November 24 01:16:10 UTC 2021  
daemonumbra:  
Fix potential issue with BackgroundScanHandler for users with slow disc IO (#8176)  
  
diesieben07:  
Fix death message for tamed animals not having proper cause of death. (#8196)  
  
  
Build: 37.0.114  
-------------  
Wednesday November 24 01:02:40 UTC 2021  
telepathicgrunt:  
Make WorldEvent.Load run for Overworld before chunk creation like other dimensions (#8167)  
  
  
Build: 37.0.113  
-------------  
Wednesday November 24 00:48:00 UTC 2021  
platinpython:  
Deprecate net.minecraftforge.common.util.Constants and inner classes to encourage usage of vanilla constants (#8140)  
  
  
Build: 37.0.112  
-------------  
Sunday November 21 18:26:44 UTC 2021  
supermartijn642:  
[1.17.x] Change expected type of LootTable fields to arrays (#8194)  
  
\#8184 reverted some LootTable patches, including the types of fields `f_79023_` and `f_79024_`. However, `ForgeLootTableProvider` still expects a list, however the type of the fields is an array now.  
This PR changes the expected type in `ForgeLootTableProvider` to an array as well.  
  
  
Build: 37.0.111  
-------------  
Sunday November 21 12:29:14 UTC 2021  
melanx:  
Apply window resizing to all gui layers (#8207)  
  
  
Build: 37.0.110  
-------------  
Saturday November 20 15:54:24 UTC 2021  
minecraftschurli:  
[1.17.x] make ScrollPanel better usable by modders (#8179)  
  
  
Build: 37.0.109  
-------------  
Saturday November 13 01:25:58 UTC 2021  
lexmanos:  
Update installer to 2.1.+ so we don't have to bump it in the future.  
  
  
Build: 37.0.108  
-------------  
Wednesday November 10 20:18:07 UTC 2021  
championash5357:  
Remove Old LootPool Patches (#8184)  
  
  
Build: 37.0.107  
-------------  
Tuesday November 09 22:31:15 UTC 2021  
minecraftschurli:  
Fix the hopefully last issue with GAMELIBRARY loading (#8162)  
  
ichttt:  
Remove the remnants of the selective reload listener (#8072)  
  
  
Build: 37.0.105  
-------------  
Tuesday November 09 22:17:00 UTC 2021  
uSkizzik:  
Fix part entities not working at all (#8177)  
  
  
Build: 37.0.104  
-------------  
Sunday October 31 11:26:47 UTC 2021  
xfacthd:  
Pass IModelData through IForgeBakedModel#getModelData() before asking the BakedModel for the particle texture (#8106)  
  
  
Build: 37.0.103  
-------------  
Wednesday October 20 19:23:46 UTC 2021  
xfacthd:  
Fix blocks with flammable material catching fire from lava when they are marked as non-flammable (#8160)  
  
  
Build: 37.0.102  
-------------  
Wednesday October 20 19:10:23 UTC 2021  
xfacthd:  
Add accessor to an unmodifiable view of the fullPots map in FlowerPotBlock (#8108)  
  
championash5357:  
Fix Breaking waterlogged blocks occasionally displays air for a frame Closes #7253 (#8128)  
  
djbake101:  
Add "forge:enchanting_materials" tag in place of Lapis in the Enchanting Table (#8149)  
  
35673674+alcatrazescapee:  
Add `BiomeDictionary#hasType(String)` (#8157)  
  
  
Build: 37.0.98  
-------------  
Wednesday October 20 18:56:43 UTC 2021  
championash5357:  
Fix Behavior With Unknown Items in Recipes (#8105)  
  
  
Build: 37.0.97  
-------------  
Sunday October 17 23:29:15 UTC 2021  
lexmanos:  
Disable jenkins cache system until a functional system is in place.  
  
diesieben07:  
Fix another crash with new tooltip events (#8155)  
  
* Fix another crash with new tooltip events  
* Add ItemStack context to ghost recipe tooltip events  
* Expand Tooltip Event test mod to add a screen to test all tooltip render methods  
  
  
Build: 37.0.95  
-------------  
Friday October 15 03:23:39 UTC 2021  
championash5357:  
Add entity source to PotionAddedEvent (#8147)  
  
  
Build: 37.0.94  
-------------  
Friday October 15 03:12:02 UTC 2021  
35673674+alcatrazescapee:  
Add ATs for world generation extensibility, focusing on `NoiseBasedChunkGenerator`, `NoiseSampler`, `NoiseBasedAquifer`, and `Beardifier` (#8087)  
  
dev:  
Fix Entity#onAddedToWorld not being called for non-player entities server-side (#8134)  
  
Mato.dipcar:  
Add helper methods to generate blockstate and models for button, pressure plate, sign to BlockStateProvider/ModelProvider (#8139)  
  
  
Build: 37.0.91  
-------------  
Friday October 15 03:00:33 UTC 2021  
Unbekannt1998:  
Make AdvancementProvider extensible by modders (#8120)  
  
  
Build: 37.0.90  
-------------  
Wednesday October 13 19:51:35 UTC 2021  
lexmanos:  
Skip loading jars with neither a manifest, nore a mods.toml.  
Deprecate helper functions related to ModFile/Metadata.  
Mark ModFileFactory as to be removed from our usage.  
It may be useful for other loaders, but introduces a weird level of indirection that makes things a pain.  
If there are consumers of this API please leave feedback before the next major mc version so we can be sure to provide something useful.  
  
  
Build: 37.0.89  
-------------  
Wednesday October 13 19:19:40 UTC 2021  
lexmanos:  
Fix mods with both a manifest and a mods.toml have mismatched module names.  
  
  
Build: 37.0.88  
-------------  
Wednesday October 13 12:02:44 UTC 2021  
diesieben07:  
Fix missing toolTip methods in Screen (#8154)  
  
  
Build: 37.0.87  
-------------  
Wednesday October 13 08:59:14 UTC 2021  
diesieben07:  
Fix render tooltip render patch (#8153)  
  
  
Build: 37.0.86  
-------------  
Wednesday October 13 01:49:43 UTC 2021  
lexmanos:  
Attempt to fix non-mods.toml jar files. Closes #8136 #8146 #8152  
Make jenkins copy gradle cache to address concurrent build issues.  
  
  
Build: 37.0.85  
-------------  
Monday October 11 18:37:30 UTC 2021  
diesieben07:  
Tooltip event rewrite (#8038)  
  
Redesigns the tooltip events, and adds a feature where mods can register factories for ClientTooltipComponents, which are used for custom rendering in tooltips. The old events are maintained for binary compatibility.  
  
  
Build: 37.0.84  
-------------  
Friday October 08 06:50:36 UTC 2021  
xfacthd:  
Add ForgeSpawnEggItem to lazily handle EntityTypes (#8044)  
  
  
Build: 37.0.83  
-------------  
Thursday October 07 20:32:10 UTC 2021  
xfacthd:  
Reimplement IForgeBlockEntity#onLoad() hook (#7946)  
  
  
Build: 37.0.82  
-------------  
Tuesday October 05 02:16:13 UTC 2021  
gigaherz:  
Implement GUI Stacking feature. (#8130)  
  
You can now use `mc.pushGuiLayer` and `mc.popGuiLayer` to manage the layers.  
mc.setScreen behaves such that if called with a non-null screen it replaces the entire stack, and if called with null it closes the entire stack.  
  
  
Build: 37.0.81  
-------------  
Monday October 04 22:10:17 UTC 2021  
gigaherz:  
Add ability for people to add custom pack finders (RepositorySources) (#8121)  
  
Added AddPackFindersEvent which lets you add additional resource/data pack sources to the game.  
Added PathResourcePack as a utility to allow easy providing of a subfolder in a mod as a resource pack.  
  
  
Build: 37.0.80  
-------------  
Monday October 04 21:43:22 UTC 2021  
onelemonyboi:  
Prevent Block/Entity data side leak on integrated servers by copying custom data before writing. #8111  
  
diesieben07:  
Added EntityEvent.EnteringSection event to replace EnteringChunk event. (#8078)  
  
  
Build: 37.0.78  
-------------  
Sunday October 03 18:12:16 UTC 2021  
alex.leo.barter:  
Fix breaking block particles not respecting IModelData (#8065)  
  
The sprite used for the block particles needs updating after the constructor otherwise it defaults to the texture sprite returned from passing ModelData.INSTANCE to get IForgeBakedModel#getParticleIcon. Calling updateSprite fetches the real IModelData instance for that blockstate/pos and sets the texture to the desired one  
  
sciwhiz12:  
Re-implement linear filtering text render types (#8052)  
  
* Re-implement linear filtering text render types  
  
Implements and closes #7996  
  
  
Build: 37.0.76  
-------------  
Sunday October 03 18:00:24 UTC 2021  
github:  
Fix Signs breaking with custom `WoodType`s (#8132)  
  
  
Build: 37.0.75  
-------------  
Friday October 01 20:21:24 UTC 2021  
lexmanos:  
Bump SJH version. Closes #8127  
Attempt addressing loading libraries during dev time, and bump SPI version introducing GAMELIBRARY type. #7976 #7957 #8090  
  
  
Build: 37.0.74  
-------------  
Friday October 01 05:54:38 UTC 2021  
lexmanos:  
Capability rework to get rid of @CapabilityInject and use CapabilityToken as the identifier, deprecated old system for removal in 1.18. (#8116)  
  
  
Build: 37.0.73  
-------------  
Monday September 27 19:59:19 UTC 2021  
onelemonyboi:  
Fix pet death message being sent when pet death event is canceled. (#8110)  
  
  
Build: 37.0.72  
-------------  
Monday September 27 19:26:34 UTC 2021  
rikka0w0:  
[1.17.x] implements canConnectRedstone(), Redstone dust now defers to the blockstate for determining connectivity (#8014)  
  
  
Build: 37.0.71  
-------------  
Friday September 24 21:10:52 UTC 2021  
sciwhiz12:  
Prevent call to Item#initializeClient when in datagen (#8097)  
  
When running under data-generation, the Minecraft singleton is unavailable  
even though the operating env is under the CLIENT dist. Adding this check  
prevents crashes from devs unaware of this, as most uses of  
IItemRenderProperties (usually for a custom BEWLR) make use of the  
Minecraft singleton and therefore will cause NPEs if not guarded against.  
  
A similar thing happens in MobEffect and Block.  
  
  
Build: 37.0.70  
-------------  
Sunday September 19 23:36:14 UTC 2021  
sciwhiz12:  
Move ItemStack#forgeInit call earlier to allow earlier capability queries (#8096)  
  
  
Build: 37.0.69  
-------------  
Sunday September 19 02:42:47 UTC 2021  
sciwhiz12:  
Remove incorrect FallingBlock patch (#8092)  
  
The patch accidentally replaces the minimum build height (set by the  
dimension via e.g. datapacks) with 0, causing falling blocks placed  
below Y level 0 to never fall.  
  
Fixes #8091  
  
  
Build: 37.0.68  
-------------  
Saturday September 18 21:58:41 UTC 2021  
sciwhiz12:  
Fix inverted hooks for PermissionsChangedEvent (#8089)  
  
Because IEventBus#post returns true on cancellation and the patched-in  
hooks inverts the return of the ForgeHooks method, if the player  
whose permission level is being changed is online and the event is not  
cancelled, the permission change _is_ cancelled.  
  
The fix is inverting the patched-in hooks and the default return value  
of the ForgeHooks method, so that the permission change is cancelled  
only if the player is online, the event is fired, and the event is cancelled.  
  
Fixes #8088  
  
  
Build: 37.0.67  
-------------  
Friday September 17 20:26:19 UTC 2021  
oriondevelopment:  
Add the missing patch for ItemStack for last build. (#8085)  
  
  
Build: 37.0.66  
-------------  
Friday September 17 18:23:28 UTC 2021  
oriondevelopment:  
Support Lazy capabilities on itemstacks, for better ItemStack copy performance. (#7945)  
  
  
Build: 37.0.65  
-------------  
Friday September 17 00:11:21 UTC 2021  
gigaherz:  
Fix EntityJoinWorldEvent not firing as expected: (#8033)  
  
- Fix entities loaded from disk not getting the event.  
- Fix vehicles with passengers getting the event twice.  
  
  
Build: 37.0.64  
-------------  
Thursday September 16 23:54:41 UTC 2021  
sciwhiz12:  
Re-add patch to release buffer in custom payload packet (#8042)  
  
noeppi-noeppi:  
Propagate all arguments passed to the server start scripts to the game (#8060)  
  
  
Build: 37.0.62  
-------------  
Thursday September 16 23:37:31 UTC 2021  
ichttt:  
Remove old Log4j thread cache invalidation (#8068)  
  
  
Build: 37.0.61  
-------------  
Wednesday September 15 19:09:18 UTC 2021  
lexmanos:  
Fix pick-block for items that map to multiple blocks. Closes #8080  
  
  
Build: 37.0.60  
-------------  
Tuesday September 14 23:54:46 UTC 2021  
gigaherz:  
Update nashorn to 15.3, which fixes crashing when run on Java 17.  
Please note that due to https://bugs.mojang.com/browse/MCL-18306, the vanilla launcher will not let you use Java 17 yet without workarounds.  
  
  
Build: 37.0.59  
-------------  
Sunday September 12 05:20:54 UTC 2021  
sizableshrimp:  
Add mixin full release to install list. (#8076)  
  
  
Build: 37.0.58  
-------------  
Wednesday September 08 20:22:44 UTC 2021  
sciwhiz12:  
Add new tool action for shield blocking, replacing `IForgeItem#isShield` (#8055)  
  
  
Build: 37.0.57  
-------------  
Wednesday September 08 18:36:16 UTC 2021  
sciwhiz12:  
Add workaround for pairs of `'` being stripped (#8050)  
  
Fixes #7396, where if a translated string with balanced pairs of single  
quote characters passes through ForgeI18n, the quotes are stripped  
because of ExtendedMessageFormat. This is most notable in languages  
where `'` is used frequently, like Canadian French from the bug report.  
  
Note that unbalanced pairs cause an IllegalArgumentException in  
ExtendedMessageFormat, which means the message is not affected.  
  
  
Build: 37.0.56  
-------------  
Wednesday September 08 18:20:26 UTC 2021  
sciwhiz12:  
Re-add missing patch for IForgeItem#getEquipmentSlot (#8041)  
  
  
Build: 37.0.55  
-------------  
Wednesday September 08 17:39:41 UTC 2021  
mysticdrew:  
Added PlayerPermissionChangedEvent(#8023)  
  
  
Build: 37.0.54  
-------------  
Wednesday September 08 17:22:41 UTC 2021  
davidqf555:  
Changed Mondayster Requirement to Mob in RangedBowAttackGoal (#7960)  
  
  
Build: 37.0.53  
-------------  
Thursday September 02 21:24:11 UTC 2021  
noeppi-noeppi:  
Add shebang to run.sh in server files (#8058)  
  
  
Build: 37.0.52  
-------------  
Thursday September 02 17:45:20 UTC 2021  
lexmanos:  
Fix incorrect parameter being sent to AbstractContainerScreen#getSlotColor.  
  
  
Build: 37.0.51  
-------------  
Wednesday September 01 14:26:47 UTC 2021  
sciwhiz12:  
Patch ModSorter to include forge mod in forgeAndMC list (#8043)  
  
  
Build: 37.0.50  
-------------  
Tuesday August 31 15:51:55 UTC 2021  
pupnewfster:  
Fix GuiUtils#drawContinuousTexturedBox making assumptions about what shader is currently active, and fix buttons and header not showing on LoadingErrorScreen (#8022)  
  
  
Build: 37.0.49  
-------------  
Tuesday August 31 14:57:25 UTC 2021  
ititus:  
Fix ScrollPanel render calls and usage (#8012)  
  
  
Build: 37.0.48  
-------------  
Tuesday August 31 09:33:44 UTC 2021  
sciwhiz12:  
Fix all layers of ItemLayerModel being fullbright (#8039)  
  
Fixes #8007  
  
  
Build: 37.0.47  
-------------  
Monday August 30 23:04:51 UTC 2021  
cyborgmas:  
Cleanup Tag Loading, this migrates thins to more of a vanilla style.(#7898)  
  
  
Build: 37.0.46  
-------------  
Monday August 30 20:42:53 UTC 2021  
cech12:  
Add Shears ToolActions (#7997)  
  
Make shear interactions extend to subclasses  
Add Shears actions for beehive harvesting, pumpkin carving and trip wire disarming  
  
  
Build: 37.0.45  
-------------  
Friday August 27 20:44:42 UTC 2021  
sizableshrimp:  
Fix broken fmlonly installer and promote it to page gen (#8029)  
  
Update gradle wrapper to 7.2  
  
  
Build: 37.0.44  
-------------  
Monday August 23 17:52:30 UTC 2021  
cyborgmas:  
Minor resource pack related fixes (#7884)  
  
  
Build: 37.0.43  
-------------  
Sunday August 22 01:30:31 UTC 2021  
lexmanos:  
Fix misaligned patch causing monsters to not spawn in nether fortresses correctly.  
  
  
Build: 37.0.42  
-------------  
Friday August 20 19:38:58 UTC 2021  
diesieben07:  
Add RegisterCapabilitiesEvent (#8021)  
  
  
Build: 37.0.41  
-------------  
Thursday August 19 21:31:20 UTC 2021  
commoble:  
Move static ITEM_TIER_ORDERING_JSON resourcelocation declaration from anonymous class into outer class to work around eclipse compiler error. (#8018)  
  
  
Build: 37.0.40  
-------------  
Thursday August 19 05:44:39 UTC 2021  
sizableshrimp:  
Fix entities not spawning in structures (#8020)  
  
This affects swamp huts, pillager outposts, ocean monuments, and nether fortresses  
  
  
Build: 37.0.39  
-------------  
Wednesday August 18 20:49:43 UTC 2021  
commoble:  
Add support for forge's "remove" list to tag datagenerators (#7911)  
  
  
Build: 37.0.38  
-------------  
Wednesday August 18 20:05:33 UTC 2021  
sirttas:  
Add hook to allow items to customize the attack sweep range. (#7981)  
  
  
Build: 37.0.37  
-------------  
Wednesday August 18 19:46:48 UTC 2021  
git:  
Track the active mod within DeferredWorkQueue (#7973)  
  
  
Build: 37.0.36  
-------------  
Wednesday August 18 09:16:16 UTC 2021  
28724985+strikerrocker:  
Allow to check spawner block entity in events (#7941)  
  
  
Build: 37.0.35  
-------------  
Wednesday August 18 05:02:56 UTC 2021  
cyborgmas:  
Remove neutral mob patches as the bug was fixed upstream. (#8001)  
  
  
Build: 37.0.34  
-------------  
Sunday August 15 14:18:49 UTC 2021  
malte0811:  
Ensure that all render targets in a PostChain use the same format (#7978)  
  
closes #6995  
  
  
Build: 37.0.33  
-------------  
Thursday August 12 08:44:46 UTC 2021  
sizableshrimp:  
Fix update checker to use runtime minecraft version (#8000)  
  
  
Build: 37.0.32  
-------------  
Wednesday August 11 01:53:28 UTC 2021  
67878524+vemerion:  
Correct incorrect arguments for render hand event (#7987)  
  
  
Build: 37.0.31  
-------------  
Tuesday August 10 22:45:23 UTC 2021  
gigaherz:  
Redesign the tool system to rely on the new vanilla tags. (#7970)  
  
Changed:  
- ToolType is replaced with ToolAction, which can selectively represent which actions are supported by an item.  
- Added a canPerformAction method to query ToolActions.  
- Renamed canHarvestBlock to isCorrectToolForDrops to match vanilla.  
- Added TierSortingRegistry, which can be used to add custom tiers and supports sorting between vanilla or with other mods.  
  
How to use:  
  
For the breaking system there's 2 methods:  
- getDestroySpeed decides if an item *can* mine the block fast. Override if you have multiple tags or your item isn't a DiggerItem.  
- isCorrectToolForDrops decides if an item will get drops. Returning false will also slow down mining, regardless of getDestroySpeed. Override if you have type-dependant tiers or your item isn't a DiggerItem.  
  
For the tier system mods can just call `TierSortingRegistry.registerTier(tier, "name", List.of(lesser tiers), List.of(better tiers));` to register their tiers.  
There's helper methods to query tiers such as TierSortingRegsitry.isCorrectTierForDrops.  
  
The ToolActions solve 2 problems:  
1. distinguishing which kind of digger an item can be  
2. querying if the item can perform specific secondary actions.  
Any item can override `canPerformAction` to customize which actions it performs.  
  
  
Build: 37.0.30  
-------------  
Tuesday August 10 20:11:07 UTC 2021  
lexmanos:  
Fixed reference to registryAccess in dimension fix, and marked for removal in next MC version. Closes #7961  
  
  
Build: 37.0.29  
-------------  
Tuesday August 10 07:11:36 UTC 2021  
lexmanos:  
Bump BootStrapLauncher, and make sure Capability providers call parent revive.  
  
  
Build: 37.0.28  
-------------  
Monday August 09 19:09:40 UTC 2021  
sirttas:  
Fix custom ingredients not being read correctly over the network. (#7980)  
  
  
Build: 37.0.27  
-------------  
Friday August 06 17:18:27 UTC 2021  
djbake101:  
Add a OnDatapackSyncEvent, useful as a notification for modders to send extra data to the client (#7912)  
  
  
Build: 37.0.26  
-------------  
Friday August 06 16:42:42 UTC 2021  
choonster:  
Add access transformer to make Features.Decorators class public (#7974)  
  
  
Build: 37.0.25  
-------------  
Wednesday August 04 08:44:11 UTC 2021  
lexmanos:  
Fix NullPointerException in DetercorRailBlock patch.  
  
  
Build: 37.0.24  
-------------  
Wednesday August 04 08:08:36 UTC 2021  
lexmanos:  
Add forceSystemNanoTime config option to the client.  
Normally glfwGetTime is used, but in some cases it may have performance issues.  
  
lexmanos:  
Remove entity.remove(keepData) functions because Mojang changed entity removal mechanics.  
If a modder wishes to use the capabilities from a invalid entity. They must manually call reviveCaps/invalidateCaps themselves.  
  
  
Build: 37.0.22  
-------------  
Monday August 02 22:47:24 UTC 2021  
hycrafthd:  
Rename potion registry fields to match the mojang names (#7939)  
  
  
Build: 37.0.21  
-------------  
Monday August 02 21:58:21 UTC 2021  
bl4ckscor33:  
Fix patch issue that removed SimpleWaterloggedBlock from BaseRailBlock (#7937)  
  
  
Build: 37.0.20  
-------------  
Monday August 02 21:34:56 UTC 2021  
strikerrocker:  
Fix EntityInteractSpecific Event not being fired in server (#7936)  
  
  
Build: 37.0.19  
-------------  
Sunday August 01 23:00:34 UTC 2021  
championash5357:  
Add BlockEntityRenderer registering to RegisterRenderers (#7975)  
  
  
Build: 37.0.18  
-------------  
Sunday August 01 05:02:57 UTC 2021  
daemonumbra:  
Fix installer issue with spaces in paths. (#7972)  
  
  
Build: 37.0.17  
-------------  
Saturday July 31 00:54:01 UTC 2021  
35673674+alcatrazescapee:  
Remove unused config entries. (#7954)  
  
  
Build: 37.0.16  
-------------  
Saturday July 31 00:43:09 UTC 2021  
35673674+alcatrazescapee:  
Re-add call to Ingredient#invalidateAll() (#7953)  
  
  
Build: 37.0.15  
-------------  
Friday July 30 02:10:51 UTC 2021  
gigaherz:  
Introduce RegisterShadersEvent to register shaders with the proper timing (runs every client resource reload).  
Fix ShaderInstance to allow resourcelocations with namespaces as input.  
Fix shader parsing to respect resource domains.  
Fix ForgeRenderTypes to use the right shader in each situation.  
Add custom forge shader for unlit translucent entity rendering, equivalent to the vanilla entity translucent shader.  
  
daemonumbra:  
Remove Generic from ProjectileImpactEvent (#7959)  
  
Generification of this event was half-done and has been aborted, leaving the generic parameter in place just creates confusion and crashes  
  
  
Build: 37.0.13  
-------------  
Wednesday July 28 05:43:57 UTC 2021  
sizableshrimp:  
Fix userdev mod deps on the classpath (#7919)  
  
  
Build: 37.0.12  
-------------  
Monday July 26 22:22:53 UTC 2021  
ititus:  
Fix typo in FluidBlockWrapper (#7931)  
  
  
Build: 37.0.11  
-------------  
Monday July 26 21:24:39 UTC 2021  
lexmanos:  
Fix rounding related errors with small entity pathfinding. Closes #7730  
  
  
Build: 37.0.10  
-------------  
Monday July 26 08:55:12 UTC 2021  
eerussianguy:  
Add modder-friendly way to edit the boat model / texture in custom boats (#7897)  
  
  
Build: 37.0.9  
-------------  
Sunday July 25 20:48:45 UTC 2021  
commoble:  
Fix EntityRendererEventsTest crashing dedicated server when running forge_test_server in forgedev (#7930)  
  
  
Build: 37.0.8  
-------------  
Sunday July 25 10:08:29 UTC 2021  
gigaherz:  
Added RegisterClientReloadListenersEvent which lets you register reload listeners with appropriate timing.  
Added new entity rendering events.  
- EntityRenderersEvent.RegisterLayerDefinitions: Used to register layer definitions for entity models.  
- EntityRenderersEvent.RegisterRenderers: Used to register entity renderers.  
- EntityRenderersEvent.AddLayers: Called during resource reload after all renderers have been constructed and it's safe to add layers.  
Removed RenderingRegistry, which is now not necessary.  
Removed a few unused things.  
Fixes #7920  
  
  
Build: 37.0.7  
-------------  
Saturday July 24 18:19:07 UTC 2021  
cyborgmas:  
remove old direct GL call (#7907)  
  
supermartijn642:  
Pass the 'includeName' flag to the ItemTossEvent (#7894)  
  
  
Build: 37.0.5  
-------------  
Saturday July 24 14:42:12 UTC 2021  
supermartijn642:  
Expose RenderStateShard inner classes (#7895)  
  
In 1.17, all of the inner classes of `RenderStateShard` (`RenderStateShard.OverlayStateShard`, `RenderStateShard.WriteMaskStateShard`, etc.) have been changed to protected. These classes are needed however to create new `RenderType.CompositeRenderType`'s using `RenderType.CompositeState.CompositeStateBuilder`.  
Since these are protected inner classes, their constructors also can't be directly be obtained using `ObfuscationReflectionHelper`.  
  
Currently, any mod using custom `RenderType`'s will have to either:  
- add their own access transformer for the inner classes, or  
- extend `RenderStateShard` to access `RenderStateShard`'s inner classes, and extend `RenderType` to access `RenderType.CompositeRenderType`  
  
This PR changes the visibility of `RenderStateShard`'s inner classes to public in Forge's `accesstransformer.cfg`.  
  
cyborgmas:  
1.17 Fix InitGuiEvent (#7906)  
  
  
Build: 37.0.3  
-------------  
Saturday July 24 14:30:37 UTC 2021  
cyborgmas:  
added back attribute patches (#7886)  
  
  
Build: 37.0.2  
-------------  
Saturday July 24 00:26:10 UTC 2021  
lexmanos:  
Bump SecureJarHandler, and fix life cycle event's deferred work being on the incorrect thread/boot classloader.  
  
  
Build: 37.0.1  
-------------  
Thursday July 22 21:52:37 UTC 2021  
lexmanos:  
Bump SecureJarHandler to fix package meta issue. Closes #7881  
Fix version.json having duplicate libraries.  
  
* * *
MC 1.16.5  
=========  
* * *

Build: 36.1.0  
-------------  
  
Monday March 15 22:11:58 UTC 2021  
lexmanos:  
Fix AT order, missed exec line and bump for RB.  
  
Build: 36.0.63  
--------------  
  
Monday March 15 21:08:56 UTC 2021  
diesieben07:  
Fix wrong eye height when entity size changes (esp. baby animals) (#7628)  
  
Build: 36.0.62  
--------------  
  
Monday March 15 21:02:36 UTC 2021  
diesieben07:  
Allow ITeleporter to override the vanilla teleport sound (#7682)  
  
Build: 36.0.61  
--------------  
  
Monday March 15 20:20:21 UTC 2021  
29855886+SizableShrimp:  
Fix datapack exception related to EnumArgument with siblings (#7686)  
  
Invalid enum constants are now properly thrown as a CommandSyntaxException  
  
Build: 36.0.60  
--------------  
  
Monday March 15 19:29:01 UTC 2021  
42383791+kaydogz:  
Add support for custom WoodTypes (#7623)  
  
Build: 36.0.59  
--------------  
  
Monday March 15 19:19:16 UTC 2021  
lexmanos:  
Use JGit instead of GrGit now that jcenter is going away.  
Update missed mapped name in MDK.  
  
Build: 36.0.58  
--------------  
  
Saturday March 13 19:07:24 UTC 2021  
diesieben07:  
Fix incorrectly replaced SRG names  
  
gigaherz:  
Fix yet another copypasta.  
  
gigaherz:  
Bump nashorn wrapper version.  
  
Build: 36.0.55  
--------------  
  
Friday March 12 18:51:48 UTC 2021  
AterAnimAvis:  
Fix potential Deadlock when using custom Item entities. (#7532)  
  
Be careful when adding Entities during Chunk Load (#7519)  
  
Build: 36.0.54  
--------------  
  
Friday March 12 02:04:32 UTC 2021  
gigaherz:  
Fix copypasta.  
  
Build: 36.0.53  
--------------  
  
Friday March 12 00:11:22 UTC 2021  
curle:  
Automatically fix some issues with configurations deemed invalid for simple reasons (#7671)  
  
Build: 36.0.52  
--------------  
  
Thursday March 11 20:59:54 UTC 2021  
gigaherz:  
Introduce a new feature that lets mods know if optional mods and optional network channels are present in the remote.  
Allow connections from forge versions that don't have the vanilla splitter.  
  
gigaherz:  
Bulk update license year, and use replacement variable so that the current year is always used.  
  
gigaherz:  
Bump SpecialSource  
  
gigaherz:  
Add coremod that injects bouncer methods to work around name conflicts with official names.  
Fixes a binary break.  
  
Build: 36.0.48  
--------------  
  
Tuesday March 09 22:22:20 UTC 2021  
lexmanos:  
Update to FG4, and Gradle 6.8.  
  
lexmanos:  
Regenerate patches with relative headers. This should lower conflicts in future PRs.  
Convert Forge to use Official mappings.  
Mojang released their obfuscation mappings but we have not used them up until now due to wanting to get their license to be more explicitly permissive.  
It is clear that their intent is to allow us to use their names for developing mods like this.  
See the full wording, and our interpretation here: \[Mojang.md\](https://github.com/MinecraftForge/MCPConfig/blob/master/Mojang.md)  
  
Build: 36.0.46  
--------------  
  
Thursday March 04 20:15:10 UTC 2021  
diesieben07:  
Support splitting vanilla packets that are too large on forge &#x2194; forge connections (#7485)  
  
Currently only for SUpdateRecipesPacket and STagsListPacket that blow up with huge datapacks  
  
Build: 36.0.45  
--------------  
  
Wednesday March 03 20:50:47 UTC 2021  
sara:  
Fix a few places where the vanilla method was being called instead of the forge one (#7535)  
  
Cleanup javadocs references slightly, fix a couple spots not using the proper forge hooks, and remove a couple unneeded patches  
Update deprecation comment on isAir  
  
Build: 36.0.44  
--------------  
  
Wednesday March 03 05:29:04 UTC 2021  
usfirepilot123:  
Add Opacity to ForgeHooksClient#renderMainMenu (#7660)  
  
Build: 36.0.43  
--------------  
  
Thursday February 25 02:37:09 UTC 2021  
marc.hermans:  
Add support for caching of configuration values. (#7608)  
  
Build: 36.0.42  
--------------  
  
Tuesday February 16 02:43:01 UTC 2021  
kovac1066:  
Added entity attribute setup and creation events  
  
Build: 36.0.41  
--------------  
  
Tuesday February 16 01:28:51 UTC 2021  
knightminer4:  
Fix updateItemStackNBT not properly being called (#7646)  
  
Re-added ItemStack delegate redirect transformer  
  
Build: 36.0.40  
--------------  
  
Tuesday February 16 01:08:21 UTC 2021  
sara:  
Fix a few FluidUtil issues that were causing DispenseFluidContainer to not function properly (#7422)  
  
Build: 36.0.39  
--------------  
  
Tuesday February 16 00:49:27 UTC 2021  
daemonumbra:  
Fixed Configs not correcting when hot-loaded from changes on disk (#7427)  
  
ichttt:  
Add a way to specify a custom background texture with namespaces in the Creative GUI. (#7404)  
  
Build: 36.0.37  
--------------  
  
Tuesday February 16 00:39:15 UTC 2021  
xzk0701:  
Reduce default logging markers in the MDK. Modders can re-enable these for better debugging.  
(#7432)  
  
Modders PLEASE read your damn log, and fix the errors we point out. Spamming modpacks with stack traces is just lazy programming.  
  
Build: 36.0.36  
--------------  
  
Tuesday February 16 00:19:30 UTC 2021  
sciwhiz12:  
Deprecate Forge's setdimension command, vanilla execute command can do this now. (#7459)  
  
Build: 36.0.35  
--------------  
  
Monday February 15 23:38:35 UTC 2021  
spb.max2:  
Fix ItemTextureQuadConverter.convertTexture generating wrong quads, fixes #7620 (#7650)  
  
Build: 36.0.34  
--------------  
  
Monday February 15 23:22:40 UTC 2021  
florian:  
Added MultipartBakedModel.getModelData(). (#7595)  
  
This allows custom IBakedModel implementations to use the IModelData provided by their IBakedModel.getModelData() when used in the context of a multipart model.  
  
Build: 36.0.33  
--------------  
  
Monday February 15 23:15:50 UTC 2021  
cyborgmas18:  
fix global cache not being a block render type (#7648)  
  
Build: 36.0.32  
--------------  
  
Monday February 15 22:52:15 UTC 2021  
35673674+alcatrazescapee:  
Allow mods to use additional custom LootParameter when querying existing loot tables (#7515)  
  
Build: 36.0.31  
--------------  
  
Monday February 15 21:40:16 UTC 2021  
github:  
Add ForgeHooks.canEntitySpawn to Cat, Phantom, and Patrol spawners. (#7569)  
  
Build: 36.0.30  
--------------  
  
Monday February 15 21:26:11 UTC 2021  
dev:  
Fix/Replace player visibility event (#7573)  
  
Build: 36.0.29  
--------------  
  
Monday February 15 21:16:26 UTC 2021  
AterAnimAvis:  
Fix: Clear the last error from glfwInit to prevent vanilla from throwing an exception later in the chain when glfw errors. (#7587)  
  
Build: 36.0.28  
--------------  
  
Monday February 15 20:56:51 UTC 2021  
55965249+seymourimadeit:  
Fix \[MC-181464\](https://bugs.mojang.com/projects/MC/issues/MC-181464) persisting for modded shields (#7602)  
  
Build: 36.0.27  
--------------  
  
Monday February 15 20:11:46 UTC 2021  
malte0811:  
FIx race condition in LazyOptional (#7611)  
  
Build: 36.0.26  
--------------  
  
Monday February 15 03:16:02 UTC 2021  
xfacthd:  
\[1.16.5\] Fix shaders breaking almost every overlay that uses textures, fixes #7575 (#7624)  
  
Build: 36.0.25  
--------------  
  
Monday February 15 03:10:24 UTC 2021  
40846040+TelepathicGrunt:  
Disable syncing of Feature and Biome registries  
(#7639)  
  
Build: 36.0.24  
--------------  
  
Monday February 15 03:04:46 UTC 2021  
drullkus:  
Add IExtensibleEnum to GrassColorModifier (#7641)  
  
Build: 36.0.23  
--------------  
  
Monday February 15 02:36:26 UTC 2021  
github:  
Log stacktraces in NettyPacketEncoder. (#7654)  
  
Build: 36.0.22  
--------------  
  
Wednesday February 10 19:05:16 UTC 2021  
xfacthd:  
Lower logging level for datafixer warning to debug (#7636)  
  
Build: 36.0.21  
--------------  
  
Tuesday February 09 22:19:29 UTC 2021  
sara:  
Reintroduce forge's chunk manager to allow mods to force chunks with either a block position or entity (UUID) "owner" and have them properly persist between restarts (#7642)  
  
Build: 36.0.20  
--------------  
  
Tuesday February 09 21:28:24 UTC 2021  
sara:  
Fix two places where querying an object for the new "valid" capability from a capability invalidation listener could cause the object to return the old invalid capability. (#7643)  
  
Build: 36.0.19  
--------------  
  
Tuesday February 09 21:21:44 UTC 2021  
cyborgmas18:  
Fix config spec in cases of enum class discrepancies (#7635)  
  
Build: 36.0.18  
--------------  
  
Tuesday February 09 21:06:36 UTC 2021  
diesieben07:  
Fix onBlockAdded being called twice for ItemEntity placing non-TE blocks (#7607)  
  
Build: 36.0.17  
--------------  
  
Tuesday February 09 21:00:57 UTC 2021  
due:  
Prevent NullPointerException when adding new loot pool. (#7605)  
  
Build: 36.0.16  
--------------  
  
Tuesday February 09 20:53:48 UTC 2021  
brandon4261:  
Added generic multi part entity API (#7554)  
  
Build: 36.0.15  
--------------  
  
Sunday February 07 03:41:41 UTC 2021  
cyborgmas18:  
Fix IAngerable entities crashing when reading nbt on client (#7618)  
  
Build: 36.0.14  
--------------  
  
Tuesday February 02 20:28:08 UTC 2021  
thesilkminer:  
\[1.16.x\] Add loot table ID in Global Loot Modifiers (#7428)  
  
thesilkminer:  
\[1.16.x\] Add loot table ID in Global Loot Modifiers (#7428)  
  
Build: 36.0.13  
--------------  
  
Saturday January 30 02:07:17 UTC 2021  
richard:  
Add a block tag to allow mods to blacklist blocks endermen should not be able to place blocks on top of, similar to how vanilla hardcodes against them being able to place things on bedrock (#7548)  
  
Build: 36.0.12  
--------------  
  
Saturday January 30 02:01:35 UTC 2021  
7419378+hellfirepvp:  
Fix translucent model parts of MultiLayerModels rendering as missing models due to differing rendertypes when rendering block model (#7579)  
  
Signed-off-by: HellFirePvP <7419378+HellFirePvP@users.noreply.github.com>  
  
Build: 36.0.11  
--------------  
  
Saturday January 30 01:35:10 UTC 2021  
richard:  
Fix existing file tag provider support looking in the wrong folder for custom tag types (#7576)  
  
Build: 36.0.10  
--------------  
  
Thursday January 28 21:07:30 UTC 2021  
cyborgmas18:  
Propery re-encode registries (#7629)  
  
Build: 36.0.9  
-------------  
  
Thursday January 28 01:23:13 UTC 2021  
cyborgmas18:  
Properly encode registries. (#7626)  
  
Build: 36.0.8  
-------------  
  
Thursday January 28 00:00:43 UTC 2021  
cyborgmas18:  
Inject vanilla dimensions inside worlds missing them (#7599)  
  
Build: 36.0.7  
-------------  
  
Wednesday January 27 00:32:53 UTC 2021  
lexmanos:  
Update Coremods, ASM, and include standalone Nashorn to load on J15.  
  
lexmanos:  
Introduce a new field\_to\_instanceof transformer to reduce some simple patches.  
  
Build: 36.0.4  
-------------  
  
Tuesday January 26 02:53:10 UTC 2021  
lexmanos:  
Fix broken build.  
  
dev:  
Add modded biomes to overworld biome list (#7360)  
  
Build: 36.0.2  
-------------  
  
Tuesday January 26 02:25:10 UTC 2021  
lexmanos:  
Fix dynamic registries not getting ids assigned correctly from old worlds in specific unordered value insertions. Closes #7586  
  
Build: 36.0.1  
-------------  
  
Sunday January 17 21:05:36 UTC 2021  
knightminer4:  
Optionally add a milk fluid to the vanilla bucket (#7294)  
  
Fixes the previous broken code that was supposed to make mod registered milk returned by the vanilla bucket by allowing mods to enable a milk fluid.  
  
Build: 36.0.0  
-------------  
  
Friday January 15 19:42:24 UTC 2021  
lexmanos:  
1.16.5 Initial Update.  
  
* * *
MC 1.16.4  
=========  
* * *

Build: 35.1.37  
--------------  
  
Thursday January 14 23:58:35 UTC 2021  
lexmanos:  
Update Coremods, ASM, and include standalone Nashorn to load on J15.  
  
Build: 35.1.36  
--------------  
  
Thursday January 07 20:24:49 UTC 2021  
ian.rehwinkel:  
Added IWeatherParticleRenderHandler to allow a mod to take control over weather particles and sounds. (#7522)  
  
Build: 35.1.35  
--------------  
  
Thursday January 07 20:16:03 UTC 2021  
covers1624:  
Allow Chunk loading Tickets to opt-into forcing chunk ticks. (#7525)  
  
Build: 35.1.34  
--------------  
  
Thursday January 07 20:10:18 UTC 2021  
malte0811:  
Fix crash when mods add goals to skeleton horses (\[MC-206338\](https://bugs.mojang.com/projects/MC/issues/MC-206338)) (#7509)  
  
Build: 35.1.33  
--------------  
  
Thursday January 07 20:03:59 UTC 2021  
diesieben07:  
Set WM\_CLASS and WM\_INSTANCE\_NAME for early progress window (#7534)  
  
Build: 35.1.32  
--------------  
  
Wednesday January 06 03:17:35 UTC 2021  
35673674+alcatrazescapee:  
Make UnboundedMapCodec more lenient in decoding dimensions. Fixes \[MC-197860\](https://bugs.mojang.com/projects/MC/issues/MC-197860) (#7527)  
  
Build: 35.1.31  
--------------  
  
Tuesday January 05 19:59:52 UTC 2021  
lexmanos:  
Prevent NPE and deprecated MissingMappings.getMappings function. Closes #6252  
  
lexmanos:  
Fix FML's Config Sync packet not allowing same length filenames in encoder and decoder. Closes #7584  
  
Build: 35.1.29  
--------------  
  
Sunday January 03 11:02:59 UTC 2021  
lexmanos:  
Fix entities not correctly being able to be ridden under water.  
  
Build: 35.1.28  
--------------  
  
Monday December 28 21:56:51 UTC 2020  
git:  
Fix crash when beehive is broken by fake player (#7566)  
  
Build: 35.1.27  
--------------  
  
Monday December 28 21:46:04 UTC 2020  
35673674+alcatrazescapee:  
Add supplier variant to \\\`AbstractBlock.Properties#lootFrom\\\` (#7563)  
  
Build: 35.1.26  
--------------  
  
Monday December 28 21:40:18 UTC 2020  
diesieben07:  
Fix missing serializers when deserializing global loot modifiers (#7561)  
  
diesieben07:  
Fix ModFileResourcePack.getAllResourceLocations ignoring resourceNamespace. (#7562)  
  
Fixes #7405  
  
Build: 35.1.24  
--------------  
  
Monday December 28 21:34:39 UTC 2020  
diesieben07:  
Fix VanillaConnectionNetworkFilter sending out invalid entity properties packets without an entity ID (#7560)  
  
Build: 35.1.23  
--------------  
  
Monday December 28 21:17:01 UTC 2020  
richard:  
Make shear interactions extend to subclasses (#7544)  
  
Build: 35.1.22  
--------------  
  
Monday December 28 21:09:38 UTC 2020  
sciwhiz12:  
Add a SoundType subclass that uses suppliers (#7538)  
  
Build: 35.1.21  
--------------  
  
Monday December 28 21:03:56 UTC 2020  
sciwhiz12:  
Fix compound ingredient in shapeless recipes (#7537) Fixes #7530  
  
Build: 35.1.20  
--------------  
  
Monday December 28 20:19:04 UTC 2020  
matthrewp:  
Fix modded PointOfInterestType's not populating blockstate map when registered (#7503)  
  
35673674+alcatrazescapee:  
Fix potential NPE in ForgeHooks.onItemPlaceIntoWorld when passing in null player. (#7505)  
  
Build: 35.1.18  
--------------  
  
Monday December 28 20:13:15 UTC 2020  
48399898+poopoodice:  
Add new LivingConversionEvent to control mobs turning into other mobs. (#7386)  
  
Build: 35.1.17  
--------------  
  
Monday December 28 20:01:42 UTC 2020  
knightminer4:  
Add ItemAttributeModifierEvent (#7484)  
  
Build: 35.1.16  
--------------  
  
Monday December 28 19:54:38 UTC 2020  
bward7864:  
Fix RightClickBlock ALLOW not being implemented (#7426)  
  
Build: 35.1.15  
--------------  
  
Saturday December 26 19:39:35 UTC 2020  
lexmanos:  
Make mod data packs able to be disabled. It'll break things, but that's on you. Closes #6776  
  
lexmanos:  
Quiet down errors related to modders not changing their update urls from the default.  
  
Build: 35.1.13  
--------------  
  
Saturday December 12 17:34:07 UTC 2020  
tterrag:  
Add generated resource tracking to ExistingFileHelper  
  
Build: 35.1.12  
--------------  
  
Friday December 11 02:39:41 UTC 2020  
tterrag:  
Fix BlockStateProvider item models not knowing about block models  
  
Add tests for this case  
  
Build: 35.1.11  
--------------  
  
Tuesday December 08 19:54:40 UTC 2020  
richard:  
Override invalidateCaps instead of remove for vanilla TE capability invalidation (#7536)  
  
Properly invalidate patched in vanilla TE caps in invalidateCaps instead of remove so that they get invalidated on chunk unload  
  
Build: 35.1.10  
--------------  
  
Saturday December 05 20:07:14 UTC 2020  
richard:  
Make TEs invalidate capabilities when the chunk they are in unloads (#7529)  
  
Fixed LazyOptional potentially notifying invalidation listeners multiple times.  
  
Build: 35.1.9  
-------------  
  
Saturday December 05 20:01:00 UTC 2020  
cordonfreeman:  
Fixed entity navigation to stop entities spinning  
\[MC-94054\](https://bugs.mojang.com/projects/MC/issues/MC-94054) (#7520)  
  
Build: 35.1.8  
-------------  
  
Saturday December 05 19:52:56 UTC 2020  
20846147+unbekannt1998:  
Fix wrong function call in BlockStateProvider::horizontalFaceBlock (#7514)  
  
Build: 35.1.7  
-------------  
  
Sunday November 29 02:11:08 UTC 2020  
tterrag:  
Fix datagen order of multipart conditions being unstable  
  
Build: 35.1.6  
-------------  
  
Saturday November 28 02:56:55 UTC 2020  
35673674+alcatrazescapee:  
Fix forge config option for default world type not applying unless you change the default world type (#7521)  
  
Build: 35.1.5  
-------------  
  
Friday November 27 23:57:23 UTC 2020  
gigaherz:  
Implement feature for mods to define new world types (#7448)  
  
\* Mods can now register world types via a new forge registry, and optionally register a settings screen to tweak them.  
  
\* The default world type for dedicated servers and singleplayer world creation is configurable via forge's common config.  
  
Build: 35.1.4  
-------------  
  
Tuesday November 24 17:14:21 UTC 2020  
csh2001331:  
Fix dimType not encode to registries (#7513)  
  
Build: 35.1.3  
-------------  
  
Monday November 23 03:45:21 UTC 2020  
richard:  
Add support for referencing forge's resources and specifying existing mods to data generators (#7456)  
  
Build: 35.1.2  
-------------  
  
Sunday November 22 22:01:29 UTC 2020  
cpw:  
Fix #6692  
  
Thanks @AterAnimAvis for help and suggestions  
  
Signed-off-by: cpw  
  
Build: 35.1.1  
-------------  
  
Saturday November 21 19:57:45 UTC 2020  
cyborgmas18:  
Fix translucent blocks not rendering properly when moved by pistons on fabulous (#7441)  
  
Build: 35.1.0  
-------------  
  
Friday November 20 20:54:30 UTC 2020  
lexmanos:  
Bump version for RB.  
  
Build: 35.0.22  
--------------  
  
Friday November 20 18:24:46 UTC 2020  
35673674+alcatrazescapee:  
Fix \[MC-194811\](https://bugs.mojang.com/projects/MC/issues/MC-194811)  
Removing structures causes chunk save errors.  
  
diesieben07:  
Fix food bar not rendering when non-living entities are mounted (#7446)  
  
Build: 35.0.20  
--------------  
  
Friday November 20 18:18:37 UTC 2020  
diesieben07:  
Fix concurrency issue in StartupMessageManager (#7483)  
  
Build: 35.0.19  
--------------  
  
Friday November 20 18:11:25 UTC 2020  
35673674+alcatrazescapee:  
Fix forge registry types that have private constructors (BlockStateProviderType, BlockPlacerType, FoliagePlacerType, TreeDecoratorType) (#7482)  
  
Build: 35.0.18  
--------------  
  
Sunday November 15 16:08:55 UTC 2020  
cpw:  
Fix problem where the absence of forge and MC in later loading triggered a weird crash.  
  
Signed-off-by: cpw  
  
Build: 35.0.17  
--------------  
  
Saturday November 14 01:41:38 UTC 2020  
cpw:  
Fix NPE problem when modid is mismatched.  
  
Signed-off-by: cpw  
  
Build: 35.0.16  
--------------  
  
Saturday November 14 00:18:29 UTC 2020  
cpw:  
Return the processed modlist data to the upstream system, not the raw unprocessed data. Should resolve the problem  
that mixin complains about missing info when it's in a "crashed" situation.  
  
Signed-off-by: cpw  
  
Build: 35.0.15  
--------------  
  
Wednesday November 11 09:09:45 UTC 2020  
cyborgmas18:  
Fix dims on servers not loading the first run (#7445)  
  
Build: 35.0.14  
--------------  
  
Tuesday November 10 20:24:33 UTC 2020  
diesieben07:  
Allow for custom argument types by filtering them on vanilla connections (#7463)  
  
Build: 35.0.13  
--------------  
  
Tuesday November 10 20:13:34 UTC 2020  
bward7864:  
Add Player context to AnvilUpdateEvent (#7442)  
  
Build: 35.0.12  
--------------  
  
Tuesday November 10 20:02:33 UTC 2020  
git:  
Don't overwrite PlayerAdvancement's player with a fake one (#7454)  
  
If a FakePlayer is constructed with the same UUID/GameProfile as a  
currently active player, the player object within PlayerAdvancement is  
set to the fake player.  
  
As fake players cannot receive advancements (see grantCriterion), this  
prevents the actual player from receiving any advancements until they  
change dimension/relog.  
  
Build: 35.0.11  
--------------  
  
Tuesday November 10 19:46:01 UTC 2020  
curle:  
Add BannerBlock.forColor to SAS to fix banner.toItem() on servers.  
  
Build: 35.0.10  
--------------  
  
Tuesday November 10 19:36:40 UTC 2020  
boy132:  
Call Harvest check event even if the block doesn't require any tool (#7414)  
  
Build: 35.0.9  
-------------  
  
Tuesday November 10 19:25:26 UTC 2020  
lexmanos:  
Use linked collections to stabilize order when adding new registry entries.  
  
xfacthd:  
Render local player when the renderViewEntity is not the local player (#7216)  
  
Build: 35.0.7  
-------------  
  
Sunday November 08 04:12:02 UTC 2020  
cpw:  
Some help in ExtensionPoint regarding DISPLAYTEST. Let's improve those tick rates!  
  
Signed-off-by: cpw  
  
Build: 35.0.6  
-------------  
  
Sunday November 08 03:30:37 UTC 2020  
cpw:  
Handle erroring during early mod construction phases, and actually report that into the error UI  
by doing armslength exception handling and propagation.  
  
Signed-off-by: cpw  
  
Build: 35.0.5  
-------------  
  
Sunday November 08 01:48:22 UTC 2020  
cpw:  
Support backwards loading 1.16.3 mods in 1.16.4, because we are able to do that. Tweak loading a bit to be smarter about dependency errors of various kinds.  
  
Signed-off-by: cpw  
  
Build: 35.0.4  
-------------  
  
Saturday November 07 20:10:44 UTC 2020  
gigaherz:  
Add FluidStack codec, and a test mod that verifies its behaviour matches the existing write/read logic.  
Add missing license headers.  
  
Build: 35.0.3  
-------------  
  
Saturday November 07 02:11:47 UTC 2020  
cpw:  
Update event bus version (should be 3.0.5)  
  
Tweak MDK to automatically populate recommended values for things like forge version, loader version and minecraft version.  
  
Signed-off-by: cpw  
  
Build: 35.0.2  
-------------  
  
Wednesday November 04 00:07:58 UTC 2020  
diesieben07:  
Workaround for modded attributes on vanilla entities logging warnings on vanilla clients  
  
Switch to a handler-based approach per packet class, simplify patch, add some docs  
  
Add license header and docs  
  
Switch to a network handler based approach  
  
Switch to a network handler based approach  
  
revert build gradle change  
  
Simplify Packet patch  
  
Add license header to IForgePacket  
  
Revert ForgeHooks changes  
  
Less hacky and more generic way to filter packets for vanilla connections  
  
\_Actually\_ Order SAS.  
It's early  
  
Order SAS  
  
simplify vanilla connection check  
  
Remove unneeded import change  
  
Build: 35.0.1  
-------------  
  
Monday November 02 19:57:45 UTC 2020  
cpw:  
Fix early sorting bug that meant the file deduping was causing an error, to, well, not cause it, so we can get to an error screen.  
  
Signed-off-by: cpw  
  
Build: 35.0.0  
-------------  
  
Monday November 02 19:15:50 UTC 2020  
lexmanos:  
1.16.4 Initial Update  

* * *
MC 1.16.3  
=========  
* * *

Build: 34.1.42  
--------------  
  
Monday November 02 04:30:53 UTC 2020  
lexmanos:  
Fix Biomes not properly copying over ids loaded from the save to the new Dynamic Registry.  
  
Build: 34.1.41  
--------------  
  
Monday November 02 01:09:57 UTC 2020  
gigaherz:  
Introduce custom loader additions to the model data generators. (#7450)  
  
Currently implemented loaders:  
\* OBJ  
\* Composite  
\* Multi-layer  
\* Item layers (vanilla item/generated but with fullbright texture support)  
\* Bucket  
\* Septemberarate Perspective  
  
Build: 34.1.40  
--------------  
  
Monday November 02 00:52:12 UTC 2020  
cpw:  
actually rollback on error in registry events.  
  
Signed-off-by: cpw  
  
Build: 34.1.39  
--------------  
  
Sunday November 01 22:09:32 UTC 2020  
cpw:  
Update modlauncher. fixes #7452  
  
Signed-off-by: cpw  
  
cpw:  
Return client resources even if no data pack found on server. Closes #6225 (Pull request)  
  
Signed-off-by: cpw  
  
tobias.hotz:  
Auto-detect ansi support for log4j2  
  
move to fml.loading subpackage  
  
Add license header  
  
cpw:  
Fix config parse failure causing crash in building exception message. fixes #7438  
  
Signed-off-by: cpw  
  
Build: 34.1.35  
--------------  
  
Thursday October 29 17:09:31 UTC 2020  
malte0811:  
Fix (NonNull)Lazy.Concurrent using a global lock (#7403)  
  
\* Fix Lazy.Concurrent using a global lock, thus preventing multiple threads from resolving independent Lazy's at the same time  
\* Use Lazy with an added null check to implement NonNullLazy  
  
Build: 34.1.34  
--------------  
  
Thursday October 29 00:12:09 UTC 2020  
gigaherz:  
Update forge mappings to 20201028-1.16.3 (#7435)  
  
Build: 34.1.33  
--------------  
  
Tuesday October 27 16:01:02 UTC 2020  
35673674+alcatrazescapee:  
Fix breaking changes from the Biome rename PR #7434 (#7439)  
  
Build: 34.1.32  
--------------  
  
Monday October 26 23:52:47 UTC 2020  
sciwhiz12:  
Reimplement nametag distance attribute, fix attribute translation keys (#7387)  
  
Build: 34.1.31  
--------------  
  
Monday October 26 22:07:02 UTC 2020  
35673674+alcatrazescapee:  
Fix data pack biomes failing to load in SingleBiomeProvider (#7434)  
  
Build: 34.1.30  
--------------  
  
Monday October 26 22:00:28 UTC 2020  
cpw:  
Add in proper handling of equals and hashcode for modjar urls. Fixes very slow loading on windows.  
  
Signed-off-by: cpw  
  
Build: 34.1.29  
--------------  
  
Monday October 26 12:51:24 UTC 2020  
cpw:  
Force 8.0.5 ML  
  
Signed-off-by: cpw  
  
Build: 34.1.28  
--------------  
  
Monday October 26 11:32:40 UTC 2020  
cpw:  
Restore FingerprintViolationEvent with appropriate THIS IS F\*CKING DEAD DELET WARNINGS.  
Also, notify in UI if using legacy JDK without capability to read out security data from mod jars.  
  
Signed-off-by: cpw  
  
Build: 34.1.27  
--------------  
  
Monday October 26 02:27:48 UTC 2020  
cpw:  
Rollback registries to vanilla state if something happens during loading, so subsequent activities can still run and not generate false reports..  
  
Signed-off-by: cpw  
  
cpw:  
Add signature reporting for mods, using new signature capture from ModLauncher. Need to figure out  
how to reflect Minecraft's JAR signatures into here.  
  
Signed-off-by: cpw  
  
Build: 34.1.25  
--------------  
  
Tuesday October 20 19:32:40 UTC 2020  
lexmanos:  
Fix mcp\_snapshot mapping issue causing unneeded patches. Closes #7424  
  
Build: 34.1.24  
--------------  
  
Tuesday October 20 11:26:03 UTC 2020  
gigaherz:  
Fix resource leak in the OBJ loader.  
  
Build: 34.1.23  
--------------  
  
Friday October 16 19:10:02 UTC 2020  
djbake101:  
Fix issue with ITeleporter allowing easier use of vanilla logic. (#7317)  
  
Build: 34.1.22  
--------------  
  
Thursday October 15 19:49:26 UTC 2020  
richard:  
Adds tag support for Enchantments, Potions, and TileEntityTypes (#7379)  
  
Build: 34.1.21  
--------------  
  
Thursday October 15 19:43:33 UTC 2020  
lexmanos:  
Resuscitate BiomeDictionary using RegistryKeys instead of biome references.  
  
Build: 34.1.20  
--------------  
  
Thursday October 15 17:15:15 UTC 2020  
finntheraider:  
Add event for player changing game mode (#7355)  
  
Build: 34.1.19  
--------------  
  
Monday October 12 18:11:22 UTC 2020  
cpw:  
Fix RCON multipacket responses not actually understanding UTF8.  
  
Signed-off-by: cpw  
  
Build: 34.1.18  
--------------  
  
Monday October 12 01:49:09 UTC 2020  
cpw:  
Fix RCON not sending newlines in output for multiline. Fixes \[MC-7569\](https://bugs.mojang.com/projects/MC/issues/MC-5769), a very old bug that is really annoying if you use RCON.  
  
Signed-off-by: cpw  
  
Build: 34.1.17  
--------------  
  
Saturday October 10 16:45:26 UTC 2020  
championash5357:  
Fix Texture Presence String (#7408)  
  
Build: 34.1.16  
--------------  
  
Friday October 09 19:57:26 UTC 2020  
lexmanos:  
Fix typo causing potential error in vine growth. Closes #7406  
Sort missing registry dumps by name, making it easier to read.  
  
Build: 34.1.15  
--------------  
  
Friday October 09 13:58:36 UTC 2020  
gigaherz:  
Fixed conditional advancement loading when using the "advancements" array.  
Added automatic generation of conditional advancements from the criteria in the conditional recipe entries.  
Added advancement name calculation from the recipe ID.  
  
Build: 34.1.14  
--------------  
  
Thursday October 08 21:08:45 UTC 2020  
32142731+flanks255:  
Additions to the mdk build.gradle to accommodate datagens. (#7398)  
  
Build: 34.1.13  
--------------  
  
Thursday October 08 21:02:59 UTC 2020  
daemonumbra:  
Added Basic Class-Level SAS Capability to checkSAS, added Vector4f to SAS (#7385)  
  
Build: 34.1.12  
--------------  
  
Wednesday October 07 20:04:11 UTC 2020  
richard:  
Add hooks to allow modification of structures spawn lists (#7344)  
  
Build: 34.1.11  
--------------  
  
Tuesday October 06 19:38:36 UTC 2020  
richard:  
Add back patches to Screen allowing for item tooltips to be auto wrapped again (#7378)  
  
Only deals with the methods receiving an ItemStack or ITextComponent(s), the methods that take IReorderingProcessor(s) are left alone.  
  
Build: 34.1.10  
--------------  
  
Monday October 05 14:34:56 UTC 2020  
adam:  
Bump mixin version to 0.8.2  
  
Build: 34.1.9  
-------------  
  
Monday October 05 10:30:12 UTC 2020  
cpw:  
Remove redundant call to CrashReport generator  
Vanilla is doing a crashreport for itself at startup now.  
  
Add a UUID into crashreport that is also logged in all channels at crash report generation time. This will allow to associate crash reports and the logs.  
  
Signed-off-by: cpw  
  
cpw:  
Add in extra debug logging  
  
Signed-off-by: cpw  
  
Build: 34.1.7  
-------------  
  
Sunday October 04 19:51:37 UTC 2020  
cpw:  
Modify how ModLoadingStage handles dispatch to Registry Events. Stops the objectholder spam and generally improves performance on larger packs.  
  
Signed-off-by: cpw  
  
cpw:  
Fix doc README and answer lex's question  
  
Signed-off-by: cpw  
  
Build: 34.1.5  
-------------  
  
Friday October 02 23:40:14 UTC 2020  
daemonumbra:  
Added "Bukkit Plugin" to InvalidModIdentifier (#7384)  
  
Build: 34.1.4  
-------------  
  
Friday October 02 23:34:26 UTC 2020  
richard:  
Fix vanilla Campfire smoke bug. \[MC-201374\](https://bugs.mojang.com/projects/MC/issues/MC-201374) (#7381)  
  
Build: 34.1.3  
-------------  
  
Friday October 02 23:28:31 UTC 2020  
sciwhiz12:  
Fix toggleable keybindings still being active while in GUI Fixes #7370 (#7373)  
  
Build: 34.1.2  
-------------  
  
Friday October 02 22:06:59 UTC 2020  
dev:  
Fix modded EntityClassifications not being useable in the codec. (#7337)  
  
Build: 34.1.1  
-------------  
  
Monday September 28 18:02:11 UTC 2020  
cech12:  
Support effective materials of vanilla AxeItem (#7351)  
  
Build: 34.1.0  
-------------  
  
Thursday September 24 07:05:13 UTC 2020  
lexmanos:  
Prep new RB.  
  
Build: 34.0.21  
--------------  
  
Thursday September 24 06:46:57 UTC 2020  
ichttt:  
Fix grass disappearing when alwaysSetupTerrainOffThread is true (#7291)  
  
Build: 34.0.20  
--------------  
  
Thursday September 24 06:41:41 UTC 2020  
35673674+alcatrazescapee:  
Accessors for inspecting and removal of biome generation settings. Fixed carvers still being immutable. (#7339)  
  
Build: 34.0.19  
--------------  
  
Thursday September 24 06:36:25 UTC 2020  
lexmanos:  
Revive BiomeManager and BiomeLayer hooks.  
  
Build: 34.0.18  
--------------  
  
Thursday September 24 03:12:19 UTC 2020  
richard:  
Fix a few minor issues with custom tag types and fix OptionalNamedTags (#7316)  
  
Build: 34.0.17  
--------------  
  
Wednesday September 23 22:10:11 UTC 2020  
diesieben07:  
Fix ToggleableKeyBinding differences to vanilla. (#7338)  
  
Build: 34.0.16  
--------------  
  
Wednesday September 23 21:34:47 UTC 2020  
yunus1903:  
Updated build badge versions to 1.16.3 in readme (#7325)  
  
diesieben07:  
Fix forge light pipeline applying block offsets twice (#7323)  
  
Build: 34.0.14  
--------------  
  
Wednesday September 23 21:16:46 UTC 2020  
ichttt:  
Add a better license error screen (#7350)  
  
Build: 34.0.13  
--------------  
  
Tuesday September 22 19:14:17 UTC 2020  
darklime:  
Fixed container item being consumed in brewing stand. #7307 (#7314)  
  
Build: 34.0.12  
--------------  
  
Tuesday September 22 19:06:10 UTC 2020  
sciwhiz12:  
Fix parse results of CommandEvent being disregarded (#7303)  
  
Build: 34.0.11  
--------------  
  
Tuesday September 22 18:58:28 UTC 2020  
17338378+nightenom:  
\[1.16\] Fix possible crash when using rendering regionCache (#7207)  
  
Build: 34.0.10  
--------------  
  
Tuesday September 22 18:41:16 UTC 2020  
35673674+alcatrazescapee:  
\[1.16\] Reimplement ICloudRenderHandler, ISkyRenderHandler and IWeatherRenderHandler (#6994)  
  
Build: 34.0.9  
-------------  
  
Friday September 18 00:58:08 UTC 2020  
35673674+alcatrazescapee:  
Make Biome.Climate and BiomeAmbiance fields accessible (#7336)  
  
Build: 34.0.8  
-------------  
  
Thursday September 17 20:42:53 UTC 2020  
cpw:  
Use mixin 0.8.1. Should fix problems with mixin not working properly with latest modlauncher.  
  
Signed-off-by: cpw  
  
Build: 34.0.7  
-------------  
  
Tuesday September 15 20:07:25 UTC 2020  
sebastian:  
Sets the empty/fill sounds for vanilla fluids.  
Use Fluid's fillSound rather than emptySound when filling buckets.  
  
Build: 34.0.6  
-------------  
  
Tuesday September 15 19:47:08 UTC 2020  
cyborgmas18:  
Add MatrixStack-aware alternatives to the methods in GuiUtils (#7127)  
  
Build: 34.0.5  
-------------  
  
Tuesday September 15 16:51:58 UTC 2020  
justin\_wiblin:  
Fix json biomes not setting registry name correctly for the BiomeLoadingEvent. (#7329)  
  
Build: 34.0.4  
-------------  
  
Tuesday September 15 14:18:16 UTC 2020  
gigaherz:  
Fix inconsistencies in how the values from the model are passed into the baked model.  
This puts them in line with vanilla, as intended.  
  
Build: 34.0.3  
-------------  
  
Tuesday September 15 13:23:05 UTC 2020  
yunus1903:  
Reimplemented drawHoveringText (#7268)  
  
Build: 34.0.2  
-------------  
  
Tuesday September 15 00:43:19 UTC 2020  
lexmanos:  
New BiomeLoadingEvent that allows modders to edit biomes as they are being deserialized.  
  
Build: 34.0.1  
-------------  
  
Friday September 11 15:55:28 UTC 2020  
lexmanos:  
Bump MCP version for lambda issue.  
  
Build: 34.0.0  
-------------  
  
Thursday September 10 19:10:33 UTC 2020  
lexmanos:  
1.16.3 Update  
Also included a bunch of warning cleanups.  
  
* * *  
MC 1.16.2  
=========
* * *  
  
Build: 33.0.61  
--------------  
  
Thursday September 10 18:54:56 UTC 2020  
42962686+redstonedubstep:  
Fix tile entities being replaced when not needed. (#7318)  
  
Build: 33.0.60  
--------------  
  
Thursday September 10 18:02:15 UTC 2020  
malte0811:  
Fix exception when getting rendering box for tile entities with no collision boxes. (#7301)  
  
Build: 33.0.59  
--------------  
  
Wednesday September 09 23:05:21 UTC 2020  
cpw:  
More crash reporting tweaks. Don't crash when trying to show warnings. Also, put the exception name in the error screen on the second line!  
  
Signed-off-by: cpw  
  
Build: 33.0.58  
--------------  
  
Wednesday September 09 17:09:09 UTC 2020  
diesieben07:  
Fix Minecart speed cap on rail being initialized to 0 (#7315)  
  
Build: 33.0.57  
--------------  
  
Wednesday September 09 02:10:45 UTC 2020  
richard:  
Add support for custom tag types (#7289)  
  
Build: 33.0.56  
--------------  
  
Wednesday September 09 00:06:22 UTC 2020  
cpw:  
More crash report tweaks. Put a button to open the generated crash report on the error screen, tweak formatting of crash report, and add the enhanced stack trace data (transformers et al)  
  
Signed-off-by: cpw  
  
Build: 33.0.55  
--------------  
  
Tuesday September 08 21:00:19 UTC 2020  
championash5357:  
New hook for better custom scaffolding movement (#7261)  
  
Build: 33.0.54  
--------------  
  
Tuesday September 08 20:47:48 UTC 2020  
mrtschipp:  
Add partialTicks to RenderNameplateEvent (#7277)  
  
cyborgmas18:  
Prevent duplicate wrapper tags from crashing (#7283)  
  
matthrewp:  
Fix custom teleporters NPE (#7296)  
  
cyborgmas18:  
Fixed crash with zip paths (#7300)  
  
Build: 33.0.50  
--------------  
  
Tuesday September 08 20:23:27 UTC 2020  
nrbeech:  
Fixing logic in getCurrentRailPosition to correctly identify the rail… (#7276)  
  
Build: 33.0.49  
--------------  
  
Tuesday September 08 20:14:58 UTC 2020  
sciwhiz12:  
Remove dead ForgeHooks.canToolHarvestBlock function. (#7262)  
  
sciwhiz12:  
Bump resource pack version to 6 (#7299)  
  
edwin.mindcraft:  
\[1.16.x\] Fixes for Bamboo, Enchantments and Conduits, small adjustments to bring some patches closer to the vanilla code. (#7239)  
  
Build: 33.0.46  
--------------  
  
Tuesday September 08 19:50:14 UTC 2020  
championash5357:  
Re-implement DrawHighlightEvent$HighlightEntity Firing (#7233)  
  
Build: 33.0.45  
--------------  
  
Tuesday September 08 19:25:58 UTC 2020  
ichttt:  
Reimplement FarmlandWaterManager (#7213)  
  
Build: 33.0.44  
--------------  
  
Tuesday September 08 19:11:16 UTC 2020  
cyborgmas18:  
Add dataprovider for Global Loot Modifiers (#6960)  
  
Build: 33.0.43  
--------------  
  
Tuesday September 08 19:01:09 UTC 2020  
ichttt:  
Fix crash when dumping crash report for an exception that has a null cause (#7308)  
  
Build: 33.0.42  
--------------  
  
Monday September 07 01:29:40 UTC 2020  
cpw:  
Tweak crash report dump to visit all the causes up to the top.  
  
Signed-off-by: cpw  
  
Build: 33.0.41  
--------------  
  
Sunday September 06 23:39:13 UTC 2020  
cpw:  
Fix ExplodedDirectoryLocator visiting non-existent paths. Closes #7203  
  
Also, bump modlauncher to 7.0.1 to fix resources.  
  
Signed-off-by: cpw  
  
Build: 33.0.40  
--------------  
  
Sunday September 06 22:08:22 UTC 2020  
cpw:  
Use new enumeration mechanism in ModLauncher, to allow getResources to work. This enables serviceloader-in-mods, and other stuff that might need to visit multiple mod jars. Also, tweaked the visitor code slightly, may result in a trivial performance change. Closing #7302 as it's not really relevant any more.  
  
Signed-off-by: cpw  
  
cpw:  
Park the polling thread for a bit, if we're not the one driving the task list forwards. This allows for the actual driver to work on low cpu count machines.  
  
Signed-off-by: cpw  
  
cpw:  
Fix some potential issues in crash dumping during mod loading  
  
Signed-off-by: cpw  
  
Build: 33.0.37  
--------------  
  
Thursday September 03 16:37:38 UTC 2020  
cpw:  
Fix compiler issue in eclipse properly  
  
Signed-off-by: cpw  
  
Build: 33.0.36  
--------------  
  
Thursday September 03 12:40:52 UTC 2020  
sciwhiz12:  
Fix crash caused by previous commit (#7298)  
  
Build: 33.0.35  
--------------  
  
Thursday September 03 04:15:27 UTC 2020  
lexmanos:  
Dirty casting hacks to fix eclipse compiler inference issue. I'm sorry cpw.  
  
Build: 33.0.34  
--------------  
  
Thursday September 03 03:38:16 UTC 2020  
tterrag:  
Fix broken ExistingFileHelper import  
  
Add licenses to some new files  
  
tterrag:  
Add validation via resources for tag providers (#7271)  
  
BREAKING CHANGE: Moved ExistingFileHelper to common package  
Remove various workarounds from forge tag providers  
  
Build: 33.0.32  
--------------  
  
Tuesday September 01 18:36:21 UTC 2020  
cpw:  
Move the "modloading" thread activity onto \_our\_ worker pool. It turns out that the vanilla worker pool can deadlock during stitching if it's insufficiently large, if modloader "waitForTransition" is also a worker member of that pool.  
  
Closes #7293 (to reproduce issue easily, modify Util.func\_240979\_a\_ and change the values in the MathHelper.clamp call). I've verified that 3 and below for "max" cause the problem. (I didn't test a whole range of values, just sufficient to reproduce problem and verify fix). Note that setting it to zero (and using the "direct executor" that's inaccessible in normal operation) works as well with this fix.  
  
Signed-off-by: cpw  
  
Build: 33.0.31  
--------------  
  
Tuesday September 01 02:27:07 UTC 2020  
cpw:  
Fix missed debugging code. Read the config from the config.  
  
Signed-off-by: cpw  
  
Build: 33.0.30  
--------------  
  
Tuesday September 01 01:31:57 UTC 2020  
cpw:  
Revert "Shut down all other mod handlers if the loading cycle errors. This prevents other mods from throwing errors and being blamed for initial cause. This is a temporary hack until cpw re-writes the mod event dispatcher."  
  
This reverts commit 7592bbe8  
  
Signed-off-by: cpw  
  
cpw:  
Revert "Properly shutdown FMLModContainer's event bus when an error in a lifecycle event is detected."  
  
This reverts commit 30bad1e2  
  
Signed-off-by: cpw  
  
cpw:  
Redo event dispatch, removes a bunch of nonsense, and tries to integrate with the vanilla CF system where possible  
  
Signed-off-by: cpw  
  
cpw:  
Fix up all the things. Removed SidedProvider because it served no real purpose anymore.  
  
Signed-off-by: cpw  
  
cpw:  
Fix up slight registry change and other 1.16.2 stuffs.  
  
Signed-off-by: cpw  
  
Build: 33.0.23  
--------------  
  
Sunday August 30 23:05:24 UTC 2020  
ichttt:  
Add particle culling (#6981)  
  
Build: 33.0.22  
--------------  
  
Wednesday August 26 16:50:02 UTC 2020  
lexmanos:  
Wrap vanilla's 'default' biome registry in ForgeRegistry.  
This should allow registering mod dimensions like in 1.16.1, while the data driven system is fleshed out.  
  
Build: 33.0.21  
--------------  
  
Tuesday August 25 01:11:38 UTC 2020  
gigaherz:  
Clarify in the LazyOptional which methods carry the lazyness over to the returned value and which don't. (#6750)  
  
For consistency, this meant making a few changes:  
\- Renamed the existing lazy mapping method to lazyMap, to indicate that it doesn't run the mapping immediately.  
\- Added a new implementation of map(), which returns Optional, and resolves the value in the process.  
\- Changed filter() to return Optional, since there's no way to filter lazily.  
\- Added a new method resolve(), which helps convert the custom LazyOptional class into a standard Optional, for use  
with library methods that expect Optional.  
  
\* Update License headers.  
  
Build: 33.0.20  
--------------  
  
Friday August 21 21:27:21 UTC 2020  
sciwhiz12:  
Add user-friendly exceptions when config loading fails (#7214)  
  
Build: 33.0.19  
--------------  
  
Friday August 21 18:53:46 UTC 2020  
dev:  
Replace EntityHeight event with EntitySize event (#6858)  
  
Build: 33.0.18  
--------------  
  
Friday August 21 18:38:31 UTC 2020  
davide2910:  
\[1.16\] ForgeEventFactory#canCreateFluidSource reintroduced (#7181)  
  
Build: 33.0.17  
--------------  
  
Friday August 21 18:31:19 UTC 2020  
cyborgmas18:  
Cleanup and expand Forge tags (#7004)  
  
Build: 33.0.16  
--------------  
  
Friday August 21 18:25:49 UTC 2020  
sciwhiz12:  
Fix modproperties property in mods.toml causing exception (#7192)  
  
Build: 33.0.15  
--------------  
  
Friday August 21 18:15:53 UTC 2020  
me:  
Log info about server list warning (#7209)  
  
Make it easier to figure out what mods are missing or have to be marked as client/server side only.  
  
Build: 33.0.14  
--------------  
  
Friday August 21 18:06:47 UTC 2020  
goto.minecraft:  
Fix ItemStack#isDamageable is not calling Item#isDamagable (#7221)  
  
Build: 33.0.13  
--------------  
  
Friday August 21 17:48:58 UTC 2020  
diesieben07:  
Improve performance and cleanup code for DelegatingResourcePack (#7228)  
  
Build: 33.0.12  
--------------  
  
Friday August 21 17:29:33 UTC 2020  
cyborgmas18:  
Fix small logging issues with loading pack.png for mods (#7265)  
  
Build: 33.0.11  
--------------  
  
Friday August 21 17:23:30 UTC 2020  
diesieben07:  
Fix config iteration order (#7230)  
  
Build: 33.0.10  
--------------  
  
Friday August 21 09:47:23 UTC 2020  
lexmanos:  
Cleanup Forge's build script, fix some unneeded patches.  
Add checkExcscheckAll tasks.  
  
Build: 33.0.9  
-------------  
  
Friday August 21 04:35:17 UTC 2020  
championash5357:  
Readding DifficultyChangeEvent hooks (#7240)  
  
Build: 33.0.8  
-------------  
  
Friday August 21 04:29:10 UTC 2020  
malte0811:  
Improve startup time by caching the manifest data for mod jars (#7256)  
  
Build: 33.0.7  
-------------  
  
Wednesday August 19 05:47:46 UTC 2020  
yunus1903:  
Removed HarvestDropsEvent (#7193)  
  
Build: 33.0.6  
-------------  
  
Wednesday August 19 05:22:45 UTC 2020  
cyborgmas18:  
Remove forge optional tags in favor of Vanilla's new system. (#7246)  
  
Build: 33.0.5  
-------------  
  
Friday August 14 19:05:15 UTC 2020  
lexmanos:  
Fix creating nether portals.  
  
lexmanos:  
New method for creating modded tag references, fix connecting to vanilla servers.  
  
Build: 33.0.3  
-------------  
  
Friday August 14 02:17:01 UTC 2020  
43609023+spnda:  
Print mod file name on InvalidModFileException (#7241)  
  
Build: 33.0.2  
-------------  
  
Thursday August 13 19:26:22 UTC 2020  
cyborgmas18:  
Fix server connection, misapplied patch (#7245)  
  
yunus1903:  
Updated MDK and README for 1.16.2 (#7243)  
  
Build: 33.0.0  
-------------  
  
Thursday August 13 07:37:04 UTC 2020  
lexmanos:  
Initial 1.16.2 Update  

* * *  
MC 1.16.1  
=========  
* * *  

Build: 32.0.108  
---------------  
  
Sunday August 09 20:05:01 UTC 2020  
gigaherz:  
Fix ModelRegistryEvent firing every time resources reload instead of just once.  
  
Build: 32.0.107  
---------------  
  
Saturday August 08 01:00:42 UTC 2020  
gigaherz:  
Move ModelRegistryEvent invocation to when the model loading is about to start.  
Freeze the ModelLoaderRegistry right after this event happens, just before model loading actually begins.  
This means ModelRegistryEvent is now the correct place to register loaders, as it was intended.  
This is a slight breaking change, but any mod that used FMLClientSetupEvent before will need to be updated regardless due to the existing race condition.  
  
Build: 32.0.106  
---------------  
  
Tuesday August 04 00:19:22 UTC 2020  
diesieben07:  
Fix wrong BlockState param passed into canSustainPlant from FarmlandBlock (#7212)  
  
Build: 32.0.105  
---------------  
  
Tuesday August 04 00:06:45 UTC 2020  
sciwhiz12:  
Add harvest levels for hoes and new 1.16 blocks for pickaxes Fixes #7187 (#7189)  
  
Build: 32.0.104  
---------------  
  
Tuesday August 04 00:00:40 UTC 2020  
sciwhiz12:  
Fix debug world not generating modded blocks (#6926)  
  
championash5357:  
New IForgeBlock#getToolModifiedState hook allow better control over tools interacting with blocks. (#7176)  
  
email.squishling:  
Added new hook to allow Biomes to control their Edge biomes (#7000)  
  
Build: 32.0.101  
---------------  
  
Monday August 03 22:55:18 UTC 2020  
diesieben07:  
Re-introduce "outdated" notification on Mods button in main menu (#7123)  
  
brandon4261:  
Add support for custom elytra (#7202)  
  
Build: 32.0.99  
--------------  
  
Monday August 03 18:53:31 UTC 2020  
sciwhiz12:  
Fix RenderTickEvent using wrong partial ticks value when game is paused. Fixes #6991 (#7208)  
  
Build: 32.0.98  
--------------  
  
Thursday July 30 03:18:00 UTC 2020  
tterrag:  
Implement forge IBakedModel methods in vanilla wrapper models  
  
Build: 32.0.97  
--------------  
  
Tuesday July 28 23:44:41 UTC 2020  
lexmanos:  
Fix another case of swallowed errors not shutting down mods.  
  
Build: 32.0.96  
--------------  
  
Tuesday July 28 21:40:06 UTC 2020  
lexmanos:  
Shut down all other mod handlers if the loading cycle errors.  
This prevents other mods from throwing errors and being blamed for initial cause.  
This is a temporary hack until cpw re-writes the mod event dispatcher.  
  
Build: 32.0.94 32.0.95  
----------------------  
  
Tuesday July 28 19:01:27 UTC 2020  
lexmanos:  
Properly shutdown FMLModContainer's event bus when an error in a lifecycle event is detected.  
  
lexmanos:  
Enable EventBus type check during ForgeDev, and add IModBusEvent marker to ModelRegistryEvent.  
  
Build: 32.0.93  
--------------  
  
Tuesday July 28 07:16:31 UTC 2020  
lexmanos:  
Make license toml entry optional during 1.16.1  
There are to many existing mods to make this required.  
Yes, we are technically before a RB and can do breaking changes. However this is too large.  
  
Build: 32.0.92  
--------------  
  
Tuesday July 28 01:14:20 UTC 2020  
cpw:  
Missed one event. NewRegistry needs the marker.  
  
Signed-off-by: cpw  
  
Build: 32.0.91  
--------------  
  
Tuesday July 28 01:07:03 UTC 2020  
cpw:  
Update MDK license to default to All rights reserved, and offer a link to chooseyourlicense.com as a place to research appropriate licenses.  
  
Note: the license field \_is\_ backwards compatible and will simply be ignored on older forge versions.  
Signed-off-by: cpw  
  
Build: 32.0.90  
--------------  
  
Tuesday July 28 00:47:35 UTC 2020  
cpw:  
Update modlauncher, eventbus, accesstransformers and more to use a newer mechanism for generating ASM.  
  
Introduced IModBusEvent as a marker interface for events on the ModBus. Expect exceptions if you use  
the modbus for events not listened there.  
  
Signed-off-by: cpw  
  
cpw:  
Update coremods and spi, include mandatory license field in metadata. Added at top level of mods.toml file.  
  
Signed-off-by: cpw  
  
Build: 32.0.88  
--------------  
  
Monday July 27 23:35:24 UTC 2020  
ray.neiheiser:  
Fix rail 180 rotations (#7177)  
  
jmansfield:  
Fire AnimalTameEvent for cats (#7172) Closes #7171  
  
Build: 32.0.86  
--------------  
  
Monday July 27 22:56:16 UTC 2020  
lexmanos:  
Fix Biome generation error.  
  
Build: 32.0.85  
--------------  
  
Monday July 27 21:36:07 UTC 2020  
dev:  
Fix SleepingTimeCheckEvent not being fired in initial sleep test. (#7005)  
  
Build: 32.0.84  
--------------  
  
Monday July 27 21:30:24 UTC 2020  
yunus1903:  
Fix ClimberPathNavigator spinning when width is small. Closes #6993 (#6997)  
  
Build: 32.0.83  
--------------  
  
Monday July 27 21:19:50 UTC 2020  
mrtschipp:  
Re-added PlayerEvent.NameFormat (#6992)  
  
Build: 32.0.82  
--------------  
  
Monday July 27 21:14:02 UTC 2020  
email.squishling:  
Fixed modded overworld biomes not spawning \[1.16.x\] (#6990)  
  
Build: 32.0.81  
--------------  
  
Monday July 27 21:08:23 UTC 2020  
christ.klinge:  
Added EntityLeaveWorldEvent (#6984)  
  
Build: 32.0.80  
--------------  
  
Monday July 27 21:02:53 UTC 2020  
aqscode:  
Re-implement moddable flammabilities (#6983)  
  
Build: 32.0.79  
--------------  
  
Monday July 27 20:46:11 UTC 2020  
diesieben07:  
Re-add patch for PlayerSetSpawnEvent (#6977)  
  
yunus1903:  
Updated versions in README and removed flocker.tv mentions (#6978)  
  
Build: 32.0.77  
--------------  
  
Monday July 27 20:40:33 UTC 2020  
sciwhiz12:  
Fix ChunkDataEvents using different data tags (#6961) Fixes #6957  
  
Build: 32.0.76  
--------------  
  
Monday July 27 20:27:00 UTC 2020  
joetarbit:  
Post SoundLoadEvent on mod bus instead of forge bus (#6955)  
  
Build: 32.0.75  
--------------  
  
Wednesday July 22 01:26:19 UTC 2020  
cpw:  
Remove startupquery. Currently wasn't functional, and 1.16 has out of band state loading in all cases, so the complex functionality there is no longer needed. Going to research using the Lifecycle indicator from DFU as a proxy/replacement. Probably with some codec FUN.  
  
Signed-off-by: cpw  
  
Build: 32.0.74  
--------------  
  
Wednesday July 22 00:34:43 UTC 2020  
lexmanos:  
Run Forge's data generators to sync 1.16 vanilla changes.  
  
Build: 32.0.73  
--------------  
  
Wednesday July 22 00:13:48 UTC 2020  
cpw:  
Don't show the early launcher GUI when running data. It's not needed and prevents use on automated builds.  
  
Need to investigate why a bunch of tags seem to be being blown away by rerunning on forge.  
  
Signed-off-by: cpw  
  
Build: 32.0.72  
--------------  
  
Tuesday July 21 23:56:54 UTC 2020  
cpw:  
Add mixin  
  
Signed-off-by: cpw  
  
Build: 32.0.71  
--------------  
  
Monday July 20 22:56:31 UTC 2020  
cyborgmas18:  
Load Modded Datapacks in DatapackScreen, before world creation (#6913)  
  
Build: 32.0.70  
--------------  
  
Saturday July 18 22:35:53 UTC 2020  
tterrag:  
Fix inconsistencies with model/blockstate datagen  
  
Build: 32.0.69  
--------------  
  
Friday July 17 17:35:47 UTC 2020  
dev:  
Filter duplicate mod files from mod file scan data (#6855)  
  
Build: 32.0.68  
--------------  
  
Thursday July 16 21:56:30 UTC 2020  
lexmanos:  
Fixed Forge commands. Closes #6973 Closes #6974 Closes #6976  
  
Build: 32.0.67  
--------------  
  
Wednesday July 15 19:30:53 UTC 2020  
jaredlll08:  
Added an event for registering commands. closes #6968 (#6969)  
  
Build: 32.0.66  
--------------  
  
Tuesday July 14 00:15:41 UTC 2020  
darklime:  
Make all functions in Style common. (#6931)  
  
Build: 32.0.65  
--------------  
  
Monday July 13 22:44:53 UTC 2020  
55965249+seymourimadeit:  
Mark Raid.WaveMembers as an extensible enum. (#6878)  
  
Build: 32.0.64  
--------------  
  
Monday July 13 22:17:58 UTC 2020  
lexmanos:  
Fix checkPatches task. Closes #6956  
Fix patched in method using srg name. Closes #6965  
Fix capabilities not being collected for ClientWorld. Closes #6966  
Fix TagEmptyCondition using client side copy of tags instead of server. Closes #6949  
Fix ExtendedButton using narrator text. Closes #6958, Closes #6959  
Fix misaligned patch in RepairContainer. Closes #6950, Closes #6953  
Fix LivingJumpEvent not being fired for players jumping horses. Closes #6929  
Remove extra getToughness method in ArmorItem. Closes #6970  
Remove GetCollisionBoxesEvent. Closes #6921  
  
Build: 32.0.63  
--------------  
  
Friday July 10 22:28:22 UTC 2020  
richard:  
Fix race condition with DeferredRegister for custom registries (#6951)  
  
Build: 32.0.62  
--------------  
  
Friday July 10 17:49:51 UTC 2020  
sciwhiz12:  
Remove hooks into beacon base/payments. Vanilla uses tags now for extensibility. (#6948)  
  
Build: 32.0.61  
--------------  
  
Wednesday July 08 21:33:38 UTC 2020  
jaredlll08:  
Expose the DataPackRegistries instance to the AddReloadListenerEvent (#6933)  
  
Build: 32.0.60  
--------------  
  
Wednesday July 08 21:13:18 UTC 2020  
sciwhiz12:  
Fix canRepair not being set true as default (#6936)  
  
Closes #6934 and #6935  
  
Build: 32.0.59  
--------------  
  
Wednesday July 08 14:56:39 UTC 2020  
gigaherz:  
Fix particles sometimes "losing" the lightmap and drawing fullbright.  
  
gigaherz:  
Fix misaligned patch causing LivingEquipmentChangeEvent to never be posted.  
  
Build: 32.0.57  
--------------  
  
Monday July 06 21:32:33 UTC 2020  
jdlogic:  
Add simple patch checker and cleanup patches (#6851)  
  
\* Add simple patch checker and cleanup patches  
  
\* Address comments  
\* move task implementation  
\* genPatches is now finalized by checkPatches  
\* the S2S artifacts are automatically removed  
\* added class and method access checking  
  
Build: 32.0.56  
--------------  
  
Monday July 06 21:27:02 UTC 2020  
richard:  
Fix the modifier combined name for keybinds displaying two pluses outside of forgedev #6901 (#6902)  
  
Build: 32.0.55  
--------------  
  
Monday July 06 21:12:45 UTC 2020  
richard:  
Fix harvest level and tool type not actually getting set #6906 (#6922)  
  
Build: 32.0.54  
--------------  
  
Monday July 06 20:46:01 UTC 2020  
richard:  
Reimplement ITeleporter Patches (#6886)  
  
Build: 32.0.53  
--------------  
  
Monday July 06 20:39:37 UTC 2020  
40738104+mysterious-dev:  
Add function to add items with the same behavior as the pumpkin for enderman (#6890)  
  
Build: 32.0.52  
--------------  
  
Monday July 06 20:33:17 UTC 2020  
richard:  
Custom Item integration with Piglins (#6914)  
  
Build: 32.0.51  
--------------  
  
Monday July 06 20:20:02 UTC 2020  
ichttt:  
Some dead code cleanup, and re-implement some bed hooks. (#6903)  
  
Build: 32.0.50  
--------------  
  
Monday July 06 20:06:39 UTC 2020  
diesieben07:  
Fix missing null checks in ForgeIngameGui (#6907)  
  
Build: 32.0.49  
--------------  
  
Monday July 06 19:50:02 UTC 2020  
sciwhiz12:  
Fix swap offhand keybind not working in GUIs (#6920)  
  
Build: 32.0.48  
--------------  
  
Monday July 06 19:42:07 UTC 2020  
thpetuaudletang:  
New AddReloadListenerEvent that gathers server side data reload handlers. (#6849)  
  
Build: 32.0.47  
--------------  
  
Friday July 03 12:40:42 UTC 2020  
gigaherz:  
Attempt to use a more compatible method to initialize stencil support.  
In case the separate attachments don't work for everyone, there's a new setting to choose the combined attachment.  
  
Build: 32.0.46  
--------------  
  
Friday July 03 04:00:22 UTC 2020  
gigaherz:  
Update copyright year to 2020.  
  
gigaherz:  
Fix multi-layer item rendering.  
  
Build: 32.0.44  
--------------  
  
Thursday July 02 17:17:45 UTC 2020  
gigaherz:  
Model system improvements:  
\- Port some things I did in 1.14 which I couldn't do in 1.15 due to breaking changes.  
\- Fix multi-layer block models not working (1.16 RenderType doesn't override toString the same way anymore)  
\- Implement multi-layer item rendering.  
\- Improve CompositeModel submodel data passing.  
  
Build: 32.0.43  
--------------  
  
Thursday July 02 12:54:03 UTC 2020  
martijnvandenbrand:  
Include model data in getQuads call (#6884)  
  
The model data wasn't included when getting quads from specific sides, but was when getting quads for side = null.  
  
thpetuaudletang:  
Pass matrixstack in tooltip render events (#6885)  
  
Build: 32.0.41  
--------------  
  
Thursday July 02 05:54:25 UTC 2020  
tterrag:  
Fix improper handling of baked lighting in forge light pipeline  
  
Closes #6812  
  
Build: 32.0.40  
--------------  
  
Thursday July 02 01:59:30 UTC 2020  
richard:  
Fix FMLServerAboutToStartEvent being fired too late on the integrated server https://github.com/MinecraftForge/MinecraftForge/issues/6859  
  
Build: 32.0.39  
--------------  
  
Wednesday July 01 18:14:25 UTC 2020  
ichttt:  
Fix miss-aligned patch ItemEntity (#6895)  
  
Build: 32.0.38  
--------------  
  
Tuesday June 30 20:19:32 UTC 2020  
info:  
Add hoe tool type (#6872)  
  
Build: 32.0.36  
--------------  
  
Tuesday June 30 20:09:21 UTC 2020  
curle:  
Allow any armor to have custom knockback resistance (#6877)  
  
Build: 32.0.35  
--------------  
  
Tuesday June 30 19:57:32 UTC 2020  
diesieben07:  
Add senderUUID to ClientChatReceivedEvent (#6881)  
  
Build: 32.0.34  
--------------  
  
Tuesday June 30 02:33:58 UTC 2020  
lexmanos:  
Re-write checkATs function and automate making Items/Blocks public.  
  
Build: 32.0.33  
--------------  
  
Tuesday June 30 02:10:14 UTC 2020  
cpw:  
Reorganize modloading on the dediserver. This removes the DedicatedServer parameter from the FMLDedicatedServerSetupEvent.  
Code for customizing the server instance should be moved to the ServerAboutToStartEvent or similar, where the server instance  
is available.  
  
This reorganization means that mods will load fully before the server is even constructed, or the server properties loaded. We also move the EULA right to the front so we don't have to wait for bootstrap.  
  
This should fix the problems with mods which customize world data and other things.  
  
Signed-off-by: cpw  
  
Build: 32.0.32  
--------------  
  
Monday June 29 23:43:01 UTC 2020  
thpetuaudletang:  
Fix datagen resolving tags and exploding. (#6865)  
  
Build: 32.0.31  
--------------  
  
Monday June 29 23:37:30 UTC 2020  
mattmess1221:  
Fix Language.javaLocale parsing (#6862)  
  
Build: 32.0.30  
--------------  
  
Monday June 29 22:58:30 UTC 2020  
diesieben07:  
Fix IItemHandler wrappers for chests not updating both chests (#6875)  
  
Build: 32.0.29  
--------------  
  
Monday June 29 21:08:55 UTC 2020  
lexmanos:  
Fix missed patch in PlayerList and EntitySelectioonContext. Closes #6846 Closes #6850  
  
Build: 32.0.27  
--------------  
  
Monday June 29 20:09:12 UTC 2020  
richard:  
Fix access levels being hardcoded to private via patch overriding AT entry (#6848)  
  
Build: 32.0.26  
--------------  
  
Monday June 29 19:42:50 UTC 2020  
lexmanos:  
Fix tag related issues when connecting to a vanilla server.  
  
Build: 32.0.25  
--------------  
  
Sunday June 28 22:08:15 UTC 2020  
lexmanos:  
Fix Forge's internal handler being registered in wrong place.  
Fix double call to loader end.  
  
Build: 32.0.24  
--------------  
  
Saturday June 27 22:50:54 UTC 2020  
gigaherz:  
Add a model loader that lets mods specify different models for different perspectives.  
Allow custom models to reference vanilla item models as child models.  
  
Build: 32.0.23  
--------------  
  
Friday June 26 23:55:23 UTC 2020  
thpetuaudletang:  
fix misapplied patch  
  
also sneak in an import patch removal  
  
Build: 32.0.21  
--------------  
  
Friday June 26 22:40:19 UTC 2020  
lexmanos:  
Fix blocks being harvested with incorrect tools.  
  
Build: 32.0.20  
--------------  
  
Friday June 26 19:53:02 UTC 2020  
lexmanos:  
Make installer use MCPConfig version to identify MC assets.  
  
Build: 32.0.19  
--------------  
  
Friday June 26 18:27:49 UTC 2020  
cpw:  
Tweak the server startup a bit, make sure methods that can't work because they run before a server exists explode saying so.  
Also fix other launch profiles.  
  
Signed-off-by: cpw  
  
Build: 32.0.18  
--------------  
  
Friday June 26 16:56:37 UTC 2020  
lexmanos:  
Fix dedicated server loading by constructing mods before data packs are created.  
  
Build: 32.0.17  
--------------  
  
Friday June 26 15:20:37 UTC 2020  
gigaherz:  
Fix create method. Fix test mods not loading correctly.  
  
Build: 32.0.16  
--------------  
  
Friday June 26 14:43:19 UTC 2020  
gigaherz:  
Reintroduce missed patch in EntityClassification.  
  
Build: 32.0.15  
--------------  
  
Friday June 26 13:55:42 UTC 2020  
thpetuaudletang:  
Include a getter for the matrix stack in OverlayEvent (#6834)  
  
Build: 32.0.14  
--------------  
  
Friday June 26 13:23:07 UTC 2020  
thpetuaudletang:  
Fix block render types not being properly applied to item entities (#6832)  
  
Build: 32.0.13  
--------------  
  
Friday June 26 13:05:18 UTC 2020  
mods.itsmeow:  
\[1.16.x\] Allow GlobalEntityTypeAttributes' EntityType -> AttributeModifierMap to be added to (#6822)  
  
\* Make GlobalEntityTypeAttributes map able to be added to  
  
\* Split get patch into two lines  
  
\* Favor Forge's map over vanilla  
  
Build: 32.0.12  
--------------  
  
Friday June 26 12:59:19 UTC 2020  
thpetuaudletang:  
Fixed creative screen arrows (#6827)  
  
yunus1903:  
Added call to method for tooltip with FontRenderer (#6831)  
  
Build: 32.0.10  
--------------  
  
Friday June 26 12:36:59 UTC 2020  
curle:  
Retarget Block.Properties patch to the new AbstractBlock, reintroduce harvestLevel and harvestTool fields (#6819)  
  
\* Retarget Block.Properties patch to the new AbstractBlock, reintroduces the harvestLevel and harvestTool fields.  
  
\* Slight adjustment to fix the lootTableSupplier.  
  
Build: 32.0.9  
-------------  
  
Friday June 26 12:31:37 UTC 2020  
yunus1903:  
Fixed sneaking while swimming (#6817)  
  
Build: 32.0.8  
-------------  
  
Friday June 26 12:25:07 UTC 2020  
thpetuaudletang:  
Fixed tooltip rendering issues (#6815)  
  
Build: 32.0.7  
-------------  
  
Friday June 26 02:30:54 UTC 2020  
thpetuaudletang:  
Fixed villager trades having non-applicable enchants  
  
Also added an AT at lex's request  
  
Build: 32.0.6  
-------------  
  
Friday June 26 01:52:19 UTC 2020  
thpetuaudletang:  
Fix locate command (#6811)  
  
thpetuaudletang:  
Fix block drops (#6810)  
  
contact:  
Add missing patch to ScreenShotHelper (#6809)  
  
Adds the missed patch back  
  
yunus1903:  
Updated MDK mods.toml versions (#6808)  
  
thpetuaudletang:  
Fix locate command (#6811)  
  
thpetuaudletang:  
Fix block drops (#6810)  
  
contact:  
Add missing patch to ScreenShotHelper (#6809)  
  
Adds the missed patch back  
  
yunus1903:  
Updated MDK mods.toml versions (#6808)  
  
thpetuaudletang:  
Fix locate command (#6811)  
  
thpetuaudletang:  
Fix block drops (#6810)  
  
contact:  
Add missing patch to ScreenShotHelper (#6809)  
  
Adds the missed patch back  
  
yunus1903:  
Updated MDK mods.toml versions (#6808)  
  
Build: 32.0.2  
-------------  
  
Friday June 26 01:41:51 UTC 2020  
lexmanos:  
Rework BlockSnapshot and fix client notifications. Closes #6807  
  
Build: 32.0.1  
-------------  
  
Thursday June 25 23:24:48 UTC 2020  
lexmanos:  
Bump MCPConfig version.