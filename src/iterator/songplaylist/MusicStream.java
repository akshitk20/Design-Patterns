package iterator.songplaylist;

import java.time.Instant;

public class MusicStream {
    public static void main(String[] args) {
        SongManager songManager = new SongManager();
        songManager.addSong(new Song("No love", Instant.now()));
        songManager.addSong(new Song("Not afraid", Instant.now()));
        songManager.addSong(new Song("Mocking Bird", Instant.now()));
        songManager.addSong(new Song("Rap god", Instant.now()));
        songManager.addSong(new Song("Venom", Instant.now()));

        SongIterator songIterator = songManager.getSongIterator();
        while (songIterator.hasNext()) {
            Song song = (Song)songIterator.next();
            System.out.println(song.getName());
            Song song1 = (Song)songIterator.shuffle();
            System.out.println(song1.getName());
        }
    }
}
