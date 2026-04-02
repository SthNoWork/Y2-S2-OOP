package Ex5;

import java.util.ArrayList;
import java.util.List;

public class MusicStore {
    private List<Album> albums;

    public MusicStore() {
        this.albums = new ArrayList<>();
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public void addSongToAlbum(int albumIndex, Song song) {
        if (albumIndex >= 0 && albumIndex < albums.size()) {
            albums.get(albumIndex).addSong(song);
        }
    }

    public void displayStore() {
        System.out.println("====== Music Store ======");
        for (int i = 0; i < albums.size(); i++) {
            Album album = albums.get(i);
            System.out.println("Album: " + album.getTitle());
            album.displaySongs();
        }
    }
}
