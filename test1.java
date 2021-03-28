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
		i = f;//*failed
		i = d;//*failed
		i = l;
		i = b;
		i = s;
		f = i;//*failed
		f = d;//*
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
		double d7 = 10F;//* failed
		short s7 = 5L;//*
		int i7 = 10.5;//*
		float f7 = 10L;//* failed
		int i6 = 10;
		long l7 = 10L;
		double d6 = 20;
		double d5 = 10L;//* failed
		
//		Q11
//		Which tree lines fait to compile?:
		int ivar = 100;
		double dvar = 123;
		float fvar = 200;//*
		ivar = fvar;
		fvar = ivar;//*
		dvar = ivar;
		fvar = dvar;
		dvar = ivar;//*
		ivar = dvar;
		
//		Q14
//		What is the value of b?
		long size = 30L;
		long area = (short)size;
//		Possible answer 30, 30.0, 30L, 0
//		My answered was 0 thinking it lost data but due 30 is inside the range of 
//		short type result goes on been 30
		
//		Q16
//		What is the value of c?
		float euros = 100.987_6543f;
		short liras = (byte) euros;
		byte dollars = (byte) liras;
//		Possible answers: 0, Compilation fails, 100.9876543, 100
//		My answer was 0 due the same reason in Q14, but the right answer is 100 since it is
//		the byte data type range.
		
//		Q19
		int apples = 9, pears = 0, apricots = apples/pears;
		System.out.println(apricots*pears);
//		Possible answers: 0, compilation fails, 9, throws error message.
//		My answer was 0 but the right one is "throws error message" since the = value is not accepted 
//		as possible output unless it will be up to zero
		
//		Q20
//		what is the output?
		long lions = 3_000L;
		double tigers =(float) lions;
		int cheetah = (short) tigers;
		System.out.println(cheetah%1000);
//		Possible answers: -1, 2, 0, 1
//		My answer was 1 but the right answer is 0 since the value assigned to c does not change
//		because it is inside the data type range.
		
//		Q21
//		What is the output of: 
		System.out.println (10/3);
		/*Possible answers are: compliaton fails, 3.333333335,  3,  3.0
		 * My answer was compilation fails due I though we cannot operate without 
		 * variables, I mean directly by System.out.println
		 * Right answer of course is 3*/
		 
//		Q22
//		What is the output of:
		System.out.println((int)(10.0/3));
//		My answer was same Q1 because same reason I though
//		Right answer is 3 again and this time through explicit cast we force to decimal number
//		become integer number so that's the reason it does not give decimal as output
		
//		Q25
//		What will be the output or this code?
		System.out.println(1/2+3/2+0.1);
//		Possible results are 2.1 or 1.1
//		I am still trying my best to understand why is 1.1 
//		first I divide left to right = 0.5 + 3/2 + 0.1 = 0.5 + 1.5 + 0.1
//		now I add = 2 + 0.1 = 2.1
		 
//		Q26
//		What will be the output of this code?
		System.out.println(- -1-3*10/5-1);
//		possible answers: -4 or -6
//		My answer was -4, I did not considerer right the precedence of operators
//		first arithmetics operators (/ * %) so -->    - -1 - 30/5 - 1 = - -1- 6 - 1
//		now unary operators additives (+ -) --->  +1-6-1
//		now arithmetics operators (+ -) --> -5-1 = -6
		
//		Q27
//		What will be the output of this code?
		int x= 3;
		int y= ++x * 5 / x-- + --x;
		System.out.println(y);
//		My answer was 9 I understand now my error
//		first i add +1 to x so I perform multiplication --> 4*5 / x-- + --x; = 20/ x-- + --X;
//		now I divide 20 / 4 because 4 is the current x value 					20/4   * --x;
//		and after operation it will decrease -1 --> 							5 + --x;
//		now x = 3 and we decrease again x - 1 but this time before operation 	5 *   2; = 7
		
//		Q28
//		What will be the output of this code?
		int m= 9, n=1, t=0;
		m--;
		n= n + 2;
		t= t + m + n;
		System.out.println(t);
//		My answer is 12 and the right answer is 11
//		1. the value assigned to m does not change -1 at the 
//		beegining so m-- still goes on been 9, next time will become 8
//		the value of n is 3
//		now we use again m with his new value so t=0+8+3=11
		
		
		
//		
		
		
		
		
				
		

	}

}
