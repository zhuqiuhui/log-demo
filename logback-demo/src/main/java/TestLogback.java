import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogback {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(TestLogback.class);
        logger.trace("this is trace");
        logger.debug("this is debug");
        logger.info("this is info");
        logger.warn("this is warn");
        logger.error("this is error");
    }
}
