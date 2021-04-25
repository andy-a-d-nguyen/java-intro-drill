import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    public String name;

    private ArrayList<Song> playlist = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public boolean isEmpty() {
        if (name.equals("")) {
            return true;
        } else if (playlist.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void addSong(Song song) {
        if (!name.equals("")) {
            playlist.add(song);
        }
    }

    public String[] songNames() {
        String[] songNames = new String[playlist.size()];

        for (int i = 0; i < playlist.size(); i++) {
            songNames[i] = playlist.get(i).title;
        }

        return songNames;
    }

    public int totalDuration() {
        int totalDuration = 0;

        for (int i = 0; i < playlist.size(); i++) {
            totalDuration += playlist.get(i).durationInSeconds;
        }

        return totalDuration;
    }

    public void swap(Song firstSong, Song secondSong) {
        Collections.swap(playlist, playlist.indexOf(firstSong), playlist.indexOf(secondSong));
    }

    public void removeSong(Song song) {
        playlist.remove(song);
    }
}
