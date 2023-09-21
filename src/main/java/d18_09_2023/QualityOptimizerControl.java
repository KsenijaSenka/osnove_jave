package d18_09_2023;

public class QualityOptimizerControl extends Control{
    private double brzina;

    public QualityOptimizerControl() {
    }

    public QualityOptimizerControl(double brzina) {
        this.brzina = brzina;
    }

    public double getBrzina() {
        return brzina;
    }

    public void setBrzina(double brzina) {
        this.brzina = brzina;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (brzina * 10.1 <= 144) {
            videoPlayer.setKvalitet(144);
        } else if (brzina * 10.1 > 144 && brzina * 10.1 <= 240) {
            videoPlayer.setKvalitet(240);
        } else if (brzina * 10.1 > 240 && brzina * 10.1 <= 360) {
            videoPlayer.setKvalitet(360);
        } else if (brzina * 10.1 > 360 && brzina * 10.1 <= 480) {
            videoPlayer.setKvalitet(480);
        } else if (brzina * 10.1 > 480 && brzina * 10.1 <= 720) {
            videoPlayer.setKvalitet(720);
        } else {
            videoPlayer.setKvalitet(1080);
        }
    }
}
