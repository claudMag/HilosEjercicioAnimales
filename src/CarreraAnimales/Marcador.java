package CarreraAnimales;

public class Marcador {
    private int animalesEnMeta;

    public Marcador(){
        animalesEnMeta = 0;
    }

    public void incrementarPosicion(){
        animalesEnMeta++;
    }

    public int getAnimalesEnMeta(){
        return animalesEnMeta;
    }

}
