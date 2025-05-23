package classes;

public enum CategoriaIngresso {
    
    PISTA("Pista"),
    VIP("Vip"), 
    CAMAROTE("Camarote");
    
    private String categoria;
    
    CategoriaIngresso(String categoria){
        this.categoria = categoria;
    }

    public String getCategoria() {
        return this.categoria;
    }
    
}
