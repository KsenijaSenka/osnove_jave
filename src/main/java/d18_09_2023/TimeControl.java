package d18_09_2023;

public class TimeControl extends Control{
    private boolean pomeraVremeNavise;
    public TimeControl(boolean pomeraVremeNavise) {
        this.pomeraVremeNavise=pomeraVremeNavise;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (pomeraVremeNavise) {
            if (videoPlayer.getTrenutnoVreme() <= videoPlayer.getDuzina() - 15) {
                videoPlayer.setTrenutnoVreme(videoPlayer.getDuzina() + 15);
            } else {
                videoPlayer.setTrenutnoVreme(videoPlayer.getDuzina());
            }
        } else {
            if (videoPlayer.getTrenutnoVreme() < 15) {
                videoPlayer.setTrenutnoVreme(0);
            } else videoPlayer.setTrenutnoVreme(videoPlayer.getTrenutnoVreme() - 15);
        }
    }
}
