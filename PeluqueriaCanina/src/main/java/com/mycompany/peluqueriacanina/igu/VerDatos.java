package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerDatos extends javax.swing.JFrame {

    //importo controladora para pedir info a la BD
    Controladora control = null;
    
    public VerDatos() {
        control = new Controladora();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascota = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Visualizacion de datos");

        tablaMascota.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascota);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Datos de las mascotas:");

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\broom (1).png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\edit-gdb416208b_640 (1).png")); // NOI18N
        btnEditar.setText("Editar:");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //crea un evento cuando el programa trae la ventana y hacemos un metodo para ver la tabla
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        cargarTabla();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        //controlo que la tabla no este vacia
        if (tablaMascota.getRowCount() > 0) {
            
            //controlo seleccion de la mascota
            if (tablaMascota.getSelectedRow() != -1) {
                
                //obtengo la ID de la mascota a eliminar
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascota.getValueAt(tablaMascota.getSelectedRow(), 0)));
                //llamo al metodo
                control.borrarMascota(num_cliente);
                
                //aviso al usuario
                mostrarMensaje("Mascota eliminada correctamente", "info", "Borrado de mascota");
                cargarTabla();
            }
            else {
                mostrarMensaje("No selecciono ninguna mascota", "Error", "Error al eliminar");
            }
        }
        else {
            mostrarMensaje("No hay nada para eliminar", "Error", "Error al eliminar");
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        //controlo que la tabla no este vacia
        if (tablaMascota.getRowCount() > 0) {
            
            //controlo seleccion de la mascota
            if (tablaMascota.getSelectedRow() != -1) {
                
                //obtengo la ID de la mascota a editar
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascota.getValueAt(tablaMascota.getSelectedRow(), 0)));
                
                ModificarDatos pantallaModif = new ModificarDatos(num_cliente);
                pantallaModif.setVisible(true);
                pantallaModif.setLocationRelativeTo(null);
                
                this.dispose();
                
            }
            else {
                mostrarMensaje("No selecciono ninguna mascota", "Error", "Error al editar");
            }
        }
        else {
            mostrarMensaje("No hay nada para editar", "Error", "Error al editar");
        }
        
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    public void mostrarMensaje (String mensaje, String tipo, String titulo){
        
        //muestra una ventana con un mensaje
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("info")){
            optionPane.setMessage(JOptionPane.INFORMATION_MESSAGE);
        }else if (tipo.equals("Error")){
            optionPane.setMessage(JOptionPane.ERROR_MESSAGE);
        }
        
        //lo que aparece en la barra de arriba
        JDialog dialog = optionPane.createDialog(titulo);
        //posicion
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascota;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
        
        //Definir el modelo de la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel(){
        
            //filas y columnas no editables
            @Override
            public boolean isCellEditable (int row, int colum){
                return false;
            }
        
        };
        
        //establesemos nombre de las columnas
        String titulos [] = {"Num", "Nombre", "Color", "Raza", "Alergico", "At. Esp.", "Dueñio", "Cel"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //carga de los datos desde la BD
        List <Mascota> listaMascotas = control.traerMascotas();
        
        //recorrer la lista y mostrar elementos
        if (listaMascotas != null){
            for (Mascota masco : listaMascotas){
                Object[] objeto = {masco.getNum_cliente(), masco.getNombre(), 
                    masco.getColor(), masco.getRaza(), masco.getAlergico(), 
                masco.getAtencion_especial(), masco.getUnDuenio().getNombre(),
                 masco.getUnDuenio().getCelDuenio()};
                
                modeloTabla.addRow(objeto);
                
            }
        }
        
        //vinculo la info del BD a la tabla para mostrar la info
        tablaMascota.setModel(modeloTabla);
        
    }
}
