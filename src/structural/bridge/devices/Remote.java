package structural.bridge.devices;

/**
 * Common interface for all remotes.
 *
 * @author Alexander Naumov
 */


public interface Remote {

    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}
