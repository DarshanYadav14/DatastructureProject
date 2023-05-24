import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizebox;
	private JTextField elementbox;
	private JTextField displaybox;
	private int s[];
	private int top=-1;
	private int size;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setBounds(100, 100, 623, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(179, 11, 261, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE STACK SIZE");
		lblNewLabel_1.setForeground(new Color(160, 82, 45));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel_1.setBounds(20, 68, 220, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1_1.setForeground(new Color(160, 82, 45));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(10, 179, 192, 23);
		contentPane.add(lblNewLabel_1_1);
		
		sizebox = new JTextField();
		sizebox.setBounds(236, 66, 96, 24);
		contentPane.add(sizebox);
		sizebox.setColumns(10);
		
		elementbox = new JTextField();
		elementbox.setColumns(10);
		elementbox.setBounds(214, 177, 96, 24);
		contentPane.add(elementbox);
		
		JButton createstack = new JButton("CREATE STACK");
		createstack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for stack creation
				size=Integer.valueOf(sizebox.getText());
				s=new int[size];
				String message="Stack of size "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createstack.setForeground(new Color(0, 128, 0));
		createstack.setFont(new Font("Constantia", Font.BOLD, 18));
		createstack.setBounds(202, 117, 184, 31);
		contentPane.add(createstack);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//push element
				int elem;
				if(top==size-1) {
				JOptionPane.showMessageDialog(contentPane, "push not possible");
				}
				else {
			       elem=Integer.valueOf(elementbox.getText());
					++top;
					s[top]=elem;
					String message="Element "+elem+" is inserted";
					JOptionPane.showMessageDialog(contentPane, message);
					elementbox.setText("");
				}
			}
		});
		push.setForeground(new Color(0, 128, 0));
		push.setFont(new Font("Constantia", Font.BOLD, 18));
		push.setBounds(356, 171, 153, 31);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pop element
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "Pop not possible");
				}
				else {
					String message="The popped element is "+s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					--top;
				}
			}
		});
		pop.setForeground(new Color(0, 128, 0));
		pop.setFont(new Font("Constantia", Font.BOLD, 18));
		pop.setBounds(356, 227, 153, 31);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display elements
				String msg="";
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else {
					for(int i=top;i>=0;i--) {
						msg=msg+" "+s[i];
					}
				}
				displaybox.setText(msg);	
			}
		});
		display.setForeground(new Color(0, 128, 0));
		display.setFont(new Font("Constantia", Font.BOLD, 18));
		display.setBounds(202, 292, 153, 31);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(210, 180, 140));
		displaybox.setForeground(new Color(0, 128, 0));
		displaybox.setColumns(10);
		displaybox.setBounds(101, 348, 354, 24);
		contentPane.add(displaybox);
	}

}
