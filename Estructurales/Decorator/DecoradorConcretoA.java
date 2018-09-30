class DecoradorConcretoA extends DocumentoCodificado {

    public DecoradorConcretoA(Documento componente) {
        super(componente);
    }

    public void operacion() {
        super.operacion();
        System.out.println("Separador al documento");
    }
    
}