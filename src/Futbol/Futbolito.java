package Futbol;
import becker.robots.*;

public class Futbolito {
   private City Junín;
   private Robot osmarmen;
   private Thing balon;
   
     public Futbolito() {
        this.Junín = new City (10,10);
        this.osmarmen = new Robot(Junín,3,8,Direction.WEST);
        this.balon = new Thing(Junín,3,7);
        for(int i=0;i<5;i++){
          if(i==2){}else{
                 Wall muro = new Wall(Junín, i, 0, Direction.WEST);
          }       
       }   
       for(int i=0;i<5;i++){
         if(i==2){}else{
                 Wall muro = new Wall(Junín, i, 8, Direction.EAST);
         }
       }   
    }
   
   void style(){
       osmarmen.pickThing();
       this.balon = new Thing(Junín,3,6);  
   }
   void style2(){
       osmarmen.pickThing();
       this.balon = new Thing(Junín,2,6);  
   }
   void style3(){
       osmarmen.pickThing();
       this.balon = new Thing(Junín,2,5);  
   }
   void style4(){
       osmarmen.pickThing();
       this.balon = new Thing(Junín,2,4);  
   }
   void style5(){
       osmarmen.pickThing();
       this.balon = new Thing(Junín,1,4);  
   }
    void style6(){
       osmarmen.pickThing();
       this.balon = new Thing(Junín,1,3);  
   }
    void style7(){
        osmarmen.pickThing();
       this.balon = new Thing(Junín,1,2);  
    }
     void style8(){
        osmarmen.pickThing();
       this.balon = new Thing(Junín,2,2);  
    }
      void style9(){
        osmarmen.pickThing();
       this.balon = new Thing(Junín,2,1);  
    }
      void style10(){
        osmarmen.pickThing();
       this.balon = new Thing(Junín,2,0);  
    }
      void victory(){
         osmarmen.pickThing(); 
      }
   
      
   void advance(){
       this.osmarmen.move();
   }
   
   void advanceLeft(){
        this.osmarmen.turnLeft();
   }
 
    void advanceRigth() {
              
       this.osmarmen.turnLeft();
       this.osmarmen.turnLeft();
       this.osmarmen.turnLeft();
     
    }
    void regate(){
        osmarmen.pickThing();
    }
}
        
    