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

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField sizebox;
	private JTextField elementbox;
	private JTextField displaybox;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setBounds(100, 100, 615, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(120, 11, 377, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel_1.setBounds(37, 69, 185, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(37, 200, 185, 23);
		contentPane.add(lblNewLabel_1_1);
		
		sizebox = new JTextField();
		sizebox.setBounds(242, 65, 96, 29);
		contentPane.add(sizebox);
		sizebox.setColumns(10);
		
		elementbox = new JTextField();
		elementbox.setColumns(10);
		elementbox.setBounds(232, 194, 96, 29);
		contentPane.add(elementbox);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(255, 192, 203));
		displaybox.setColumns(10);
		displaybox.setBounds(145, 403, 330, 29);
		contentPane.add(displaybox);
		
		JButton createqueue = new JButton("CREATE QUEUE");
		createqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//CODE FOR CREATE
				size=Integer.valueOf(sizebox.getText());
				cq=new int[size];
				String message="Circular Queue of size "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createqueue.setForeground(new Color(30, 144, 255));
		createqueue.setFont(new Font("Constantia", Font.BOLD, 18));
		createqueue.setBounds(205, 119, 192, 31);
		contentPane.add(createqueue);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR INSERT
				int elem;
				if(count==size) {
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
					elementbox.setText("");
				}
				else {
					elem=Integer.valueOf(elementbox.getText());
					r=(r+1)%size;
					cq[r]=elem;
					count++;
					String message="Element "+elem+" is inserted";
					JOptionPane.showMessageDialog(contentPane, message);
					elementbox.setText("");
				}
			}
		});
		insert.setForeground(new Color(30, 144, 255));
		insert.setFont(new Font("Constantia", Font.BOLD, 18));
		insert.setBounds(366, 194, 169, 31);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETE
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else {
					String message="The element deleted is "+cq[f];
					JOptionPane.showMessageDialog(contentPane, message);
					f=(f+1)%size;
					count--;
				}
			}
		});
		delete.setForeground(new Color(30, 144, 255));
		delete.setFont(new Font("Constantia", Font.BOLD, 18));
		delete.setBounds(366, 254, 169, 31);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DISPLAY
				String msg ="";
				int f1=f;
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
					displaybox.setText("");
				}
				else {
					for(int i=1;i<=count;i++) {
						msg=msg+" "+cq[f1];
						f1=(f1+1)%size;
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(30, 144, 255));
		display.setFont(new Font("Constantia", Font.BOLD, 18));
		display.setBounds(228, 342, 169, 31);
		contentPane.add(display);
	}

}
