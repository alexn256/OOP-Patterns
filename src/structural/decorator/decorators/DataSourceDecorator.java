package structural.decorator.decorators;

/**
 * Basic decorator.
 *
 * @author Alexander Naumov
 */


public class DataSourceDecorator implements DataSource{

    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
