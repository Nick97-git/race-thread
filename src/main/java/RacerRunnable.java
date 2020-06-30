import org.apache.log4j.Logger;

public class RacerRunnable implements Runnable {

    private final Incrementer incrementer;
    private final Logger logger = Logger.getLogger(RacerRunnable.class);

    public RacerRunnable(Incrementer incrementer) {
        this.incrementer = incrementer;
    }

    @Override
    public void run() {
        while (!incrementer.isFinish()) {
            incrementer.inc();
            logger.info("Runnable: " + incrementer.getPosition());
        }
        logger.info("Runnable has finished!");
    }
}
