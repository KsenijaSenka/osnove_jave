package p07_09_2023;
//U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//[ime i prezime osobe] - [kad je poslata]
//[Tekst poruke]
public class Zadatak2 {
    public static void main(String[] args) {


        SlackMessage poruka1 = new SlackMessage();
        poruka1.tekst = "Cao";
        poruka1.osoba = "Ksenija";
        poruka1.datumVreme = "26.08.2021 18:55";

        SlackMessage poruka2 = new SlackMessage();
        poruka2.tekst = "Zdravo";
        poruka2.osoba = "Marija";
        poruka2.datumVreme = "26.09.2022 18:55";

        System.out.println(poruka1.osoba + " - " + poruka1.datumVreme);
        System.out.println(poruka1.tekst);
        System.out.println(poruka2.osoba + " - " + poruka2.datumVreme);
        System.out.println(poruka2.tekst);

    }
}
