package encapsulamiento_ocultamiento;

public class Point {
    private double x;
    private double y;

    public Point(){}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    void setX(double x) {
        this.x = x;
    }

    void setY(double y) {
        this.y = y;
    }

    public String toString(int index) {
        String message = "\nPoint " + index + ":";
        message += "\nX: " + getX();
        message += "\nY: " + getY();
        return message;
    }

    double distanceFromOrigin() {
        // origin == (0,0)
        // Distancia = √(x^2 + y^2)
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    static double calculateDistance(Point origin, Point point) {
        /*
         * Distancia = √((x2 - x1)^2 + (y2 - y1)^2)
         * 
         * En este caso, x1 = 0, y1 = 0 (el origen) y x2 = x, y2 = y (el otro punto).
         * Por lo tanto, la fórmula se simplifica a:
         * 
         * Distancia = √(x^2 + y^2)
         */
        return Math.sqrt(Math.pow((point.x - origin.x), 2) 
        + Math.pow((point.y - origin.y), 2));
    }

    static boolean areAligned(Point A, Point B, Point C) {
        //Para que estén alineados se requiere que sus coordenadas sean proporcionales
        
        return ((B.x - A.x ) / (C.x - B.x)) == ((B.y - A.y) / (C.y - B.y));
    }
}
