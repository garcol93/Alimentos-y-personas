import java.util.ArrayList;
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
    //comidas ingeridas
    private ArrayList<Comida> comidasTomadas;
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
        comidasTomadas = new ArrayList<>();
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
            comidasTomadas.add(comida);
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

    /**
     * metodo preguntar si la pregunta contiene el nombre o ya ha comido demasiado 
     * responde con la pregunta en mayus 
     * si la pregunta es divisible entre 3 dice "SI" si no "NO"
     */
    public String contestar(String pregunta)
    {
        String respuesta =""; 
        if(caloriasIngeridas >= metabolismoBasal || pregunta.contains(nombre))
        {
            respuesta = pregunta.toUpperCase();
        }
        else{
            if(pregunta.length()%3 == 0){
                respuesta= "SI";
            }
            else{
                respuesta ="NO";
            }
        }
        System.out.println(respuesta);
        return respuesta;
    }

    /**
     * devuelve el alimento mas calorico consumido hasta el momento si no se a consumido 
     * nada devuelve null
     */
    public String getAlimentoMasCaloricoConsumido()
    {
        String devolver= null;
        if(0<comidasTomadas.size())
        {
            Comida comidaMayor = comidasTomadas.get(0);
            for(int i=0; i<comidasTomadas.size();i++)
            {       
                if(comidaMayor.getCalorias() <= comidasTomadas.get(i).getCalorias())
                {
                    comidaMayor = comidasTomadas.get(i);
                }
            }
            devolver = comidaMayor.getNombreComida();
            System.out.println(devolver);
        }
        return devolver;
    }
}
