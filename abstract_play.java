abstract class a 
{
	public void display(){
		System.out.println("In display");
	}

	abstract  void dis();
	abstract  void desp();
}

// class b extends a{
// 	public void dis(){
// 		System.out.println("class b: in dis");
// 	}
// }

class c extends a{
	public void dis(){
		System.out.println("class c: in dis");
	}

	public void desp(){
		System.out.println("In class c: in desp");
	}

}

public class abstract_play{
	public static void main(String[] args){
		// a ob1 = new a(); #cannnot create object of abstract class
		c obj2 = new c();		
		obj2.display();
	}
}