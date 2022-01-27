import java.util.Scanner;

public class Chapter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		//1.
		Song mySong = new Song("Nessun Dorma");
		Song yourSong = new Song("공주는 잠 못 이루고");
		Println("내 노래는 "+mySong.getTitle());
		Println("너 노래는 "+yourSong.getTitle());
		
		//2.
		Phone s, j;
		Print("이름과 전화번호 입력>> ");
		s = new Phone(scan.next(),scan.next());
		Print("이름과 전화번호 입력>> ");
		j = new Phone(scan.next(),scan.next());
		Println(s.getName()+"의 번호 "+s.getTel());
		Println(j.getName()+"의 번호 "+j.getTel());
		
		//3.
		Rect rect[] = new Rect[4];
		int sum = 0;
		for(int i = 0 ; i < rect.length; i++) {
			Print((i+1)+" 너비와 높이 >> ");
			rect[i] = new Rect(scan.nextInt(),scan.nextInt());
			sum += rect[i].getArea();
		}
		Println("저장하였습니다.");
		Println("사각형의 전체 합은 "+sum);

		
		//5
		int count;
		String search="";
		Phone ph[];
		
		Print("인원수 >> ");
		count = scan.nextInt();
		ph = new Phone[3];
		
		for(int i = 0; i < count; i ++) {
			Print("이름과 전화번호(번호는 연속적으로 입력>>");
			ph[i] = new Phone(scan.next(), scan.next());
		}
		Println("저장되었습니다. . .");
		while(!search.equals("exit")) {
			Print("검색할 이름>>");
			search = scan.next();
			for(int i = 0; i < count; i ++) {
				if(ph[i].getName().equals(search)) {
					Println(search+"의 번호는 "+ph[i].getTel()+"입니다.");
					break;
				}
				else if(!ph[i].getName().equals(search) && i == (count-1)) {
					Println(search+" 이 없습니다.");
				}
				else if(search.equals("exit"))
					break;
			}
		}
		Println("프로그램을 종료합니다. . .");
		
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



























