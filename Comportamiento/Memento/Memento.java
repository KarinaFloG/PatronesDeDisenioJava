import java.io.File;
 
/**
 * Clase en la cual se encapsula un recuerdo del archivo en el tiempo.
 * @author ManuelFrancisco
 */
public class Memento{
     
    /**
     * Archivo del cual se realiza backup a diario.
     */
    private File backup;
     
    /**
     * Constructor a tav&eacute;s del cual se inicializa el memento.
     * @param todayBackup
     */
    public Memento(File todayBackup) {
        this.backup = todayBackup;
    }
     
    /**
     * Devuelve el valor correspondiente al memento.
     * @return
     */
    public final File getSavedBackup() {
        return this.backup;
    }
}