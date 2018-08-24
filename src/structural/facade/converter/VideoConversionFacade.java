package structural.facade.converter;

import java.io.File;

/**
 * @author Alexander Naumov
 */

public class VideoConversionFacade {

    public File convertVideo (String filename, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile videoFile = new VideoFile(filename);
        Codec sourceCodec = CodecFactory.extract(videoFile);
        Codec destinationCodec;
        if (format.equals("mp4")){
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(videoFile, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
