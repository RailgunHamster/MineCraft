package cn.railgunhamster.common.core

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent
import org.apache.logging.log4j.Logger;

/*
 * @author RailgunHamster
 * 入口类
 */
@Mod(
	modid = Test.MOD_ID,
	name = Test.NAME,
	version = Test.VERSION,
	acceptedMinecraftVersions = Test.MC_VERSION,
	dependencies = """required:forge@[14.23.4.2749,);""",
	modLanguageAdapter = "net.shadowfacts.forgelin.KotlinAdapter"
)
object Test {
	// 字面常量
	const val NAME			 = "Test"
	const val MOD_ID 		 = "test"
	const val VERSION		 = "1.0"
	const val MC_VERSION = "[1.12.2, 1.13)"

	/*
	 * Logger
	 * 所有debug, info, error信息均由此输出
	 * optional，初始化为null，在preinit中赋值
	 */
	var logger: Logger? = null

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
	fun OnPreInit(event: FMLPreInitializationEvent) {
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
	fun OnInit(event: FMLInitializationEvent) {
		this.logger?.info("init")
	}

	/*
	 * MC post init
	 *
	 * Recommended activities: interact with other mods to establish cross-mod behaviours.
	 */
	@Mod.EventHandler
	fun OnPostInit(event: FMLPostInitializationEvent) {
		this.logger?.info("post init");
	}
}
