public class Vector
{
    private double mag;
    private double angle;
    public Vector(double _mag, double _angle)
    {
     mag = _mag;
     angle = _angle;
    }
    public double getVectMag()
    {
     return mag;
    }  
    public double getVectAngle()
    {
     return angle;
    }
    
    public void setVectMag(double newMag)
    {
        mag = newMag;
    }
}
