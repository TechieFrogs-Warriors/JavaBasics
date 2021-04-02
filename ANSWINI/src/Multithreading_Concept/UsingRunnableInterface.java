package Multithreading_Concept;

public class UsingRunnableInterface 
{
    //class implementing runnable interface
    class Sample  implements Runnable
    {
        //run method for thread to run the process written in the method
        public void run()
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("hi");
                //exception handling the sleep method of thread class
                try
                {
                    Thread.sleep(500);
                }catch(Exception e)
                {

                }
            }
        }
    }
    //class implementing runnable interface
    class Sample2 implements Runnable
    {
        //run method for thread to run the process written in the method
        public void run()
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("hello");
                //exception handling the sleep method of thread class
                try
                {
                    Thread.sleep(500);
                }catch(Exception e)
                {

                }
            }
        }
    }
    public static void main(String[] args) 
    {
        //creating objects for classes normally
        UsingRunnableInterface obj= new UsingRunnableInterface();
        Sample obj1 = obj.new Sample();
        Sample2 obj2 = obj.new Sample2();

        //creating thread objects
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
            
        //starting the first thread
        t1.start();
        //to handle the collision between threads using sleep method 
        try
        {
            Thread.sleep(10);
        }catch(Exception e){}
        //starting the second thread
        t2.start();
        
    }
    
}
