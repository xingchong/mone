package org.nutz.lang.util;

import org.nutz.log.Log;
import org.nutz.log.Logs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author goodjava@qq.com
 */
public abstract class ZipUtils {

    private static final Log log = Logs.get();

    public static List<String> names(String filePath, String endSuffix) {
        log.info("filePath:" + filePath + ",endSuffix:" + endSuffix);
        List<String> result = new ArrayList<>();
        try {
            InputStream in = new BufferedInputStream(new FileInputStream(filePath));
            Charset charset = Charset.forName("utf8");
            ZipInputStream zin = new ZipInputStream(in, charset);
            ZipEntry ze;
            while ((ze = zin.getNextEntry()) != null) {
                if (ze.getName().endsWith(endSuffix)) {
                    result.add(ze.getName());
                }
            }
            zin.closeEntry();
            in.close();
        } catch (Throwable ex) {
            ex.printStackTrace();
            log.error(ex.getMessage(), ex);
        }
        return result;
    }
}
