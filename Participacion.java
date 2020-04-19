import java.util.*;
public class Participacion
{
    private Automovil automovil;
    private Carrera carrera;
    private Integer velInicial;
    private Float velMax;
    private Integer posicion;
    
    Participacion(Automovil auto,Carrera carrera,Integer velInicial,Float velMax,Integer posicion){
        this.automovil=auto;
        this.carrera=carrera;
        this.velInicial=velInicial;
        this.velMax=velMax;
        this.posicion=posicion;
    }
    public void setAutomovil(Automovil auto){
        this.automovil=auto;
    }
    public void setCarrera(Carrera carrera){
        this.carrera=carrera;
    }
    public void setVelIncial(Integer velocidad){
    this.velInicial=velocidad;
    }
    public void setVelMax(Float velocidad){
        this.velMax=velocidad;
    }
    public void setPosicion(Integer posi){
    this.posicion=posi;
    }
    public Automovil getAutomovil(){
        return this.automovil;
    }
    public Carrera getCarrera(){
        return this.carrera;
    }
    public Integer getVelInicial(){
        return this.velInicial;
    }
    public Float getVelMax(){
        return this.velMax;
    }
    public Integer getPosicion(){
        return this.posicion;
    }
}
