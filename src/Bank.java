import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

import javax.swing.*;

public class Bank extends JFrame {
	private static final Object FlowLayout = null;
	private ArrayList<Customer> list;
	private ListIterator<Customer> listIterator;
	private ArrayList<CustomerAccount> listCA;
	private ListIterator<CustomerAccount> listIteratorCA;
	private ArrayList<Transactions> listT;
	int size;
	public String pps;
	public double balanceCus;
	public Bank(){
		super("Bank");
		list= new ArrayList<>();
		listCA=new ArrayList<>();
		listT=new ArrayList<>();
		size=0;
		String password="1234567";
		int firstresult;
		
		JFrame frame = this;
		setTitle("Bank");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String firstmessage ="Enter the administrator password to access the Bank system:";
		JTextField firsttxt = new JTextField();
		firstresult = JOptionPane.showOptionDialog(frame, new Object[]{
				firstmessage,firsttxt},"Administrator Login", JOptionPane.OK_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,null,null,null);
		if(!firsttxt.getText().equals(password)) {
			JOptionPane.showMessageDialog(null, "Sorry, this password is incorrect");
			System.exit(0);
		}
		else {
		JMenu customer = new JMenu("Customers");
		customer.setMnemonic(KeyEvent.VK_U);
		JMenuItem create = new JMenuItem("Create a Customer");
		create.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,Event.CTRL_MASK));
		customer.add(create);
		JMenu customerA = new JMenu("Customer Accounts");
		customer.setMnemonic(KeyEvent.VK_U);
		JMenuItem createCusA = new JMenuItem("Create a Customer Account");
		createCusA.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,Event.CTRL_MASK));
		customerA.add(createCusA);
		JMenu transactions = new JMenu("Transactions");
		customer.setMnemonic(KeyEvent.VK_U);
		JMenuItem deposit = new JMenuItem("Deposit");
		JMenuItem withdrawal = new JMenuItem("Withdrawal");
		customer.add(create);
		transactions.add(deposit);
		transactions.add(withdrawal);
		JMenu statements = new JMenu("Statements");
		customer.setMnemonic(KeyEvent.VK_U);
		JMenuItem stm = new JMenuItem("Show all Customer Details");
		statements.add(stm);
		JMenuBar menuBar= new JMenuBar();
		menuBar.add(customer);
		menuBar.add(customerA);
		menuBar.add(transactions);
		menuBar.add(statements);
		frame.setJMenuBar(menuBar);
		
		JPanel panel= new JPanel();
		JPanel panel2= new JPanel();
		JPanel panel3= new JPanel();
		JPanel panel4=new JPanel();
		JPanel panel5=new JPanel();
		JPanel panel6=new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8=new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		create.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				panel.setVisible(true);
				panel2.setVisible(true);
				panel3.setVisible(true);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
				panel.removeAll();
				panel2.removeAll();
				panel3.removeAll();
				panel4.removeAll();
				panel5.removeAll();
				panel6.removeAll();
				panel7.removeAll();
				panel8.removeAll();
				panel9.removeAll();
				panel10.removeAll();
		
		panel.setPreferredSize(new Dimension(100,100));
		panel.setLayout(new FlowLayout());
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		panel2.setPreferredSize(new Dimension(100,100));
		panel2.setLayout(new FlowLayout());
		frame.getContentPane().add(panel2, BorderLayout.CENTER);
		
		panel3.setPreferredSize(new Dimension(100,100));
		panel3.setLayout(new FlowLayout());
		frame.getContentPane().add(panel3, BorderLayout.SOUTH);
		
		JTextArea area = new JTextArea();
		area.setEditable(false);
		area.setVisible(true);
		panel3.add(area);
		
		JLabel label= new JLabel("PPS Number");
		JLabel label2= new JLabel("First Name");
		JLabel label3= new JLabel("Last Name");
		JLabel label4= new JLabel("DOB");
		
		JTextField txt = new JTextField();
		txt.setPreferredSize( new Dimension( 200, 24 ) ); 
		JTextField txt2 = new JTextField();
		txt2.setPreferredSize( new Dimension( 200, 24 ) ); 
		JTextField txt3 = new JTextField();
		txt3.setPreferredSize( new Dimension( 200, 24 )); 
		JTextField txt4 = new JTextField();
		txt4.setPreferredSize( new Dimension( 200, 24 ) );
		
		JButton button = new JButton("First");
		JButton button2 = new JButton("Next");
		JButton button3 = new JButton("Previous");
		JButton button4 = new JButton("Last");
		JButton button5 = new JButton("Modify");
		JButton button6 = new JButton("Add");
		JButton button7 = new JButton("Delete");
		
		panel.add(label);
		panel.add(txt);
		panel.add(label2);
		panel.add(txt2);
		panel.add(label3);
		panel.add(txt3);
		panel.add(label4);
		panel.add(txt4);
		panel2.add(button6);
		panel2.add(button);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button7);
		
		button6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				e.getSource();
				Customer c = null;
				 Random rand = new Random();
				 int random=rand.nextInt(100000);
				 
				 String surname;
				 String firstname;
				 String dob;
				 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				    StringBuilder sb = new StringBuilder();
				    Random random2 = new Random();
				    int length = 7;

				    for(int i = 0; i < length; i++) {
				    	int index = random2.nextInt(alphabet.length());
				        char randomChar = alphabet.charAt(index);
				        sb.append(randomChar);
				    }
				    String randomString = sb.toString();
				 
				 
				 pps=txt.getText();
				 surname=txt2.getText();
				 firstname=txt3.getText();
				 dob=txt4.getText();
				 c= new Customer(pps, surname, firstname, dob, random, randomString);
				 list.add(c);
				 txt.setText("");
				 txt2.setText("");
				 txt3.setText("");
				 txt4.setText("");
				 
				  
					
					area.append("The customers PPS number is: " + pps + ". Name: " + surname + "," + firstname +
							". DOB: " + dob + ". ID is: " + random + ". Password is: " + randomString + "\n");
				 
			}
		});
		
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				e.getSource();
				size=list.size();
				listIterator=list.listIterator();
				Customer c;
				c=listIterator.next();
				txt.setText(c.getPps());
				txt2.setText(c.getSurname());
				txt3.setText(c.getFirstname());
				txt4.setText(c.getDob());
			}
			});
		
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				e.getSource();
				if(listIterator.hasNext()){
					Customer c;
					c=listIterator.next();
					txt.setText(c.getPps());
					txt2.setText(c.getSurname());
					txt3.setText(c.getFirstname());
					txt4.setText(c.getDob());
				}
				else {
					JOptionPane.showMessageDialog(null, "You have reached the last customer");
				}
			}
		});
		

		button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				e.getSource();
				if(listIterator.hasPrevious()){
					Customer c;
					c=listIterator.previous();
					txt.setText(c.getPps());
					txt2.setText(c.getSurname());
					txt3.setText(c.getFirstname());
					txt4.setText(c.getDob());
				}
				else {
					JOptionPane.showMessageDialog(null, "You have reached the first customer");
				}
			}
		});
		
		button4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				e.getSource();
				size=list.size();
				listIterator=list.listIterator(list.size());
				if(listIterator.hasPrevious()){
					Customer c;
					c=listIterator.previous();
					txt.setText(c.getPps());
					txt2.setText(c.getSurname());
					txt3.setText(c.getFirstname());
					txt4.setText(c.getDob());
				}
			}
		});
		
		button5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				e.getSource();
				 String pps=txt.getText();
				 String surname=txt2.getText();
				 String firstname=txt3.getText();
				 String dob=txt4.getText();
				 for(Customer c:list) {
					 if(pps.equals(c.getPps())) {
						 c.setSurname(surname);
						 c.setFirstname(firstname);
						 c.setDob(dob);
						 JOptionPane.showMessageDialog(null, "Modification complete.");
						 break;
					 }
				 }
			}
		});
		
		button7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				e.getSource();
				String pps=txt.getText();
				 String surname=txt2.getText();
				 String firstname=txt3.getText();
				 String dob=txt4.getText();
				 for(Customer c:list) {
					 if(pps.equals(c.getPps())) {
				list.remove(c);
				listIterator=list.listIterator();
				txt.setText("");
				 txt2.setText("");
				 txt3.setText("");
				 txt4.setText("");
				JOptionPane.showMessageDialog(null, "Customer Deleted.");
				break;
					 }
			}
	}
			});
		
			}
		});
	
		createCusA.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				e.getSource();
				panel.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(true);
				panel5.setVisible(true);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
				panel.removeAll();
				panel2.removeAll();
				panel3.removeAll();
				panel4.removeAll();
				panel5.removeAll();
				panel6.removeAll();
				panel7.removeAll();
				panel8.removeAll();
				panel9.removeAll();
		        panel10.removeAll();
	panel4.setPreferredSize(new Dimension(100,100));
	panel4.setLayout(new FlowLayout());
	frame.getContentPane().add(panel4, BorderLayout.NORTH);
	JLabel label5 = new JLabel("Enter the PPS Nuber of the customer you wish to create an account for");
	panel4.add(label5);
	JTextField txt5=new JTextField();
	txt5.setPreferredSize( new Dimension( 200, 24 ) );
	panel4.add(txt5);
	JButton createCA =new JButton("Create");
	panel4.add(createCA);
	
	
	panel5.setPreferredSize(new Dimension(100,100));
	panel5.setLayout(new FlowLayout());
	frame.getContentPane().add(panel5, BorderLayout.CENTER);
	
	JLabel label6= new JLabel("PPS Number");
	JLabel num= new JLabel("Account Number");
	JLabel balance= new JLabel("Balance");
	
	JTextField txtpps = new JTextField();
	txtpps.setPreferredSize( new Dimension( 325, 24 ) ); 
	JTextField txtAn = new JTextField();
	txtAn.setPreferredSize( new Dimension( 325, 24 ) ); 
	JTextField txtB = new JTextField();
	txtB.setPreferredSize( new Dimension( 325, 24 ));
	
	JButton CAbutton = new JButton("First");
	JButton CAbutton2 = new JButton("Next");
	JButton CAbutton3 = new JButton("Previous");
	JButton CAbutton4 = new JButton("Last");
	JButton CAbutton5 = new JButton("Delete");
	
	panel5.add(label6);
	panel5.add(txtpps);
	panel5.add(num);
	panel5.add(txtAn);
	panel5.add(balance);
	panel5.add(txtB);
	panel5.add(CAbutton);
	panel5.add(CAbutton2);
	panel5.add(CAbutton3);
	panel5.add(CAbutton4);
	panel5.add(CAbutton5);
	
	createCA.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			e.getSource();
			CustomerAccount ca=null;
			String pps2=txt5.getText();
			Random rand = new Random();
			int random = rand.nextInt(100000);
			int accountNum=random;
			balanceCus=0;
			ca=new CustomerAccount(accountNum, balanceCus,pps2);
			listCA.add(ca);
			
			txtpps.setText(txt5.getText());
			txtAn.setText(String.valueOf(accountNum));
			txtB.setText(String.valueOf(balanceCus));
			
			
			txt5.setText("");
				}
		
	});
	
	CAbutton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			e.getSource();
			size=listCA.size();
			listIteratorCA=listCA.listIterator();
			CustomerAccount ca;
			ca=listIteratorCA.next();
			txtpps.setText(ca.getPps());
			txtAn.setText(String.valueOf(ca.getAccountNum()));
			txtB.setText(String.valueOf(ca.getBalance()));
		}
		});
	
	CAbutton2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			e.getSource();
			if(listIteratorCA.hasNext()){
				CustomerAccount ca;
				ca=listIteratorCA.next();
				txtpps.setText(ca.getPps());
				txtAn.setText(String.valueOf(ca.getAccountNum()));
				txtB.setText(String.valueOf(ca.getBalance()));
			}
			else {
				JOptionPane.showMessageDialog(null, "You have reached the last customer account");
			}
		}
	});
	
	CAbutton3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			e.getSource();
			if(listIteratorCA.hasPrevious()){
				CustomerAccount ca;
				ca=listIteratorCA.previous();
				txtpps.setText(ca.getPps());
				txtAn.setText(String.valueOf(ca.getAccountNum()));
				txtB.setText(String.valueOf(ca.getBalance()));
			}
			else {
				JOptionPane.showMessageDialog(null, "You have reached the first customer account");
			}
		}
	});
	
	CAbutton4.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			e.getSource();
			size=listCA.size();
			listIteratorCA=listCA.listIterator(listCA.size());
			if(listIteratorCA.hasPrevious()){
				CustomerAccount ca;
				ca=listIteratorCA.previous();
				txtpps.setText(ca.getPps());
				txtAn.setText(String.valueOf(ca.getAccountNum()));
				txtB.setText(String.valueOf(ca.getBalance()));
			}
		}
	});
	
	CAbutton5.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			e.getSource();
			String pps=txtpps.getText();
			 String accountNum=txtAn.getText();
			 String balance=txtB.getText();
			 for(CustomerAccount ca:listCA) {
				 if(pps.equals(ca.getPps())) {
			listCA.remove(ca);
			listIteratorCA=listCA.listIterator();
			 txtpps.setText("");
			 txtAn.setText("");
			 txtB.setText("");
			JOptionPane.showMessageDialog(null, "Customer Account Deleted.");
			break;
				 }
		}
}
		});
	
			}
		});
		
		
		
		deposit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				e.getSource();
				panel.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(true);
				panel7.setVisible(true);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
				panel.removeAll();
				panel2.removeAll();
				panel3.removeAll();
				panel4.removeAll();
				panel5.removeAll();
				panel6.removeAll();
				panel7.removeAll();
				panel8.removeAll();
				panel9.removeAll();
				panel10.removeAll();
				
				panel6.setPreferredSize(new Dimension(100,100));
				panel6.setLayout(new FlowLayout());
				frame.getContentPane().add(panel6, BorderLayout.NORTH);
				
				JLabel ppsQ =new JLabel("Enter the pps number of the  account you wish to deposit money in:");
				JTextField txtD=new JTextField();
				txtD.setPreferredSize( new Dimension( 200, 24 ) );
				JButton enter= new JButton("Enter");
				
				panel6.add(ppsQ);
				panel6.add(txtD);
				panel6.add(enter);
				
				        
				enter.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						e.getSource();
						Transactions t=null;
						String pps;
						double balance2;
						int result;
						String message ="How much do you wish to deposit:";
						JTextField txtD2 = new JTextField();
						result = JOptionPane.showOptionDialog(frame, new Object[]{
								message,txtD2},"Deposit", JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE,null,null,null);
						
						
						panel7.setPreferredSize(new Dimension(100, 100));
						panel7.setLayout(new FlowLayout());
						JTextArea sts = new JTextArea();
						panel7.add(sts);
						frame.getContentPane().add(panel7, BorderLayout.CENTER);
						for(CustomerAccount ca: listCA) {
						pps=txtD.getText();
						balance2=Double.parseDouble(txtD2.getText());
						double finalBalance;
						finalBalance= ca.balanceCus + balance2;
						balance2=finalBalance;
						ca.balanceCus=finalBalance;
						t=new Transactions(pps,balance2);
						listT.add(t);
						sts.append("The account of PPS Number: " + pps + "'s balance is: " + balance2+"\n");
						}

					}
				});
			}
		});

		withdrawal.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				e.getSource();
				panel.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(true);
				panel9.setVisible(true);
				panel10.setVisible(false);
				panel.removeAll();
				panel2.removeAll();
				panel3.removeAll();
				panel4.removeAll();
				panel5.removeAll();
				panel6.removeAll();
				panel7.removeAll();
				panel8.removeAll();
				panel9.removeAll();
				panel10.removeAll();
				
				panel8.setPreferredSize(new Dimension(100,100));
				panel8.setLayout(new FlowLayout());
				frame.getContentPane().add(panel8, BorderLayout.NORTH);
				
				JLabel ppsR =new JLabel("Enter the pps number of the  account you wish to withdrawal money from:");
				JTextField txtD2=new JTextField();
				txtD2.setPreferredSize( new Dimension( 200, 24 ) );
				JButton enter2= new JButton("Enter");
				
				panel8.add(ppsR);
				panel8.add(txtD2);
				panel8.add(enter2);
				
				        
				enter2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						e.getSource();
						Transactions t=null;
						String pps;
						double balance2;
						int result2;
						String message2 ="How much do you wish to withdrawal:";
						JTextField txtD3 = new JTextField();
						result2 = JOptionPane.showOptionDialog(frame, new Object[]{
								message2,txtD3},"Deposit", JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE,null,null,null);
						
						
						panel9.setPreferredSize(new Dimension(100, 100));
						panel9.setLayout(new FlowLayout());
						JTextArea sts2 = new JTextArea();
						panel9.add(sts2);
						frame.getContentPane().add(panel9, BorderLayout.CENTER);
						for(CustomerAccount ca: listCA) {
						pps=txtD2.getText();
						balance2=Double.parseDouble(txtD3.getText());
						double finalBalance2;
						if(ca.balanceCus<balance2) {
							JOptionPane.showMessageDialog(null, "Sorry, you do not have enough in"
									+" your balance to withdrawal this amount.");
						}
						else {
						finalBalance2= ca.balanceCus - balance2;
						balance2=finalBalance2;
						ca.balanceCus=finalBalance2;
						t=new Transactions(pps,balance2);
						listT.add(t);
						sts2.append("The account of PPS Number: " + pps + "'s balance is: " + balance2+"\n");
						}
						}
					}
					});
			}
		});

		stm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				e.getSource();
				panel.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(true);
				panel.removeAll();
				panel2.removeAll();
				panel3.removeAll();
				panel4.removeAll();
				panel5.removeAll();
				panel6.removeAll();
				panel7.removeAll();
				panel8.removeAll();
				panel9.removeAll();
				panel10.removeAll();
				//panel10.setPreferredSize(new Dimension(100,100));
				frame.getContentPane().add(panel10);
				JTextArea state = new JTextArea();
				state.setEditable(false);
				panel10.add(state);
				for(Customer ccc:list) {
					state.append("The customers PPS number is:" + ccc.pps +". Name: " + ccc.surname +"," + ccc.firstname +
							". DOB: " + ccc.dob + ". ID is: " + ccc.random + ". Password is: " + ccc.randomString + "\n");
				}
			}
			});
		}
		}
	
	
	
	
		
	public static void main(String[] args){
		Bank act= new Bank();
		act.pack();
		act.setVisible(true);
	}
}
