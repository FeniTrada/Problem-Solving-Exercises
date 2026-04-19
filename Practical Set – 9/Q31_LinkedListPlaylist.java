import java.util.*;

public class Playlist {
    public static void main(String[] args) {
        LinkedList<String> songs = new LinkedList<>();

        songs.add("Song1");
        songs.add("Song2");
        songs.add("Song3");
        songs.add("Song4");

        System.out.println("Playlist: " + songs);

        // Play first song
        songs.removeFirst();
        System.out.println("After playing first song: " + songs);

        // Skip last song
        songs.removeLast();
        System.out.println("After skipping last song: " + songs);
    }
}
