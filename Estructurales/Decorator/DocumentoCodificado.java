abstract class DocumentoCodificado extends Documento {
    private Documento documento;
    
    public DocumentoCodificado(Documento componente) {
        this.documento = componente;
    }
    public void operacion() {
        documento.operacion();
    }
}