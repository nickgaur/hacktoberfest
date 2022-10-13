class print implements Runnable 
{
    String name;
    print (String thread)
	{
      name = thread;
    }
    public void run() 
    {
      try 
      {
        for(int i=5;i>0;i--) 
	    {
          System.out.println(name + ": " + i);
          Thread.sleep(1000);
        }
	  }
      catch (InterruptedException e) 
      {
        System.out.println(name + "Interrupted");
      }
     System.out.println(name + " exiting.");
    }
    
}


class print1 implements Runnable 
{
    String name1;
    print1 (String thread)
	{
      name1 = thread;      
    }
    public void run() 
    {
      try 
      {
        for(int i=1;i<=5;i++) 
	    {
          System.out.println(name1 + ": " + i);
          Thread.sleep(1000);
        }
	  }
      catch (InterruptedException e) 
      {
        System.out.println(name1 + "Interrupted");
      }
     System.out.println(name1 + " exiting.");
    }
    
}


class labMultiThread 
{
 public static void main(String args[]) 
  {
	  Thread t1 = new Thread(new print("Thread - T1")); 
	  Thread t2 = new Thread(new print1("Thread - T2"));   
	  t1.start(); 
	  t2.start();
    try 
	{
                Thread.sleep(10000);
             } 
	catch (InterruptedException e) 
	{
                 System.out.println("Main thread Interrupted");
           }
      System.out.println("Main thread exiting.");
  }
}
