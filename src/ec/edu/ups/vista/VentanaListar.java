/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorTicket;
import ec.edu.ups.modelo.Ticket;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paul_
 */
public class VentanaListar extends javax.swing.JInternalFrame {

    private ControladorTicket controladorTicket;

    public VentanaListar(ControladorTicket controladorTicket) {
        initComponents();
        this.controladorTicket = controladorTicket;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        txtListar = new javax.swing.JTextField();
        cbxParametro = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnSALIR1 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        PanelLista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Vehiculos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero", "Fecha de Ingreso", "Fecha de Salida", "Placa", "Marca", "Modelo", "Cedula", "Nombre", "Direccion", "Telefono", "Total", "Fracciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLista);

        cbxParametro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE para Listar--", "Cedula", "Placa" }));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnSALIR1.setText("SALIR");
        btnSALIR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSALIR1ActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelListaLayout = new javax.swing.GroupLayout(PanelLista);
        PanelLista.setLayout(PanelListaLayout);
        PanelListaLayout.setHorizontalGroup(
            PanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelListaLayout.createSequentialGroup()
                        .addComponent(txtListar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxParametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)
                        .addGap(11, 11, 11)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSALIR1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        PanelListaLayout.setVerticalGroup(
            PanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelListaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxParametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnSALIR1)
                    .addComponent(btnActualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        DefaultTableModel modelo = (DefaultTableModel) tblLista.getModel();
        modelo.setRowCount(0);
        try {
            for (Ticket ticket : controladorTicket.ListarTickets()) {
                if (ticket.isEstado() == false) {
                    Object[] rowData = {ticket.getNumero(),
                        ticket.getFechaHoraIngreso(),
                        ticket.getFechaHoraSalida(),
                        ticket.getVehiculo().getPlaca(),
                        ticket.getVehiculo().getMarca(),
                        ticket.getVehiculo().getModelo(),
                        ticket.getVehiculo().getCliente().getCedula(),
                        ticket.getVehiculo().getCliente().getNombre(),
                        ticket.getVehiculo().getCliente().getDireccion(),
                        ticket.getVehiculo().getCliente().getTelefono(),
                        "$ " + ticket.getTotal(),
                        ticket.getFraccion()

                    };
                    modelo.addRow(rowData);
                    tblLista.setModel(modelo);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia ");
        }


    }//GEN-LAST:event_formInternalFrameActivated

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblLista.getModel();
        modelo.setRowCount(0);
        String parametro = txtListar.getText();

        if ((cbxParametro.getSelectedItem().equals("Cedula"))) {
            Limpiar();
            try {
                for (Ticket ticket : controladorTicket.ListarTickets()) {
                    if (ticket.isEstado() == false) {
                        if (ticket.getVehiculo().getCliente().getCedula().equals(parametro)) {
                            Object[] rowData = {ticket.getNumero(),
                                ticket.getFechaHoraIngreso(),
                                ticket.getFechaHoraSalida(),
                                ticket.getVehiculo().getPlaca(),
                                ticket.getVehiculo().getMarca(),
                                ticket.getVehiculo().getModelo(),
                                ticket.getVehiculo().getCliente().getCedula(),
                                ticket.getVehiculo().getCliente().getNombre(),
                                ticket.getVehiculo().getCliente().getDireccion(),
                                ticket.getVehiculo().getCliente().getTelefono(),
                                "$ " + ticket.getTotal(),
                                ticket.getFraccion()

                            };
                            modelo.addRow(rowData);
                            tblLista.setModel(modelo);
                        }

                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "La lista se encuentra vacia ");
            }

        } else if (cbxParametro.getSelectedItem().equals("Placa")) {
            Limpiar();
            try {
                for (Ticket ticket : controladorTicket.ListarTickets()) {
                    if (ticket.isEstado() == false) {
                        if (ticket.getVehiculo().getPlaca().equals(parametro)) {
                            Object[] rowData = {ticket.getNumero(),
                                ticket.getFechaHoraIngreso(),
                                ticket.getFechaHoraSalida(),
                                ticket.getVehiculo().getPlaca(),
                                ticket.getVehiculo().getMarca(),
                                ticket.getVehiculo().getModelo(),
                                ticket.getVehiculo().getCliente().getCedula(),
                                ticket.getVehiculo().getCliente().getNombre(),
                                ticket.getVehiculo().getCliente().getDireccion(),
                                ticket.getVehiculo().getCliente().getTelefono(),
                                "$ " + ticket.getTotal(),
                                ticket.getFraccion()

                            };
                            modelo.addRow(rowData);
                            tblLista.setModel(modelo);
                        }

                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "La lista se encuentra vacia ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO SE HA ENCONTRADO PARAMETRO ");

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSALIR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSALIR1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSALIR1ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtListar.setText("");
        cbxParametro.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblLista.getModel();
        modelo.setRowCount(0);
        try {
            for (Ticket ticket : controladorTicket.ListarTickets()) {
                if (ticket.isEstado() == false) {
                    Object[] rowData = {ticket.getNumero(),
                        ticket.getFechaHoraIngreso(),
                        ticket.getFechaHoraSalida(),
                        ticket.getVehiculo().getPlaca(),
                        ticket.getVehiculo().getMarca(),
                        ticket.getVehiculo().getModelo(),
                        ticket.getVehiculo().getCliente().getCedula(),
                        ticket.getVehiculo().getCliente().getNombre(),
                        ticket.getVehiculo().getCliente().getDireccion(),
                        ticket.getVehiculo().getCliente().getTelefono(),
                        "$ " + ticket.getTotal(),
                        ticket.getFraccion()

                    };
                    modelo.addRow(rowData);
                    tblLista.setModel(modelo);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia ");
        }


    }//GEN-LAST:event_btnActualizarActionPerformed
    public void Limpiar() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tblLista.getModel();
            int filas = tblLista.getRowCount();
            for (int i = 0; i <= filas; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelLista;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSALIR1;
    private javax.swing.JComboBox<String> cbxParametro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLista;
    private javax.swing.JTextField txtListar;
    // End of variables declaration//GEN-END:variables

    public ControladorTicket getControladorTicket() {
        return controladorTicket;
    }

    public JPanel getPanelLista() {
        return PanelLista;
    }

    public JComboBox<String> getCbxParametro() {
        return cbxParametro;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JTable getTblLista() {
        return tblLista;
    }

    public JTextField getTxtListar() {
        return txtListar;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JButton getBtnSALIR1() {
        return btnSALIR1;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

}
