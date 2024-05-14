package co.edu.uniquindio.poo;

public class Puesto {
    
    public String numPuesto;
    private boolean [][] puestos;
    
    public Puesto(String numPuesto, int filas, int columnas){
        this.numPuesto = numPuesto;

    
    }
    public void crearpuestos(int filas, int columnas){
        puestos = new boolean[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                puestos[i][j] = false;
            }
        }
    }

    public void verificarPuestoOcupado(Carro carro, int filas, int columnas){
        
    }





}
    

