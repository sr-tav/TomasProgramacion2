package co.edu.uniquindio.repositorio;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        probarBuilder();
    }
    public static void probarBuilder(){
        Vehiculo vehiculo = Vehiculo.builder().marca("ZUZUKI").placa("01111").build();
        Vehiculo vehiculo2 = Vehiculo.builder().marca("Pepe").build();
        String[] vehiculos = {vehiculo.getMarca() + " -- " + vehiculo.getPlaca() + "\n", vehiculo2.getMarca() + " -- " + vehiculo2.getPlaca() + "\n"};
        JOptionPane.showMessageDialog(null, vehiculos);
    }
}
