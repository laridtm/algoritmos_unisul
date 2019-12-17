import javax.swing.JOptionPane;

public class ex_15{
	public static void main(String[] args) {
		String nome;
		int idade;

		nome = JOptionPane.showInputDialog("Digite o seu nome:");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));

		if ((idade>=15) && (idade<=25)){
			JOptionPane.showMessageDialog(null, "ACEITA");
		}else{
			JOptionPane.showMessageDialog(null, "NÃO ACEITA");
		}
		
	}
}