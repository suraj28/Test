public class JUnitMessage{

	private String message;

	public JUnitMessage(String message) {
		this.message = message;
	}

public void printMessage(){

	System.out.println(message); 
	int divide=1/0;

}

public String getResults(){
	return message;
}
public String containsString(String msg){
	return msg;
}

public String printHiMessage(){ 

	message="Hi!" + message;
	
	System.out.println(message);

	return message;
}

}