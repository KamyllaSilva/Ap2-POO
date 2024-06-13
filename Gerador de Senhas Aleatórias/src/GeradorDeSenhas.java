import java.util.Random;

public class GeradorDeSenhas {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroDeDigitos = random.nextInt(6) + 5; // Gera um número entre 5 e 10
        
        StringBuilder senha = new StringBuilder();
        
        for (int i = 0; i < numeroDeDigitos; i++) {
            int digito = random.nextInt(10); // Gera um dígito entre 0 e 9
            senha.append(digito);
        }
        
        System.out.println("Senha gerada: " + senha.toString());
    }
}
