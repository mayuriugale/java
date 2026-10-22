class Demo  implements Runnable
    {
       public void run()
       {
        System.out.println("Thread is running...");
       }
    }

class ThreadDemo4
{
    public static void main(String A[])
    {
        System.out.println("inside main Thread");

          Thread dobj1 = new thread (new Demo());
          Thread dobj2 = new thread (new Demo());
          

          Demo dobj1 = new Demo();
          Demo dobj2 = new Demo();

          dobj1.start();
          dobj2.start();
}
}