package design.extend.mvc;

/**
 * @author huangjunyi
 * @date 2022/9/28 18:06:11
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
