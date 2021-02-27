import javax.swing.JButton;
import javax.swing.JTextField;


abstract class basicValues {                                     //Super class
	
	static protected JTextField textField;
	static double firstNum;
	static double secondNum;
	static double result;
	static protected String operator;
	static protected JButton op;
	final double pi;                           //constants
	final double exponent;
	
	basicValues() {
		firstNum=0;
		secondNum=0;
		result=0;
		operator=null;
		op=null;
		pi=Math.PI; 
		exponent=Math.E;
	}
	
	static public double getNum() {
		double num=0;
		String text="";
		if (textField.getText().equals(""))
			num=0;
		else {
			try {
				num=Double.parseDouble(textField.getText());
	        }
	        catch(NumberFormatException e){
	        	text="Enter only numeric value";
	        }
		}
		textField.setText(text);
		return num;
	}
	
	static void setNumber(JButton name) {
		String number=textField.getText()+name.getText();
		textField.setText(number);
	}
	
	abstract void doOperation(String operator);
	abstract void doOperation(JButton operator);
}