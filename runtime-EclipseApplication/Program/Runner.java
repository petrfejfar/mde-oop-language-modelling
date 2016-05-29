public class Runner
{
    /* Generated class variables */
    int i;
    
    /* Generated class methods */
    public static void main(String[] args)
    {
        int i = 42;
        Program prog = new Program();
        while (i > 0)
        {
            prog.Foo(i);
            i = i - 1;
        }
    }	
    private int Foo(int n)
    {
        i = 0;
        if(n < 10)
        {
            Console.WriteLine("n less than 10. n = {0}", n);
        }
        else
        {
            Console.WriteLine("n at least 10");
        }
        Console.WriteLine("Foo is done!");
    }	
}

public class Utils
{
    /* Generated class variables */
    float n;
    
    /* Generated class methods */
    private int Func1()
    {
        //Could not find behaviour for method Utils.Func1
    }	
    private int Func2(int n)
    {
        //Could not find behaviour for method Utils.Func2
    }	
}

