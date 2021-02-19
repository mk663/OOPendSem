import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {
	
	double first;
	double second;
	double number;
	double result;
	String operation;
	String answer;

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 496, 589);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 480, 49);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Cambria", Font.PLAIN, 20));
		textField.setBounds(27, 51, 428, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton.getText();
				textField.setText(number);
			}
		});
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton.setBounds(173, 299, 63, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("6");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_1.setBounds(173, 359, 63, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_2.setBounds(173, 419, 63, 49);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_4.getText();
				textField.setText(number);
			}
		});
		btnNewButton_4.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_4.setBounds(246, 299, 63, 49);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_5.getText();
				textField.setText(number);
			}
		});
		btnNewButton_5.setBounds(246, 359, 63, 49);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("2");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_6.getText();
				textField.setText(number);
			}
		});
		btnNewButton_6.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_6.setBounds(246, 419, 63, 49);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("0");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_7.getText();
				textField.setText(number);
			}
		});
		btnNewButton_7.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_7.setBounds(173, 479, 136, 49);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("7");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_8.getText();
				textField.setText(number);
			}
		});
		btnNewButton_8.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_8.setBounds(319, 299, 63, 49);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("4");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_9.getText();
				textField.setText(number);
			}
		});
		btnNewButton_9.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_9.setBounds(319, 359, 63, 49);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("1");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_10.getText();
				textField.setText(number);
			}
		});
		btnNewButton_10.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_10.setBounds(319, 419, 63, 49);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton(".");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_11.getText();
				textField.setText(number);
			}
		});
		btnNewButton_11.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11.setBounds(319, 479, 63, 49);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_11_1 = new JButton("x");
		btnNewButton_11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnNewButton_11_1.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_1.setBounds(392, 299, 63, 49);
		frame.getContentPane().add(btnNewButton_11_1);
		
		JButton btnNewButton_11_2 = new JButton("-");
		btnNewButton_11_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length()==0) {
					String number=textField.getText()+btnNewButton_11_2.getText();
					textField.setText(number);
				}
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnNewButton_11_2.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_2.setBounds(392, 359, 63, 49);
		frame.getContentPane().add(btnNewButton_11_2);
		
		JButton btnNewButton_11_3 = new JButton("+");
		btnNewButton_11_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"+");
				operation="+";
			}
		});
		btnNewButton_11_3.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_3.setBounds(392, 419, 63, 49);
		frame.getContentPane().add(btnNewButton_11_3);
		
		JButton btnNewButton_11_4 = new JButton("=");
		btnNewButton_11_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if (operation=="+") {
					result=Double.parseDouble(textField.getText());
					answer=String.valueOf(result);
				    textField.setText(answer);
				}
				else if (operation=="-") {
					result=first-second;
					answer=String.valueOf(result);
				    textField.setText(answer);
				}
				else if (operation=="*") {
					result=first*second;
					answer=String.valueOf(result);
				    textField.setText(answer);
				}
				else if (operation=="/") {
					result=first/second;
					answer=String.valueOf(result);
				    textField.setText(answer);
				}
				else if (operation=="%") {
					result=first%second;
					answer=String.valueOf(result);
				    textField.setText(answer);
				}
				else if (operation=="x^y") {
					result=Math.pow(first,second);
					answer=String.valueOf(result);
				    textField.setText(answer);
				}
				else if (operation=="logxbasey") {
					result=Math.log(first)/Math.log(second);
					answer=String.valueOf(result);
				    textField.setText(answer);
				}  
				else if (operation=="sin") {
				    result=Math.sin(second*Math.PI/180);
				    answer=String.valueOf(result);
				    textField.setText(answer);
				}
				else if (operation=="cos") {
				    result=Math.cos(second*Math.PI/180);
				    answer=String.valueOf(result);
				    textField.setText(answer);
				}
				else if (operation=="tan") {
				    result=Math.tan(second*Math.PI/180);
				    answer=String.valueOf(result);
				    textField.setText(answer);
				}
				else if (operation=="sinh") {
				    result=Math.sinh(second*Math.PI/180);
				    answer=String.valueOf(result);
				    textField.setText(answer);
				}
				else if (operation=="cosh") {
				    result=Math.cosh(second*Math.PI/180);
				    answer=String.valueOf(result);
				    textField.setText(answer);
				}
				else if (operation=="tanh") {
				    result=Math.tanh(second*Math.PI/180);
				    answer=String.valueOf(result);
				    textField.setText(answer);
				}
				else {
					textField.setText("Operation not found!");
				}
			}
		});
		btnNewButton_11_4.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_4.setBounds(392, 479, 63, 49);
		frame.getContentPane().add(btnNewButton_11_4);
		
		JButton btnNewButton_11_5 = new JButton("/");
		btnNewButton_11_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnNewButton_11_5.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_5.setBounds(392, 239, 63, 49);
		frame.getContentPane().add(btnNewButton_11_5);
		
		JButton btnNewButton_11_6 = new JButton("\uF0E7");
		btnNewButton_11_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnNewButton_11_6.setFont(new Font("Wingdings", Font.PLAIN, 15));
		btnNewButton_11_6.setBounds(319, 239, 63, 49);
		frame.getContentPane().add(btnNewButton_11_6);
		
		JButton btnNewButton_11_7 = new JButton("C");
		btnNewButton_11_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_11_7.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_7.setBounds(246, 239, 63, 49);
		frame.getContentPane().add(btnNewButton_11_7);
		
		JButton btnNewButton_11_8 = new JButton("%");
		btnNewButton_11_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnNewButton_11_8.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_8.setBounds(173, 239, 63, 49);
		frame.getContentPane().add(btnNewButton_11_8);
		
		JButton btnNewButton_11_8_1 = new JButton("\u221A");
		btnNewButton_11_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				result=Math.sqrt(number);
				answer=String.valueOf(result);
				textField.setText(answer);
			}
		});
		btnNewButton_11_8_1.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_8_1.setBounds(100, 239, 63, 49);
		frame.getContentPane().add(btnNewButton_11_8_1);
		
		JButton btnNewButton_11_8_2 = new JButton("x\u00B2");
		btnNewButton_11_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				result=Math.pow(number,2);
				answer=String.valueOf(result);
				textField.setText(answer);
			}
		});
		btnNewButton_11_8_2.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_8_2.setBounds(100, 299, 63, 49);
		frame.getContentPane().add(btnNewButton_11_8_2);
		
		JButton btnNewButton_11_8_3 = new JButton("x\u00B3");
		btnNewButton_11_8_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				result=Math.pow(number,3);
				answer=String.valueOf(result);
				textField.setText(answer);
			}
		});
		btnNewButton_11_8_3.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_8_3.setBounds(100, 359, 63, 49);
		frame.getContentPane().add(btnNewButton_11_8_3);
		
		JButton btnNewButton_11_8_4 = new JButton("x\u02B8");
		btnNewButton_11_8_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="x^y";
			}
		});
		btnNewButton_11_8_4.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_8_4.setBounds(100, 419, 63, 49);
		frame.getContentPane().add(btnNewButton_11_8_4);
		
		JButton btnNewButton_11_8_5 = new JButton("x!");
		btnNewButton_11_8_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				double fact=1;
				for(double i=number; i>0; i--) {
					fact*=i;
				}
				answer=String.valueOf(fact);
				textField.setText(answer);
			}
		});
		btnNewButton_11_8_5.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_8_5.setBounds(100, 479, 63, 49);
		frame.getContentPane().add(btnNewButton_11_8_5);
		
		JButton btnNewButton_11_8_1_1 = new JButton("log\u2090x");
		btnNewButton_11_8_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="logxbasey";
			}
		});
		btnNewButton_11_8_1_1.setFont(new Font("Cambria", Font.PLAIN, 13));
		btnNewButton_11_8_1_1.setBounds(27, 359, 63, 49);
		frame.getContentPane().add(btnNewButton_11_8_1_1);
		
		JButton btnNewButton_11_8_1_2 = new JButton("2\u02e3");
		btnNewButton_11_8_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				result=Math.pow(2.0d,number);
				answer=String.valueOf(result);
				textField.setText(answer);
			}
		});
		btnNewButton_11_8_1_2.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_8_1_2.setBounds(27, 479, 63, 49);
		frame.getContentPane().add(btnNewButton_11_8_1_2);
		
		JButton btnNewButton_11_8_1_3 = new JButton("e\u02e3");
		btnNewButton_11_8_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				result=Math.exp(number);
				answer=String.valueOf(result);
				textField.setText(answer);
			}
		});
		btnNewButton_11_8_1_3.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_8_1_3.setBounds(27, 419, 63, 49);
		frame.getContentPane().add(btnNewButton_11_8_1_3);
		
		JButton btnNewButton_11_8_1_4 = new JButton("ln");
		btnNewButton_11_8_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				result=Math.log(number);
				answer=String.valueOf(result);
				textField.setText(answer);
			}
		});
		btnNewButton_11_8_1_4.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_8_1_4.setBounds(27, 239, 63, 49);
		frame.getContentPane().add(btnNewButton_11_8_1_4);
		
		JButton btnNewButton_11_8_1_5 = new JButton("log");
		btnNewButton_11_8_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				result=Math.log10(number);
				answer=String.valueOf(result);
				textField.setText(answer);
			}
		});
		btnNewButton_11_8_1_5.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton_11_8_1_5.setBounds(27, 299, 63, 49);
		frame.getContentPane().add(btnNewButton_11_8_1_5);
		
		JButton btnNewButton_11_8_1_1_1 = new JButton("rand");
		btnNewButton_11_8_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result=Math.random();
				answer=String.valueOf(result);
				textField.setText(answer);
			}
		});
		btnNewButton_11_8_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 15));
		btnNewButton_11_8_1_1_1.setBounds(173, 181, 63, 49);
		frame.getContentPane().add(btnNewButton_11_8_1_1_1);
		
		JButton btnNewButton_11_8_1_6 = new JButton("|x|");
		btnNewButton_11_8_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				result=Math.abs(number);
				answer=String.valueOf(result);
				textField.setText(answer);
			}
		});
		btnNewButton_11_8_1_6.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_8_1_6.setBounds(319, 180, 63, 49);
		frame.getContentPane().add(btnNewButton_11_8_1_6);
		
		JButton btnNewButton_11_8_6 = new JButton("\u03C0");
		btnNewButton_11_8_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    textField.setText(String.valueOf(Math.PI));
			}
		});
		btnNewButton_11_8_6.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_8_6.setBounds(246, 180, 63, 49);
		frame.getContentPane().add(btnNewButton_11_8_6);
		
		JButton btnNewButton_11_7_1 = new JButton("rad");
		btnNewButton_11_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					textField.setText("Radian");
			}
		});
		btnNewButton_11_7_1.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_7_1.setBounds(27, 180, 63, 49);
		frame.getContentPane().add(btnNewButton_11_7_1);
		
		JButton btnNewButton_11_6_1 = new JButton("deg");
		btnNewButton_11_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					textField.setText("Degree");
			}
		});
		btnNewButton_11_6_1.setFont(new Font("Cambria", Font.PLAIN, 19));
		btnNewButton_11_6_1.setBounds(100, 180, 63, 49);
		frame.getContentPane().add(btnNewButton_11_6_1);
		
		JButton btnNewButton_11_5_1 = new JButton("inv");
		btnNewButton_11_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				result=1/number;
				answer=String.valueOf(result);
				textField.setText(answer);
			}
		});
		btnNewButton_11_5_1.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_5_1.setBounds(392, 180, 63, 49);
		frame.getContentPane().add(btnNewButton_11_5_1);
		
		JButton btnNewButton_11_8_1_1_2 = new JButton("sin");
		btnNewButton_11_8_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("Degree")) {
					textField.setText("");
					operation="sin";
				}
				else {
					number=Double.parseDouble(textField.getText());
				    result=Math.sin(number);
				    answer=String.valueOf(result);
				    textField.setText(answer);
				}
			}
		});
		btnNewButton_11_8_1_1_2.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_8_1_1_2.setBounds(27, 120, 63, 49);
		frame.getContentPane().add(btnNewButton_11_8_1_1_2);
		
		JButton btnNewButton_11_8_1_7 = new JButton("cos");
		btnNewButton_11_8_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("Degree")) {
					textField.setText("");
					operation="cos";
				}
				else {
					number=Double.parseDouble(textField.getText());
				    result=Math.cos(number);
				    answer=String.valueOf(result);
				    textField.setText(answer);
				}
			}
		});
		btnNewButton_11_8_1_7.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_8_1_7.setBounds(100, 120, 63, 49);
		frame.getContentPane().add(btnNewButton_11_8_1_7);
		
		JButton btnNewButton_11_8_7 = new JButton("cosh");
		btnNewButton_11_8_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("Degree")) {
					textField.setText("");
					operation="cosh";
				}
				else {
					number=Double.parseDouble(textField.getText());
				    result=Math.cosh(number);
				    answer=String.valueOf(result);
				    textField.setText(answer);
				}
				
			}
		});
		btnNewButton_11_8_7.setFont(new Font("Cambria", Font.PLAIN, 15));
		btnNewButton_11_8_7.setBounds(319, 120, 63, 49);
		frame.getContentPane().add(btnNewButton_11_8_7);
		
		JButton btnNewButton_11_7_2 = new JButton("sinh");
		btnNewButton_11_7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("Degree")) {
					textField.setText("");
					operation="sinh";
				}
				else {
					number=Double.parseDouble(textField.getText());
				    result=Math.sinh(number);
				    answer=String.valueOf(result);
				    textField.setText(answer);
				}
			}
		});
		btnNewButton_11_7_2.setFont(new Font("Cambria", Font.PLAIN, 16));
		btnNewButton_11_7_2.setBounds(246, 120, 63, 49);
		frame.getContentPane().add(btnNewButton_11_7_2);
		
		JButton btnNewButton_11_6_2 = new JButton("tan");
		btnNewButton_11_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("Degree")) {
					textField.setText("");
					operation="tan";
				}
				else {
					number=Double.parseDouble(textField.getText());
				    result=Math.tan(number);
				    answer=String.valueOf(result);
				    textField.setText(answer);
				}
			}
		});
		btnNewButton_11_6_2.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_11_6_2.setBounds(173, 119, 63, 49);
		frame.getContentPane().add(btnNewButton_11_6_2);
		
		JButton btnNewButton_11_5_2 = new JButton("tanh");
		btnNewButton_11_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("Degree")) {
					textField.setText("");
					operation="tanh";
				}
				else {
					number=Double.parseDouble(textField.getText());
				    result=Math.tanh(number);
				    answer=String.valueOf(result);
				    textField.setText(answer);
				}
			}
		});
		btnNewButton_11_5_2.setFont(new Font("Cambria", Font.PLAIN, 15));
		btnNewButton_11_5_2.setBounds(392, 120, 63, 49);
		frame.getContentPane().add(btnNewButton_11_5_2);
	}
}
