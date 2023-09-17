package d14_09_2023;

import java.util.ArrayList;

public class Student {
    private int brojIndeksa;
    private String imeIPrezime;
    private String tipStudija;
    private ArrayList<Ispit>ispiti=new ArrayList<>();

    public Student(int brojIndeksa,String imeIPrezime,String tipStudija) {
        this.brojIndeksa=brojIndeksa;
        this.imeIPrezime=imeIPrezime;
        this.tipStudija=tipStudija;
        this.ispiti = new ArrayList<>();
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTip(String tip) {
        this.tipStudija = tip;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public void dodajIspit(Ispit noviIspit) {
        this.ispiti.add(noviIspit);
    }

    public double racunajProsek() {
        double prosecnaOcena = 0;
        int brojPolozenih = 0;
        int suma = 0;
        int i = 0;
        if (this.getIspiti().get(i).jePolozen()) {
            for (i = 0; i < ispiti.size(); i++) {

                brojPolozenih++;
                suma = suma + this.ispiti.get(i).getOcena();
            }

        }
        if (brojPolozenih != 0) {
            return prosecnaOcena = suma / brojPolozenih;
        } else return 0;
    }

    public void stampaj() {
        System.out.println(this.brojIndeksa + " - " + this.imeIPrezime +
                " - " + this.getTipStudija());
        System.out.println("Predmeti: ");
        for (int i = 0; i < ispiti.size(); i++) {
            this.getIspiti().get(i).stampajIspit();
        }
        System.out.println("Prosecna ocena: "+this.racunajProsek());
    }
}
