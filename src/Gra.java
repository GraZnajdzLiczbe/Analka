import java.util.Random;
import java.util.Scanner;

import static java.lang.String.format;

public class Gra {

  public static int generujLiczbe() {

    return new Random().nextInt(Integer.MAX_VALUE);
  }

  public static boolean sprawdzLiczbe(int wygenerowana, long twoja) {

    if (twoja > Integer.MAX_VALUE){
    twoja = Integer.MAX_VALUE;
    }

    if (twoja > wygenerowana) {
      System.out.println("Mniej");
      return false;
    } else if (twoja < wygenerowana) {
      System.out.println("Wiecej");
      return false;
    } else {
      System.out.println("Dobrze");
      return true;
    }


  }

  public static void main(String[] args) {
    int wygenerowana = generujLiczbe();
    int zliczacz = 0;
    System.out.println("Wprowadz swoje imie lamusie:");
    System.out.println("Analny Wjazd");
    String imie = wprowadzImie();
    System.out.println(format("Witaj %s!", imie));
    System.out.println(format("Podaj liczbe %s: ", imie));
    for (;true;) {
      if (sprawdzLiczbe(wygenerowana , wprowadzLiczbe())){
        System.out.println("Udalo ci sie to osiagnac za " + zliczacz + " podejsciem.");
        break;
      } else
        zliczacz++;
    }
  }

  public static long wprowadzLiczbe() {
    Scanner sc = new Scanner(System.in);

    // Numerical data input
    // byte, short and float can be read
    // using similar-named functions.
    return sc.nextLong();
  }

  public static String wprowadzImie() {
    Scanner sc = new Scanner(System.in);

    // Numerical data input
    // byte, short and float can be read
    // using similar-named functions.
    return sc.nextLine();
  }
}
