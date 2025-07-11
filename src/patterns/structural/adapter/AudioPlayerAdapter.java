package patterns.structural.adapter;

public class AudioPlayerAdapter implements AudioPlayer {

    private final LegacyMp3Player mp3Player = new LegacyMp3Player();

    @Override
    public void play(String fileName) {
        mp3Player.playMp3File(fileName);
    }

}
