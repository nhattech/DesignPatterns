package some_complex_media_library;

public class BitrateReader {
    public static VideoFile read(VideoFile file, ICodec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, ICodec codec) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}