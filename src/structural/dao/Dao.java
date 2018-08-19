package structural.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Alexander Naumov
 *
 */


public interface Dao<T> {
    Optional<T> getStudent(int id);
    void deleteStudent(Student student);
    void updateStudent(Student student);
    Optional<List<T>>getStudents();
}
