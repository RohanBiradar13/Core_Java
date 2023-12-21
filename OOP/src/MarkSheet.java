import java.util.Scanner;

public class MarkSheet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size  = sc.nextInt();
		int total = 0;
		int avg = 0;
		
		int marks[] = new int[size];
		for(int i = 0; i<marks.length;i++) {
			marks[i] = sc.nextInt();
			}
		for(int i = 0; i< marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
		System.out.println();
		 for(int i = 0; i<marks.length;i++) {
			 total = marks[i] + total;
		 }
		 System.out.println(total);
         
		 avg = total / size;
		 System.out.println(avg);
	}

}
