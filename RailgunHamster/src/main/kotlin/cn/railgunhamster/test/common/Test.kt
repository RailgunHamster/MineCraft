package cn.railgunhamster.test.common
/*
 * forge Mod
 */
import net.minecraftforge.fml.common.Mod
/*
 * mine
 */
import cn.railgunhamster.test.common.data.Constant

/*
 * @author RailgunHamster
 * 入口类
 */
@Mod(
	modid = Constant.MOD_ID,
	name = Constant.MOD_NAME,
	version = Constant.VERSION,
	acceptedMinecraftVersions = Constant.MC_VERSION,
	dependencies = Constant.MOD_DEPENDENCIES,
	modLanguageAdapter = Constant.LANGUAGE_ADAPTER
)
object Test {
	/*
	 * Logger
	 * 所有debug, info, error信息均由此输出
	 * optional，初始化为null，在preinit中赋值
	 */
	var logger: org.apache.logging.log4j.Logger? = null

	/*
	 * MC preinit
	 *
	 * Recommended activities:
	 * 	Setup your logging {@link #getModLog()}
	 * 	Load any configuration data you might have {@link #getSuggestedConfigurationFile()}
	 * 	Search for a version.properties file and load it {@link #getVersionProperties()}
	 * 	Configure your {@link ModMetadata} programmatically {@link #getModMetadata()}
	 * 	Discover parts of your mod by using annotation search {@link #getAsmData()}
	 */
	@Mod.EventHandler
	fun onPreInit(event: net.minecraftforge.fml.common.event.FMLPreInitializationEvent) {
		// 从event中获取logger信息
		this.logger = event.getModLog()
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
		this.logger?.info("init")
	}

	/*
	 * MC post init
	 *
	 * Recommended activities: interact with other mods to establish cross-mod behaviours.
	 */
	@Mod.EventHandler
	fun onPostInit(event: net.minecraftforge.fml.common.event.FMLPostInitializationEvent) {
		this.logger?.info("post init");
	}
}
