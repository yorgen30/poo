
public class Automovil
{
   private Marca marca;
   private String nombre;
   private Integer aceleracion;
   
   Automovil(Marca marca,String nombre,Integer ac){
       this.marca=marca;
       this.nombre=nombre;
       this.aceleracion=ac;
    }
    Automovil(){}
   
   public void setMarca(Marca marca){
       this.marca=marca;
   }
   public void setNombre(String nombre){
       this.nombre=nombre;
   }
   public void setAceleracion(Integer aceleracion){
       this.aceleracion=aceleracion;
   }
   public Marca getMarca(){
    return this.marca;
    }
    public String getNombre(){
    return this.nombre;
    }
    public Integer getAceleracion(){
        return this.aceleracion;
    }
}
