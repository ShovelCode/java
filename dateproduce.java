import java.util.*;
import java.lang.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
//import org.jdesktop.swingx.JXDatePicker;


public class DateProducer extends JFrame {
	
	public int dateNumber = 0;
	public String month = "X Month";
	
	//public String[] data = new String[2];
	//data[0] = "the_date";
	//data[1] = "the_month";
	
	private JButton day1 = new JButton("1");
	private JButton day2 = new JButton("2");
	private JButton day3 = new JButton("3");
	private JButton day4 = new JButton("4");
	private JButton day5 = new JButton("5");
	private JButton day6 = new JButton("6");
	private JButton day7 = new JButton("7");
	private JButton day8 = new JButton("8");
	private JButton day9 = new JButton("9");
	private JButton day10 = new JButton("10");
	private JButton day11 = new JButton("11");
	private JButton day12 = new JButton("12");
	private JButton day13 = new JButton("13");
	private JButton day14 = new JButton("14");
	private JButton day15 = new JButton("15");
	private JButton day16 = new JButton("16");
	private JButton day17 = new JButton("17");
	private JButton day18 = new JButton("18");
	private JButton day19 = new JButton("19");
	private JButton day20 = new JButton("20");
	private JButton day21 = new JButton("21");
	private JButton day22 = new JButton("22");
	private JButton day23 = new JButton("23");
	private JButton day24 = new JButton("24");
	private JButton day25 = new JButton("25");
	private JButton day26 = new JButton("26");
	private JButton day27 = new JButton("27");
	private JButton day28 = new JButton("28");
	private JButton day29 = new JButton("29");
	private JButton day30 = new JButton("30");
	private JButton day31 = new JButton("31");
	private JButton month1 = new JButton("January");
	private JButton month2 = new JButton("February");
	private JButton month3 = new JButton("March");
	private JButton month4 = new JButton("April");
	private JButton month5 = new JButton("May");
	private JButton month6 = new JButton("June");
	private JButton month7 = new JButton("July");
	private JButton month8 = new JButton("August");
	private JButton month9 = new JButton("September");
	private JButton month10 = new JButton("October");
	private JButton month11 = new JButton("November");
	private JButton month12 = new JButton("December");
	private JButton dataSender = new JButton("Send Data");
	
	private MotherFrame frm;
	
/*	public String getMonth(){
		return month;
	}
*/
	public DateProducer(MotherFrame f){
		
	 super("Calendar");
	 setLayout(new FlowLayout());
	 setSize(500,400);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 H h = new H();
	 
	 //important
	 this.frm = f;
	  
	 month1.addActionListener(h);
	 month2.addActionListener(h);
	 month3.addActionListener(h);
	 month4.addActionListener(h);;
	 month5.addActionListener(h);
	 month6.addActionListener(h);
	 month7.addActionListener(h);
	 month8.addActionListener(h);
	 month9.addActionListener(h);
	 month10.addActionListener(h);
	 month11.addActionListener(h);
	 month12.addActionListener(h);
	 day1.addActionListener(h);
	 day2.addActionListener(h);
	 day3.addActionListener(h);
	 day4.addActionListener(h);
	 day6.addActionListener(h);
	 day7.addActionListener(h);
	 day8.addActionListener(h);
	 day9.addActionListener(h);
	 day10.addActionListener(h);
	 day11.addActionListener(h);
	 day12.addActionListener(h);
	 day13.addActionListener(h);
	 day14.addActionListener(h);
	 day15.addActionListener(h);
	 day16.addActionListener(h);
	 day17.addActionListener(h);
	 day18.addActionListener(h);
	 day19.addActionListener(h);
	 day20.addActionListener(h);
	 day21.addActionListener(h);
	 day22.addActionListener(h);
	 day23.addActionListener(h);
	 day24.addActionListener(h);
	 day25.addActionListener(h);
	 day26.addActionListener(h);
	 day27.addActionListener(h);
	 day28.addActionListener(h);
	 day29.addActionListener(h);
	 day30.addActionListener(h);
	 day31.addActionListener(h);
	 dataSender.addActionListener(h);
	 
	 add(month1);
	 add(month2);
	 add(month3);
	 add(month4);
	 add(month5);
	 add(month6);
	 add(month7);
	 add(month8);
	 add(month9);
	 add(month10);
	 add(month11);
	 add(month12);
	 add(day1);
	 add(day2);
	 add(day3);
	 add(day4);
	 add(day5);
	 add(day6);
	 add(day7);
	 add(day8);
	 add(day9);
	 add(day10);
	 add(day11);
	 add(day12);
	 add(day13);
	 add(day14);
	 add(day15);
	 add(day16);
	 add(day17);
	 add(day18);
	 add(day19);
	 add(day20);
	 add(day21);
	 add(day22);
	 add(day23);
	 add(day24);
	 add(day25);
	 add(day26);
	 add(day27);
	 add(day28);
	 add(day29);
	 add(day30);
	 add(day31);
	 add(dataSender);
	 
	 setVisible(true);
	}//end constructor for DateProducer(MotherFrame)
	
	private class H implements ActionListener{
		public void actionPerformed(ActionEvent e){
		
		
			if(e.getSource()==day1){
				dateNumber = 1; 
			}
			else if (e.getSource()==day2){
				dateNumber = 2;
			}
			else if(e.getSource()==day3){
				dateNumber = 3;
			}
			else if(e.getSource()==day4){
				dateNumber = 4;
			}
			else if(e.getSource()==day5){
				dateNumber = 5;
			}
			else if(e.getSource()==day6){
				dateNumber = 6;
			}
			else if(e.getSource()==day7){
				dateNumber = 7;
			}
			else if(e.getSource()==day8){
				dateNumber = 8;
			}
			else if(e.getSource()==day9){
				dateNumber = 9;
			}
			else if(e.getSource()==day10){
				dateNumber = 10;
			}
			else if(e.getSource()==day11){
				dateNumber = 11;
			}
			else if(e.getSource()==day12){
				dateNumber = 12;
			}
			else if(e.getSource()==day13){
				dateNumber = 13;
			}
			else if(e.getSource()==day14){
				dateNumber = 14;
			}
			else if(e.getSource()==day15){
				dateNumber = 15;
			}
			else if(e.getSource()==day16){
				dateNumber = 16;
			}
			else if(e.getSource()==day17){
				dateNumber = 17;
			}
			else if(e.getSource()==day18){
				dateNumber = 18;
			}
			else if(e.getSource()==day18){
				dateNumber = 18;
			}
			else if(e.getSource()==day19){
				dateNumber = 19;
			}
			else if(e.getSource()==day20){
				dateNumber = 20;
			}
			else if(e.getSource()==day21){
				dateNumber = 21;
			}
			else if(e.getSource()==day22){
				dateNumber = 22;
			}
			else if(e.getSource()==day23){
				dateNumber = 23;
			}
			else if(e.getSource()==day24){
				dateNumber = 24;
			}
			else if(e.getSource()==day25){
				dateNumber = 25;
			}
			else if(e.getSource()==day26){
				dateNumber = 26;
			}
			else if(e.getSource()==day27){
				dateNumber = 27;
			}
			else if(e.getSource()==day28){
				dateNumber = 28;
			}
			else if(e.getSource()==day29){
				dateNumber = 29;
			}
			else if(e.getSource()==day30){
				dateNumber = 30;
			}
			else if(e.getSource()==day31){
				dateNumber = 31;
			}
			else if(e.getSource()==month1){
				month = "January";
			}
			else if(e.getSource()==month2){
				month = "February";
			}
			else if(e.getSource()==month3){
				month = "March";
			}
			else if(e.getSource()==month4){
				month = "April";
			}
			else if(e.getSource()==month5){
				month = "May";
			}
			else if(e.getSource()==month6){
				month = "June";
			}
			else if(e.getSource()==month7){
				month = "July";
			}
			else if(e.getSource()==month8){
				month = "August";
			}
			else if(e.getSource()==month9){
				month = "September";
			}
			else if(e.getSource()==month10){
				month = "October";
			}
			else if(e.getSource()==month11){
				month = "November";
			}
			else if(e.getSource()==month12){
				month = "December";
			}
			else if(e.getSource()==dataSender){
				frm.month = month;
				JOptionPane.showMessageDialog(new JFrame(), "Sent Date");
			}
		}
	}
	
		
}
