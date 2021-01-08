public class TestThread {
    public static void main(String[] args) throws InterruptedException{
        OddThread oddThread1 = new OddThread();
        EvenThread evenThread = new EvenThread();

        Thread thread1 = new Thread(oddThread1);
        Thread thread2 = new Thread(evenThread);

        thread1.start();
        thread1.join();
        thread2.start();
        System.out.println("hi");
    }
}
