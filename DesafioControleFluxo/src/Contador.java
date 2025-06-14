import exception.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro:");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro:");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException ex) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(ex.getMessage());
		}
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
			var message = String.format("O primeiro parâmetro: %s não pode ser maior que o segundo parâmetro: %s", parametroUm, parametroDois);
			throw new ParametrosInvalidosException(message);
		}
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		for(int indice = 1; indice <= contagem; indice++) {
            System.out.println("Imprimindo o número " + indice);
        }
	}
}
