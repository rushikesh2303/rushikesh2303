public class CWH_39_Thread extends Thread {
    String str;
    int n;

    CWH_39_Thread(String str, int n) {
        this.str = str;
        this.n = n;
    }

    public void run() {
        try {
            for (int i = 1; i <= n; i++) {
                System.out.println(str+" "+i+"Times");
            }
            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CWH_39_Thread t1 = new CWH_39_Thread("COVID19", 10);
        t1.start();
        CWH_39_Thread t2 = new CWH_39_Thread("LOCKDOWN2020", 20);
        t2.start();
        CWH_39_Thread t3= new CWH_39_Thread("VACCINATED", 30);
        t3.start();

    }
}

//import java.io.*;
//import java.lang.String;
//public class CWH_39_Thread extends Thread {
//    String str = "";
//    int n;
//
//    CWH_39_Thread(String str, int n) {
//        this.str = str;
//        this.n = n;
//    }
//
//    public void run() {
//        try {
//            for (int i = 1; i <= n; i++) {
//                System.out.println(str + " " + i + " times ");
//            }
//            System.out.print("\n");
//        } catch (Exception e) {
//            System.out.println("Error"+e);
//        }
//    }
//
//        public static void main(String[] args) {
//            int n=10;
//            CWH_39_Thread t1 = new CWH_39_Thread("COVID19", 10);
//            t1.start();
//            CWH_39_Thread t2 = new CWH_39_Thread("LOCKDOWN2020", n+10);
//            t2.start();
//            CWH_39_Thread t3 = new CWH_39_Thread("VACCINATED", n+20);
//            t3.start();
//
//        }
//    }
