
public class Carrera
{
    private String nombre;
    private Integer distancia;
    
    Carrera(String nombre,Integer distan){
    this.nombre=nombre;
    this.distancia=distan;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDistancia(Integer distancia){
    this.distancia=distancia;
    }
    public String getNombre(){
        return this.nombre;
    }
    public Integer getDistancia(){
        return this.distancia;
    }
}
