package CarreraAnimales;

public class HiloAnimal extends Thread {
    private  Marcador marcador;

    public HiloAnimal(String nombre, int prioridad, Marcador marcador){
        setName(nombre);
        setPriority(prioridad);
        this.marcador = marcador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            int a = 0;
        }
        marcador.incrementarPosicion();
        System.out.println("Soy: "+getName()+" y he llegado en la "+marcador.getAnimalesEnMeta()+" posición");
    }
}
