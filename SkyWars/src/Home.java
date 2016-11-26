import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;

public class Home extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16;
	ShipFactory theFactory;
	private static int[][] spaces;
	private static JButton array [][];
	ArrayList<JButton> lab = new ArrayList<JButton>();
	

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		
		
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 4, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		
		Border border = LineBorder.createGrayLineBorder();
		JButton btn = new JButton("Change");
        btn.setActionCommand("myButton");
        btn.addActionListener(this);
        button1 = new JButton("1");
        lab.add(button1);
        button2 = new JButton("2");
        lab.add(button2);
        button3 = new JButton("3");
        lab.add(button3);
        button4 = new JButton("4");
        lab.add(button4);
        button5 = new JButton("5");
        lab.add(button5);
        button6 = new JButton("6");
        lab.add(button6);
        button7 = new JButton("7");
        lab.add(button7);
        button8 = new JButton("8");
        lab.add(button8);
        button9 = new JButton("9");
        lab.add(button9);
        button10 = new JButton("10");
        lab.add(button10);
        button11 = new JButton("11");
        lab.add(button11);
        button12 = new JButton("12");
        lab.add(button12);
        button13 = new JButton("13");
        lab.add(button13);
        button14 = new JButton("14");
        lab.add(button14);
        button15 = new JButton("15");
        lab.add(button15);
        button16 = new JButton("16");
        lab.add(button16);
       
        panel.add(btn);
        panel_1.add(button1);
        panel_1.add(button2);
        panel_1.add(button3);
        panel_1.add(button4);
        panel_1.add(button5);
        panel_1.add(button6);
        panel_1.add(button7);
        panel_1.add(button8);
        panel_1.add(button9);
        panel_1.add(button10);
        panel_1.add(button11);
        panel_1.add(button12);
        panel_1.add(button13);
        panel_1.add(button14);
        panel_1.add(button15);
        panel_1.add(button16);
        
        button1.setBorder(border);
        button2.setBorder(border);
        button3.setBorder(border);
        button4.setBorder(border);
        button5.setBorder(border);
        button6.setBorder(border);
        button7.setBorder(border);
        button8.setBorder(border);
        button9.setBorder(border);
        button10.setBorder(border);
        button11.setBorder(border);
        button12.setBorder(border);
        button13.setBorder(border);
        button14.setBorder(border);
        button15.setBorder(border);
        button16.setBorder(border);
        
		
		
		
		/*
		Border border = LineBorder.createGrayLineBorder();
		
		Jbutton lblGrid1 = new JLabel("One");
		contentPane.add(lblGrid1);
		
		lblGrid1.setBorder(border);
		
		JLabel lblGrid2 = new JLabel("Two");
		contentPane.add(lblGrid2);
		
		lblGrid2.setBorder(border);
		
		JLabel lblGrid3 = new JLabel("Three");
		contentPane.add(lblGrid3);
		
		lblGrid3.setBorder(border);
		
		JLabel lblGrid4 = new JLabel("One");
		contentPane.add(lblGrid4);
		
		lblGrid4.setBorder(border);
		
		JLabel lblGrid5 = new JLabel("One");
		contentPane.add(lblGrid5);
		
		lblGrid5.setBorder(border);
		
		JLabel lblGrid6 = new JLabel("One");
		contentPane.add(lblGrid6);
		
		lblGrid6.setBorder(border);
		
		JLabel lblGrid7 = new JLabel("One");
		contentPane.add(lblGrid7);
		
		lblGrid7.setBorder(border);
		
		JLabel lblGrid8 = new JLabel("One");
		contentPane.add(lblGrid8);
		
		lblGrid8.setBorder(border);
		
		JLabel lblGrid9 = new JLabel("One");
		contentPane.add(lblGrid9);
		
		lblGrid9.setBorder(border);
		
		JLabel lblGrid10 = new JLabel("One");
		contentPane.add(lblGrid10);
		
		lblGrid10.setBorder(border);
		
		JLabel lblGrid11 = new JLabel("One");
		contentPane.add(lblGrid11);
		
		lblGrid11.setBorder(border);
		
		JLabel lblGrid12 = new JLabel("One");
		contentPane.add(lblGrid12);
		
		lblGrid12.setBorder(border);
		
		JLabel lblGrid13 = new JLabel("One");
		contentPane.add(lblGrid13);
		
		lblGrid13.setBorder(border);
		
		JLabel lblGrid14 = new JLabel("One");
		contentPane.add(lblGrid14);
		
		lblGrid14.setBorder(border);
		
		JLabel lblGrid15 = new JLabel("One");
		contentPane.add(lblGrid15);
		
		lblGrid15.setBorder(border);
		
		JLabel lblGrid16 = new JLabel("One");
		contentPane.add(lblGrid16);
		
		lblGrid16.setBorder(border);
		
		*/
	}
	public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("myButton"))
        {
        	setTheFactory(new ShipFactory());
        	Random rand = new Random();

        	int  n = rand.nextInt(3) + 1;
        	
        	Ship ship;
			ship = this.theFactory.createShip(n);
            button1.setText(ship.getType());
            
            
        }
    }
	
	public void setTheFactory(ShipFactory theFactory) {
		this.theFactory = theFactory;
	}
	
	private class MoveShip implements Command{
		private ArrayList<JLabel> previousState = new ArrayList<JLabel>();
		private boolean previousTurnState;
		private ArrayList<JLabel> nextState = new ArrayList<JLabel>();
		private boolean nextTurnState;
		
		private MoveShip(){
			
			//previousState = lab;
			
		}
		
		public void execute(){}
		public void undo(){}
	}

}


