import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSlf4jSimple {

    public static void main(String[] args) {
        // 生成 SimpleLogger 实例
        Logger logger = LoggerFactory.getLogger(TestSlf4jSimple.class);
        logger.info("this is info");
        logger.warn("this is warn");
        logger.error("this is error");
        logger.debug("this is debug");
    }
}
