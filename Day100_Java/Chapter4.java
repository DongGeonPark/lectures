import java.util.Scanner;

public class Chapter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		//1.
		Song mySong = new Song("Nessun Dorma");
		Song yourSong = new Song("���ִ� �� �� �̷��");
		Println("�� �뷡�� "+mySong.getTitle());
		Println("�� �뷡�� "+yourSong.getTitle());
		
		//2.
		Phone s, j;
		Print("�̸��� ��ȭ��ȣ �Է�>> ");
		s = new Phone(scan.next(),scan.next());
		Print("�̸��� ��ȭ��ȣ �Է�>> ");
		j = new Phone(scan.next(),scan.next());
		Println(s.getName()+"�� ��ȣ "+s.getTel());
		Println(j.getName()+"�� ��ȣ "+j.getTel());
		
		//3.
		Rect rect[] = new Rect[4];
		int sum = 0;
		for(int i = 0 ; i < rect.length; i++) {
			Print((i+1)+" �ʺ�� ���� >> ");
			rect[i] = new Rect(scan.nextInt(),scan.nextInt());
			sum += rect[i].getArea();
		}
		Println("�����Ͽ����ϴ�.");
		Println("�簢���� ��ü ���� "+sum);

		
		//5
		int count;
		String search="";
		Phone ph[];
		
		Print("�ο��� >> ");
		count = scan.nextInt();
		ph = new Phone[3];
		
		for(int i = 0; i < count; i ++) {
			Print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�>>");
			ph[i] = new Phone(scan.next(), scan.next());
		}
		Println("����Ǿ����ϴ�. . .");
		while(!search.equals("exit")) {
			Print("�˻��� �̸�>>");
			search = scan.next();
			for(int i = 0; i < count; i ++) {
				if(ph[i].getName().equals(search)) {
					Println(search+"�� ��ȣ�� "+ph[i].getTel()+"�Դϴ�.");
					break;
				}
				else if(!ph[i].getName().equals(search) && i == (count-1)) {
					Println(search+" �� �����ϴ�.");
				}
				else if(search.equals("exit"))
					break;
			}
		}
		Println("���α׷��� �����մϴ�. . .");
		
	}
	static void Print(Object o) {
		System.out.print(o);
	}
	static void Println(Object o) {
		System.out.println(o);
	}
}
class Song{
	String title;
	public Song(String title) {
		this.title = title;
	}
	String getTitle() {
		return title;
	
	}
}
class Phone{
	private String name, tel;
	public Phone (String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}
class Rect{
	private int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getArea() { return width*height;}
}



























