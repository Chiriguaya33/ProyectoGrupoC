
package Control;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import model.CarCompras;
import model.Compra;
import model.ConexionBD;



public class AdmCarrito {
    CarCompras crp;
   public  List<CarCompras> carrito = new ArrayList<>();
int idProducto=0;int resultado=0, valor=0;
    public List<CarCompras> Carrito()throws Exceptions, SQLException{
    	
    	
        //CONSULTA HACIA LA BASE DE DATOS ENTRE LAS TABLAS CLIENTE INVENTARIO Y CARRITO
         String query = "SELECT C.ID_cliente,C.ID_DetallesProd, I.NombreProducto, DP.Descripcion, I.Imagen , ID_producto, c.ID_carrito,c.cantidad "
                 + ",i.PrecioUnitario FROM Carrito AS C "
                 + "JOIN INVENTARIO AS I ON C.ID_Producto = I.ID_Invent "
                 + "JOIN Detalles_productos AS DP ON C.ID_DetallesProd = DP.ID_DetallesPRD";
        
         try (Connection conn = ConexionBD.conectar();//CONEXION HACIA LA BD
             PreparedStatement stmt = conn.prepareStatement(query);
           ) {
              ResultSet rs = stmt.executeQuery();
            if(!rs.next()){
                throw new  Exceptions("El carrito esta vacio");
            }else{
                rs = stmt.executeQuery();
            while (rs.next()) {//RECORRIDO DE DATOS
               crp= new CarCompras();
             crp.setIdCarrito(rs.getInt("ID_carrito"));
             crp.setIdUsua(rs.getInt("ID_cliente")); 
             crp.setIdelemnt(rs.getInt("ID_producto")); 
               crp.setNombre(rs.getString("NombreProducto")); 
                crp.setDetalles(rs.getString("Descripcion")); 
              crp.setCantidad(rs.getInt("cantidad"));
              crp.setPrecio(rs.getFloat("PrecioUnitario"));
              crp.setIddetalle(rs.getInt("ID_DetallesProd"));
               byte[] imagenBytes=rs.getBytes("Imagen");
               
               BufferedImage imagen = null;
               
        if (imagenBytes!= null) {
            try {
                ByteArrayInputStream bis = new ByteArrayInputStream(imagenBytes);
                imagen = ImageIO.read(bis);
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }crp.setBufferedImage(imagen);
                carrito.add( crp);
            }
            }
        } catch (SQLException e) {
            e.printStackTrace();
              JOptionPane.showMessageDialog(null,  e.getMessage());
        }
   
        
        
        
        return carrito;
        
        
    }
    public CarCompras carconcep(){
        return crp;
    }
    public void IngresarItemCarrito(int IDCatalogo, int cantidad, int idcliente) throws Exceptions, SQLException{
       
    	
    	
    //METODO QUE INGRESADO LOS ITEM A LA CLASE CARRITO
         String sql = "INSERT INTO Carrito (ID_Cliente, ID_Producto, ID_DetallesProd,cantidad) VALUES (?, ?, ?, ?)";

         
    
    //CONSULTA HACIA LA BD PARA INGRESAR DATOS EN TABLA CARRITO
     
                //CONSULTAR LOS DATOS DE CATALOGO POR ID
                String consultaCatalogo = "SELECT Producto, Detalle_Producto FROM CATALOGO_PRODUCTO WHERE ID_cata = ?";
            try ( Connection conn = ConexionBD.conectar();
                    PreparedStatement statement = conn.prepareStatement(consultaCatalogo)) {
                statement.setInt(1, IDCatalogo);
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    int idProducto = resultSet.getInt("Producto");
                    int idDetalleProducto = resultSet.getInt("Detalle_Producto");
                    
                    
                    
     //INGRESA LSO DATOS EN EL CARRITO SEGUN DATOS PEDIDOS
                  
                    String insertCarrito = "INSERT INTO Carrito (ID_cliente, ID_producto, ID_detallesProd, cantidad) VALUES (?, ?, ?, ?)";
                    try (PreparedStatement insertStatement = conn.prepareStatement(insertCarrito)) {
                        insertStatement.setInt(1, idcliente);
                        insertStatement.setInt(2, idProducto);
                        insertStatement.setInt(3, idDetalleProducto);
                         insertStatement.setInt(4, cantidad);
                        int filasAfectadas = insertStatement.executeUpdate();
                        if (filasAfectadas > 0) {
                            System.out.println("Datos agregados a la tabla Carrito.");
                        } else {
                     
                            throw new Exceptions( "No se pudieron agregar los datos a la tabla Carrito.");
                        }
                    }
                } else {
                    throw new Exceptions("No se encontró el ID_cata en la tabla CATALOGO_PRODUCTO.");
                }

                
                 } catch (SQLException e) {
            e.printStackTrace();
        }

        
        
    }
    
    public List<CarCompras> BuscarItemcarrito(String Buscar)throws Exceptions{
        
         boolean encontrado = false;
         List<CarCompras> valoresEncontrados = new ArrayList<>();
         String valor="";
        for (CarCompras item : carrito) {
            if (item.getNombre().toLowerCase().contains(Buscar.toLowerCase())) {
                encontrado = true;
               
                valoresEncontrados.add(item);
                valor=item.getNombre();
                break;
            }
             
        }

        
        
        // Verificar si se encontró el elemento
        if (!encontrado) {
            throw new Exceptions("Elemento no encontrado en el carrito."+valor+" : "+Buscar);
            
            
        } else 
            System.out.println("Item encontrado: "+valor);
        return valoresEncontrados;
        
        
    }
    
    
    
    public int RemoverItem(int idCarrito, CarCompras elem) throws Exceptions{
         int elemento=0;
            String sentenciaSQL = "DELETE FROM Carrito WHERE ID_carrito = ?";
            try (Connection conn = ConexionBD.conectar();
                    PreparedStatement statement = conn.prepareStatement(sentenciaSQL)) {
                statement.setInt(1, idCarrito);
                int filasAfectadas = statement.executeUpdate();

                if (filasAfectadas > 0) {
                    elemento=elem.getIdCarrito();
                    carrito.remove(elem);
                     System.out.println("Item  del carrito id:" +elemento);
                   return 1;
                } else{
                    throw new Exceptions("No se pudo quitar el objeto de la lista");
            
                }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
            return 0;
    }
    
    
       
    
    
    
}
