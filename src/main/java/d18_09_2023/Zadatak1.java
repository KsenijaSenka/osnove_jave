package d18_09_2023;
//U glavnom programu kreirati video plejer i izvrsiti neke akcije nad njim.
public class Zadatak1 {
    public static void main(String[] args) {
        Control t = new TimeControl(true);
        VideoPlayer v = new VideoPlayer(30, 29, 3, 144);
        VideoPlayer v1 = new VideoPlayer(150, 14, 7, 1080);
        t.izvrsiAkciju(v);
        v.stampaj();
        Control a = new AudioControl(false);
        a.izvrsiAkciju(v1);
        v1.stampaj();
        Control q = new QualityOptimizerControl(34);
        q.izvrsiAkciju(v1);
        v1.stampaj();
    }
}
