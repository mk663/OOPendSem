class trigonometry extends Operation {                     
	void doOperation(String operator) {                     //Method Overriding
		super.doOperation(operator);                        //Using super keyword to access overridden method "doOperation" 
		switch(operator) {
		case "sin":
			result=Math.sin(firstNum);
			break;
		case "cos":
			result=Math.cos(firstNum);
			break;
		case "tan":
			result=Math.tan(firstNum);
			break;
		case "sind":
			result=Math.sin(firstNum*pi/180);
			break;
		case "cosd":
			result=Math.sin(firstNum*pi/180);
			break;
		case "tand":
			result=Math.sin(firstNum*pi/180);
			break;
		case "sinh":
			result=Math.sinh(firstNum);
			break;
		case "cosh":
			result=Math.cosh(firstNum);
			break;
		case "tanh":
			result=Math.tanh(firstNum);
			break;
		case "sindh":
			result=Math.sinh(firstNum*pi/180);
			break;
		case "cosdh":
			result=Math.cosh(firstNum*pi/180);
			break;
		case "tandh":
			result=Math.tanh(firstNum*pi/180);
			break;
		}	
		textField.setText(String.valueOf(result));
	}
}