package Third_exercise;

import java.util.Scanner;

public class Exercise_one {
    public static void main(String[] args) {
        /*
        * Crie um programa que solicite ao usuário digitar um número.
        * Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
        * */

        Scanner read_user = new Scanner(System.in);
        System.out.println("Please, type one number: ");
        double number_user = read_user.nextDouble();

        if (number_user > 0){
            System.out.println(number_user + " this is a positive number!");
        }else{
            System.out.println(number_user + " this is a negative number!");
        }

    }
}
