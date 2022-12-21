import org.apache.log4j.Logger;

public class TestSlf4jLog4J {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(TestSlf4jLog4J.class);
        logger.info("this is info");
        logger.warn("this is warn");
        logger.error("this is error");
        logger.fatal("this is fatal");
    }
}
