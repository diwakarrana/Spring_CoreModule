package proj2_newInstanceMethod;

import java.lang.reflect.Constructor;
import java.util.Date;

public class NewInstanceTest2 {

	public static void main(String[] args) throws Exception {
		//here parameterized constructor is used
		Class c = Class.forName("java.util.Date");
		Constructor[] ar = c.getDeclaredConstructors();
		Object obj = ar[5].newInstance(110,10,23);
		Date  d =(Date)obj;
		System.out.println(d);
		System.out.println("................................");
		
		//here user define class is used for parameterized constructor  
		Class c1 = Class.forName("proj2_newInstanceMethod.Sample");
		Constructor[] arr = c1.getDeclaredConstructors();
		Object obj1 = arr[1].newInstance(10,20);
		Sample s = (Sample)obj1;
		s.display();
	}
}
