//Handle an event in a Swing program

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EventDemo{

	JLabel jlab;
	EventDemo(){
		
		//create a new JFrame container
		JFrame fred = new JFrame("An event example");

		//Specify flowlayout for the layout manager
		fred.setLayout(new FlowLayout());

		//give frame an initial size
		fred.setSize(220, 90);

		//Terminate the program when the user closes the application
		fred.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//make two buttons
		JButton aButton = new JButton("A");
		JButton bButton = new JButton("B");

		//Add action listener for A
		aButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
			jlab.setText("A was pressed.");
			}
		});

		//add action listener for B
		bButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
			jlab.setText("B was pressed.");
			}
		});

		//add the buttons to the content pane
		fred.add(aButton);
		fred.add(bButton);

		//Create a text based label
		jlab = new JLabel("Press a button.");

		//Add the label to the content pane.
		fred.add(jlab);

		//Display the frame
		fred.setVisible(true);

		public static void main(String[]args) {
		//create the frame on the event dispatching thread.
		SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			new EventDemo();
		}
	});
}

}
