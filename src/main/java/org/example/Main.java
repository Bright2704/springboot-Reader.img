package org.example;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ImageIO.getReaderFormatNames()));       //ImageIO.getReaderFormatNames รองรับการอ่านรูปภาพ
        // [JPG, jpg, tiff, bmp, BMP, gif, GIF, WBMP, png, PNG, JPEG, tif, TIF, TIFF, wbmp, jpeg]
        System.out.println(Arrays.toString(ImageIO.getWriterFileSuffixes()));      //ImageIO.getWriterFileSuffixes รองรับการเขียนรูปภาพ
        //[JPG, jpg, tiff, bmp, BMP, gif, GIF, WBMP, png, PNG, JPEG, tif, TIF, TIFF, wbmp, jpeg]
//        upload();

    }

    public static void upload() {
        String urlImageLocaltion = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/Wat_Phra_Kaew_-_1.jpg/250px-Wat_Phra_Kaew_-_1.jpg";
        try {
            URL url = new URL(urlImageLocaltion);
            BufferedImage img = ImageIO.read(url);
            File outputImageFile = new File("saveImage.jpg");
            ImageIO.write(img, "jpg", outputImageFile);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}