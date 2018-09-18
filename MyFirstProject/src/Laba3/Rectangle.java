package Laba3;
public class Rectangle {
    private double x1;
    private double x2;
    private double y1;
    private double y2;   

    public Rectangle () {
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;
    }
    public Rectangle (double x1_, double x2_, double y1_, double y2_) {
        x1 = x1_;
        x2 = x2_;
        y1 = y1_;
        y2 = y2_;
    }

    public Rectangle(double width, double height) {
    	x1=0;
    	y1=0;
        x2 = width;
        y2 = height;
    }
    @Override
    public String toString() {
        return "x1 - " + x1+ ", x2 - " + x2 + ", y1 - " + y1 + ", y2 - " + y2 + "  Width - " + (x2-x1) + ", Heigth - " + (y2-y1);
    } 
    public String toString(String AllInfo) {
        return "x1 - " + x1+ ", x2 - " + x2 + ", y1 - " + y1 + ", y2 - " + y2;
    } 
    public static Rectangle minSquare(Rectangle a1, Rectangle a2) {
    	if(a1.getArea()>a2.getArea())
    		return a1;
    	else 
    		return a2;    	
    }
    
    public double getArea() {
        return Math.abs((x2-x1))*Math.abs((y2-y1));
    }
    public void Move(double dx, double dy) 
    {
    	this.x1+=dx; this.x2+=dx; this.y1+=dy; this.y2+=dy;
    }
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle(23,4);
		Rectangle rec3 = new Rectangle (3,4,15,21);
		System.out.println(rec1.toString());
		System.out.println(rec2.toString());
		System.out.println(rec3.toString());
		System.out.println("переместим 2 прямоугольник");
		rec2.Move(2, 42);
		System.out.println(rec2.toString() + "\n" );
		
		Double s1,s2,ss;
		s1=rec2.getArea();
		s2 =(rec3.getArea());
		ss=Rectangle.minSquare(rec2, rec3).getArea();
		System.out.println("cравнивали первый с площадью " + s1+ " со вторым, у которого площадь " + s2 + ". В иотге победил тот, у кого площадь" +ss);
	}

}

