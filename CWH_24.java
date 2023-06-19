//import required classes
//package javaTpoint.JavaExample;

//create class AmericanFlagExample that will print American flag star pattern
public class CWH_24 {

    // main() method start
    public static void main(String[] args) {

        // declare and initialize variables
        int height =  26;
        int width = 40;
        int temp = 3;

        // we use only one nested loop to print all the parts of the flag
        for(int m = 0; m<= height; m++) {
            for(int n = 0; n <= width; n++){
                // print American flag
                if(m < 5 && n > 14){
                    if((m + n) % 2 == 0 && n < 26){
                        System.out.print("*");
                    } else if(n > 26){
                        System.out.print("=");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if(m < 9 && n < 15) {
                        System.out.print(" ");
                    }
                    if(m > 4 && m < 9 && n > 13 && n <40) {
                        System.out.print("=");
                    }
                }
                if( m >= 9 && m <= 19) {
                    // print stick of the flag
                    if(n == 15) {
                        System.out.print("|");
                    } else {
                        System.out.print(" ");
                    }
                }
                // print stairs of the flag
                if( m >= 20) {
                    if(m % 2 == 0) {
                        if(n >= 15 - temp && n <= 15 + temp) {
                            System.out.print("-");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        if(n == 15 - temp || n == 15 + temp) {
                            System.out.print("|");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            }
            if(m >= 20) {
                if(m % 2 != 0) {
                    temp++;
                }
            }
            System.out.print("\n");
     }
}
}