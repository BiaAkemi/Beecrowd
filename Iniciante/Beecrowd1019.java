import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1019 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int secs = sc.nextInt();
        int sec = secs % 60;
        int hour = secs/3600;
        int min = (secs % 3600) / 60;


        String timeString = String. format("%01d:%01d:%01d", hour, min, sec);
        System.out.println(timeString);

    }

}