package com.company;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class ShowImage extends Panel {

    public void paint(Graphics g) {
        g.drawImage( image, 175, 175, null);
    }

    public String random() {
        double number = Math.random();
        number *= 6;
        int randomNr = (int) Math.round(number);
        String numar = String.valueOf(randomNr);
        return(numar);
    }

//    Include your path to make it work
    String imageName = "C:\\Users\\romeo\\Desktop\\Java\\Dice\\src\\com\\company\\images\\" + random() + ".png";

    BufferedImage  image;
    public ShowImage() {
        try {
            File input = new File(imageName);
            image = ImageIO.read(input);
        } catch (IOException ie) {
            System.out.println("Error:"+ie.getMessage());
        }
    }


    static public void main(String args[]) throws
            Exception {
        JFrame frame = new JFrame("Display image");
        Panel panel = new ShowImage();
        frame.getContentPane().add(panel);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}