import java.io.File;

public interface FileFilter {
    boolean accept(File file);
}
