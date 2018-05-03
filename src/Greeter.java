import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String message = JOptionPane.showInputDialog("What's your name?");
		JOptionPane.showMessageDialog(null, "Hi " + message );
				
	}
}
