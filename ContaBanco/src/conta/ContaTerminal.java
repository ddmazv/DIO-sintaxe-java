package conta;

import java.util.Scanner;

public class ContaTerminal {
 public static void main(String[] args) {
	int numero;
	String agencia;
	String nomecliente;
	double saldo;
	try{
	System.out.println("olá, seja bem vindo");
	Scanner scan = new Scanner(System.in);
	System.out.print("insira seu nome: ");
	nomecliente = scan.next();
	System.out.print("insira sua agencia: ");
	agencia = scan.next();
	System.out.print("insira sua conta: ");
	numero = scan.nextInt();
	System.out.print("qual o valor do primeiro deposito R$: ");
	saldo = scan.nextDouble();
	
	System.out.println("Muito obrigado " + nomecliente + ", sua conta é " + numero +" e agencia " + agencia+ ", seu saldo de:a "+ saldo +" ja está disponivel para saque");
 }catch(java.util.InputMismatchException e) {
	 System.out.println("Digite os dados corretamente!");
 }
}

}
