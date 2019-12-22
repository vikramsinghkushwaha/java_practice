import java.io.PrintWriter;

public class checked_exception {
    public static void main(String[] args) {
        PrintWriter pw = new  PrintWriter("abc.txt");
        pw.println("checked exception");
    }
}
