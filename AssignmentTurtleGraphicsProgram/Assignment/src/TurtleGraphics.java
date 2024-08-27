import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

import uk.ac.leedsbeckett.oop.OOPGraphics;

public class TurtleGraphics extends OOPGraphics
{
	 public static void main(String[] args)
     {
             new Main(); //create instance of class that extends OOPGraphics (could be separate class without main), gets out of static context
     }
     
        public TurtleGraphics()
        {
                JFrame MainFrame = new JFrame();                //create a frame to display the turtle panel on
                MainFrame.setLayout(new FlowLayout());  //not strictly necessary
                MainFrame.add(this);                                    //"this" is this object that extends turtle graphics so we are adding a turtle graphics panel to the frame
                MainFrame.pack();                                               //set the frame to a size we can see
                MainFrame.setVisible(true);                             //now display it
                super.about();      			  

        }
        
      //inheritance commands
        public void about() 
        {
            super.about();
            clear();
            name();
        }
        
        public void name() {
        	penUp();
			setStroke(15);
			setPenColour(Color.green);
        	turnRight(90);
        	forward(100);
        	turnLeft(120);
        	penDown();
        	forward(50);
        	turnLeft(120);
        	forward(50);
        	turnLeft(240);
        	forward(50);
        	turnLeft(120);
        	forward(50);
        	
        	penUp();
			setPenColour(Color.blue);
        	turnRight(10);
        	forward(50);
        	turnLeft(40);
        	penDown();
        	forward(20);
        	forward(-10);
        	penUp();
        	forward(-50);
        	penDown();
        	forward(-50);
        	
        	penUp();
			setPenColour(Color.yellow);
        	turnRight(90);
        	forward(50);
        	penDown();
        	forward(50);
        	forward (-50);
        	turnLeft(90);
        	forward(100);
        	
        	penUp();
			setPenColour(Color.red);
        	turnRight(90);
        	forward(100);
        	penDown();
        	turnLeft(90);
        	forward(-100);
        	turnRight(90);
        	forward(50);
        	reset();
        	
        }
        public void RGB(int redValue, int greenValue, int blueValue) {
            Color rgbColour = new Color(redValue, greenValue, blueValue);
            setPenColour(rgbColour);
        }
        
        public void triangle(int side1, int side2, int side3) {
            getGraphics2DContext().drawPolygon(new int[] { getxPos() - (side1 / 2), getxPos(), getxPos() + (side2 / 2) },
                    new int[] { getyPos(), (int) (getyPos() - (side3 * (Math.sqrt(3) / 2))), getyPos() }, 3);
        }
        
        public void processCommand(String command)      
        {
        	//stores command in array and splits the input viw whitespace
        	String[] commandEntered = command.trim().split("\\s+");
        	String action = commandEntered[0].toLowerCase();
        	try {
        		switch (action) {
        		
        		  //display commands
        		case "about":
        			about();
        			break;
        		case "clear":
        			clear();
    				displayMessage("Canvas cleared");Thread.sleep(1000);
        			clearInterface();
        			break;
        			
        		//pen commands
        		case "pendown":
                	penDown();
    				displayMessage("Pen is on canvas.");Thread.sleep(1000);
        			clearInterface();
                	break;
        		case "penup":
        			penUp();
    				displayMessage("Pen has left canvas.");Thread.sleep(1000);
        			clearInterface();
        			break;
        		case "red":
        			setPenColour(Color.red);
    				displayMessage("Pen is red.");Thread.sleep(1000);
        			clearInterface();
        			break;
        		case "green":
        			setPenColour(Color.green);
    				displayMessage("Pen is green.");Thread.sleep(1000);
        			clearInterface();
        			break;
        		case "yellow":
        			setPenColour(Color.yellow);
    				displayMessage("Pen is yellow.");Thread.sleep(1000);
        			clearInterface();
        			break;
        		case "blue":
        			setPenColour(Color.blue);
    				displayMessage("Pen is blue.");Thread.sleep(1000);
        			clearInterface();
        			break;
        		case "reset":
        			penUp();
        			reset();
        			penDown();
    				displayMessage("Reset turtle.");Thread.sleep(1000);
        			clearInterface();
        			break;
        		case "rgb":
        				int colour1 = Integer.parseUnsignedInt(commandEntered[1]);
                		int colour2 = Integer.parseUnsignedInt(commandEntered[2]);
                		int colour3 = Integer.parseUnsignedInt(commandEntered[3]);
            			RGB(colour1, colour2, colour3);	
            			break;
        		case "penstroke":
        			int width = Integer.parseUnsignedInt(commandEntered[1]);
        			setStroke(width);
        			displayMessage("Set pen stroke.");Thread.sleep(1000);
        			clearInterface();
        			break;
        			
        			

        		//drawing commands
        		case "forward":
        			handleMovement(action, commandEntered);
    				displayMessage("Moved forwards.");Thread.sleep(1000);
        			clearInterface();
        			break;
        		case "backward":
        			handleMovement(action, commandEntered);
    				displayMessage("Moved backwards.");Thread.sleep(1000);
        			clearInterface();
        				break;
        		case "turnleft":
        			handleDirection(action, commandEntered);
    				displayMessage("Turned left.");Thread.sleep(1000);
        			clearInterface();
        				break;
       
        		case "turnright":
    				handleDirection(action, commandEntered);
    				displayMessage("Turned right.");Thread.sleep(1000);
        			clearInterface();
        				break;
        				
        		case "square":
					for (int count = 1; count <= 4; count++) {
						handleMovement(action, commandEntered);
			            turnRight(90);
					}
					displayMessage("Square drawn.");Thread.sleep(1000);
        			clearInterface();
					break;
					
        		case "equilateral":
					int length = Integer.parseUnsignedInt(commandEntered[1]);
					penDown();
					forward(length);
					turnRight(120);
					forward(length);
					turnRight(120);
					forward(length);
					penUp();
					forward(50);
					displayMessage("Equilateral triangle drawn.");Thread.sleep(1000);
        			clearInterface();
					break;
					
        		case "triangle":
        			int v1 = Integer.parseUnsignedInt(commandEntered[1]);
        			int v2 = Integer.parseUnsignedInt(commandEntered[2]);
        			int v3 = Integer.parseUnsignedInt(commandEntered[3]);
        			triangle(v1, v2, v3);
        			displayMessage("Triangle drawn.");Thread.sleep(1000);
        			clearInterface();
        			break;
        	
        		//save commands
        		//used with help from https://docs.oracle.com/javase/tutorial/2d/images/saveimage.html / https://docs.oracle.com/javase/8/docs/api/java/io/File.html
        		case "save":
        			try {
        			    BufferedImage bi = getBufferedImage();  // retrieve image
        			    File outputfile = new File("turtle_drawing.png");
        			    ImageIO.write(bi, "png", outputfile);
        			    displayMessage("Image saved.");Thread.sleep(1000);
            			clearInterface();        			  
        			    break;
        			} catch (IOException e) {
        			    // handle exception
        			}
        		case "load":
        				try {
            				File input = new File(commandEntered[1] + ".png");
                			BufferedImage image = ImageIO.read(input);
                			setBufferedImage(image);
                			displayMessage("Image loaded.");Thread.sleep(1000);
                			clearInterface();
                			break;
            			}
        				
            			catch (IOException e)
            			{
            				displayMessage("The file specified does not exist.");Thread.sleep(1000);
                			clearInterface();
            			}

        		//error handling
        		default:
        			displayMessage("Invalid command.");Thread.sleep(1000);
        			clearInterface();
        			break;
        		
        	
        		}}
        	
        			  catch (NumberFormatException e) {
        				displayMessage("Please enter a valid number for parameter.");
        			} catch (IllegalArgumentException e) {
        				displayMessage("Please enter a parameter.");
        			} catch (Exception e) {
        				displayMessage("Error.");
        			}
        		}
        private void handleMovement(String action, String[] commandEntered) {
        	if (commandEntered.length > 1) {
        		int distance = Integer.parseUnsignedInt(commandEntered[1]);
        		if (action.equals("forward")) forward(distance);
        		if (action.equals("backward")) forward(-distance);
        		if (action.equals("square")) forward(distance);

        	}
        	else {
        		throw new IllegalArgumentException("Missing value for distance.");
        	}}
        
        	private void handleDirection(String action, String[] commandEntered) {
            	if (commandEntered.length > 1) {
            		int direction = Integer.parseUnsignedInt(commandEntered[1]);
            		if (action.equals("turnright")) turnRight(direction);
            		if (action.equals("turnleft")) turnLeft(direction);
            	}
            	else {
            		throw new IllegalArgumentException("Missing value for angle.");
            	} }

}
            
            
       
        

