import javax.swing.JOptionPane;

public class ex_18{
	public static void main(String[] args) {

		String nome;
		double preco;
		String categ;

		nome = JOptionPane.showInputDialog("Qual seu nome?");
		preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do produto?"));
		categ = JOptionPane.showInputDialog("Qual a categoria do produto? \n A, B, C, D ou E");

		switch(categ){
			case "A":
				preco = preco - (preco * 0.10);
				JOptionPane.showMessageDialog(null,"O preço do produto com desconto é: R$:" + preco);
			break;

			case "B":
				preco = preco - (preco * 0.15);
				JOptionPane.showMessageDialog(null,"O preço do produto com desconto é: R$:" + preco);
			break;

			case "C":
				preco = preco - (preco * 0.20);
				JOptionPane.showMessageDialog(null,"O preço do produto com desconto é: R$:" + preco);
			break;

			case "D":
				preco = preco - (preco * 0.25);
				JOptionPane.showMessageDialog(null,"O preço do produto com desconto é: R$:" + preco);
			break;

			case "E":
				preco = preco - (preco * 0.50);
				JOptionPane.showMessageDialog(null,"O preço do produto com desconto é: R$:" + preco);
			break;

		}

		
	}
}