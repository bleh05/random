/** FRAMEWORK
 * Find all lines perpendicular to the line segment from point x to all other points at the midpoint of x and a.
 * then, you can check if each line segment intersects another line, if it does, then it should not be used in the area calc
 * find all the valid segments, and look for all of the intersections. 
 * Each intersection can be shown as a vertex as for a triangle, and calculate all the areas of the triangles (height will be midpoint of
 * base point to point i, and then length is distance between the two intersections.
 * do that for all triangles, yielding an n^3 algorithm
 **/
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
