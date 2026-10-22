class ThreadDemo1
{
    public static void main(String A[])
    {
        System.out.println("inside main");
          Thread t = Thread.currentThread();

        System.out.println("Current Thread  name is:"+t.getName());

        System.out.println("Current thread is ID is:"+t.get ,'Id'());
        System.out.println("Thread is alive or not :"+t.isAlive());

        System.out.println("Thread priorty is:"+t.get priorty());
    }
} 