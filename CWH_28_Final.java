class Bank{
    int getRateOfInterest(){
        return 0;
    }
}
class HDFC extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class ICICI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}
public  class CWH_28_Final{
    public static void main(String[] args) {
        HDFC s = new HDFC();
        ICICI i = new ICICI();
        SBI a = new SBI();
        System.out.println("HDFC Rate Of Interest : "+s.getRateOfInterest());
        System.out.println("ICICI Rate Of Interest : "+i.getRateOfInterest());
        System.out.println("SBI Rate Of Interest : "+a.getRateOfInterest());
    }
}