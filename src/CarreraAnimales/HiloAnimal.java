package CarreraAnimales;

import java.util.concurrent.Semaphore;

public class HiloAnimal extends Thread {
    private  Marcador marcador;
    private Semaphore semaforo;
    public HiloAnimal(String nombre, int prioridad, Marcador marcador, Semaphore semaforo){
        setName(nombre);
        setPriority(prioridad);
        this.marcador = marcador;
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            int a = 0;
        }
        try{
            semaforo.acquire();
            marcador.incrementarPosicion();
            System.out.println("Soy: "+getName()+" y he llegado en la "+marcador.getAnimalesEnMeta()+" posición");
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        semaforo.release();
    }
}
