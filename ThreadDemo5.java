class Demo extends Thread
    {
       public void run()
       {
        System.out.println("running");
       }
    }

class ThreadDemo5
{
    public static void main(String A[])
    {
        System.out.println("inside main Thread");
          Demo dobj1 = new Demo();
          Demo dobj2 = new Demo();

          dobj1.start();
          dobj2.start();

          System.out.println("end of main thread");                 //issus
}
}