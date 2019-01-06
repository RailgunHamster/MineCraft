package cn.railgunhamster.test.common.core

/*
 * logger
 */
import org.apache.logging.log4j.Logger

/*
 * 封装logger
 * 统一使用
 */
object LogHelper {
	/*
	 * Logger
	 * 所有debug, info, error信息均由此输出
	 * optional，初始化为null，preinit时赋值
	 */
	private lateinit var logger: Logger

  /*
   * 初始化步骤
   */
  fun onPreInit(logger: Logger) {
    this.logger = logger
  }

  /*
   * wrapper
   */
  fun info(any: Any) {
    this.logger.info(any)
  }
}
