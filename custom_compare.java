import java.util.*;

class A implements Comparator{
	public int compare(Object obj1, Object obj2){
		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;

		if(i1 < i2){
			return -1;
		}

		else if(i1 > i2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	//No need to define equals as it is defined in object class which is extended by each and every class
}

public class custom_compare{
	public static void main(String[] args){
		A a = new A();
		System.out.println(a.compare(1,2));
	}
}