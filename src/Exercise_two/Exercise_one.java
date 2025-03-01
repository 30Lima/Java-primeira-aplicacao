package Exercise_two;

import java.util.Scanner;

public class Exercise_one {
    public static void main(String[] args) {
        /**
         * Crie um programa que realize a média de duas notas decimais e exiba o resultado.
         * */

        Scanner input = new Scanner(System.in);
        System.out.println("Please, type a decimal number: ");
        String first_number = input.nextLine();
        System.out.println("Please, type more a decimal number: ");
        String second_number = input.nextLine();

        double casting_first_number;
        casting_first_number = Double.parseDouble(first_number);
        double casting_second_number;
        casting_second_number = Double.parseDouble(second_number);

        double media = (casting_first_number + casting_second_number) / 2;
        System.out.println("Average of numbers: " + media);


    }
}
