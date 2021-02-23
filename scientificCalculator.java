import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class scientificCalculator extends trigonometry{
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scientificCalculator window = new scientificCalculator();
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
	public scientificCalculator() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Scientific Calculator");
		frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 14));
		frame.setBounds(100, 100, 560, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		textField.setBounds(22, 25, 501, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNumber(btnNewButton_9);
			}
		});
		btnNewButton_9.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_9.setBounds(241, 267, 63, 49);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNumber(btnNewButton_8);
			}
		});
		btnNewButton_8.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_8.setBounds(314, 267, 63, 49);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNumber(btnNewButton_7);
			}
		});
		btnNewButton_7.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_7.setBounds(387, 267, 63, 49);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNumber(btnNewButton_6);
			}
		});
		btnNewButton_6.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_6.setBounds(241, 327, 63, 49);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNumber(btnNewButton_5);
			}
		});
		btnNewButton_5.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_5.setBounds(314, 327, 63, 49);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNumber(btnNewButton_4);
			}
		});
		btnNewButton_4.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_4.setBounds(387, 327, 63, 49);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNumber(btnNewButton_3);
			}
		});
		btnNewButton_3.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_3.setBounds(241, 387, 63, 49);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNumber(btnNewButton_2);
			}
		});
		btnNewButton_2.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_2.setBounds(314, 387, 63, 49);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNumber(btnNewButton_1);
			}
		});
		btnNewButton_1.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_1.setBounds(387, 387, 63, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNumber(btnNewButton);
			}
		});
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton.setBounds(241, 447, 136, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_10 = new JButton(".");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNumber(btnNewButton_10);
			}
		});
		btnNewButton_10.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_10.setBounds(387, 447, 63, 49);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_a3 = new JButton("x");
		btnNewButton_a3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=btnNewButton_a3;
			}
		});
		btnNewButton_a3.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_a3.setBounds(460, 267, 63, 49);
		frame.getContentPane().add(btnNewButton_a3);
		
		JButton btnNewButton_a2 = new JButton("-");
		btnNewButton_a2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=btnNewButton_a2;
			}
		});
		btnNewButton_a2.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_a2.setBounds(460, 327, 63, 49);
		frame.getContentPane().add(btnNewButton_a2);
		
		JButton btnNewButton_a1 = new JButton("+");
		btnNewButton_a1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=btnNewButton_a1;
			}
		});
		btnNewButton_a1.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_a1.setBounds(460, 387, 63, 49);
		frame.getContentPane().add(btnNewButton_a1);
		
		JButton btnNewButton_eq = new JButton("=");
		btnNewButton_eq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (op==null) {
					textField.setText(String.valueOf(result));
				}
				else {
					secondNum=getNum();
				    doOperation(op);
				}    
			}
		});
		btnNewButton_eq.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_eq.setBounds(460, 447, 63, 49);
		frame.getContentPane().add(btnNewButton_eq);
		
		JButton btnNewButton_a4 = new JButton("/");
		btnNewButton_a4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=btnNewButton_a4;
			}
		});
		btnNewButton_a4.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_a4.setBounds(460, 207, 63, 49);
		frame.getContentPane().add(btnNewButton_a4);
		
		JButton btnNewButton_e1 = new JButton("\uF0E7");
		btnNewButton_e1.addActionListener(new ActionListener() {
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
		btnNewButton_e1.setFont(new Font("Wingdings", Font.PLAIN, 15));
		btnNewButton_e1.setBounds(387, 207, 63, 49);
		frame.getContentPane().add(btnNewButton_e1);
		
		JButton btnNewButton_e2 = new JButton("C");
		btnNewButton_e2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_e2.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_e2.setBounds(314, 207, 63, 49);
		frame.getContentPane().add(btnNewButton_e2);
		
		JButton btnNewButton_a5 = new JButton("%");
		btnNewButton_a5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=btnNewButton_a5;
			}
		});
		btnNewButton_a5.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_a5.setBounds(241, 207, 63, 49);
		frame.getContentPane().add(btnNewButton_a5);
		
		JButton btnNewButton_l4 = new JButton("ln");
		btnNewButton_l4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("ln");
			}
		});
		btnNewButton_l4.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_l4.setBounds(95, 146, 63, 49);
		frame.getContentPane().add(btnNewButton_l4);
		
		JButton btnNewButton_p6 = new JButton("\u221A");
		btnNewButton_p6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("sqrt");
			}
		});
		btnNewButton_p6.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_p6.setBounds(168, 207, 63, 49);
		frame.getContentPane().add(btnNewButton_p6);
		
		JButton btnNewButton_l3 = new JButton("log");
		btnNewButton_l3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("log");
			}
		});
		btnNewButton_l3.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton_l3.setBounds(95, 207, 63, 49);
		frame.getContentPane().add(btnNewButton_l3);
		
		JButton btnNewButton_p5 = new JButton("x\u00B2");
		btnNewButton_p5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("x^2");
			}
		});
		btnNewButton_p5.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_p5.setBounds(168, 267, 63, 49);
		frame.getContentPane().add(btnNewButton_p5);
		
		JButton btnNewButton_l2 = new JButton("log\u2090x");
		btnNewButton_l2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=btnNewButton_l2;
			}
		});
		btnNewButton_l2.setFont(new Font("Cambria", Font.PLAIN, 13));
		btnNewButton_l2.setBounds(95, 267, 63, 49);
		frame.getContentPane().add(btnNewButton_l2);
		
		JButton btnNewButton_p4 = new JButton("x\u00B3");
		btnNewButton_p4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("x^3");
			}
		});
		btnNewButton_p4.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_p4.setBounds(168, 327, 63, 49);
		frame.getContentPane().add(btnNewButton_p4);
		
		JButton btnNewButton_l1 = new JButton("e\u02E3");
		btnNewButton_l1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("exp");
			}
		});
		btnNewButton_l1.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_l1.setBounds(95, 327, 63, 49);
		frame.getContentPane().add(btnNewButton_l1);
		
		JButton btnNewButton_p2 = new JButton("x\u02B8");
		btnNewButton_p2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=btnNewButton_p2;
			}
		});
		btnNewButton_p2.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_p2.setBounds(168, 387, 63, 49);
		frame.getContentPane().add(btnNewButton_p2);
		
		JButton btnNewButton_p9 = new JButton("2\u02E3");
		btnNewButton_p9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("2^x");
			}
		});
		btnNewButton_p9.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_p9.setBounds(95, 447, 63, 49);
		frame.getContentPane().add(btnNewButton_p9);
		
		JButton btnNewButton_p1 = new JButton("x!");
		btnNewButton_p1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("xfact");
			}
		});
		btnNewButton_p1.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_p1.setBounds(168, 447, 63, 49);
		frame.getContentPane().add(btnNewButton_p1);
		
		JButton btnNewButton_c3 = new JButton("rand");
		btnNewButton_c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doOperation("random");
			}
		});
		btnNewButton_c3.setFont(new Font("Cambria", Font.PLAIN, 15));
		btnNewButton_c3.setBounds(314, 87, 63, 49);
		frame.getContentPane().add(btnNewButton_c3);
		
		JButton btnNewButton_c1 = new JButton("\u03C0");
		btnNewButton_c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(String.valueOf(pi));
			}
		});
		btnNewButton_c1.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_c1.setBounds(460, 86, 63, 49);
		frame.getContentPane().add(btnNewButton_c1);
		
		JButton btnNewButton_p8 = new JButton("|x|");
		btnNewButton_p8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("mod");
			}
		});
		btnNewButton_p8.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_p8.setBounds(387, 146, 63, 49);
		frame.getContentPane().add(btnNewButton_p8);
		
		JButton btnNewButton_a6 = new JButton("inv");
		btnNewButton_a6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("inverse");
			}
		});
		btnNewButton_a6.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_a6.setBounds(460, 146, 63, 49);
		frame.getContentPane().add(btnNewButton_a6);
		
		JButton btnNewButton_c2 = new JButton("e");
		btnNewButton_c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(String.valueOf(exponent));
			}
		});
		btnNewButton_c2.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_c2.setBounds(387, 86, 63, 49);
		frame.getContentPane().add(btnNewButton_c2);
		
		JButton btnNewButton_p10 = new JButton("10\u02E3");
		btnNewButton_p10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("10^x");
			}
		});
		btnNewButton_p10.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_p10.setBounds(95, 387, 63, 49);
		frame.getContentPane().add(btnNewButton_p10);
		
		JButton btnNewButton_a8 = new JButton(")");
		btnNewButton_a8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i>=0) {
					if (i==previousNum.size()) {}
					else {
						firstNum=Double.parseDouble(previousNum.get(i));
						secondNum=getNum();
						doOperation(opNow.get(i));
					}
					i-=1;
				}
				else {
					previousNum.clear();
					opNow.clear();
				}
			}
		});
		btnNewButton_a8.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_a8.setBounds(314, 146, 63, 49);
		frame.getContentPane().add(btnNewButton_a8);
		
		JButton btnNewButton_a7 = new JButton("(");
		btnNewButton_a7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(op==null) 
					opNow.add(btnNewButton_a1);
				else 
					opNow.add(op);
				previousNum.add(String.valueOf(firstNum));
				i=previousNum.size();
			}
		});
		btnNewButton_a7.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_a7.setBounds(241, 146, 63, 49);
		frame.getContentPane().add(btnNewButton_a7);
		
		JButton btnNewButton_t7 = new JButton("rad");
		btnNewButton_t7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				angle="radian";
			}
		});
		btnNewButton_t7.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_t7.setBounds(22, 146, 63, 49);
		frame.getContentPane().add(btnNewButton_t7);
		
		JButton btnNewButton_t6 = new JButton("deg");
		btnNewButton_t6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				angle="degree";
			}
		});
		btnNewButton_t6.setFont(new Font("Cambria", Font.PLAIN, 19));
		btnNewButton_t6.setBounds(22, 207, 63, 49);
		frame.getContentPane().add(btnNewButton_t6);
		
		JButton btnNewButton_t3 = new JButton("sin");
		btnNewButton_t3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				if (angle.equals("degree")) {
					if (type.equals("hyperbole"))
						doOperation("sindh");
					else
						doOperation("sind");
				}
				else {
					if (type.equals("hyperbole")) 
						doOperation("sinh");
					else
						doOperation("sin");
				}
				angle="radian";
				type="";
			}
		});
		btnNewButton_t3.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_t3.setBounds(22, 327, 63, 49);
		frame.getContentPane().add(btnNewButton_t3);
		
		JButton btnNewButton_t2 = new JButton("cos");
		btnNewButton_t2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				if (angle.equals("degree")) {
					if (type.equals("hyperbole")) {
						doOperation("cosdh");
					}
					else
						doOperation("cosd");
				}
				else {
					if (type.equals("hyperbole")) {
						doOperation("cosh");
					}
					else
						doOperation("cos");
				}	
				angle="radian";
				type="";
			}
		});
		btnNewButton_t2.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_t2.setBounds(22, 387, 63, 49);
		frame.getContentPane().add(btnNewButton_t2);
		
		JButton btnNewButton_t1 = new JButton("tan");
		btnNewButton_t1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				if (angle.equals("degree")) {
					if (type.equals("hyperbole")) {
						doOperation("tandh");
					}
					else
						doOperation("tand");
				}
				else {
					if (type.equals("hyperbole")) {
						doOperation("tanh");
					}
					else
						doOperation("tan");
				}	
				angle="radian";
				type="";
			}
		});
		btnNewButton_t1.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_t1.setBounds(22, 447, 63, 49);
		frame.getContentPane().add(btnNewButton_t1);
		
		JButton btnNewButton_t5 = new JButton("hyp");
		btnNewButton_t5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type="hyperbole";
			}
		});
		btnNewButton_t5.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton_t5.setBounds(22, 267, 63, 49);
		frame.getContentPane().add(btnNewButton_t5);
		
		JButton btnNewButton_p7 = new JButton("[x]");
		btnNewButton_p7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("floor");
			}
		});
		btnNewButton_p7.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton_p7.setBounds(168, 146, 63, 49);
		frame.getContentPane().add(btnNewButton_p7);
		
		JButton btnNewButton_m3 = new JButton("MR");
		btnNewButton_m3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(String.valueOf(memory));
			}
		});
		btnNewButton_m3.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton_m3.setBounds(95, 87, 63, 49);
		frame.getContentPane().add(btnNewButton_m3);
		
		JButton btnNewButton_m2 = new JButton("M+");
		btnNewButton_m2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(textField.getText());
				memory+=firstNum;
			}
		});
		btnNewButton_m2.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton_m2.setBounds(168, 86, 63, 49);
		frame.getContentPane().add(btnNewButton_m2);
		
		JButton btnNewButton_m1 = new JButton("M-");
		btnNewButton_m1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(textField.getText());
				memory-=firstNum;
			}
		});
		btnNewButton_m1.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton_m1.setBounds(241, 86, 63, 49);
		frame.getContentPane().add(btnNewButton_m1);
		
		JButton btnNewButton_m4 = new JButton("MC");
		btnNewButton_m4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memory=0;
				textField.setText(null);
			}
		});
		btnNewButton_m4.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton_m4.setBounds(22, 86, 63, 49);
		frame.getContentPane().add(btnNewButton_m4);
	}
}
