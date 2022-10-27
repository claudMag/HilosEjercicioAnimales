package CarreraAnimales;

import java.util.concurrent.Semaphore;

public class Carrera {
    public static void main(String[] args)  {
        Marcador marcador = new Marcador();
        //1 proceso de la sección crítca
        Semaphore semaforo = new Semaphore(1);

        HiloAnimal tortuga = new HiloAnimal("tortuga", Thread.NORM_PRIORITY, marcador, semaforo);
        HiloAnimal liebre = new HiloAnimal("liebre", Thread.NORM_PRIORITY, marcador, semaforo);
        HiloAnimal guepardo = new HiloAnimal("guepardo", Thread.NORM_PRIORITY, marcador, semaforo);

        tortuga.start();
        liebre.start();
        guepardo.start();


    }
}
