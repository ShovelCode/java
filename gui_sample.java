//example Swing GUI

import javax.swing.*;

class SwingDemo{
SwingDemo(){
//JFrame
JFrame fred = new JFrame("An example JFrame");

//set initial size of the JFrame
fred.setSize(275,100);

//This terminates the program by clicking on the red X, include this in
//all GUIs
fred.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//JLabel the text-based label
JLabel ethel = new JLabel("An example JLabel");

//labels are placed on the frames by the frames
fred.add(ethel);

//frames are invisible by default they are made visible usually
//after constructing
fred.setVisible(true);
}//end SwingDemo
