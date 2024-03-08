public class Rectangle {
    private double width;
    private double length;
    public Rectangle(double width, double length){
        this.width = checkDimension(width);
        this.length = checkDimension(length);

    }
    public double checkDimension(double value){
       return value < 0 ? 0 : value;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return this.length*this.width;
    }
}
