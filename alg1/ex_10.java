import javax.swing.JOptionPane;

public class ex_10{
	public static void main(String[] args) {
		int num1;
		int num2;
		int result;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero:"));

		result = num1 +num2;

		if (result>10){
			JOptionPane.showMessageDialog(null, "A soma dos n�meros digitados �: " + result);
		}
		

		
	}
	
}