class Demo                      //default ,paramertrised add 
{
    public Demo()
    {
        System.out.println("inside default con");
    }
     public Demo(int i,int j )
    {
        System.out.println("inside default con");
    }

}
class Constructers_Demo                             
{

    public static void main(String A[])                                  //
    {

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo(11,21);                         //parametre
    }
}