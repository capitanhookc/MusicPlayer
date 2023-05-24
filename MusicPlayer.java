import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<String> playlist;
    private boolean isPlaying;
    private int currentTrackIndex;

    public MusicPlayer() {
        playlist = new ArrayList<>();
        isPlaying = false;
        currentTrackIndex = 0;
    }

    public void addTrack(String track) {
        playlist.add(track);
    }

    public void removeTrack(String track) {
        playlist.remove(track);
    }

    public void play() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty. Add tracks to start playing.");
            return;
        }

        isPlaying = true;
        System.out.println("Playing: " + playlist.get(currentTrackIndex));
    }

    public void pause() {
        if (!isPlaying) {
            System.out.println("Player is not currently playing.");
            return;
        }

        isPlaying = false;
        System.out.println("Paused.");
    }

    public void nextTrack() {
        if (currentTrackIndex == playlist.size() - 1) {
            System.out.println("End of playlist reached.");
            return;
        }

        currentTrackIndex++;
        System.out.println("Playing next track: " + playlist.get(currentTrackIndex));
    }

    public void previousTrack() {
        if (currentTrackIndex == 0) {
            System.out.println("Beginning of playlist reached.");
            return;
        }

        currentTrackIndex--;
        System.out.println("Playing previous track: " + playlist.get(currentTrackIndex));
    }

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.addTrack("Track 1");
        musicPlayer.addTrack("Track 2");
        musicPlayer.addTrack("Track 3");

        musicPlayer.play(); // Playing: Track 1

        musicPlayer.nextTrack(); // Playing next track: Track 2

        musicPlayer.pause(); // Paused.
    }
}
