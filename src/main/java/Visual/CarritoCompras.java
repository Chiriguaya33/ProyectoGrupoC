/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visual;

import Control.AdmCarrito;
import Control.AdmCliente;
import Control.AdmCompras;
import Control.AdmInventario;
import Control.AdmVenta;
import Control.Exceptions;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import model.CarCompras;
import model.Catalogo;
import model.Inventario;


public class CarritoCompras extends javax.swing.JFrame {

    /**
     * Creates new form CarritoCompras
     */
    String nomb1; String ape1; String dir1; String telf1; String email1; int edad1=0;
    AdmCarrito adcrp;
    JPanel pan1 ,panft;
    AdmCompras advt = new AdmCompras();

    public CarritoCompras(String nomb, String ape, String dir, String telf, String email, int edad) {
        
            initComponents();
             Btrevertir.setEnabled(false);
            adcrp = new AdmCarrito();
           nomb1=nomb;  ape1=ape; dir1=dir; telf1=telf;  email1=email;  edad1=edad;
            /*
            FrmCompras fr = new FrmCompras();
            //CENTRAR VENTANA/////
            int anchoVentanaPrincipal = fr .getWidth();
            int altoVentanaPrincipal = fr.getHeight();
            
            // Calcula las coordenadas x e y para el centro de la ventana principal
            int x = fr.getX() + (anchoVentanaPrincipal - this.getWidth()) / 2;
            int y = fr.getY() + (altoVentanaPrincipal -this.getHeight()) / 2;
            
            // Establece las coordenadas de la ventana secundaria
            this.setLocation(x, y);
            */
            //////
            try {
            mostrarlista();//MUESTRA LA LISTA DEL CARRITO
        } catch (Exceptions ex) {
            Logger.getLogger(CarritoCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarritoCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

    private CarritoCompras() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenedor = new javax.swing.JPanel();
        elemt = new javax.swing.JPanel();
        pnfoto = new javax.swing.JPanel();
        lbnbele = new javax.swing.JLabel();
        btquitar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdescr = new javax.swing.JTextArea();
        txtbuscar = new javax.swing.JTextField();
        btbuscar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        Btrevertir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(350, 80));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Compras"));

        contenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista"));

        pnfoto.setBackground(new java.awt.Color(204, 255, 102));
        pnfoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnfotoLayout = new javax.swing.GroupLayout(pnfoto);
        pnfoto.setLayout(pnfotoLayout);
        pnfotoLayout.setHorizontalGroup(
            pnfotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );
        pnfotoLayout.setVerticalGroup(
            pnfotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        lbnbele.setText("elenom");

        btquitar.setText("Quitar");

        txtdescr.setEditable(false);
        txtdescr.setColumns(20);
        txtdescr.setRows(5);
        jScrollPane2.setViewportView(txtdescr);

        javax.swing.GroupLayout elemtLayout = new javax.swing.GroupLayout(elemt);
        elemt.setLayout(elemtLayout);
        elemtLayout.setHorizontalGroup(
            elemtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(elemtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnfoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btquitar)
                .addGap(31, 31, 31))
            .addGroup(elemtLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lbnbele)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        elemtLayout.setVerticalGroup(
            elemtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(elemtLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btquitar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(elemtLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(elemtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnfoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbnbele)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(elemt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(494, 494, 494))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addComponent(elemt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 190, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(contenedor);

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarKeyTyped(evt);
            }
        });

        btbuscar.setText("Buscar");
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Orden..." }));

        Btrevertir.setText("X");
        Btrevertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtrevertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btrevertir)
                        .addGap(20, 20, 20)
                        .addComponent(btbuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btrevertir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btbuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Carrito de Compras");

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Concretar Compra");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }

    public void borrarPaneles(){
        //ELIMINA TODOS LOS PANELES CREADOS EN EL PANEL "contendedor"
    for (Component componente :  contenedor.getComponents()) {
    if (componente instanceof JPanel ){
         contenedor.remove(componente);//SE ELIMINA LOS PANELES
        contenedor.revalidate(); // Actualiza el contenedor
        contenedor.repaint();//SE VUELVE A RECREAR
        contenedor.updateUI();//ACTUALIZA LA INTERFAZ PANEL
    
    }

}
    }
    
    ///METODO PARA BORRAR EL PANEL DEL PRODUCTO A ELIMINAR Y DE LA LIST TAMBIEN
    class RemItemActionListener implements ActionListener {
    private CarCompras item;//SE CREA UN OBJETO DE ESTA CLASE

    public RemItemActionListener(CarCompras item) {
        this.item = item;//AQUI LO RESIVE DE LA OTRA CLASE INSTANCIADA
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        try {
            //System.out.println(item.getIdelemnt());
            
            //System.out.println(  catalogo.getIdcata());
            if(adcrp.RemoverItem(item.getIdCarrito() ,item)==1){//ENVIA EL VALOR HACIA LA CLASE CORRESPONDIENTE Y UN OBJETO DE LA MISMA CLASE
       String nombrePanelAEliminar = item.getIdCarrito() + "";//VALOR PARA ELIMINAR EL PANEL CORRESPONDIENTE Y NO TODOS.
                
            
       for (Component componente : contenedor.getComponents()) {
        if (componente instanceof JPanel && nombrePanelAEliminar.equals(componente.getName())) {
                 contenedor.remove(componente);
                 contenedor.revalidate(); // Actualiza el contenedor
                 contenedor.repaint(); // Repinta el contenedor
                  break; // Si se encuentra y elimina un panel con el nombre, puedes salir del bucle
                    }
                    
                }
                
                JOptionPane.showMessageDialog(null, "Eliminado del carrito");
            }
        } catch (Exceptions ex) {
            Logger.getLogger(CarritoCompras.class.getName()).log(Level.SEVERE, null, ex);
        } 
            
        
    }
}
    
    public void componentes(CarCompras dt){
       //  contenedor.setLayout(new GridLayout(0,1,10,10));
       //  contenedor.remove(elemt); 
           int id=0;
          pan1= new JPanel();
         panft = new JPanel();
          lbnbele=new JLabel("xxxxxxxxx");
          txtdescr=new JTextArea();
          JLabel lbft = new JLabel();
          btquitar= new JButton("Remover");
          id=dt.getIdCarrito();
          btquitar.setName(id+"");//SE AGREGA UN TAG A LOS ELEMENTOS CREADO PARA IDENTIFICAR A QUE ELEMENTO DE LA LISTA PERTENCE
          pan1.setName(id+"");// LO MISMO CON EL PÁNEL UN TAG CON ID
          System.out.println(pan1.getName());
    btquitar.addActionListener(new RemItemActionListener(dt));
panft.setPreferredSize(new Dimension(100, 100));
            
     pan1.setBackground(new Color(107, 106, 104));
     txtdescr.setText( dt.getNombre().toUpperCase()+" \nDetalles: "+dt.getDetalles()+"\nCantidad: "
             +dt.getCantidad()+"\n Precio: $"+ dt.getPrecio());//DATOS A MOSTRAR 
     
     //CARGA DE LA IMAGEN PARA EL PANEL DE LA IMAGEN DEL PRODUCTO
    BufferedImage imagen = dt.img();
    if (imagen != null) {
        // Crea un ImageIcon con la imagen
        ImageIcon icono = new ImageIcon(imagen);
       lbft.setIcon(icono);//Se ingresa la imagen en el panel
    }
  //Agregacion de elementos a los paneles      
panft.add(lbft);
pan1.add( panft);
pan1.add(txtdescr);
pan1.add(btquitar);
contenedor.add(pan1);
contenedor.updateUI();
       
    }
    //MUESTRA LA LISTA DEL CARRITO
    public void mostrarlista() throws Exceptions, SQLException{
        contenedor.setLayout(new GridLayout(0,1,10,10));
         contenedor.remove(elemt);
         try{
              adcrp.Carrito();//CARGA LA LISTA DEL CARRITO EN UN LIST<CarCompras>
  if(!adcrp.carrito.isEmpty()){//SE VERIFICA QUE NO ESTE VACIA LA LISTA 
       
        for(CarCompras dt:adcrp.carrito){
           
        componentes(dt);//SE AGREGAN LOS PANELES Y DEMAS COMPONENTES PARA MOSRTAR LOS DATOS DE LA LISTA
   advt.IngresarPrecompra(dt);
            System.out.println(dt.getNombre());
   }
  }
         }catch(Exceptions e){
             //SE AGREGA UN PANEL Y UN LABEL PARA MOSTRAR QUE ESTA VACIO EL  CARRITO DE LA PERSONA
              lbnbele = new JLabel();
                 pan1 = new JPanel();   
              lbnbele.setText(e.getMessage());    
               pan1.add(lbnbele);
              contenedor.add(pan1);
     
  }
    
}
    //MUESTRA EL UNICO VALOR BUSCADO EN UN UNICO O VARIOS PANELES DADO EL CASO DE LA BUSQUEDA
    public void mostrarbusqueda(){
    
       borrarPaneles();
        contenedor.setLayout(new GridLayout(0,1,10,10));
       
  try {
        for(CarCompras dt:adcrp.BuscarItemcarrito(txtbuscar.getText())){
             componentes(dt);
        } 
        
        } catch (Exceptions ex) {
            Logger.getLogger(CarritoCompras.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
    
    
    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        
   if(!txtbuscar.getText().equals("")){
     mostrarbusqueda();
     }else{
         try {
             throw new Exceptions("Ingrese algun Nombre");
         } catch (Exceptions ex) {
             Logger.getLogger(FrmCompras.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, ex.getMessage());
         }
    }
        
    }//GEN-LAST:event_btbuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            
            FrmVenta fv = new FrmVenta(advt, nomb1, ape1, dir1,telf1,email1);
            fv.setVisible(true);
        } catch (Exceptions ex) {
            Logger.getLogger(CarritoCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    
         this.dispose();
        
        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtrevertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtrevertirActionPerformed
    //SE VUELVE A CARGAR LA LISTA COMPLETA LUEGO DE REALIZAR UNA BUSQUEDA
        try {
            adcrp = new AdmCarrito();
              borrarPaneles();
            mostrarlista();
            Btrevertir.setEnabled(false);
            txtbuscar.setText("");
        } catch (Exceptions ex) {
            Logger.getLogger(CarritoCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarritoCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_BtrevertirActionPerformed

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
       String datos=txtbuscar.getText();
        if(!datos.equals("")){
        Btrevertir.setEnabled(true);
      }else{
          Btrevertir.setEnabled(false);
      }
    }//GEN-LAST:event_txtbuscarKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
                 javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel" );
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CarritoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarritoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarritoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarritoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarritoCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btrevertir;
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton btquitar;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel elemt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbnbele;
    private javax.swing.JPanel pnfoto;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextArea txtdescr;
    // End of variables declaration//GEN-END:variables
}
