package Third_exercise;

import java.util.Scanner;

public class Fourth_exercise {
    public static void main(String[] args) {
        /*
        * Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        * */

        Scanner read_number = new Scanner (System.in);
        System.out.println("Please, type one number: ");
        int number = read_number.nextInt();
        read_number.close(); // é uma boa prática fechar o scanner para evitar vazamento de memória.

        for(int i = 1; i < 11; i++){
            int count = number * i;
            System.out.println(number + " x " + i + " = " + count);
        }
    }
}
