package structural.facade.converter;

import java.io.File;

/**
 * @author Alexander Naumov
 */

public class AudioMixer {
    public File fix (VideoFile result) {
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
