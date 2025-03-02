package Third_exercise;

import java.util.Scanner;

public class Sixth_exercise {
    public static void main(String[] args) {
        /*
        * Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
        * */

        Scanner read = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        int number = read.nextInt();

       long factorial = 1;
       for (int i = number; i > 0; i--){
           factorial *= i;
       }

        System.out.println("The factorial of " + number + " is: " + factorial);

        read.close(); // Fecha o Scanner para evitar consumo de memória desnecessário

    }
}
