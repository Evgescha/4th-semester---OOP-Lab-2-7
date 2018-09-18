package Laba3;
import java.util.Scanner;

public class DrawRect extends  Rectangle {

	String outColor = "blue";
	
	public void draw(String  outColor_) {
		outColor=outColor_;
		System.out.println("нарисовали прямоугольник, цвет границы "+outColor);
	}
	public String getoutColor() {
		return outColor;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DrawRect dr = new DrawRect();
		dr.outColor = in.nextLine();
		System.out.println(dr.getoutColor());
		dr.draw(dr.outColor);
		
	}

}
