import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Word> v = new Vector<Word>();
		Scanner scan = new Scanner(System.in);
		int num = 1, random ,answer,user;
		int exam[] = new int[4];
		v.add(new Word("love","���"));
		v.add(new Word("animal","����"));
		v.add(new Word("emotion","����"));
		v.add(new Word("trade","�ŷ�"));
		v.add(new Word("one","��"));
		v.add(new Word("two", "��"));
		v.add(new Word("three", "��"));
		
		
		System.out.println("���� ���� �׽�Ʈ�� �����մϴ�.");
		while(Math.abs(num) <= 4 && num > 0) {
			//System.out.print("("+(i+1)+") ");
			for(int i = 0; i < 4 ; i++) {
				random = (int)(Math.random()*v.size());
				if(check(exam,random))
					exam[i]=random;
			}
			answer = (int)(Math.random()*4);
			System.out.println(v.get(exam[answer]).getEng()+"?");
			System.out.print("(1)"+v.get(exam[0]).getKor()+"(2)"+v.get(exam[1]).getKor()+
					"(3)"+v.get(exam[2]).getKor()+"(4)"+v.get(exam[3]).getKor()+":>");
			user = scan.nextInt();
			
			if((user-1) == answer)
				System.out.println("Excellent!!");
			else
				System.out.println("No");
			
		}
		System.out.println("���α׷��� �����մϴ�");
		
	}
	static boolean check (int n[], int j) {
		for(int i = 0 ; i < 4 ; i ++) {
			if(n[i] == j)
				return false;
		}
		return true;
	}
}
class Word{
	String eng;
	String kor;
	
	public Word(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}
}