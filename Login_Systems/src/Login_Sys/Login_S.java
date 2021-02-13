package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Travelling_Ticket.Travelling;
import swing.trial.selfy;

import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Login_S {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	protected JFrame frmLoginSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_S window = new Login_S();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_S() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(200, 200, 500, 300);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JLabel lblLoginSystem = new JLabel("Login System");
		lblLoginSystem.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblLoginSystem.setBounds(135, 0, 248, 52);
		getFrame().getContentPane().add(lblLoginSystem);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUsername.setBounds(10, 58, 135, 32);
		getFrame().getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPassword.setBounds(10, 110, 135, 32);
		getFrame().getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUsername.setBounds(205, 62, 178, 25);
		getFrame().getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPassword.setBounds(204, 114, 179, 25);
		getFrame().getContentPane().add(txtPassword);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 152, 466, 2);
		getFrame().getContentPane().add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 50, 466, 2);
		getFrame().getContentPane().add(separator);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = txtPassword.getText();
				String username = txtUsername.getText();
				try{
					 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo1", "root", "Root");
					 String query = "Select user_name , password from account where user_name='"+txtPassword.getText()+"'";

	                    Statement sta = connection.createStatement();
	                   ResultSet set= sta.executeQuery(query);
	                   if(set.next())
	                    {
	                	   getFrame().dispose();
						JOptionPane.showMessageDialog(null, "Login successfully");
						Travelling window = new Travelling();
						Travelling.main(null);
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Invalid Credentials");
						
					}
				}
				catch(Exception o) {
					JOptionPane.showMessageDialog(null, o);
				}
			
			}
		});
		btnLogin.setToolTipText("Click to Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setBounds(41, 179, 85, 21);
		getFrame().getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setToolTipText("Reset Data");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBounds(189, 179, 85, 21);
		getFrame().getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                frmLoginSystem = new JFrame("Exit");
                if (JOptionPane.showConfirmDialog(frmLoginSystem, "Confirm if you want to exit", "Login Systems",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setToolTipText("Click To Exit");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(344, 179, 85, 21);
		getFrame().getContentPane().add(btnExit);
		
		JButton btnNewButton = new JButton("Signup");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFrame().dispose();
				try {
                    selfy frame = new selfy();                 
                    frame.setVisible(true);
                    
                    
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(170, 220, 120, 21);
		getFrame().getContentPane().add(btnNewButton);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
