package p07_09_2023;

//import static p07_09_2023.User.stampajKorisnika;

public class UvodUOOP {

    public static void main(String[] args) {
        User m = new User();
        m.ime = "Milan";
        m.email = "milan@gmail.com";
        m.starost = 30;
        User p = new User();
        p.ime = "Petar";
        p.email = "petar@email.com";
        p.starost = m.starost + 3;

        //stampajKorisnika(m.ime,m.email,m.starost);
        //User.stampajKorisnika(); kad je static metoda

        m.stampajKorisnika();
        p.stampajKorisnika();
    }


}
