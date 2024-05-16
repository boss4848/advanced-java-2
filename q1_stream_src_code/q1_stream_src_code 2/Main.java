package q1_stream_src_code;

import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        List<Album> albums = SampleData.albums.collect(Collectors.toList());
        albums.forEach((a) -> System.out.println(a.getName()));

        Set<String> longTracks = findLongTracks(albums);
        longTracks.forEach((a) -> System.out.println(a));
    }

    // Provided code
    // public static Set<String> findLongTracks(List<Album> albums) {
    // Set<String> trackNames = new HashSet<>();
    // for (Album album : albums) {
    // for (Track track : album.getTrackList()) {
    // if (track.getLength() > 60) {
    // String name = track.getName();
    // trackNames.add(name);
    // }
    // }
    // }
    // return trackNames;
    // }

    // Refactored
    public static Set<String> findLongTracks(List<Album> albums) {
        return albums.stream()
                .flatMap((Album a) -> a.getTrackList().stream())
                .filter((Track t) -> t.getLength() > 60)
                .map((Track t) -> t.getName())
                .collect(Collectors.toSet());
    }
}

// public static Set<String> findLongTracks(List<Album> albums) {
// Set<String> trackNames = new HashSet<>();
// albums.stream()
// .forEach((Album a) -> a.getTrackList()
// .stream()
// .filter((Track t) -> t.getLength() > 60)
// .map((t) -> t.getName()).forEach((t) -> trackNames.add(t)));
// return trackNames;
// }
// }
