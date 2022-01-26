import java.util.InputMismatchException;
import java.util.Scanner;

public class Chapter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		//1.
		String str;
		char ch;
		
		Scanner scan = new Scanner(System.in);
		Print("알파벳 한 문자를 입력하세요>>");
		
		str = scan.next();
		ch = str.charAt(0);
		
		for(int i = 0; i < (int)(ch - 'a'+1); i++) {
			for(int j = i; j < (int)(ch - 'a'+1); j++) {
				Print((char)('a'+j));
			}
			Println("");
		}
		
		//2.
		int num[] = new int[10];
		Print("정수 10개 입력>>");
		for(int i = 0; i < 10; i++) {
			num[i] = scan.nextInt();
			if(num[i]%3==0)
				Print(num[i]+" ");
		}
		Println("");

		//3.
		int x = 0;
		Print("정수를 입력하세요>>");
		try {
			x = scan.nextInt();
			if(x%2==0)
				Println("짝수");
			else
				Println("홀수");
		}
		catch(InputMismatchException e){
			Println("수를 입력하지 않아 프로그램 종료합니다.");
		}
		
		//4.
		char date[] = {'일','월','화','수','목','금','토','일'};
		int day = 0;
	
		while(true) {
			Print("정수를 입력하세요.");
			try {
				day = scan.nextInt();
				if(day < 0)
					break;
				else
					Println(date[day%7]);
			}
			catch(InputMismatchException e) {
				Println("경고! 수를 입력하지 않았습니다.");
				scan.nextLine();
			}
			
		}
		Println("프로그램 종료합니다.");

		//5.

		Print("정수 10개 입력>>");
		int temp;
		for(int i = 0; i < num.length; i++) {
			num[i]=scan.nextInt();
		}
		for(int i = 0; i < num.length; i++) {
			for(int j = num.length-1; j>0; j--) {
				if(num[j]<num[j-1]) {
					temp = num[j];
					num[j] = num[j-1];
					num[j-1] = temp;
				}
			}
			Print(num[i]+" ");
			
		}
		Println(" ");
		
		//6.
		String eng[] = {"student", "love","java","happy","future"};
		String kor[] = {"학생","사랑","자바","행복한","미래"};
		

		
		while(true) {
			Print("영어 단어를 입력하세요>>");
			str = scan.next();
			if(str.equals("exit")) {
				Println("프로그램을 종료합니다");
				break;
			}
			for(int i = 0; i<eng.length; i++) {
				if(eng[i].equals(str)) {
					Println(kor[i]);
					break;
				}
				else if(!str.equals(eng[eng.length-1]) && i == eng.length-1) {
					Println("그런 영어 단어가 없습니다");
				}
				
			}
			
		}
		int f,s;
		
		for(int i = 0 ; i < 100; i++) {
			f = i/10;
			s = i%10;
			switch(s) {
			case 3:
			case 6:
			case 9:
				switch(f) {
				case 3:
				case 6:
				case 9:
					Println(i+" "+"박수짝짝");
					break;
				default:
					Println(i+" "+"박수짝");
				}
				break;
			}
		}
		
		//8.
		String var2[] = {"가위", "바위","보"};
		int n;
		String var1;
		Print("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			Print("가위 바위 보!>>");
			var1 = scan.next();
			n = (int)(Math.random()*3);
			Print("사용자 "+var1+", 컴퓨터 "+var2[n]+", ");
			switch(var1) {
			case "가위":
				if(var2[n].equals("가위"))
					System.out.println("비겼습니다");
				else if (var2[n].equals("바위"))
					System.out.println("컴퓨터가 이겼습니다.");
				else if(var2[n].equals("보"))
					System.out.println("사용자가 이겼습니다.");
				else
					System.out.println("잘못된 입력입니다.");
					break;
			case "바위":
				if(var2[n].equals("가위"))
					System.out.println("사용자가 이겼습니다.");
				else if (var2[n].equals("바위"))
					System.out.println("비겼습니다.");
				else if(var2[n].equals("보"))
					System.out.println("컴퓨터가 이겼습니다.");
				else
					System.out.println("잘못된 입력입니다.");
				break;
			case "보":
				if(var2[n].equals("가위"))
					System.out.println("컴퓨터가 이겼습니다.");
				else if (var2[n].equals("바위"))
					System.out.println("사용자가 이겼습니다.");
				else if(var2[n].equals("보"))
					System.out.println("비겼습니다");
				else
					System.out.println("잘못된 입력입니다.");
				break;
			}
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	static void Print(Object o) {
		System.out.print(o);
	}
	static void Println(Object o) {
		System.out.println(o);
	}
}
