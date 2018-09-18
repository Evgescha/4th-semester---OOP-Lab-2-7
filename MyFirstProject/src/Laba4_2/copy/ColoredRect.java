package Laba4_2.copy;
import java.util.Scanner;

public class ColoredRect extends DrawRect{

	private String inColor;
	public void  draw(String outColor_, String	inColor_) {
		outColor=outColor_;
		inColor=inColor_;
		System.out.println("нарисовали прямоугольник, цвет границы "+outColor+" цвет прямоугольника "+inColor);
		
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		ColoredRect cr = new ColoredRect();
		cr.draw(in.nextLine(), in.nextLine());
	}

}
