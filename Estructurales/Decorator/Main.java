public class Main {
    public static void main(String[] args) {
        Documento c = new Documento();
        DecoradorConcretoA d1 = new DecoradorConcretoA(c);
        DecoradorConcretoB d2;
        d2 = new DecoradorConcretoB(d1);
        d2.operacion();
        d2.close();
    }
}