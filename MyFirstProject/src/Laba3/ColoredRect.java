package Laba3;
import java.util.Scanner;

public class ColoredRect extends DrawRect{

	private String inColor = "red";
	public void  draw(String outColor, String inColor) {
		this.outColor=outColor;
		this.inColor=inColor;
		System.out.println("нарисовали прямоугольник, цвет границы "+outColor+" цвет прямоугольника "+inColor);
		
	}
	public void  draw() {
		draw( outColor,  inColor);
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		ColoredRect cr = new ColoredRect();
		
		cr.draw();
		cr.inColor=in.nextLine();
		cr.outColor=in.nextLine();
		cr.draw();
		
	}

}
