package schoolbookpannel.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

import schoolbookpannel.dto.Student;
import schoolbookpannel.student.AddStudent;

public class SchoolBookPannelRepository {
	
	private static SchoolBookPannelRepository repository;
	
	private Stack<Student> studentList=new Stack<Student>();
	//private List<String> studentNames=new ArrayList<>();
	private SchoolBookPannelRepository() {
		
		
	}
	public static SchoolBookPannelRepository getInstanse() {
		if(repository==null) {
			repository=new SchoolBookPannelRepository();
		}
		return repository;
	}
	//1.add
	public void insertStudent(Student Student) {
		studentList.push(Student);
	}
	//2.view
	public Stack<Student> getStudents() {

		    return studentList;
	}
	

	public void setStudents(Stack<Student> updatedStudents) {
        this.studentList = updatedStudents;
        // You might also update a database or file with the updated list here
    }

//	
//	Stack<Student> copyStudentList = new Stack<>();
//  copyStudentList.addAll(studentList);
	

}

//public Stack<Student> updateStudent(Student updatedStudent) {
//for(Student student11:studentList) {
//	if(student11.getName().equalsIgnoreCase(updatedStudent.getName())) {
//	if(student11.getDOB().equalsIgnoreCase(updatedStudent.getDOB())) {
//
//	if(student11.getMobileno().equalsIgnoreCase(updatedStudent.getMobileno())) {
//
//	if(student11.getEmail().equalsIgnoreCase(updatedStudent.getEmail())) {
//
////    System.out.println("Updated Student Details:");
////    System.out.println("Name: "+student11.getName());
////    System.out.println("DOB: "+student11.getDOB());
////    System.out.println("Mobileno: "+student11.getMobileno());
////    System.out.println("Eamil: "+student11.getEmail());
//    break;
//}
//}
//}			
//}
//}
//  
//return studentList;
//}
//
