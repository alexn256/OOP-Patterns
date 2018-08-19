package structural.dao;

/**
 * @author Alexander Naumov
 *
 */


public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alex", "Naumov", 30);
        student.setId(14);
        Dao<Student> studentDao = new StudentDao();
        studentDao.updateStudent(student);
        studentDao.deleteStudent(student);
        studentDao.getStudent(14);
        studentDao.getStudents();
    }
}