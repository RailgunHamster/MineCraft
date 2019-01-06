package cn.railgunhamster.test.common.core
/*
 * forge Mod
 */
import net.minecraftforge.fml.common.Mod
/*
 * constant
 * logger
 */
import cn.railgunhamster.test.common.data.Constant
import cn.railgunhamster.test.common.core.LogHelper
/*
 * @author RailgunHamster
 * 核心，要处理各种init事件
 */
@Mod(
	modid                     = Constant.MOD_ID,
	name                      = Constant.MOD_NAME,
	version                   = Constant.VERSION,
	acceptedMinecraftVersions = Constant.MC_VERSION,
	dependencies              = Constant.MOD_DEPENDENCIES,
	modLanguageAdapter        = Constant.LANGUAGE_ADAPTER
)
object TestCore {
	/*
	 * MC preinit
	 *
	 * Recommended activities:
	 * 	Load any configuration data you might have {@link #getSuggestedConfigurationFile()}
	 * 	Search for a version.properties file and load it {@link #getVersionProperties()}
	 * 	Configure your {@link ModMetadata} programmatically {@link #getModMetadata()}
	 * 	Discover parts of your mod by using annotation search {@link #getAsmData()}
	 */
	@Mod.EventHandler
	fun onPreInit(event: net.minecraftforge.fml.common.event.FMLPreInitializationEvent) {
		// 从event中获取logger
		LogHelper.onPreInit(event.getModLog())
	}
	/*
	 * MC init
	 *
	 * Recommended activities: Register your recipes and Ore Dictionary entries in the
	 *	{@link net.minecraftforge.fml.common.registry.GameRegistry} and {@link net.minecraftforge.oredict.OreDictionary}
	 *	Dispatch requests through {@link FMLInterModComms} to other mods, to tell them what you wish them to do.
	 */
	@Mod.EventHandler
	fun onInit(event: net.minecraftforge.fml.common.event.FMLInitializationEvent) {
		LogHelper.info("init")
	}
	/*
	 * MC post init
	 *
	 * Recommended activities: interact with other mods to establish cross-mod behaviours.
	 */
	@Mod.EventHandler
	fun onPostInit(event: net.minecraftforge.fml.common.event.FMLPostInitializationEvent) {
		LogHelper.info("post init");
	}
}
