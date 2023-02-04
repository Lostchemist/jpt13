import interfaces.Gato;
import interfaces.Hablador;
import interfaces.Perro;

public class MainInterfaces {

    private String name;

    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();

//        perro.habla();
//        perro.chilla();
//
//        gato.habla();
//        gato.chilla();
//        class MysqlUserManager implements UserManager { ... }

//        UserManager manager;


//
//        manager.listUsers();

        Hablador hablador;

        hablador = perro;
        hablador.habla();


        hablador = gato;
        hablador.habla();

    }
}
