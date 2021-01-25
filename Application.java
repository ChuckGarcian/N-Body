public class Application
{
   
    public static void play(Particle obj)
    {
        
        double x = 0;
        //Math math = new Math(1,1);
        while( x<1 )
        { 
         System.out.println("  ");   
         //System.out.println("Time Step = " + x);
         Phsyics.moveX(obj, x);
         obj.setVectMag(obj.getVectMag()-1);
         System.out.println(x + " "+ obj.getVectMag());
         //System.out.println("particle Pos y = " + obj.getPosY());
         x += .1;
         
         
        }
    }

   
   
    public static void main(String[] args) 
   {
    
        double vectorMag = 299792458.0;
        double vectorAngle = 0.0;
        Particle obj = new Particle(vectorMag,vectorAngle);
        System.out.println("vector magnitude: " + vectorMag);
        System.out.println("vector angle: " + vectorAngle);
        System.out.println("particle position: " + obj.getPosX());
        System.out.println(" ");
        play(obj);
        System.out.println("hello");

        
        
    }
}
