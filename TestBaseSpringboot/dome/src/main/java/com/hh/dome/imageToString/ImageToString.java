package com.hh.dome.imageToString;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import javax.imageio.ImageIO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class ImageToString {
    private static Log log = LogFactory.getLog(ImageToString.class);

    public static void main(String[] args) {
        String s = imageToString("C:\\Users\\Administrator\\Desktop\\1.png");
        System.out.println(s);
    }

    // 根据图片地址将图片转换为字符串类型的数据
    public static String imageToString(String picture) {
        StringBuffer sb2 = new StringBuffer();
        BufferedImage image1 = getImage(picture);
        byte[] img = getBytes(image1);

        for (int i = 0; i < img.length; i++) {
            if (sb2.length() == 0) {
                sb2.append(img[i]);
            } else {
                sb2.append("," + img[i]);
            }
        }
        return sb2.toString();

    }
    // 将BufferImage 转换为字节数组
    private static byte[] getBytes(BufferedImage image) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "PNG", baos);
        } catch (Exception e) {
            log.info(e);
        }
        return baos.toByteArray();
    }
    // 根据图片地址得到BufferedImage
    public static BufferedImage getImage(String picture) {

        try {
            BufferedImage bImage = ImageIO.read(new File(picture));
            return bImage;
        } catch (Exception ex) {
            log.info(ex);
            return null;
        }

    }

}