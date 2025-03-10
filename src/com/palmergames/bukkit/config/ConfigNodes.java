package com.palmergames.bukkit.config;

public enum ConfigNodes {
	VERSION_HEADER("version", "", ""),
	VERSION(
			"version.version",
			"",
			"# This is the current version of Towny. Please do not edit."),
	LAST_RUN_VERSION(
			"version.last_run_version",
			"",
			"# This is for showing the changelog on updates. Please do not edit."),
	LANGUAGE_ROOT(
		"language",
		"",
		""),
	LANGUAGE(
			"language.language",
			"en-US.yml",
			"# The language file you wish to use for your default locale. Your default locale is what",
			"# will be shown in your console and for any player who doesn't use one of the locales below.",
			"# Available languages: bg-BG.yml, cz-CZ.yml, da-DK.yml, de-DE.yml, en-US.yml,",
			"# es-AR.yml, es-CL.yml, es-EC.yml, es-ES.yml, es-MX.yml, es-UY.yml, es-VE.yml,",
			"# fr-FR.yml, he-IL.yml, id-ID.yml, it-IT.yml, ja-JP.yml, ko-KR.yml, nl-NL.yml,",
			"# no-NO.yml, pl-PL.yml, pt-BR.yml, pt-PT.yml, ro-RO.yml, ru-RU.yml, sr-CS.yml,",
			"# sv-SE.yml, th-TH.yml, tl-PH.yml, tr-TR.yml, uk-UA.yml, vi-VN.yml, zh-CN.yml,",
			"# zh-TW.yml",
			"#",
			"# If you want to override any of the files above with your own translations you must:",
			"# - Copy the file from the towny\\settings\\lang\\reference\\ folder ",
			"#   into the lang\\override\\ folder and do your edits to that file.",
			"# If you want to override ALL locales, to change colouring for instance, you must:",
			"# - Copy the language strings you want to override into ",
			"#   the towny\\settings\\lang\\global.yml file.",
			"#",
			"# Your players will select what locale that Towny shows them ",
			"# by changing their Minecraft client's locale."),
	
	ENABLED_LANGUAGES(
			"language.enabled_languages",
			"*",
			"",
			"# The languages you wish to have enabled. Set to '*' to use all available languages.",
			"# If you would like to only allow 4 languages use: en-US,ru-RU,es-ES,fr-FR",
			"# If a player's locale isn't enabled or isn't available it will use the language above instead."),

	PERMS(
			"permissions",
			"",
			"",
			"",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |         A Note on Permission Nodes and Towny         | #",
			"# +------------------------------------------------------+ #",
			"#                                                          #",
			"# For a full list of permission nodes and instructions     #",
			"# about TownyPerms visit: https://git.io/JUBLd             #",
			"# Many admins neglect to read the opening paragraphs of    #",
			"# this wiki page and end up asking questions the wiki      #",
			"# already answers!                                         #",
			"#                                                          #",
			"############################################################"),
	LEVELS(
			"levels",
			"",
			"",
			"",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |                Town and Nation levels                | #",
			"# +------------------------------------------------------+ #",
			"############################################################",
			""),
	LEVELS_TOWN_LEVEL("levels.town_level", "", "", "# Guide On How to Configure: https://github.com/TownyAdvanced/Towny/wiki/How-Towny-Works#configuring-town_level-and-nation_level"),
	LEVELS_NATION_LEVEL("levels.nation_level", "", "", "# Guide On How to Configure: https://github.com/TownyAdvanced/Towny/wiki/How-Towny-Works#configuring-town_level-and-nation_level"),
	TOWN(
			"town",
			"",
			"",
			"",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |               Town Claim/new defaults                | #",
			"# +------------------------------------------------------+ #",
			"############################################################",
			""),
	TOWN_DEF_PUBLIC(
			"town.default_public",
			"true",
			"",
			"# Default public status of the town (used for /town spawn)"),
	TOWN_DEF_OPEN(
			"town.default_open",
			"false",
			"",
			"# Default Open status of the town (are new towns open and joinable by anyone at creation?)"),
	TOWN_DEF_NEUTRAL(
			"town.default_neutral",
			"false",
			"",
			"# Default neutral status of the town (are new towns neutral by default?)"),
	TOWN_DEF_BOARD("town.default_board", 
			"/town set board [msg]",
			"",
			"# Default town board"),
	TOWN_DEF_TAG("town.set_tag_automatically",
			"false",
			"",
			"# Setting this to true will set a town's tag automatically using the first four characters of the town's name."),
	TOWN_DEF_TAXES(
			"town.default_taxes", 
			"",
			"",
			"# Default tax settings for new towns."),
	TOWN_DEF_TAXES_TAX(
			"town.default_taxes.tax",
			"0.0",
			"",
			"# Default amount of tax of a new town. This must be lower than the economy.daily_taxes.max_town_tax_amount setting."),
	TOWN_DEF_TAXES_SHOP_TAX(
			"town.default_taxes.shop_tax",
			"0.0",
			"",
			"# Default amount of shop tax of a new town."),
	TOWN_DEF_TAXES_EMBASSY_TAX(
			"town.default_taxes.embassy_tax",
			"0.0",
			"",
			"# Default amount of embassy tax of a new town."),
	TOWN_DEF_TAXES_PLOT_TAX(
			"town.default_taxes.plot_tax",
			"0.0",
			"",
			"# Default amount for town's plottax costs."),
	TOWN_DEF_TAXES_PLOT_TAX_PUTS_PLOT_FOR_SALE(
			"town.default_taxes.does_non-payment_place_plot_for_sale",
			"false",
			"",
			"# Does a player's plot get put up for sale if they are unable to pay the plot tax?",
			"# When false the plot becomes town land and must be set up for-sale by town mayor or staff."),
	TOWN_DEF_TAXES_TAXPERCENTAGE(
			"town.default_taxes.taxpercentage",
			"true",
			"",
			"# Default status of new town's taxpercentage. True means that the default_tax is treated as a percentage instead of a fixed amount."),
	TOWN_DEF_TAXES_MINIMUMTAX(
			"town.default_taxes.minimumtax",
			"0.0",
			"",
			"# A required minimum tax amount for the default_tax, will not change any towns which already have a tax set.",
			"# Do not forget to set the default_tax to more than 0 or new towns will still begin with a tax of zero."),
	TOWN_MAX_PURCHASED_BLOCKS(
			"town.max_purchased_blocks",
			"0",
			"",
			"# Limits the maximum amount of bonus blocks a town can buy.",
			"# This setting does nothing when town.max_purchased_blocks_uses_town_levels is set to true."),
	TOWN_MAX_PURCHASED_BLOCKS_USES_TOWN_LEVELS(
			"town.max_purchased_blocks_uses_town_levels",
			"true",
			"",
			"# When set to true, the town_level section of the config determines the maximum number of bonus blocks a town can purchase."),
	TOWN_MAX_PLOTS_PER_RESIDENT(
			"town.max_plots_per_resident",
			"100",
			"",
			"# maximum number of plots any single resident can own"),
	TOWN_MAX_CLAIM_RADIUS_VALUE(
			"town.max_claim_radius_value",
			"4",
			"",
			"# maximum number used in /town claim/unclaim # commands.",
			"# set to 0 to disable limiting of claim radius value check.",
			"# keep in mind that the default value of 4 is a radius, ",
			"# and it will allow claiming 9x9 (80 plots) at once."),
	TOWN_LIMIT(
			"town.town_limit",
			"3000",
			"",
			"# Maximum number of towns allowed on the server."),
	TOWN_MAX_DISTANCE_FOR_MERGE(
			"town.max_distance_for_merge",
			"10",
			"",
			"# The maximum distance (in townblocks) that 2 town's homeblocks can be to be eligible for merging."),
	TOWN_MIN_DISTANCE_IGNORED_FOR_NATIONS(
			"town.min_distances_ignored_for_towns_in_same_nation",
			"true",
			"",
			"# If true, the below settings: min_plot_distance_from_town_plot and min_distance_from_town_homeblock",
			"# will be ignored for towns that are in the same nation. Setting to false will keep all towns separated the same."),
	TOWN_MIN_DISTANCE_IGNORED_FOR_ALLIES(
			"town.min_distances_ignored_for_towns_in_allied_nation",
			"false",
			"",
			"# If true, the below settings: min_plot_distance_from_town_plot and min_distance_from_town_homeblock",
			"# will be ignored for towns that are mutually allied. Setting to false will keep all towns separated the same."),
	TOWN_MIN_PLOT_DISTANCE_FROM_TOWN_PLOT(
			"town.min_plot_distance_from_town_plot",
			"5",
			"",
			"# Minimum number of plots any towns plot must be from the next town's own plots.",
			"# Put in other words: the buffer area around every claim that no other town can claim into.",
			"# Does not affect towns which are in the same nation.",
			"# This will prevent town encasement to a certain degree."),
	TOWN_MIN_DISTANCE_FROM_TOWN_HOMEBLOCK(
			"town.min_distance_from_town_homeblock",
			"5",
			"",
			"# Minimum number of plots any towns home plot must be from the next town.",
			"# Put in other words: the buffer area around every homeblock that no other town can claim into.",
			"# Does not affect towns which are in the same nation.",
			"# This will prevent someone founding a town right on your doorstep"),
    TOWN_MIN_DISTANCE_FOR_OUTPOST_FROM_PLOT(
    		"town.min_distance_for_outpost_from_plot",
    		"5",
    		"",
    		"# Minimum number of plots an outpost must be from any other town's plots.",
    		"# Useful when min_plot_distance_from_town_plot is set to near-zero to allow towns to have claims",
    		"# near to each other, but want to keep outposts away from towns."),
    TOWN_MAX_DISTANCE_FOR_OUTPOST_FROM_TOWN_PLOT(
    		"town.max_distance_for_outpost_from_town_plot",
    		"0",
    		"",
    		"# Set to 0 to disable. When above 0 an outpost may only be claimed within the given number of townblocks from a townblock owned by the town.",
    		"# Setting this to any value above 0 will stop outposts being made off-world from the town's homeworld.",
    		"# Do not set lower than min_distance_for_outpost_from_plot above."),
	TOWN_MIN_DISTANCE_BETWEEN_HOMEBLOCKS(
			"town.min_distance_between_homeblocks",
			"0",
			"",
			"# Minimum distance between homeblocks."),
	TOWN_MAX_DISTANCE_BETWEEN_HOMEBLOCKS(
			"town.max_distance_between_homeblocks",
			"0",
			"",
			"# Maximum distance between homeblocks.",
			"# This will force players to build close together."),
	TOWN_TOWN_BLOCK_RATIO(
			"town.town_block_ratio",
			"8",
			"",
			"# The maximum townblocks available to a town is (numResidents * ratio).",
			"# Setting this value to 0 will instead use the level based jump values determined in the town level config.",
			"# Setting this to -1 will result in every town having unlimited claims."),
	TOWN_TOWN_BLOCK_LIMIT(
			"town.town_block_limit",
			"0",
			"",
			"# The maximimum amount of townblocks a town can have, if town_block_ratio is 0 the max size will be decided by the town_levels.",
			"# Set to 0 to have no size limit."),
	TOWN_TOWN_BLOCK_SIZE(
			"town.town_block_size",
			"16",
			"",
			"# The size of the square grid cell. Changing this value is suggested only when you first install Towny.",
			"# Doing so after entering data will shift things unwantedly. Using smaller value will allow higher precision,",
			"# at the cost of more work setting up. Also, extremely small values will render the caching done useless.",
			"# Each cell is (town_block_size * town_block_size * height-of-the-world) in size, with height-of-the-world",
			"# being from the bottom to the top of the build-able world."),
	
	NATION("nation", "", "", "",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |               New Nation Defaults                    | #",
			"# +------------------------------------------------------+ #",
			"############################################################", ""),
    NATION_DEF_PUBLIC(
            "nation.default_public",
            "false",
			"",
            "# If set to true, any newly made nation will have their spawn set to public."),
    NATION_DEF_OPEN(
            "nation.default_open",
            "false",
			"",
            "# If set to true, any newly made nation will have open status and any town may join without an invite."),
	NATION_DEF_BOARD("nation.default_board", 
			"/nation set board [msg]",
			"",
			"# Default nation board"),
	NATION_DEF_TAG("nation.set_tag_automatically",
			"false",
			"",
			"# Setting this to true will set a nation's tag automatically using the first four characters of the nation's name."),
	
	NWS(
			"new_world_settings",
			"",
			"",
			"",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |             Default new world settings               | #",
			"# +------------------------------------------------------+ #",
			"#                                                          #",
			"#   These flags are only used at the initial setup of a    #",
			"#   new world! When you first start Towny these settings   #",
			"#   were applied to any world that already existed.        #",
			"#   Many of these settings can be turned on and off in     #",
			"#   their respective worlds using the /tw toggle command.  #",
			"#   Settings are saved in the towny\\data\\worlds\\ folder.   #",
			"#                                                          #",
			"############################################################",
			""),

	NWS_WORLD_USING_TOWNY("new_world_settings.using_towny", "true",
			"# Do new worlds have Towny enabled by default?"),

	NWS_WORLD_PVP_HEADER("new_world_settings.pvp", "", ""),
	NWS_WORLD_PVP(
			"new_world_settings.pvp.world_pvp",
			"true",
			"# Do new worlds have pvp enabled by default?"),
	NWS_FORCE_PVP_ON(
			"new_world_settings.pvp.force_pvp_on",
			"false",
			"",
			"# Do new worlds have pvp forced on by default?",
			"# This setting overrides a towns' setting."),
	NWS_FRIENDLY_FIRE_ENABLED(
			"new_world_settings.pvp.friendly_fire_enabled",
			"false",
			"",
			"# Do new world have friendly fire enabled by default?",
			"# Does not affect Arena Plots which have FF enabled all the time.",
			"# When true players on the same town or nation will harm each other."),	
	NWS_WAR_ALLOWED(
			"new_world_settings.pvp.war_allowed",
			"true",
			"",
			"# Do new worlds have their war_allowed enabled by default?"),
	
	NWS_WORLD_MONSTERS_HEADER("new_world_settings.mobs", "", ""),
	NWS_WORLD_MONSTERS_ON(
			"new_world_settings.mobs.world_monsters_on",
			"true",
			"# Do new worlds have world_monsters_on enabled by default?"),
	NWS_WILDERNESS_MONSTERS_ON(
			"new_world_settings.mobs.wilderness_monsters_on",
			"true",
			"",
			"# Do new worlds have wilderness_monsters_on enabled by default?"),
	NWS_FORCE_TOWN_MONSTERS_ON(
			"new_world_settings.mobs.force_town_monsters_on",
			"false",
			"",
			"# Do new worlds have force_town_monsters_on enabled by default?",
			"# This setting overrides a towns' setting."),

	NWS_WORLD_EXPLOSION_HEADER("new_world_settings.explosions", "", ""),
	NWS_WORLD_EXPLOSION(
			"new_world_settings.explosions.world_explosions_enabled",
			"true",
			"# Do new worlds have explosions enabled by default?"),
	NWS_FORCE_EXPLOSIONS_ON(
			"new_world_settings.explosions.force_explosions_on",
			"false",
			"",
			"# Do new worlds have force_explosions_on enabled by default.",
			"# This setting overrides a towns' setting, preventing them from turning explosions off in their town."),

	NWS_WORLD_FIRE_HEADER("new_world_settings.fire", "", ""),
	NWS_WORLD_FIRE(
			"new_world_settings.fire.world_firespread_enabled",
			"true",
			"# Do new worlds allow fire to be lit and spread by default?"),
	NWS_FORCE_FIRE_ON(
			"new_world_settings.fire.force_fire_on",
			"false",
			"",
			"# Do new worlds have force_fire_on enabled by default?",
			"# This setting overrides a towns' setting."),

	NWS_WORLD_ENDERMAN(
			"new_world_settings.enderman_protect",
			"true",
			"",
			"# Do new worlds prevent Endermen from picking up and placing blocks, by default?"),

	NWS_DISABLE_CREATURE_CROP_TRAMPLING(
			"new_world_settings.disable_creature_crop_trampling",
			"true",
			"",
			"# Do new worlds disable creatures trampling crops, by default?"),

	NWS_PLOT_MANAGEMENT_HEADER(
			"new_world_settings.plot_management",
			"",
			"",
			"# World management settings to deal with un/claiming plots"),

	NWS_PLOT_MANAGEMENT_DELETE_HEADER(
			"new_world_settings.plot_management.block_delete",
			"",
			"",
			"# This section is applied to new worlds as default settings when new worlds are detected."),
	NWS_PLOT_MANAGEMENT_DELETE_ENABLE(
			"new_world_settings.plot_management.block_delete.enabled",
			"true"),
	NWS_PLOT_MANAGEMENT_DELETE(
			"new_world_settings.plot_management.block_delete.unclaim_delete",
			"WHITE_BED,ORANGE_BED,MAGENTA_BED,LIGHT_BLUE_BED,YELLOW_BED,LIME_BED,PINK_BED,GRAY_BED,LIGHT_GRAY_BED,CYAN_BED,PURPLE_BED,BLUE_BED,BROWN_BED,GREEN_BED,RED_BED,BLACK_BED,TORCH,REDSTONE_WIRE,ACACIA_SIGN,BIRCH_SIGN,DARK_OAK_SIGN,JUNGLE_SIGN,OAK_SIGN,SPRUCE_SIGN,WOODEN_DOOR,ACACIA_WALL_SIGN,BIRCH_WALL_SIGN,DARK_OAK_WALL_SIGN,JUNGLE_WALL_SIGN,OAK_WALL_SIGN,SPRUCE_WALL_SIGN,STONE_PLATE,IRON_DOOR_BLOCK,WOOD_PLATE,REDSTONE_TORCH_OFF,REDSTONE_TORCH_ON,DIODE_BLOCK_OFF,DIODE_BLOCK_ON,CRIMSON_SIGN,WARPED_SIGN,CRIMSON_WALL_SIGN,WARPED_WALL_SIGN,CRIMSON_DOOR,WARPED_DOOR,SOUL_TORCH,SOUL_WALL_TORCH,CRIMSON_PRESSURE_PLATE,WARPED_PRESSURE_PLATE,POLISHED_BLACKSTONE_PRESSURE_PLATE",
			"",
			"# These items will be deleted upon a plot being unclaimed"),

	NWS_PLOT_MANAGEMENT_MAYOR_DELETE_HEADER(
			"new_world_settings.plot_management.mayor_plotblock_delete",
			"",
			"",
			"# This section is applied to new worlds as default settings when new worlds are detected."),
	NWS_PLOT_MANAGEMENT_MAYOR_DELETE_ENABLE(
			"new_world_settings.plot_management.mayor_plotblock_delete.enabled",
			"true"),
	NWS_PLOT_MANAGEMENT_MAYOR_DELETE(
			"new_world_settings.plot_management.mayor_plotblock_delete.mayor_plot_delete",
			"ACACIA_WALL_SIGN,BIRCH_WALL_SIGN,DARK_OAK_WALL_SIGN,JUNGLE_WALL_SIGN,OAK_WALL_SIGN,SPRUCE_WALL_SIGN,ACACIA_SIGN,BIRCH_SIGN,DARK_OAK_SIGN,JUNGLE_SIGN,OAK_SIGN,SPRUCE_SIGN,CRIMSON_WALL_SIGN,CRIMSON_SIGN,WARPED_WALL_SIGN,WARPED_SIGN",
			"",
			"# These items will be deleted upon a mayor using /plot clear",
			"# To disable deleting replace the current entries with NONE."),

	NWS_PLOT_MANAGEMENT_REVERT_HEADER(
			"new_world_settings.plot_management.revert_on_unclaim",
			"",
			"",
			"# This section is applied to new worlds as default settings when new worlds are detected."),
	NWS_PLOT_MANAGEMENT_REVERT_ENABLE(
			"new_world_settings.plot_management.revert_on_unclaim.enabled",
			"true",
			"# *** WARNING***",
			"# If this is enabled any town plots which become unclaimed will",
			"# slowly be reverted to a snapshot taken before the plot was claimed.",
			"#",
			"# Regeneration will only work if the plot was",
			"# claimed under version 0.76.2, or",
			"# later with this feature enabled",
			"# Unlike the rest of this config section, the speed setting is not",
			"# set per-world. What you set for speed will be used in all worlds.",
			"#",
			"# If you allow players to break/build in the wild the snapshot will",
			"# include any changes made before the plot was claimed."),
	NWS_PLOT_MANAGEMENT_REVERT_TIME(
			"new_world_settings.plot_management.revert_on_unclaim.speed",
			"1s"),
	NWS_PLOT_MANAGEMENT_REVERT_IGNORE(
			"new_world_settings.plot_management.revert_on_unclaim.block_ignore",
			"GOLD_ORE,LAPIS_ORE,LAPIS_BLOCK,GOLD_BLOCK,IRON_ORE,IRON_BLOCK,MOSSY_COBBLESTONE,TORCH,SPAWNER,DIAMOND_ORE,DIAMOND_BLOCK,ACACIA_SIGN,BIRCH_SIGN,DARK_OAK_SIGN,JUNGLE_SIGN,OAK_SIGN,SPRUCE_SIGN,ACACIA_WALL_SIGN,BIRCH_WALL_SIGN,DARK_OAK_WALL_SIGN,JUNGLE_WALL_SIGN,OAK_WALL_SIGN,SPRUCE_WALL_SIGN,GLOWSTONE,EMERALD_ORE,EMERALD_BLOCK,WITHER_SKELETON_SKULL,WITHER_SKELETON_WALL_SKULL,SHULKER_BOX,WHITE_SHULKER_BOX,ORANGE_SHULKER_BOX,MAGENTA_SHULKER_BOX,LIGHT_BLUE_SHULKER_BOX,LIGHT_GRAY_SHULKER_BOX,YELLOW_SHULKER_BOX,LIME_SHULKER_BOX,PINK_SHULKER_BOX,GRAY_SHULKER_BOX,CYAN_SHULKER_BOX,PURPLE_SHULKER_BOX,BLUE_SHULKER_BOX,BROWN_SHULKER_BOX,GREEN_SHULKER_BOX,RED_SHULKER_BOX,BLACK_SHULKER_BOX,BEACON,NETHER_GOLD_ORE,ANCIENT_DEBRIS,SOUL_TORCH,SOUL_WALL_TORCH,CRIMSON_SIGN,CRIMSON_WALL_SIGN,WARPED_SIGN,WARPED_WALL_SIGN,LODESTONE,RESPAWN_ANCHOR,NETHER_PORTAL,FURNACE,BLAST_FURNACE,SMOKER,BREWING_STAND,TNT,AIR,FIRE,NETHER_QUARTZ_ORE,ANCIENT_DEBRIS,NETHERITE_BLOCK,GILDED_BLACKSTONE,DEEPSLATE_IRON_ORE,DEEPSLATE_GOLD_ORE,DEEPSLATE_COAL_ORE,DEEPSLATE_REDSTONE_ORE,DEEPSLATE_DIAMOND_ORE,DEEPSLATE_EMERALD_ORE,DEEPSLATE_LAPIS_ORE,RAW_IRON_BLOCK,RAW_GOLD_BLOCK,PLAYER_HEAD,PLAYER_WALL_HEAD,SKELETON_SKULL,SKELETON_WALL_SKULL,CREEPER_HEAD,CREEPER_WALL_HEAD,ZOMBIE_HEAD,ZOMBIE_WALL_HEAD,DRAGON_HEAD,DRAGON_WALL_HEAD",
			"",
			"# These block types will NOT be regenerated by the revert-on-unclaim",
			"# or revert-explosion features."),

	NWS_PLOT_MANAGEMENT_WILD_MOB_REVERT_HEADER(
			"new_world_settings.plot_management.wild_revert_on_mob_explosion",
			"",
			"",
			"# This section is applied to new worlds as default settings when new worlds are detected."),
	NWS_PLOT_MANAGEMENT_WILD_MOB_REVERT_ENABLE(
			"new_world_settings.plot_management.wild_revert_on_mob_explosion.enabled",
			"true",
			"# Enabling this will slowly regenerate holes created in the",
			"# wilderness by monsters exploding."),
	NWS_PLOT_MANAGEMENT_WILD_ENTITY_REVERT_LIST(
			"new_world_settings.plot_management.wild_revert_on_mob_explosion.entities",			
			"CREEPER,ENDER_CRYSTAL,ENDER_DRAGON,FIREBALL,SMALL_FIREBALL,LARGE_FIREBALL,PRIMED_TNT,MINECART_TNT,WITHER,WITHER_SKULL",
			"# The list of entities whose explosions should be reverted."),
	NWS_PLOT_MANAGEMENT_WILD_MOB_REVERT_TIME(
			"new_world_settings.plot_management.wild_revert_on_mob_explosion.delay",
			"20s"),
	NWS_PLOT_MANAGEMENT_WILD_BLOCK_REVERT_HEADER(
			"new_world_settings.plot_management.wild_revert_on_block_explosion",
			"",
			"",
			"# This section is applied to new worlds as default settings when new worlds are detected."),
	NWS_PLOT_MANAGEMENT_WILD_BLOCK_REVERT_ENABLE(
			"new_world_settings.plot_management.wild_revert_on_block_explosion.enabled",
			"true",
			"# Enabling this will slowly regenerate holes created in the",
			"# wilderness by exploding blocks like beds."),
	NWS_PLOT_MANAGEMENT_WILD_BLOCK_REVERT_LIST(
			"new_world_settings.plot_management.wild_revert_on_block_explosion.blocks",
			"WHITE_BED,ORANGE_BED,MAGENTA_BED,LIGHT_BLUE_BED,YELLOW_BED,LIME_BED,PINK_BED,GRAY_BED,LIGHT_GRAY_BED,CYAN_BED,PURPLE_BED,BLUE_BED,BROWN_BED,GREEN_BED,RED_BED,BLACK_BED,RESPAWN_ANCHOR",
			"# The list of blocks whose explosions should be reverted."),
	NWS_PLOT_MANAGEMENT_WILD_REVERT_BLOCK_WHITELIST(
		"new_world_settings.plot_management.wild_revert_on_explosion_block_whitelist",
		"",
		"# The list of blocks to regenerate. (if empty all blocks will regenerate)"),
		

	GTOWN_SETTINGS(
			"global_town_settings",
			"",
			"",
			"",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |                Global town settings                  | #",
			"# +------------------------------------------------------+ #",
			"############################################################",
			""),
	GTOWN_SETTINGS_HEALTH_REGEN(
			"global_town_settings.health_regen",
			"",
			"",
			"# Players within their town or allied towns will regenerate half a heart after every health_regen_speed seconds."),
	GTOWN_SETTINGS_REGEN_SPEED("global_town_settings.health_regen.speed", "3s"),
	GTOWN_SETTINGS_REGEN_ENABLE(
			"global_town_settings.health_regen.enable",
			"true"),
	GTOWN_SETTINGS_ALLOW_OUTPOSTS(
			"global_town_settings.allow_outposts",
			"true",
			"",
			"# Allow towns to claim outposts (a townblock not connected to town)."),
	GTOWN_SETTINGS_LIMIT_OUTPOST_USING_LEVELS(
			"global_town_settings.limit_outposts_using_town_and_nation_levels",
			"false",
			"",
			"# When set to true outposts can be limited by the townOutpostLimit value of the Town Levels and",
			"# the nationBonusOutpostLimit value in the Nation Levels. In this way nations can be made to be",
			"# the only way of receiving outposts, or as an incentive to receive more outposts. Towns which are",
			"# larger can have more outposts.",
			"# When activated, this setting will not cause towns who already have higher than their limit",
			"# to lose outposts. They will not be able to start new outposts until they have unclaimed outposts",
			"# to become under their limit. Likewise, towns that join a nation and receive bonus outposts will",
			"# be over their limit if they leave the nation."),
	GTOWN_SETTINGS_OVER_OUTPOST_LIMIT_STOP_TELEPORT(
			"global_town_settings.over_outpost_limits_stops_teleports",
			"false",
			"",
			"# When limit_outposts_using_town_and_nation_levels is also true, towns which are over their outpost",
			"# limit will not be able to use their /town outpost teleports for the outpost #'s higher than their limit,",
			"# until they have dropped below their limit.",
			"# eg: If their limit is 3 then they cannot use /t outpost 4"),
	GTOWN_SETTINGS_ALLOW_TOWN_SPAWN(
			"global_town_settings.allow_town_spawn",
			"true",
			"",
			"# Allow the use of /town spawn",
			"# Valid values are: true, false, war, peace",
			"# When war or peace is set, it is only possible to teleport to the town,",
			"# when there is a war or peace."),
	GTOWN_SETTINGS_ALLOW_TOWN_SPAWN_TRAVEL(
			"global_town_settings.allow_town_spawn_travel",
			"true",
			"",
			"# Allow regular residents to use /town spawn [town] (TP to other towns if they are public).",
			"# Valid values are: true, false, war, peace",
			"# When war or peace is set, it is only possible to teleport to the town,",
			"# when there is a war or peace."),
	GTOWN_SETTINGS_ALLOW_TOWN_SPAWN_TRAVEL_NATION(
			"global_town_settings.allow_town_spawn_travel_nation",
			"true",
			"",
			"# Allow regular residents to use /town spawn [town] to other towns in your nation.",
			"# Valid values are: true, false, war, peace",
			"# When war or peace is set, it is only possible to teleport to the town,",
			"# when there is a war or peace."),
	GTOWN_SETTINGS_ALLOW_TOWN_SPAWN_TRAVEL_ALLY(
			"global_town_settings.allow_town_spawn_travel_ally",
			"true",
			"",
			"# Allow regular residents to use /town spawn [town] to other towns in a nation allied with your nation.",
			"# Valid values are: true, false, war, peace",
			"# When war or peace is set, it is only possible to teleport to the town,",
			"# when there is a war or peace."),
	GTOWN_SETTINGS_IS_ALLY_SPAWNING_REQUIRING_PUBLIC_STATUS(
			"global_town_settings.is_nation_ally_spawning_requiring_public_status",
			"false",
			"",
			"# When set to true both nation and ally spawn travel will also require the target town to have their status set to public."),
	GTOWN_SETTINGS_SPAWN_TIMER(
			"global_town_settings.teleport_warmup_time",
			"0",
			"",
			"# If non zero it delays any spawn request by x seconds."),
	GTOWN_SETTINGS_MOVEMENT_CANCELS_SPAWN_WARMUP(
			"global_town_settings.movement_cancels_spawn_warmup",
			"false",
			"",
			"# When set to true, if players are currently in a spawn warmup, moving will cancel their spawn."),
	GTOWN_SETTINGS_DAMAGE_CANCELS_SPAWN_WARMUP(
			"global_town_settings.damage_cancels_spawn_warmup",
			"false",
			"",
			"# When set to true, if players are damaged in any way while in a spawn warmup, their spawning will be cancelled."),
	GTOWN_SETTINGS_SPAWN_COOLDOWN_TIMER(
			"global_town_settings.spawn_cooldown_time",
			"30",
			"",
			"# Number of seconds that must pass before a player can use /t spawn or /res spawn."),
	GTOWN_SETTINGS_SPAWN_WARNINGS(
			"global_town_settings.spawn_warnings",
			"true",
			"",
			"# Decides whether confirmations should appear if you spawn to an area with an associated cost."),
	GTOWN_SETTINGS_PVP_COOLDOWN_TIMER(
			"global_town_settings.pvp_cooldown_time",
			"30",
			"",
			"# Number of seconds that must pass before pvp can be toggled by a town.",
			"# Applies to residents of the town using /res toggle pvp, as well as",
			"# plots having their PVP toggled using /plot toggle pvp."),
	GTOWN_SETTINGS_NEUTRAL_COOLDOWN_TIMER(
			"global_town_settings.peaceful_cooldown_time",
			"30",
			"",
			"# Number of seconds that must pass before peacfulness can be toggled by a town or nation."),

	GTOWN_SETTINGS_TOWN_RESPAWN(
			"global_town_settings.town_respawn",
			"false",
			"",
			"# When true Towny will handle respawning, with town or resident spawns."),
	GTOWN_SETTINGS_RESPAWN_PROTECTION_ROOT("global_town_settings.respawn_protection", "", ""),
	GTOWN_SETTINGS_RESPAWN_PROTECTION_TIME(
			"global_town_settings.respawn_protection.time",
			"10s",
			"",
			"# When greater than 0s, the amount of time a player who has respawned is considered invulnerable.",
			"# Invulnerable players who attack other players will lose their invulnerability.",
			"# Invulnerable players who teleport after respawn will also lose their invulnerability."),
	GTOWN_SETTINGS_RESPAWN_PROTECTION_ALLOW_PICKUP(
			"global_town_settings.respawn_protection.allow_pickup",
			"true",
			"",
			"# If disabled, players will not be able to pickup items while under respawn protection."),
	GTOWN_SETTINGS_TOWN_RESPAWN_SAME_WORLD_ONLY(
			"global_town_settings.town_respawn_same_world_only",
			"false",
			"",
			"# Town respawn only happens when the player dies in the same world as the town's spawn point."),
	GTOWN_SETTINGS_PREVENT_TOWN_SPAWN_IN(
			"global_town_settings.prevent_town_spawn_in",
			"enemy,outlaw",
			"",
			"# Prevent players from using /town spawn while within unclaimed areas and/or enemy/neutral towns.",
			"# Allowed options: unclaimed,enemy,neutral,outlaw"),
	GTOWN_RESPAWN_ANCHOR_HIGHER_PRECEDENCE(
			"global_town_settings.respawn_anchor_higher_precendence",
			"true",
			"",
			"# When this is true, players will respawn to respawn anchors on death rather than their own town. 1.16+ only."),
	GTOWN_HOMEBLOCK_MOVEMENT_COOLDOWN(
			"global_town_settings.homeblock_movement_cooldown_hours",
			"0",
			"",
			"# When set above 0, the amount of hours a town must wait after setting their homeblock, in order to move it again."),
	GTOWN_HOMEBLOCK_MOVEMENT_DISTANCE(
			"global_town_settings.homeblock_movement_distance_limit",
			"0",
			"",
			"# When set above 0, the furthest number of townblocks a homeblock can be moved by.",
			"# Example: setting it to 3 would mean the player can only move their homeblock over by 3 townblocks at a time.",
			"# Useful when used with the above homeblock_movement_cooldown_hours setting."),
	GTOWN_SETTINGS_SHOW_TOWN_NOTIFICATIONS(
			"global_town_settings.show_town_notifications",
			"true",
			"",
			"# Enables the [~Home] message.",
			"# If false it will make it harder for enemies to find the home block during a war"),
	GTOWN_SETTINGS_ALLOW_OUTLAWS_TO_ENTER_TOWN(
			"global_town_settings.allow_outlaws_to_enter_town",
			"true",
			"",
			"# Can outlaws roam freely on the towns they are outlawed in?",
			"# If false, outlaws will be teleported away if they spend too long in the towns they are outlawed in.",
			"# The time is set below in the outlaw_teleport_warmup."),
	GTOWN_SETTINGS_ALLOW_OUTLAWS_TO_TELEPORT_OUT_OF_TOWN(
			"global_town_settings.allow_outlaws_to_teleport_out_of_town",
			"true",
			"",
			"# Can outlaws freely teleport out of the towns they are outlawed in?",
			"# If false, outlaws cannot use commands to teleport out of town.",
			"# If you want outlaws to not be able to use teleporting items as well, use allow_outlaws_use_teleport_items."),
	GTOWN_SETTINGS_ALLOW_OUTLAWS_USE_TELEPORT_ITEMS(
			"global_town_settings.allow_outlaws_use_teleport_items",
			"true",
			"",
			"# If false, outlawed players in towns cannot use items that teleport the player, ie: Ender Pearls & Chorus Fruit.",
			"# Setting this to false requires allow_outlaws_to_teleport_out_of_town to also be false."),
	GTOWN_SETTINGS_WARN_TOWN_ON_OUTLAW(
			"global_town_settings.warn_town_on_outlaw",
			"false",
			"",
			"# Should towns be warned in case an outlaw roams the town?",
			"# Warning: Outlaws can use this feature to spam residents with warnings!",
			"# It is recommended to set this to true only if you're using outlaw teleporting with a warmup of 0 seconds."),
	GTOWN_SETTING_WARN_TOWN_ON_OUTLAW_MESSAGE_COOLDOWN_TIME(
			"global_town_settings.warn_town_on_outlaw_message_cooldown_in_seconds",
			"30",
			"",
			"# How many seconds in between warning messages, to prevent spam."),
	GTOWN_SETTINGS_OUTLAW_TELEPORT_ON_BECOMING_OUTLAWED(
			"global_town_settings.outlaw_teleport_away_on_becoming_outlawed",
			"false",
			"",
			"# If set to true, when a player is made into an outlaw using /t outlaw add NAME, and that new",
			"# outlaw is within the town's borders, the new outlaw will be teleported away using the outlaw_teleport_warmup."),
	GTOWN_SETTINGS_OUTLAW_TELEPORT_WARMUP(
			"global_town_settings.outlaw_teleport_warmup",
			"5",
			"",
			"# How many seconds are required for outlaws to be teleported away?",
			"# You can set this to 0 to instantly teleport the outlaw from town.",
			"# This will not have any effect if allow_outlaws_to_enter_town is enabled."),
	GTOWN_SETTINGS_OUTLAW_TELEPORT_WORLD(
			"global_town_settings.outlaw_teleport_world",
			"",
			"",
			"# What world do you want the outlaw teleported to if they aren't part of a town",
			"# and don't have a bedspawn outside of the town they are outlawed in.",
			"# They will go to the listed world's spawn. ", 
			"# If blank, they will go to the spawnpoint of the world the town is in."),
	GTOWN_SETTINGS_OUTLAW_BLACKLISTED_COMMANDS(
			"global_town_settings.outlaw_blacklisted_commands",
			"somecommandhere,othercommandhere",
			"",
			"# Commands an outlawed player cannot use while in the town they are outlawed in."),
	GTOWN_SETTINGS_MAX_NUMBER_RESIDENTS_WITHOUT_NATION(
			"global_town_settings.maximum_number_residents_without_nation",
			"0",
			"",
			"# When set above zero this is the largest number of residents a town can support before they join/create a nation.",
			"# Do not set this value to an amount less than the required_number_residents_join_nation below.",
			"# Do not set this value to an amount less than the required_number_residents_create_nation below."),
	GTOWN_SETTINGS_REQUIRED_NUMBER_RESIDENTS_JOIN_NATION(
			"global_town_settings.required_number_residents_join_nation",
			"0",
			"",
			"# The required number of residents in a town to join a nation",
			"# If the number is 0, towns will not require a certain amount of residents to join a nation"
	),
	GTOWN_SETTINGS_REQUIRED_NUMBER_RESIDENTS_CREATE_NATION(
			"global_town_settings.required_number_residents_create_nation",
			"0",
			"",
			"# The required number of residents in a town to create a nation",
			"# If the number is 0, towns will not require a certain amount of residents to create a nation"
	),
	GTOWN_SETTINGS_REFUND_DISBAND_LOW_RESIDENTS(
			"global_town_settings.refund_disband_low_residents",
			"true",
			"",
			"# If set to true, if a nation is disbanded due to a lack of residents, the capital will be refunded the cost of nation creation."
	),
	GTOWN_SETTINGS_NATION_REQUIRES_PROXIMITY(
			"global_town_settings.nation_requires_proximity",
			"0.0",
			"",
			"# The maximum number of townblocks a town can be away from a nation capital,",
			"# Automatically precludes towns from one world joining a nation in another world.",
			"# If the number is 0, towns will not a proximity to a nation."
	),
	GTOWN_FARM_ANIMALS(
			"global_town_settings.farm_animals",
			"PIG,COW,CHICKEN,SHEEP,MOOSHROOM",
			"",
			"# List of animals which can be killed on farm plots by town residents."
	),
	GTOWN_MAX_RESIDENTS_PER_TOWN(
			"global_town_settings.max_residents_per_town",
			"0",
			"",
			"# The maximum number of residents that can be joined to a town. Setting to 0 disables this feature."
	),
	GTOWN_MAX_RESIDENTS_CAPITAL_OVERRIDE(
			"global_town_settings.max_residents_capital_override",
			"0",
			"",
			"# The maximum number of residents that can be joined to a capital city.", 
			"# Requires max_residents_capital_override to be above 0.",
			"# Uses the greater of max_residents_capital_override and max_residents_per_town."
	),
	GTOWN_SETTINGS_DISPLAY_TOWNBOARD_ONLOGIN(
			"global_town_settings.display_board_onlogin",
			"true",
			"",
			"# If Towny should show players the townboard when they login"
	),
	GTOWN_SETTINGS_OUTSIDERS_PREVENT_PVP_TOGGLE(
			"global_town_settings.outsiders_prevent_pvp_toggle",
			"false",
			"",
			"# If set to true, Towny will prevent a town or plot from enabling PVP while an outsider is within the town's or plot's boundaries.",
			"# When active this feature can cause a bit of lag when the /t toggle pvp command is used, depending on how many players are online."
	),
	GTOWN_SETTINGS_HOMEBLOCKS_PREVENT_FORCEPVP(
			"global_town_settings.homeblocks_prevent_forcepvp",
			"false",
			"",
			"# If set to true, when a world has forcepvp set to true, homeblocks of towns will not be affected and have PVP set to off.",
			"# Does not have any effect when Event War is active."),
	GTOWN_SETTINGS_MINIMUM_AMOUNT_RESIDENTS_FOR_OUTPOSTS(
			"global_town_settings.minimum_amount_of_residents_in_town_for_outpost",
			"0",
			"",
			"# The amount of residents a town needs to claim an outpost,",
			"# Setting this value to 0, means a town can claim outposts no matter how many residents"
	),
	GTOWN_SETTINGS_KEEP_INVENTORY_ON_DEATH_IN_TOWN(
			"global_town_settings.keep_inventory_on_death_in_town",
			"false",
			"",
			"# If People should keep their inventories on death in a town.",
			"# Is not guaranteed to work with other keep inventory plugins!"
	),
	GTOWN_SETTINGS_KEEP_INVENTORY_ON_DEATH_IN_OWN_TOWN(
			"global_town_settings.keep_inventory_on_death_in_own_town",
			"false",
			"",
			"# If People should keep their inventories on death in their own town.",
			"# Is not guaranteed to work with other keep inventory plugins!"
	),
	GTOWN_SETTINGS_KEEP_INVENTORY_ON_DEATH_IN_ALLIED_TOWN(
			"global_town_settings.keep_inventory_on_death_in_allied_town",
			"false",
			"",
			"# If People should keep their inventories on death in an allied town.",
			"# Is not guaranteed to work with other keep inventory plugins!"
	),
	GTOWN_SETTINGS_KEEP_INVENTORY_ON_DEATH_IN_ARENA(
		"global_town_settings.keep_inventory_on_death_in_arena",
		"false",
		"",
		"# If People should keep their inventories on death in an arena townblock.",
		"# Is not guaranteed to work with other keep inventory plugins!"
	),
	GTOWN_SETTINGS_KEEP_EXPERIENCE_ON_DEATH_IN_TOWN(
			"global_town_settings.keep_experience_on_death_in_town",
			"false",
			"",
			"# If People should keep their experience on death in a town.",
			"# Is not guaranteed to work with other keep experience plugins!"
	),
	GTOWN_SETTINGS_KEEP_EXPERIENCE_ON_DEATH_IN_ARENA(
			"global_town_settings.keep_experience_on_death_in_arena",
			"false",
			"",
			"# If People should keep their experience on death in an arena townblock.",
			"# Is not guaranteed to work with other keep experience plugins!"
	),
	GTOWN_MAX_PLOT_PRICE_COST(
			"global_town_settings.maximum_plot_price_cost",
			"1000000.0",
			"",
			"# Maximum amount that a town can set their plot, embassy, shop, etc plots' prices to.",
			"# Setting this higher can be dangerous if you use Towny in a mysql database. Large numbers can become shortened to scientific notation. "
	),
	GTOWN_SETTINGS_DISPLAY_XYZ_INSTEAD_OF_TOWNY_COORDS(
			"global_town_settings.display_xyz_instead_of_towny_coords",
			"false",
			"",
			"# If set to true, the /town screen will display the xyz coordinate for a town's spawn rather than the homeblock's Towny coords."
	),
	GTOWN_SETTINGS_DISPLAY_TOWN_LIST_RANDOMLY(
			"global_town_settings.display_town_list_randomly",
			"false",
			"",
			"# If set to true the /town list command will list randomly, rather than by whichever comparator is used, hiding resident counts."
	),
	GTOWN_ORDER_OF_MAYORAL_SUCCESSION(
			"global_town_settings.order_of_mayoral_succession",
			"assistant",
			"",
			"# The ranks to be given preference when assigning a new mayor, listed in order of descending preference.",
			"# All ranks should be as defined in `townyperms.yml`.",
			"# For example, to give a `visemayor` preference over an `assistant`, change this parameter to `visemayor,assistant`."
	),
	GTOWN_SETTINGS_PREVENT_FLUID_GRIEFING(
			"global_town_settings.prevent_fluid_griefing",
			"true",
			"",
			"# When enabled, blocks like lava or water will be unable to flow into other plots, if the owners aren't the same."
	),
	
	GTOWN_SETTINGS_COMMAND_BLACKLISTING(
			"global_town_settings.town_command_blacklisting",
			"",
			"",
			"# Allows blocking commands inside towns and limiting them to plots owned by the players only.",
			"# Useful for limiting sethome/home commands to plots owned by the players themselves and not someone else.",
			"# Admins and players with the towny.admin.town_commands.blacklist_bypass permission node will not be hindered."
	),
	GTOWN_SETTINGS_ENABLE_COMMAND_BLACKLISTING(
			"global_town_settings.town_command_blacklisting.enabled",
			"false",
			"",
			"# Allows blocking commands inside towns through the town_blacklisted_commands setting.",
			"# This boolean allows you to disable this feature altogether if you don't need it"
	),
	
	GTOWN_TOWN_BLACKLISTED_COMMANDS(
			"global_town_settings.town_command_blacklisting.town_blacklisted_commands",
			"somecommandhere,othercommandhere",
			"",
			"# Comma separated list of commands which cannot be run inside of any town."
	),

	GTOWN_TOWN_LIMITED_COMMANDS(
			"global_town_settings.town_command_blacklisting.player_owned_plot_limited_commands",
			"sethome,home",
			"",
			"# This allows the usage of blacklisted commands only in plots personally-owned by the player.",
			"# Players with the towny.claimed.townowned.* permission node will be able to run these commands",
			"# inside of town-owned land. This would include mayors, assistants and possibly a builder rank.",
			"# Players with the towny.claimed.owntown.* permission node (given to mayors/assistants usually,)",
			"# will also not be limited by this command blacklist."
	),
	
	GTOWN_TOWN_TOURIST_BLOCKED_COMMANDS(
			"global_town_settings.town_command_blacklisting.own_town_and_wilderness_limited_commands",
			"sethome,home",
			"",
			"# This allows the usage of blacklisted commands only in the player's town ",
			"# and the wilderness (essentially blocking commands from being ran by tourists/visitors)",
			"# Players with the towny.globally_welcome permission node are not going to be limited by this list.",
			"# Commands have to be on town_command_blacklisting.town_blacklisted_commands, else this is not going to be checked."
	),
	
	GTOWN_SETTINGS_AUTOMATIC_CAPITALISATION(
			"global_town_settings.automatic_capitalisation",
			"false",
			"",
			"# When enabled, town (and nation) names will automatically be capitalised upon creation."
	),
	
	GTOWN_SETTINGS_ALLOWED_TOWN_COLORS(
			"global_town_settings.allowed_map_colors",
			"aqua:00ffff, azure:f0ffff, beige:f5f5dc, black:000000, blue:0000ff, brown:a52a2a, cyan:00ffff, darkblue:00008b, darkcyan:008b8b, darkgrey:a9a9a9, darkgreen:006400, darkkhaki:bdb76b, darkmagenta:8b008b, darkolivegreen:556b2f, darkorange:ff8c00, darkorchid:9932cc, darkred:8b0000, darksalmon:e9967a, darkviolet:9400d3, fuchsia:ff00ff, gold:ffd700, green:008000, indigo:4b0082, khaki:f0e68c, lightblue:add8e6, lightcyan:e0ffff, lightgreen:90ee90, lightgrey:d3d3d3, lightpink:ffb6c1, lightyellow:ffffe0, lime:00ff00, magenta:ff00ff, maroon:800000, navy:000080, olive:808000, orange:ffa500, pink:ffc0cb, purple:800080, violet:800080, red:ff0000, silver:c0c0c0, white:ffffff, yellow:ffff00",

			"",
			"# This setting determines the list of allowed town map colors.",
			"# The color codes are in hex format."
	),
	
	GNATION_SETTINGS(
			"global_nation_settings",
			"",
			"",
			"",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |              Global nation settings                  | #",
			"# +------------------------------------------------------+ #",
			"############################################################",
			""),
	GNATION_SETTINGS_NATIONZONE(
			"global_nation_settings.nationzone",
			"",
			"",
			"# Nation Zones are a special type of wilderness surrounding Capitals of Nations or Nation Capitals and their Towns.",
			"# When it is enabled players who are members of the nation can use the wilderness surrounding the town like normal.",
			"# Players who are not part of that nation will find themselves unable to break/build/switch/itemuse in this part of the wilderness.",
			"# The amount of townblocks used for the zone is determined by the size of the nation and configured in the nation levels.",
			"# Because these zones are still wilderness anyone can claim these townblocks.",
			"# It is recommended that whatever size you choose, these numbers should be less than the min_plot_distance_from_town_plot otherwise",
			"# someone might not be able to build/destroy in the wilderness outside their town."),
	GNATION_SETTINGS_NATIONZONE_ENABLE(
			"global_nation_settings.nationzone.enable",
			"false",
			"",
			"# Nation zone feature is disabled by default. This is because it can cause a higher server load for servers with a large player count."),
	GNATION_SETTINGS_NATIONZONE_ONLY_CAPITALS(
			"global_nation_settings.nationzone.only_capitals",
			"true",
			"",
			"# When set to true, only the capital town of a nation will be surrounded by a nation zone type of wilderness."),
	GNATION_SETTINGS_NATIONZONE_CAPITAL_BONUS_SIZE(
			"global_nation_settings.nationzone.capital_bonus_size",
			"0",
			"",
			"# Amount of buffer added to nation zone width surrounding capitals only. Creates a larger buffer around nation capitals."),
	GNATION_SETTINGS_NATIONZONE_WAR_DISABLES(
			"global_nation_settings.nationzone.war_disables",
			"true",
			"",
			"# When set to true, nation zones are disabled during the the Towny war types."),
	GNATION_SETTINGS_NATIONZONE_SHOW_NOTIFICATIONS(
			"global_nation_settings.nationzone.show_notifications",
			"false",
			"",
			"# When set to true, players will receive a notification when they enter into a nationzone.",
			"# Set to false by default because, like the nationzone feature, it will generate more load on servers."),
	GNATION_SETTINGS_DISPLAY_NATIONBOARD_ONLOGIN(
			"global_nation_settings.display_board_onlogin",
			"true",
			"",
			"# If Towny should show players the nationboard when they login."),
	GNATION_SETTINGS_CAPITAL_CANNOT_BE_NEUTRAL(
			"global_nation_settings.capitals_cannot_be_neutral",
			"false",
			"",
			"# If true the capital city of nation cannot be neutral/peaceful."),
	GNATION_SETTINGS_CAPITAL_SPAWN(
			"global_nation_settings.capital_spawn",
			"true",
			"",
			"# If enabled, only allow the nation spawn to be set in the capital city."),
    GNATION_SETTINGS_ALLOW_NATION_SPAWN(
			"global_nation_settings.allow_nation_spawn",
			"true",
			"",
			"# Allow the use of /nation spawn",
			"# Valid values are: true, false, war, peace",
			"# When war or peace is set, it is only possible to teleport to the nation,",
			"# when there is a war or peace."),
	GNATION_SETTINGS_ALLOW_NATION_SPAWN_TRAVEL(
			"global_nation_settings.allow_nation_spawn_travel",
			"true",
			"",
			"# Allow regular residents to use /nation spawn [nation] (TP to other nations if they are public).",
			"# Valid values are: true, false, war, peace",
			"# When war or peace is set, it is only possible to teleport to the nation,",
			"# when there is a war or peace."),
	GNATION_SETTINGS_ALLOW_NATION_SPAWN_TRAVEL_ALLY(
			"global_nation_settings.allow_nation_spawn_travel_ally",
			"true",
			"",
			"# Allow regular residents to use /nation spawn [nation] to other nations allied with your nation.",
			"# Valid values are: true, false, war, peace",
			"# When war or peace is set, it is only possible to teleport to the nations,",
			"# when there is a war or peace."),
	GNATION_SETTINGS_MAX_TOWNS_PER_NATION(
			"global_nation_settings.max_towns_per_nation",
			"0",
			"",
			"# If higher than 0, it will limit how many towns can be joined into a nation.",
			"# Does not affect existing nations that are already over the limit."),
	GNATION_SETTINGS_ALLOWED_NATION_COLORS(
			"global_nation_settings.allowed_map_colors",
			"aqua:00ffff, azure:f0ffff, beige:f5f5dc, black:000000, blue:0000ff, brown:a52a2a, cyan:00ffff, darkblue:00008b, darkcyan:008b8b, darkgrey:a9a9a9, darkgreen:006400, darkkhaki:bdb76b, darkmagenta:8b008b, darkolivegreen:556b2f, darkorange:ff8c00, darkorchid:9932cc, darkred:8b0000, darksalmon:e9967a, darkviolet:9400d3, fuchsia:ff00ff, gold:ffd700, green:008000, indigo:4b0082, khaki:f0e68c, lightblue:add8e6, lightcyan:e0ffff, lightgreen:90ee90, lightgrey:d3d3d3, lightpink:ffb6c1, lightyellow:ffffe0, lime:00ff00, magenta:ff00ff, maroon:800000, navy:000080, olive:808000, orange:ffa500, pink:ffc0cb, purple:800080, violet:800080, red:ff0000, silver:c0c0c0, white:ffffff, yellow:ffff00",

			"",
			"# This setting determines the list of allowed nation map colors.",
			"# The color codes are in hex format."),
	GNATION_SETTINGS_MAX_ALLIES(
			"global_nation_settings.max_allies",
			"-1",
			"",
			"# The maximum amount of allies that a nation can have, set to -1 to have no limit."),

	PLUGIN(
			"plugin",
			"",
			"",
			"",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |                 Plugin interfacing                   | #",
			"# +------------------------------------------------------+ #",
			"############################################################",
			""),
	PLUGIN_DATABASE(
			"plugin.database",
			"",
			"# See database.yml file for flatfile/mysql settings."),
	PLUGIN_DAILY_BACKUPS_HEADER(
			"plugin.database.daily_backups",
			"",
			"",
			"# Flatfile backup settings."),
	PLUGIN_DAILY_BACKUPS("plugin.database.daily_backups", "true"),
	PLUGIN_BACKUPS_ARE_DELETED_AFTER(
			"plugin.database.backups_are_deleted_after",
			"90d"),
	PLUGIN_FLATFILE_BACKUP(
			"plugin.database.flatfile_backup_type",
			"tar",
			"",
			"# Valid entries are: tar, tar.gz, zip, or none for no backup."),

	PLUGIN_INTERFACING("plugin.interfacing", "", ""),
	PLUGIN_MODS(
			"plugin.interfacing.tekkit", "", ""),
	PLUGIN_MODS_FAKE_RESIDENTS(
			"plugin.interfacing.tekkit.fake_residents",
			"[IndustrialCraft],[BuildCraft],[Redpower],[Forestry],[Turtle]",
			"# Add any fake players for client/server mods (aka Tekkit) here"),
	PLUGIN_USING_ESSENTIALS(
			"plugin.interfacing.using_essentials",
			"false",
			"",
			"# Enable using_essentials if you are using cooldowns in essentials for teleports."),
	PLUGIN_USING_ECONOMY(
			"plugin.interfacing.using_economy",
			"true",
			"",
			"# This enables/disables all the economy functions of Towny.",
			"# This will first attempt to use Vault or Reserve to bridge your economy plugin with Towny.",
			"# If Reserve/Vault is not present it will attempt to find a supported economy plugin.",
			"# If neither Vault/Reserve or supported economy are present it will not be possible to create towns or do any operations that require money."),
	
	PLUGIN_LUCKPERMS_ROOT("plugin.interfacing.luckperms","",""),
	PLUGIN_LUCKPERMS_CONTEXTS(
			"plugin.interfacing.luckperms.contexts",
			"false",
			"",
			"# If enabled, Towny contexts will be available in LuckPerms. https://luckperms.net/wiki/Context",
			"# Towny will supply for LuckPerms: townyperms' ranks contexts, as well as location-based contexts."),
	
	PLUGIN_ENABLED_CONTEXTS(
			"plugin.interfacing.luckperms.enabled_contexts",
			"*",
			"",
			"# Configure what contexts to enable/disable here, contexts must be separated by a comma.",
			"# Available contexts: towny:resident, towny:mayor, towny:king, towny:insidetown, towny:insideowntown, towny:insideownplot, towny:townrank",
			"# towny:nationrank, towny:town, towny:nation"
	),
	
	PLUGIN_WEB_MAP_ROOT("plugin.interfacing.web_map","",""),
	PLUGIN_WEB_MAP_USING_STATUSSCREEN(
			"plugin.interfacing.web_map.enabled",
			"false",
			"",
			"# If enabled, players will be prompted to open a url when clicking on coordinates in towny status screens."
	),
	
	PLUGIN_WEB_MAP_URL(
			"plugin.interfacing.web_map.url",
			"https://example.com/map/?worldname={world}&mapname=flat&zoom=5&x={x}&y=64&z={z}",
			"",
			"# The url that players will be prompted to open when clicking on a coordinate in a status screen.",
			"# Valid placeholders are {world}, {x}, and {y}, for the world name, x, and y coordinates respectively."
	),

	PLUGIN_DAY_HEADER("plugin.day_timer", "", ""),
	PLUGIN_DAY_INTERVAL(
			"plugin.day_timer.day_interval",
			"1d",
			"",
			"# The time for each \"towny day\", used for tax and upkeep collection and other daily timers.",
			"# Default is 24 hours. Cannot be set for greater than 1 day, but can be set lower."),
	PLUGIN_NEWDAY_TIME(
			"plugin.day_timer.new_day_time",
			"12h",
			"",
			"# The time each \"day\", when taxes will be collected.",
			"# Only used when less than day_interval. Default is 12h (midday).",
			"# If day_interval is set to something like 20m, the new_day_time is not used, day_interval will be used instead."),
	PLUGIN_NEWDAY_DELETE_0_PLOT_TOWNS(
			"plugin.day_timer.delete_0_plot_towns",
			"false",
			"",
			"# Whether towns with no claimed townblocks should be deleted when the new day is run."),

	PLUGIN_HOUR_INTERVAL(
			"plugin.hour_timer.hour_interval",
			"60m",
			"# The number of minutes in each \"day\".",
			"# Default is 60m."),
	PLUGIN_NEWHOUR_TIME(
			"plugin.hour_timer.new_hour_time",
			"30m",
			"# The time each \"hour\", when the hourly timer ticks.",
			"# MUST be less than hour_interval. Default is 30m."),
	PLUGIN_SHORT_INTERVAL(
			"plugin.hour_timer.short_interval",
			"20s",
			"# The interval of each \"short\" timer tick",
			"# Default is 20s."),
	PLUGIN_DEBUG_MODE(
			"plugin.debug_mode",
			"false",
			"",
			"# Lots of messages to tell you what's going on in the server with time taken for events."),
	PLUGIN_INFO_TOOL(
			"plugin.info_tool",
			"BRICK",
			"",
			"# Info tool for server admins to use to query in game blocks and entities."),
	PLUGIN_DEV_MODE(
			"plugin.dev_mode",
			"",
			"",
			"# Spams the player named in dev_name with all messages related to towny."),
	PLUGIN_DEV_MODE_ENABLE("plugin.dev_mode.enable", "false"),
	PLUGIN_DEV_MODE_DEV_NAME("plugin.dev_mode.dev_name", "ElgarL"),
	PLUGIN_RESET_LOG_ON_BOOT(
			"plugin.reset_log_on_boot",
			"true",
			"",
			"# If true this will cause the log to be wiped at every startup."),
	PLUGIN_TOWNY_TOP_SIZE(
		"plugin.towny_top_size",
		"10",
		"",
		"# Sets the default size that /towny top commands display."
	),
	PLUGIN_VISUALIZED_SPAWN_POINTS_ENABLED(
		"plugin.visualized_spawn_points_enabled",
		"true",
		"",
		"# If enabled, particles will appear around town, nation, outpost & jail spawns."
	),
	PLUGIN_NAME_BLACKLIST(
		"plugin.name_blacklist",
		"",
		"",
		"# A blacklist used for validating town/nation names.",
		"# Names must be seperated by a comma: name1,name2"
	),
	PLUGIN_UPDATE_NOTIFICATIONS_ROOT(
			"plugin.update_notifications", "", ""),
	PLUGIN_UPDATE_NOTIFICATIONS_ALERTS(
		"plugin.update_notifications.alerts",
		"true",
		"",
		"# If enabled, players with the towny.admin.updatealerts permission will receive an update notification upon logging in."),
	PLUGIN_UPDATE_NOTIFICATIONS_MAJOR_ONLY(
		"plugin.update_notifications.major_only",
		"true",
		"",
		"# If enabled, only full releases will trigger notifications if you are running a full release.",
		"# This is ignored if the server is currently using a pre-release version."),
	FILTERS_COLOUR_CHAT(
			"filters_colour_chat",
			"",
			"",
			"",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |               Filters colour and chat                | #",
			"# +------------------------------------------------------+ #",
			"############################################################",
			""),
	FILTERS_NPC_PREFIX(
			"filters_colour_chat.npc_prefix",
			"NPC",
			"",
			"# This is the name given to any NPC assigned mayor."),
	FILTERS_REGEX(
			"filters_colour_chat.regex",
			"",
			"",
			"# Regex fields used in validating inputs."),
	FILTERS_REGEX_NAME_FILTER_REGEX(
			"filters_colour_chat.regex.name_filter_regex",
			"[\\\\\\/]"),
	FILTERS_REGEX_NAME_CHECK_REGEX(
			"filters_colour_chat.regex.name_check_regex",
			"^[\\p{L}a-zA-Z0-9._\\[\\]-]*$"),
	FILTERS_REGEX_STRING_CHECK_REGEX(
			"filters_colour_chat.regex.string_check_regex",
			"^[a-zA-Z0-9 \\s._\\[\\]\\#\\?\\!\\@\\$\\%\\^\\&\\*\\-\\,\\*\\(\\)\\{\\}]*$"),
	FILTERS_REGEX_NAME_REMOVE_REGEX(
			"filters_colour_chat.regex.name_remove_regex",
			"[^\\P{M}a-zA-Z0-9\\&._\\[\\]-]"),
	FILTERS_MODIFY_CHAT("filters_colour_chat.modify_chat", "", ""),
	FILTERS_MAX_NAME_LGTH(
			"filters_colour_chat.modify_chat.max_name_length",
			"20",
			"",
			"# Maximum length of Town and Nation names."),
	FILTERS_MAX_TAG_LENGTH(
			"filters_colour_chat.modify_chat.max_tag_length",
			"4",
			"",
			"# Maximum length for Town and Nation tags."),
	FILTERS_MODIFY_CHAT_MAX_LGTH(
			"filters_colour_chat.modify_chat.max_title_length",
			"10",
			"",
			"# Maximum length of titles and surnames."),
	
	FILTERS_PAPI_CHAT_FORMATTING(
			"filters_colour_chat.papi_chat_formatting","","",
			"# See the Placeholders wiki page for list of PAPI placeholders.",
			"# https://github.com/TownyAdvanced/Towny/wiki/Placeholders"),
	FILTERS_PAPI_CHAT_FORMATTING_BOTH(
			"filters_colour_chat.papi_chat_formatting.both",
			"&f[&6%n&f|&b%t&f] ",
			"",
			"# When using PlaceholderAPI, and a tag would show both nation and town, this will determine how they are formatted."),
	FILTERS_PAPI_CHAT_FORMATTING_TOWN(
			"filters_colour_chat.papi_chat_formatting.town",
			"&f[&b%s&f] ",
			"",
			"# When using PlaceholderAPI, and a tag would showing a town, this will determine how it is formatted."),
	FILTERS_PAPI_CHAT_FORMATTING_NATION(
			"filters_colour_chat.papi_chat_formatting.nation",
			"&f[&6%s&f] ",
			"",
			"# When using PlaceholderAPI, and a tag would show a nation, this will determine how it is formatted."),
	FILTERS_PAPI_CHAT_FORMATTING_RANKS(
			"filters_colour_chat.papi_chat_formatting.ranks", "", "",
			"# Colour code applied to player names using the %townyadvanced_towny_colour% placeholder."),
	FILTERS_PAPI_CHAT_FORMATTING_RANKS_NOMAD(
			"filters_colour_chat.papi_chat_formatting.ranks.nomad","&f"),
	FILTERS_PAPI_CHAT_FORMATTING_RANKS_RESIDENT(
			"filters_colour_chat.papi_chat_formatting.ranks.resident","&f"),
	FILTERS_PAPI_CHAT_FORMATTING_RANKS_MAYOR(
			"filters_colour_chat.papi_chat_formatting.ranks.mayor","&b"),
	FILTERS_PAPI_CHAT_FORMATTING_RANKS_KING(
			"filters_colour_chat.papi_chat_formatting.ranks.king","&6"),
	FILTERS_PAPI_REL_FORMATTING(
			"filters_colour_chat.papi_relational_formatting",
			"",
			"",
			"# Colour codes used in the RELATIONAL placeholder %rel_townyadvanced_color% to display the relation between two players."),
	FILTERS_PAPI_REL_FORMATTING_NONE(
			"filters_colour_chat.papi_relational_formatting.none",
			"&f",
			"# Used when two players have no special relationship."),
	FILTERS_PAPI_REL_FORMATTING_SAME_TOWN(
			"filters_colour_chat.papi_relational_formatting.same_town",
			"&2",
			"",
			"# Used when two players are in the same town."),
	FILTERS_PAPI_REL_FORMATTING_SAME_NATION(
			"filters_colour_chat.papi_relational_formatting.same_nation",
			"&2",
			"",
			"# Used when two players are in the same nation."),
	FILTERS_PAPI_REL_FORMATTING_ALLY(
			"filters_colour_chat.papi_relational_formatting.ally",
			"&b",
			"",
			"# Used when two players' nations are allied."),
	FILTERS_PAPI_REL_FORMATTING_ENEMY(
			"filters_colour_chat.papi_relational_formatting.enemy",
			"&c",
			"",
			"# Used when two players are enemies."),
	
	PROT(
			"protection",
			"",
			"",
			"",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |             block/item/mob protection                | #",
			"# +------------------------------------------------------+ #",
			"############################################################",
			""),
	PROT_ITEM_USE_MAT(
			"protection.item_use_ids",
			"MINECARTS,BOATS,ENDER_PEARL,FIREBALL,CHORUS_FRUIT,LEAD,EGG",
			"",
			"# Items that can be blocked within towns via town/plot flags.",
			"# These items will be the ones restricted by a town/resident/plot's item_use setting.",
			"# A list of items, that are held in the hand, which can be protected against.",
			"# Group names you can use in this list: BOATS, MINECARTS",
			"# A full list of proper names can be found here https://hub.spigotmc.org/javadocs/spigot/org/bukkit/Material.html "),
	PROT_SWITCH_MAT(
			"protection.switch_ids",
			"CHEST,SHULKER_BOXES,TRAPPED_CHEST,FURNACE,BLAST_FURNACE,DISPENSER,HOPPER,DROPPER,JUKEBOX,SMOKER,COMPOSTER,BELL,BARREL,BREWING_STAND,LEVER,PRESSURE_PLATES,BUTTONS,WOOD_DOORS,FENCE_GATES,TRAPDOORS,MINECARTS,LODESTONE,RESPAWN_ANCHOR,TARGET",
			"",
			"# Blocks that are protected via town/plot flags.",
			"# These are blocks in the world that will be protected by a town/resident/plot's switch setting.",
			"# Switches are blocks, that are in the world, which get right-clicked.",
			"# Towny will tell you the proper name to use in this list if you hit the block while holding a clay brick item in your hand.",
			"# Group names you can use in this list: BOATS,MINECARTS,WOOD_DOORS,PRESSURE_PLATES,FENCE_GATES,TRAPDOORS,SHULKER_BOXES,BUTTONS.",
			"# Note: Vehicles like MINECARTS and BOATS can be added here. If you want to treat other rideable mobs like switches add SADDLE",
			"#       to protect HORSES, DONKEYS, MULES, PIGS, STRIDERS (This is not recommended, unless you want players to not be able to",
			"#       re-mount their animals in towns they cannot switch in.)",
			"# A full list of proper names can be found here https://hub.spigotmc.org/javadocs/spigot/org/bukkit/Material.html "),
	PROT_FIRE_SPREAD_BYPASS(
			"protection.fire_spread_bypass_materials",
			"NETHERRACK,SOUL_SAND,SOUL_SOIL",
			"",
			"# Materials which can be lit on fire even when firespread is disabled.",
			"# Still requires the use of the flint and steel."),
	PROT_MOB_REMOVE_TOWN(
			"protection.town_mob_removal_entities",
			"Monster,Flying,Slime,Shulker,SkeletonHorse,ZombieHorse",
			"",
			"# permitted entities https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/entity/LivingEntity.html",
			"# Animals, Chicken, Cow, Creature, Creeper, Flying, Ghast, Giant, Monster, Pig, ",
			"# PigZombie, Sheep, Skeleton, Slime, Spider, Squid, WaterMob, Wolf, Zombie, Shulker",
			"# Husk, Stray, SkeletonHorse, ZombieHorse, Vex, Vindicator, Evoker, Endermite, PolarBear, Axolotl, Goat, GlowSquid",
			"",
			"# Remove living entities within a town's boundaries, if the town has the mob removal flag set."),
	PROT_MOB_REMOVE_TOWN_KILLER_BUNNY(
			"protection.town_mob_removal_killer_bunny",
			"true",
			"",
			"# Whether the town mob removal should remove THE_KILLER_BUNNY type rabbits."),
	PROT_MOB_REMOVE_VILLAGER_BABIES_TOWN(
			"protection.town_prevent_villager_breeding",
			"false",
			"",
			"# Prevent the spawning of villager babies in towns."),

	PROT_MOB_DISABLE_TRIGGER_PRESSURE_PLATE_STONE(
			"protection.disable_creature_pressureplate_stone",
			"true",
			"",
			"# Disable creatures triggering stone pressure plates"),

	PROT_MOB_REMOVE_WILDERNESS(
			"protection.wilderness_mob_removal_entities",
			"Monster,Flying,Slime,Shulker,SkeletonHorse,ZombieHorse",
			"",
			"# Remove living entities in the wilderness in all worlds that have wildernessmobs turned off."),

	PROT_MOB_REMOVE_WORLD(
			"protection.world_mob_removal_entities",
			"Monster,Flying,Slime,Shulker,SkeletonHorse,ZombieHorse",
			"",
			"# Globally remove living entities in all worlds that have worldmmobs turned off"),

	PROT_MOB_REMOVE_VILLAGER_BABIES_WORLD(
			"protection.world_prevent_villager_breeding",
			"false",
			"",
			"# Prevent the spawning of villager babies in the world."),
	PROT_MOB_REMOVE_SKIP_NAMED_MOBS(
			"protection.mob_removal_skips_named_mobs",
			"false",
			"",
			"# When set to true, mobs who've been named with a nametag will not be removed by the mob removal task."),
	PROT_MOB_REMOVE_SPEED(
			"protection.mob_removal_speed",
			"5s",
			"",
			"# The maximum amount of time a mob could be inside a town's boundaries before being sent to the void.",
			"# Lower values will check all entities more often at the risk of heavier burden and resource use.",
			"# NEVER set below 1."),
	PROT_MOB_TYPES(
			"protection.mob_types",
			"Animals,WaterMob,NPC,Snowman,ArmorStand,Villager,Hanging",
			"",
			"# permitted entities https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/entity/package-summary.html",
			"# Animals, Chicken, Cow, Creature, Creeper, Flying, Ghast, Giant, Monster, Pig, ",
			"# PigZombie, Sheep, Skeleton, Slime, Spider, Squid, WaterMob, Wolf, Zombie",
			"",
			"# Protect living entities within a town's boundaries from being killed by players or mobs."),
	PROT_POTION_TYPES(
			"protection.potion_types",
			"BLINDNESS,CONFUSION,HARM,HUNGER,POISON,SLOW,SLOW_DIGGING,WEAKNESS,WITHER",
			"",
			"# permitted Potion Types https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/potion/PotionType.html",
			"# ABSORPTION, BLINDNESS, CONFUSION, DAMAGE_RESISTANCE, FAST_DIGGING, FIRE_RESISTANCE, HARM, HEAL, HEALTH_BOOST, HUNGER, ",
			"# INCREASE_DAMAGE, INVISIBILITY, JUMP, NIGHT_VISION, POISON, REGENERATION, SATURATION, SLOW , SLOW_DIGGING, ",
			"# SPEED, WATER_BREATHING, WEAKNESS, WITHER.",
			"",
			"# When preventing PVP prevent the use of these potions."),
	PROT_FROST_WALKER(
			"protection.prevent_frost_walker_freezing",
			"false",
			"",
			"# When set to true, players with the Frost Walker enchant will need to be able to build where they are attempting to freeze."),
	PROT_CROP_TRAMPLE(
			"protection.prevent_player_crop_trample",
			"true",
			"",
			"# When set to true, players will never trample crops. When false, players will still",
			"# have to be able to break the crop by hand in order to be able to trample crops."),
	UNCLAIMED_ZONE(
			"unclaimed",
			"",
			"",
			"",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |                Wilderness settings                   | #",
			"# +------------------------------------------------------+ #",
			"#                                                          #",
			"# These are default settings only, applied to newly made   #",
			"# worlds. They are copied to each world's data file upon   #",
			"# first detection.                                         #",
			"# If you are running Towny for the first time these have   #",
			"# been applied to all your already existing worlds.        #",
			"#                                                          #",
			"# To make changes for each world edit the settings in the  #",
			"# relevant worlds data file 'plugins/Towny/data/worlds/'   #",
			"#                                                          #",
			"# Furthermore: These settings are only used after Towny    #", 
			"# has exhausted testing the player for the towny.wild.*    #",
			"# permission nodes.                                        #",
			"#                                                          #",
			"############################################################",
			""),
	UNCLAIMED_ZONE_BUILD(
			"unclaimed.unclaimed_zone_build", 
			"false", 
			"", 
			"# Can players build with any block in the wilderness?"),
	UNCLAIMED_ZONE_DESTROY(
			"unclaimed.unclaimed_zone_destroy", 
			"false",
			"",
			"# Can player destroy any block in the wilderness?"),
	UNCLAIMED_ZONE_ITEM_USE(
			"unclaimed.unclaimed_zone_item_use", 
			"false",
			"",
			"# Can players use items listed in the above protection.item_use_ids in the wilderness without restriction?"),
	UNCLAIMED_ZONE_SWITCH("unclaimed.unclaimed_zone_switch",
			"false",
			"",
			"# Can players interact with switch blocks listed in the above protection.switch_ids in the wilderness without restriction?"),
	UNCLAIMED_ZONE_IGNORE(
			"unclaimed.unclaimed_zone_ignore",
			"GOLD_ORE,IRON_ORE,COAL_ORE,COPPER_ORE,REDSTONE_ORE,EMERALD_ORE,LAPIS_ORE,DIAMOND_ORE,DEEPSLATE_COAL_ORE,DEEPSLATE_IRON_ORE,DEEPSLATE_COPPER_ORE,DEEPSLATE_GOLD_ORE,DEEPSLATE_EMERALD_ORE,DEEPSLATE_REDSTONE_ORE,DEEPSLATE_LAPIS_ORE,DEEPSLATE_DIAMOND_ORE,NETHER_GOLD_ORE,NETHER_QUARTZ_ORE,ANCIENT_DEBRIS,OAK_LOG,SPRUCE_LOG,BIRCH_LOG,JUNGLE_LOG,ACACIA_LOG,DARK_OAK_LOG,CRIMSON_STEM,WARPED_STEM,ACACIA_LEAVES,OAK_LEAVES,DARK_OAK_LEAVES,JUNGLE_LEAVES,BIRCH_LEAVES,SPRUCE_LEAVES,CRIMSON_HYPHAE,WARPED_HYPHAE,ACACIA_SAPLING,BAMBOO_SAPLING,BIRCH_SAPLING,DARK_OAK_SAPLING,JUNGLE_SAPLING,OAK_SAPLING,SPRUCE_SAPLING,TALL_GRASS,BROWN_MUSHROOM,RED_MUSHROOM,CACTUS,ALLIUM,AZURE_BLUET,BLUE_ORCHID,CORNFLOWER,DANDELION,LILAC,LILY_OF_THE_VALLEY,ORANGE_TULIP,OXEYE_DAISY,PEONY,PINK_TULIP,POPPY,RED_TULIP,ROSE_BUSH,SUNFLOWER,WHITE_TULIP,WITHER_ROSE,CRIMSON_FUNGUS,LARGE_FERN,TORCH,LADDER,CLAY,PUMPKIN,GLOWSTONE,VINE,NETHER_WART_BLOCK,COCOA,SUGAR_CANE",
			"",
			"# A list of blocks that will bypass the above settings and do not require the towny.wild.* permission node.",
			"# These blocks are also used in determining which blocks can be interacted with in Towny Wilds plots in towns."),

	NOTIFICATION(
			"notification",
			"",
			"",
			"",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |                 Town Notifications                   | #",
			"# +------------------------------------------------------+ #",
			"############################################################",
			"",
			"  # This is the format for the notifications sent as players move between plots.",
			"  # Empty a particular format for it to be ignored.",
			"",
			"  # Example:",
			"  # [notification.format]",
			"  # ~ [notification.area_[wilderness/town]][notification.splitter][notification.[no_]owner][notification.splitter][notification.plot.format]",
			"  # ... [notification.plot.format]",
			"  # ... [notification.plot.homeblock][notification.plot.splitter][notification.plot.forsale][notification.plot.splitter][notification.plot.type]",
			"  # ~ Wak Town - Lord Jebus - [Home] [For Sale: 50 Beli] [Shop]",
			""),
	NOTIFICATION_FORMAT("notification.format", "&6 ~ %s"),
	NOTIFICATION_SPLITTER("notification.splitter", "&7 - "),
	NOTIFICATION_AREA_WILDERNESS("notification.area_wilderness", "&2%s"),
	NOTIFICATION_AREA_WILDERNESS_PVP("notification.area_wilderness_pvp", "%s"),
	NOTIFICATION_AREA_TOWN("notification.area_town", "&6%s"),
	NOTIFICATION_AREA_TOWN_PVP("notification.area_town_pvp", "%s"),
	NOTIFICATION_OWNER("notification.owner", "&a%s"),
	NOTIFICATION_NO_OWNER("notification.no_owner", "&a%s"),
	NOTIFICATION_PLOT("notification.plot", ""),
	NOTIFICATION_PLOT_SPLITTER("notification.plot.splitter", " "),
	NOTIFICATION_PLOT_FORMAT("notification.plot.format", "%s"),
	// TODO: Make the following 4 nodes use something that is translatable.
	NOTIFICATION_PLOT_HOMEBLOCK("notification.plot.homeblock", "&b[Home]"),
	NOTIFICATION_PLOT_OUTPOSTBLOCK("notification.plot.outpostblock","&b[Outpost]"),
	NOTIFICATION_PLOT_FORSALE("notification.plot.forsale", "&e[For Sale: %s]"),
	NOTIFICATION_PLOT_NOTFORSALE("notification.plot.notforsale", "&e[Not For Sale]"),
	NOTIFICATION_PLOT_TYPE("notification.plot.type", "&6[%s]"),
	NOTIFICATION_GROUP("notification.group", "&f[%s]"),
	NOTIFICATION_TOWN_NAMES_ARE_VERBOSE(
			"notification.town_names_are_verbose",
			"true",
			"",
			"# When set to true, town's names are the long form (townprefix)(name)(townpostfix) configured in the town_level section.",
			"# When false, it is only the town name."),	
	NOTIFICATION_USING_TITLES(
			"notification.using_titles",
			"false",
			"",
			"# If set to true MC's Title and Subtitle feature will be used when crossing into a town.",
			"# Could be seen as intrusive/distracting, so false by default."),
	NOTIFICATION_TITLES(
			"notification.titles",
			"",
			"",
			"# Requires the above using_titles to be set to true.",
			"# Title and Subtitle shown when entering a town or the wilderness. By default 1st line is blank, the 2nd line shows {townname} or {wilderness}.",
			"# You may use colour codes &f, &c and so on.",
			"# For town_title and town_subtitle you may use: ",
			"# {townname} - Name of the town.",
			"# {town_motd} - Shows the townboard message.",
			"# {town_residents} - Shows the number of residents in the town.",
			"# {town_residents_online} - Shows the number of residents online currently.",
			"# The notification.town_names_are_verbose setting will affect the {townname} placeholder."),
	NOTIFICATION_TITLES_TOWN_TITLE(
			"notification.titles.town_title",
			"",
			"",
			"# Entering Town Upper Title Line"),
	NOTIFICATION_TITLES_TOWN_SUBTITLE(
			"notification.titles.town_subtitle",
			"&b{townname}",
			"",
			"# Entering Town Lower Subtitle line."),
	NOTIFICATION_TITLES_WILDERNESS_TITLE(
			"notification.titles.wilderness_title",
			"",
			"",
			"# Entering Wilderness Upper Title Line"),
	NOTIFICATION_TITLES_WILDERNESS_SUBTITLE(
			"notification.titles.wilderness_subtitle",
			"&2{wilderness}",
			"",
			"# Entering Wilderness Lower Subtitle line."),
	NOTIFICATION_OWNER_SHOWS_NATION_TITLE("notification.owner_shows_nation_title", 
			"false", 
			"",
			"# If the notification.owner option should show name or {title} name.", 
			"# Titles are the ones granted by nation kings."),
	NOTIFICATION_NOTIFICATIONS_APPEAR_IN_ACTION_BAR("notification.notifications_appear_in_action_bar",
			"true",
			"",
			"# When set to false the notifications will appear in the chat rather than the action bar."),
	NOTIFICATION_NOTIFICATIONS_APPEAR_ON_BOSSBAR(
			"notification.notifications_appear_on_bossbar",
			"false",
			"",
			"# When enabled, notifications will appear on the bossbar instead of in chat or above the action bar.",
			"# Uses the duration from below for how long the bossbar appears."),
	NOTIFICATION_DURATION("notification.notification_actionbar_duration", 
			"15",
			"",
		    "# This settings sets the duration the actionbar (The text above the inventory bar) or the bossbar lasts in seconds"),
	FLAGS_DEFAULT(
			"default_perm_flags",
			"",
			"",
			"",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |             Default Town/Plot flags                  | #",
			"# +------------------------------------------------------+ #",
			"############################################################",
			""),
	FLAGS_DEFAULT_RES(
			"default_perm_flags.resident",
			"",
			"",
			"# Default permission flags for residents plots within a town",
			"#",
			"# Can allies/friends/outsiders perform certain actions in the town",
			"#",
			"# build - place blocks and other items",
			"# destroy - break blocks and other items",
			"# itemuse - use items such as furnaces (as defined in item_use_ids)",
			"# switch - trigger or activate switches (as defined in switch_ids)"),
	FLAGS_RES_FR_BUILD("default_perm_flags.resident.friend.build", "true"),
	FLAGS_RES_FR_DESTROY("default_perm_flags.resident.friend.destroy", "true"),
	FLAGS_RES_FR_ITEM_USE("default_perm_flags.resident.friend.item_use", "true"),
	FLAGS_RES_FR_SWITCH("default_perm_flags.resident.friend.switch", "true"),
	FLAGS_RES_TOWN_BUILD("default_perm_flags.resident.town.build", "false"),
	FLAGS_RES_TOWN_DESTROY("default_perm_flags.resident.town.destroy", "false"),
	FLAGS_RES_TOWN_ITEM_USE("default_perm_flags.resident.town.item_use","false"),
	FLAGS_RES_TOWN_SWITCH("default_perm_flags.resident.town.switch", "false"),
	FLAGS_RES_ALLY_BUILD("default_perm_flags.resident.ally.build", "false"),
	FLAGS_RES_ALLY_DESTROY("default_perm_flags.resident.ally.destroy", "false"),
	FLAGS_RES_ALLY_ITEM_USE(
			"default_perm_flags.resident.ally.item_use",
			"false"),
	FLAGS_RES_ALLY_SWITCH("default_perm_flags.resident.ally.switch", "false"),
	FLAGS_RES_OUTSIDER_BUILD(
			"default_perm_flags.resident.outsider.build",
			"false"),
	FLAGS_RES_OUTSIDER_DESTROY(
			"default_perm_flags.resident.outsider.destroy",
			"false"),
	FLAGS_RES_OUTSIDER_ITEM_USE(
			"default_perm_flags.resident.outsider.item_use",
			"false"),
	FLAGS_RES_OUTSIDER_SWITCH(
			"default_perm_flags.resident.outsider.switch",
			"false"),
	FLAGS_DEFAULT_TOWN(
			"default_perm_flags.town",
			"",
			"",
			"# Default permission flags for towns",
			"# These are copied into the town data file at creation",
			"#",
			"# Can allies/outsiders/residents perform certain actions in the town",
			"#",
			"# build - place blocks and other items",
			"# destroy - break blocks and other items",
			"# itemuse - use items such as flint and steel or buckets (as defined in item_use_ids)",
			"# switch - trigger or activate switches (as defined in switch_ids)"),
	FLAGS_TOWN_DEF_PVP("default_perm_flags.town.default.pvp", "true"),
	FLAGS_TOWN_DEF_FIRE("default_perm_flags.town.default.fire", "false"),
	FLAGS_TOWN_DEF_EXPLOSION(
			"default_perm_flags.town.default.explosion",
			"false"),
	FLAGS_TOWN_DEF_MOBS("default_perm_flags.town.default.mobs", "false"),

	FLAGS_TOWN_RES_BUILD("default_perm_flags.town.resident.build", "true"),
	FLAGS_TOWN_RES_DESTROY("default_perm_flags.town.resident.destroy", "true"),
	FLAGS_TOWN_RES_ITEM_USE("default_perm_flags.town.resident.item_use", "true"),
	FLAGS_TOWN_RES_SWITCH("default_perm_flags.town.resident.switch", "true"),
	FLAGS_TOWN_NATION_BUILD("default_perm_flags.town.nation.build", "false"),
	FLAGS_TOWN_NATION_DESTROY("default_perm_flags.town.nation.destroy", "false"),
	FLAGS_TOWN_NATION_ITEM_USE("default_perm_flags.town.nation.item_use", "false"),
	FLAGS_TOWN_NATION_SWITCH("default_perm_flags.town.nation.switch", "false"),
	FLAGS_TOWN_ALLY_BUILD("default_perm_flags.town.ally.build", "false"),
	FLAGS_TOWN_ALLY_DESTROY("default_perm_flags.town.ally.destroy", "false"),
	FLAGS_TOWN_ALLY_ITEM_USE("default_perm_flags.town.ally.item_use", "false"),
	FLAGS_TOWN_ALLY_SWITCH("default_perm_flags.town.ally.switch", "false"),
	FLAGS_TOWN_OUTSIDER_BUILD("default_perm_flags.town.outsider.build", "false"),
	FLAGS_TOWN_OUTSIDER_DESTROY(
			"default_perm_flags.town.outsider.destroy",
			"false"),
	FLAGS_TOWN_OUTSIDER_ITEM_USE(
			"default_perm_flags.town.outsider.item_use",
			"false"),
	FLAGS_TOWN_OUTSIDER_SWITCH(
			"default_perm_flags.town.outsider.switch",
			"false"),
	INVITE_SYSTEM(
			"invite_system",
			"",
			"",
			"",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |                 Towny Invite System                  | #",
			"# +------------------------------------------------------+ #",
			"############################################################",
			""),
	INVITE_SYSTEM_ACCEPT_COMMAND(
			"invite_system.accept_command",
			"accept",
			"",
			"# Command used to accept towny invites)",
			"#e.g Player join town invite."),
	INVITE_SYSTEM_DENY_COMMAND(
			"invite_system.deny_command",
			"deny",
			"",
			"# Command used to deny towny invites",
			"#e.g Player join town invite."),
	INVITE_SYSTEM_CONFIRM_COMMAND(
			"invite_system.confirm_command",
			"confirm",
			"",
			"# Command used to confirm some towny actions/tasks)",
			"#e.g Purging database or removing a large amount of townblocks"),
	INVITE_SYSTEM_CANCEL_COMMAND(
			"invite_system.cancel_command",
			"cancel",
			"",
			"# Command used to cancel some towny actions/tasks",
			"#e.g Purging database or removing a large amount of townblocks"),
	INVITE_SYSTEM_CONFIRMATION_TIMEOUT(
			"invite_system.confirmation_timeout",
			"20",
			"",
			"# How many seconds before a confirmation times out for the receiver.", 
			"# This is used for cost-confirmations and confirming important decisions."),
	INVITE_SYSTEM_COOLDOWN_TIME(
			"invite_system.cooldowntime",
			"0m",
			"",
			"# When set for more than 0m, the amount of time (in minutes) which must have passed between",
			"# a player's first log in and when they can be invited to a town."),
	INVITE_SYSTEM_EXPIRATION_TIME(
			"invite_system.expirationtime",
			"0m",
			"",
			"# When set for more than 0m, the amount of time until an invite is considered",
			"# expired and is removed. Invites are checked for expiration once every hour.",
			"# Valid values would include: 30s, 30m, 24h, 2d, etc."),
	INVITE_SYSTEM_MAXIMUM_INVITES_SENT(
			"invite_system.maximum_invites_sent",
			"",
			"",
			"# Max invites for Town & Nations, which they can send. Invites are capped to decrease load on large servers.",
			"# You can increase these limits but it is not recommended. Invites/requests are not saved between server reloads/stops."),
	INVITE_SYSTEM_MAXIMUM_INVITES_SENT_TOWN(
			"invite_system.maximum_invites_sent.town_toplayer",
			"35",
			"",
			"# How many invites a town can send out to players, to join the town."),
	INVITE_SYSTEM_MAXIMUM_INVITES_SENT_NATION(
			"invite_system.maximum_invites_sent.nation_totown",
			"35",
			"",
			"# How many invites a nation can send out to towns, to join the nation."),
	INVITE_SYSTEM_MAXIMUM_REQUESTS_SENT_NATION(
			"invite_system.maximum_invites_sent.nation_tonation",
			"35",
			"",
			"# How many requests a nation can send out to other nations, to ally with the nation.",
			"# Only used when war.disallow_one_way_alliance is set to true."),
	INVITE_SYSTEM_MAXIMUM_INVITES_RECEIVED(
			"invite_system.maximum_invites_received",
			"",
			"",
			"# Max invites for Players, Towns & nations, which they can receive. Invites are capped to decrease load on large servers.",
			"# You can increase these limits but it is not recommended. Invites/requests are not saved between server reloads/stops."),
	INVITE_SYSTEM_MAXIMUM_INVITES_RECEIVED_PLAYER(
			"invite_system.maximum_invites_received.player",
			"10",
			"",
			"# How many invites can one player have from towns."),
	INVITE_SYSTEM_MAXIMUM_INVITES_RECEIVED_TOWN(
			"invite_system.maximum_invites_received.town",
			"10",
			"",
			"# How many invites can one town have from nations."),
	INVITE_SYSTEM_MAXIMUM_REQUESTS_RECEIVED_NATION(
			"invite_system.maximum_invites_received.nation",
			"10",
			"",
			"# How many requests can one nation have from other nations for an alliance."),
	INVITE_SYSTEM_MAX_DISTANCE_FROM_TOWN_SPAWN(
			"invite_system.maximum_distance_from_town_spawn",
			"0",
			"",
			"# When set above 0, the maximum distance a player can be from a town's spawn in order to receive an invite.",
			"# Use this setting to require players to be near or inside a town before they can be invited."),
	
	RES_SETTING(
			"resident_settings",
			"",
			"",
			"",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |                  Resident settings                   | #",
			"# +------------------------------------------------------+ #",
			"############################################################",
			""),
	RES_SETTING_DELETE_OLD_RESIDENTS(
			"resident_settings.delete_old_residents",
			"",
			"",
			"# if enabled old residents will be deleted, losing their town, townblocks, friends",
			"# after Two months (default) of not logging in. If the player is a mayor their town",
			"# will be inherited according to the order_of_mayoral_succession list in this config."),
	RES_SETTING_DELETE_OLD_RESIDENTS_ENABLE(
			"resident_settings.delete_old_residents.enable",
			"false"),
	RES_SETTING_DELETE_OLD_RESIDENTS_TIME(
			"resident_settings.delete_old_residents.deleted_after_time",
			"60d"),
	RES_SETTING_DELETE_OLD_RESIDENTS_ECO(
			"resident_settings.delete_old_residents.delete_economy_account",
			"true"),
	RES_SETTING_DELETE_OLD_RESIDENTS_TOWNLESS_ONLY(
			"resident_settings.delete_old_residents.delete_only_townless",
			"false",
			"",
			"# When true only residents who have no town will be deleted."),
	RES_SETTING_DEFAULT_TOWN_NAME(
			"resident_settings.default_town_name",
			"",
			"",
			"# The name of the town a resident will automatically join when he first registers."),
	RES_SETTING_DENY_BED_USE(
			"resident_settings.deny_bed_use",
			"false",
			"",
			"# If true, players can only use beds in plots they personally own."),
	RES_SETTING_IS_SHOWING_LOCALE_MESSAGE(
			"resident_settings.is_showing_locale_message",
			"true",
			"",
			"# If true, players who join the server for the first time will be informed about their locale, and about Towny translatable system."),
	ECO(
			"economy",
			"",
			"",
			"",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |                  Economy settings                    | #",
			"# +------------------------------------------------------+ #",
			"############################################################",
			""),
	ECO_USE_ASYNC(
			"economy.use_async",
			"true",
			"",
			"# By default it is set to true.",
			"# Rarely set to false. Set to false if you get concurrent modification errors on timers for daily tax collections."),
	ECO_BANK_CACHE_TIMEOUT(
			"economy.bank_account_cache_timeout",
			"600s",
			"",
			"# The time that the town and nation bank accounts' balances are cached for, in seconds.",
			"# Default of 600s is equal to ten minutes. Requires the server to be stopped and started if you want to change this.",
			"# Cached balances are used for PlaceholderAPI placeholders, town and nation lists."),
	ECO_TOWN_PREFIX(
			"economy.town_prefix",
			"town-",
			"",
			"# Prefix to apply to all town economy accounts."),
	ECO_NATION_PREFIX(
			"economy.nation_prefix",
			"nation-",
			"",
			"# Prefix to apply to all nation economy accounts."),
	ECO_TOWN_RENAME_COST(
			"economy.town_rename_cost",
			"0",
			"",
			"# The cost of renaming a town."),
	ECO_NATION_RENAME_COST(
			"economy.nation_rename_cost",
			"0",
			"",
			"# The cost of renaming a nation."),
	ECO_SPAWN_TRAVEL("economy.spawn_travel", "", ""),
	ECO_PRICE_TOWN_SPAWN_TRAVEL(
			"economy.spawn_travel.price_town_spawn_travel",
			"0.0",
			"",
			"# Cost to use /town spawn."),
	ECO_PRICE_TOWN_SPAWN_TRAVEL_NATION(
			"economy.spawn_travel.price_town_nation_spawn_travel",
			"5.0",
			"",
			"# Cost to use '/town spawn [town]' to another town in your nation."),
	ECO_PRICE_TOWN_SPAWN_TRAVEL_ALLY(
			"economy.spawn_travel.price_town_ally_spawn_travel",
			"10.0",
			"",
			"# Cost to use '/town spawn [town]' to another town in a nation that is allied with your nation."),
	ECO_PRICE_TOWN_SPAWN_TRAVEL_PUBLIC(
			"economy.spawn_travel.price_town_public_spawn_travel",
			"10.0",
			"",
			"# Maximum cost to use /town spawn [town] that mayors can set using /t set spawncost.",
			"# This is paid to the town you goto."),
	ECO_PRICE_ALLOW_MAYORS_TO_OVERRIDE_PUBLIC_SPAWN_COST(
			"economy.spawn_travel.is_public_spawn_cost_affected_by_town_spawncost",
			"true",
			"",
			"# When false, the price_town_public_spawn_travel will be used for public spawn costs, despite what mayors have their town spawncost set at.",
			"# When true, the lower of either the town's spawncost or the config's price_town_public_spawn_travel setting will be used."),
	ECO_PRICE_TOWN_SPAWN_PAID_TO_TOWN(
			"economy.spawn_travel.town_spawn_cost_paid_to_town",
			"true",
			"",
			"# When set to true, any cost paid by a player to use any variant of '/town spawn' will be paid to the town bank.",
			"# When false the amount will be paid to the server account whose name is set in the closed economy setting below.."),
	ECO_PRICE_NATION_NEUTRALITY(
			"economy.price_nation_neutrality",
			"100.0",
			"",
			"# The daily upkeep to remain neutral, paid by the Nation bank. If unable to pay, neutral/peaceful status is lost.",
			"# Neutrality will exclude you from a war event, as well as deterring enemies."),
	ECO_PRICE_TOWN_NEUTRALITY(
			"economy.price_town_neutrality",
			"25.0",
			"",
			"# The daily upkeep to remain neutral, paid by the Town bank. If unable to pay, neutral/peaceful status is lost."),

	
	ECO_NEW_EXPAND("economy.new_expand", "", ""),
	ECO_PRICE_NEW_NATION(
			"economy.new_expand.price_new_nation",
			"1000.0",
			"",
			"# How much it costs to start a nation."),
	ECO_PRICE_NEW_TOWN(
			"economy.new_expand.price_new_town",
			"250.0",
			"",
			"# How much it costs to start a town."),
	ECO_PRICE_TOWN_MERGE(
			"economy.new_expand.price_town_merge",
			"0",
			"",
			"# The base cost a town has to pay to merge with another town. The town that initiates the merge pays the cost."),
	ECO_PRICE_TOWN_MERGE_PER_PLOT_PERCENTAGE(
			"economy.new_expand.price_town_merge_per_plot_percentage",
			"50",
			"",
			"# The percentage that a town has to pay per plot to merge with another town. The town that initiates the merge pays the cost.",
			"# This is based on the price_claim_townblock."),
	ECO_PRICE_RECLAIM_RUINED_TOWN(
			"economy.new_expand.price_reclaim_ruined_town",
			"500.0",
			"",
			"# How much it costs to reclaim a ruined town.",
			"# This is only applicable if the town-ruins & town-reclaim features are enabled."),
	ECO_PRICE_OUTPOST(
			"economy.new_expand.price_outpost",
			"500.0",
			"",
			"# How much it costs to make an outpost. An outpost isn't limited to being on the edge of town."),
	ECO_PRICE_CLAIM_TOWNBLOCK(
			"economy.new_expand.price_claim_townblock",
			"25.0",
			"",
			"# The price for a town to expand one townblock."),
	ECO_PRICE_CLAIM_TOWNBLOCK_INCREASE(
			"economy.new_expand.price_claim_townblock_increase",
			"1.0",
			"",
			"# How much every additionally claimed townblock increases in cost. Set to 1 to deactivate this. 1.3 means +30% to every bonus claim block cost."),
	ECO_MAX_PRICE_CLAIM_TOWNBLOCK(
			"economy.new_expand.max_price_claim_townblock",
			"-1.0", 
			"",
			"# The maximum price for an additional townblock. No matter how many blocks a town has the price will not be above this. Set to -1 to deactivate this."),
	ECO_PRICE_CLAIM_TOWNBLOCK_REFUND(
			"economy.new_expand.price_claim_townblock_refund",
			"0.0",
			"",
			"# The amount refunded to a town when they unclaim a townblock.",
			"# Warning: do not set this higher than the cost to claim a townblock.",
			"# It is advised that you do not set this to the same price as claiming either, otherwise towns will get around using outposts to claim far away.",
			"# Optionally, set this to a negative amount if you want towns to pay money to unclaim their land."),
	ECO_PRICE_PURCHASED_BONUS_TOWNBLOCK(
			"economy.new_expand.price_purchased_bonus_townblock",
			"25.0",
			"",
			"# How much it costs a player to buy extra blocks."),
	ECO_PRICE_PURCHASED_BONUS_TOWNBLOCK_INCREASE(
			"economy.new_expand.price_purchased_bonus_townblock_increase",
			"1.0",
			"",
			"# How much every extra bonus block costs more. Set to 1 to deactivate this. 1.2 means +20% to every bonus claim block cost."),
	ECO_PRICE_PURCHASED_BONUS_TOWNBLOCKS_MAXIMUM(
			"economy.new_expand.price_purchased_bonus_townblock_max_price",
			"-1.0",
			"",
			"# The maximum price that bonus townblocks can cost to purchase. Set to -1.0 to deactivate this maxium."),

	ECO_DEATH("economy.death", "", ""),
	ECO_PRICE_DEATH_TYPE("economy.death.price_death_type", 
			"fixed",
			"", 
			"# Either fixed or percentage.",
			"# For percentage 1.0 would be 100%. 0.01 would be 1%."),
	ECO_PRICE_DEATH_PERCENTAGE_CAP("economy.death.percentage_cap", 
			"0.0",
			"", 
			"# A maximum amount paid out by a resident from their personal holdings for percentage deaths.",
			"# Set to 0 to have no cap."),
	ECO_PRICE_DEATH_PVP_ONLY("economy.death.price_death_pvp_only",
			"false",
			"",
			"# If True, only charge death prices for pvp kills. Not monsters/environmental deaths."),
	ECO_PRICE_DEATH("economy.death.price_death", "1.0", ""),
	ECO_PRICE_DEATH_TOWN("economy.death.price_death_town", "0.0", ""),
	ECO_PRICE_DEATH_NATION("economy.death.price_death_nation", "0.0", ""),

	ECO_BANK_CAP("economy.banks", "", ""),
	ECO_BANK_CAP_TOWN(
			"economy.banks.town_bank_cap",
			"0.0",
			"",
			"# Maximum amount of money allowed in town bank",
			"# Use 0 for no limit"),
	ECO_BANK_TOWN_ALLOW_WITHDRAWALS(
			"economy.banks.town_allow_withdrawals",
			"true",
			"",
			"# Set to true to allow withdrawals from town banks"),
	ECO_MIN_DEPOSIT_TOWN(
			"economy.banks.town_min_deposit",
			"0",
			"",
			"# Minimum amount of money players are allowed to deposit in town bank at a time."),
	ECO_MIN_WITHDRAW_TOWN(
			"economy.banks.town_min_withdraw",
			"0",
			"",
			"# Minimum amount of money players are allowed to withdraw from town bank at a time."),
	ECO_BANK_CAP_NATION(
			"economy.banks.nation_bank_cap",
			"0.0",
			"",
			"# Maximum amount of money allowed in nation bank",
			"# Use 0 for no limit"),
	ECO_BANK_NATION_ALLOW_WITHDRAWALS(
			"economy.banks.nation_allow_withdrawals",
			"true",
			"",
			"# Set to true to allow withdrawals from nation banks"),
	ECO_MIN_DEPOSIT_NATION(
			"economy.banks.nation_min_deposit",
			"0",
			"",
			"# Minimum amount of money players are allowed to deposit in nation bank at a time."),
	ECO_MIN_WITHDRAW_NATION(
			"economy.banks.nation_min_withdraw",
			"0",
			"",
			"# Minimum amount of money players are allowed to withdraw from nation bank at a time."),
	ECO_BANK_DISALLOW_BANK_ACTIONS_OUTSIDE_TOWN(
			"economy.banks.disallow_bank_actions_outside_town",
			"false",
			"",
			"# When set to true, players can only use their town withdraw/deposit commands while inside of their own town.",
			"# Likewise, nation banks can only be withdrawn/deposited to while in the capital city."),

	ECO_CLOSED_ECONOMY("economy.closed_economy", "", ""),
	ECO_CLOSED_ECONOMY_SERVER_ACCOUNT(
			"economy.closed_economy.server_account",
			"towny-server",
			"",
			"# The name of the account that all money that normally disappears goes into."),
	ECO_CLOSED_ECONOMY_ENABLED(
			"economy.closed_economy.enabled",
			"false",
			"",
			"# Turn on/off whether all transactions that normally don't have a second party are to be done with a certain account.",
			"# Eg: The money taken during Daily Taxes is just removed. With this on, the amount taken would be funneled into an account.",
			"#     This also applies when a player collects money, like when the player is refunded money when a delayed teleport fails."),

	ECO_DAILY_TAXES("economy.daily_taxes", "", ""),
	ECO_DAILY_TAXES_ENABLED(
			"economy.daily_taxes.enabled",
			"true",
			"",
			"# Enables taxes to be collected daily by town/nation",
			"# If a town can't pay it's tax then it is kicked from the nation.",
			"# if a resident can't pay his plot tax he loses his plot.",
			"# if a resident can't pay his town tax then he is kicked from the town.",
			"# if a town or nation fails to pay it's upkeep it is deleted."),
	ECO_DAILY_TAXES_MAX_PLOT_TAX(
			"economy.daily_taxes.max_plot_tax_amount",
			"1000.0",
			"",
			"# Maximum tax amount allowed for townblocks sold to players."),
	ECO_DAILY_TOWN_TAXES_MAX(
			"economy.daily_taxes.max_town_tax_amount",
			"1000.0",
			"",
			"# Maximum tax amount allowed for towns when using flat taxes."),
	ECO_DAILY_NATION_TAXES_MAX(
			"economy.daily_taxes.max_nation_tax_amount",
			"1000.0",
			"",
			"# Maximum tax amount allowed for nations when using flat taxes."),
	ECO_DAILY_TAXES_MAX_TOWN_TAX_PERCENT(
			"economy.daily_taxes.max_town_tax_percent",
			"25",
			"",
			"# Maximum tax percentage allowed when taxing by percentages for towns."),
	ECO_DAILY_TAXES_MAX_TOWN_TAX_PERCENT_AMOUNT(
			"economy.daily_taxes.max_town_tax_percent_amount",
			"10000",
			"",
			"# The maximum amount of money that can be taken from a balance when using a percent tax, this is the default for all new towns."
			),
	ECO_DAILY_TAXES_DO_CAPITALS_PAY_NATION_TAX(
			"economy.daily_taxes.do_nation_capitals_pay_nation_tax",
			"false",
			"",
			"# When true, a nation's capital will pay the nation tax from the capital's town bank.",
			"# This feature is a bit redundant because the king can withdraw from both banks anyways,",
			"# but it might keep nation's from being deleted for not paying their upkeep."),
	ECO_PRICE_NATION_UPKEEP(
			"economy.daily_taxes.price_nation_upkeep",
			"100.0",
			"",
			"# The server's daily charge on each nation. If a nation fails to pay this upkeep",
			"# all of it's member town are kicked and the Nation is removed."),
	ECO_PRICE_NATION_UPKEEP_PERPLOT(
			"economy.daily_taxes.nation_perplot_upkeep",
			"false",
			"",
			"# Uses the total number of plots which a nation has across all of its towns to determine upkeep",
			"# instead of nation_pertown_upkeep and instead of nation level (number of residents.)",
			"# Calculated by (price_nation_upkeep X number of plots owned by the nation's towns.)"),
	ECO_PRICE_NATION_UPKEEP_PERTOWN(
			"economy.daily_taxes.nation_pertown_upkeep",
			"false",
			"",
			"# Uses total number of towns in the nation to determine upkeep instead of nation level (Number of Residents)",
			"# calculated by (number of towns in nation X price_nation_upkeep)."),
	ECO_PRICE_NATION_UPKEEP_PERTOWN_NATIONLEVEL_MODIFIER(
			"economy.daily_taxes.nation_pertown_upkeep_affected_by_nation_level_modifier",
			"false",
			"",
			"# If set to true, the per-town-upkeep system will be modified by the Nation Levels' upkeep modifiers."),
	ECO_PRICE_TOWN_UPKEEP(
			"economy.daily_taxes.price_town_upkeep",
			"10.0",
			"",
			"# The server's daily charge on each town. If a town fails to pay this upkeep",
			"# all of it's residents are kicked and the town is removed."),
	ECO_PRICE_TOWN_UPKEEP_PLOTBASED(
			"economy.daily_taxes.town_plotbased_upkeep",
			"false",
			"",
			"# Uses total amount of owned plots to determine upkeep instead of the town level (Number of residents)",
			"# calculated by (number of claimed plots X price_town_upkeep)."),
	ECO_PRICE_TOWN_UPKEEP_PLOTBASED_TOWNLEVEL_MODIFIER(
			"economy.daily_taxes.town_plotbased_upkeep_affected_by_town_level_modifier",
			"false",
			"",
			"# If set to true, the plot-based-upkeep system will be modified by the Town Levels' upkeep modifiers."),
	ECO_PRICE_TOWN_UPKEEP_PLOTBASED_MINIMUM_AMOUNT(
			"economy.daily_taxes.town_plotbased_upkeep_minimum_amount",
			"0.0",
			"",
			"# If set to any amount over zero, if a town's plot-based upkeep totals less than this value, the town will pay the minimum instead."),
	ECO_PRICE_TOWN_UPKEEP_PLOTBASED_MAXIMUM_AMOUNT(
			"economy.daily_taxes.town_plotbased_upkeep_maximum_amount",
			"0.0",
			"",
			"# If set to any amount over zero, if a town's plot-based upkeep totals more than this value, the town will pay the maximum instead."),
	ECO_PRICE_TOWN_OVERCLAIMED_UPKEEP_PENALTY(
			"economy.daily_taxes.price_town_overclaimed_upkeep_penalty",
			"0.0",
			"",
			"# The server's daily charge on a town which has claimed more townblocks than it is allowed."),
	ECO_PRICE_TOWN_OVERCLAIMED_UPKEEP_PENALTY_PLOTBASED(
			"economy.daily_taxes.price_town_overclaimed_upkeep_penalty_plotbased",
			"false",
			"",
			"# Uses total number of plots that the town is overclaimed by, to determine the price_town_overclaimed_upkeep_penalty cost.",
			"# If set to true the penalty is calculated (# of plots overclaimed X price_town_overclaimed_upkeep_penalty)."),
	ECO_UPKEEP_PLOTPAYMENTS(
			"economy.daily_taxes.use_plot_payments",
			"false",
			"",
			"# If enabled and you set a negative upkeep for the town",
			"# any funds the town gains via upkeep at a new day",
			"# will be shared out between the plot owners."),
	
	ECO_BANKRUPTCY("economy.bankruptcy", "", "", 
			"# The Bankruptcy system in Towny will make it so that when a town cannot pay their upkeep costs,",
			"# rather than being deleted the towns will go into debt. Debt is capped based on the Town's costs",
			"# or overriden with the below settings."),
	ECO_BANKRUPTCY_ENABLED(
			"economy.bankruptcy.enabled",
			"false",
			"",
			"# If this setting is true, then if a town runs out of money (due to upkeep, nation tax etc.),",
			"# it does not get deleted, but instead goes into a 'bankrupt state'.",
			"# While bankrupt, the town bank account is in debt, and the town cannot expand (e.g claim, recruit, or build).",
			"# The debt has a ceiling equal to the estimated value of the town (from new town and claims costs)",
			"# The debt can be repaid using /t deposit x.", 
			"# Once all debt is repaid, the town immediately returns to a normal state."),
	ECO_BANKRUPTCY_DEBT_CAP(
			"economy.bankruptcy.debt_cap",
			"",
			"",
			"# When using bankruptcy is enabled a Town a debtcap.",
			"# The debt cap is calculated by adding the following:",
			"# The cost of the town,",
			"# The cost of the town's purchased townblocks,",
			"# The cost of the town's purchased outposts."),
	ECO_BANKRUPTCY_DEBT_CAP_MAXIMUM(
			"economy.bankruptcy.debt_cap.maximum",
			"0.0",
			"",
			"# When set to greater than 0.0, this will be used to determine every town''s maximum debt,",
			"# overriding the above calculation if the calculation would be larger than the set maximum."),
	ECO_BANKRUPTCY_DEBT_CAP_OVERRIDE(
			"economy.bankruptcy.debt_cap.override",
			"0.0",
			"",
			"# When set to greater than 0.0, this setting will override all other debt calculations and maximums,",
			"# making all towns have the same debt cap."),
	ECO_BANKRUPTCY_DEBT_CAP_USES_TOWN_LEVELS(
			"economy.bankruptcy.debt_cap.debt_cap_uses_town_levels",
			"false",
			"",
			"# When true the debt_cap.override price will be multiplied by the debtCapModifier in the town_level",
			"# section of the config. (Ex: debtCapModifier of 3.0 and debt_cap.override of 1000.0 would set ",
			"# a debtcap of 3.0 x 1000 = 3000."),
	ECO_BANKRUPTCY_UPKEEP(
			"economy.bankruptcy.upkeep",
			"",
			""),
	ECO_BANKRUPTCY_UPKEEP_DELETE_TOWNS_THAT_REACH_DEBT_CAP(
			"economy.bankruptcy.upkeep.delete_towns_that_reach_debt_cap",
			"false",
			"",
			"# If a town has reached their debt cap and is unable to pay the upkeep with debt,",
			"# will Towny delete them?"),
	ECO_BANKRUPTCY_NATION("economy.bankruptcy.nation_tax", "", ""),
	ECO_BANKRUPTCY_DO_BANKRUPT_TOWNS_PAY_NATION_TAX(
			"economy.bankruptcy.nation_tax.do_bankrupt_towns_pay_nation_tax",
			"false",
			"",
			"# Will bankrupt towns pay their nation tax?",
			"# If false towns that are bankrupt will not pay any nation tax and will leave their nation.",
			"# If true the town will go into debt up until their debt cap is reached.",
			"# True is recommended if using a war system where towns are forced to join a conqueror's nation,",
			"# otherwise conquered towns would be able to leave the nation by choosing to go bankrupt.",
			"# False is recommended otherwise so that nations are not using abandoned towns to gather taxes."),
	ECO_BANKRUPTCY_NATION_KICKS_TOWNS_THAT_REACH_DEBT_CAP(
			"economy.bankruptcy.nation_tax.kick_towns_that_reach_debt_cap",
			"false",
			"",
			"# If a town can no longer pay their nation tax with debt because they have",
			"# reach their debtcap, are they kicked from the nation?"),
	ECO_BANKRUPTCY_DOES_NATION_TAX_DELETE_CONQUERED_TOWNS(
			"economy.bankruptcy.nation_tax.does_nation_tax_delete_conquered_towns_that_cannot_pay",
			"false",
			"",
			"# Does a conquered town which cannot pay the nation tax get deleted?"),

	BANKHISTORY(
		"bank_history",
		"",
		"",
		"",
		"############################################################",
		"# +------------------------------------------------------+ #",
		"# |                 Bank History settings                | #",
		"# +------------------------------------------------------+ #",
		"############################################################",
		""),

	BANKHISTORY_BOOK(
		"bank_history.book",
		"{time}\n\n{type} of {amount} {to-from} {name}\n\nReason: {reason}\n\nBalance: {balance}",
		"",
		"# This allows you to modify the style displayed via bankhistory commands."
	),
	TOWNBLOCKTYPES(
			"townblocktypes",
			"",
			"",
			"",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |                   Town Block Types                   | #",
			"# |                                                      | #",
			"# | You may add your own custom townblocks to this       | #",
			"# | section of the config. Removing the townblocks       | #",
			"# | supplied by Towny from this configuration is not     | #",
			"# | recommended.                                         | #",
			"# |                                                      | #",
			"# | name: The name used for this townblock, in-game and  | #",
			"# |    in the database.                                  | #",
			"# | cost: Cost a player pays to set a townblock to the   | #",
			"# |    type.                                             | #",
			"# | tax: The amount a player has to pay city each day to | #",
			"# |    continue owning the plot. If tax is set to 0, the | #",
			"# |    towns' plot tax will be used instead.             | #",
			"# | mapKey: The character that shows on the /towny map   | #",
			"# |    commands.                                         | #",
			"# | itemUseIds: If empty, will use values defined in     | #",
			"# |    protection.item_use_ids. If not empty this defines| #",
			"# |    what items are considered item_use.               | #",
			"# | switchIds: If empty, will use values defined in      | #",
			"# |    protection.switch_ids. If not empty this defines  | #",
			"# |    what blocks are considered switches in the type.  | #",
			"# | allowedBlocks: Will make it so players with build or | #",
			"# |    destroy permissions are only able to affect those | #",
			"# |    blocks, see the farm type for an example.         | #",
			"# |                                                      | #",
			"# +------------------------------------------------------+ #",
			"############################################################",
			""),
	TOWNBLOCKTYPES_TYPES("townblocktypes.types", ""),
	JAIL(
			"jail",
			"",
			"",
			"",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |                 Jail Plot settings                   | #",
			"# +------------------------------------------------------+ #",
			"############################################################",
			""),
	JAIL_IS_JAILING_ATTACKING_ENEMIES(
			"jail.is_jailing_attacking_enemies",
			"false",
			"",
			"#If true attacking players who die on enemy-town land will be placed into the defending town's jail if it exists.",
			"#Requires town_respawn to be true in order to work."),
	JAIL_IS_JAILING_ATTACKING_OUTLAWS(
			"jail.is_jailing_attacking_outlaws",
			"false",
			"",
			"#If true attacking players who are considered an outlaw, that are killed inside town land will be placed into the defending town's jail if it exists.",
			"#Requires town_respawn to be true in order to work."),
	JAIL_OUTLAW_JAIL_HOURS(
			"jail.outlaw_jail_hours",
			"5",
			"",
			"#How many hours an attacking outlaw will be jailed for."),
	JAIL_JAIL_ALLOWS_TELEPORT_ITEMS(
			"jail.jail_allows_teleport_items",
			"false",
			"",
			"#If true jailed players can use items that teleport, ie: Ender Pearls & Chorus Fruit, but are still barred from using other methods of teleporting."),
	JAIL_JAIL_DENIES_TOWN_LEAVE(
			"jail.jail_denies_town_leave",
			"false",
			"",
			"#If false jailed players can use /town leave, and escape a jail."),
	JAIL_BAIL("jail.bail", "", ""),
	JAIL_BAIL_IS_ALLOWING_BAIL(
			"jail.bail.is_allowing_bail",
			"false",
			"",
			"#If true players can pay a bail amount to be unjailed."),
	JAIL_BAIL_BAIL_AMOUNT(
			"jail.bail.bail_amount",
			"10",
			"",
			"#Amount that bail costs for normal residents/nomads."),
	JAIL_BAIL_BAIL_AMOUNT_MAYOR(
			"jail.bail.bail_amount_mayor",
			"10",
			"",
			"#Amount that bail costs for Town mayors."),
	JAIL_BAIL_BAIL_AMOUNT_KING(
			"jail.bail.bail_amount_king",
			"10",
			"",
			"#Amount that bail costs for Nation kings."),
	JAIL_BLACKLISTED_COMMANDS(
			"jail.blacklisted_commands",
			"home,spawn,teleport,tp,tpa,tphere,tpahere,back,dback,ptp,jump,kill,warp,suicide",
			"",
			"# Commands which a jailed player cannot use."),
	JAIL_PLOTS_DENY_PVP(
			"jail.do_jail_plots_deny_pvp",
			"false",
			"",
			"# When true, jail plots will prevent any PVP from occuring. Applies to jailed residents only."),
	JAIL_PREVENTS_LOGGING_OUT(
			"jail.prevent_newly_jailed_players_logging_out",
			"false",
			"",
			"# When true, Towny will prevent a person who has been jailed by their mayor/town from logging out,",
			"# if they do log out they will be killed first, ensuring they respawn in the jail."),
	JAIL_NEW_PLAYER_IMMUNITY(
			"jail.new_player_immunity",
			"1h",
			"",
			"# How long do new players have to be on the server before they can be jailed?"),
	
	BANK(
			"bank",
			"",
			"",
			"",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |                 Bank Plot settings                   | #",
			"# +------------------------------------------------------+ #",
			"############################################################",
			"# Bank plots may be used by other economy plugins using the Towny API.",			
			""),
	BANK_IS_LIMTED_TO_BANK_PLOTS(
			"bank.is_banking_limited_to_bank_plots",
			"false",
			"",
			"# If true players will only be able to use /t deposit, /t withdraw, /n deposit & /n withdraw while inside bank plots belonging to the town or nation capital respectively.",
			"# Home plots will also allow deposit and withdraw commands."),
	
	TOWN_RUINING_HEADER("town_ruining", "", "", "",
			"############################################################",
			"# +------------------------------------------------------+ #",
			"# |               Town Ruining Settings                  | #",
			"# +------------------------------------------------------+ #",
			"############################################################",
			""),
	TOWN_RUINING_TOWN_RUINS_ENABLED(
			"town_ruining.town_ruins.enabled", 
			"false",
			"",
			"# If this is true, then if a town falls, it remains in a 'ruined' state for a time.",
			"# In this state, the town cannot be claimed, but can be looted.",
			"# The feature prevents mayors from escaping attack/occupation, ",
			"# by deleting then quickly recreating their town."),
	TOWN_RUINING_TOWN_RUINS_MAX_DURATION_HOURS(
			"town_ruining.town_ruins.max_duration_hours", 
			"72",
			"",
			"# This value determines the maximum duration in which a town can lie in ruins",
			"# After this time is reached, the town will be completely deleted.",
			"# Does not accept values greater than 8760, which is equal to one year."),
	TOWN_RUINING_TOWN_RUINS_MIN_DURATION_HOURS(
			"town_ruining.town_ruins.min_duration_hours", 
			"4",
			"",
			"# This value determines the minimum duration in which a town must lie in ruins,",
			"# before it can be reclaimed by a resident."),
	TOWN_RUINING_TOWN_RUINS_RECLAIM_ENABLED(
			"town_ruining.town_ruins.reclaim_enabled", 
			"true",
			"",
			"# If this is true, then after a town has been ruined for the minimum configured time,",
			"# it can then be reclaimed by any resident who runs /t reclaim, and pays the required price. (price is configured in the eco section)"),
	TOWN_RUINING_TOWNS_BECOME_PUBLIC(
			"town_ruining.town_ruins.ruins_become_public",
			"false",
			"",
			"# If this is true, when a town becomes a ruin they also receive public status,",
			"# meaning anyone can use /t spawn NAME to teleport to that town."),
	TOWN_RUINING_TOWNS_BECOME_OPEN(
			"town_ruining.town_ruins.ruins_become_open",
			"false",
			"",
			"# If this is true, when a town becomes a ruin they also become open to join,",
			"# meaning any townless player could join the town and reclaim it.",
			"# You should expect this to be abused by players who will reclaim a town to prevent someone else reclaiming it.");

	
	private final String Root;
	private final String Default;
	private String[] comments;

	ConfigNodes(String root, String def, String... comments) {

		this.Root = root;
		this.Default = def;
		this.comments = comments;
	}

	/**
	 * Retrieves the root for a config option
	 *
	 * @return The root for a config option
	 */
	public String getRoot() {

		return Root;
	}

	/**
	 * Retrieves the default value for a config path
	 *
	 * @return The default value for a config path
	 */
	public String getDefault() {

		return Default;
	}

	/**
	 * Retrieves the comment for a config path
	 *
	 * @return The comments for a config path
	 */
	public String[] getComments() {

		if (comments != null) {
			return comments;
		}

		String[] comments = new String[1];
		comments[0] = "";
		return comments;
	}
}
