public class try_catch {

    public static void main(String[] args) {
        System.out.println("stmt 1");

        try
        {
            System.out.println("stmt 2");
            System.out.println("1/0");
            System.out.println("stmt 3");
        }

        catch(ArithmeticException a)
        {
            System.out.println("stmt 4");
            a.printStackTrace();
        }
        System.out.println("stmt 5");
    }
}
