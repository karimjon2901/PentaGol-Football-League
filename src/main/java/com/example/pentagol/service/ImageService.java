package com.example.pentagol.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class ImageService {

    public String filePath(String folder, String ext) {
        LocalDate localDate = LocalDate.now();
        String path = localDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        File file = new File(folder + "/" + path);
        if (!file.exists()) {
            file.mkdirs();
        }
        String uuid = UUID.randomUUID().toString();
        return file.getPath() + "\\" + uuid + ext;
    }

    public String saveFile(MultipartFile image) {
        String ext = image.getOriginalFilename().substring(image.getOriginalFilename().lastIndexOf("."));


        try {
            String filePath;
            Files.copy(image.getInputStream(), Path.of(filePath = filePath("upload", ext)));

            return filePath;
        } catch (IOException e) {
            return null;
        }
    }
    public MultipartFile getImage(String imageUrl) throws FileNotFoundException {
        File file = new File(imageUrl);
        FileInputStream input = new FileInputStream(file);
        MultipartFile multipartFile = new MockMultipartFile("file",file.getName(),
                "application/docx", IOUtils.toByteArray(input));

        return multipartFile;
    }

}
