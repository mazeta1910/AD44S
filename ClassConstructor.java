public class ClassConstructor {
    public static void main(String[] args) throws InterruptedException {
        int total = 10;
        int half = total / 2;

        Worker worker = new Worker(0, half, "Thread1");
        Worker worker2 = new Worker(half, total, "Thread2");
        worker.start();
        worker.join();
        worker2.start();
        worker2.join();

    }
}

class Worker extends Thread {
    private int start, end;

    public Worker(int start, int end, String name) {
        super(name);
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i < end; i++)
            System.out.println(Thread.currentThread().getName() + " i == " + i);
    }
}