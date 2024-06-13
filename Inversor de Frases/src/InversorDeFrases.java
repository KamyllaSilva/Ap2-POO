import java.util.Scanner;

public class InversorDeFrases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        
        String fraseSemEspacos = frase.replace(" ", "");
        String fraseInvertida = new StringBuilder(fraseSemEspacos).reverse().toString();
        
        System.out.println("Frase invertida: " + fraseInvertida);
        
        scanner.close();
    }
}