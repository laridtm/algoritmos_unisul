import javax.swing.JOptionPane;

public class ex_16{
	public static void main(String[] args) {
		double num1;
		double num2;
		double result;
		int opcao;

		num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número:"));
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma operação: 1. Adição; 2.Subtração;  3.Multiplicação; 4.Divisão;"));

		switch(opcao){
			case 1: 
			result = num1 + num2;
			JOptionPane.showMessageDialog(null, "O resultado da soma é: " + result);
			break;

			case 2:
			result = num1 - num2;
			JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + result);
			break;

			case 3: 
			result = num1 * num2;
			JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + result);
			break;

			case 4:
			result = num1 / num2;
			JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + result);
			break;

			default:
			JOptionPane.showMessageDialog(null, "Opção inválida.");
			break;
		}


	}
}