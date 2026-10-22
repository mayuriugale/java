class Demo extends Thread               //child class ahe ha
    {
        Demo(String name)    // use constructor je apn main class madhe add karto ti accept sathi use hoto.
        {
            super(name);       // super means parent class la refer karto... ithe parent class mhnje thread la 
        }
       public void run()       // thread ch actual kam he run()madhe ast.
       {
        try
        {

    
            int i=0;
            for(i=1; i<=10; i++)
        {
        System.out.println("Thread "+Thread.currentThread().getName()+" "+i);//

        Thread.sleep(1000);          
       }
    }
    catch(Exception eobj)
    {}
    }
    }

class ThreadDemo9
{
    public static void main(String A[]) throws InterruptedException
    {
        System.out.println("inside main Thread"); 
          Demo Dobj1 = new Demo("F_Thread");
          Demo Dobj2 = new Demo("S_Thread");
          
           Dobj1.start();
           Dobj1.join(); 

          Dobj2.start();                     
          Dobj2.join();
          System.out.println("end of main thread");                 //issus
}
}

//Extends thread->thread la banavnyasathi
//constructor->thread la suru karneyasthi
//current thread()->chalum thraed milneysathi
//getName()->thread chi name
//sleep(1000)->1 second thbne
//join()->thread complete hoilparent wait karne.
itszz_sb.6696