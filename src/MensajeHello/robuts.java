package MensajeHello;
import becker.robots.*;
/**
 *
 * @author BRIAN
 */
public class robuts {
    private  City ciudad;
    private  Thing figura;
    private  Robot robot;

    public robuts(City ciudad, Thing figura, Robot robot) {
        this.ciudad = ciudad;
        this.figura = figura;
        this.robot = robot;
    }
    
    public void advance(){
        this.robot.move();
    }
    
    public void advanceLeft(){
        this.robot.turnLeft();
    }
    
    public void advanceRight(){
        for (int i=0; i<3; i=i+1){
           this.robot.turnLeft();
           }
    
    }  
}
