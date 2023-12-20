package schoolbookpannel.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

import schoolbookpannel.dto.Student;
import schoolbookpannel.student.AddStudent;

public class SchoolBookPannelRepository {

	private static SchoolBookPannelRepository repository;

	private List<Student> studentList = new ArrayList<Student>();

	private SchoolBookPannelRepository() {

	}

	public static SchoolBookPannelRepository getInstanse() {
		if (repository == null) {
			repository = new SchoolBookPannelRepository();
		}
		return repository;
	}

	// 1.add
	public void insertStudent(Student Student) {
		studentList.add(Student);
	}

	// 2.view
	public List<Student> getStudents() {

		return studentList;
	}

	public void setStudents(List<Student> updatedStudents) {
		this.studentList = updatedStudents;

	}

}
