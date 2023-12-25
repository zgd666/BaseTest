public class ThreadTest {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);
        t1.start();
        t2.start();
        t3.start();
    }
}

class Ticket implements Runnable {
    private int tick = 100;
    public void run() {
        while (true) {
            if (tick > 0) {
                System.out.println(Thread.currentThread
                        ().getName() + "售出车票，tick号为：" +
                        tick--);
            } else
                break;
        }
    }
}