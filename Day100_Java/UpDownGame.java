import java.util.Random;
import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String option = "y";
		Scanner scan = new Scanner(System.in);
		while(option.equals("y")) {
			Println("UP & Down�����Դϴ�. ������ ���� ���߾� ������");
			int num,start=0,end=99,answer;
			int i = 1;
			Random r = new Random();
			answer = r.nextInt(100);
			
			while(true) {
				Println(start+"-"+end);
				Print(i+">>");
				num = scan.nextInt();
				if(answer>num) {
					Println("�� ����");
					start = num;
				}
				else if(answer<num) {
					Println("�� ����");
					end = num;
				}
				else {
					Println("�¾ҽ��ϴ�.");
					break;
				}
				i++;
			}
			Print("�ٽ��Ͻðڽ��ϱ�?(y/n)>>");
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
