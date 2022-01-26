import java.util.Random;
import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String option = "y";
		Scanner scan = new Scanner(System.in);
		while(option.equals("y")) {
			Println("UP & Down게임입니다. 숨겨진 수를 맞추어 보세요");
			int num,start=0,end=99,answer;
			int i = 1;
			Random r = new Random();
			answer = r.nextInt(100);
			
			while(true) {
				Println(start+"-"+end);
				Print(i+">>");
				num = scan.nextInt();
				if(answer>num) {
					Println("더 높게");
					start = num;
				}
				else if(answer<num) {
					Println("더 낮게");
					end = num;
				}
				else {
					Println("맞았습니다.");
					break;
				}
				i++;
			}
			Print("다시하시겠습니까?(y/n)>>");
			option = scan.next();
		}
		
		scan.close();
	}

	static void Print(Object o) {
		System.out.print(o);
	}
	static void Println(Object o) {
		System.out.println(o);
	}
}
