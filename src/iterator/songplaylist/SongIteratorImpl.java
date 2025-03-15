package iterator.songplaylist;

import java.util.List;
import java.util.Random;

public class SongIteratorImpl implements SongIterator {

    List<Song> songs;
    int pos = 0;
    int size;

    public SongIteratorImpl(List<Song> songs) {
        this.songs = songs;
        this.size = songs.size();
    }

    @Override
    public boolean hasNext() {
        return pos < size;
    }

    @Override
    public Object next() {
        Song song = songs.get(pos);
        pos++;
        return song;
    }

    @Override
    public Object shuffle() {
        int index = (new Random().nextInt() + size) % size;
        Song song = songs.get(index);
        pos = index;
        return song;
    }
}
