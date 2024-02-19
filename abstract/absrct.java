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

public class absrc
