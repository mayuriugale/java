class Base                                            
{
    public int i,j;
    public Base()                                      //default
    {
        System.out.println("inside Base con");
    }


    public void fun()                                         //constructor 
    {
        System.out.println("inside Base fun");
    }
public void gun()
    {
        System.out.println("inside Base gun");
    }



}
class Derived extends Base                                      //
{
public int x,y;

public Derived()
{
    System.out.println("inside Derived con");
}
public void sun()
{
    System.out.println("inside Derived sun");
}
}
class singal
{
    public static void main(String A[])
{
   Derived dobj = new Derived();
    dobj.fun();
    dobj.gun();
    dobj.sun();
}
}
