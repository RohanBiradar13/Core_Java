import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private ArrayList<Double> marks;

    public Student(String name) {
        this.name = name;
        this.marks = new ArrayList<>();
    }

    public void setMarks(ArrayList<Double> marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getMarks() {
        return marks;
    }

    public double calculateTotalMarks() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }

    public double calculateAverageMarks() {
        return calculateTotalMarks() / marks.size();
    }


 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Enter student details");
            System.out.println("2. Display student details");
            System.out.println("3. Exit");

            System.out.print("Enter your choice (1/2/3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    Student student = enterStudentDetails(scanner);
                    students.add(student);
                    System.out.println("Student details added successfully!");
                    break;
                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No student details entered yet.");
                    } else {
                        displayStudentDetails(students);
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }

    public static Student enterStudentDetails(Scanner scanner) {
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        ArrayList<Double> marks = new ArrayList<>();
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            double mark = scanner.nextDouble();
            marks.add(mark);
        }

        Student student = new Student(name);
       student.setMarks(marks);
        return student;
    }

    public static void displayStudentDetails(ArrayList<Student> students) {
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName());
            System.out.println("Marks for 5 subjects: " + student.getMarks());
            System.out.println("Total Marks: " + student.calculateTotalMarks());
            System.out.println("Average Marks: " + student.calculateAverageMarks());
            System.out.println();
        }
    }
}

