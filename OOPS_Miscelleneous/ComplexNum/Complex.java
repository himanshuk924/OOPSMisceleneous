package ComplexNum;
public class Complex {
	private float real;
	private float imaginary;
	void set(float real,float imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	public float getReal() {
		return real;
	}
	public float getImaginary() {
		return imaginary;
	}
	//to display the complex number
	void disp(){
		System.out.println(getReal()+":"+getImaginary()+"i");
	}
	//to calculate the sum of two complex number
	Complex sum(Complex num1,Complex num2) {
		Complex num3=new Complex();
		num3.real=num1.getReal()+num2.getReal();
		num3.imaginary=num1.getImaginary()+num2.getImaginary();
		return num3;
	}
}
