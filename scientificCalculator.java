import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.ButtonGroup;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;


public class scientificCalculator extends trigonometry{
	
	//instance variables
	private JFrame frame;
	protected double memory;
	static int inc;
	
	//ArrayLists
	ArrayList<Double> previousNum = new ArrayList<Double>();
	ArrayList<JButton> opNow = new ArrayList<JButton>(); 
	
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
	
	//constructor
	protected scientificCalculator() {
		super("radian");
		memory=0;
		inc=-1;
		calculator();
	}
    
	
	void calculator() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.setTitle("Scientific Calculator");
		frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 14));
		frame.setBounds(100, 100, 560, 617);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Cambria Math", Font.PLAIN, 22));
		textField.setBounds(22, 77, 501, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("0.0");
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setForeground(SystemColor.desktop);
		label.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		label.setBounds(22, 22, 501, 37);
		frame.getContentPane().add(label);
		
		
		//JButtons
		JButton button_9 = new JButton("9");
		JButton button_8 = new JButton("8");
		JButton button_7 = new JButton("7");
		JButton button_6 = new JButton("6");
		JButton button_5 = new JButton("5");
		JButton button_4 = new JButton("4");
		JButton button_3 = new JButton("3");
		JButton button_2 = new JButton("2");
		JButton button_1 = new JButton("1");
		JButton button_0 = new JButton("0");
		JButton button_dot = new JButton(".");
		JButton button_rem = new JButton("%");
		JButton button_Div = new JButton("/");
		JButton button_Mul = new JButton("x");
		JButton button_Sub = new JButton("-");
		JButton button_Add = new JButton("+");
		JButton button_Eq = new JButton("=");
		JButton button_Del = new JButton("\uF0E7");                           //backspace
		JButton button_clr = new JButton("C");
		JButton button_ln = new JButton("ln");
		JButton button_sqrt = new JButton("\u221A");                          //square root
		JButton button_log = new JButton("log");
		JButton button_x2 = new JButton("x\u00B2");                           //x square
		JButton button_x3 = new JButton("x\u00B3");                           //x cube
		JButton button_xy = new JButton("x\u02B8");                           //x^y
		JButton button_2x = new JButton("2\u02E3");                           //2^x
		JButton bButton_fact = new JButton("x!");
		JButton button_logxy = new JButton("log\u2090x");                     //log x base y
		JButton button_ex = new JButton("e\u02E3");                           // e^x
		JButton button_rand = new JButton("rand");
		JButton button_pi = new JButton("\u03C0");                            //pi
		JButton button_mod = new JButton("|x|");
		JButton button_xinv = new JButton("x\u207B\u00B9");                   //x^-1
		JButton button_e = new JButton("e");
		JButton button_10x = new JButton("10\u02E3");                         //10^x
		JButton button_cls = new JButton(")");
		JButton button_open = new JButton("(");
		JButton button_sin = new JButton("sin");
		JButton button_cos = new JButton("cos");
		JButton button_tan = new JButton("tan");
		JButton button_hyp = new JButton("hyp");
		JButton button_inv = new JButton("inv");
		JButton button_round = new JButton("[x]");
		JButton button_memRcl = new JButton("MR");
		JButton button_memAdd = new JButton("M+");
		JButton button_memSub = new JButton("M-");
		JButton button_memClr = new JButton("MC");
		
		//radioButtons
		JRadioButton rdButton_rad = new JRadioButton("rad");
		JRadioButton rdButton_deg = new JRadioButton("deg");
		rdButton_rad.setSelected(true);
		
		//ButtonGroup
		ButtonGroup typ=new ButtonGroup();  
		typ.add(rdButton_rad);
		typ.add(rdButton_deg);
		
		
		//inner class for initializing JButton properties
		class buttonProp {
			
			void initProp() {
				
				//setting font for buttons
				button_9.setFont(new Font("Cambria", Font.BOLD, 20));
		        button_8.setFont(new Font("Cambria", Font.BOLD, 20));
		        button_7.setFont(new Font("Cambria", Font.BOLD, 20));
		        button_6.setFont(new Font("Cambria", Font.BOLD, 20));
		        button_5.setFont(new Font("Cambria", Font.BOLD, 20));
		        button_4.setFont(new Font("Cambria", Font.BOLD, 20));
		        button_3.setFont(new Font("Cambria", Font.BOLD, 20));
		        button_2.setFont(new Font("Cambria", Font.BOLD, 20));
		        button_1.setFont(new Font("Cambria", Font.BOLD, 20));
		        button_0.setFont(new Font("Cambria", Font.BOLD, 20));
		        button_dot.setFont(new Font("Cambria", Font.PLAIN, 20));
		        button_Mul.setFont(new Font("Cambria", Font.PLAIN, 20));
		        button_Sub.setFont(new Font("Cambria", Font.PLAIN, 20));
		        button_Add.setFont(new Font("Cambria", Font.PLAIN, 20));
		        button_Eq.setFont(new Font("Cambria", Font.PLAIN, 20));
		        button_Div.setFont(new Font("Cambria", Font.PLAIN, 20));
		        button_Del.setFont(new Font("Wingdings", Font.PLAIN, 15));
		        button_clr.setFont(new Font("Cambria", Font.PLAIN, 20));
		        button_rem.setFont(new Font("Cambria", Font.PLAIN, 20));
		        button_ln.setFont(new Font("Cambria", Font.PLAIN, 20));
		        button_sqrt.setFont(new Font("Cambria", Font.PLAIN, 20));
		        button_log.setFont(new Font("Cambria", Font.PLAIN, 18));
		        button_x2.setFont(new Font("Cambria", Font.PLAIN, 20));
		        button_logxy.setFont(new Font("Cambria", Font.PLAIN, 13));
		        button_x3.setFont(new Font("Cambria", Font.PLAIN, 20));
		        button_ex.setFont(new Font("Cambria", Font.PLAIN, 20));
		        bButton_fact.setFont(new Font("Cambria", Font.PLAIN, 20));
				button_xy.setFont(new Font("Cambria", Font.PLAIN, 20));
				button_2x.setFont(new Font("Cambria", Font.PLAIN, 20));
				button_rand.setFont(new Font("Cambria", Font.PLAIN, 15));
				button_pi.setFont(new Font("Cambria", Font.PLAIN, 20));
				button_mod.setFont(new Font("Cambria", Font.PLAIN, 20));
				button_xinv.setFont(new Font("Cambria", Font.PLAIN, 20));
				button_e.setFont(new Font("Cambria", Font.PLAIN, 20));
				button_10x.setFont(new Font("Cambria", Font.PLAIN, 20));
				button_cls.setFont(new Font("Cambria", Font.PLAIN, 20));
				button_open.setFont(new Font("Cambria", Font.PLAIN, 20));
				button_sin.setFont(new Font("Cambria", Font.PLAIN, 20));
				button_cos.setFont(new Font("Cambria", Font.PLAIN, 20));
				button_tan.setFont(new Font("Cambria", Font.PLAIN, 20));
				button_hyp.setFont(new Font("Cambria", Font.PLAIN, 18));
				button_inv.setFont(new Font("Cambria", Font.PLAIN, 18));
				button_round.setFont(new Font("Cambria", Font.PLAIN, 18));
				button_memRcl.setFont(new Font("Cambria", Font.PLAIN, 18));
				button_memAdd.setFont(new Font("Cambria", Font.PLAIN, 18));
				button_memSub.setFont(new Font("Cambria", Font.PLAIN, 18));
				button_memClr.setFont(new Font("Cambria", Font.PLAIN, 18));
				rdButton_rad.setFont(new Font("Cambria", Font.PLAIN, 18));
				rdButton_deg.setFont(new Font("Cambria", Font.PLAIN, 18));
				
				//setting bg color for buttons 
				button_9.setBackground(SystemColor.textHighlight);
				button_8.setBackground(SystemColor.textHighlight);
				button_7.setBackground(SystemColor.textHighlight);
				button_6.setBackground(SystemColor.textHighlight);
				button_5.setBackground(SystemColor.textHighlight);
				button_4.setBackground(SystemColor.textHighlight);
				button_3.setBackground(SystemColor.textHighlight);
				button_2.setBackground(SystemColor.textHighlight);
				button_1.setBackground(SystemColor.textHighlight);
				button_0.setBackground(SystemColor.textHighlight);
				button_Eq.setBackground(Color.ORANGE);
				button_clr.setBackground(UIManager.getColor("Button.background"));
				rdButton_rad.setBackground(SystemColor.inactiveCaption);
				rdButton_deg.setBackground(SystemColor.inactiveCaption);
				
				//setting the bounds of the buttons relative to the frame
				button_9.setBounds(241, 325, 63, 49);
				button_8.setBounds(314, 325, 63, 49);
				button_7.setBounds(387, 325, 63, 49);
				button_6.setBounds(241, 385, 63, 49);
				button_5.setBounds(314, 385, 63, 49);
				button_4.setBounds(387, 385, 63, 49);
				button_3.setBounds(241, 445, 63, 49);
				button_2.setBounds(314, 445, 63, 49);
				button_dot.setBounds(387, 505, 63, 49);
				button_1.setBounds(387, 445, 63, 49);
				button_0.setBounds(314, 505, 63, 49);
				button_Mul.setBounds(460, 325, 63, 49);
				button_Sub.setBounds(460, 385, 63, 49);
				button_Add.setBounds(460, 445, 63, 49);
				button_Eq.setBounds(460, 505, 63, 49); 
				button_Div.setBounds(460, 265, 63, 49);
				button_Del.setBounds(387, 265, 63, 49);
				button_clr.setBounds(314, 265, 63, 49);
				button_rem.setBounds(241, 265, 63, 49);
				button_ln.setBounds(95, 204, 63, 49);
				button_sqrt.setBounds(168, 265, 63, 49);
				button_log.setBounds(95, 265, 63, 49);
				button_x2.setBounds(168, 325, 63, 49);
				button_logxy.setBounds(95, 325, 63, 49);
				button_x3.setBounds(168, 385, 63, 49);
				button_ex.setBounds(95, 385, 63, 49);
				bButton_fact.setBounds(168, 505, 63, 49);
				button_xy.setBounds(168, 445, 63, 49);
				button_2x.setBounds(95, 505, 63, 49);
				button_rand.setBounds(387, 205, 63, 49);
				button_pi.setBounds(460, 144, 63, 49);
				button_mod.setBounds(241, 505, 63, 49);
				button_xinv.setBounds(460, 204, 63, 49);
				button_e.setBounds(387, 144, 63, 49);
				button_10x.setBounds(95, 445, 63, 49);
				button_cls.setBounds(314, 204, 63, 49);
				button_open.setBounds(241, 204, 63, 49);
				button_sin.setBounds(22, 385, 63, 49);
				button_cos.setBounds(22, 445, 63, 49);
				button_tan.setBounds(22, 505, 63, 49);
				button_hyp.setBounds(22, 265, 63, 49);
				button_inv.setBounds(22, 325, 63, 49);
				button_round.setBounds(168, 204, 63, 49);
				button_memRcl.setBounds(168, 145, 63, 49);
				button_memAdd.setBounds(241, 144, 63, 49);
				button_memSub.setBounds(314, 144, 63, 49);
				button_memClr.setBounds(95, 144, 63, 49);
				rdButton_rad.setBounds(22, 144, 63, 49);
				rdButton_deg.setBounds(22, 204, 63, 49);
				
				//adding all contents in the frame
				frame.getContentPane().add(button_9);
				frame.getContentPane().add(button_8);
				frame.getContentPane().add(button_7);	
				frame.getContentPane().add(button_6);
				frame.getContentPane().add(button_5);
				frame.getContentPane().add(button_4);
				frame.getContentPane().add(button_3);
				frame.getContentPane().add(button_2);
				frame.getContentPane().add(button_dot);
				frame.getContentPane().add(button_1);
				frame.getContentPane().add(button_0);
				frame.getContentPane().add(button_Mul);
				frame.getContentPane().add(button_Sub);
				frame.getContentPane().add(button_Add);
				frame.getContentPane().add(button_Eq);
				frame.getContentPane().add(button_Div);
				frame.getContentPane().add(button_Del);
				frame.getContentPane().add(button_clr);
				frame.getContentPane().add(button_rem);
				frame.getContentPane().add(button_ln);
				frame.getContentPane().add(button_sqrt);
				frame.getContentPane().add(button_log);
				frame.getContentPane().add(button_x2);
				frame.getContentPane().add(button_logxy);
				frame.getContentPane().add(button_x3);
				frame.getContentPane().add(button_ex);
				frame.getContentPane().add(bButton_fact);
				frame.getContentPane().add(button_xy);
				frame.getContentPane().add(button_2x);
				frame.getContentPane().add(button_rand);
				frame.getContentPane().add(button_pi);
				frame.getContentPane().add(button_mod);
				frame.getContentPane().add(button_xinv);
				frame.getContentPane().add(button_e);
				frame.getContentPane().add(button_10x);
				frame.getContentPane().add(button_cls);
				frame.getContentPane().add(button_open);
				frame.getContentPane().add(button_sin);
				frame.getContentPane().add(button_cos);
				frame.getContentPane().add(button_tan);		
				frame.getContentPane().add(button_hyp);
				frame.getContentPane().add(button_inv);
				frame.getContentPane().add(button_round);
				frame.getContentPane().add(button_memRcl);
				frame.getContentPane().add(button_memAdd);
				frame.getContentPane().add(button_memSub);
				frame.getContentPane().add(button_memClr);
				frame.getContentPane().add(rdButton_rad);
				frame.getContentPane().add(rdButton_deg);
				}
			}
		
		//creating object for inner class buttonProp
		buttonProp objProp=new buttonProp();
		objProp.initProp();
		
		
		//inner class to specify the action to perform on-click
		class actionListener {
			
			void action() {
				
				button_9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(button_9);
					}
				});
				
				button_8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(button_8);
					}
				});
				
				button_7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(button_7);
					}
				});
				
				button_6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(button_6);
					}
				});
				
				button_5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(button_5);
					}
				});
				
				button_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(button_4);
					}
				});
				
				button_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(button_3);
					}
				});
				
				button_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(button_2);
					}
				});
				
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(button_1);
					}
				});
				
				button_0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(button_0);
					}
				});
				
				button_dot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setNumber(button_dot);
					}
				});
				
				button_Mul.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						op=button_Mul;
						label.setText(String.valueOf(firstNum)+"*");
					}
				});
				
				button_Sub.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						op=button_Sub;
						label.setText(String.valueOf(firstNum)+String.valueOf(op.getText()));
					}
				});
				
				button_Add.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						op=button_Add;
						label.setText(String.valueOf(firstNum)+String.valueOf(op.getText()));
					}
				});
				
				button_Eq.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (op==null) {
							textField.setText(String.valueOf(result));
						}
						else {
							secondNum=getNum();
						    doOperation(op);
						    label.setText(label.getText()+String.valueOf(secondNum)+"=");
						}    
					}
				});
				
				button_Div.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						op=button_Div;
						label.setText(String.valueOf(firstNum)+String.valueOf(op.getText()));
					}
				});
				
				button_Del.addActionListener(new ActionListener() {
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
				
				button_clr.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textField.setText("");
						label.setText("");
						firstNum=0;
						secondNum=0;
						previousNum.clear();
						result=0;
						operator=null;
						op=null;
						opNow.clear();				
					}
				});
				
				button_rem.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						op=button_rem;
						label.setText(String.valueOf(firstNum)+String.valueOf(op.getText()));
					}
				});
				
				button_ln.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("ln");
						label.setText("ln("+String.valueOf(firstNum)+")");
					}
				});
				
				button_sqrt.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("sqrt");
						label.setText("\u221A"+String.valueOf(firstNum));
					}
				});
				
				button_log.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("log");
						label.setText("log("+String.valueOf(firstNum)+")");
					}
				});
				
				button_x2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("x^2");
						label.setText(String.valueOf(firstNum)+"\u00B2");
					}
				});
				
				button_logxy.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						op=button_logxy;
						label.setText("log("+String.valueOf(firstNum)+") base");
					}
				});
				
				button_x3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("x^3");
						label.setText(String.valueOf(firstNum)+"\u00B3");
					}
				});
				
				button_ex.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("exp");
						label.setText("e^"+String.valueOf(firstNum));
					}
				});
				
				button_xy.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						op=button_xy;
						label.setText(String.valueOf(firstNum)+"^");
					}
				});
				
				button_2x.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("2^x");
						label.setText("2^"+String.valueOf(firstNum));
					}
				});
				
				bButton_fact.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("xfact");
						label.setText(String.valueOf(firstNum)+"!");
					}
				});
				
				button_rand.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						doOperation("random");
						label.setText("random");
					}
				});
				
				button_pi.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textField.setText(String.valueOf(pi));
						label.setText("\u03C0");
					}
				});
				
				button_mod.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("mod");
						label.setText("|"+String.valueOf(firstNum)+"|");
					}
				});
				
				button_xinv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("inverse");
						label.setText(String.valueOf(firstNum)+"\u207B\u00B9");
					}
				});
				
				button_e.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textField.setText(String.valueOf(exponent));
						label.setText("e");
					}
				});
				
				button_10x.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("10^x");
						label.setText("10^"+String.valueOf(firstNum));
					}
				});
				
				button_cls.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(inc>=0) {
							
							firstNum=(previousNum.get(inc));
							secondNum=getNum();
							doOperation(opNow.get(inc));
							
							inc-=1;
							label.setText(")");
						}
						
						else {
							previousNum.clear();
							opNow.clear();
							firstNum=0;
							secondNum=0;
							op=button_Add;
						}
					}
				});
				
				button_open.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(textField.getText().equals("")) {
							
							if(op==null || label.getText().equals("(")) {
						    	opNow.add(button_Add);
							    previousNum.add(0.0);
						    }
							
						    else {
							    opNow.add(op);
						        previousNum.add(firstNum);
						    }
						    inc=previousNum.size()-1;
						    label.setText("(");
						}
						
						else 
							textField.setText("Select operator");
					}
				});
				
				button_sin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						
						if (type.equals("hyperbole")) 
							doOperation("sinh");
						
						else if (angle.equals("degree")) 
							doOperation("sind");
						
						else 
						    doOperation("sin");
						
						label.setText("sin("+String.valueOf(firstNum)+")");
					}
				});
				
				button_cos.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						
						if (type.equals("hyperbole")) 
							doOperation("cosh");
						
						else if (angle.equals("degree")) 
							doOperation("cosd");
						
						else 
						    doOperation("cos");
						
						label.setText("cos("+String.valueOf(firstNum)+")");
						
					}
				});
				
				button_tan.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						
						if (type.equals("hyperbole")) 
							doOperation("tanh");
						
						else if (angle.equals("degree")) 
							doOperation("tand");
						
						else 
						    doOperation("tan");
						
						label.setText("tan("+String.valueOf(firstNum)+")");
						
					}
				});
				
				button_hyp.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (type.equals("hyperbole")) {
							type="";
							button_hyp.setFont(new Font("Cambria", Font.PLAIN, 18));
						}
						else {
							type="hyperbole";
							button_hyp.setFont(new Font("Cambria", Font.BOLD, 17));
						}
					}
				});
				
				button_inv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (invType.equals("inv")) {
							invType="";
							button_inv.setFont(new Font("Cambria", Font.PLAIN, 18));
						}
						else {
							invType="inv";
							button_inv.setFont(new Font("Cambria", Font.BOLD, 17));
						}
					}
				});
				
				button_round.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=getNum();
						doOperation("floor");
					}
				});
				
				button_memRcl.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textField.setText(String.valueOf(memory));
					}
				});
				
				button_memAdd.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=Double.parseDouble(textField.getText());
						memory+=firstNum;
						label.setText(String.valueOf(memory));
					}
				});
				
				button_memSub.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum=Double.parseDouble(textField.getText());
						memory-=firstNum;
						label.setText(String.valueOf(memory));
					}
				});
				
				button_memClr.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						memory=0;
						textField.setText(null);
						label.setText("");
					}
				});
				
				rdButton_rad.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						angle="radian";
					}
				});
				
				rdButton_deg.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						angle="degree";
					}
				});
			}
		}
		
		//creating object for class actionListener
		actionListener objListen = new actionListener();
		objListen.action();
	}
}
