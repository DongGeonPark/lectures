import java.util.Scanner;
import java.util.StringTokenizer;
import util.Adder;

public class Chapter6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str ="";
		Chapter6 chapter6 = new Chapter6();

		System.out.println("문자열을 입력하세요.");
		str = scan.nextLine();
		System.out.print("<Enter>을 누르면 회전합니다.");
		
		while(true) {
			String key = scan.nextLine();
			if(key.equals("")) {
				String first = str.substring(0,1);
				String last = str.substring(1);
				str = last.concat(first);
				System.out.print(str+" >>");
			}
			else if(key.equals("q"))
				break;
			else
				System.out.print(str + ">>");
		}
		scan.close();
	}


	void ex1() {
		MyPoint a = new MyPoint(2,3);
		System.out.println(a);
	}
	void ex2(String str) {
		StringTokenizer st = new StringTokenizer(str," ");
		if(!str.equals("exit"))
			System.out.println("어절 개수는 "+st.countTokens());
		else
			System.out.println("종료합니다.");
	}
	void ex3() {
		int[] arr = new int[3];
		while(true) {
			for(int i = 0; i < 3; i ++) {
				arr[i] = (int)(Math.random()*3)+1;
				System.out.print(arr[i]+"\t");
			}
			System.out.println("");
			if(arr[0]==arr[1]&&arr[1]==arr[2]&&arr[0]==arr[2]) {
				System.out.println("성공");
				break;
			}
		}
	}
	void ex4(String str) {
		
		StringTokenizer st = new StringTokenizer(str.replace(" ", ""),"+");
		String next;
		int sum =0;
		
		for(int i = 0; st.hasMoreTokens(); i++) {
			next = st.nextToken();
			sum += Integer.parseInt(next);
		}
		System.out.println("합은 "+sum);
		
	}
	void ex5() {
		Adder adder = new Adder(2,5);
		System.out.println(adder.add());
	}
	void ex6(int num) {
		int cpu=(int)(Math.random()*3)+1;
		switch(num) {
		case 1:
			System.out.print("사용자 가위 : ");
			switch(cpu) {
			case 1:
				System.out.println("컴퓨터 가위");
				System.out.println("비겼습니다.");
				break;
			case 2:
				System.out.println("컴퓨터 바위");
				System.out.println("사용자가 졋습니다.");
				break;
			case 3:
				System.out.println("컴퓨터 보");
				System.out.println("사용자가 이겼습니다.");
				break;
			}
			break;
		case 2:
			System.out.print("사용자 바위 : ");
			switch(cpu) {
			case 1:
				System.out.println("컴퓨터 가위");
				System.out.println("사용자가 이겼습니다.");
				break;
			case 2:
				System.out.println("컴퓨터 바위");
				System.out.println("비겼습니다.");
				break;
			case 3:
				System.out.println("컴퓨터 보");
				System.out.println("사용자가 졌습니다.");
				break;
			}
			break;
		case 3:
			System.out.print("사용자 보 : ");
			switch(cpu) {
			case 1:
				System.out.println("컴퓨터 가위");
				System.out.println("사용자가 졌습니다.");
				break;
			case 2:
				System.out.println("컴퓨터 바위");
				System.out.println("사용자가 이겼습니다.");
				break;
			case 3:
				System.out.println("컴퓨터 보");
				System.out.println("비겼습니다.");
				break;
			}
			break;
		}
		
	}
	void exB1() {
		Circle a = new Circle(1,2,10);
		Circle b = new Circle(5,6,10);
		System.out.println("원 1: " + a);
		System.out.println("원 2: "+ b);
		if(a.equals(b)) System.out.println("같은 원입니다.");
		else System.out.println("다른 원입니다.");
	}
	void exB2(StringBuffer sb) {
		int index = (int)(Math.random()*sb.length());
		while(true) {
			int i = (int)(Math.random()*26);
			char c = (char)('a'+i);
			if(sb.charAt(index) != c && sb.charAt(index)!= ' ') {
				sb.replace(index, index+1, c+"");
				break;
			}
		}
		System.out.println(sb);
	}

}
class MyPoint{
	private int a,b;
	
	public MyPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public String toString(){
		return "MyPoint("+a+","+b+")";
	}
}
class Circle{
	private int x,y,radius;
	public Circle(int x, int y, int radius) {
		this.x =x ; this.y=y; this.radius = radius;
	}
	public String toString() {
		return "("+x+","+y+")반지름 "+radius;
	}
	public boolean equals(Circle c) {
		if(c.radius == this.radius) {
			return true;
		}
		else
			return false;
	}
}
