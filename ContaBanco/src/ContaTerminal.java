import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner txt = new Scanner(System.in);
		Scanner num = new Scanner(System.in);

		int numero;
		String agencia;
		String nome;
		float saldo;

		System.out.println("Digite o número da conta: ");
		numero = num.nextInt();

		System.out.println("Digite o número da agência: ");
		agencia = txt.nextLine();

		System.out.println("Digite o seu nome: ");
		nome = txt.nextLine();

		System.out.println("Digite o seu saldo: ");
		saldo = num.nextFloat();

		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
				+ ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

	}
}
