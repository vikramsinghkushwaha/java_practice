abstract class a
{
	public void display()
	{
		System.out.println("In display");
	}

	public abstract void dis();
}

class b extends a{
	public void dis()
	{
		System.out.println("in dis");
	}
}
public class absstract{
	public static void main(String[] args){
		b A = new b();
		A.display();
	}
}