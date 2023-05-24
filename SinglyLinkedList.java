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
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField elementbox1;
	private JTextField elementbox2;
	private JTextField displaybox;
	
		class Node{
			int data;
			Node link;
		}
		private Node first;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setBounds(100, 100, 616, 457);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(106, 11, 405, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER AN ELEMENT:");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 71, 195, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT:");
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(10, 106, 195, 23);
		contentPane.add(lblNewLabel_1_1);
		
		elementbox1 = new JTextField();
		elementbox1.setBounds(263, 69, 96, 24);
		contentPane.add(elementbox1);
		elementbox1.setColumns(10);
		
		elementbox2 = new JTextField();
		elementbox2.setColumns(10);
		elementbox2.setBounds(263, 104, 96, 24);
		contentPane.add(elementbox2);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(255, 215, 0));
		displaybox.setColumns(10);
		displaybox.setBounds(106, 356, 392, 20);
		contentPane.add(displaybox);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR INSERT REAR
				Node temp;
				int elem;
				elem=Integer.valueOf(elementbox1.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null) {
				first=newnode;
				}
				else {
					temp=first;
					while(temp.link!=null) {
						temp=temp.link;
					}
					temp.link=newnode;
				}
				String message="The element "+elem+" is inserted";
				JOptionPane.showMessageDialog(contentPane, message);
				elementbox1.setText("");
			}
		});
		insertrear.setForeground(new Color(50, 205, 50));
		insertrear.setFont(new Font("Constantia", Font.BOLD, 18));
		insertrear.setBounds(409, 71, 163, 24);
		contentPane.add(insertrear);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR INSERT FRONT
				int elem;
				elem=Integer.valueOf(elementbox2.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null) {
					first=newnode;
				}
				else {
					newnode.link=first;
					first=newnode;
				}
				String message="The element "+elem+" is inserted";
				JOptionPane.showMessageDialog(contentPane, message);
				elementbox2.setText("");
			}
		});
		insertfront.setForeground(new Color(50, 205, 50));
		insertfront.setFont(new Font("Constantia", Font.BOLD, 18));
		insertfront.setBounds(409, 106, 172, 24);
		contentPane.add(insertfront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETE REAR
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link==null) {
					String message="The deleted element is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
				    first=null;
				}
				else {
					temp=first;
					while(temp.link.link!=null) {
						temp=temp.link;
					}
					String message="The deleted element is "+temp.link.data;
					JOptionPane.showMessageDialog(contentPane, message);
						temp.link=null;				
				}
			}
		});
		deleterear.setForeground(new Color(50, 205, 50));
		deleterear.setFont(new Font("Constantia", Font.BOLD, 18));
		deleterear.setBounds(220, 169, 164, 31);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETE FRONT
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link==null) {
					String message="The deleted element is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				}
				else {
					String message="The deleted element is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=first.link;
				}
			}
		});
		deletefront.setForeground(new Color(50, 205, 50));
		deletefront.setFont(new Font("Constantia", Font.BOLD, 18));
		deletefront.setBounds(217, 223, 181, 31);
		contentPane.add(deletefront);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DISPLAY
				Node temp;
				
				String msg="";
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.link==null) {
			
					displaybox.setText(""+first.data);
			}
				else {
					temp=first;
					while(temp!=null) {
						msg=msg+" "+temp.data;
						temp=temp.link;
					}
					
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(50, 205, 50));
		display.setFont(new Font("Constantia", Font.BOLD, 18));
		display.setBounds(220, 305, 149, 24);
		contentPane.add(display);
	}
	
}
