public class throws_test{

	public static void main(String[] args) throws InterruptedException{
		Thread t = new Thread();
		t.sleep(10000);
		//delegated exception handling to the called function
		//It is only for checked exception
		//No meaning in using it against the unchecked exception
		//Try catch can also be used instead of throws
		//This is abnormal termination
	}
}