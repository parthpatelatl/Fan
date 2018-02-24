/*
* Course: CS 1302
* Name: Parth Patel
*/

package fan;



public class Fan {
    
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3; 
    
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    //Creating a default fan
    public Fan(){
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    
    //Assesors and Mutators
    public int getSpeed(){
        return speed;
    }
    
    public void setSpeed(int mSpeed){
        speed = mSpeed;
    }
    
    public boolean getOn(){
        return on;
    }
    
    public void setOn(boolean mOn){
       on = mOn;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double mRadius){
        radius = mRadius;
    }
    
    public String getString(){
        return color;
    }
    
    public void setString(String mColor){
        color = mColor;
    }
    
    //toString method for fan objects that changes whether the fan is on or off
    @Override
    public String toString(){
      
        if (getOn()){
            return "This fan is on and on setting: " + speed + "\n" + "The radius of the fan is: " + radius + "\n" + "The color of the fan is: " + color;
        
        } else {
            return "This fan is not on." + "\n" + "The radius of the fan is: " + radius + "\n" + "The color of the fan is: " + color;
        }
       
   }
    
}
