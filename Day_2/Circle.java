public class Circle {
	
	private int x;
	private int y;
	
	public Circle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	

	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}
	
	public void moveCircle(Circle circle, int deltaX, int deltaY) {
	    // code to move origin of circle to x+deltaX, y+deltaY
	    circle.setX(circle.getX() + deltaX);
	    circle.setY(circle.getY() + deltaY);
	        
	    // code to assign a new reference to circle
	    circle = new Circle(0, 0);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(0,0);
		c1.moveCircle(c1, 10, 20);
		System.out.println(c1.getX());
		System.out.println(c1.getY());

	}

}
