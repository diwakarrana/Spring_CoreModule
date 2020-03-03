package proj2_newInstanceMethod;

import java.util.Date;

public class NewInstanceTest {

	public static void main(String[] args) throws Exception {
		
		Class c = Class.forName("java.util.Date");
		Object obj = c.newInstance();
		Date  d =(Date)obj;
		System.out.println(d);
		System.out.println("..............................");
		
		Class c1 = Class.forName("proj2_newInstanceMethod.Sample");
		Object obj1 = c1.newInstance();
		Sample s = (Sample)obj1;
		s.display();
	}
}
