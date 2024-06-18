package lesson_15;

/*
 * This class represent a [Rectangle] object
 */
public class Rectangle {

    private Double height;
    private Double width;
    private static int count = 0;

    public Rectangle() {
        count++;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        count++;
    }

    String printArea() {
        return "Area of this rectangle is: " + getArea();
    }
    
    String printPerimeter() {
        return "Perimeter of this rectangle is: " + getPerimeter();
    }

    //override [toString] to recieve index parameter [i] and show Rectangle details
    //such as [height], [width], [area] and [perimeter]
    public void toString(int i) {
        System.out.println("Rectangle N°" + (i + 1) + ": ");
        System.out.println("Height: " + this.getHeight());
        System.out.println("Width: " + this.getWidht());
        System.out.println(this.printArea());
        System.out.println(this.printPerimeter());
    }

    double getArea() {
        return this.height * this.width;
    }

    double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    double getHeight() {
        return this.height;
    }

    double getWidht() {
        return this.width;
    }

    void setHeight(double height) {
        this.height = height;
    }

    void setWidth(double width){
        this.width = width;
    }

    static int getCount() {
        return Rectangle.count;
    }
}