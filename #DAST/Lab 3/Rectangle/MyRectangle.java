public class MyRectangle 
{
    private MyPoint p1;
    private MyPoint p2;
    
    public MyRectangle(MyPoint P1,MyPoint P2){
        this.p1=P1;
        this.p2=P2;
        
    }
    
    public double getWidth(){
        double width = Math.abs(p1.getX()-p2.getX());
        return width;
    }
    
    public double getHeight(){
        double height = Math.abs(p1.getY() - p2.getY());
        return height;
    }
    
    public double getSurface(){
        double surface = getHeight() * getWidth();
        return surface;
    }
    
}
