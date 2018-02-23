
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // nombre persona
    private String nombre;
    //true si hombre false si mujer
    private boolean hombre;
    //peso en kilos
    private int kg;
    //altura en cm
    private int cm;
    //años persona
    private int edad;
    //calorias consumidad
    private int caloriasIngeridas;
    //metabolismo basal
    private int metabolismoBasal;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre,boolean esHombre, int kg, int alturaCm, int edad)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.hombre = esHombre;
        this.kg = kg;
        this.cm = alturaCm;
        this.edad = edad;
        caloriasIngeridas = 0;       
        if(hombre)
        {
            metabolismoBasal = (10*kg)+(6*cm)+(5*edad)+5;
        }
        else{
            metabolismoBasal = (10*kg)+(6*cm)+(5*edad)-161;
        }
    }

    /**
     * metodo da de comer 
     */
    public int comer(Comida comida)
    {       
        int devolver = -1;
        if (caloriasIngeridas <= metabolismoBasal)
        {
            devolver = comida.getCalorias();
            caloriasIngeridas += comida.getCalorias();
        }        
        return devolver;
    }

    /**
     *  metodo devuelve numero de calorias comidas
     */
    public int getCaloriasIngeridas()
    {
        return caloriasIngeridas;
    }
    
}
