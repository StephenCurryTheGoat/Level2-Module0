/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;
	Random ran = new Random();
	// 1. create an array of JButtons. Don't initialize it yet. (i.e. Just DECLARE
	// it.)
	JButton[] buttons;
	// 2 create an int variable called hiddenButton
	int hiddenButton;
	int attempts = 0;

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}

	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 3. Ask the user to enter a positive number and convert it to an int
		String number = JOptionPane.showInputDialog("Enter a postive number");
		int n = Integer.parseInt(number);
		// 4. Initialize the array of JButtons to be the size of the int created in step
		// 3
		buttons = new JButton[n];
		// 5. Make a for loop to iterate through the JButton array
		// 6. initialize each JButton in the array
		// 7. add the ActionListener to each JButton
		// 8. add each JButton to the panel
		for (int i = 0; i < n; i++) {
			buttons[i] = new JButton();
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
		}
		// 9 add the panel to the window
		window.add(panel);
		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// 11. set the JFrame to visible.
		window.setVisible(true);
		// 12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null,
				"For the game, enter a random number at the start, then click the mouse everywhere to try and find the hidden button.");
		// 13. initialize the hiddenButton variable to a random number less than the int
		// created in step 3
		// Surround it with a try/catch - use Eclipse helper for this
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		hiddenButton = ran.nextInt(n);
		// 14. Set the text of the JButton located at hiddenButton to "ME"
		buttons[hiddenButton].setText("ME");
		// 15. Use Thread.sleep(1000); to pause the program.
		// Surround it with a try/catch - use Eclipse helper for this
		try {
			Thread.sleep(170);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 16. Set the text of the JButton located at hiddenButton to be blank.
		buttons[hiddenButton].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.
		if (buttons[hiddenButton] == buttonClicked) {
			JOptionPane.showMessageDialog(null, "You win");
		} else {
			JOptionPane.showMessageDialog(null, "Try again");
			attempts ++;
		}
		
		if(attempts == 5) {
			buttons[hiddenButton].setBackground(Color.red);
			buttons[hiddenButton].setOpaque(true);
		}
		
		// 18. else tell them to try again
	}
}
