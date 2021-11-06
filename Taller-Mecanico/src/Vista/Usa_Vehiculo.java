/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import logica.Propietario;
import logica.Revision;
import logica.Vehiculo;
import logica.Vehiculo_afiliado;
import logica.Vehiculo_particular;

/**
 *
 * @author Desarollo
 */
public class Usa_Vehiculo extends javax.swing.JFrame {

    /**
     * Creates new form Usa_Vehiculo
     */
    private TreeMap<String, Vehiculo> losVehiculos = new TreeMap<>();
    
    
    public Usa_Vehiculo() {
        initComponents();
        jTextFechaRev.setText(LocalDate.now().toString());
    }
    
//    public void Prueba () {
//        
//    }
//    public void OrdenarAscendete () {
//        List<String> Vehiculos = new ArrayList<>(losVehiculos.keySet());
//        Collections.sort(Vehiculos);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButtonListarTodos = new javax.swing.JButton();
        jButtonListarVehiculo = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextPlacaInic = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextPlacaReg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFechaReg = new javax.swing.JTextField();
        jRadioButtonAf = new javax.swing.JRadioButton();
        jRadioButtonPar = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jTextModeloReg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxAseg = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextNombreReg = new javax.swing.JTextField();
        jTextCedulaReg = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextCelularReg = new javax.swing.JTextField();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextPlacaRev = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFechaRev = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxConceptoRev = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jTextValorBaseRev = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescrip = new javax.swing.JTextArea();
        jButtonInsertarRev = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TallerMecanico");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("TALLER MECANICO");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButtonListarTodos.setText("Listar todos");
        jButtonListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarTodosActionPerformed(evt);
            }
        });

        jButtonListarVehiculo.setText("Listar vehiculo");
        jButtonListarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarVehiculoActionPerformed(evt);
            }
        });

        jLabel18.setText("Placa de vehiculo:");

        jButtonEliminar.setText("Eliminar vehiculo");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextPlacaInic, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jButtonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonListarVehiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonListarTodos))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListarTodos)
                    .addComponent(jButtonListarVehiculo)
                    .addComponent(jLabel18)
                    .addComponent(jTextPlacaInic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Inico", jPanel3);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Datos vehiculo");

        jLabel5.setText("Placa:");

        jLabel6.setText("Modelo:");

        jLabel7.setText("Tipo:");

        jTextFechaReg.setText("aaaa-mm-dd");
        jTextFechaReg.setToolTipText("aaaa-mm-dd");
        jTextFechaReg.setEnabled(false);
        jTextFechaReg.setName(""); // NOI18N

        buttonGroup.add(jRadioButtonAf);
        jRadioButtonAf.setText("Afiliado");
        jRadioButtonAf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAfActionPerformed(evt);
            }
        });

        buttonGroup.add(jRadioButtonPar);
        jRadioButtonPar.setText("Particular");
        jRadioButtonPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonParActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha afiliación:");

        jLabel9.setText("Nombre aseguradora:");

        jComboBoxAseg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MAPFRE", "SURA", "ALLIANZ", "SOLIDARIA", "LIBERTY" }));
        jComboBoxAseg.setEnabled(false);
        jComboBoxAseg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAsegActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Datos propietario:");

        jLabel10.setText("Cedula:");

        jLabel11.setText("Nombre:");

        jLabel12.setText("Celular:");

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTextPlacaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jRadioButtonAf)
                            .addComponent(jRadioButtonPar))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextModeloReg, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxAseg, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFechaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNombreReg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextCedulaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jTextCelularReg, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(231, 231, 231)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPlacaReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextModeloReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNombreReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonAf)
                    .addComponent(jTextFechaReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCedulaReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCelularReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonPar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxAseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonLimpiar)
                        .addComponent(jButtonGuardar)))
                .addContainerGap())
        );

        jTextFechaReg.getAccessibleContext().setAccessibleName("");

        jTabbedPane1.addTab("Registrar vehiculo", jPanel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nueva Revisión");

        jLabel13.setText("Placa del vehiculo:");

        jLabel14.setText("Concepto:");

        jLabel15.setText("Fecha:");

        jComboBoxConceptoRev.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PASA", "ALERTA" }));

        jLabel16.setText("Valor base:");

        jTextValorBaseRev.setText("50000");

        jLabel17.setText("Descripción:");

        jTextAreaDescrip.setColumns(20);
        jTextAreaDescrip.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescrip);

        jButtonInsertarRev.setText("Insertar revisión");
        jButtonInsertarRev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarRevActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jTextPlacaRev, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jTextFechaRev, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxConceptoRev, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jTextValorBaseRev, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonInsertarRev)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFechaRev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxConceptoRev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPlacaRev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextValorBaseRev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonInsertarRev)
                        .addGap(53, 53, 53))))
        );

        jTabbedPane1.addTab("Añadir revisión", jPanel4);

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(141, 141, 141)
                .addComponent(jButtonSalir))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(jButtonSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonAfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAfActionPerformed
        jTextFechaReg.setEnabled(true);
        jComboBoxAseg.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonAfActionPerformed

    private void jComboBoxAsegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAsegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAsegActionPerformed

    private void jRadioButtonParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonParActionPerformed
        jComboBoxAseg.setEnabled(true);
        jTextFechaReg.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonParActionPerformed

//    public void RadioButton () {
//        if(jRadioButtonAf.isSelected()){
//            jTextFechaReg.setEnabled(true);
//            jComboBoxAseg.setEnabled(false);
//        }else if (jRadioButtonPar.isSelected()){
//            jComboBoxAseg.setEnabled(true);
//            jTextFechaReg.setEnabled(false);
//        }
//    }
    
    private void EliminarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarVehiculoActionPerformed
        String placa = jTextPlacaInic.getText();

        if (losVehiculos.remove(placa) != null)
            JOptionPane.showMessageDialog(null, "Vehiculo eliminado Sactisfactoriamente");
        else
            JOptionPane.showMessageDialog(null, "Vehiculo no existe");
            
    }//GEN-LAST:event_EliminarVehiculoActionPerformed

    private void ListarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarVehiculoActionPerformed
        String placa = jTextPlacaInic.getText();
        Vehiculo res = losVehiculos.get(placa);
        
        if (res != null)
               jTextArea2.setText("Listar Vehiculo:\n" +res.toString());
        else
            JOptionPane.showMessageDialog(null, "Vehiculo no existe");
    }//GEN-LAST:event_ListarVehiculoActionPerformed

    private void ListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarTodosActionPerformed
        
        if(losVehiculos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Mijo, no hay vehiculos registrados");
            return;
        }
        
        String res = "Lista de los vehiculos atendidos: ";
        
        for (Vehiculo vehiculo : losVehiculos.values()){
            
            if(vehiculo instanceof Vehiculo_afiliado)
            {
                res += "\n" + vehiculo.getPlaca() + " AFILIADO" + " Cedula: " + vehiculo.getSuPropietario().getCedula() + 
                        " Fecha revisiones: ";        
            }else if(vehiculo instanceof Vehiculo_particular) {
                res += "\n" + vehiculo.getPlaca() + " NO AFILIADO" + " Cedula: " + vehiculo.getSuPropietario().getCedula() + 
                        " Fecha revisiones: ";  
            }
            for (int i = 0; i < vehiculo.getSusRevisiones().size(); i++) {
                    res+= "\n " + vehiculo.getSusRevisiones().get(i).getFecha();
                } 
        }
        jTextArea2.setText(res);
    }//GEN-LAST:event_ListarTodosActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        jTextCedulaReg.setText("");
        jTextCelularReg.setText("");
        jTextFechaReg.setText("");
        jTextModeloReg.setText("");
        jTextNombreReg.setText("");
        jTextPlacaReg.setText("");
        jComboBoxAseg.setSelectedIndex(0);
        jRadioButtonAf.setSelected(false);
        jRadioButtonPar.setSelected(false);
    }//GEN-LAST:event_LimpiarActionPerformed

    private void GuardarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarVehiculoActionPerformed
//        //Datos vehiculo
        String laPlaca = jTextPlacaReg.getText();
        long laCedula = Long.parseLong(jTextCedulaReg.getText());
        
        Vehiculo vehi = losVehiculos.get(laPlaca);
        if (vehi!= null){
            JOptionPane.showMessageDialog(null, "Este vehiculo ya se encuentra registrado");   
            return;
        }
        
        for (Vehiculo vehiculo : losVehiculos.values()) 
        {
            if(vehiculo.getSuPropietario().getCedula() == laCedula) {
                JOptionPane.showMessageDialog(null, "Este propietario ya posee un vehiculo registrado");  
                return;
            }
        }
             
        int elModelo= Integer.parseInt(jTextModeloReg.getText());
        //Datos propietario
        
        long elCelular= Long.parseLong(jTextCelularReg.getText());
        String elNombre = jTextNombreReg.getText();
        
        Propietario objP = new Propietario(laCedula, elCelular, elNombre);
        
        if(jRadioButtonAf.isSelected()){
            LocalDate laFechaA = LocalDate.parse(jTextFechaReg.getText());
            Vehiculo_afiliado objVA = new Vehiculo_afiliado(laPlaca, elModelo, objP, laFechaA);
            losVehiculos.put(laPlaca, objVA);
            JOptionPane.showMessageDialog(null, "Vehiculo guardo con éxito");
        }else if(jRadioButtonPar.isSelected()){
            String laAseguradora = jComboBoxAseg.getSelectedItem().toString();
            Vehiculo_particular objVP= new Vehiculo_particular(laPlaca, elModelo, objP, laAseguradora);
            losVehiculos.put(laPlaca, objVP);
            JOptionPane.showMessageDialog(null, "Vehiculo guardo con éxito");
        }
    }//GEN-LAST:event_GuardarVehiculoActionPerformed

    private void jButtonInsertarRevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarRevActionPerformed
        
       
        String placa = jTextPlacaRev.getText();
        Vehiculo obj = losVehiculos.get(placa);
        if(obj != null){
          LocalDate lafecha = LocalDate.parse(jTextFechaRev.getText());
          String ladescripcion = jTextAreaDescrip.getText();
          String elconcepto = jComboBoxConceptoRev.getSelectedItem().toString();
          double elvalorBase = Double.parseDouble(jTextValorBaseRev.getText());
          
          Revision rev = new Revision(lafecha, ladescripcion, elconcepto, elvalorBase);
          obj.getSusRevisiones().add(rev);
          JOptionPane.showMessageDialog(null, "Revisión registrada con éxito");
        }
    }//GEN-LAST:event_jButtonInsertarRevActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Usa_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usa_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usa_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usa_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usa_Vehiculo().setVisible(true);
            }
        });
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonInsertarRev;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonListarTodos;
    private javax.swing.JButton jButtonListarVehiculo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxAseg;
    private javax.swing.JComboBox<String> jComboBoxConceptoRev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonAf;
    private javax.swing.JRadioButton jRadioButtonPar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextAreaDescrip;
    private javax.swing.JTextField jTextCedulaReg;
    private javax.swing.JTextField jTextCelularReg;
    private javax.swing.JTextField jTextFechaReg;
    private javax.swing.JTextField jTextFechaRev;
    private javax.swing.JTextField jTextModeloReg;
    private javax.swing.JTextField jTextNombreReg;
    private javax.swing.JTextField jTextPlacaInic;
    private javax.swing.JTextField jTextPlacaReg;
    private javax.swing.JTextField jTextPlacaRev;
    private javax.swing.JTextField jTextValorBaseRev;
    // End of variables declaration//GEN-END:variables
}
