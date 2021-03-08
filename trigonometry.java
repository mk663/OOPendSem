
class trigonometry extends arithmetic {
	
	static String angle;                                    //Specifying whether the angle is radian or degree
	static String type;                                     //Specifying whether it is hyperbole function
	static String invType;
	
	protected trigonometry(String ang) {
		super();
		angle=ang;
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
			if (invType.equals("inv"))
				result=Math.toDegrees(Math.asin(firstNum));
			else
				result=Math.sin(Math.toRadians(firstNum));
			break;
			
		case "cosd":
			if (invType.equals("inv"))
				result=Math.toDegrees(Math.acos(firstNum));
			else
				result=Math.cos(Math.toRadians(firstNum));
			break;
			
		case "tand":
			if (invType.equals("inv"))
				result=Math.toDegrees(Math.atan(firstNum));
			else
				result=Math.tan(Math.toRadians(firstNum));
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
				result=Math.tanh(firstNum);
			break;

			
		}	
		
		textField.setText(String.valueOf(result));
	}
}