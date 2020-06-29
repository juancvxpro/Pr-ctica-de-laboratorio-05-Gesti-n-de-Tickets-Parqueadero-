/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorTicket;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.modelo.Vehiculo;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paul_
 */
public class VentanaSalida extends javax.swing.JInternalFrame {
    private Cliente cliente;
    private Vehiculo vehiculo;
   private ControladorCliente controladorCliente;
   private ControladorTicket controladorTicket;
   private ControladorVehiculo controladorVehiculo;
    public VentanaSalida(ControladorCliente controladorCliente,ControladorTicket controladorTicket,ControladorVehiculo controladorVehiculo) {
        initComponents();   this.controladorCliente=controladorCliente;
        this.controladorTicket=controladorTicket;
        this.controladorVehiculo=controladorVehiculo;
       
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
        lblCodigoSalida = new javax.swing.JLabel();
        txtCodigoSalida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalida = new javax.swing.JTable();
        btnSacarVehiculo = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salida del Vehiculo", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        lblCodigoSalida.setText("CODIGO:");

        tblSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero", "Fecha de Ingreso", "Fecha de Salida", "Cedula", "Nombre", "Direccion", "Telefono", "Marca", "Placa", "Modelo", "Fraccion", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSalida);

        btnSacarVehiculo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnSacarVehiculo.setText("Retirar Vehiculo");
        btnSacarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarVehiculoActionPerformed(evt);
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
                        .addComponent(lblCodigoSalida)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSacarVehiculo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1252, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoSalida)
                    .addComponent(txtCodigoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSacarVehiculo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarVehiculoActionPerformed
      
        Ticket ticket;
        double fraccion;
          Date fechaActual = new Date();
          Date fI;
          Date FS;
          double min1,min2,resta,total;
          int dia1,hora1,mins1;
          int dia2,hora2,mins2;
          ticket = controladorTicket.buscaTicketActualizar(Integer.parseInt(txtCodigoSalida.getText()));
          Ticket t = new Ticket();
          t.setNumero(Integer.parseInt(txtCodigoSalida.getText()));
          t.setFechaHoraSalida(fechaActual);
          t.setFechaHoraIngreso(ticket.getFechaHoraIngreso());
          
          t.setVehiculo(ticket.getVehiculo());
         fI=ticket.getFechaHoraIngreso();
         FS=fechaActual;
         dia1=fI.getDay()*1440;
         hora1=fI.getHours()*60;
         mins1=fI.getMinutes();
         min1=dia1+hora1+mins1;
          dia2=fI.getDay()*1440;
         hora2=fI.getHours()*60;
         mins2=fI.getMinutes();
         min2=dia2+hora2+mins2;
         resta=min2-min1;
         
         fraccion=resta/10;
         t.setFraccion((int) fraccion);
         total=fraccion*0.25;
         t.setTotal(total);
         
         controladorTicket.agregarSalida(t);
         controladorTicket.eliminarTicket(ticket);
           DefaultTableModel modelo = (DefaultTableModel) tblSalida.getModel();
     modelo.setRowCount(0);
      
 vehiculo=controladorVehiculo.buscarVehiculo(ticket.getVehiculo().getPlaca());
            cliente=controladorCliente.buscarCliente(ticket.getVehiculo().getPlaca());
  for (Ticket ti: controladorTicket.ListarSalidas()){
   Object[] rowData ={t.getNumero(),t.getFechaHoraIngreso(),t.getFechaHoraSalida(),cliente.getCedula(),
      cliente.getNombre(),cliente.getDireccion(),cliente.getTelefono(),vehiculo.getMarca(),vehiculo.getPlaca(),vehiculo.getModelo(),t.getFraccion(),t.getTotal()};
   modelo.addRow(rowData);
   tblSalida.setModel(modelo);
  }
    }//GEN-LAST:event_btnSacarVehiculoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSacarVehiculo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoSalida;
    private javax.swing.JTable tblSalida;
    private javax.swing.JTextField txtCodigoSalida;
    // End of variables declaration//GEN-END:variables
}
