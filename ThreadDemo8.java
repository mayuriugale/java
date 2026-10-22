class Demo extends Thread
    {
        Demo(String name)
        {
            super(name);
        }
       public void run()
       {
            int i=0;
            for(i=1; i<=10; i++)
        {
        System.out.println("Thread "+Thread.currentThread().getName()+" "+i);
       }
    }
    }

class ThreadDemo8
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("inside main Thread"); 
        
          Demo Dobj1 = new Demo("F_Thread");
          Demo Dobj2 = new Demo("S_Thread");
          
           Dobj1.start();
          Dobj2.start();

          Dobj1.join();                        
          Dobj2.join();

          System.out.println("end of main thread");                 //issus
}
}