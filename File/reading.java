//printing from file
import java.io.*;
import java.util.*;

public class pgm2
{
        public static void main(String[]args)
        {
                try
                {
                        File obj=new File("a.txt");
                        Scanner sc=new Scanner(obj);
                        while(sc.hasNextLine())
                        {
                                String b=sc.nextLine();
                                System.out.println(b);
                        }
                }catch(FileNotFoundException e)
                {
                        System.out.println(e);
                }
        }
}
