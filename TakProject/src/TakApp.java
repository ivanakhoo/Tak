import processing.core.*;
import processing.event.*;

public class TakApp extends PApplet {
	IWorld w;
	
	public static final int WIDTH = 900;
	public static final int HEIGHT = 900;
	
	public void settings() {
		this.size(WIDTH, HEIGHT);
	}
	
	public void setup() {
		w = new StartWorld();
	}
	
	 public void keyPressed(KeyEvent kev) {
	        w = w.keyPressed(kev);
	    }
	    
	    public void keyReleased(KeyEvent kev) {
	    	w = w.keyReleased(kev);
	    }
	    
	    public void draw() {
	        w = w.update();
	        w.draw(this);
	    }
	    
	    public void mousePressed(MouseEvent mev) {
//	        w = w.mousePressed(mev);
	    }
	
	public static void main(String[] args) {
        PApplet.runSketch(new String[] { "Tak" }, new TakApp());
    }

}
