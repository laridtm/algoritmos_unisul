import javax.swing.JOptionPane;

public class ex_7{

	public static void main(String[] args) {
		String nome;
		nome = JOptionPane.showInputDialog("Digite seu nome");
		JOptionPane.showMessageDialog(null, "O seu nome é: " + nome);
	}
}