package models;


public class Producto {
    
    private Integer id;		 
    private String nombre;	
    private int valorOferta;

    public Producto(Integer id, String nombre, int valorOferta) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.valorOferta = valorOferta;
    }
    
    public Producto(){
		
    }   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValorOferta() {
        return valorOferta;
    }

    public void setValorOferta(int valorOferta) {
        this.valorOferta = valorOferta;
    }
	
	
}