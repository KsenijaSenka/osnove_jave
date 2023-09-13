package d12_09_2023;

public class ZeleniKarton {
    private String punoImeStudenta;
    private int brojIndeksa;
    private String nazivPredmeta;
    private String punoImeProfesora;
    private int ocena;

    public ZeleniKarton(String punoImeStudenta, int brojIndeksa, String nazivPredmeta, String punoImeProfesora,
                        int ocena) {this.punoImeStudenta=punoImeStudenta;
        this.brojIndeksa=brojIndeksa;
        this.nazivPredmeta=nazivPredmeta;
        this.punoImeProfesora=punoImeProfesora;
        this.ocena=ocena;
    }

    public String getPunoImeStudenta() {
        return this.punoImeStudenta;
    }

    public void setPunoImeStudenta(String punoImeStudenta) {
        this.punoImeStudenta = punoImeStudenta;
    }

    public int getBrojIndeksa() {
        return this.brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getPunoImeProfesora() {
        return this.punoImeProfesora;
    }

    public void setPunoImeProfesora(String punoImeProfesora) {
        this.punoImeProfesora = punoImeProfesora;
    }

    public String getNazivPredmeta() {
        return this.nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return this.ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean polozio() {
        if (ocena > 5) {
            return true;
        } else return false;
    }

    public void stampajPodatke() {
        System.out.println(this.nazivPredmeta + " - " + this.ocena);
        System.out.println("Student: " + this.punoImeStudenta + ", "+this.brojIndeksa);
        System.out.println("Profesor: " + this.punoImeProfesora);
    }
}
