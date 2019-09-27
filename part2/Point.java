

class Point
{
	private double x;
	private double y;
	public Point(double x, double y)
	{
	 this.x = x;
	 this.y = y; 
	}
	
	public double getX(){return x;}
	public double getY(){return y;}
        public double getRadius(){
	 return(Math.sqrt(Math.pow(x,2) + Math.pow(y,2))); 
	}
	
	public double getAngle(){
         return(Math.toRadians(Math.tan(x/y)));
	}

	public Point rotate90(){
             
	}









}