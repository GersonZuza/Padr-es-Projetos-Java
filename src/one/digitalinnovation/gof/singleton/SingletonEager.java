package one.digitalinnovation.gof.singleton;

/*
 * Singleton "apressado".
 * @author Gerson Zuza
 *
 * */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }
    public static SingletonEager getInstacia() {
        return instancia;
    }
}
