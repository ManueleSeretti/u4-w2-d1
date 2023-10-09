import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random rndm = new Random();
        for (int i = 0; i < 5; i++) {
            array[i] = rndm.nextInt(1, 10);
        }


        Scanner input = new Scanner(System.in);

        ciclo:
        while (true) {
            System.out.println("cambia i numeri nell' Array spingi 0 per chiudere il programma:");
            System.out.println(Arrays.toString(array));
            for (int i = 0; i < array.length; i++) {
                try {
                    int c = i + 1;
                    System.out.println("inserisci un numero da mettere in posizione :" + c);
                    int scelta = Integer.parseInt(input.nextLine());
                    if (scelta == 0) break ciclo;
                    else array[i] = scelta;
                    if (c == 5) System.out.println(Arrays.toString(array));
                } catch (Exception x) {
                    System.err.println(x.getMessage());
                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}