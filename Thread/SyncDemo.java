import java.lang.*;
import java.io.*;
class First
{
    String msg;
    synchronized void Display(String msg)
    {
        this.msg=msg;
        System.out.print("["+msg);
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("]");
    }
}
class Mythread extends Thread
{
    First target;
    String msg;
    public Mythread(First target,String msg)
    {
        this.target=target;
        this.msg=msg;
        start();
    }
    public void run()
    {
        target.Display(msg);
    }

}

class SyncDemo
{
    public static void main(String[]args)
    {
        First obj=new First();
        Mythread t1=new Mythread(obj,"hello");
        Mythread t2=new Mythread(obj,"welcome");
        Mythread t3=new Mythread(obj,"hai");
    }
}
