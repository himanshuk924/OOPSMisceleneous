package ComplexNum;
public class ComplexTest {

	public static void main(String[] args) {
		Complex num1=new Complex();
		Complex num2=new Complex();
		num1.set(12, 13);
		num2.set(11, 13);
		num1.disp();
		num2.disp();
		Complex num3=new Complex();
		num3=num3.sum(num1,num2);
		num3.disp();
	}
}
