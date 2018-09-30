import java.util.HashMap;
import java.util.Map;
 
/**
 * Clase encargada de conservar los memento.
 * @author ManuelFrancisco
 */
public class Caretaker {
 
    /**
     * Estructura de datos la cual se encarga de conservar los backups.
     */
    private static final Map<String, Memento> BAKUPS = new HashMap<>();
 
    /**
     * M&eacute;todo a trav&eacute;s del cual se guardan los memento en nuestra
     * estructura de dato.
     * @param day     Fecha del d&iacute;a en formato yyyy-MM-dd.
     * @param memento Memento portador del backup.
     */
    public final void addMemento(String day, Memento memento) {
        BAKUPS.put(day, memento);
    }
 
    /**
     * M&eacute;todo a trav&eacute;s del cual es posible obtener un memento.
     * @param day Fecha del d&iacute;a en formato yyyy-MM-dd.
     * @return
     */
    public final Memento getMemento(String day) {
        return BAKUPS.get(day);
    }
}