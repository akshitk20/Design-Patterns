package iterator.songplaylist;

import java.time.Instant;

public class Song {
    private String name;
    private Instant duration;

    public Song(String name, Instant duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getDuration() {
        return duration;
    }

    public void setDuration(Instant duration) {
        this.duration = duration;
    }
}
