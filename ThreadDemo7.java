class Demo extends Thread
    {
        Demo(String name)
        {
            super(name);
        }
       public void run()
       {
        System.out.println("running"+currentThread().getName());
       }
    }

class ThreadDemo7
{
    public static void main(String A[]) throws Exception
      {
        System.out.println("inside main Thread"); 

          Demo Dobj1 = new Demo("first_Thread");
          Demo Dobj2 = new Demo("second_Thread");

          
           Dobj1.start();
           Dobj2.start();

          Dobj1.join();                        
          Dobj2.join();

          

          System.out.println("end of main thread");                 //issus
}
}