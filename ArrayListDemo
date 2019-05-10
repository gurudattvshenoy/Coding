package InterviewQuestion.questions;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo 
{
	
	public static void main(String [] args) 
	{
		List <Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Gurudatt", "Shenoy"));
		empList.add(new Employee(2, "Shikhar", "Dhavan"));
		empList.add(new Employee(3, "Rohit", "Sharma"));
	
		System.out.println(empList.get(0));
		
		if(empList.contains(new Employee(3, "Rohit", "Sharma"))){
			System.out.println("Rohit sharma is in wc xi");	
		}
		empList.add(3, new Employee(3, "Rohit", "Sharma"));
		
		//empList.remove(1);
		empList.set(2, new Employee(5, "Rohit", "Sharma"));
		for (Employee e : empList) {
			System.out.println(e);
		}
		
	}
}
