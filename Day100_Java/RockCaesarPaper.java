import java.util.Scanner;

public class RockCaesarPaper {
	public static void main(String args[]) {
		Scanner scan = new Scanner (System.in);
		String var1,var2;
		
		System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		
		Print("ö�� >> ");
		var1 = scan.next();
		Print("���� >> ");
		var2 = scan.next();
		match(var1,var2);
		
	}
	private static void Print(Object o) {
		System.out.print(o);
	}
	private static void match(String var1, String var2) {
		switch(var1) {
		case "����":
			if(var2.equals("����"))
				System.out.println("�����ϴ�");
			else if (var2.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else if(var2.equals("��"))
				System.out.println("ö���� �̰���ϴ�.");
			else
				System.out.println("�߸��� �Է��Դϴ�.");
			break;
		case "����":
			if(var2.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else if (var2.equals("����"))
				System.out.println("�����ϴ�.");
			else if(var2.equals("��"))
				System.out.println("���� �̰���ϴ�.");
			else
				System.out.println("�߸��� �Է��Դϴ�.");
			break;
		case "��":
			if(var2.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else if (var2.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else if(var2.equals("��"))
				System.out.println("�����ϴ�");
			else
				System.out.println("�߸��� �Է��Դϴ�.");
			break;
			}
	}
}
