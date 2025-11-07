public class MyCircle {
    private MyPoint center;
    private double radius;
    public MyCircle(MyPoint center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
    public void display() {
        System.out.printf("Circle Center:(%.1f,%.1f),radius=%.1f,Area=%.1f\n",
                center.getX(), center.getY(), radius, getArea());
    }
    public boolean intersection(LineSeg line) {
        double distToA = center.getDistance(line.getPointA());
        double distToB = center.getDistance(line.getPointB());
        
        if (distToA <= radius || distToB <= radius) {
            return true;
        }
        
        double distanceToLine = line.getDistance(center);
        
        if (distanceToLine <= radius) {
            double Ax = line.getPointA().getX();
            double Ay = line.getPointA().getY();
            double Bx = line.getPointB().getX();
            double By = line.getPointB().getY();
            double Cx = center.getX();
            double Cy = center.getY();
            double ABx = Bx - Ax;
            double ABy = By - Ay;
            double ACx = Cx - Ax;
            double ACy = Cy - Ay;
            double dotProduct = ABx * ACx + ABy * ACy;
            double ABlen2 = ABx * ABx + ABy * ABy;
            if (dotProduct >= 0 && dotProduct <= ABlen2) {
                return true;
            }
        }
        return false;
    }
    public void move(double x, double y) {
        center.move(x, y);
    }
    public MyPoint getCenter() {
        return center;
    }
    public double getRadius() {
        return radius;
    }
}