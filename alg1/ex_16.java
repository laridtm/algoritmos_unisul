import javax.swing.JOptionPane;

public class ex_16{
	public static void main(String[] args) {
		double num1;
		double num2;
		double result;
		int opcao;

		num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero: "));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro n�mero:"));
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opera��o: 1. Adi��o; 2.Subtra��o;  3.Multiplica��o; 4.Divis�o;"));

		switch(opcao){
			case 1: 
			result = num1 + num2;
			JOptionPane.showMessageDialog(null, "O resultado da soma �: " + result);
			break;

			case 2:
			result = num1 - num2;
			JOptionPane.showMessageDialog(null, "O resultado da subtra��o �: " + result);
			break;

			case 3: 
			result = num1 * num2;
			JOptionPane.showMessageDialog(null, "O resultado da multiplica��o �: " + result);
			break;

			case 4:
			result = num1 / num2;
			JOptionPane.showMessageDialog(null, "O resultado da divis�o �: " + result);
			break;

			default:
			JOptionPane.showMessageDialog(null, "Op��o inv�lida.");
			break;
		}


	}
}