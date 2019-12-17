import javax.swing.JOptionPane;

public class ex_9{
	public static void main(String[] args) {
		int peso;
		double alt;
		double imc;
		peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu peso: "));
		alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));
		imc = peso/(alt*alt);
		JOptionPane.showMessageDialog(null, "O seu IMC é: " + imc);
		
	}
}