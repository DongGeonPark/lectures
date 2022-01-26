import java.util.Scanner;

public class RockCaesarPaper {
	public static void main(String args[]) {
		Scanner scan = new Scanner (System.in);
		String var1,var2;
		
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		
		Print("철수 >> ");
		var1 = scan.next();
		Print("영희 >> ");
		var2 = scan.next();
		match(var1,var2);
		
	}
	private static void Print(Object o) {
		System.out.print(o);
	}
	private static void match(String var1, String var2) {
		switch(var1) {
		case "가위":
			if(var2.equals("가위"))
				System.out.println("비겼습니다");
			else if (var2.equals("바위"))
				System.out.println("영희가 이겼습니다.");
			else if(var2.equals("보"))
				System.out.println("철수가 이겼습니다.");
			else
				System.out.println("잘못된 입력입니다.");
			break;
		case "바위":
			if(var2.equals("가위"))
				System.out.println("철수가 이겼습니다.");
			else if (var2.equals("바위"))
				System.out.println("비겼습니다.");
			else if(var2.equals("보"))
				System.out.println("영희가 이겼습니다.");
			else
				System.out.println("잘못된 입력입니다.");
			break;
		case "보":
			if(var2.equals("가위"))
				System.out.println("영희가 이겼습니다.");
			else if (var2.equals("바위"))
				System.out.println("철수가 이겼습니다.");
			else if(var2.equals("보"))
				System.out.println("비겼습니다");
			else
				System.out.println("잘못된 입력입니다.");
			break;
			}
	}
}
