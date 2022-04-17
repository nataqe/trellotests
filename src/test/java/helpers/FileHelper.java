package helpers;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class FileHelper {

    public static String getResourceAsString(String path) throws IOException {
        ClassLoader cl = FileHelper.class.getClassLoader();
        File file = new File(Objects.requireNonNull(cl.getResource(path)).getFile());
        return FileUtils.readFileToString(file, StandardCharsets.UTF_8);
    }
}
