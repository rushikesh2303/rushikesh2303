public class CWH_21_Array {
    public static void main(String[] args) {
//        1-Dimension Array
//        int []marks = {90,85,45,68,75,92,70};
//        System.out.println(marks.length);
//        System.out.println(marks[5]);
//        Print Array Using For Loop
//        for (int i=0; i< marks.length; i++)
//        {
//            System.out.println(marks[i]);
//        }

//        2- Dimension Array
//        System.out.println("Multi-Dimension Array ");
//        int [][]flats;
//        flats = new int[2][3];
//        flats [0][0]=101;
//        flats [0][1]=102;
//        flats [0][2]=103;
//        flats [1][0]=201;
//        flats [1][1]=202;
//        flats [1][2]=203;
//        for (int i=0; i<flats.length;i++)
//        {
//            for (int j=0; j<flats[i].length;j++)
//            {
//                System.out.print(flats[i][j]);
//                System.out.print("   ");
//            }
//            System.out.println("\n");
//        }

        String []Cricketer={"Kl Rahul","Rohit Sharma","Virat Kohali","Suryakumar Yadhav","Rishabh Pant","Hardik Pandya",
        "Ravindra Jadeja","Y Chahal","Harshal Patel","Buvi Kumar","Jasprit Bumrah"};
//        System.out.println(Cricketer.length);
        for (int i=0; i< Cricketer.length;i++)
        {
            System.out.println(Cricketer[i]);
        }
    }
}
