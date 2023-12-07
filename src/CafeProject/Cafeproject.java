package CafeProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.text.SimpleDateFormat;
//import java.lang.System.Logger;
//import java.lang.System.Logger.Level;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.logging;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextField;

public class Cafeproject extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldTVSH;
	private JTextField textFieldVPTVSH;
	private JTextField textFieldTotal;
	private JSpinner   jSpinner1;
	private JSpinner   spinner_1;
	private JSpinner   spinner_2;
	private JSpinner   spinner_3;
	private JSpinner   spinner_4;
	private JSpinner   spinner_5;
	private JSpinner   spinner_6;
	private JSpinner   spinner_7;
	private JSpinner   spinner_8;
	private JSpinner   spinner_9;
	private JLabel Jlabelimage;
	private JLabel labelimage_1;
	private JLabel labelimage_2;
	private JLabel labelimage_2_1;
	private JLabel labelimage_4;
	private JLabel labelimage_5;
	private JLabel labelimage_6;
	private JLabel labelimage_7;
	private JLabel labelimage_8;
	private JLabel labelimage_9;
	private double total = 0.0;
	private JLabel  txtTime;
	private JLabel txtDate;
	private JTextArea textArea_1;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private JCheckBox chckbxNewCheckBox_4;
	private JCheckBox chckbxNewCheckBox_5;
	private JCheckBox chckbxNewCheckBox_6;
	private JCheckBox chckbxNewCheckBox_7;
	private JCheckBox chckbxNewCheckBox_8;
	private JCheckBox chckbxNewCheckBox_9;
	private int x = 0;
	private double tax = 0.0;
	private JButton btnTotal;
	
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cafeproject frame = new Cafeproject();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
	
	  public void setImage() {
	  
	  
	  ImageIcon icon = new ImageIcon(getClass().getResource("/images/coldcoffee.jpg")); 
	  ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/chocolatecake.jpg")); 
	  ImageIcon icon2 = new ImageIcon(getClass().getResource("/images/chocolatecoffee.jpg")); 
	  ImageIcon icon3 = new ImageIcon(getClass().getResource("/images/coke.jpg")); 
	  ImageIcon icon4 = new ImageIcon(getClass().getResource("/images/fruitscake.jpg")); 
	  ImageIcon icon5 = new ImageIcon(getClass().getResource("/images/greentea.jpg")); 
	  ImageIcon icon6 = new ImageIcon(getClass().getResource("/images/mineralswater.png")); 
	  ImageIcon icon7 = new ImageIcon(getClass().getResource("/images/orange_juice.jpg")); 
	  ImageIcon icon8 = new ImageIcon(getClass().getResource("/images/strawberrycake.jpg")); 
	  ImageIcon icon9 = new ImageIcon(getClass().getResource("/images/cappuccinocoffee.jpg")); 
	  
	  
	  
	  Image img = icon.getImage().getScaledInstance(Jlabelimage.getWidth(),Jlabelimage.
	  getHeight(), Image.SCALE_SMOOTH); 
	  Image img1 = icon1.getImage().getScaledInstance(labelimage_1.getWidth(),labelimage_1.
			  getHeight(), Image.SCALE_SMOOTH); 
	  Image img2 = icon2.getImage().getScaledInstance(labelimage_2.getWidth(),labelimage_2.
			  getHeight(), Image.SCALE_SMOOTH); 
	  Image img3 = icon3.getImage().getScaledInstance(labelimage_2_1.getWidth(),labelimage_2_1.
			  getHeight(), Image.SCALE_SMOOTH); 
	  Image img4 = icon4.getImage().getScaledInstance(labelimage_4.getWidth(),labelimage_4.
			  getHeight(), Image.SCALE_SMOOTH); 
	  Image img5 = icon5.getImage().getScaledInstance(labelimage_5.getWidth(),labelimage_5.
			  getHeight(), Image.SCALE_SMOOTH); 
	  Image img6 = icon6.getImage().getScaledInstance(labelimage_6.getWidth(),labelimage_6.
			  getHeight(), Image.SCALE_SMOOTH); 
	  Image img7 = icon7.getImage().getScaledInstance(labelimage_7.getWidth(),labelimage_7.
			  getHeight(), Image.SCALE_SMOOTH); 
	  Image img8 = icon8.getImage().getScaledInstance(labelimage_8.getWidth(),labelimage_8.
			  getHeight(), Image.SCALE_SMOOTH); 
	  Image img9 = icon9.getImage().getScaledInstance(labelimage_9.getWidth(),labelimage_9.
			  getHeight(), Image.SCALE_SMOOTH); 
	  
	  Jlabelimage.setIcon(new ImageIcon(img));
	  labelimage_1.setIcon(new ImageIcon(img1));
	  labelimage_2.setIcon(new ImageIcon(img2));
	  labelimage_2_1.setIcon(new ImageIcon(img3));
	  labelimage_4.setIcon(new ImageIcon(img4));
	  labelimage_5.setIcon(new ImageIcon(img5));
	  labelimage_6.setIcon(new ImageIcon(img6));
	  labelimage_7.setIcon(new ImageIcon(img7));
	  labelimage_8.setIcon(new ImageIcon(img8));
	  labelimage_9.setIcon(new ImageIcon(img9));
	  
	  
	  }
	 
	public boolean qtyIsZero( int qty) {
		if(qty == 0) {
			JOptionPane.showMessageDialog(null,"Ju lutem shtoni sasine.");
			return false;
		}
		return true;
	}
	public void freshMoodCafe() {
		textArea_1.setText("\n" + "********************************** FreshMood **********************************\n"
				+ "             Time: " + txtTime.getText() + "        Date: " + txtDate.getText() + "\n"
				+ "*********************************************************************************\n"
				+ "         Produkti:\t\t" + "Cmimi:\t" + "Vlera:\n");
	}
	
	public void getTax(double t) {
		if(t>=10.0 && t <= 20.0  ) {
			tax = 0.5;
		}else if(t>20.0 && t<= 40.0) {
			tax = 1.0;
		}else if(t>40.0 && t<= 60.0) {
			tax = 2.0;
		}else if(t>60.0 && t<= 80.0) {
			tax = 3.0;
		}else if(t>80.0 && t<= 100.0) {
			tax = 4.0;
		}else if(t>100.0 && t<= 150.0) {
			tax = 8.0;
		}else if(t>150.0 && t<= 200.0) {
			tax = 10.0;
		}else if(t>200.0) {
			tax = 15.0;
		}
	}
	public void setTime() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(1000);
					}catch(InterruptedException ex) {
						Logger.getLogger(Cafeproject.class.getName()).log(Level.SEVERE, null, ex);
					}
					Date date = new Date();
					SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
					SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");
					
					String time = tf.format(date);
					txtTime.setText(time.split(" ")[0] +time.split(" ")[1]); 
					txtDate.setText(df.format(date));
				}
			}
			
		}).start();
	}

	public void reset() {
		total = 0.0;
		x = 0;
		tax = 0.0;
		btnTotal.setEnabled(true);
	    jSpinner1.setValue(0);
	    spinner_1.setValue(0);
	    spinner_2.setValue(0);
	    spinner_3.setValue(0);
	    spinner_4.setValue(0);
	    spinner_5.setValue(0);
	    spinner_6.setValue(0);
	    spinner_7.setValue(0);
	    spinner_8.setValue(0);
	    spinner_9.setValue(0);

	    textFieldTVSH.setText("0.0");
	    textFieldVPTVSH.setText("0.0");
	    textFieldTotal.setText("0.0");
	    textArea_1.setText("");
	    chckbxNewCheckBox.setSelected(false);
	    chckbxNewCheckBox_1.setSelected(false);
	    chckbxNewCheckBox_2.setSelected(false);
	    chckbxNewCheckBox_3.setSelected(false);
	    chckbxNewCheckBox_4.setSelected(false); 
	    chckbxNewCheckBox_5.setSelected(false);
	    chckbxNewCheckBox_6.setSelected(false);
	    chckbxNewCheckBox_7.setSelected(false);
	    chckbxNewCheckBox_8.setSelected(false);
	    chckbxNewCheckBox_9.setSelected(false);
	}

	
	public void dudate() {
		textFieldTVSH.setText(String.valueOf(tax));
		textFieldVPTVSH.setText(String.valueOf(total));
		textFieldTotal.setText(String.valueOf(total + tax));
		
	}
	
	public Cafeproject() {
			
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1297, 767);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(255, 255, 255), 2));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FreshMood");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(40, 11, 187, 61);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new LineBorder(new Color(255, 255, 255)));
		panel.setBounds(10, 74, 845, 554);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblNewLabel_1.setBounds(350, 9, 136, 53);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panel_1.setBounds(38, 73, 146, 230);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Cmimi:");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 138, 49, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sasia:");
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 170, 49, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Bli");
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 201, 49, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel txtEmri = new JLabel("Kafe e ftohte");
		txtEmri.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmri.setBackground(new Color(255, 255, 255));
		txtEmri.setForeground(new Color(0, 0, 0));
		txtEmri.setFont(new Font("Serif", Font.BOLD, 17));
		txtEmri.setBounds(10, 108, 132, 23);
		panel_1.add(txtEmri);
		
		JLabel txtCmimi = new JLabel("12.0");
		txtCmimi.setForeground(new Color(0, 0, 0));
		txtCmimi.setFont(new Font("Serif", Font.PLAIN, 14));
		txtCmimi.setBounds(68, 138, 49, 14);
		panel_1.add(txtCmimi);
		
		jSpinner1 = new JSpinner();
		jSpinner1.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		jSpinner1.setBounds(58, 169, 49, 20);
		panel_1.add(jSpinner1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int qty = Integer.parseInt(jSpinner1.getValue().toString());
			        if (qtyIsZero(qty) && chckbxNewCheckBox.isSelected()) {
			        	x++;
			        	if (x==1) {
			        	  freshMoodCafe();
			        	}
			        	double price = qty * 12.0;
			        	total += price;
			        	getTax(total);
			        	textArea_1.setText( textArea_1.getText() + x + ". " + txtEmri.getText() + "\t\t" + txtCmimi.getText() + "\t" + price+ "\n" );
			        	dudate();	       
			        }else {
			        	chckbxNewCheckBox.setSelected(false);
			        	 
			        }
		}
		});
		chckbxNewCheckBox.setBounds(58, 201, 99, 23);
		panel_1.add(chckbxNewCheckBox);
		
		Jlabelimage = new JLabel("");
		Jlabelimage.setForeground(new Color(0, 0, 0));
		Jlabelimage.setBounds(0, 0, 142, 97);
		panel_1.add(Jlabelimage);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(194, 73, 146, 230);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Cmimi:");
		lblNewLabel_3_1.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(10, 138, 49, 14);
		panel_1_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Sasia:");
		lblNewLabel_4_1.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_4_1.setBounds(10, 170, 49, 14);
		panel_1_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Bli");
		lblNewLabel_5_1.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_5_1.setBounds(10, 201, 49, 14);
		panel_1_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Torte me cokollate");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_6_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_1.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_6_1.setBounds(10, 104, 132, 23);
		panel_1_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("30.0");
		lblNewLabel_7_1.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_7_1.setBounds(68, 138, 49, 14);
		panel_1_1.add(lblNewLabel_7_1);
		
	    spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spinner_1.setBounds(58, 169, 49, 20);
		panel_1_1.add(spinner_1);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int qty = Integer.parseInt(spinner_1.getValue().toString());
				        if (qtyIsZero(qty) && chckbxNewCheckBox_1.isSelected()) {
				        	x++;
				        	if (x==1) {
				        	  freshMoodCafe();
				        	}
				        	double price = qty * 30.0;
				        	total += price;
				        	getTax(total);
				        	textArea_1.setText( textArea_1.getText() + x + ". " + lblNewLabel_6_1.getText() + "\t\t" + lblNewLabel_7_1.getText() + "\t" + price+ "\n" );
				        	dudate();
				        }else {
				        	chckbxNewCheckBox_1.setSelected(false);
				        	 
				        }
			
			}
		});
		chckbxNewCheckBox_1.setBounds(58, 201, 99, 23);
		panel_1_1.add(chckbxNewCheckBox_1);
		
	    labelimage_1 = new JLabel("");
		labelimage_1.setBounds(0, 0, 142, 97);
		panel_1_1.add(labelimage_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(350, 73, 146, 230);
		panel.add(panel_1_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Cmimi:");
		lblNewLabel_3_2.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_3_2.setBounds(10, 138, 49, 14);
		panel_1_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("Sasia:");
		lblNewLabel_4_2.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_4_2.setBounds(10, 170, 49, 14);
		panel_1_2.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("Bli");
		lblNewLabel_5_2.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_5_2.setBounds(10, 201, 49, 14);
		panel_1_2.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("Cokollate e shkrire");
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_6_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_2.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_6_2.setBounds(10, 108, 132, 19);
		panel_1_2.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_7_2 = new JLabel("15.0");
		lblNewLabel_7_2.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_7_2.setBounds(68, 138, 49, 14);
		panel_1_2.add(lblNewLabel_7_2);
		
	    spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spinner_2.setBounds(58, 169, 49, 20);
		panel_1_2.add(spinner_2);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int qty = Integer.parseInt(spinner_2.getValue().toString());
		        if (qtyIsZero(qty) && chckbxNewCheckBox_2.isSelected()) {
		        	x++;
		        	if (x==1) {
		        	  freshMoodCafe();
		        	}
		        	double price = qty * 15.0;
		        	total += price;
		        	getTax(total);
		        	textArea_1.setText( textArea_1.getText() + x + ". " + lblNewLabel_6_2.getText() + "\t\t" + lblNewLabel_7_2.getText() + "\t" + price+ "\n" );
		        	dudate();
		        }else {
		        	chckbxNewCheckBox_2.setSelected(false);
		        	 
		        }
			}
		});
		chckbxNewCheckBox_2.setBounds(58, 201, 99, 23);
		panel_1_2.add(chckbxNewCheckBox_2);
		
		labelimage_2 = new JLabel("");
		labelimage_2.setBounds(0, 0, 142, 97);
		panel_1_2.add(labelimage_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(506, 73, 146, 230);
		panel.add(panel_1_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("Cmimi:");
		lblNewLabel_3_3.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_3_3.setBounds(10, 138, 49, 14);
		panel_1_3.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("Sasia:");
		lblNewLabel_4_3.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_4_3.setBounds(10, 170, 49, 14);
		panel_1_3.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_5_3 = new JLabel("Bli");
		lblNewLabel_5_3.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_5_3.setBounds(10, 201, 49, 14);
		panel_1_3.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_6_3 = new JLabel("Coca-Cola");
		lblNewLabel_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_6_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_3.setFont(new Font("Serif", Font.BOLD, 17));
		lblNewLabel_6_3.setBounds(10, 108, 132, 19);
		panel_1_3.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_7_3 = new JLabel("13.0");
		lblNewLabel_7_3.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_7_3.setBounds(68, 138, 49, 14);
		panel_1_3.add(lblNewLabel_7_3);
		
	    spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spinner_3.setBounds(58, 169, 49, 20);
		panel_1_3.add(spinner_3);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("");
		chckbxNewCheckBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int qty = Integer.parseInt(spinner_3.getValue().toString());
		        if (qtyIsZero(qty) && chckbxNewCheckBox_3.isSelected()) {
		        	x++;
		        	if (x==1) {
		        	  freshMoodCafe();
		        	}
		        	double price = qty * 13.0;
		        	total += price;
		        	getTax(total);
		        	textArea_1.setText( textArea_1.getText() + x + ". " + lblNewLabel_6_3.getText() + "\t\t\t" + lblNewLabel_7_3.getText() + "\t" + price+ "\n" );
		        	dudate();
		        }else {
		        	chckbxNewCheckBox_3.setSelected(false);
		        	 
		        }
			}
		});
		chckbxNewCheckBox_3.setBounds(58, 201, 99, 23);
		panel_1_3.add(chckbxNewCheckBox_3);
		
		labelimage_2_1 = new JLabel("");
		labelimage_2_1.setBounds(0, 0, 142, 97);
		panel_1_3.add(labelimage_2_1);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panel_1_4.setLayout(null);
		panel_1_4.setBounds(662, 73, 146, 230);
		panel.add(panel_1_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("Cmimi:");
		lblNewLabel_3_4.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_3_4.setBounds(10, 138, 49, 14);
		panel_1_4.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_4_4 = new JLabel("Sasia:");
		lblNewLabel_4_4.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_4_4.setBounds(10, 170, 49, 14);
		panel_1_4.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_5_4 = new JLabel("Bli");
		lblNewLabel_5_4.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_5_4.setBounds(10, 201, 49, 14);
		panel_1_4.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_6_4 = new JLabel("Torte me fruta");
		lblNewLabel_6_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_6_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_4.setFont(new Font("Serif", Font.BOLD, 17));
		lblNewLabel_6_4.setBounds(10, 108, 132, 20);
		panel_1_4.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_7_4 = new JLabel("20.0");
		lblNewLabel_7_4.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_7_4.setBounds(68, 138, 49, 14);
		panel_1_4.add(lblNewLabel_7_4);
		
	    spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spinner_4.setBounds(58, 169, 49, 20);
		panel_1_4.add(spinner_4);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("");
		chckbxNewCheckBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int qty = Integer.parseInt(spinner_4.getValue().toString());
		        if (qtyIsZero(qty) && chckbxNewCheckBox_4.isSelected()) {
		        	x++;
		        	if (x==1) {
		        	  freshMoodCafe();
		        	}
		        	double price = qty * 20.0;
		        	total += price;
		        	getTax(total);
		        	textArea_1.setText( textArea_1.getText() + x + ". " + lblNewLabel_6_4.getText() + "\t\t" + lblNewLabel_7_4.getText() + "\t" + price+ "\n" );
		        	dudate();
		        }else {
		        	chckbxNewCheckBox_4.setSelected(false);
		        	 
		        }
		     }
		});
		chckbxNewCheckBox_4.setBounds(58, 201, 99, 23);
		panel_1_4.add(chckbxNewCheckBox_4);
		
		labelimage_4 = new JLabel("");
		labelimage_4.setBounds(0, 0, 142, 97);
		panel_1_4.add(labelimage_4);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panel_1_5.setLayout(null);
		panel_1_5.setBounds(38, 311, 146, 230);
		panel.add(panel_1_5);
		
		JLabel lblNewLabel_3_5 = new JLabel("Cmimi:");
		lblNewLabel_3_5.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_3_5.setBounds(10, 138, 49, 14);
		panel_1_5.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_4_5 = new JLabel("Sasia:");
		lblNewLabel_4_5.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_4_5.setBounds(10, 170, 49, 14);
		panel_1_5.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_5_5 = new JLabel("Bli");
		lblNewLabel_5_5.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_5_5.setBounds(10, 201, 49, 14);
		panel_1_5.add(lblNewLabel_5_5);
		
		JLabel lblNewLabel_6_5 = new JLabel("Caj jeshil");
		lblNewLabel_6_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5.setBackground(new Color(255, 255, 255));
		lblNewLabel_6_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_5.setFont(new Font("Serif", Font.BOLD, 17));
		lblNewLabel_6_5.setBounds(10, 108, 132, 23);
		panel_1_5.add(lblNewLabel_6_5);
		
		JLabel lblNewLabel_7_5 = new JLabel("10.0");
		lblNewLabel_7_5.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_7_5.setBounds(68, 138, 49, 14);
		panel_1_5.add(lblNewLabel_7_5);
		
	    spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spinner_5.setBounds(58, 169, 49, 20);
		panel_1_5.add(spinner_5);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("");
		chckbxNewCheckBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int qty = Integer.parseInt(spinner_5.getValue().toString());
		        if (qtyIsZero(qty) && chckbxNewCheckBox_5.isSelected()) {
		        	x++;
		        	if (x==1) {
		        	  freshMoodCafe();
		        	}
		        	double price = qty * 10.0;
		        	total += price;
		        	getTax(total);
		        	textArea_1.setText( textArea_1.getText() + x + ". " + lblNewLabel_6_5.getText() + "\t\t\t" + lblNewLabel_7_5.getText() + "\t" + price+ "\n" );
		        	dudate();
		        }else {
		        	chckbxNewCheckBox_5.setSelected(false);
		        	 
		        }
			}
		});
		chckbxNewCheckBox_5.setBounds(58, 201, 99, 23);
		panel_1_5.add(chckbxNewCheckBox_5);
		
		labelimage_5 = new JLabel("");
		labelimage_5.setBounds(0, 0, 142, 97);
		panel_1_5.add(labelimage_5);
		
		JPanel panel_1_6 = new JPanel();
		panel_1_6.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panel_1_6.setLayout(null);
		panel_1_6.setBounds(194, 311, 146, 230);
		panel.add(panel_1_6);
		
		JLabel lblNewLabel_3_6 = new JLabel("Cmimi:");
		lblNewLabel_3_6.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_3_6.setBounds(10, 138, 49, 14);
		panel_1_6.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_4_6 = new JLabel("Sasia:");
		lblNewLabel_4_6.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_4_6.setBounds(10, 170, 49, 14);
		panel_1_6.add(lblNewLabel_4_6);
		
		JLabel lblNewLabel_5_6 = new JLabel("Bli");
		lblNewLabel_5_6.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_5_6.setBounds(10, 201, 49, 14);
		panel_1_6.add(lblNewLabel_5_6);
		
		JLabel lblNewLabel_6_6 = new JLabel("Uje");
		lblNewLabel_6_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_6.setBackground(new Color(255, 255, 255));
		lblNewLabel_6_6.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_6.setFont(new Font("Serif", Font.BOLD, 17));
		lblNewLabel_6_6.setBounds(10, 108, 132, 29);
		panel_1_6.add(lblNewLabel_6_6);
		
		JLabel lblNewLabel_7_6 = new JLabel("5.0");
		lblNewLabel_7_6.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_7_6.setBounds(68, 138, 49, 14);
		panel_1_6.add(lblNewLabel_7_6);
		
	    spinner_6 = new JSpinner();
		spinner_6.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spinner_6.setBounds(58, 169, 49, 20);
		panel_1_6.add(spinner_6);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("");
		chckbxNewCheckBox_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int qty = Integer.parseInt(spinner_6.getValue().toString());
		        if (qtyIsZero(qty) && chckbxNewCheckBox_6.isSelected()) {
		        	x++;
		        	if (x==1) {
		        	  freshMoodCafe();
		        	}
		        	double price = qty * 5.0;
		        	total += price;
		        	getTax(total);
		        	textArea_1.setText( textArea_1.getText() + x + ". " + lblNewLabel_6_6.getText() + "\t\t\t" + lblNewLabel_7_6.getText() + "\t" + price+ "\n" );
		        	dudate();
		        }else {
		        	chckbxNewCheckBox_6.setSelected(false);
		        	 
		        }
			}
		});
		chckbxNewCheckBox_6.setBounds(58, 201, 99, 23);
		panel_1_6.add(chckbxNewCheckBox_6);
		
		labelimage_6 = new JLabel("");
		labelimage_6.setBounds(0, 0, 142, 97);
		panel_1_6.add(labelimage_6);
		
		JPanel panel_1_7 = new JPanel();
		panel_1_7.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panel_1_7.setLayout(null);
		panel_1_7.setBounds(350, 311, 146, 230);
		panel.add(panel_1_7);
		
		JLabel lblNewLabel_3_7 = new JLabel("Cmimi:");
		lblNewLabel_3_7.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_3_7.setBounds(10, 138, 49, 14);
		panel_1_7.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_4_7 = new JLabel("Sasia:");
		lblNewLabel_4_7.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_4_7.setBounds(10, 170, 49, 14);
		panel_1_7.add(lblNewLabel_4_7);
		
		JLabel lblNewLabel_5_7 = new JLabel("Bli");
		lblNewLabel_5_7.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_5_7.setBounds(10, 201, 49, 14);
		panel_1_7.add(lblNewLabel_5_7);
		
		JLabel lblNewLabel_6_7 = new JLabel("Leng frutash");
		lblNewLabel_6_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_7.setBackground(new Color(255, 255, 255));
		lblNewLabel_6_7.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_7.setFont(new Font("Serif", Font.BOLD, 17));
		lblNewLabel_6_7.setBounds(10, 108, 132, 23);
		panel_1_7.add(lblNewLabel_6_7);
		
		JLabel lblNewLabel_7_7 = new JLabel("14.0");
		lblNewLabel_7_7.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_7_7.setBounds(69, 138, 49, 14);
		panel_1_7.add(lblNewLabel_7_7);
		
		spinner_7 = new JSpinner();
		spinner_7.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spinner_7.setBounds(58, 169, 49, 20);
		panel_1_7.add(spinner_7);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("");
		chckbxNewCheckBox_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int qty = Integer.parseInt(spinner_7.getValue().toString());
		        if (qtyIsZero(qty) && chckbxNewCheckBox_7.isSelected()) {
		        	x++;
		        	if (x==1) {
		        	  freshMoodCafe();
		        	}
		        	double price = qty * 14.0;
		        	total += price;
		        	getTax(total);
		        	textArea_1.setText( textArea_1.getText() + x + ". " + lblNewLabel_6_7.getText() + "\t\t" + lblNewLabel_7_7.getText() + "\t" + price+ "\n" );
		        	dudate();
		        }else {
		        	chckbxNewCheckBox_7.setSelected(false);
		        	 
		        }
			}
		});
		chckbxNewCheckBox_7.setBounds(58, 201, 99, 23);
		panel_1_7.add(chckbxNewCheckBox_7);
		
		
		labelimage_7 = new JLabel("");
		labelimage_7.setBounds(0, 0, 142, 97);
		panel_1_7.add(labelimage_7);
		
		JPanel panel_1_8 = new JPanel();
		panel_1_8.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panel_1_8.setLayout(null);
		panel_1_8.setBounds(506, 311, 146, 230);
		panel.add(panel_1_8);
		
		JLabel lblNewLabel_3_8 = new JLabel("Cmimi:");
		lblNewLabel_3_8.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_3_8.setBounds(10, 138, 49, 14);
		panel_1_8.add(lblNewLabel_3_8);
		
		JLabel lblNewLabel_4_8 = new JLabel("Sasia:");
		lblNewLabel_4_8.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_4_8.setBounds(10, 170, 49, 14);
		panel_1_8.add(lblNewLabel_4_8);
		
		JLabel lblNewLabel_5_8 = new JLabel("Bli");
		lblNewLabel_5_8.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_5_8.setBounds(10, 201, 49, 14);
		panel_1_8.add(lblNewLabel_5_8);
		
		JLabel lblNewLabel_6_8 = new JLabel("Torte me luleshtrydhe");
		lblNewLabel_6_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_8.setBackground(new Color(255, 255, 255));
		lblNewLabel_6_8.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_8.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_6_8.setBounds(10, 108, 132, 14);
		panel_1_8.add(lblNewLabel_6_8);
		
		JLabel lblNewLabel_7_8 = new JLabel("18.0");
		lblNewLabel_7_8.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_7_8.setBounds(68, 138, 49, 14);
		panel_1_8.add(lblNewLabel_7_8);
		
		spinner_8 = new JSpinner();
		spinner_8.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spinner_8.setBounds(58, 169, 49, 20);
		panel_1_8.add(spinner_8);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("");
		chckbxNewCheckBox_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int qty = Integer.parseInt(spinner_8.getValue().toString());
		        if (qtyIsZero(qty) && chckbxNewCheckBox_8.isSelected()) {
		        	x++;
		        	if (x==1) {
		        	  freshMoodCafe();
		        	}
		        	double price = qty * 18.0;
		        	total += price;
		        	getTax(total);
		        	textArea_1.setText( textArea_1.getText() + x + ". " + lblNewLabel_6_8.getText() + "\t\t" + lblNewLabel_7_8.getText() + "\t" + price+ "\n" );
		        	dudate();
		        }else {
		        	chckbxNewCheckBox_8.setSelected(false);
		        	 
		        }
			}
		});
		chckbxNewCheckBox_8.setBounds(58, 201, 99, 23);
		panel_1_8.add(chckbxNewCheckBox_8);
		
		labelimage_8 = new JLabel("");
		labelimage_8.setBounds(0, 0, 142, 97);
		panel_1_8.add(labelimage_8);
		
		JLabel labelimage_3 = new JLabel("");
		labelimage_3.setBounds(69, 22, 142, 97);
		panel_1_8.add(labelimage_3);
		
		JPanel panel_1_9 = new JPanel();
		panel_1_9.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panel_1_9.setLayout(null);
		panel_1_9.setBounds(662, 311, 146, 230);
		panel.add(panel_1_9);
		
		JLabel lblNewLabel_3_9 = new JLabel("Cmimi:");
		lblNewLabel_3_9.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_3_9.setBounds(10, 138, 49, 14);
		panel_1_9.add(lblNewLabel_3_9);
		
		JLabel lblNewLabel_4_9 = new JLabel("Sasia:");
		lblNewLabel_4_9.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_4_9.setBounds(10, 170, 49, 14);
		panel_1_9.add(lblNewLabel_4_9);
		
		JLabel lblNewLabel_5_9 = new JLabel("Bli");
		lblNewLabel_5_9.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_5_9.setBounds(10, 201, 49, 14);
		panel_1_9.add(lblNewLabel_5_9);
		
		JLabel lblNewLabel_6_9 = new JLabel("Makiato");
		lblNewLabel_6_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_9.setBackground(new Color(255, 255, 255));
		lblNewLabel_6_9.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_9.setFont(new Font("Serif", Font.BOLD, 17));
		lblNewLabel_6_9.setBounds(10, 108, 132, 14);
		panel_1_9.add(lblNewLabel_6_9);
		
		JLabel lblNewLabel_7_9 = new JLabel("8.0");
		lblNewLabel_7_9.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_7_9.setBounds(68, 138, 49, 14);
		panel_1_9.add(lblNewLabel_7_9);
		
		spinner_9 = new JSpinner();
		spinner_9.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spinner_9.setBounds(58, 169, 49, 20);
		panel_1_9.add(spinner_9);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("");
		chckbxNewCheckBox_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int qty = Integer.parseInt(spinner_9.getValue().toString());
		        if (qtyIsZero(qty) && chckbxNewCheckBox_9.isSelected()) {
		        	x++;
		        	if (x==1) {
		        	  freshMoodCafe();
		        	}
		        	double price = qty * 8.0;
		        	total += price;
		        	getTax(total);
		        	textArea_1.setText( textArea_1.getText() + x + ". " + lblNewLabel_6_9.getText() + "\t\t\t" + lblNewLabel_7_9.getText() + "\t" + price+ "\n" );
		        	dudate();
		        }else {
		        	chckbxNewCheckBox_9.setSelected(false);
		        	 
		        }
			}
		});
		chckbxNewCheckBox_9.setBounds(58, 201, 99, 23);
		panel_1_9.add(chckbxNewCheckBox_9);
		
		labelimage_9 = new JLabel("");
		labelimage_9.setBounds(0, 0, 142, 97);
		panel_1_9.add(labelimage_9);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(10, 639, 846, 61);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		btnTotal = new JButton("Total");
		btnTotal.setForeground(new Color(255, 255, 255));
		btnTotal.setBackground(new Color(0, 255, 0));
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(total == 0.0) {
				JOptionPane.showMessageDialog(null, "Ju nuk keni zgjedhur asnje produkt.");
			}else {
				textArea_1.setText(textArea_1.getText()
						+"\n*********************************************************************************\n"
						+"TVSH: \t\t\t" + tax + "\n"
						+"Totali pa TVSH: \t\t" + total + "\n"
						+"Totali: \t\t\t" + (total + tax) + "\n\n" 
						+"********************************** FreshMood **********************************\n"
						);
				btnTotal.setEnabled(false); 
			 }
			}
		});
		btnTotal.setBounds(145, 11, 144, 39);
		panel_2.add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 reset();
			}
		});
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBackground(new Color(255, 128, 0));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBounds(308, 11, 144, 39);
		panel_2.add(btnReset);
		
		JButton btnExit = new JButton("Dil");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setBackground(new Color(255, 0, 128));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(469, 11, 144, 39);
		panel_2.add(btnExit);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(192, 192, 192));
		panel_3.setBounds(865, 74, 389, 615);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		
		textFieldTVSH = new JTextField();
		textFieldTVSH.setForeground(new Color(0, 0, 0));
		textFieldTVSH.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTVSH.setText("0.0");
		textFieldTVSH.setEnabled(false);
		textFieldTVSH.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textFieldTVSH.setBounds(183, 481, 138, 30);
		panel_3.add(textFieldTVSH);
		textFieldTVSH.setColumns(10);
		
		textFieldVPTVSH = new JTextField();
		textFieldVPTVSH.setForeground(new Color(0, 0, 0));
		textFieldVPTVSH.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldVPTVSH.setText("0.0");
		textFieldVPTVSH.setEnabled(false);
		textFieldVPTVSH.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textFieldVPTVSH.setColumns(10);
		textFieldVPTVSH.setBounds(183, 522, 138, 30);
		panel_3.add(textFieldVPTVSH);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setForeground(new Color(0, 0, 0));
		textFieldTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTotal.setText("0.0");
		textFieldTotal.setEnabled(false);
		textFieldTotal.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textFieldTotal.setColumns(10);
		textFieldTotal.setBounds(183, 563, 138, 30);
		panel_3.add(textFieldTotal);
		
		JLabel lblNewLabel_2 = new JLabel("TVSH:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(27, 481, 89, 30);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Vlera pa TVSH:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(27, 522, 129, 30);
		panel_3.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Total:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(27, 563, 89, 30);
		panel_3.add(lblNewLabel_2_2);
		
	    textArea_1 = new JTextArea();
		textArea_1.setBounds(0, 0, 389, 451);
		panel_3.add(textArea_1);
		
		
	    txtTime = new JLabel("");
	    txtTime.setFont(new Font("Times New Roman", Font.BOLD, 25));
		txtTime.setBounds(890, 22, 158, 42);
		contentPane.add(txtTime);
		
		txtDate = new JLabel("");
		txtDate.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtDate.setBounds(1081, 22, 126, 41);
		contentPane.add(txtDate);
        setTime();
        setImage();
       
	}
}
