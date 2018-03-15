import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Problem15 {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        int name1 = 5;
        int name2 = 2;

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
            int sum = name1/name2;
            System.out.println(sum);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } 
        else {        		
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

class Student{
	int id;
	String name;
	double cgpa;
	
	Student(int id, String name, double cgpa){
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	int getID() {
		return id;
	}
	
	String getName() {
		return name;
	}
	
	double getCGPA() {
		return cgpa;
	}
	
}

class Priorities{
	
	List<Student> getStudents(List<String> events){
		List<Student> students = new ArrayList();
		PriorityQueue<Student> student_queue = new PriorityQueue();
		String temp;
		
		for(int i = 0; i < events.size(); i++) {
			if(!events.get(i).equals("SERVED")) {
				temp = events.get(i);
				String[] splited = temp.split(" ");
				Student testing = new Student(Integer.parseInt(splited[4]),splited[2],Double.parseDouble(splited[3]));
				students.add(testing);
			}
			else {
				
			}
		}
		
		return null;
	}
}