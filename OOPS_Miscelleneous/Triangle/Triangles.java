package Triangle;
public class Triangles {
	private int side1,side2,side3;

	public int getSide1() {
		return side1;
	}
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	public int getSide2() {
		return side2;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	public int getSide3() {
		return side3;
	}
	public void setSide3(int side3) {
		this.side3 = side3;
	}
	
	boolean isEquilateral(int side1,int side2,int side3)
	{
		boolean yes=true;
		boolean no=false;
		if((side1==side2) && (side2==side3))
		{
			return yes;
		}
		else {
			return no;
		}
	}
	
	boolean isScalene(int side1,int side2,int side3)
	{
		boolean yes=true;
		boolean no=false;
		if((side1!=side2) && (side2!=side3)&& (side1!=side3))
		{
			return yes;
		}
		else {
			return no;
		}
	}
	
	boolean isIsosceles(int side1,int side2,int side3)
	{
		boolean yes=true;
		boolean no=false;
		if((side1==side2) || (side2==side3) || (side1==side3))
		{
			return yes;
		}
		else {
			return no;
		}
	}
	boolean isRight(int side1,int side2,int side3)
	{
		boolean yes=true;
		boolean no=false;
		if((Math.pow(side1,2)+Math.pow(side2, 2))==Math.pow(side3, 2))
		{
			return yes;
		}
		if((Math.pow(side2,2)+Math.pow(side3, 2))==Math.pow(side1, 2))
		{
			return yes;
		}
		if((Math.pow(side1,2)+Math.pow(side3, 2))==Math.pow(side2, 2))
		{
			return yes;
		}
		else {
			return no;
		}
	}

}
