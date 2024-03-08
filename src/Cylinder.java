public class Cylinder extends Circle{
    double height;
    public Cylinder(double radius, double height){
        super(radius);
        checkHeight(height);
    }
    public double checkHeight(double height){
        if(height < 0){
            this.height = 0;
        }else {
            this.height = height;
        }
        return this.height;
    }
    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getArea()*this.height;
    }
}
