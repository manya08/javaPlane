package com.tarena.shoot;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import javax.swing.JFrame;
import java.net.URL;
public class Music extends JFrame{
   Music(){
       setSize(200,200);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);

       URL codebase=null;
        try {
            codebase = new URL("file:/D:/myp/src/com/tarena/shoot/MKJ - Time.mp3");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        AudioClip audio1= Applet.newAudioClip(codebase);
        audio1.loop();
    }
    public static void main(String[] args) {
        new Music();
    }
}