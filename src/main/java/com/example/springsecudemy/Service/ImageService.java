package com.example.springsecudemy.Service;

import com.example.springsecudemy.Model.Image;
import com.example.springsecudemy.Repository.imageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@Service
public class ImageService {

    @Autowired
    imageRepository repository;


    public Image saveImage(MultipartFile file) throws IOException {
        Image imageData = new Image();
        imageData.setName(file.getOriginalFilename());
        imageData.setType(file.getContentType());
        imageData.setImgData(file.getBytes());

        return repository.save(imageData);
    }

    public Image getImageById(Long id) {
        return repository.findById(id).orElse(null);
    }


}
