package netgloo.service.iml;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import netgloo.entity.Student;
import netgloo.service.IStudentService;

@Service("iStudentService")
public class ImlStudentService implements IStudentService{

	private static List<Student> listStudent = new ArrayList<>();

	@Override
	public List<Student> getStudents() {
		return listStudent;
	}

	@Override
	public void deleteStudent(Long id) {

		for (int i = 0; i < listStudent.size(); i++) {

			if (listStudent.get(i).getId().equals(id)) {
				listStudent.remove(i);
			}
		}
	}

	@Override
	public Student showEditStudent(Long id) {
		for (int i = 0; i < listStudent.size(); i++) {

			if (listStudent.get(i).getId().equals(id)) {

				return listStudent.get(i);
			}
		}
		return null;
	}

	@Override
	public void addStudent(Long id, String name, String age) {
		Student student = new Student();

		student.setId(id);
		student.setName(name);
		student.setAge(Integer.parseInt(age));

		listStudent.add(student);
	}

	@Override
	public void editStudent(String name, String age, Long checkId) {
		
		for (int i = 0; i < listStudent.size(); i++) {

			if (listStudent.get(i).getId().equals(checkId)) {

				listStudent.get(i).setName(name);
				listStudent.get(i).setAge(Integer.parseInt(age));
			}
		}
	}
}
