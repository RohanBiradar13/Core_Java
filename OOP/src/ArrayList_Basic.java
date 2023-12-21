import java.util.ArrayList;

public class ArrayList_Basic {

	public static void main(String[] args) {
		ArrayList<Integer>marks = new ArrayList<>();
		
		//add
		marks.add(10);
		marks.add(20);
		marks.add(40);
		
		System.out.println(marks);

		//get element
		int GetEle = marks.get(1);
		System.out.println(GetEle);
		
		//add in between 
		marks.add(2, 30);
		System.out.println(marks);
		
		//set element
		marks.set(0, 20);
		System.out.println(marks);
		
		//delete
		marks.remove(3);
		System.out.println(marks);
		
		//loop for getting all elements
		for(int i = 0;i <marks.size(); i++) {
			System.out.print(marks.get(i)+ " ");
		}
		
		
	}

}
