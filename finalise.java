class trial
{
    public trial(){
    System.out.println("Constructor called");
}

    public void finalize() throws Throwable
    {
        System.out.printf("Finalize method called");
    }
}

public class finalise {
    public static void main(String[] args) {
        trial t1 = new trial();
        trial t2 = new trial();
        System.out.println("Creation done");
        t1 = null;
        t2 = null;
        System.out.println("Pointed null");
        System.gc();
        System.out.println("Done");

    }
}
