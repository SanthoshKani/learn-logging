import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by SanthoshKani on 06-04-2016.
 */
public class Main {
    private static final Logger logger= LogManager.getLogger();
    public static void main(String... args){
        String name="Santhosh Kani S";
        logger.info("My Name is {}.",name);
    }
}
