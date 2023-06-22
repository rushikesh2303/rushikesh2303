import java.io.*;

public class Exam_3 implements Runnable {
    int i, no;

    Exam_3(int n) {
        no = n;
    }

    public void run() {
        for (int i = 1; i <= no; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        try {
            int n;
            System.out.println("\n How Many Times You Want ?");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            n=Integer.parseInt(str);
            Thread t = new Thread(new Exam_3(n));
            t.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
