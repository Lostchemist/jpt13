package interfaces;

public class Perro implements Hablador, Movil{
    @Override
    public void habla() {
        System.out.println("guau");
    }

    @Override
    public void chilla() {
        System.out.println("GUAU");
    }

    @Override
    public void anda() {

    }

    @Override
    public void para() {

    }

    @Override
    public void corre() {

    }
}
