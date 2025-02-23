package Exercise_one;

import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, type your name: ");
        String name_user = input.nextLine();
        System.out.println("Hello, " + name_user + "!" );
        System.out.println(name_user + ", welcome to first exercise of course" +
                "Java: Creating your first aplication.");
    }
}
