package exercise3;

import java.util.Scanner;

public class NumberSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        for (int i = 100; i <= 1000; i++) {
          if (counter < 9 ) {
        if (i % 5 == 0 && i % 6 == 0) {
          System.out.print(i + " ");
          counter++;
        }
          } else {
          if (i % 5 == 0 && i % 6 == 0) {
<<<<<<< HEAD
            System.out.println(i);
=======
>>>>>>> ac63b090a81e89a60f9dc17d6138a1f06ff2e727
            counter = 0;
          }
          }
    }
    }

}
