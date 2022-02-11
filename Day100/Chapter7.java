import java.util.ArrayList;
import java.util.Scanner;

public class Chapter7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		/*1��
		Vector<Float> v = new Vector<Float>();
		Iterator<Float> it;
		
		float max = 0, num;
		
		for (int i = 0; i < 5; i++) {
			v.add(scan.nextFloat());
		
		}
		
		it = v.iterator();
		while(it.hasNext()) {
			num = it.next();
			if(max < num)
				max = num;
		}
		System.out.println("���� ū ���� "+max);
		*/
		/*2��
		ArrayList<Character> ch = new ArrayList<Character>();
		System.out.print("�� ĭ���� �и��Ͽ� 5 ���� ������ �Է�(A/B/C/D/F)>>");
		
		for(int i = 0 ; i<5; i++) {
			ch.add(scan.next().charAt(0));
		}
		Iterator<Character> it = ch.iterator();
		while(it.hasNext()) {
			switch(it.next()) {
			case 'A':
				System.out.print("4.0 ");
				break;
			case 'B':
				System.out.print("3.0 ");
				break;
			case 'C':
				System.out.print("2.0 ");
				break;
			case 'D':
				System.out.print("1.0 ");
				break;
			case 'F':
				System.out.print("0.0 ");
				break;
			}
		}
		 */
		/*3��
		HashMap<String, Integer> coffee = new HashMap<String,Integer>();
		String user_coffee;
		
		coffee.put("�Ƹ޸�ī��",2500);
		coffee.put("īǪġ��", 3000);
		coffee.put("����������", 2000);
		coffee.put("ī���", 3500);
		
		System.out.println("����������, �Ƹ޸�ī��, īǪġ��, ī��� �ֽ��ϴ�.");
		while(true){
			System.out.print("�ֹ� >> ");
			user_coffee = scan.next();
			if(user_coffee.equals("�׸�")) {
				break;
			}
			System.out.println(user_coffee+"�� "+coffee.get(user_coffee)+"���Դϴ�.");
		
		}
		*/
		/*4��
		Vector<Integer> height = new Vector<Integer>();
		int year = 0;
		float increase = 0;
		System.out.println("2000~2009����� 1�� ������ Ű(cm)�� �Է�");
		System.out.print(">>");
		
		for(int i = 0; i < 10; i++) {
			height.add(scan.nextInt());
		}
		for(int i = 0; i < (height.size()-1); i++) {
			if(height.get(i+1) - height.get(i) > increase) {
				increase = height.get(i+1) - height.get(i);
				year = 2000+i;
			}
			
		}
		System.out.println("���� Ű�� ���� �ڶ� �⵵�� "+year+"�� "+increase+"cm");
		*/
		/*
		 * 
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Set<String> keys;
		Iterator<String> it;
		String key = null, max_nation = null;
		int max_pop = 0, population;
		System.out.println("���� �̸��� �α��� 5���� �Է��ϼ���.(��: Korea 5000)");
		for(int i = 0; i < 5; i++) {
			System.out.print("���� �̸�, �α�>>");
			nations.put(scan.next(), scan.nextInt());
		}
		keys = nations.keySet();
		it = keys.iterator();
		while(it.hasNext()) {
			key = it.next();
			population = nations.get(key);
			if(max_pop < population) {
				max_pop = population;
				max_nation = key;
			}
		}
		System.out.println("���� �α��� ���� �����("+max_nation+nations.get(max_nation));
		*/
		/*
		HashMap<String, Integer> point = new HashMap<String, Integer>();
		Set<String> keys;
		Iterator<String> it;
		String name = null, key;
		int user_point;
		
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ�.**");
		while(true) {
			System.out.print("�̸��� ����Ʈ �Է�>>");
			name = scan.next();
			if(name.equals("exit"))
				break;
			
			user_point = scan.nextInt();
			
			if(point.containsKey(name))
				point.put(name, point.get(name)+user_point);
			else
				point.put(name,user_point);
		
			keys = point.keySet();
			it = keys.iterator();
			while(it.hasNext()) {
				key = it.next();
				System.out.print(key+","+point.get(key));
			}
			System.out.println();
		}
		*/
		ArrayList<Location> al = new ArrayList<Location>();
		double sum =0,tz = 0;
		al.add(new Location(0, 0));
		System.out.println("�㰡 �̵��� ��ġ(x,y)�� 5�� �Է��϶�.");
		for(int i = 0 ; i < 5 ; i ++) {
			System.out.print(">>");
			al.add(new Location(scan.nextInt(), scan.nextInt()));
		}
		al.add(new Location(0, 0));
		for(int i = 1; i < al.size(); i++) {
			Location p1 = al.get(i-1);
			double x1 = p1.getX();
			double y1 = p1.getY();
			
			Location p2 = al.get(i);
			double x2 = p2.getX();
			double y2 = p2.getY();
			
			double tx = x2 - x1;
			double ty = y2 - y1;
			
			sum = (tx * tx) + (ty * ty);
			tz = tz + Math.sqrt(sum);
		}
		System.out.println("�� �̵� �Ÿ��� "+tz);
		scan.close();
	}
}
class Location{
	private int x,y;
	public Location(int x, int y) {
		this.x = x ; this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}
