import java.util.Random;
import java.util.Scanner;

public class Game{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bear b = new Bear(0, 0, 1);
		Random rd = new Random();
		Fish f = new Fish(rd.nextInt(20),rd.nextInt(10),1);
		int count = 0;
		while(!b.collide(f)) {
			Map(b,f);
			b.move();
			if(count % 5 == 3 || count % 5 == 4)
				f.move();
			count++;
		}
		System.out.println("Bear Wins!!");
		
	}
	
	static void Map(Bear b,Fish f) {
		for(int i = 0; i < 10; i++) {
			for(int k = 0; k < 20; k++) {
				if(b.y == i && b.x  == k)
					System.out.print(b.getShape());
				else if(f.y == i && f.x  == k)
					System.out.print(f.getShape());
				else
					System.out.print("-");
			}
			System.out.println("");
		}
	}
	
}
class Bear extends GameObject{

	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void move() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char move;
		System.out.print("움직일 방향을 입력하세요>>");
		move = scan.next().charAt(0);
		int oldx, oldy;
		oldx = this.x;
		oldy = this.y;
		
		switch(move) {
		case 'a':
			if(this.x>0) {
				this.x -=distance;
			}
			break;
		case 's':
			if(this.y<9)
				this.y +=distance;
			break;
		case 'd':
			if(this.x<19)
				this.x += distance;
			break;
		case 'w':
			if(this.y >0)
				this.y -= distance;
			break;
		default:
				System.out.println("nono");
		}
	}

	@Override
	protected char getShape() {
		// TODO Auto-generated method stub
		return 'B';
	}
	
}
class Fish extends GameObject{

	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void move() {
		// TODO Auto-generated method stub
		Random rd = new Random();
		switch(rd.nextInt(4)) {
		case 0:
			if(this.x>0)
				this.x -=distance;
			break;
		case 1:
			if(this.y<9)
				this.y +=distance;
			break;
		case 2:
			if(this.x<19)
				this.x += distance;
			break;
		case 3:
			if(this.y >0)
				this.y -= distance;
			break;
		}
	}

	@Override
	protected char getShape() {
		// TODO Auto-generated method stub
		return '@';
	}
	
}