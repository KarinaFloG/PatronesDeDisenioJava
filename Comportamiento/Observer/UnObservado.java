public class UnObservado extends Observado
{
    private String nombre = "";

    // ---------------------------------

    public UnObservado() {
    }

    // ---------------------------------

    public String getNombre() {
        return this.nombre;
    }

    // ---------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;

        // Enviarles la notificación a cada observador a través de su propio método
        this.notificarObservadores( nombre );
    }
}