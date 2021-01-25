import java.lang.*;

public final class Phsyics
{
    // instance variables - replace the example below with your own
    private int vel;
    private int accel;
    public Phsyics(int _vel, int _accel)
    {
        vel = _vel;
        accel = _accel;
    }

    public static void moveX(Particle particle, double time)
    {
     double mag = particle.getVectMag();
     double angle = Math.toRadians(particle.getVectAngle());
     double posx = particle.getPosX();
     double posy = particle.getPosY();
     double xComp = (mag*Math.cos(angle));
     double yComp = (mag*Math.sin(angle));
     //System.out.println("cos(angle) degrees = " + particle.getVectAngle());
      //System.out.println("cos(angle) radians = " + angle);
     particle.setPosX(posx + xComp*time);
     particle.setPosY(posy + yComp*time);
     
     
    }
} 
/*
System.out.println("cos(angle) degrees = " + particle.getVectAngle());
System.out.println("cos(angle) radians = " + angle);
     System.out.println("vect mag = " + mag);
     System.out.println("magnitude of horzontal component " + mag*angle);
     */
     
     