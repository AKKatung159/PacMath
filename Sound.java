import javax.sound.sampled.*;
import java.net.URL;

public class Sound {
    private Clip clip;
    private URL soundURL[] = new URL[20];
    public Sound() {
        soundURL[0] = getClass().getResource("Background/ping_pong_8bit_plop.wav");
        soundURL[1] = getClass().getResource("Background/pacman_beginning.wav");
        soundURL[2] = getClass().getResource("Background/sound.wav");
    }
    public void setFile(int i) {
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        } catch (Exception ignored) {}
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