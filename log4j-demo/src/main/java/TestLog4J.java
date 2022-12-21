import org.apache.log4j.Logger;

public class TestLog4J {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(TestLog4J.class);
        logger.info("this is info");
        logger.warn("this is warn");
        logger.error("this is error");
        logger.fatal("this is fatal");
    }
}
