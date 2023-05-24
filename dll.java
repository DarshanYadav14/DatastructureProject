import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DoublyLinkedList.Node;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dll extends JFrame {

	private JPanel contentPane;
	private JTextField elementbox1;
	private JTextField elementbox2;
	private JTextField displaybox;
	class Node{
		int data;
		Node prelink;
		Node nextlink;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dll frame = new dll();
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
	public dll() {
		setBounds(100, 100, 648, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(124, 11, 415, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1.setBounds(10, 64, 195, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(10, 113, 195, 23);
		contentPane.add(lblNewLabel_1_1);
		
		elementbox1 = new JTextField();
		elementbox1.setBounds(230, 63, 120, 23);
		contentPane.add(elementbox1);
		elementbox1.setColumns(10);
		
		elementbox2 = new JTextField();
		elementbox2.setColumns(10);
		elementbox2.setBounds(230, 113, 120, 23);
		contentPane.add(elementbox2);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//insertfront
				int elem;
				elem=Integer.valueOf(elementbox1.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null) {
					first=newnode;
				}
				else {
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
				}
				String message="The element "+elem+" is inserted";
				JOptionPane.showMessageDialog(contentPane, message);
				elementbox1.setText("");
			}
		});
		insertfront.setForeground(new Color(60, 179, 113));
		insertfront.setFont(new Font("Constantia", Font.BOLD, 18));
		insertfront.setBounds(436, 63, 177, 31);
		contentPane.add(insertfront);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insertrear
				Node temp;
				int elem;
				elem=Integer.valueOf(elementbox2.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null) {
					first=newnode;
				}
				else {
					 temp=first;
					while(temp.nextlink!=null) {
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
				}
				String message="The element "+elem+" is inserted";
				JOptionPane.showMessageDialog(contentPane, message);
				elementbox2.setText("");
			}
		});
		insertrear.setForeground(new Color(60, 179, 113));
		insertrear.setFont(new Font("Constantia", Font.BOLD, 18));
		insertrear.setBounds(436, 112, 177, 31);
		contentPane.add(insertrear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//deletefront
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.nextlink==null) {
					String message="The deleted element is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				}
				else {
					String message="The deleted element is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=first.nextlink;
					first.prelink=null;
				}
			
			}
		});
		deletefront.setForeground(new Color(60, 179, 113));
		deletefront.setFont(new Font("Constantia", Font.BOLD, 18));
		deletefront.setBounds(216, 179, 195, 31);
		contentPane.add(deletefront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//deleterear
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.nextlink==null) {
					String message="The deleted element is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				}
				else {
					Node temp=first;
					while(temp.nextlink.nextlink!=null) {
						temp=temp.nextlink;
					}
					String message="The deleted element is "+temp.nextlink.data;
					JOptionPane.showMessageDialog(contentPane, message);
					temp.nextlink=null;
				}
			}
		});
		deleterear.setForeground(new Color(60, 179, 113));
		deleterear.setFont(new Font("Constantia", Font.BOLD, 18));
		deleterear.setBounds(216, 233, 195, 31);
		contentPane.add(deleterear);
		
		JButton displayforward = new JButton("DISPLAY FORWARD");
		displayforward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//displatforward
				String msg="";
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
					}
				else if(first.nextlink==null) {
					displaybox.setText(""+first.data);
					
				}
				else {
					Node temp=first;
					while(temp!=null) {
						msg=msg+" "+temp.data;
						temp=temp.nextlink;
					}		
				}
				displaybox.setText(msg);
			}
		});
		displayforward.setForeground(new Color(60, 179, 113));
		displayforward.setFont(new Font("Constantia", Font.BOLD, 18));
		displayforward.setBounds(202, 290, 226, 31);
		contentPane.add(displayforward);
		
		JButton displayreverse = new JButton("DISPLAY REVERSE");
		displayreverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//displayreverse
				String msg="";
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
					}
				else if(first.nextlink==null) {
					displaybox.setText(""+first.data);
				}
				else {
					Node temp=first;
					while(temp.nextlink!=null) {
						temp=temp.nextlink;
					}
					while(temp!=null) {
						msg=msg+" "+temp.data;
						temp=temp.prelink;
					}
				}
				displaybox.setText(msg);
			}
		});
		displayreverse.setForeground(new Color(60, 179, 113));
		displayreverse.setFont(new Font("Constantia", Font.BOLD, 18));
		displayreverse.setBounds(202, 343, 226, 31);
		contentPane.add(displayreverse);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(216, 191, 216));
		displaybox.setColumns(10);
		displaybox.setBounds(124, 413, 377, 23);
		contentPane.add(displaybox);
	}
}
