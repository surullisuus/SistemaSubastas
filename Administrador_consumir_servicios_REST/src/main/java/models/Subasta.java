package models;


public class Subasta {
    
    private Integer productId;
    private Boolean abierto;
    private Integer valorSubasta;

    public Subasta(Integer productId, Boolean abierto, Integer valorSubasta) {
        super();
        this.productId = productId;
        this.abierto = abierto;
        this.valorSubasta = valorSubasta;
    }
    
    public Subasta(){
		
    }   

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Boolean getAbierto() {
        return abierto;
    }

    public void setAbierto(Boolean abierto) {
        this.abierto = abierto;
    }

    public Integer getValorSubasta() {
        return valorSubasta;
    }

    public void setValorSubasta(Integer valorSubasta) {
        this.valorSubasta = valorSubasta;
    }

	
}