class  A{
    float a, r, pi=3.14f;
    A(float x){
        r=x;
    }
    void area(){
        a=pi*r*r;
        System.out.println("Area Of Circle : "+a);
    }
}
class B extends A{
    float h,v;
    B(float x,float y) {
        super(x);
        h=y;
    }
    void volume(){
        v=4/3f*3.14f*r*r*h;
        System.out.println("Volume : "+v);
    }
}
public class CWH_27_Inheristance {
    public static void main(String[] args) {
        B Obj=new B(1.1f,1.2f);
        Obj.area();
        Obj.volume();
    }
}
