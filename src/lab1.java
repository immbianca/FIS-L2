import java.util.Scanner;

class Ajutor {
    void afisare() {
        System.out.println("Hello world");
    }
    
    void info() {
        System.out.println("FIS");
        System.out.println("UPT AC");
        System.out.println("Mustea Bianca-Maria");
    }
}

public class lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ajutor ajutor = new Ajutor();
        
        while (true) {
            System.out.print("Introduceți un șir de caractere: ");
            String input = scanner.nextLine();
            
            if (input.equals("hello")) {
                ajutor.afisare();
            } else if (input.equals("info")) {
                ajutor.info();
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
