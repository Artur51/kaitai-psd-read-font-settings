import com.gen.kaitai.psd.v1.PsdKaitai;
import kaitai.ByteBufferKaitaiStreamEx;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class Main {

    public static void main(
            String[] args) {
        PsdKaitai k1 = getKaitai("psd/Comic Sans MS-Regular-30.psd");
        PsdKaitai k2 = getKaitai("psd/Courier New-Italic-36.psd");
        PsdKaitai k3 = getKaitai("psd/DejaVu Sans-Condensed-36.psd");
    }

    public static PsdKaitai getKaitai(
            String name) {
        try {
            File file = getFile(name);
            ByteBufferKaitaiStreamEx stream = new ByteBufferKaitaiStreamEx(file);
            PsdKaitai psdKaitai = new PsdKaitai(stream);
            System.out.println(name + psdKaitai);
            return psdKaitai;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static File getFile(
            String name) throws URISyntaxException {
        ClassLoader classLoader = new Main().getClass().getClassLoader();
        URL resource = classLoader.getResource(name);
        File file = Paths.get(resource.toURI()).toFile();
        return file;
    }
}
