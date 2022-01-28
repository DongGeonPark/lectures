import java.util.Scanner;

//1.
class Circle{
	private int radius;
	public Circle(int radius) {this.radius = radius;}
	public int getRadius() {return radius;}
	
}
class NamedCircle extends Circle{
	private String name;
	
	public NamedCircle(int radius, String name) {
		super(radius);
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public String getName() {return name;}
	
	public void show() {
		System.out.println(this.getName()+", 반지름 = "+this.getRadius());
	}
}


//2.
interface AdderInterface{
	int add(int x, int y);
	int add(int n);
}
class MyAdder implements AdderInterface{

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int add(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum+=i;
		}
		
		return sum;
	}
	
}

//3.
abstract class Calculator{
	protected int a,b;
	abstract protected int calc();
	protected void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요>> ");
		a = scan.nextInt();
		b = scan.nextInt();
	}
	public void run() {
		input();
		int res = calc();
		System.out.println("계산된 값은 "+ res);
	}
}
class Adder extends Calculator{

	@Override
	protected int calc() {
		// TODO Auto-generated method stub	
		return this.a+this.b;
	}
	
}
class Subtracter extends Calculator{

	@Override
	protected int calc() {
		// TODO Auto-generated method stub
		return this.a-this.b;
	}
	
}


//4.
class Point{
	private int x,y;
	public Point(int x,int y) {this.x = x; this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x; this.y =y;}
}
class ColorPoint extends Point {
	String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.color = color;
	}
	public void setPoint(int x,int y) {
		super.move(x, y);
	}
	public void setColor(String c) {
		this.color = c;
	}
	public void show() {
		System.out.println(this.color+"색으로("+this.getX()+","+this.getY()+")");
	}
}

//5.
interface StackInterface{
	int length();
	String pop();
	boolean push(String ob);
}
class StringStack implements StackInterface{
	private String str[] = new String[5];
	private int top;
	
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return top;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		System.out.print(this.str[--top]+" ");
		return null;
	}

	@Override
	public boolean push(String ob) {
		// TODO Auto-generated method stub
		this.str[top++] = ob;
		return false;
	}	
}

//6
abstract class Shape{
	public abstract void draw();
	
}
class Line extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Line");
	}
	
}
class Rect extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rect");
	}
	
}
class Circle2 extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle2");
	}
	
}

//Bonus
interface Shape2{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.println("---다시그립니다.----");
		draw();
	}
}
class Circle3 implements Shape2{
	private int radius;
	Circle3(int r){
		this.radius = r;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print("반지름"+this.radius+" ");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.radius*this.radius*this.PI;
	}
	
}
public class Chapter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//1.
		NamedCircle w = new NamedCircle(5, "Waffle");
		w.show();
		
		//2.
		MyAdder adder = new MyAdder();
		System.out.println(adder.add(5,10));
		System.out.println(adder.add(10));
		
		//3.
		Adder adder2 = new Adder();
		Subtracter sub = new Subtracter();
		
		adder2.run();
		sub.run();
		
		//4.
		ColorPoint cp = new ColorPoint(5,5,"Yellow");
		cp.setPoint(10, 20);
		cp.setColor("Green");
		cp.show();
	
		
		//5.
		StringStack st = new StringStack();
		System.out.println(">>");
		for(int i =0; i<5; i++) {
			st.push(scan.next());
		}
		
		for(int i =0; i<5; i++) {
			st.pop();
		}
		
		
		//6.
		
		
		Shape p[] = new Shape[5];
		int count=0,flag = 0;
		
		while(flag!= 4) {
			System.out.println("삽입 삭제 모두보기 종료");
			switch(scan.nextInt()) {
			case 1:
				System.out.println("도형종류 (L, R, C)");
				switch(scan.nextInt()) {
				case 1:
					p[count++] = new Line();
					break;
				case 2:
					p[count++] = new Rect();
					break;
				case 3:
					p[count++] = new Circle2();
					break;
				}
				break;
			case 2:
				System.out.println("삭제 위치");
				if(p[scan.nextInt()]!= null) {
					p[scan.nextInt()] = null;
					System.out.println("삭제되었습니다");
				}else
					System.out.println("삭제할 수 없습니다");
				break;
			case 3:
				for(int i = 0; i < count; i++) {
					p[i].draw();
				}
				break;
			case 4:
				flag = 4;
				break;
			}
		}
		System.out.println("종료 ㅋ");
		 
		Shape2 coin = new Circle3(10);
		coin.redraw();
		System.out.println("코인의 면적은"+coin.getArea());
		
		scan.close();
		
	}

}
