package cvPorject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLayeredPane;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.JSeparator;
import java.awt.Component;
import java.awt.Desktop;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ImageIcon;

import java.awt.Label;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URI;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class cvProje {
	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cvProje window = new cvProje();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 * @return 
	 */
	public cvProje() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		JLabel background = new JLabel(new ImageIcon("arka.jpg"));
		frame.setContentPane(background);
frame.setTitle("CV MAKER");
		frame.setBounds(100, 100, 695, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 677, 21);
		frame.getContentPane().add(menuBar);
		
	
		
		JMenu mnNewMenu_1 = new JMenu("Show");
		mnNewMenu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				File htmlFile = new File("new.html");
				try {
					Desktop.getDesktop().browse(htmlFile.toURI());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 121, 677, 211);
		frame.getContentPane().add(tabbedPane);
		tabbedPane.setVisible(false);
		mnNewMenu_1.setVisible(false);

		JMenu mnNewMenu_2 = new JMenu("New");
		
		menuBar.add(mnNewMenu_2);
		mnNewMenu_1.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnNewMenu_1);
		
		
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane.addTab("Personal Information", null, layeredPane, null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 672, 181);
		layeredPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblAd = new JLabel("Name");
		lblAd.setBounds(10, 16, 46, 14);
		panel_4.add(lblAd);
		
		JLabel lblTelefon = new JLabel("Phone");
		lblTelefon.setBounds(433, 18, 46, 14);
		panel_4.add(lblTelefon);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(433, 45, 46, 14);
		panel_4.add(lblEmail);
		
		JLabel lblDoumYeri = new JLabel("Burn Place");
		lblDoumYeri.setBounds(193, 16, 89, 14);
		panel_4.add(lblDoumYeri);
		
		JLabel lblDoumTarihi = new JLabel("Birth Date");
		lblDoumTarihi.setBounds(193, 45, 89, 14);
		panel_4.add(lblDoumTarihi);
		
		JLabel lblMedeniDurumu = new JLabel("Marital");
		lblMedeniDurumu.setBounds(10, 115, 111, 14);
		panel_4.add(lblMedeniDurumu);
		
		JLabel lblSdres = new JLabel("Address");
		lblSdres.setBounds(433, 95, 187, 14);
		panel_4.add(lblSdres);
		
		JLabel lblAskerlikDurumu = new JLabel("Military Status");
		lblAskerlikDurumu.setBounds(193, 75, 113, 26);
		panel_4.add(lblAskerlikDurumu);
		
		JLabel lblEhliyet = new JLabel("Driving Licence");
		lblEhliyet.setBounds(193, 114, 89, 17);
		panel_4.add(lblEhliyet);
		
		textField_1 = new JTextField();
		textField_1.setBounds(68, 13, 113, 20);
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(491, 16, 142, 20);
		panel_4.add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(491, 42, 142, 20);
		panel_4.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(292, 13, 129, 20);
		panel_4.add(textField_6);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(68, 112, 113, 20);
		panel_4.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(292, 112, 131, 20);
		panel_4.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(292, 42, 129, 20);
		panel_4.add(textField_10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No", "Postponed"}));
		comboBox.setBounds(292, 76, 129, 22);
		panel_4.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox_1.setBounds(68, 77, 113, 22);
		panel_4.add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("Gender");
		lblNewLabel.setBounds(10, 71, 171, 16);
		panel_4.add(lblNewLabel);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(491, 66, 142, 20);
		panel_4.add(textField_22);
		
		JLabel lblWebsite = new JLabel("WebSite");
		lblWebsite.setBounds(433, 68, 75, 14);
		panel_4.add(lblWebsite);
		
		JLabel lblNewLabel_2 = new JLabel("Surname");
		lblNewLabel_2.setBounds(10, 43, 56, 16);
		panel_4.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(68, 41, 113, 20);
		panel_4.add(textField_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(491, 97, 169, 71);
		panel_4.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		tabbedPane.addTab("Work Experiences", null, layeredPane_1, null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 672, 181);
		layeredPane_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblITecrbesi = new JLabel("1. Experience");
		lblITecrbesi.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblITecrbesi.setBounds(0, 41, 93, 14);
		panel_3.add(lblITecrbesi);
		
		JLabel lblITecrbesi_1 = new JLabel("2. Experience");
		lblITecrbesi_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblITecrbesi_1.setBounds(226, 41, 93, 14);
		panel_3.add(lblITecrbesi_1);
		
		JLabel lblITecrbesi_2 = new JLabel("3. Experience");
		lblITecrbesi_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblITecrbesi_2.setBounds(457, 41, 93, 14);
		panel_3.add(lblITecrbesi_2);
		
		JLabel lblNewLabel_4 = new JLabel("Date");
		lblNewLabel_4.setBounds(0, 62, 56, 16);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Company Name");
		lblNewLabel_5.setBounds(0, 87, 111, 16);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(0, 112, 56, 16);
		panel_3.add(lblTitle);
		
		JLabel label = new JLabel("Title");
		label.setBounds(226, 113, 56, 16);
		panel_3.add(label);
		
		JLabel label_1 = new JLabel("Company Name");
		label_1.setBounds(226, 88, 111, 16);
		panel_3.add(label_1);
		
		JLabel label_2 = new JLabel("Date");
		label_2.setBounds(226, 63, 56, 16);
		panel_3.add(label_2);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(554, 110, 110, 20);
		panel_3.add(textField_15);
		
		JLabel label_9 = new JLabel("Title");
		label_9.setBounds(457, 108, 56, 16);
		panel_3.add(label_9);
		
		JLabel label_14 = new JLabel("Company Name");
		label_14.setBounds(457, 83, 111, 16);
		panel_3.add(label_14);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(554, 85, 110, 20);
		panel_3.add(textField_20);
		
		JLabel label_15 = new JLabel("Date");
		label_15.setBounds(457, 58, 56, 16);
		panel_3.add(label_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(554, 60, 56, 20);
		panel_3.add(textField_16);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(323, 62, 56, 20);
		panel_3.add(textField_4);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(323, 87, 110, 20);
		panel_3.add(textField_7);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(323, 112, 110, 20);
		panel_3.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(93, 58, 56, 20);
		panel_3.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(93, 83, 110, 20);
		panel_3.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(93, 108, 110, 20);
		panel_3.add(textField_14);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		tabbedPane.addTab("Education", null, layeredPane_2, null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 672, 181);
		layeredPane_2.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("High School");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(121, 37, 90, 14);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblnlisans = new JLabel("Under Graduate");
		lblnlisans.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblnlisans.setBounds(315, 37, 155, 14);
		panel_2.add(lblnlisans);
		
		JLabel lblniversite = new JLabel("University");
		lblniversite.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblniversite.setBounds(507, 37, 80, 14);
		panel_2.add(lblniversite);
		
		Label label_10 = new Label("Name");
		label_10.setBounds(5, 66, 62, 22);
		panel_2.add(label_10);
		
		Label label_11 = new Label(" Graduate Date");
		label_11.setBounds(0, 94, 109, 22);
		panel_2.add(label_11);
		
		Label label_12 = new Label("Department");
		label_12.setBounds(5, 122, 109, 22);
		panel_2.add(label_12);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(507, 63, 147, 20);
		panel_2.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(507, 124, 147, 20);
		panel_2.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(315, 96, 67, 20);
		panel_2.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(115, 94, 67, 20);
		panel_2.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(507, 96, 67, 20);
		panel_2.add(textField_31);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(115, 125, 147, 20);
		panel_2.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(115, 64, 147, 20);
		panel_2.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(315, 124, 147, 20);
		panel_2.add(textField_19);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(315, 63, 147, 20);
		panel_2.add(textField_21);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		tabbedPane.addTab("Skills", null, layeredPane_3, null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 672, 181);
		layeredPane_3.add(panel);
		panel.setLayout(null);
		
		Label label_13 = new Label("Foreign Languages");
		label_13.setFont(new Font("Dialog", Font.BOLD, 12));
		label_13.setBounds(279, 24, 123, 22);
		panel.add(label_13);
		
		Label label_19 = new Label("Hobies");
		label_19.setFont(new Font("Dialog", Font.BOLD, 12));
		label_19.setBounds(479, 24, 123, 22);
		panel.add(label_19);
		
		JLabel label_20 = new JLabel("Skills");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_20.setBounds(12, 24, 117, 22);
		panel.add(label_20);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(14, 52, 259, 108);
		panel.add(scrollPane_3);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_3.setViewportView(textArea_1);
		textArea_1.setLineWrap(true);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(279, 52, 194, 108);
		panel.add(scrollPane_2);
		
		JTextArea textArea_2 = new JTextArea();
		scrollPane_2.setViewportView(textArea_2);
		textArea_2.setLineWrap(true);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(479, 52, 181, 108);
		panel.add(scrollPane_1);
		
		JTextArea textArea_3 = new JTextArea();
		scrollPane_1.setViewportView(textArea_3);
		textArea_3.setLineWrap(true);
		
		mnNewMenu_1.setVisible(false);
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.setText("");
				textField_35.setText("");
				textField_36.setText("");
				textField_37.setText("");
				textField_1.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_27.setText("");
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_31.setText("");
			}
		});
		btnNewButton.setBounds(568, 334, 109, 21);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setVisible(false);
		JMenu mnNewMenu = new JMenu("Create HTML Page");
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.setVisible(false);
		mnNewMenu_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				tabbedPane.setVisible(true);
				btnNewButton.setVisible(true);
				mnNewMenu_1.setVisible(false);
				mnNewMenu_2.setVisible(true);
				mnNewMenu.setVisible(true);
			}
		});
		
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String asker=(String) comboBox.getSelectedItem();
				String gender =(String) comboBox_1.getSelectedItem();
				FileReader reader = null;
				try {
					reader = new FileReader("index.html");
				} catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				LineNumberReader lnreader = new LineNumberReader(reader);
				PrintWriter writer = null;
				try {
					writer = new PrintWriter("new.html","UTF-8");
				} catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} catch (UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String line = "";
				try {
					while ((line = lnreader.readLine()) != null) {
							 if(line.contains("isim")){writer.println(line.replace("isim",textField_1.getText()));}
					    else if(line.contains("Soy")){writer.println(line.replace("Soy",textField_2.getText()));}
						else if(line.contains("res1")){writer.println(line.replace("res1",textArea.getText()));}
						else if(line.contains("dp")){writer.println(line.replace("dp",textField_6.getText()));}
						else if(line.contains("dy")){writer.println(line.replace("dy",textField_10.getText()));}
						else if(line.contains("cinsiyet")){writer.println(line.replace("cinsiyet",gender));}
						else if(line.contains("military")){writer.println(line.replace("military",asker));}
						else if(line.contains("ml")){writer.println(line.replace("ml",textField_8.getText()));}
						else if(line.contains("dl")){writer.println(line.replace("dl",textField_9.getText()));}
						else if(line.contains("tel")){writer.println(line.replace("tel",textField_3.getText()));}
						else if(line.contains("email")){writer.println(line.replace("email",textField_5.getText()));}
						else if(line.contains("website")){writer.println(line.replace("website",textField_22.getText()));}
						else if(line.contains("extar1")){writer.println(line.replace("extar1",textField_12.getText()));}
						else if(line.contains("extar2")){writer.println(line.replace("extar2",textField_4.getText()));}
						else if(line.contains("extar3")){writer.println(line.replace("extar3",textField_16.getText()));}
						else if(line.contains("exgor1")){writer.println(line.replace("exgor1",textField_14.getText()));}
						else if(line.contains("exgor2")){writer.println(line.replace("exgor2",textField_11.getText()));}
						else if(line.contains("exgor3")){writer.println(line.replace("exgor3",textField_15.getText()));}
						else if(line.contains("exyer1")){writer.println(line.replace("exyer1",textField_13.getText()));}
						else if(line.contains("exyer2")){writer.println(line.replace("exyer2",textField_7.getText()));}
						else if(line.contains("exyer3")){writer.println(line.replace("exyer3",textField_20.getText()));}
						else if(line.contains("tarl")){writer.println(line.replace("tarl",textField_30.getText()));}
						else if(line.contains("taru")){writer.println(line.replace("taru",textField_29.getText()));}
						else if(line.contains("taryl")){writer.println(line.replace("taryl",textField_31.getText()));}
						else if(line.contains("lise")){writer.println(line.replace("lise",textField_18.getText()));}
						else if(line.contains("uni")){writer.println(line.replace("uni",textField_21.getText()));}
						else if(line.contains("uyl")){writer.println(line.replace("uyl",textField_27.getText()));}
						else if(line.contains("bolum1")){writer.println(line.replace("bolum1",textField_17.getText()));}
						else if(line.contains("bolum2")){writer.println(line.replace("bolum2",textField_19.getText()));}
						else if(line.contains("bolum3")){writer.println(line.replace("bolum3",textField_28.getText()));}
						else if(line.contains("skill1")){writer.println(line.replace("skill1",textArea_1.getText()));}
						else if(line.contains("lan1")){writer.println(line.replace("lan1",textArea_2.getText()));}
						else if(line.contains("hob1")){writer.println(line.replace("hob1",textArea_3.getText()));}
						else writer.println(line);
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				writer.close();
			 try {
				reader.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		        JOptionPane.showMessageDialog(null,  "HTML Page Created");
		        mnNewMenu_1.setVisible(true);		        
			}
		});
		menuBar.add(mnNewMenu);
	}
}
