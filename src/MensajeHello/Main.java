package MensajeHello;
import becker.robots.*;

public class Main {
    public static void main (String[] args)
	{
		City Junín = new City();
                Robot robot = new Robot(Junín, 1, 1, Direction.SOUTH);
                Robot robot1 = new Robot(Junín, 1, 7, Direction.WEST);
                Robot robot2 = new Robot(Junín, 1, 9, Direction.SOUTH);
                Robot robot3 = new Robot(Junín, 1, 13, Direction.SOUTH);
                Robot robot4 = new Robot(Junín, 1, 17, Direction.SOUTH);
                
                for(int i=1; i<12; i++){
                    Thing figura = new Thing(Junín,1, 1);
                    robot.pickThing();
                }

                for (int i=1; i<5; i++){
                    robot.putThing();
                    robot.move();
                }
                
                robot.putThing();
                robot.turnLeft();
                robot.move();
                robot.move();
                robot.turnLeft();
                               
                for (int i=1; i<5; i++){
                    robot.putThing();
                    robot.move();
                }
                robot.putThing();
                robot.turnLeft();
                robot.move();
                robot.turnLeft();
                robot.move();
                robot.move();
                robot.putThing();
                
                //Segunda letra
                
                for(int i=1; i<12; i++){
                    Thing figura1 = new Thing(Junín,1, 7);
                    robot1.pickThing();
                }
                for (int i=1; i<3; i++){
                    robot1.putThing();
                    robot1.move();
                }
                robot1.turnLeft();
                for (int i=1; i<5; i++){
                    robot1.putThing();
                    robot1.move();
                }
                robot1.turnLeft();
                for (int i=1; i<3; i++){
                    robot1.putThing();
                    robot1.move();
                }
                robot1.turnLeft();
                robot1.putThing();
                for (int i=1; i<3; i++){
                    robot1.move();
                }
                robot1.turnLeft();
                for (int i=1; i<3; i++){
                    robot1.putThing();
                    robot1.move();
                }
                
                //Tercera letra 
                for(int i=1; i<8; i++){
                    Thing figura2 = new Thing(Junín,1, 9);
                    robot2.pickThing();
                }
                for (int i=1; i<5; i++){
                    robot2.putThing();
                    robot2.move();
                }
                robot2.turnLeft();
                for (int i=1; i<4; i++){
                    robot2.putThing();
                    robot2.move();
                
                }
                //Cuarta letra 
                for(int i=1; i<8; i++){
                    Thing figura3 = new Thing(Junín,1, 13);
                    robot3.pickThing();
                }
                for (int i=1; i<5; i++){
                    robot3.putThing();
                    robot3.move();
                }
                robot3.turnLeft();
                for (int i=1; i<4; i++){
                    robot3.putThing();
                    robot3.move();
                 }
                //Quinta letra 
                for(int i=1; i<13; i++){
                    Thing figura4 = new Thing(Junín,1, 17);
                    robot4.pickThing();
                }
                for (int i=1; i<5; i++){
                    robot4.putThing();
                    robot4.move();
               
                }
                robot4.turnLeft();
                for (int i=1; i<3; i++){
                    robot4.putThing();
                    robot4.move();
}
                robot4.turnLeft();
                for (int i=1; i<5; i++){
                    robot4.putThing();
                    robot4.move();
                }
                robot4.turnLeft();
                for (int i=1; i<3; i++){
                    robot4.putThing();
                    robot4.move();
}
}
}