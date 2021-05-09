package com.spring.shurfik;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    //private List<Music> music = new ArrayList<>();
    /*private String name;
    private int volume;*/
    //private Music music;

    private RapMusic rapMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(RapMusic rapMusic, RockMusic rockMusic) {
        this.rapMusic = rapMusic;
        this.rockMusic = rockMusic;
    }

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

    public String playMusic() {
        return "Playing " + rapMusic.getSong();
        /*System.out.println("Playing " + rapMusic.getSong());
        System.out.println("Playing " + rockMusic.getSong());*/
    }
}
