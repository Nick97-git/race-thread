public class Main {
    public static int i;

    public static void main(String[] args) {
        Incrementer incrementer = new Incrementer();
        RacerThread racerThread = new RacerThread(incrementer);
        Thread runnableRacer = new Thread(new RacerRunnable(incrementer));
        runnableRacer.start();
        racerThread.start();
    }
}

