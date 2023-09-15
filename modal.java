package Projetos;
import javax.swing.	JOptionPane;
public class modal {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Digite um número para realização da tarefa: ");
		int numero = Integer.parseInt(input);
		
		String tabuada = "";
				
		for(int i = 1; i <= 10; i++) {
			int resultado =numero * i;
			tabuada += numero + " x " + i + " = " + resultado +"\n";
		}
		JOptionPane.showMessageDialog(null, tabuada);
	}

}
