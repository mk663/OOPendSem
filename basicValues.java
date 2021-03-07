import javax.swing.JButton;
import javax.swing.JTextField;


abstract class basicValues {                            //Super class
	
	static protected JTextField textField;
	static double firstNum;
	static double secondNum;
	static double result;
	static String operator;
	static JButton op;
	
	//constants
	final double pi;                                    
	final double exponent;
	
	protected basicValues() {
		
		firstNum=0;
		secondNum=0;
		result=0;
		operator=null;
		op=null;
		
		this.pi=Math.PI; 
		this.exponent=Math.E;
	}
	
	static protected double getNum() {
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
	
	static protected void setNumber(JButton name) {
		String number=textField.getText()+name.getText();
		textField.setText(number);
	}
	
	abstract void doOperation(String operator);
	abstract void doOperation(JButton operator);
	
}