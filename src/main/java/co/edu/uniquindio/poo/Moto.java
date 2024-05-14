package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {
    
    public String limiteVelocidad;
    public TipoMoto tipoMoto;
    public Moto(String placa,  String modelo,  int tarifa, String limiteVelocidad, TipoMoto tipoMoto){
    super(placa, modelo, tarifa);
    this.limiteVelocidad = limiteVelocidad;
    this.tipoMoto = tipoMoto;
    
    }
        
    
    
}
