
public class SwapTest {
	
	int a;
	SwapTest(int i) {
		a = i;
	}
	
	void swap(SwapTest ob1, SwapTest ob2) {
		int t;
		
		t = ob1.a;
		ob1.a = ob2.a;
		ob2.a = t;
		
	}
	
	public static void main(String[] args) {
		SwapTest st1 = new SwapTest(7);
		SwapTest st2 = new SwapTest(9);
		System.out.println("Before swap.");
		System.out.println("st1.a: " + st1.a);
		System.out.println("st2.a: " + st2.a);
		
		st1.swap(st1, st2);
		
		System.out.println("After swap.");
		System.out.println("st1.a: " + st1.a);
		System.out.println("st2.a: " + st2.a);
		

		


		
		
	}

}
