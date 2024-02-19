//making and writing into file
import java.io.*;
import java.util.*;

public class  pgm1
{
        public static void main(String[]args)
        {
                try
                {
                        FileWriter writer=new FileWriter("a.txt");
                        System.out.println("enter the word");
                        Scanner sc=new Scanner(System.in);
                        String s=sc.nextLine();
                        writer.write(s);
                        writer.close();
                }
                catch(IOException e)
                {
                        System.out.println(e);
                }
        }
}
