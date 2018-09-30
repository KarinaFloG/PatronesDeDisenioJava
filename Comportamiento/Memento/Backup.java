public class Backup{
     
    /**
     * Archivo del backup.
     */
    private File file;
     
    /**
     * M&eacute;todo el cual guarda el archivo como memento.
     * @return
     */
    public final Memento saveToMemento() {
        return new Memento(this.file);
    }
     
    /**
     * Recupera el archivo de backup desde un memento.
     * @param memento
     */
    public final void restoreFromMemento(Memento memento) {
        this.file = memento.getSavedBackup();
    }
 
    public File getFile() {
        return file;
    }
 
    public void setFile(File file) {
        this.file = file;
    }
}