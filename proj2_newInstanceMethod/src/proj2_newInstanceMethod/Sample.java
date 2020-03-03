package proj2_newInstanceMethod;

public class Sample {
	
	private int x, y;
	// zero parameterized constructor is declared here....................
	public Sample() {
		System.out.println("this is from 0 param constructor");
	}
	//parameterized constructor  
	public Sample(int x, int y) {
		System.out.println("this is from parameterized constructor");
		this.x = x;
		this.y = y;
	}

	void display() {
		System.out.println("values of x = "+x+" and y = "+y);
	}
}
