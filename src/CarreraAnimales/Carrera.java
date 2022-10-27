package CarreraAnimales;

public class Carrera {
    public static void main(String[] args) throws InterruptedException {
        Marcador marcador = new Marcador();

        HiloAnimal tortuga = new HiloAnimal("tortuga", Thread.MAX_PRIORITY, marcador);
        HiloAnimal liebre = new HiloAnimal("liebre", Thread.MIN_PRIORITY, marcador);
        HiloAnimal guepardo = new HiloAnimal("guepardo", Thread.NORM_PRIORITY, marcador);

        tortuga.start();
        liebre.start();
        guepardo.start();

    }
}
