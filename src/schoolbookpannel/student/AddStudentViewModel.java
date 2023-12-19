package schoolbookpannel.student;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

import schoolbookpannel.dto.Student;
import schoolbookpannel.repository.SchoolBookPannelRepository;

public class AddStudentViewModel {
	
	private AddStudent addStudent;
//	
//	public AddStudentViewModel(Student student) {
//		this.student=student;
//		
//	}
	

    public AddStudentViewModel(AddStudent addStudent) {
    	this.addStudent=addStudent;
	}

// 1.add user details
   
	public void validate(Student student) {
        
            SchoolBookPannelRepository.getInstanse().insertStudent(student);
            this.addStudent.onSuccess();
       
    
	}
	
	
// 2.view user details
	
	public void viewUsers() {
	    Stack<Student> students = SchoolBookPannelRepository.getInstanse().getStudents();
	    
	    if (students.isEmpty()) {
	        System.out.println("No students found.");
	    } else {
	        System.out.println("List of students:");
	        for (Student student : students) {
	            // Process or display student information
	        	this.addStudent.studentlist(student);

	        }
	    }
	}

	
	public void update(String nameToUpdate) {
		Stack<Student> students=SchoolBookPannelRepository.getInstanse().getStudents();
	    
		boolean found=false;
		for(Student student:students) {
			
		    System.out.println(student);
				found=true;
				
				Scanner in=new Scanner(System.in);
				
				System.out.println("1.name\n 2.DOB \n 3.mobileno\n 4.email \n5.back");
				int choice=in.nextInt();
				 in.nextLine();
					
				switch(choice) {
				
				case 1:  System.out.println("Enter the name: ");
				          String newName=in.nextLine();
				          student.setName(newName);
				         break;
				         
				case 2:	System.out.println("Enter the DOB: ");
				         String newDOB=in.nextLine();
				         student.setDOB( newDOB);
			             break;
			             
				case 3: 	System.out.println("Enter the MobileNo: ");
				           String newMobileNo=in.nextLine();
                            student.setMobileno(newMobileNo);
                            break;
				case 4:	System.out.println("Enter the email: ");
				        String newEmail=in.nextLine();

						student.setEmail(newEmail);
						break;
				
	                default:
	                    System.out.println("Invalid choice.");
	                    break;
					
						
				       
			
				}
					
					
				//SchoolBookPannelRepository.getInstanse().updateStudent(student);
				System.out.println("Student details updated successfully.");
				break;
			}
		
		
		  if (!found) {
		        System.out.println("Student not found.");
		    }
		
	}
	
	
	
	public void delete(String nameToDelete) {
	    Stack<Student> students = SchoolBookPannelRepository.getInstanse().getStudents();
	    boolean found = false;
        
	    Iterator<Student> iterator=students.iterator();
	    while(iterator.hasNext()) {
	    	Student student=iterator.next();
	    	if(student.getName().equalsIgnoreCase(nameToDelete)) {
	    		iterator.remove();
	    		found=true;
	    		System.out.println("Student deleted successfully");
	    		break;
	    	}
	    }

	    if (!found) {
	        System.out.println("Student not found.");
	    }

	    // Update the repository with the modified list of students
	    SchoolBookPannelRepository.getInstanse().setStudents(students);
	}

}
	






	      
//	    
//	 public void getusername() {
//		 List<String> viewname = SchoolBookPannelRepository.getInstanse().viewname();
//		 this.addStudent.getViewInfo(viewname);
//	 }




		  
