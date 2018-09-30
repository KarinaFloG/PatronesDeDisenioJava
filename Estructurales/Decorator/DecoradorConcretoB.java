class DecoradorConcretoB extends DocumentoCodificado {

    public DecoradorConcretoB(Documento componente) {
        super(componente);
    }

    public void operacion() {
        super.operacion();
        System.out.println("Contando lineas del documento");
    }
    
}