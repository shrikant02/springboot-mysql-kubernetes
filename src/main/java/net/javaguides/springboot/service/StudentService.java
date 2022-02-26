package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.model.Student;
import org.springframework.data.domain.Page;

public interface StudentService {
	List<Student> getAllStudents();
	void saveStudent(Student student);
	Student getStudentById(long id);
	void deleteStudentById(long id);
	Page<Student> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
