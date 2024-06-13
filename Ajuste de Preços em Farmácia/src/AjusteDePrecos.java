import java.util.Scanner;

public class AjusteDePrecos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double preco;
        
        while (true) {
            System.out.print("Digite o preço do produto (0 para encerrar): ");
            preco = scanner.nextDouble();
            
            if (preco == 0) {
                break;
            }
            
            double novoPreco = Math.round(preco * 1.12 * 100.0) / 100.0;
            System.out.println("Novo preço: " + novoPreco);
        }
        
        scanner.close();
    }
}
