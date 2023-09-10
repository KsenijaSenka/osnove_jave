package d08_09_2023;

public class FacebookPost {

    public String objavio;
    public String cijiProfil;
    public String poruka;
    public int brojSvidjanja;
    public int brojDeljenja;

    public int like() {
        brojSvidjanja = this.brojSvidjanja + 1;
        return brojSvidjanja;
    }

    public int dislike() {
        if (brojSvidjanja > 0) {
            return brojSvidjanja = this.brojSvidjanja - 1;
        } else {
            return this.brojSvidjanja;
        }
    }

    public int share() {
        return brojDeljenja = this.brojDeljenja + 1;
    }

    public void print() {
        System.out.println(this.objavio + " >>> " + this.cijiProfil);
        System.out.println(this.poruka);
        System.out.println("Likes " + this.brojSvidjanja + " | Shares " + this.brojDeljenja);
    }
}
