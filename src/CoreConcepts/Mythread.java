package CoreConcepts;

public class Mythread extends Thread {
    public void run() {
        try {
            System.out.println("Mythread running");
            Thread.sleep(2000);
            System.out.println("Mythread running again");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
    
}
