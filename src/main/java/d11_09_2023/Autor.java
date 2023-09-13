package d11_09_2023;
//Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
public class Autor {
    private String imeAutora;
    private String prezimeAutora;
    public Autor(){
    }

    public String getImeAutora() {
        return this.imeAutora;
    }

    public String getPrezimeAutora() {
        return this.prezimeAutora;
    }

    public void setImeAutora(String imeAutora) {
        this.imeAutora = imeAutora;
    }

    public void setPrezimeAutora(String prezimeAutora) {
        this.prezimeAutora = prezimeAutora;
    }
    public void stampajAutora(){
        System.out.println(this.imeAutora+" "+this.prezimeAutora);
    }
}
