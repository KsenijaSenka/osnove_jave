package d12_09_2023;
//Za potrebe agencije za nekretnine kreirati  klasu FizickoLice
public class FizickoLice {
    private String imeIPrezime;
    private int brojLK;
    private String jmbg;

    private boolean prethodnoKupovao;

    FizickoLice(){
    }
    FizickoLice(String imeIPrezime, int brojLK,String jmbg){
        this.imeIPrezime=imeIPrezime;
        this.brojLK=brojLK;
        this.jmbg=jmbg;
    }

    public String getImeIPrezime() {
        return this.imeIPrezime;
    }

    public int getBrojLK() {
        return this.brojLK;
    }

    public String getJmbg() {
        return this.jmbg;
    }

    public boolean getPrethodnoKupovao() {
        return this.prethodnoKupovao;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setBrojLK(int brojLK) {
        this.brojLK = brojLK;
    }

    public void setPrethodnoKupovao(boolean prethodnoKupovao) {
        this.prethodnoKupovao = prethodnoKupovao;
    }

    public void stampajFizickoLice() {
        System.out.print(this.imeIPrezime + ", " + this.brojLK);
    }
}
