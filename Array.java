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

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField lengthbox;
	private JTextField elementbox;
	private JTextField positionbox;
	private JTextField dpositionbox;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setBounds(100, 100, 689, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(191, 11, 287, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterArrayLength = new JLabel("ENTER ARRAY LENGTH");
		lblEnterArrayLength.setForeground(new Color(0, 0, 128));
		lblEnterArrayLength.setFont(new Font("Constantia", Font.BOLD, 18));
		lblEnterArrayLength.setBounds(10, 79, 235, 26);
		contentPane.add(lblEnterArrayLength);
		
		lengthbox = new JTextField();
		lengthbox.setBounds(243, 79, 252, 20);
		contentPane.add(lengthbox);
		lengthbox.setColumns(10);
		
		JButton createarray = new JButton("CREATE ARRAY");
		createarray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR CREATEARRAY
				int len=Integer.valueOf(lengthbox.getText());
				arr=new int[len];
			    String message="Array of length "+len+" created";
			    JOptionPane.showMessageDialog(contentPane, message);
			    
				
			}
		});
		createarray.setFont(new Font("Constantia", Font.BOLD, 18));
		createarray.setForeground(new Color(0, 128, 0));
		createarray.setBounds(256, 127, 188, 31);
		contentPane.add(createarray);
		
		JLabel lblEnterAnInteger = new JLabel("ENTER AN INTEGER ELEMENT");
		lblEnterAnInteger.setForeground(new Color(0, 0, 128));
		lblEnterAnInteger.setFont(new Font("Constantia", Font.BOLD, 18));
		lblEnterAnInteger.setBounds(10, 201, 272, 23);
		contentPane.add(lblEnterAnInteger);
		
		elementbox = new JTextField();
		elementbox.setBounds(292, 201, 96, 20);
		contentPane.add(elementbox);
		elementbox.setColumns(10);
		
		JLabel lblPosition = new JLabel("POSITION");
		lblPosition.setForeground(new Color(0, 0, 128));
		lblPosition.setFont(new Font("Constantia", Font.BOLD, 18));
		lblPosition.setBounds(411, 201, 96, 26);
		contentPane.add(lblPosition);
		
		positionbox = new JTextField();
		positionbox.setColumns(10);
		positionbox.setBounds(515, 201, 96, 20);
		contentPane.add(positionbox);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR INSEART
				int elem=Integer.valueOf(elementbox.getText());
				int pos=Integer.valueOf(positionbox.getText());
				arr[pos]=elem;
				String message="The element "+elem+" inserted at "+pos+" position";
				JOptionPane.showMessageDialog(contentPane, message);
				elementbox.setText("");
				positionbox.setText("");
			}
		});
		insert.setForeground(new Color(0, 128, 0));
		insert.setFont(new Font("Constantia", Font.BOLD, 18));
		insert.setBounds(256, 250, 167, 31);
		contentPane.add(insert);
		
		JLabel lblEnterThePosition = new JLabel("ENTER THE POSITION");
		lblEnterThePosition.setForeground(new Color(0, 0, 128));
		lblEnterThePosition.setFont(new Font("Constantia", Font.BOLD, 18));
		lblEnterThePosition.setBounds(10, 322, 222, 23);
		contentPane.add(lblEnterThePosition);
		
		dpositionbox = new JTextField();
		dpositionbox.setColumns(10);
		dpositionbox.setBounds(256, 322, 96, 20);
		contentPane.add(dpositionbox);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETE
				int pos=Integer.valueOf(dpositionbox.getText());
				arr[pos]=0;
				String message="Element deleted at the position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				dpositionbox.setText("");
			}
		});
		delete.setForeground(new Color(0, 128, 0));
		delete.setFont(new Font("Constantia", Font.BOLD, 18));
		delete.setBounds(435, 318, 167, 31);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DISPLAY
				String msg="";
				for(int i=0;i<=arr.length-1;i++) {
					msg=msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(0, 128, 0));
		display.setFont(new Font("Constantia", Font.BOLD, 18));
		display.setBounds(256, 379, 167, 31);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(151, 427, 406, 20);
		contentPane.add(displaybox);
	}
}
