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
	private JLabel label;
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
		
		
		
		JButton btn = new JButton("Change");
        btn.setActionCommand("myButton");
        btn.addActionListener(this);
        label = new JLabel("flag");
        
        panel.add(btn);
        panel_1.add(label);
        
		
		
		
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
            label.setText(ship.getType());
        }
    }
	
	public void setTheFactory(ShipFactory theFactory) {
		this.theFactory = theFactory;
	}

}


