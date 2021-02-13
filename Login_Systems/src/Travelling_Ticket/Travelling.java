package Travelling_Ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DropMode;


public class Travelling {

	private JFrame frame;
	private JTextField txtTax;
	private JTextField txtSubTotal;
	private JTextField txtTotal;
	private JTextField txtClass;
	private JTextField txtTicket;
	private JTextField txtAdult;
	private JTextField txtChild;
	private JTextField txtFrom;
	private JTextField txtTo;
	private JTextField txtDate;
	private JTextField txtTime;
	private JTextField txtTicketNo;
	private JTextField txtPrice;
	private JTextField txtRoute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travelling window = new Travelling();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Travelling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1370, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(261, 35, 689, 71);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Travelling Ticketing System");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("  ");
		panel.add(lblNewLabel);
		
		JLabel lblTicketClass = new JLabel("Ticket Type");
		lblTicketClass.setBounds(65, 116, 128, 35);
		lblTicketClass.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblTicketClass);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setBounds(62, 168, 131, 21);
		rdbtnStandard.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setBounds(62, 202, 131, 21);
		rdbtnEconomy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(rdbtnEconomy);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setBounds(62, 236, 131, 21);
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnReturnTicket = new JRadioButton("Return Ticket");
		rdbtnReturnTicket.setBounds(245, 202, 162, 21);
		rdbtnReturnTicket.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(rdbtnReturnTicket);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setBounds(243, 168, 146, 21);
		rdbtnSingleTicket.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(rdbtnSingleTicket);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setBounds(457, 170, 128, 21);
		rdbtnAdult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnAdult.setForeground(Color.BLACK);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setBounds(457, 204, 103, 21);
		rdbtnChild.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox cmbDestination = new JComboBox();
		cmbDestination.setBounds(244, 238, 228, 35);
		cmbDestination.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Ahmedabad", "Gandhinagar", "Dehradun", "Patna"}));
		cmbDestination.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(cmbDestination);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(65, 283, 461, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(65, 324, 96, 25);
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblTax);
		
		JLabel lblSubTotal = new JLabel("SubTotal");
		lblSubTotal.setBounds(65, 369, 118, 18);
		lblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(65, 420, 128, 18);
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblTotal);
		
		txtTax = new JTextField();
		txtTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTax.setBounds(223, 323, 110, 35);
		frame.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSubTotal.setBounds(223, 368, 110, 33);
		frame.getContentPane().add(txtSubTotal);
		txtSubTotal.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTotal.setBounds(223, 419, 110, 33);
		frame.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(65, 486, 466, 2);
		frame.getContentPane().add(separator);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				double tax = 19.50;
				double MilesK8 = 25.78;
				double MilesK12 = 25.10;
				double MilesK20 = 45.23;
				double MilesK30 = 55.98;
				double totalCost, eco = 3.85, fclass = 5.60;
				if ((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Patna"))
				{
					totalCost = (tax * MilesK8)/100;
					String sTax = String.format("Rs%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("Rs%.2f", MilesK8);
					txtSubTotal.setText(subTotal);
					String Total = String.format("Rs%.2f", MilesK8 + totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
                }  
				if ((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Ahmedabad"))
				{
					totalCost = (tax * MilesK8)/100;
					String sTax = String.format("Rs%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("Rs%.2f", MilesK8);
					txtSubTotal.setText(subTotal);
					String Total = String.format("Rs%.2f", MilesK8 + totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
                }  
				if ((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Dehradun"))
				{
					totalCost = (tax * MilesK8)/100;
					String sTax = String.format("Rs%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("Rs%.2f", MilesK8);
					txtSubTotal.setText(subTotal);
					String Total = String.format("Rs%.2f", MilesK8 + totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
                }
				if ((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Gandhinagar"))
				{
					totalCost = (tax * MilesK8)/100;
					String sTax = String.format("Rs%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("Rs%.2f", MilesK8);
					txtSubTotal.setText(subTotal);
					String Total = String.format("Rs%.2f", MilesK8 + totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
                }  
			}
		});
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Time
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				txtTime.setText(tTime.format(timer.getTime()));
				// Date
				SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
				txtDate.setText(Tdate.format(timer.getTime()));
				txtFrom.setText("Patna *");
				txtTo.setText((String) cmbDestination.getSelectedItem()+" *");
				// Random number generator
				int num1;
				String q1 ="";
				num1 = 1325 + (int) (Math.random()*4238);
				q1 += num1 + 1325;
				txtTicketNo.setText(q1);
				//=====
				txtRoute.setText("ANY");
			}
		});
		btnTotal.setToolTipText("Total cost of Ticket");
		btnTotal.setBounds(65, 537, 103, 33);
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setToolTipText("Reset System");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				rdbtnAdult.setSelected(false);
				rdbtnChild.setSelected(false);
				rdbtnStandard.setSelected(false);
				rdbtnEconomy.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				rdbtnReturnTicket.setSelected(false);
				rdbtnSingleTicket.setSelected(false);
				cmbDestination.setSelectedItem("Destination");
				txtTo.setText(null);
				txtFrom.setText(null);
				txtDate.setText(null);
				txtTime.setText(null);
				txtPrice.setText(null);
				txtRoute.setText(null);
				txtChild.setText(null);
				txtClass.setText(null);
				txtTicketNo.setText(null);
				txtTicket.setText(null);
				txtAdult.setText(null);
			}
		});
		btnReset.setBounds(243, 537, 103, 33);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setToolTipText("Exit Page");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Ticketing Systems",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(414, 537, 103, 33);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(585, 132, 12, 417);
		frame.getContentPane().add(separator_2);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblClass.setBounds(607, 116, 131, 35);
		frame.getContentPane().add(lblClass);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTicket.setBounds(797, 116, 131, 35);
		frame.getContentPane().add(lblTicket);
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAdult.setBounds(973, 116, 131, 35);
		frame.getContentPane().add(lblAdult);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblChild.setBounds(1148, 116, 131, 35);
		frame.getContentPane().add(lblChild);
		
		txtClass = new JTextField();
		txtClass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtClass.setColumns(10);
		txtClass.setBounds(607, 168, 110, 35);
		frame.getContentPane().add(txtClass);
		
		txtTicket = new JTextField();
		txtTicket.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTicket.setColumns(10);
		txtTicket.setBounds(797, 168, 110, 35);
		frame.getContentPane().add(txtTicket);
		
		txtAdult = new JTextField();
		txtAdult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAdult.setColumns(10);
		txtAdult.setBounds(973, 168, 110, 35);
		frame.getContentPane().add(txtAdult);
		
		txtChild = new JTextField();
		txtChild.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtChild.setColumns(10);
		txtChild.setBounds(1148, 168, 110, 35);
		frame.getContentPane().add(txtChild);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(607, 221, 657, 4);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(607, 147, 657, 2);
		frame.getContentPane().add(separator_4);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFrom.setBounds(607, 253, 131, 35);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTo.setBounds(607, 319, 131, 35);
		frame.getContentPane().add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDate.setBounds(607, 388, 131, 35);
		frame.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTime.setBounds(607, 453, 131, 35);
		frame.getContentPane().add(lblTime);
		
		txtFrom = new JTextField();
		txtFrom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtFrom.setColumns(10);
		txtFrom.setBounds(788, 250, 162, 35);
		frame.getContentPane().add(txtFrom);
		
		txtTo = new JTextField();
		txtTo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTo.setColumns(10);
		txtTo.setBounds(788, 314, 162, 35);
		frame.getContentPane().add(txtTo);
		
		txtDate = new JTextField();
		txtDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDate.setColumns(10);
		txtDate.setBounds(788, 388, 162, 35);
		frame.getContentPane().add(txtDate);
		
		txtTime = new JTextField();
		txtTime.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTime.setColumns(10);
		txtTime.setBounds(788, 453, 160, 35);
		frame.getContentPane().add(txtTime);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(958, 224, 12, 325);
		frame.getContentPane().add(separator_5);
		
		JLabel lblTicketNo = new JLabel("Ticket no");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTicketNo.setBounds(980, 253, 131, 35);
		frame.getContentPane().add(lblTicketNo);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrice.setBounds(980, 319, 131, 35);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRoute.setBounds(980, 382, 131, 35);
		frame.getContentPane().add(lblRoute);
		
		txtTicketNo = new JTextField();
		txtTicketNo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTicketNo.setColumns(10);
		txtTicketNo.setBounds(980, 283, 110, 35);
		frame.getContentPane().add(txtTicketNo);
		
		txtPrice = new JTextField();
		txtPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPrice.setColumns(10);
		txtPrice.setBounds(980, 352, 110, 35);
		frame.getContentPane().add(txtPrice);
		
		txtRoute = new JTextField();
		txtRoute.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtRoute.setColumns(10);
		txtRoute.setBounds(980, 412, 110, 35);
		frame.getContentPane().add(txtRoute);
		
		JComboBox cmbFrom = new JComboBox();
		cmbFrom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cmbFrom.setBounds(254, 292, 218, 21);
		frame.getContentPane().add(cmbFrom);
		cmbFrom.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Ahmedabad", "Gandhinagar", "Dehradun", "Patna"}));
	}
}
