package persistencia;

import entidades.Fabricante;
import java.util.ArrayList;
import java.util.List;

public final class FabricanteDAO extends DAO{
  
    public void guardar(Fabricante fabricante) {
        super.guardar(fabricante);
    }

    
    public Fabricante buscarFabricantePorNombre(String nombre){
        try{
            conectar();
            Fabricante fabricante = (Fabricante) em.createQuery("SELECT f FROM Fabricante f WHERE f.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getSingleResult();
            desconectar();
            return fabricante;
        }catch(Exception e){
            System.out.println("Error en imprimirNombreFabricante de FabricanteDAO");
            throw e;
        }
    }
    
     public List<Fabricante> listarFabricantes() {
        conectar();
        List<Fabricante> personas = em.createQuery("SELECT f FROM Fabricante f").getResultList();
        desconectar();
        return personas;
    }
    
     public void eliminarFabricanteporId(String id){
         try{
            conectar();
            Fabricante fabricante = (Fabricante) em.createQuery("SELECT f FROM Fabricante f WHERE f.id LIKE :id")
                .setParameter("id", id).getSingleResult();
            eliminar(fabricante);
            desconectar();
         }catch(Exception e){
             System.out.println("Error en eliminarFabricanteporId de FabricanteDAO");
             throw e;
         }
         
     }
     
     public List<String> listarNombresFabricantes(){
         try{
             conectar();
             List<String> nombres = em.createQuery("SELECT f.nombre FROM Fabricante f").getResultList();
             desconectar();
             return nombres;
         }catch(Exception e){
             System.out.print("Error en listarNombresFabricantes de FabricanteDAO");
             throw e;
         }
     }
}
