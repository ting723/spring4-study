package zhanglw.springinaction.study.s1.c2.xml;

import java.util.List;

/**
 * Created by zhanglw on 2016/11/20.
 */
public class XML_BlankDisc implements XML_CompactDisc {

    private String title;

    private String artist;

    private List<String> tracks;

    public XML_BlankDisc() {
    }

    public XML_BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public XML_BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);

        if(tracks!=null)
        {
            for (String track : tracks) {
                System.out.println("-Track: " + track);
            }
        }
    }
}
