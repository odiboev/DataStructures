public class MyPoint
{
    private int X;
    private int Y;
    public MyPoint(int x, int y){
        this.X = x;
        this.Y = y;
    }
    
    public int getX(){
        return this.X;
    }
    
    public int getY(){
        return this.Y;
    }
    
    public void setX(int x){
        this.X = x;
    }
    
    public void setY(int y){
        this.Y = y;
    }
    
    public boolean equal(MyPoint otherPoint){
        boolean result;
        if(this.X == otherPoint.X && this.Y == otherPoint.Y){
            System.out.println("The points are same");
            result = true;
        }else{
            System.out.println("The points are not same");
            result = false;
        }
        
        return result;
    }
    
    public boolean equal2(MyPoint otherPoint){
        return (this.X == otherPoint.X && this.Y == otherPoint.Y);
    }
    
    public static void main(String[] args)
    {
        int x1 = 2;
        int y1 = 2;
        
        MyPoint p1 = new MyPoint(x1, y1);
        System.out.println("p1.x "+p1.getX());
        System.out.println("p1.y "+p1.getY());
        /*
        MyPoint p2 = p1;
        
        p2.setX(4);
        p1.setY(8);
        
        int x2 = 4;
        int y2 = 4;
        
        MyPoint p3 = new MyPoint(x2, y2);
        p1 = p3;
        MyPoint p4 = p1;
        p4.setX(4);
        p1 = p2;
        p1.setY(4);
        System.out.println(p2.equal(p3));
        */
    }
        
}