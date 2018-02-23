
/**
 * Write a description of class Comida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comida
{
    //nombre comida    
    private String nombreComida;
    //calorias comida sin decimales
    private int calorias;

    /**
     * Constructor for objects of class Comida
     */
    public Comida(String nombreComida , int calorias)
    {       
        this.nombreComida = nombreComida;
        this.calorias = calorias;
    }

    /**
     * devuelve calorias comida
     */
    public int getCalorias()
    {
        return calorias;
    }
}
