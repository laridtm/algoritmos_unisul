import javax.swing.JOptionPane;

public class ex_12 {
	public static void main(String[] args) {
		
		int num1;
		int num2;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));

		if (num1 > num2) {
			JOptionPane.showMessageDialog(null, num1 + " é maior que " + num2);
		}else{
			if (num1 < num2) {
				JOptionPane.showMessageDialog(null, num2 + " é maior que " + num1);
			}else{
				JOptionPane.showMessageDialog(null, num1 + " é igual ao " +num2);
			}
			
		}

	}
}