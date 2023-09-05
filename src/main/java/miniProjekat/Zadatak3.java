package miniProjekat;

import java.util.ArrayList;

//Napišite program koji obavlja zamenu placeholdera u SQL upitu.
// Za rešenje ovog zadatka, biće potrebno upoznati se sa upotrebom
// `replace`
// metode koju pruža `String` klasa u Javi.
public class Zadatak3 {
    public static void main(String[] args) {

        ArrayList<String> values = new ArrayList<>();


        String sqlQuery = "";


        values.add("Cardinal");
        values.add("Tom B. Erichsen");
        values.add("Skagen 21");


        sqlQuery = " INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) VALUES ('%0', '%1', '%2', '%3', '%4', '%5')";

        String r = "";

        for (int i = 0; i < values.size(); i++) {


            sqlQuery = sqlQuery.replace(("%" + i), values.get(i));

        }
        System.out.println(sqlQuery);


    }
}
