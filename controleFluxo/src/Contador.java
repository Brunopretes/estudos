import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            if (num1 >= num2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");		
            }for (int i = num1 + 1; i <= num2; i++) {
                System.out.println("Imprimindo o número " + i);
                }
        }
    
        catch (NumberFormatException e) {
            System.out.println("Por favor, forneça números inteiros válidos como parâmetros.");
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior queo primeiro");            
        }
		
		for (int i = parametroUm+1; i < parametroDois; i++){
            System.out.println("Imprimindo o numero");
		}
    }
}