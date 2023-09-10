package vezbaTest;

import java.util.Scanner;

//Napisati program koji simulira korigovanje jacine zvuka na jutjubu
public class VezbaTest200 {
    public static void main(String[] args) {
        int volume=75;
        String action="";
        Scanner s= new Scanner(System.in);


while (!action.equals("PLAY")){
    System.out.println("Akcija: ");
    action=s.next();


        if (action.equals("up")){
            for (int i = 0; i+volume < 100; i++) {
                            volume+=10;
        }if (action.equals("down")){
            volume-=10;
        }if (action.equals("mute")){
            volume=0;
        }
    }}
        System.out.println(volume);
}
}
