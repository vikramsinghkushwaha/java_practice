class JavaException {
    public static void main(String[] args) {
        try
        {
            throw new MyException(2);
            System.out.println("Hello");
        }

        catch(MyException e)
        {
            System.out.println(e);
        }
    }
}

public class MyException extends Exception{
    int a;

    public MyException(int b)
    {
        this.a = b;
    }

    public String toString()
    {
        return("Exception number=" +a);

    }
}