import java.util.InputMismatchException;
import java.util.Scanner;

public class Chapter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		//1.
		String str;
		char ch;
		
		Scanner scan = new Scanner(System.in);
		Print("���ĺ� �� ���ڸ� �Է��ϼ���>>");
		
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
		Print("���� 10�� �Է�>>");
		for(int i = 0; i < 10; i++) {
			num[i] = scan.nextInt();
			if(num[i]%3==0)
				Print(num[i]+" ");
		}
		Println("");

		//3.
		int x = 0;
		Print("������ �Է��ϼ���>>");
		try {
			x = scan.nextInt();
			if(x%2==0)
				Println("¦��");
			else
				Println("Ȧ��");
		}
		catch(InputMismatchException e){
			Println("���� �Է����� �ʾ� ���α׷� �����մϴ�.");
		}
		
		//4.
		char date[] = {'��','��','ȭ','��','��','��','��','��'};
		int day = 0;
	
		while(true) {
			Print("������ �Է��ϼ���.");
			try {
				day = scan.nextInt();
				if(day < 0)
					break;
				else
					Println(date[day%7]);
			}
			catch(InputMismatchException e) {
				Println("���! ���� �Է����� �ʾҽ��ϴ�.");
				scan.nextLine();
			}
			
		}
		Println("���α׷� �����մϴ�.");

		//5.

		Print("���� 10�� �Է�>>");
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
		String kor[] = {"�л�","���","�ڹ�","�ູ��","�̷�"};
		

		
		while(true) {
			Print("���� �ܾ �Է��ϼ���>>");
			str = scan.next();
			if(str.equals("exit")) {
				Println("���α׷��� �����մϴ�");
				break;
			}
			for(int i = 0; i<eng.length; i++) {
				if(eng[i].equals(str)) {
					Println(kor[i]);
					break;
				}
				else if(!str.equals(eng[eng.length-1]) && i == eng.length-1) {
					Println("�׷� ���� �ܾ �����ϴ�");
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
					Println(i+" "+"�ڼ�¦¦");
					break;
				default:
					Println(i+" "+"�ڼ�¦");
				}
				break;
			}
		}
		
		//8.
		String var2[] = {"����", "����","��"};
		int n;
		String var1;
		Print("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			Print("���� ���� ��!>>");
			var1 = scan.next();
			n = (int)(Math.random()*3);
			Print("����� "+var1+", ��ǻ�� "+var2[n]+", ");
			switch(var1) {
			case "����":
				if(var2[n].equals("����"))
					System.out.println("�����ϴ�");
				else if (var2[n].equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else if(var2[n].equals("��"))
					System.out.println("����ڰ� �̰���ϴ�.");
				else
					System.out.println("�߸��� �Է��Դϴ�.");
					break;
			case "����":
				if(var2[n].equals("����"))
					System.out.println("����ڰ� �̰���ϴ�.");
				else if (var2[n].equals("����"))
					System.out.println("�����ϴ�.");
				else if(var2[n].equals("��"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else
					System.out.println("�߸��� �Է��Դϴ�.");
				break;
			case "��":
				if(var2[n].equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else if (var2[n].equals("����"))
					System.out.println("����ڰ� �̰���ϴ�.");
				else if(var2[n].equals("��"))
					System.out.println("�����ϴ�");
				else
					System.out.println("�߸��� �Է��Դϴ�.");
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
