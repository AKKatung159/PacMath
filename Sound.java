import java.io.*;
import javax.sound.sampled.*;
import java.net.URL;

public class Sound {
    Clip clip;
    URL soundURL[]=new URL[20];
    public Sound(){
        soundURL[0]=getClass().getResource("Background/ping_pong_8bit_plop.wav");
        soundURL[1]=getClass().getResource("Background/pacman_beginning.wav");
    }
    public void setFile(int i){
        try{
            AudioInputStream ais =AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        }catch (Exception e){

        }
    }
    public void play(){
        clip.start();
    }
    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void stop(){
        clip.stop();
    }
    }