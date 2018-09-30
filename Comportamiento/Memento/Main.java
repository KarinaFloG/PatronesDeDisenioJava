import java.io.File;
 
/**
 * Clase Main para hacer una muestra de como usar memento.
 * @author ManuelFrancisco
 */
public class Main {
 
    public static void main(String[] args) {
        /*
         * Se crea una instancia de nuestra clase encargada de administrar los
         * memento.
         */
        Caretaker caretaker = new Caretaker();
 
        /*
         * Creamos nuestros respectivos backups.
         */
        Backup backup1 = new Backup();
        backup1.setFile(new File("C:/backup-2015-12-14.txt"));
 
        Backup backup2 = new Backup();
        backup2.setFile(new File("C:/backup-2015-12-15.txt"));
 
        /*
         * Adicionamos los memento.
         */
        caretaker.addMemento("2015-12-14", backup1.saveToMemento());
        caretaker.addMemento("2015-12-15", backup2.saveToMemento());
 
        /*
         * Obtenemos los memento.
         */
        Memento memento1 = caretaker.getMemento("2015-12-14");
        Memento memento2 = caretaker.getMemento("2015-12-15");
 
        /*
         * Obtenemos los valores guardados en nuestros memento.
         */
        File file1 = memento1.getSavedBackup();
        File file2 = memento2.getSavedBackup();
    }
}