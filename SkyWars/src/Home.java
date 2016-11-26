import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;

public class Home extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16;
	ShipFactory theFactory;
	

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
        label1 = new JLabel("1");
        label2 = new JLabel("2");
        label3 = new JLabel("3");
        label4 = new JLabel("4");
        label5 = new JLabel("5");
        label6 = new JLabel("6");
        label7 = new JLabel("7");
        label8 = new JLabel("8");
        label9 = new JLabel("9");
        label10 = new JLabel("10");
        label11 = new JLabel("11");
        label12 = new JLabel("12");
        label13 = new JLabel("13");
        label14 = new JLabel("14");
        label15 = new JLabel("15");
        label16 = new JLabel("16");
       
        panel.add(btn);
        panel_1.add(label1);
        panel_1.add(label2);
        panel_1.add(label3);
        panel_1.add(label4);
        panel_1.add(label5);
        panel_1.add(label6);
        panel_1.add(label7);
        panel_1.add(label8);
        panel_1.add(label9);
        panel_1.add(label10);
        panel_1.add(label11);
        panel_1.add(label12);
        panel_1.add(label13);
        panel_1.add(label14);
        panel_1.add(label15);
        panel_1.add(label16);
        
        label1.setBorder(border);
        label2.setBorder(border);
        label3.setBorder(border);
        label4.setBorder(border);
        label5.setBorder(border);
        label6.setBorder(border);
        label7.setBorder(border);
        label8.setBorder(border);
        label9.setBorder(border);
        label10.setBorder(border);
        label11.setBorder(border);
        label12.setBorder(border);
        label13.setBorder(border);
        label14.setBorder(border);
        label15.setBorder(border);
        label16.setBorder(border);
        
		
		
		
		/*
		Border border = LineBorder.createGrayLineBorder();
		
		JLabel lblGrid1 = new JLabel("One");
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
            label1.setText(ship.getType());
        }
    }
	
	public void setTheFactory(ShipFactory theFactory) {
		this.theFactory = theFactory;
	}

}


