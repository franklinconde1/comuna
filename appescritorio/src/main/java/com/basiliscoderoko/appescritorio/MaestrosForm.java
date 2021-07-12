package com.basiliscoderoko.appescritorio;

import com.mysql.cj.util.StringUtils;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MaestrosForm extends javax.swing.JInternalFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public MaestrosForm() {
        initComponents();
        this.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2);
        BtnEditar.setEnabled(false);
        BtnDesactivar.setVisible(false);
        GrillaComunas.setRowSelectionAllowed(true);
        GrillaComunas.setColumnSelectionAllowed(false);
        refreshTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtNomUsuario = new javax.swing.JTextField();
        TxtClave = new javax.swing.JTextField();
        TxtRepClave = new javax.swing.JTextField();
        BtnUserCancelar = new javax.swing.JButton();
        BtnUserGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        GrillaUsuarios = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        BtnUserEditar = new javax.swing.JButton();
        BtnUserDesactivar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        TxtNomrsociales = new javax.swing.JTextField();
        BtnRRSSGuardar = new javax.swing.JButton();
        BtnRRSSCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnRRSSEditar = new javax.swing.JButton();
        BtnRRSSDesactivar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtNomComuna = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        GrillaComunas = new javax.swing.JTable();
        BtnEditar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        BtnDesactivar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        TxtBuscar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        TxtBcoNombre = new javax.swing.JTextField();
        BtnBcoGuardar = new javax.swing.JButton();
        BtnBcoCancelar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        BtnBcoeditar = new javax.swing.JButton();
        BtnBcoDesactivar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Maestros");

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuarios"));

        jLabel3.setText("Nombre Usuario :");

        jLabel4.setText("Ingrese Clave :");

        jLabel5.setText("Repita Clave :");

        BtnUserCancelar.setText("Cancelar");
        BtnUserCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BtnUserGuardar.setText("Guardar");
        BtnUserGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(TxtNomUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(33, 33, 33)
                        .addComponent(TxtRepClave, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(BtnUserGuardar)
                        .addGap(62, 62, 62)
                        .addComponent(BtnUserCancelar))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtNomUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(TxtRepClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnUserCancelar)
                        .addComponent(BtnUserGuardar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GrillaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre Usuario", "Clave", "Accion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(GrillaUsuarios);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("USUARIOS REGISTRADOS");

        BtnUserEditar.setText("Editar");
        BtnUserEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BtnUserDesactivar.setText("Desactivar");
        BtnUserDesactivar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel6)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnUserEditar)
                .addGap(41, 41, 41)
                .addComponent(BtnUserDesactivar)
                .addGap(125, 125, 125))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnUserEditar)
                    .addComponent(BtnUserDesactivar))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Usuarios", jPanel3);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Redes Sociales"));

        jLabel8.setText("Nombre RRSS :");

        BtnRRSSGuardar.setText("Guardar");
        BtnRRSSGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BtnRRSSCancelar.setText("Cancelar");
        BtnRRSSCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(TxtNomrsociales, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(BtnRRSSGuardar)
                .addGap(40, 40, 40)
                .addComponent(BtnRRSSCancelar)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnRRSSGuardar)
                        .addComponent(BtnRRSSCancelar))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(TxtNomrsociales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("REDES SOCIALES");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código RRSS", "Nombre RRSS", "Accion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        BtnRRSSEditar.setText("Editar");
        BtnRRSSEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BtnRRSSDesactivar.setText("Desactivar");
        BtnRRSSDesactivar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField1.setToolTipText("Buscar Comunas x Nombre");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(BtnRRSSEditar)
                        .addGap(42, 42, 42)
                        .addComponent(BtnRRSSDesactivar))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(131, 131, 131)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRRSSEditar)
                    .addComponent(BtnRRSSDesactivar))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("RRSS", jPanel6);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Comunas"));

        jLabel1.setText("Nombre Comunas :");

        TxtNomComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomComunaActionPerformed(evt);
            }
        });
        TxtNomComuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNomComunaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNomComunaKeyTyped(evt);
            }
        });

        BtnGuardar.setText("Guardar");
        BtnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnCancelar.setOpaque(true);
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtNomComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnGuardar)
                        .addComponent(BtnCancelar))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(TxtNomComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        GrillaComunas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Comuna", "Nombre Comuna", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        GrillaComunas.setColumnSelectionAllowed(true);
        GrillaComunas.getTableHeader().setReorderingAllowed(false);
        GrillaComunas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GrillaComunasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(GrillaComunas);
        GrillaComunas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (GrillaComunas.getColumnModel().getColumnCount() > 0) {
            GrillaComunas.getColumnModel().getColumn(0).setResizable(false);
            GrillaComunas.getColumnModel().getColumn(1).setResizable(false);
        }

        BtnEditar.setText("Editar");
        BtnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("COMUNAS REGISTRADAS");

        BtnDesactivar.setText("Desactivar");
        BtnDesactivar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDesactivarActionPerformed(evt);
            }
        });

        jLabel12.setText("Buscar:");

        TxtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscarActionPerformed(evt);
            }
        });
        TxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtBuscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(BtnDesactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(87, 87, 87)
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDesactivar)
                    .addComponent(BtnEditar))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Comunas", jPanel1);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Bancos"));

        jLabel11.setText("Nombre Bancos :");

        BtnBcoGuardar.setText("Guardar");
        BtnBcoGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BtnBcoCancelar.setText("Cancelar");
        BtnBcoCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(TxtBcoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BtnBcoGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnBcoCancelar)
                .addGap(79, 79, 79))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtBcoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBcoGuardar)
                    .addComponent(BtnBcoCancelar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("BANCOS REGISTRADOS");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código Banco", "Nombre Banco", "Acción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable2);

        BtnBcoeditar.setText("Editar");
        BtnBcoeditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BtnBcoDesactivar.setText("Desactivar");
        BtnBcoDesactivar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnBcoeditar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBcoDesactivar))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(168, 168, 168)
                            .addComponent(jLabel13))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBcoeditar)
                    .addComponent(BtnBcoDesactivar))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Bancos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed

        try {
            String nameComuna = getFieldComuna();
            if (isEmptyField(nameComuna)) {
                con = ConnectionMysql.getConnection();
                ps = con.prepareStatement("INSERT INTO dreamgifts.comuna (COM_NOMBRE, COM_ESTADO) VALUES (?, ?)");
                ps.setString(1, nameComuna);
                ps.setInt(2, 1);
                int execute = ps.executeUpdate();
                if (execute == 1) {
                    con.close();
                    JOptionPane.showMessageDialog(null, "La comuna se inserto correctamente");
                    TxtNomComuna.setText("");
                    refreshTable();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "La comuna " + TxtNomComuna.getText().toUpperCase().trim() + " ya existe", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void TxtNomComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomComunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomComunaActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        try {
            String nameComuna = getFieldComuna();
            con = ConnectionMysql.getConnection();
            int id = GrillaComunas.getSelectedRow();
            int idComuna = Integer.parseInt(GrillaComunas.getValueAt(id, 0).toString());
            ps = con.prepareStatement("UPDATE dreamgifts.comuna SET COM_NOMBRE=? WHERE COM_ID_COMUNA=?");
            ps.setString(1, nameComuna);
            ps.setInt(2, idComuna);
            int execute = ps.executeUpdate();
            if (execute == 1) {
                con.close();
                JOptionPane.showMessageDialog(null, "La comuna se actualizó correctamente");
                TxtNomComuna.setText("");
                refreshTable();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnEditarActionPerformed

    private boolean isEmptyField(String field) {
        if (StringUtils.isNullOrEmpty(field)) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre de una comuna", "Error!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private String getFieldComuna() {
        return TxtNomComuna.getText().toUpperCase().trim().replaceAll("( )+", " ");
    }

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        TxtNomComuna.setText("");
        BtnGuardar.setEnabled(true);
        BtnEditar.setEnabled(false);
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void TxtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscarActionPerformed

    }//GEN-LAST:event_TxtBuscarActionPerformed

    private void TxtNomComunaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNomComunaKeyPressed

    }//GEN-LAST:event_TxtNomComunaKeyPressed

    private void TxtNomComunaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNomComunaKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        final String nameComuna = TxtNomComuna.getText();
        if (nameComuna.equals("")) {
            BtnEditar.setEnabled(false);
            BtnGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_TxtNomComunaKeyTyped

    private void GrillaComunasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GrillaComunasMouseClicked
        if (evt.getClickCount() == 2 && GrillaComunas.getSelectedRow() != -1) {
            int id = GrillaComunas.getSelectedRow();
            String valor = GrillaComunas.getValueAt(id, 1).toString();
            boolean status = (boolean) GrillaComunas.getValueAt(id, 2);
            TxtNomComuna.setText(valor);
            BtnDesactivar.setVisible(true);
            BtnDesactivar.setText(getActivateDeactivateName(status));
            BtnEditar.setEnabled(true);
            BtnGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_GrillaComunasMouseClicked

    private void BtnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDesactivarActionPerformed
        try {
            con = ConnectionMysql.getConnection();
            int id = GrillaComunas.getSelectedRow();
            int idComuna = Integer.parseInt(GrillaComunas.getValueAt(id, 0).toString());
            boolean status = (boolean) GrillaComunas.getValueAt(id, 2);
            ps = con.prepareStatement("UPDATE dreamgifts.comuna SET COM_ESTADO=? WHERE COM_ID_COMUNA=?");
            ps.setInt(1, calculateStatus(status));
            ps.setInt(2, idComuna);
            int execute = ps.executeUpdate();
            if (execute == 1) {
                con.close();
                String message = calculateStatus(status) == 1 ? "activó" : "desactivó";
                JOptionPane.showMessageDialog(null, "La comuna se " + message + " correctamente");
                BtnDesactivar.setVisible(false);
                TxtNomComuna.setText("");
                refreshTable();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class
                    .getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnDesactivarActionPerformed

    private void TxtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscarKeyTyped
        try {
            final String text = TxtBuscar.getText();
            DefaultTableModel model = (DefaultTableModel) GrillaComunas.getModel();
            model.setRowCount(0);
            con = ConnectionMysql.getConnection();
            ps = con.prepareStatement("SELECT * FROM dreamgifts.comuna WHERE COM_NOMBRE LIKE '%" + text + "%'");
            rs = ps.executeQuery();
            while (rs.next()) {
                Object[] row = new Object[]{rs.getString(1), rs.getString(2), rs.getBoolean(3)};
                model.addRow(row);
            }
            GrillaComunas.setModel(model);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TxtBuscarKeyTyped

    private static int calculateStatus(boolean status) {
        return status ? 0 : 1;
    }

    private String getActivateDeactivateName(boolean status) {
        return status ? "Desactivar" : "Activar";
    }

    private void refreshTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) GrillaComunas.getModel();
            model.setRowCount(0);
            con = ConnectionMysql.getConnection();
            ps = con.prepareStatement("SELECT * FROM dreamgifts.comuna");
            rs = ps.executeQuery();
            while (rs.next()) {
                Object[] row = new Object[]{rs.getString(1), rs.getString(2), rs.getBoolean(3)};
                model.addRow(row);
            }
            GrillaComunas.setModel(model);
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void filterTable(String text) {
        try {
            DefaultTableModel model = (DefaultTableModel) GrillaComunas.getModel();
            model.setRowCount(0);
            con = ConnectionMysql.getConnection();
            ps = con.prepareStatement("SELECT * FROM dreamgifts.comuna WHERE LIKE %" + text + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Object[] row = new Object[]{rs.getString(1), rs.getString(2), rs.getBoolean(3)};
                model.addRow(row);
            }
            GrillaComunas.setModel(model);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBcoCancelar;
    private javax.swing.JButton BtnBcoDesactivar;
    private javax.swing.JButton BtnBcoGuardar;
    private javax.swing.JButton BtnBcoeditar;
    private javax.swing.JToggleButton BtnCancelar;
    private javax.swing.JButton BtnDesactivar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnRRSSCancelar;
    private javax.swing.JButton BtnRRSSDesactivar;
    private javax.swing.JButton BtnRRSSEditar;
    private javax.swing.JButton BtnRRSSGuardar;
    private javax.swing.JButton BtnUserCancelar;
    private javax.swing.JButton BtnUserDesactivar;
    private javax.swing.JButton BtnUserEditar;
    private javax.swing.JButton BtnUserGuardar;
    private javax.swing.JTable GrillaComunas;
    private javax.swing.JTable GrillaUsuarios;
    private javax.swing.JTextField TxtBcoNombre;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtClave;
    private javax.swing.JTextField TxtNomComuna;
    private javax.swing.JTextField TxtNomUsuario;
    private javax.swing.JTextField TxtNomrsociales;
    private javax.swing.JTextField TxtRepClave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
