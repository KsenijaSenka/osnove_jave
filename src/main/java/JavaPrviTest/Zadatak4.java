package JavaPrviTest;

public class Zadatak4 {
    public static void main(String[] args) {
        String x = kreiraTag("Welcome to Google", "google.com");

        String y = vracaHtml("Ovaj deo je bold", "bold");
        String z = vracaHtml("ovo je italic", "italic");
        String w = vracaHtml("Naravno samo je falio paragraf", "paragraph");
        System.out.println(x);
        System.out.println(y + ", a " + z);
        System.out.println(w);
    }

    public static String vracaHtml(String tekst, String tip) {
        if (tip.equals("bold")) {
            return "<b>" + tekst + "</b>";
        } else if (tip.equals("italic")) {
            return "<em>" + tekst + "</em>";
        } else if (tip.equals("paragraph")) {
            return "<p>" + tekst + "</p>";
        } else return tekst;
    }

    public static String kreiraTag(String tekst, String link) {
        return "<a href=" + link + ">" + tekst + "</a>";

    }
}
