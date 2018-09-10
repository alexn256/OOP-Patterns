package structural.decorator.decorators;

/**
 * Interface, for basic read/write operations.
 *
 * @author Alexander Naumov
 */


public interface DataSource {
    String readData();
    void writeData(String data);
}
