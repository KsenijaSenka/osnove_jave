package p08_09_2023;

public class SlackMessage {
    public String tekst;

    public String osoba;

    public String datumVreme;

    public String kadJeAzurirana;


    public void stampajPodatke() {
        System.out.println(this.osoba + " - " + this.datumVreme);
        System.out.println(this.tekst);
    }

    public void azuriraj(String noviTekst, String datumAzuriranja) {
        this.tekst = noviTekst;
        this.kadJeAzurirana = datumAzuriranja;
    }
    public String convertToString(){
        String result=osoba+" - " +kadJeAzurirana;
    return result;}

    }

