package netgloo.service;

import java.util.List;

import netgloo.entity.Student;

public interface IStudentService {
	List<Student> getStudents();

	void deleteStudent(Long id);

	Student showEditStudent(Long id);

	void addStudent(Long id,String name,String age);

	void editStudent(String name,String age,Long checkId);

}
