package tester;


import java.util.Scanner;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class EventOrganizer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter event capacity");
		Person participants[] = new Person[sc.nextInt()];
		int counter = 0;
		boolean exit = false;
		while (!exit) {
			System.out.println("1 Add student to event 2 Add faculty to event 3 Display list of participents "
				+"4 Display student or faculty by seat no "	+ "10 Exit");
			switch (sc.nextInt()) {
			case 1:
				if (counter < participants.length) {
					System.out.println("Enter Student Details -> fn, ln, grade, year,courseFees, marks,courseName");
					participants[counter++] = new Student(sc.next(), sc.next(), sc.next(), sc.nextInt(),
							sc.nextDouble(), sc.nextInt(),sc.next());
				} else {
					System.out.println("The event is full..");
				}
				break;

			case 2:
				if (counter < participants.length) {
					System.out.println("Enter Faculty Details -> fn,  ln,  yearsOfExperience,  skills) ");
					participants[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
				} else {
					System.out.println("The event is full..");
				}
				break;
			case 3:

				System.out.println("List of participants");
				for (Person p : participants) {
					if (p != null) {
						System.out.println(p);// ->p.toString()
					}
				}
				break;
				
			case 4:
				System.out.println("Enter the seat no");
				int index = sc.nextInt()-1;
				Person p = participants[index];
				if(p!=null) {
				if(index >= 0 && index < counter) {
					if(p instanceof Student) {
						System.out.println(((Student)p).study());
					}
					else if(p instanceof Faculty) {
						System.out.println(((Faculty)p).teach());
					}
					}
				}
				break;
			case 10:
				exit = true;
				break;
			}
		}
		System.out.println("main over....");
		sc.close();

	}
}
