package behavioral.observer.publisher.listeners;

import java.io.File;

/**
 * @author Alexander Naumov.
 */

public interface EventListener {
    void update(String eventType, File file);
}
