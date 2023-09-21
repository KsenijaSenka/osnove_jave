package d18_09_2023;

public class AudioControl extends Control{
    private boolean smanjuje;
    public AudioControl() {
    }

    public AudioControl(boolean smanjuje) {
        this.smanjuje = smanjuje;
    }

    public boolean daLiSmanjuje() {
        return smanjuje;
    }

    public void setSmanjuje(boolean smanjuje) {
        this.smanjuje = smanjuje;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (daLiSmanjuje()) {
            if (videoPlayer.getJacina() == 1) {
                videoPlayer.setJacina(0);
            } else {
                videoPlayer.setJacina(videoPlayer.getJacina() - 1);
            }
        } else if (videoPlayer.getJacina() == 100) {
            videoPlayer.setJacina(100);
        } else {
            videoPlayer.setJacina(videoPlayer.getJacina() + 1);
        }
    }
}
