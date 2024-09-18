package klasseObjekte;

public class Line {
	private Point start;
	private Point ende ;
	public Line (Point start, Point ende) {
		this.ende=ende ;
		this.start=start;
	}
public Line (Point ende) {
	this.start= new Point(0,0);
	this.ende =ende ;
}
public Line add (int x, int y) {
	
	return  new Line(this.start,
			new Point ((ende.gibX()+x),(ende.gibY()+y)));
}
public void reverse () {
 Point temp = this.start;
 this.start= this.ende;
 this.ende =temp;
}
public boolean isDirectedUp() {
	return ende.gibY()>start.gibY();
}
public static void main (String arg[]) {
	System.out.println(new Line(new Point(0,0),
			new Point(2,-1)).add(1, 2).isDirectedUp());
}
}
