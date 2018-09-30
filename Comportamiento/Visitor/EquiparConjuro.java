import java.util.List;

public class EquiparConjuro implements IVisitor{
    
    public void visit(Mago m){
        if( m.getNivelMagia() <= 5 ){
            m.setConjuro("Bola de Fuego");
        }else{
            m.setConjuro("Rayo de hielo");
        }
    }

    public void visit( Guerrero g){
    }


    public void visit( List<IPersonaje> personajes){
        for( IPersonaje p : personajes ){
            p.accept(this);
        }
    }
}