package structural.dao;

import java.util.List;
import java.util.Optional;

/**
 * @author Alexander Naumov
 *
 */


public class Database<T> {

    void create(T t){
        System.out.println(t + "was successfully saved to database.");
    }

    Optional<T> read(int id) {
        System.out.println("entity with id - " + id + " was successfully got from database.");
        return Optional.empty();
    }

    void delete(T t){
        System.out.println(t + "was successfully removed from database.");
    }

    Optional<List<T>> list(){
        System.out.println("all entities were successfully got from database.");
        return Optional.empty();
    }
}
