package MultiThreading;

public class ThreadJoinExample {
    public static void main(String argvs[]) {
        ThreadJoin th1 = new ThreadJoin();
        ThreadJoin th2 = new ThreadJoin();
        ThreadJoin th3 = new ThreadJoin();
        th1.start();
        try {
            System.out.println("The current thread name is: " + Thread.currentThread().getName());
            th1.join();
        } catch (Exception e) {
            System.out.println("The exception has been caught " + e);
        }
        th2.start();
        try {
            System.out.println("The current thread name is: " + Thread.currentThread().getName());
            th2.join();
        } catch (Exception e) {
            System.out.println("The exception has been caught " + e);
        }
        th3.start();
    }
}