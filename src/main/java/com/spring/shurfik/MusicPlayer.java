package com.spring.shurfik;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private String volume;

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("someRapMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }

    public String playMusic() {
        return "Playing " + music1.getSong() + " " + music2.getSong();



        //private List<Music> music = new ArrayList<>();
        /*private String name;
        private int volume;*/
        //private Music music;


        //IoC
        /*public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public List<Music> getMusic() {
        return music;
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }*/

        /*

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
*/
        /*System.out.println("Playing " + rapMusic.getSong());
        System.out.println("Playing " + rockMusic.getSong());*/
    }
}
