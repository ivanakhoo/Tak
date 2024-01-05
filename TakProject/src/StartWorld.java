import processing.core.PApplet;
import processing.event.KeyEvent;

public class StartWorld implements IWorld {

	@Override
	public PApplet draw(PApplet c) {
		c.background(0);
		c.fill(0, 255, 0);
		c.textSize(60);
		c.text("Tak", 400, 200);
		c.text("Press Spacebar to Begin", 200, 400);
		return c;
	}

	@Override
	public IWorld update() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public IWorld keyPressed(KeyEvent kev) {
		if (kev.getKey() == ' ') {
		}
		return null;
	}

	@Override
	public IWorld keyReleased(KeyEvent kev) {
		// TODO Auto-generated method stub
		return this;
	}

}
