package e08_09;

import java.util.Scanner;

public class ConsoleInputDemo {

    public static void main(String[] args) {
        System.out.print("Pradedame!\nIveskite varda: ");

        Scanner scanner = new Scanner(System.in);
        String vardas = scanner.nextLine();

        System.out.print("koks amzius: ");
        int amzius = scanner.nextInt();

        System.out.println("vardas = " + vardas);
        System.out.println("amzius = " + amzius);
    }
}
