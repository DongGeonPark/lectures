import java.util.Scanner;

public class Chapter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//1.
		int a,b;
		
		Print("�� ������ �Է��ϼ���>>");
		a = scan.nextInt();
		b = scan.nextInt();
		Println(a+"+"+b+"��"+(a+b));
		
		//2.
		int floor, height = 5;
		
		Print("�������� �Է��ϼ���>>");
		floor = scan.nextInt();
		Println((floor*5)+"m �Դϴ�.");
		
		//3
		int x,y;		
		Print("x ���� �Է��ϼ���>>");
		x = scan.nextInt();
		y = x*x-3*x+7;
		Println("x="+x+", y="+y);
		
		//4
		Print("�� (x,y)�� ��ǥ�� �Է��ϼ���>>");
		x = scan.nextInt();
		y = scan.nextInt();
		if((x > 50 && x <100)&&(y>50 && y<100) )
				Println("��("+x+","+y+")�� (50, 50)�� (100,100)�� �簢�� ���� �ֽ��ϴ�");
		else
			Println("��("+x+","+y+")�� (50, 50)�� (100,100)�� �簢�� ���� �����ϴ�");
		
		
		//5
		boolean var1,var2;
		String option;
		
		Print("�� ������ �Է��ϼ���>>");
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
			Println("�߸��� �Է��Դϴ�.");	
		}
		
		//6
		int price,s;
		Print("���� �׼��� �Է��ϼ���>>");
		price = scan.nextInt();
		Print("������"+price/50000+"��,");
		s = price%50000;
		Print("����"+s/10000+"��,");
		s = price%10000;
		Print("õ��"+s/1000+"��,");
		s = price%1000;
		Print("�����"+s/500+"��,");
		s = price%500;
		Print("���"+s/100+"��,");
		s = price%100;
		Print("�ʿ�"+s/10+"��,");
		s = price%10;
		Println("�Ͽ�"+s/1+"��,");
		
		//7
		String str;
		
		Print("������ �Է��ϼ���>>");
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
			Println("������ �߸� �Է��Ͽ����ϴ�");
		}
		
		//8
		String coffee;
		int count;
		
		Print("Ŀ�� �ֹ��ϼ���>>");
		coffee = scan.next();
		count = scan.nextInt();
		if(coffee.equals("����������"))
			Println(2000*count+"�� �Դϴ�.");
		else if(coffee.equals("īǪġ��"))
			Println(2500*count+"�� �Դϴ�.");
		else if(coffee.equals("ī���"))
			Println(3000*count+"�� �Դϴ�.");
		else
			Println("�׷� Ŀ�Ǵ� �����ϴ� ^_^");
		/*
		switch(coffee) {
		case "����������":
			Println(2000*count+"�� �Դϴ�."); break;
		case "īǪġ��":
			Println(2500*count+"�� �Դϴ�."); break;
		case "ī���":
			Println(3000*count+"�� �Դϴ�."); break;
		default:
			Println("�׷� Ŀ�Ǵ� �����ϴ� ^_^");
		}
		*/
		
		//9
		Print("1 ~ 99 ������ ������ �Է��ϼ���>>");
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
				Println("�ڼ�¦¦");
				break;
			default:
				Println("�ڼ�¦");
			}
			break;
		default:
			Println("�ڼ�����");
		}
		
		//10
		Print("Ŀ�� �ֹ��ϼ���>>");
		coffee = scan.next();
		count = scan.nextInt();
		switch(coffee) {
		case "����������":
			price = 2000*count; break;
		case "īǪġ��":
			price = 2500*count; break;
		case "ī���":
			price = 3000*count; break;
		default:
			Println("�׷� Ŀ�Ǵ� �����ϴ� ^_^");
		}
		if(count >= 10)
			Println((price*0.95)+"�� �Դϴ�.����");
		else
			Println(price+"�� �Դϴ�.���� x");
		
		scan.close();
	}
	static void Print(Object o ) {
		System.out.print(o);
	}
	static void Println(Object o ) {
		System.out.println(o);
	}
}
