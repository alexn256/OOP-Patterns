package structural.facade.converter;

/**
 * @author Alexander Naumov
 */

public class BitrateReader {

    public static VideoFile read (VideoFile file, Codec codec) {
        System.out.println("BitrateConverter read file...");
        return file;
    }

    public static VideoFile convert (VideoFile buffer, Codec codec) {
        System.out.println("BitrateConverter write file...");
        return buffer;
    }
}
