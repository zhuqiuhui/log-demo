import org.slf4j.Logger;
import org.slf4j.jul.JDK14LoggerFactory;


public class TestSlf4jLogging {

    public static void main(String[] args) {
        JDK14LoggerFactory jdk14LoggerFactory = new JDK14LoggerFactory();
        Logger logger = jdk14LoggerFactory.getLogger("TestSlf4jLogging");
        logger.error("this is error");
        logger.info("this is info");
        logger.warn("this is warn");
        //......
    }
}
