package servicios;

import entidades.Fabricante;
import java.util.Scanner;
import java.util.UUID;
import persistencia.FabricanteDAO;

public class FabricanteServicio {
    
    Scanner scan = new Scanner(System.in);
    private FabricanteDAO dao;

    public FabricanteServicio() {
        dao = new FabricanteDAO();
    }
    
    
    public void crearFabricante(){
        try{
            System.out.print("Nombre del fabricante: "); 
            String nombre = scan.next();
            System.out.print("Código del fabricante: ");
            int codigo = scan.nextInt();
            Fabricante f = new Fabricante();
            f.setNombre(nombre);
            f.setCodigo(codigo);
            f.setId(UUID.randomUUID().toString());
            dao.guardar(f); 
        }catch(Exception e){
            System.out.println("Error en crearFabricante de FabricanteServicio");
            throw e;
        }
          
    }
    
    public void imprimirFabricantes(){
        for(Fabricante aux : dao.listarFabricantes()){
            System.out.println(aux.toString());
        }
    }
    
    public void eliminarFabricanteId(String id){
        dao.eliminarFabricanteporId(id);
    }
}
