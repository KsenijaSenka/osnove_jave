package d18_09_2023;

public class VideoPlayer {
    private double duzina;
    private double trenutnoVreme;
    private double jacina;
    private double kvalitet;

    public VideoPlayer() {
    }

    public VideoPlayer(double duzina, double trenutnoVreme, double jacina, double kvalitet) {
        this.duzina = duzina;
        this.trenutnoVreme = trenutnoVreme;
        this.jacina = jacina;
        this.kvalitet = kvalitet;
    }

    public double getDuzina() {
        return duzina;
    }

    public void setDuzina(double duzina) {
        this.duzina = duzina;
    }

    public double getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(double trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public double getJacina() {
        return jacina;
    }

    public void setJacina(double jacina) {
        this.jacina = jacina;
    }

    public double getKvalitet() {
        return kvalitet;
    }

    public void setKvalitet(double kvalitet) {
        this.kvalitet = kvalitet;
    }
    public void stampaj(){
        System.out.println("Trenutno vreme videa "+this.trenutnoVreme);
        System.out.println("Jacina zvuka "+this.jacina);
        System.out.println("Kvalitet videa "+this.kvalitet);

    }
}
