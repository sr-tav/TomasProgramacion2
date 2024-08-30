package co.edu.uniquindio.repositorio;

public class Moto extends Vehiculo{
    private double maxVelocidad;
    /**
     * Constructor  privado de la clase vehiculo
     * @param placa
     * @param marca
     */
    private Moto(MotoBuilder builder) {
        super(builder);
        this.maxVelocidad = builder.maxVelocidad;
    }
    
    public double getMaxVelocidad() {
        return maxVelocidad;
    }
}
