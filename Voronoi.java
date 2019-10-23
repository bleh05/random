
public class Voronoi
{
 public static double[] voronoi_areas(Point[] p)
 {
   
 }
 static class Line{
   double m;
   double x;
   double y;
   public Line(double m, double x, double y) {
	   this.m=m;
	   this.x=x;
	   this.y=y;
   }
   public Point getIntersect(Line o) {
	   double b1 = m*-x+y;
	   double b2 = o.m*-o.x+o.y;
	   double x = (b2-b1)/(o.m-m);
	   double y = m*x+b1;
	   return new Point(x,y);
   }
 }
 static class Point{
	 double x,y;
	 public Point(double x,double y) {
		 this.x=x;
		 this.y=y;
	 }
 }
}
