import static java.lang.Math.min;

public class default_exceptionHandler {

    public static void main(String[] args) {
        System.out.println("stuff before doStuff()");
        doStuff();
        System.out.println("stuff after doStuff()");
    }

    public static void doStuff()
    {
        System.out.println("stuff before doMoreStuff()");
        doMoreStuff();
        System.out.println("stuff after doMoreStuff()");
    }

    public static void doMoreStuff()
    {
        System.out.println("Exception to be raised");
        System.out.println(1/0);
        System.out.println("Exception raised");
    }
}
