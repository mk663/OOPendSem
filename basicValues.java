import javax.swing.JButton;
import javax.swing.JTextField;

abstract class basicValues {                                     //Super class
	static protected JTextField textField;
	static double firstNum=0;
	static double secondNum=0;
	static double previousNum=0;
	static double result=0;
	static protected String operator;
	static protected JButton op;
	static protected JButton opNow;
	static protected double memory=0;
	static String angle="radian";
	static String type="";
	final double pi=Math.PI;                           //constants
	final double exponent=Math.E;
	
	static public double getNum() {
		double num;
		if (textField.getText().equals(""))
			num=0;
		else
			num=Double.parseDouble(textField.getText());
		textField.setText("");
		return num;
	}
	
	static void setNumber(JButton name) {
		String number=textField.getText()+name.getText();
		textField.setText(number);
	}
	
	abstract void doOperation(String operator);
	abstract void doOperation(JButton operator);
}