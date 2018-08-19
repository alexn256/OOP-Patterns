package structural.dao;

import java.util.List;
import java.util.Optional;

/**
 * @author Alexander Naumov
 *
 */


public class StudentDao implements Dao<Student> {

    private static Database database;

    public StudentDao() {
        if (database == null){
            database = new Database();
        }
    }

    @Override
    public Optional<Student> getStudent(int id) {
        return database.read(id);
    }

    @Override
    public void deleteStudent(Student student) {
        database.delete(student);
    }

    @Override
    public void updateStudent(Student student) {
        database.create(student);
    }

    @Override
    public Optional<List<Student>> getStudents() {
        return database.list();
    }
}
