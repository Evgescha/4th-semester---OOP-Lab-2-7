package Laba4_2.copy;
import java.util.Scanner;

public class DrawRect extends  Rectangle {

	String outColor = "";
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
		
	}

}
