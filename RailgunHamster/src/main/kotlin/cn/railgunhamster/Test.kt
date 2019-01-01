package cn.railgunhamster.Test

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
	modLanguageAdapter = "cn.shadowfacts.forgelin.KotlinAdapter"
)
object Test {
	public val NAME				= "Test"
	public val MOD_ID 		= NAME.toLowerCase()
	public val VERSION		= "1.0"
	public val MC_VERSION = "[1.12.2, 1.13)"

	var logger: Logger?

	@Mod.EventHandler
	fun preInit(event: FMLPreInitializationEvent) {
		this.logger = event.getModLog()
	}

	@Mod.EventHandler
	fun init(event: FMLInitializationEvent) {
		this.logger.info("Hello from Kotlin!")
	}
}
