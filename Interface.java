public class Interface {

    public static void main(String[] args) {

        // System.out.println(Thread.currentThread());

        Thread thread = new Thread(new Worker());
        thread.start();

    }
}

class Worker implements Runnable {

    public void run() {
        for (int i = 0; i < 900000; i++)
            System.out.println("i == " + i);
    }
}