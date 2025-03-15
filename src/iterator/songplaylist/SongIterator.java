package iterator.songplaylist;

public interface SongIterator<T> {
    boolean hasNext();
    T next();
    T shuffle();
}
