import java.util.logging.Logger;

public class TestLogging {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("TestLogging");
        logger.severe("this is severe"); // 严重
        logger.info("this is info");
        logger.warning("this is warn");
        logger.config("this is config");
        logger.fine("this is fine");
        //......
    }
}
