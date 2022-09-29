package design.extend.dao;

import java.util.List;

/**
 * @author huangjunyi
 * @date 2022/9/29 14:09:48
 */
public interface StudentDao {
    public List<Student> getAllStudents();

    public Student getStudent(int rollNo);

    public void updateStudent(Student student);

    public void deleteStudent(Student student);
}
