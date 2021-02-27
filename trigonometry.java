class trigonometry extends Operation {
	
	static String angle;
	static String type;
	static String invType;
	
	trigonometry() {
		super();
		angle="radian";
		type="";
		invType="";
	}
	
	void doOperation(String operator) {                     //Method Overriding
		
		super.doOperation(operator);                        //Using super keyword to access overridden method "doOperation" 
		
		switch(operator) {
		case "sin":
			if (invType.equals("inv"))
				result=Math.asin(firstNum);
			else
				result=Math.sin(firstNum);
			break;
		case "cos":
			if (invType.equals("inv"))
				result=Math.acos(firstNum);
			else
				result=Math.cos(firstNum);
			break;
		case "tan":
			if (invType.equals("inv"))
				result=Math.atan(firstNum);
			else
				result=Math.tan(firstNum);
			break;
		case "sind":
			result=Math.sin(firstNum*pi/180);
			break;
		case "cosd":
			result=Math.cos(firstNum*pi/180);
			if (firstNum==90)
				result=Math.floor(result);
			break;
		case "tand":
			result=Math.tan(firstNum*pi/180);
			double num=0;
			if (firstNum==90)
				result=1/num;
			break;
		case "sinh":
			if (invType.equals("inv"))
				result=Math.log(firstNum + Math.sqrt(firstNum*firstNum + 1.0));
			else
				result=Math.sinh(firstNum);
			break;
		case "cosh":
			if (invType.equals("inv"))
				 result=Math.log(firstNum + Math.sqrt(firstNum*firstNum - 1.0));
			else
				result=Math.cosh(firstNum);
			break;
		case "tanh":
			if (invType.equals("inv"))
				result=0.5*Math.log((1.0+firstNum)/(1.0-firstNum));
			else
				result=Math.tan(firstNum);
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