import java.util.Scanner;

public class Chapter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//1.
		int a,b;
		
		Print("두 정수를 입력하세요>>");
		a = scan.nextInt();
		b = scan.nextInt();
		Println(a+"+"+b+"은"+(a+b));
		
		//2.
		int floor, height = 5;
		
		Print("몇층인지 입력하세요>>");
		floor = scan.nextInt();
		Println((floor*5)+"m 입니다.");
		
		//3
		int x,y;		
		Print("x 값을 입력하세요>>");
		x = scan.nextInt();
		y = x*x-3*x+7;
		Println("x="+x+", y="+y);
		
		//4
		Print("점 (x,y)의 좌표를 입력하세요>>");
		x = scan.nextInt();
		y = scan.nextInt();
		if((x > 50 && x <100)&&(y>50 && y<100) )
				Println("점("+x+","+y+")은 (50, 50)과 (100,100)의 사각형 내에 있습니다");
		else
			Println("점("+x+","+y+")은 (50, 50)과 (100,100)의 사각형 내에 없습니다");
		
		
		//5
		boolean var1,var2;
		String option;
		
		Print("논리 연산을 입력하세요>>");
		var1 = scan.nextBoolean();
		option = scan.next();
		var2 = scan.nextBoolean();
		
		switch(option) {
		case "OR":
			Println((var1 || var2)? true:false);
			break;
		case "AND":
			Println((var1 && var2)? true:false);
			break;
		default:
			Println("잘못된 입력입니다.");	
		}
		
		//6
		int price,s;
		Print("돈의 액수를 입력하세요>>");
		price = scan.nextInt();
		Print("오만원"+price/50000+"개,");
		s = price%50000;
		Print("만원"+s/10000+"개,");
		s = price%10000;
		Print("천원"+s/1000+"개,");
		s = price%1000;
		Print("오백원"+s/500+"개,");
		s = price%500;
		Print("백원"+s/100+"개,");
		s = price%100;
		Print("십원"+s/10+"개,");
		s = price%10;
		Println("일원"+s/1+"개,");
		
		//7
		String str;
		
		Print("학점을 입력하세요>>");
		str = scan.next();
		switch(str) {
		case "A":
		case "B":
			Println("Exellent");
			break;
		case "C":
		case "D":
			Println("Good");break;
		case "F":
			Println("Bye");break;
		default:
			Println("학점을 잘못 입력하였습니다");
		}
		
		//8
		String coffee;
		int count;
		
		Print("커피 주문하세요>>");
		coffee = scan.next();
		count = scan.nextInt();
		if(coffee.equals("에스프레소"))
			Println(2000*count+"원 입니다.");
		else if(coffee.equals("카푸치노"))
			Println(2500*count+"원 입니다.");
		else if(coffee.equals("카페라떼"))
			Println(3000*count+"원 입니다.");
		else
			Println("그런 커피는 없습니다 ^_^");
		/*
		switch(coffee) {
		case "에스프레소":
			Println(2000*count+"원 입니다."); break;
		case "카푸치노":
			Println(2500*count+"원 입니다."); break;
		case "카페라떼":
			Println(3000*count+"원 입니다."); break;
		default:
			Println("그런 커피는 없습니다 ^_^");
		}
		*/
		
		//9
		Print("1 ~ 99 사이의 정수를 입력하세요>>");
		count = scan.nextInt();
		x = count/10;
		y = count%10;
		
		switch(y) {
		case 3:
		case 6:
		case 9:
			switch(x) {
			case 3:
			case 6:
			case 9:
				Println("박수짝짝");
				break;
			default:
				Println("박수짝");
			}
			break;
		default:
			Println("박수없음");
		}
		
		//10
		Print("커피 주문하세요>>");
		coffee = scan.next();
		count = scan.nextInt();
		switch(coffee) {
		case "에스프레소":
			price = 2000*count; break;
		case "카푸치노":
			price = 2500*count; break;
		case "카페라떼":
			price = 3000*count; break;
		default:
			Println("그런 커피는 없습니다 ^_^");
		}
		if(count >= 10)
			Println((price*0.95)+"원 입니다.할인");
		else
			Println(price+"원 입니다.할인 x");
		
		scan.close();
	}
	static void Print(Object o ) {
		System.out.print(o);
	}
	static void Println(Object o ) {
		System.out.println(o);
	}
}
