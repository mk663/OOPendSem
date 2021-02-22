import javax.swing.JButton;

class Operation extends basicValues {                  //Sub class 1
	void doOperation(JButton operator) {
		
		switch(operator.getText()) {
		case "+":
			result=firstNum+secondNum;
			break;
		case "-":
			result=firstNum-secondNum;
			break;
		case "x":
			result=firstNum*secondNum;
			break;
		case "/":
			result=firstNum/secondNum;
			break;
		case "%":
			result=firstNum%secondNum;
			break;
		case "x\u02B8":                                            //for doing x power y operation
			result=Math.pow(firstNum,secondNum);
			break;    
		case "log\u2090x":                                         //for doing log a base b operation
			result=Math.log10(firstNum)/Math.log10(secondNum);
		    break;
		case "\u02e3\u221Ay":
			result=Math.pow(firstNum,1/secondNum);
		}
		
		textField.setText(String.valueOf(result));
	}
	
	void doOperation(String operator) {                      //Method Overloading
		
		switch(operator) {
		case "sqrt":
			result=Math.sqrt(firstNum);
			break;
		case "exp":
			result=Math.exp(firstNum);
			break;
		case "x^2":
			result=Math.pow(firstNum,2);
			break;
		case "x^3":
			result=Math.pow(firstNum,3);
			break;
		case "10^x":
			result=Math.pow(10,firstNum);
			break;
		case "2^x":
			result=Math.pow(2,firstNum);
			break;
		case "log":
			result=Math.log10(firstNum);
			break;
		case "ln":
			result=Math.log(firstNum);
			break;
		case "inverse":
			result=1/firstNum;
			break;
		case "mod":
			result=Math.abs(firstNum);
			break;
		case "random":
			result=Math.random();
			break;
		case "floor":
			result=Math.round(firstNum);
			break;
		case "xfact":
			double fact=1;
			for(double i=firstNum; i>0; i--) {
				fact*=i;				
			}
			result=fact;
			break;
		}
		
		textField.setText(String.valueOf(result));
	}
}