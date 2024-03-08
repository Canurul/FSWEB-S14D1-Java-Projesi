public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width, double length,double height){
        super(width,length);
        this.height = checkDimension(height);
    }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return getArea()*this.height;
    }
}
