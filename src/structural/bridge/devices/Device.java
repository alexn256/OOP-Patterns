package structural.bridge.devices;

/**
 * Common interface for all devices.
 *
 * @author Alexander Naumov
 */


public interface Device {

    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int volume);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
