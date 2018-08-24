package structural.facade.converter;

import java.io.File;

/**
 * @author Alexander Naumov
 */

public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade facade = new VideoConversionFacade();
        File file = facade.convertVideo("youtube_video.m4", "ogg");
    }
}
