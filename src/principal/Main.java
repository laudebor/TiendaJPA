package principal;

import servicios.FabricanteServicio;

public class Main {

    public static void main(String[] args) {
        
        FabricanteServicio fs = new FabricanteServicio();
        //fs.crearFabricante();
        
       // fs.eliminarFabricanteId("5a7607c7-5cf1-405b-8da3-3cb81cc82c90");
        //fs.imprimirFabricantes();
        fs.imprimirNombresFabricantes();
    }
    
}
