package assesmentTest1;

public class test1 {

	public static void main(String[] args) {
	
//		Q3
//		Whick lines will guve compolie error?
		
		int i= 100;
		float f= 200f;
		double d = 300L;
		long l = 5000L;
		byte b = 5;
		short s =  7;
//		error reasons =smaller data types going to bigger data types
		i = f;//failed
		i = d;//failed
		i = l;
		i = b;
		i = s;
		f = i;//failed
		f = d;
		f = b;
		f = s;
		f = l;
		d = f;
		d = i;
		d = b;
		d = l;
		d = s;
		
/*		Q7
/		which of the following code fragments fail to compile?
 * 		Small data types can be inside bigs data types*/
		double d7 = 10F;//failed
		short s7 = 5L;//*********************why I cant convert it in int by explicit cast?
		int i7 = 10.5;//*********************why I cant convert it in int by explicit cast?
		float f7 = 10L;//failed
		int i6 = 10;
		long l7 = 10L;
		double d6 = 20;
		double d5 = 10L;//failed
		
		
				
		

	}

}
