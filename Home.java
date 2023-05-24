import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 584, 357);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Data Structures");
		lblNewLabel.setForeground(new Color(255, 69, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 18));
		lblNewLabel.setBounds(192, 11, 205, 24);
		contentPane.add(lblNewLabel);
		
		JButton Array = new JButton("Array");
		Array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//code for Array
				new Array().setVisible(true);
			}
		});
		Array.setFont(new Font("Constantia", Font.BOLD, 14));
		Array.setBounds(232, 52, 87, 27);
		contentPane.add(Array);
		
		JButton Stack = new JButton("Stack");
		Stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for  stack
				new Stack().setVisible(true);
			}
		});
		Stack.setBackground(new Color(240, 240, 240));
		Stack.setForeground(new Color(75, 0, 130));
		Stack.setFont(new Font("Constantia", Font.BOLD, 14));
		Stack.setBounds(60, 108, 93, 27);
		contentPane.add(Stack);
		
		JButton Queue = new JButton("Queue");
		Queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for queue
				new Queue().setVisible(true);
			}
		});
		Queue.setForeground(new Color(255, 0, 255));
		Queue.setFont(new Font("Constantia", Font.BOLD, 14));
		Queue.setBounds(226, 108, 93, 27);
		contentPane.add(Queue);
		
		JButton CircularQueue = new JButton("CircularQueue");
		CircularQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for circular queue 
				new CircularQueue().setVisible(true);
			}
		});
		CircularQueue.setForeground(new Color(0, 100, 0));
		CircularQueue.setFont(new Font("Constantia", Font.BOLD, 14));
		CircularQueue.setBounds(379, 108, 149, 27);
		contentPane.add(CircularQueue);
		
		JButton SinglyLinkedList = new JButton("Singly Linked List");
		SinglyLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for sll
				new SinglyLinkedList().setVisible(true);
			}
		});
		SinglyLinkedList.setForeground(new Color(139, 0, 0));
		SinglyLinkedList.setFont(new Font("Constantia", Font.BOLD, 14));
		SinglyLinkedList.setBounds(186, 179, 179, 27);
		contentPane.add(SinglyLinkedList);
		
		JButton DoublyLinkedList = new JButton("Doubly Linked List");
		DoublyLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for dll
				new dll().setVisible(true);
			}
		});
		DoublyLinkedList.setForeground(new Color(0, 191, 255));
		DoublyLinkedList.setFont(new Font("Constantia", Font.BOLD, 14));
		DoublyLinkedList.setBounds(174, 268, 205, 27);
		contentPane.add(DoublyLinkedList);
	}
}
