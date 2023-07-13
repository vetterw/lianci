package org.chnjkfp.lianci.service;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;

@Service
public class FileService {
    public void saveFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath + fileName);
        out.write(file);
        out.flush();
        out.close();
    }
}
