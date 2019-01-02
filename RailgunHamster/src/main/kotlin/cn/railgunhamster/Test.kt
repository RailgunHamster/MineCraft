package cn.railgunhamster

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import org.apache.logging.log4j.Logger;

/*
 * @author RailgunHamster
 */
@Mod(
	modid = Test.MOD_ID,
	name = Test.NAME,
	version = Test.VERSION,
	acceptedMinecraftVersions = Test.MC_VERSION,
	dependencies = """required-after:forge@[14.23.4.2749,);""",
	modLanguageAdapter = "net.shadowfacts.forgelin.KotlinAdapter"
)
object Test {
	const val NAME			 = "Test"
	const val MOD_ID 		 = "test"
	const val VERSION		 = "1.0"
	const val MC_VERSION = "[1.12.2, 1.13)"

	var logger: Logger? = null

	@Mod.EventHandler
	fun preInit(event: FMLPreInitializationEvent) {
		this.logger = event.getModLog()
	}

	@Mod.EventHandler
	fun init(event: FMLInitializationEvent) {
		this.logger?.info("Hello from Kotlin!")
	}
}
