import java.sql.SQLOutput;
import java.util.Locale;
public class CWH_7 {
    public static void main(String[] args) {
        String name="Rushikesh";
        System.out.println(name);

//        String Name=new String("Harry");
//        int value=name.length();
//        System.out.println(value);

//        All Word Are Lower Case
//        ------------------------
//        String lstring = name.toLowerCase();
//        System.out.println(lstring);

//        All Word Are Uppercase
//        ------------------------
//        String ustring = name.toUpperCase();
//                OR
//        name = name.toUpperCase();
//                OR
//        System.out.println(name.toUpperCase());

//        String nonTrimmedString="       Harry       ";
//        System.out.println(nonTrimmedString);
//        String trimmedString = nonTrimmedString.trim();
//        System.out.println(trimmedString);
//                OR
//        System.out.println(nonTrimmedString.trim());

//        System.out.println(name.substring(4));
//        System.out.println(name.substring(1,9));

//        System.out.println(name.replace("sh","sha"));
//        System.out.println(name.replace("Rushi","Hrushi"));

//        System.out.println(name.startsWith("Rushi"));
//        System.out.println(name.startsWith("Hr"));
//        System.out.println(name.endsWith("kesh"));
//        System.out.println(name.endsWith("Kesh"));

//        System.out.println(name.charAt(20));

//        System.out.println(name.indexOf("k"));
//        System.out.println(name.indexOf("f"));
//        System.out.println(name.indexOf("sh",5));
//        System.out.println(name.indexOf("si"));

//        System.out.println(name.equals("Rushikesh"));
//        System.out.println(name.equals("Rushikes"));

//        System.out.println(name.equalsIgnoreCase("Rushikesh"));
//        System.out.println(name.equalsIgnoreCase("Rushikkesh"));

//        System.out.println("\t"+ name);
//        System.out.println("\n"+ name);
//        System.out.println("\""+ name);
//        System.out.println("\\"+ name);

//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());

//        String letter = "Dear Name, Thanks a Lot !";
//        System.out.println(letter.replace("Name","Rushikesh"));
//                        OR
//        String letter1 = "Dear Name, Thanks a Helffull!";
//        letter1 = letter1.replace("Name","Rushikesh");
//        System.out.println(letter1);

        String myString = "This String Contain Double  Triple Spaces ";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("Spaces"));

    }
}
