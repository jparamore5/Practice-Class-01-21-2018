
public class rectangle {

	int width;
	int length; 
	
	public rectangle (int width2, int length2) {
		
		width = width2;
		length= length2;
	}
	
	public int perameter() {
	return (2*length + 2*width);
	
	}
	
	public int area() {
		return (length*width);
	}
	
}

