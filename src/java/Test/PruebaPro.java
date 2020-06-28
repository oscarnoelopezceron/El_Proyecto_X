
package Test;
import DAO.*;
import Model.*;
import java.util.List;

/**
 *
 * @author PC
 */
public class PruebaPro {
    public static void main(String[] args) {
        PruebaPro evaluar = new PruebaPro();
        evaluar.listarProductos();
        evaluar.edidarProductos();
    }

    public void listarProductos() {
        ProductoDAO producto = new ProductoDAOImplementar();
        //CategoriaDAO categoria = new CategoriaDAOImplementar();
        List<Producto> listar = producto.Listar();
        //List<Categoria> listar1 = categoria.Listar();
        
        System.out.println("LISTADO DE PRODUCTOS: ");
        for(Producto productoListar : listar){
            System.out.println("ID: "+productoListar.getId_producto()+
                               " NOMBRE: "+productoListar.getNom_producto()+
                               " STROCK: "+productoListar.getStock()+
                               " PRECIO: "+productoListar.getUnidad_de_medida()+
                               " ESTADO DEL PRODUCTO: "+productoListar.getEstado_producto()+
                               " CATEGORIA: "+productoListar.getCategoria()+
                               " DESCRIPCION DEL PRODUCTO: "+productoListar.getDes_producto()+
                               " FECHA DE ENTRADA: "+productoListar.getFecha_entrada()
            );
    
        }
    }
    
    public void edidarProductos(){
        ProductoDAO producto = new ProductoDAOImplementar();
        Producto pro_edit = producto.editarPro(3);
        System.out.println("PRODUCTOS MODIFICAR: ");
        System.out.println("ID: "+pro_edit.getId_producto()+
                           " NOMBRE: "+pro_edit.getNom_producto()+
                           " STOSCK: "+pro_edit.getStock()+
                           " PRECIO: "+pro_edit.getPrecio()+
                           " ESTADO DEL PRODUCTO: "+pro_edit.getEstado_producto()+
                           " CATEGORIA: "+pro_edit.getCategoria()+
                           " DESCIRPCION: "+pro_edit.getDes_producto()+
                           " FECHA: "+pro_edit.getFecha_entrada()
                );
                
    }
    
}
