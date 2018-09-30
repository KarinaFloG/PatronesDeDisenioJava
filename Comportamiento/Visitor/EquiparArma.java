import java.util.List;

public class EquiparArma implements IVisitor{

    public void visit( Mago m ){
        m.setArma("DAGA");
    }

    public void visit( Guerrero g ){
        g.setArma("ESPADA");
    }

    public void visit( List<IPersonaje> personajes){
        for( IPersonaje p : personajes ){
            p.accept(this);
        }
    }
}