import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{
    public final int TIEMPO_NIVEL = 15;
    private Crab cangrejo;
    private Lobster langosta;
    private Counter contGusanos;
    private Counter vida;
    private Counter contTiempo;
    private SimpleTimer reloj;
    
    public CrabWorld()
    {    
        super(560, 560, 1); 
        contGusanos = new Counter("Gusanos:");
        addObject(contGusanos,64,20);
        prepare();
        contTiempo.setValue(TIEMPO_NIVEL);
        reloj = new SimpleTimer();
    }
    
    public void incrementaGusanos()
    { 
        //contGusanos.add(1);
    }
    
    public void started()
    {
        reloj.mark();
        System.out.println("Boton run presionado");
    }
    
    public void stopped()
    {
        System.out.println("Boton pause presionado");
    }
    
    public void act()
    {
        if(reloj.millisElapsed() > 1000)
        {
            contTiempo.add(-1);
            reloj.mark();
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Worm worm = new Worm();
        addObject(worm,187,316);
        Worm worm2 = new Worm();
        addObject(worm2,317,165);
        Worm worm3 = new Worm();
        addObject(worm3,514,291);
        Worm worm4 = new Worm();
        addObject(worm4,377,477);
        Worm worm5 = new Worm();
        addObject(worm5,159,455);
        Worm worm6 = new Worm();
        addObject(worm6,262,314);
        Worm worm7 = new Worm();
        addObject(worm7,64,161);
        Worm worm8 = new Worm();
        addObject(worm8,152,134);
        Worm worm9 = new Worm();
        addObject(worm9,484,100);
        Worm worm10 = new Worm();
        addObject(worm10,394,358);
        Lobster lobster = new Lobster();
        addObject(lobster,213,90);
        Crab crab = new Crab();
        addObject(crab,481,500);
    }
    //1. Mostrar mensaje "game over" cuando el reloj llegue a cero
    //2. Agregar un gusano nuevo aleatoriamente cada 3 segundos
}
