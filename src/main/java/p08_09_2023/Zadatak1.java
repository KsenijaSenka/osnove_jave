package p08_09_2023;

//import p07_09_2023.SlackMessage;

public class Zadatak1 {
    public static void main(String[] args) {
        SlackMessage poruka1 = new SlackMessage();
        poruka1.tekst = "Cao";
        poruka1.osoba = "Ksenija";
        poruka1.datumVreme = "26.08.2021 18:55";



        SlackMessage poruka2 = new SlackMessage();
        poruka2.tekst = "Zdravo";
        poruka2.osoba = "Marija";
        poruka2.datumVreme = "26.09.2022 18:55";


        poruka1.stampajPodatke();
        poruka2.stampajPodatke();


        poruka1.azuriraj("Juhu", "27.08.2022 18:55");
        poruka1.stampajPodatke();
        //ovde nece odstampati vreme azuriranja

        String convertedInfo=poruka1.convertToString();
    }
}
