import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class scientificCalculator extends trigonometry{
	
	private JFrame frame;
	ArrayList<String> previousNum = new ArrayList<String>();
	ArrayList<JButton> opNow = new ArrayList<JButton>(); 
	protected double memory;
	static int i;
	
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
		super();
		memory=0;
		i=-1;
		initialize();
	}
    
	
	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		
		frame = new JFrame();
		frame.setTitle("Scientific Calculator");
		frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 14));
		frame.setBounds(100, 100, 560, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		textField.setBounds(22, 25, 501, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_9 = new JButton("9");
		JButton btnNewButton_8 = new JButton("8");
		JButton btnNewButton_7 = new JButton("7");
		JButton btnNewButton_6 = new JButton("6");
		JButton btnNewButton_5 = new JButton("5");
		JButton btnNewButton_4 = new JButton("4");
		JButton btnNewButton_3 = new JButton("3");
		JButton btnNewButton_2 = new JButton("2");
		JButton btnNewButton_1 = new JButton("1");
		JButton btnNewButton = new JButton("0");
		JButton btnNewButton_10 = new JButton(".");
		JButton btnNewButton_a5 = new JButton("%");
		JButton btnNewButton_a4 = new JButton("/");
		JButton btnNewButton_a3 = new JButton("x");
		JButton btnNewButton_a2 = new JButton("-");
		JButton btnNewButton_a1 = new JButton("+");
		JButton btnNewButton_eq = new JButton("=");
		JButton btnNewButton_e1 = new JButton("\uF0E7");  //backspace
		JButton btnNewButton_e2 = new JButton("C");
		JButton btnNewButton_l4 = new JButton("ln");
		JButton btnNewButton_p6 = new JButton("\u221A");       //square root
		JButton btnNewButton_l3 = new JButton("log");
		JButton btnNewButton_p5 = new JButton("x\u00B2");      //x square
		JButton btnNewButton_p4 = new JButton("x\u00B3");      //x cube
		JButton btnNewButton_p2 = new JButton("x\u02B8");      //x^y
		JButton btnNewButton_p9 = new JButton("2\u02E3");      //2^x
		JButton btnNewButton_p1 = new JButton("x!");
		JButton btnNewButton_l2 = new JButton("log\u2090x");   //log x base y
		JButton btnNewButton_l1 = new JButton("e\u02E3");      // e^x
		JButton btnNewButton_c3 = new JButton("rand");
		JButton btnNewButton_c1 = new JButton("\u03C0");       //pi
		JButton btnNewButton_p8 = new JButton("|x|");
		JButton btnNewButton_a6 = new JButton("x\u207B\u00B9");     //x^-1
		JButton btnNewButton_c2 = new JButton("e");
		JButton btnNewButton_p10 = new JButton("10\u02E3");    //10^x
		JButton btnNewButton_a8 = new JButton(")");
		JButton btnNewButton_a7 = new JButton("(");
		JButton btnNewButton_t7 = new JButton("rad");
		JButton btnNewButton_t6 = new JButton("deg");
		JButton btnNewButton_t3 = new JButton("sin");
		JButton btnNewButton_t2 = new JButton("cos");
		JButton btnNewButton_t1 = new JButton("tan");
		JButton btnNewButton_t5 = new JButton("hyp");
		JButton btnNewButton_t8 = new JButton("inv");
		JButton btnNewButton_p7 = new JButton("[x]");
		JButton btnNewButton_m3 = new JButton("MR");
		JButton btnNewButton_m2 = new JButton("M+");
		JButton btnNewButton_m1 = new JButton("M-");
		JButton btnNewButton_m4 = new JButton("MC");
		
		btnNewButton_9.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_8.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_7.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_6.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_5.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_4.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_3.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_2.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_1.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_10.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_a3.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_a2.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_a1.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_eq.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_a4.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_e1.setFont(new Font("Wingdings", Font.PLAIN, 15));
		btnNewButton_e2.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_a5.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_l4.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_p6.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_l3.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton_p5.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_l2.setFont(new Font("Cambria", Font.PLAIN, 13));
		btnNewButton_p4.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_l1.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_p1.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_p2.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_p9.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_c3.setFont(new Font("Cambria", Font.PLAIN, 15));
		btnNewButton_c1.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_p8.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_a6.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_c2.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_p10.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_a8.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_a7.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_t7.setFont(new Font("Cambria", Font.BOLD, 18));
		btnNewButton_t6.setFont(new Font("Cambria", Font.PLAIN, 19));
		btnNewButton_t3.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_t2.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_t1.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNewButton_t5.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton_t8.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton_p7.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton_m3.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton_m2.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton_m1.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton_m4.setFont(new Font("Cambria", Font.PLAIN, 18));
		
		btnNewButton_9.setBounds(241, 267, 63, 49);
		btnNewButton_8.setBounds(314, 267, 63, 49);
		btnNewButton_7.setBounds(387, 267, 63, 49);
		btnNewButton_6.setBounds(241, 327, 63, 49);
		btnNewButton_5.setBounds(314, 327, 63, 49);
		btnNewButton_4.setBounds(387, 327, 63, 49);
		btnNewButton_3.setBounds(241, 387, 63, 49);
		btnNewButton_2.setBounds(314, 387, 63, 49);
		btnNewButton_10.setBounds(387, 447, 63, 49);
		btnNewButton_1.setBounds(387, 387, 63, 49);
		btnNewButton.setBounds(314, 447, 63, 49);
		btnNewButton_a3.setBounds(460, 267, 63, 49);
		btnNewButton_a2.setBounds(460, 327, 63, 49);
		btnNewButton_a1.setBounds(460, 387, 63, 49);
		btnNewButton_eq.setBounds(460, 447, 63, 49); 
		btnNewButton_a4.setBounds(460, 207, 63, 49);
		btnNewButton_e1.setBounds(387, 207, 63, 49);
		btnNewButton_e2.setBounds(314, 207, 63, 49);
		btnNewButton_a5.setBounds(241, 207, 63, 49);
		btnNewButton_l4.setBounds(95, 146, 63, 49);
		btnNewButton_p6.setBounds(168, 207, 63, 49);
		btnNewButton_l3.setBounds(95, 207, 63, 49);
		btnNewButton_p5.setBounds(168, 267, 63, 49);
		btnNewButton_l2.setBounds(95, 267, 63, 49);
		btnNewButton_p4.setBounds(168, 327, 63, 49);
		btnNewButton_l1.setBounds(95, 327, 63, 49);
		btnNewButton_p1.setBounds(168, 447, 63, 49);
		btnNewButton_p2.setBounds(168, 387, 63, 49);
		btnNewButton_p9.setBounds(95, 447, 63, 49);
		btnNewButton_c3.setBounds(387, 147, 63, 49);
		btnNewButton_c1.setBounds(460, 86, 63, 49);
		btnNewButton_p8.setBounds(241, 447, 63, 49);
		btnNewButton_a6.setBounds(460, 146, 63, 49);
		btnNewButton_c2.setBounds(387, 86, 63, 49);
		btnNewButton_p10.setBounds(95, 387, 63, 49);
		btnNewButton_a8.setBounds(314, 146, 63, 49);
		btnNewButton_a7.setBounds(241, 146, 63, 49);
		btnNewButton_t7.setBounds(22, 86, 63, 49);
		btnNewButton_t6.setBounds(22, 146, 63, 49);
		btnNewButton_t3.setBounds(22, 327, 63, 49);
		btnNewButton_t2.setBounds(22, 387, 63, 49);
		btnNewButton_t1.setBounds(22, 447, 63, 49);
		btnNewButton_t5.setBounds(22, 207, 63, 49);
		btnNewButton_t8.setBounds(22, 267, 63, 49);
		btnNewButton_p7.setBounds(168, 146, 63, 49);
		btnNewButton_m3.setBounds(168, 87, 63, 49);
		btnNewButton_m2.setBounds(241, 86, 63, 49);
		btnNewButton_m1.setBounds(314, 86, 63, 49);
		btnNewButton_m4.setBounds(95, 86, 63, 49);
		
		frame.getContentPane().add(btnNewButton_9);
		frame.getContentPane().add(btnNewButton_8);
		frame.getContentPane().add(btnNewButton_7);	
		frame.getContentPane().add(btnNewButton_6);
		frame.getContentPane().add(btnNewButton_5);
		frame.getContentPane().add(btnNewButton_4);
		frame.getContentPane().add(btnNewButton_3);
		frame.getContentPane().add(btnNewButton_2);
		frame.getContentPane().add(btnNewButton_10);
		frame.getContentPane().add(btnNewButton_1);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(btnNewButton_a3);
		frame.getContentPane().add(btnNewButton_a2);
		frame.getContentPane().add(btnNewButton_a1);
		frame.getContentPane().add(btnNewButton_eq);
		frame.getContentPane().add(btnNewButton_a4);
		frame.getContentPane().add(btnNewButton_e1);
		frame.getContentPane().add(btnNewButton_e2);
		frame.getContentPane().add(btnNewButton_a5);
		frame.getContentPane().add(btnNewButton_l4);
		frame.getContentPane().add(btnNewButton_p6);
		frame.getContentPane().add(btnNewButton_l3);
		frame.getContentPane().add(btnNewButton_p5);
		frame.getContentPane().add(btnNewButton_l2);
		frame.getContentPane().add(btnNewButton_p4);
		frame.getContentPane().add(btnNewButton_l1);
		frame.getContentPane().add(btnNewButton_p1);
		frame.getContentPane().add(btnNewButton_p2);
		frame.getContentPane().add(btnNewButton_p9);
		frame.getContentPane().add(btnNewButton_c3);
		frame.getContentPane().add(btnNewButton_c1);
		frame.getContentPane().add(btnNewButton_p8);
		frame.getContentPane().add(btnNewButton_a6);
		frame.getContentPane().add(btnNewButton_c2);
		frame.getContentPane().add(btnNewButton_p10);
		frame.getContentPane().add(btnNewButton_a8);
		frame.getContentPane().add(btnNewButton_a7);
		frame.getContentPane().add(btnNewButton_t7);
		frame.getContentPane().add(btnNewButton_t6);
		frame.getContentPane().add(btnNewButton_t3);
		frame.getContentPane().add(btnNewButton_t2);
		frame.getContentPane().add(btnNewButton_t1);		
		frame.getContentPane().add(btnNewButton_t5);
		frame.getContentPane().add(btnNewButton_t8);
		frame.getContentPane().add(btnNewButton_p7);
		frame.getContentPane().add(btnNewButton_m3);
		frame.getContentPane().add(btnNewButton_m2);
		frame.getContentPane().add(btnNewButton_m1);
		frame.getContentPane().add(btnNewButton_m4);
		
		class actionListener {
			void action() {
				btnNewButton_9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(btnNewButton_9);
					}
				});
				
				btnNewButton_8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(btnNewButton_8);
					}
				});
				
				btnNewButton_7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(btnNewButton_7);
					}
				});
				
				btnNewButton_6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(btnNewButton_6);
					}
				});
				
				btnNewButton_5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(btnNewButton_5);
					}
				});
				
				btnNewButton_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(btnNewButton_4);
					}
				});
				
				btnNewButton_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(btnNewButton_3);
					}
				});
				
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(btnNewButton_2);
					}
				});
				
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(btnNewButton_1);
					}
				});
				
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(btnNewButton);
					}
				});
				
				btnNewButton_10.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(btnNewButton_10);
					}
				});
				
				btnNewButton_a3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						op=btnNewButton_a3;
					}
				});
				
				btnNewButton_a2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						op=btnNewButton_a2;
					}
				});
				
				btnNewButton_a1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						op=btnNewButton_a1;
					}
				});
				
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
				
				btnNewButton_a4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						op=btnNewButton_a4;
					}
				});
				
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
				
				btnNewButton_e2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textField.setText(null);
						firstNum=0;
						secondNum=0;
						previousNum.clear();
						result=0;
						operator=null;
						op=null;
						opNow.clear();
						angle="radian";
						btnNewButton_t7.setFont(new Font("Cambria", Font.BOLD, 18));
						btnNewButton_t6.setFont(new Font("Cambria", Font.PLAIN, 19));
						type="";
						btnNewButton_t5.setFont(new Font("Cambria", Font.PLAIN, 18));
						invType="";
						btnNewButton_t8.setFont(new Font("Cambria", Font.PLAIN, 18));
					}
				});
				
				btnNewButton_a5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						op=btnNewButton_a5;
					}
				});
				
				btnNewButton_l4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("ln");
					}
				});
				
				btnNewButton_p6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("sqrt");
					}
				});
				
				btnNewButton_l3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("log");
					}
				});
				
				btnNewButton_p5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("x^2");
					}
				});
				
				btnNewButton_l2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						op=btnNewButton_l2;
					}
				});
				
				btnNewButton_p4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("x^3");
					}
				});
				
				btnNewButton_l1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("exp");
					}
				});
				
				btnNewButton_p2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						op=btnNewButton_p2;
					}
				});
				
				btnNewButton_p9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("2^x");
					}
				});
				
				btnNewButton_p1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("xfact");
					}
				});
				
				btnNewButton_c3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						doOperation("random");
					}
				});
				
				btnNewButton_c1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textField.setText(String.valueOf(pi));
					}
				});
				
				btnNewButton_p8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("mod");
					}
				});
				
				btnNewButton_a6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("inverse");
					}
				});
				
				btnNewButton_c2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textField.setText(String.valueOf(exponent));
					}
				});
				
				btnNewButton_p10.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("10^x");
					}
				});
				
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
				
				btnNewButton_a7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(op==null) 
							opNow.add(btnNewButton_a1);
						else 
							opNow.add(op);
						previousNum.add(String.valueOf(firstNum));
						i=previousNum.size()-1;
					}
				});
				
				btnNewButton_t7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						angle="radian";
						btnNewButton_t7.setFont(new Font("Cambria", Font.BOLD, 18));
						btnNewButton_t6.setFont(new Font("Cambria", Font.PLAIN, 19));
					}
				});
				
				btnNewButton_t6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						angle="degree";
						btnNewButton_t6.setFont(new Font("Cambria", Font.BOLD, 17));
						btnNewButton_t7.setFont(new Font("Cambria", Font.PLAIN, 20));
					}
				});
				
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
					}
				});
				
				btnNewButton_t2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						if (angle.equals("degree")) {
							if (type.equals("hyperbole")) 
								doOperation("cosdh");
							else
								doOperation("cosd");
						}
						else {
							if (type.equals("hyperbole"))
								doOperation("cosh");
							else
								doOperation("cos");
						}	
					}
				});
				
				btnNewButton_t1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						if (angle.equals("degree")) {
							if (type.equals("hyperbole"))
								doOperation("tandh");
							else
								doOperation("tand");
						}
						else {
							if (type.equals("hyperbole")) 
								doOperation("tanh");
							else
								doOperation("tan");
						}	
					}
				});
				
				btnNewButton_t5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (type.equals("hyperbole")) {
							type="";
							btnNewButton_t5.setFont(new Font("Cambria", Font.PLAIN, 18));
						}
						else {
							type="hyperbole";
							btnNewButton_t5.setFont(new Font("Cambria", Font.BOLD, 17));
						}
					}
				});
				
				btnNewButton_t8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (invType.equals("inv")) {
							invType="";
							btnNewButton_t8.setFont(new Font("Cambria", Font.PLAIN, 18));
						}
						else {
							invType="inv";
							btnNewButton_t8.setFont(new Font("Cambria", Font.BOLD, 17));
						}
					}
				});
				
				btnNewButton_p7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("floor");
					}
				});
				
				btnNewButton_m3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textField.setText(String.valueOf(memory));
					}
				});
				
				btnNewButton_m2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=Double.parseDouble(textField.getText());
						memory+=firstNum;
					}
				});
				
				btnNewButton_m1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=Double.parseDouble(textField.getText());
						memory-=firstNum;
					}
				});
				
				btnNewButton_m4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						memory=0;
						textField.setText(null);
					}
				});
			}
		}
		actionListener obj = new actionListener();
		obj.action();
	}
}
