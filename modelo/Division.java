package modelo;

public class Division extends Operacion
{
    // Cosntructor
    public Division(double x, double y)
    {
        super(x, y);
    }

    // Métodos
    public void dividir ()
    {
        resultado = x / y;
    }
    
}
