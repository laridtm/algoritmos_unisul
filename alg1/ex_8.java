import javax.swing.JOptionPane;

public class ex_8{
	public static void main(String[] args) {
		double num1;
		double num2;
		double result;
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero:"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro n�mero:"));
		result = num1 + num2;
		JOptionPane.showMessageDialog(null, "A soma dos n�meros digitados �: " + result);
		
	}
}