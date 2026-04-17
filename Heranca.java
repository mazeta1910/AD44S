public class Heranca {

    public static void main(String[] args) {

        // System.out.println(Thread.currentThread());

        Worker worker = new Worker();
        worker.start();

    }
}

class Worker extends Thread {

    public void run() {
        for (int i = 0; i < 900000; i++)
            System.out.println("i == " + i);
    }
}