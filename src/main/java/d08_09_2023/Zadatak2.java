package d08_09_2023;
//U glavnoj klasi napraviti minimum dva FacebookPost-a
// i nad svakim pozvati svaku funkciju.
public class Zadatak2 {
    public static void main(String[] args) {
        FacebookPost post1 = new FacebookPost();
        post1.objavio = "Pera Peric";
        post1.cijiProfil = "Milan Milanovic";
        post1.poruka="Di si, sta ima?";
        post1.brojSvidjanja=0;
        post1.brojDeljenja=0;

        FacebookPost post2 = new FacebookPost();
        post2.objavio = "Pera Peric";
        post2.cijiProfil = "Radojka Milanovic";
        post2.poruka="Jes' vid'la onog Milana, ne javlja se?";
        post2.brojSvidjanja=3;
        post2.brojDeljenja=1;

        post1.like();
        post2.like();
        post2.dislike();
        post1.dislike();
        post1.share();
        post2.share();

        post1.print();
        post2.print();

    }
}
