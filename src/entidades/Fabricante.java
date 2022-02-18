package entidades;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fabricante implements Serializable {
    
    @Id
    private String id;
    private int codigo;
    private String nombre;

    public Fabricante() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        //this.id = UUID.randomUUID().toString();
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Producto)) {
            return false;
        }
        Fabricante other = (Fabricante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fabricante{" + "id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
   
    
}
