
public class Bulb {
	private Boolean state;
	
	//setting default state to true which means the light is turned on, we like to waste energy!
	Bulb(){
		state = Boolean.TRUE;
	}
	//turn bulb on
	 void turnOn() {
	     state = Boolean.TRUE;
	}
	// turn bulb off
	 void turnOff() {
	     state = Boolean.FALSE;
	}
	// get status of bulb
	 void getState() {
	    if (state == Boolean.TRUE) {
	    	System.out.println("The light bulb is turned on.\n");
	    }
	    else {
	    	System.out.println("The light bulb is turned off.\n");
	    }
	    
	 }}
	      
	      
	    
	

