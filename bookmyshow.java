class TBA implements Runnable{
    int avt=5;
    public void run()
    {
        String name = Thread.currentThread().getName();
        synchronized(this)
        {
            System.out.println(name+" you are trying to book the ticket for PUSHPA 2");
            if(avt>0)
            {
                try{
                    Thread.sleep(5000);
                }catch(InterruptedException e)
                {
                    System.out.println(name+" "+e);
                }
                avt--;
                System.out.println(name+" Your ticket is booked for PUSHPA 2");
            }else{
                System.out.println(name+" Sorry Go and ask Allu arjun ");
            }
        }
    }
}
class bookmyshow{
    public static void main(String args[])
    {
        TBA g = new TBA();
        Thread t1 = new Thread(g,"sumanth");
        Thread t2 = new Thread(g,"Shashi");
        Thread t3 = new Thread(g,"jeevan");
        Thread t4 = new Thread(g,"akashya");
        Thread t5 = new Thread(g,"malleswari");
        Thread t6 = new Thread(g,"Anusha");
        Thread t7 = new Thread(g,"chaitra");
        Thread t8 = new Thread(g,"poti");
        Thread t9 = new Thread(g,"jani");
        Thread t10 = new Thread(g,"evaro");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}