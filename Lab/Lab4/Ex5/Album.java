package Ex5;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String title;
    private String genre;
    private List<Song> songs;

    public Album(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.songs = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void displaySongs() {
        if (songs.isEmpty()) {
            System.out.println("None of song");
        } else {
            for (int i = 0; i < songs.size(); i++) {
                System.out.printf("| %d %s\n", i + 1, songs.get(i).toString());
            }
        }
    }

    @Override
    public String toString() {
        return title + " (" + genre + ")";
    }
}
