package cn.railgunhamster.test.common.core
/*
 * Configuration
 * Mod
 * ConfigChangedEvent
 */
import net.minecraftforge.common.config.Config
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.client.event.ConfigChangedEvent
/*
 * Constant
 * logger
 */
import cn.railgunhamster.test.common.data.Constant
import cn.railgunhamster.test.common.core.LogHelper
/*
 * Core Configuration Class
 * 主要是用forge提供的@Config封装自己的Config File
 * 并且这个Config还是Core的
 */
@Config(
  modid    = Constant.MOD_ID,
  name     = Constant.MOD_NAME,
  category = ""
)
@Mod.EventBusSubscriber(
  modid = Constant.MOD_ID
)
object TestCoreConfig {
  @net.minecraftforge.fml.common.eventhandler.SubscribeEvent
  fun onConfigChanged(event: ConfigChangedEvent.OnConfigChangedEvent) {
    LogHelper.info("config changed")
  }

  @Config.Comment("Test 1 comment.")
  @Config.LangKey("test.config.test1")
  @Config.Name("Test1")
  val TEST1 = Test1()

  class Test1 {
    @Config.Comment("test 1 first.")
    @Config.LangKey("test.config.test1.first")
    @Config.Name("First")
    var first = true;
  }
}
