package schoolbookpannel.student;

import java.util.List;
import java.util.Scanner;


import schoolbookpannel.dto.Student;

public class AddStudent {
	private static final String String = null;
	private AddStudentViewModel addStudentviewmodel;
	 
	public AddStudent() {
		addStudentviewmodel=new AddStudentViewModel(this);
	}
	
	
	public void nam() {
		 Scanner in = new Scanner(System.in);
	        String name;
	        String DOB;
	        String mobileno;
	        String email;
	      
	      

	        while (true) {
	            System.out.println("Enter a student name  (type 'exit' to stop adding names):");
	            name = in.nextLine();
	            if (name.equalsIgnoreCase("exit")) {
	                break;
	            }
	            
	            System.out.println("Enter a student DOB : ");
	           DOB = in.nextLine();
	           System.out.println("Enter a student mobileno: ");
	           mobileno = in.nextLine();
	           System.out.println("Enter a student email  ");
	          email = in.nextLine();
	           
	            
	            

	           
	            Student student=new Student(name,DOB,mobileno,email);
	        	addStudentviewmodel.validate(student);
	           
	}
	}
	

	public void viewUsers()  {
		addStudentviewmodel.viewUsers();
	}
	
	public void updateUsers()  {
		addStudentviewmodel.update(String);
	}
	
	public void deleteUsers()  {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the name of the student to delete:");
		String nameToDelete = in.nextLine();
		 
		addStudentviewmodel.delete(nameToDelete);
	}
	public void onSuccess() {
		System.out.println("Inserted Successfully");

	}
	

	public void showError(String errorMessage) {
		System.out.println(errorMessage);
	}
   public void studentlist(Student student) {
	   System.out.println("---------------------------");
       System.out.println("Name: " + student.getName());
       System.out.println("DOB: " + student.getDOB());
       System.out.println("Mobile No: " + student.getMobileno());
       System.out.println("Email: " + student.getEmail());
       System.out.println("---------------------------");
   }



}
