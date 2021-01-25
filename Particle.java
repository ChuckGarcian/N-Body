
public class Particle extends Vector
{
    // instance variables - replace the example below with your own
    private double posY;
    private double posX;
    private double mass;
    private double mag;
    private double angle;
    


    public Particle(double _mag, double _angle)
    {
        // initialise instance variables
        super(_mag , _angle);

        posY = 0;
        posX = 0;
        mass = 0;
        mag = _mag;
        angle = _angle;
    }
    
    public Particle(int _posY, int _posX, int _mass, int _mag, int _angle)
    {
        // initialise instance variables
         super(_mag , _angle);
         
        posY = _posY;
        posX = _posX;
        mass = _mass;
        mag = _mag;
        angle = _angle;
    }
    
    public double getPosX()
    {
        return posX;
    }
    
    public void setPosX(double newPosX)
    {
        posX = newPosX;
    }
    
    public double getPosY()
    {
        return posY;
    }
    
    public void setPosY(double newPosY)
    {
        posY = newPosY;
    }
   
    public double getMass()
    {
        return mass;
    }
    
    public void setMass(int newMass)
    {
        mass = newMass;
    }
}
