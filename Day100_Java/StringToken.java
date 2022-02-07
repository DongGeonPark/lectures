import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] histogram = new int[26];
		String next ="";
		String stt="";
		
		StringTokenizer st;
		
		while(!next.equals(";")){
			stt = scan.nextLine();
			st = new StringTokenizer(stt, " ");
			for(int i = 0; st.hasMoreTokens(); i++) {
				next = st.nextToken();
				for (int j = 0 ; j < next.length(); j++) {
					if(Character.isAlphabetic(next.toUpperCase().charAt(j))) {
						histogram[next.toUpperCase().charAt(j)-'A']++;
					}
				}
			}
			
		}
		
		System.out.println("히스토그램을 그립니다.");
	
		for(int i = 0; i < histogram.length; i++) {
			System.out.print((char)(65+i));
			System.out.print(" "+histogram[i]);
			/*for(int j = 0; j< histogram[i]; j++) {
				System.out.print("-");
			}*/
			System.out.println("");
		}
		scan.close();
	}
}


