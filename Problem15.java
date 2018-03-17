import java.util.*;

public class Problem15 {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
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

class Priorities implements Comparator<Student>{
	
	List<Student> getStudents(List<String> events){
		Comparator<Student> compare = new Priorities();
		PriorityQueue<Student> studentQueue = new PriorityQueue(compare);
		String inputLine;
		
		for(int i = 0; i < events.size(); i++) {
			if(!events.get(i).equals("SERVED")) {
				inputLine = events.get(i);
				String[] extract = inputLine.split(" ");
				Student info = new Student(Integer.parseInt(extract[3]), extract[1], Double.parseDouble(extract[2]));
				studentQueue.offer(info);
			}
			else if (events.get(i).equals("SERVED")){
				if(studentQueue.peek() == null) {
					
				}
				else {
					studentQueue.remove();
				}
			}
		}
		
		List<Student> students = new ArrayList<>(studentQueue);
		
		Student[] array = new Student[students.size()];
		int i = 0;
		while (!studentQueue.isEmpty()) {
		    array[i] = studentQueue.poll();
			i++;
		}
		
		students.clear();
		
		students = Arrays.asList(array);
		
		return students;
	}
	
	@Override
	public int compare(Student s1, Student s2) {
	    if (Double.compare(s1.getCGPA(), s2.getCGPA()) > 0) 
	    		return -1;	    
	    if (Double.compare(s1.getCGPA(), s2.getCGPA()) < 0) 
	    		return +1;	    
	    
	    	if(s1.getName().compareTo(s2.getName()) > 0)
	    		return +1;
	    if (s1.getName().compareTo(s2.getName()) < 0)
	    		return -1;
		    
	    	if(s1.getID() > s2.getID())
	    		return -1;
	    if (s1.getID() < s2.getID())
	    		return +1;
	    else
	    		return 0;  
	    
	}
}
