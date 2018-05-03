import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main(String[] args) {
		String message = JOptionPane.showInputDialog("What do you like?");
		JOptionPane.showMessageDialog(null, message + " is awesome!");
	}
}
