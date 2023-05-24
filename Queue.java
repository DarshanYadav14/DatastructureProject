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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField sizebox;
	private JTextField elementbox;
	private JTextField displaybox;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setBounds(100, 100, 655, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(85, 107, 47));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(201, 11, 263, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterQueueSize = new JLabel("ENTER QUEUE SIZE");
		lblEnterQueueSize.setForeground(new Color(139, 0, 0));
		lblEnterQueueSize.setFont(new Font("Constantia", Font.BOLD, 18));
		lblEnterQueueSize.setBounds(10, 79, 190, 24);
		contentPane.add(lblEnterQueueSize);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT");
		lblEnterAnElement.setForeground(new Color(139, 0, 0));
		lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 18));
		lblEnterAnElement.setBounds(10, 195, 190, 24);
		contentPane.add(lblEnterAnElement);
		
		sizebox = new JTextField();
		sizebox.setBounds(192, 76, 96, 24);
		contentPane.add(sizebox);
		sizebox.setColumns(10);
		
		elementbox = new JTextField();
		elementbox.setColumns(10);
		elementbox.setBounds(215, 194, 96, 24);
		contentPane.add(elementbox);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(233, 150, 122));
		displaybox.setColumns(10);
		displaybox.setBounds(148, 398, 361, 24);
		contentPane.add(displaybox);
		
		JButton createqueue = new JButton("CREATE QUEUE");
		createqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//CODE FOR CREATE
				size=Integer.valueOf(sizebox.getText());
				q=new int[size];
				String message="Queue of size "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createqueue.setFont(new Font("Constantia", Font.BOLD, 18));
		createqueue.setBounds(223, 126, 179, 31);
		contentPane.add(createqueue);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//CODE FOR INSERT
				int elem;
				if(r==size-1) {
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
					elementbox.setText("");
				}
				else {
					elem=Integer.valueOf(elementbox.getText());
					++r;
					q[r]=elem;
					String message="Element "+elem+" is inserted";
					JOptionPane.showMessageDialog(contentPane, message);
					elementbox.setText("");
			}
			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 18));
		insert.setBounds(355, 188, 169, 31);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//CODE FOR DELETE
				if(r==-1 || f>r) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
	
				}
				else {
					String message="The element deleted is "+q[f];
					JOptionPane.showMessageDialog(contentPane, message);
					++f;
				}
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 18));
		delete.setBounds(355, 243, 169, 31);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//CODE FOR DISPLAy
				String msg="";
				if(r==-1 || f>r) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
					displaybox.setText("");
				}
				else {
					for(int i=f;i<=r;i++) {
						msg=msg+" "+q[i];
					}
				}
				displaybox.setText(msg);
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 18));
		display.setBounds(233, 345, 169, 31);
		contentPane.add(display);
	}
}
