package co.edu.uniquindio.repositorio.builders;
import co.edu.uniquindio.repositorio.Vehiculo;

public class VehiculoBuilder<T extends VehiculoBuilder<T>> {

    public String placa;
    public String marca;

    public T placa(String placa){
        this.placa = placa;
        return self();
    }
    public T marca(String marca){
        this.marca = marca;
        return self();
    }
    public T self(){
        return (T)this;
    }
    public Vehiculo build(){
        return new Vehiculo(this);
    }
}
