package Rectangle;
public class RectangleBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleArea rectangle1 = new RectangleArea();
		RectangleArea rectangle2 = new RectangleArea();
		if(rectangle1.area(rectangle1.getLength(),rectangle1.getbreadth())==rectangle2.area(rectangle2.getLength(),rectangle2.getbreadth())){
			System.out.println("Area is same");
		}
		else
			System.out.println("Area is not same");
	}

}
