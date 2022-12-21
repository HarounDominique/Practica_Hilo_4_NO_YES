public class HiloYesNo extends Thread {
    String yes = "YES";
    String no = "NO";

    public HiloYesNo() {
    }
    @Override
    public void run() {

        for (int i = 0; i < 30; i++) {
            System.out.println(no);
        }
        for (int i = 0; i < 30; i++) {
            System.out.println(yes);
        }
    }
}