
public class Board { 
	Tile[][] boxes; 

	public Board() { 
		this.resetBoard(); 
	} 

	public Tile getBox(int x, int y) throws Exception { 

		if (x < 0 || x > 2 || y < 0 || y > 2) { 
			throw new Exception("Index out of bound"); 
		} 

		return boxes[x][y]; 
	} 

	public void resetBoard() { 

		// initialize boxes without any pieces
		for (int i = 0; i < 3; i++) { 
			for (int j = 0; j < 3; j++) { 
				boxes[i][j] = new Tile(i, j, null); 
			} 
		} 
	} 
} 

