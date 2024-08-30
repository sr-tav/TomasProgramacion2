package co.edu.uniquindio.repositorio;

import co.edu.uniquindio.repositorio.builders.VehiculoBuilder;

public class Vehiculo {

    protected String placa;
    protected String marca;

    /**
     * Constructor  privado de la clase vehiculo
     * @param placa
     * @param marca
     */
    public Vehiculo(VehiculoBuilder<?> builder) {
        this.placa = builder.placa;
        this.marca = builder.marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public static VehiculoBuilder<?> builder(){
        return new VehiculoBuilder<>();
    }
}
