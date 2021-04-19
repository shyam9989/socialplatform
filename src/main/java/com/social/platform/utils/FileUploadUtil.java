package com.social.platform.utils;
import java.io.*;
import java.nio.file.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.social.platform.dao.pictureRepository;
import com.social.platform.model.PicturesModel;
 

public class FileUploadUtil {
     
	     @Autowired
         pictureRepository pictureRepository;
       
	public static void saveFile(String uploadDir, String fileName,
            MultipartFile multipartFile,PicturesModel pm) throws IOException {
        Path uploadPath = Paths.get(uploadDir);
         
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }
         
        try (InputStream inputStream = multipartFile.getInputStream()) {
            Path filePath = uploadPath.resolve(fileName);
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
            
            
        } catch (IOException ioe) {        
            throw new IOException("Could not save image file: " + fileName, ioe);
        }      
    }
}