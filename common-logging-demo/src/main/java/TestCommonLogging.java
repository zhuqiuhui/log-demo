import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestCommonLogging {

    public static void main(String[] args) {
        Log logger = LogFactory.getLog(TestCommonLogging.class);
        logger.info("this is info");
        logger.warn("this is warn");
        logger.error("this is error");
        logger.fatal("this is fatal");
    }
}
