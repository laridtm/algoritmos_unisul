import javax.swing.JOptionPane;

public class ex_14{
	public static void main(String[] args) {
		int nasc;
		int ano;
		int idade;

		nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento:"));
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));

		idade = ano - nasc;

		if (nasc<ano) {
			JOptionPane.showMessageDialog(null, "A sua idade é: " + idade);
			
		}
		
	}
}