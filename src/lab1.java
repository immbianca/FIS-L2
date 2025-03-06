import java.util.Scanner;

class Ajutor {
    void afisare() {
        System.out.println("Hello world");
    }

    void info() {
        System.out.println("Nume proiect: Proiect Java");
        System.out.println("Facultate: Universitatea XYZ");
        System.out.println("Autor: Alex Pescaru");
    }
}

class Test {
    private int rng;

    public Test() {
        this.rng = (int) (Math.random() * Integer.MAX_VALUE);
    }

    public int getRng(int x) {
        return rng % x;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ajutor ajutor = new Ajutor();
        Test test = new Test();

        while (true) {
            System.out.print("Introduceți un șir de caractere: ");
            String input = scanner.nextLine();

            if (input.equals("hello")) {
                ajutor.afisare();
            } else if (input.equals("info")) {
                ajutor.info();
            } else if (input.equals("num")) {
                System.out.println("Valoarea rng %% 5: " + test.getRng(5));
            } else if (input.equals("exit")) {
                System.out.println("Program terminat.");
                break;
            } else {
                System.out.println("Ați introdus: " + input);
            }
        }

        scanner.close();
    }
}
