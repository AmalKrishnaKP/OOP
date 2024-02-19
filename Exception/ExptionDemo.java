//exception
import java.io.*;
import java.util.*;
class EvenException extends Exception
{
        public String toString()
        {
                return "even";
        }
}
class OddException extends Exception
{
        public String toString()
        {
                return "odd";
        }
}

public class ExptionDemo
{
        public static void check(int num)throws EvenException,OddException
        {
                if(num%2==0)
                        throw new  EvenException();
                else
                        throw new OddException();
        }
        public static void main(String[]args)
        {
                int num;
                System.out.println("enter the number");
                Scanner sc=new Scanner(System.in);
                num=sc.nextInt();
                try
                {
                        ExptionDemo.check(num);
                }catch(EvenException e)
                {
                        System.out.println(e);
                }catch(OddException ex)
                {
                        System.out.println(ex);
                }
        }
}
