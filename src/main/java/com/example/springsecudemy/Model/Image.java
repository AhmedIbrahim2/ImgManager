package com.example.springsecudemy.Model;


import jakarta.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long image_id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getImgData() {
        return imgData;
    }

    public void setImgData(byte[] imgData) {
        this.imgData = imgData;
    }

    private String type ;

    private String name ;

    @Lob
    @Column(name = "img_data", columnDefinition="LONGBLOB")
    private byte[] imgData;

    public void setImage_id(Long imageId) {
        this.image_id = imageId;
    }

    public Long getImage_id() {
        return image_id;
    }
}
