/*
* Course: CS 1302
* Name: Parth Patel
*/

package fan;

public class TestFan {

    
    public static void main(String[] args) {
        
        //Creating 2 fan objects
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        
        //Settings for fan1
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setString("yellow");
        fan1.setOn(true);
        
        //Settings for fan2
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setString("blue");
        fan2.setOn(false);
        
        //Printing out data for each fan object
        System.out.println("Fan 1 " + "\n" + fan1);
        System.out.println();
        System.out.println("Fan 2 " + "\n" + fan2);
        
        
    }
    
}
