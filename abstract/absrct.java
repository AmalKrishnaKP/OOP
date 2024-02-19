//abstract class
abstract class shape
{
        abstract void sides();
}
class rectangle extends shape
{
        void sides()
        {
                System.out.println("4 sides");
        }
}

class triangle extends shape
{
        void sides()
        {
                System.out.println("3 sides");
        }
}
class hexagone extends shape
{
        void sides()
        {
                System.out.println("6 sides");
        }
}

public class absrct
{
        public static void main(String[]args)
        {
                rectangle rec=new rectangle();
                triangle tri=new triangle();
                hexagone hex=new hexagone();
                rec.sides();
                tri.sides();
                hex.sides();
        }
}                
