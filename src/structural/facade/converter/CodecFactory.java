package structural.facade.converter;

/**
 * @author Alexander Naumov
 */

public class CodecFactory {

    public static Codec extract(VideoFile file) {
        if (file.getCodecType().equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
