package iterator.songplaylist;

import java.util.ArrayList;
import java.util.List;

public class SongManager {
    List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public SongIterator getSongIterator() {
        return new SongIteratorImpl(songs);
    }
}
