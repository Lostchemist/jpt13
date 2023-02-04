package interfaces;

public class Gato implements Hablador, Movil{
    @Override
    public void habla() {
        System.out.println("miau");

    }

    @Override
    public void chilla() {
        System.out.println("MIAU");
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
