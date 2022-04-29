import javax.sound.sampled.*;
import java.net.URL;

public class Sound {
    private Clip clip;
    private URL soundURL[] = new URL[20];
    public Sound() {
        soundURL[0] = getClass().getResource("Sound/ping_pong_8bit_plop.wav");
        soundURL[1] = getClass().getResource("Sound/pacman_beginning.wav");
        soundURL[2] = getClass().getResource("Sound/sound.wav");
        soundURL[3] = getClass().getResource("Sound/deathSound.wav");
        soundURL[4] = getClass().getResource("Sound/add score.wav");
        soundURL[5] = getClass().getResource("Sound/loseScore.wav");
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