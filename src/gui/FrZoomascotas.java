/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import DAOs.AnimalDAO;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import DAOs.CuidadorDAO;
import DAOs.TransferenciaDAO;
import DAOs.ZoologicoDAO;
import java.util.Date;
import modelo.*;



/**
 *
 * @author yeferson
 */
public class FrZoomascotas extends javax.swing.JFrame {
    
    Design diseños = new Design(this);
   
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrZoomascotas.class.getName());
    
    private static CuidadorDAO cuDAO = new CuidadorDAO();
    private static ZoologicoDAO zooDAO = new ZoologicoDAO();
    private static AnimalDAO anDAO = new AnimalDAO();
    private static TransferenciaDAO trDAO = new TransferenciaDAO();
    
    private  void showCard(String card){
        CardLayout cl = (CardLayout)pnlCardLayout.getLayout();
        cl.show(pnlCardLayout, card);
    }
    
   private void limpiarTabla(){       
       DefaultTableModel modelo =  (DefaultTableModel) tabla.getModel();
       modelo.setRowCount(0);
       
   }

    /**
     * Creates new form FrZoomascotas
     */
    public FrZoomascotas(String user) {
        initComponents();
        diseños.design();
        setLocationRelativeTo(null);
        lbNombreUser.setText(user.toUpperCase());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPnl = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        pnlbtnReporte = new javax.swing.JPanel();
        btnReporte = new javax.swing.JLabel();
        pnlBtnCuidador = new javax.swing.JPanel();
        btnCuidador = new javax.swing.JLabel();
        pnlBtnZoo = new javax.swing.JPanel();
        btnZoo = new javax.swing.JLabel();
        pnlBtnAnimal = new javax.swing.JPanel();
        btnTransferencia = new javax.swing.JLabel();
        pnlBtnTransfe = new javax.swing.JPanel();
        btnAnimal = new javax.swing.JLabel();
        lbNombreUser = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bgPnlContent = new javax.swing.JPanel();
        pnlCardLayout = new javax.swing.JPanel();
        cardCuidador = new javax.swing.JPanel();
        lbTituloCu = new javax.swing.JLabel();
        txtNombreCu = new javax.swing.JTextField();
        lbNombreCu = new javax.swing.JLabel();
        lbApellidoCu = new javax.swing.JLabel();
        txtApellidoCu = new javax.swing.JTextField();
        lbCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        cbGeneroCu = new javax.swing.JComboBox<>();
        lbTelefonoCu = new javax.swing.JLabel();
        txtTelefonoCu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmailCu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnRegistrarCu = new javax.swing.JButton();
        btnActualizarCu = new javax.swing.JButton();
        btnBuscarCu = new javax.swing.JButton();
        txtBuscarCu = new javax.swing.JTextField();
        txtFechaNacimiento = new com.toedter.calendar.JDateChooser();
        btnListar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        cardTransferencia = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbAnimalTr = new javax.swing.JComboBox<>();
        lbAnimalTr = new javax.swing.JLabel();
        cbZoologicoTr = new javax.swing.JComboBox<>();
        lbZoologicoTr = new javax.swing.JLabel();
        lbTraslado = new javax.swing.JLabel();
        txtFechaSalida = new com.toedter.calendar.JDateChooser();
        btnRegistrarTr = new javax.swing.JButton();
        btnActualizarTr = new javax.swing.JButton();
        btnBuscarTr = new javax.swing.JButton();
        btnListarTr = new javax.swing.JButton();
        txtBuscarTr = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        cardAnimal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbNombreAn = new javax.swing.JLabel();
        txtNombreAn = new javax.swing.JTextField();
        cbTipoAn = new javax.swing.JComboBox<>();
        cbGeneroAn = new javax.swing.JComboBox<>();
        cbEstadoAn = new javax.swing.JComboBox<>();
        cbCuidadorAn = new javax.swing.JComboBox<>();
        lbFechaAnimal = new javax.swing.JLabel();
        txtFechaAnimal = new com.toedter.calendar.JDateChooser();
        lbCuidadorAn = new javax.swing.JLabel();
        btnRegistrarAn = new javax.swing.JButton();
        btnActualizarAn = new javax.swing.JButton();
        btnListarAn = new javax.swing.JButton();
        btnBuscarAn = new javax.swing.JButton();
        txtBuscarAn = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        cardReporte = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cardZoo = new javax.swing.JPanel();
        tituloZoo = new javax.swing.JLabel();
        btnListarZoo = new javax.swing.JButton();
        lbNombreZoo = new javax.swing.JLabel();
        txtNombreZoo = new javax.swing.JTextField();
        lbCiudadZoo = new javax.swing.JLabel();
        txtCiudadZoo = new javax.swing.JTextField();
        lbDireccion = new javax.swing.JLabel();
        txtDirecZoo = new javax.swing.JTextField();
        lbTelefonoZoo = new javax.swing.JLabel();
        txtTelefonoZoo = new javax.swing.JTextField();
        lbEmailZoo = new javax.swing.JLabel();
        txtEmailZoo = new javax.swing.JTextField();
        btnRegistrarZoo = new javax.swing.JButton();
        btnActualizarZoo = new javax.swing.JButton();
        btnBuscarZoo = new javax.swing.JButton();
        txtBuscarZoo = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        pnlTablas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        bgPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlbtnReporte.setBackground(new java.awt.Color(255, 255, 255));
        pnlbtnReporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReporte.setText("Reporte");
        btnReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReporteMouseClicked(evt);
            }
        });
        pnlbtnReporte.add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        pnlMenu.add(pnlbtnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 110, 40));

        pnlBtnCuidador.setBackground(new java.awt.Color(255, 255, 255));
        pnlBtnCuidador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCuidador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCuidador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCuidador.setText("Cuidador");
        btnCuidador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCuidadorMouseClicked(evt);
            }
        });
        pnlBtnCuidador.add(btnCuidador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        pnlMenu.add(pnlBtnCuidador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, 40));

        pnlBtnZoo.setBackground(new java.awt.Color(255, 255, 255));
        pnlBtnZoo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBtnZooMouseClicked(evt);
            }
        });
        pnlBtnZoo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnZoo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnZoo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnZoo.setText("Zoologico");
        btnZoo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnZooMouseClicked(evt);
            }
        });
        pnlBtnZoo.add(btnZoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        pnlMenu.add(pnlBtnZoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, 40));

        pnlBtnAnimal.setBackground(new java.awt.Color(255, 255, 255));
        pnlBtnAnimal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTransferencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTransferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTransferencia.setText("Transferencia");
        btnTransferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTransferenciaMouseClicked(evt);
            }
        });
        pnlBtnAnimal.add(btnTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        pnlMenu.add(pnlBtnAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 110, 40));

        pnlBtnTransfe.setBackground(new java.awt.Color(255, 255, 255));
        pnlBtnTransfe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAnimal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAnimal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAnimal.setText("Animal");
        btnAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnimalMouseClicked(evt);
            }
        });
        pnlBtnTransfe.add(btnAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        pnlMenu.add(pnlBtnTransfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 110, 40));

        lbNombreUser.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbNombreUser.setForeground(new java.awt.Color(255, 255, 255));
        lbNombreUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlMenu.add(lbNombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, 30));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ZOOMASCOTAS");
        pnlMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 160, 40));

        bgPnl.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 580));

        bgPnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCardLayout.setBackground(new java.awt.Color(204, 204, 204));
        pnlCardLayout.setLayout(new java.awt.CardLayout());

        cardCuidador.setBackground(new java.awt.Color(255, 255, 255));
        cardCuidador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTituloCu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTituloCu.setText("CUIDADOR");
        cardCuidador.add(lbTituloCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        txtNombreCu.setBorder(null);
        cardCuidador.add(txtNombreCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 150, 20));

        lbNombreCu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNombreCu.setText("Nombre");
        cardCuidador.add(lbNombreCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 60, 20));

        lbApellidoCu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbApellidoCu.setText("Apellido");
        cardCuidador.add(lbApellidoCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        txtApellidoCu.setBorder(null);
        cardCuidador.add(txtApellidoCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 160, 20));

        lbCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCedula.setText("C.C");
        cardCuidador.add(lbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtCedula.setBorder(null);
        cardCuidador.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 120, 20));

        cbGeneroCu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERO", "MASCULINO", "FEMENINO" }));
        cardCuidador.add(cbGeneroCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 120, -1));

        lbTelefonoCu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTelefonoCu.setText("Telefono");
        cardCuidador.add(lbTelefonoCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtTelefonoCu.setBorder(null);
        cardCuidador.add(txtTelefonoCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 120, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Email");
        cardCuidador.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        txtEmailCu.setBorder(null);
        cardCuidador.add(txtEmailCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 180, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("F. Nacimiento");
        cardCuidador.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        btnRegistrarCu.setBackground(new java.awt.Color(59, 130, 246));
        btnRegistrarCu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarCu.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarCu.setText("Registrar");
        btnRegistrarCu.addActionListener(this::btnRegistrarCuActionPerformed);
        cardCuidador.add(btnRegistrarCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 110, 40));

        btnActualizarCu.setBackground(new java.awt.Color(21, 124, 48));
        btnActualizarCu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizarCu.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarCu.setText("Actualizar");
        btnActualizarCu.addActionListener(this::btnActualizarCuActionPerformed);
        cardCuidador.add(btnActualizarCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 110, 40));

        btnBuscarCu.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarCu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarCu.setForeground(new java.awt.Color(59, 130, 246));
        btnBuscarCu.setText("Buscar");
        btnBuscarCu.setBorder(null);
        btnBuscarCu.addActionListener(this::btnBuscarCuActionPerformed);
        cardCuidador.add(btnBuscarCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 90, 30));

        txtBuscarCu.setBorder(null);
        cardCuidador.add(txtBuscarCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 160, 30));
        cardCuidador.add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 150, -1));

        btnListar.setBackground(new java.awt.Color(255, 255, 255));
        btnListar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnListar.setForeground(new java.awt.Color(59, 130, 246));
        btnListar.setText("Listar");
        btnListar.addActionListener(this::btnListarActionPerformed);
        cardCuidador.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 90, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        cardCuidador.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 160, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        cardCuidador.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 120, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        cardCuidador.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 150, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        cardCuidador.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 160, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        cardCuidador.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 180, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        cardCuidador.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 120, -1));

        pnlCardLayout.add(cardCuidador, "cardCuidador");

        cardTransferencia.setBackground(new java.awt.Color(255, 255, 255));
        cardTransferencia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setText("TRANSFERENCIA");
        cardTransferencia.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        cardTransferencia.add(cbAnimalTr, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 150, -1));

        lbAnimalTr.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lbAnimalTr.setText("Animal");
        cardTransferencia.add(lbAnimalTr, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        cardTransferencia.add(cbZoologicoTr, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 150, -1));

        lbZoologicoTr.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lbZoologicoTr.setText("Zoologico");
        cardTransferencia.add(lbZoologicoTr, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        lbTraslado.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lbTraslado.setText("Fecha traslado");
        cardTransferencia.add(lbTraslado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));
        cardTransferencia.add(txtFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 130, -1));

        btnRegistrarTr.setBackground(new java.awt.Color(59, 130, 246));
        btnRegistrarTr.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnRegistrarTr.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarTr.setText("Registrar");
        btnRegistrarTr.addActionListener(this::btnRegistrarTrActionPerformed);
        cardTransferencia.add(btnRegistrarTr, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 110, 40));

        btnActualizarTr.setBackground(new java.awt.Color(21, 124, 48));
        btnActualizarTr.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnActualizarTr.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarTr.setText("Actualizar");
        btnActualizarTr.addActionListener(this::btnActualizarTrActionPerformed);
        cardTransferencia.add(btnActualizarTr, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 110, 40));

        btnBuscarTr.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarTr.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnBuscarTr.setForeground(new java.awt.Color(59, 130, 246));
        btnBuscarTr.setText("Buscar");
        btnBuscarTr.addActionListener(this::btnBuscarTrActionPerformed);
        cardTransferencia.add(btnBuscarTr, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 90, 30));

        btnListarTr.setBackground(new java.awt.Color(255, 255, 255));
        btnListarTr.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnListarTr.setForeground(new java.awt.Color(59, 130, 246));
        btnListarTr.setText("Listar");
        btnListarTr.addActionListener(this::btnListarTrActionPerformed);
        cardTransferencia.add(btnListarTr, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 90, 30));

        txtBuscarTr.setBorder(null);
        cardTransferencia.add(txtBuscarTr, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 248, 110, 20));

        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        cardTransferencia.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 110, 10));

        pnlCardLayout.add(cardTransferencia, "cardTrans");

        cardAnimal.setBackground(new java.awt.Color(255, 255, 255));
        cardAnimal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel2.setText("ANIMAL");
        cardAnimal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        lbNombreAn.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lbNombreAn.setText("Nombre");
        cardAnimal.add(lbNombreAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        txtNombreAn.setBorder(null);
        cardAnimal.add(txtNombreAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 130, 20));

        cbTipoAn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo", "Anfibio", "Mamifero", "Reptil", "Ave" }));
        cardAnimal.add(cbTipoAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 140, -1));

        cbGeneroAn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Genero", "Macho", "Hembra" }));
        cardAnimal.add(cbGeneroAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 140, -1));

        cbEstadoAn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "Activo", "Inactivo" }));
        cardAnimal.add(cbEstadoAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 130, -1));

        cbCuidadorAn.setBorder(null);
        cardAnimal.add(cbCuidadorAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 170, -1));

        lbFechaAnimal.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lbFechaAnimal.setText("Fecha Ingreso");
        cardAnimal.add(lbFechaAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));
        cardAnimal.add(txtFechaAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 140, -1));

        lbCuidadorAn.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lbCuidadorAn.setText("Cuidador");
        cardAnimal.add(lbCuidadorAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        btnRegistrarAn.setBackground(new java.awt.Color(59, 130, 246));
        btnRegistrarAn.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnRegistrarAn.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAn.setText("Registrar");
        btnRegistrarAn.addActionListener(this::btnRegistrarAnActionPerformed);
        cardAnimal.add(btnRegistrarAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 110, 40));

        btnActualizarAn.setBackground(new java.awt.Color(21, 124, 48));
        btnActualizarAn.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnActualizarAn.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarAn.setText("Actualizar");
        btnActualizarAn.addActionListener(this::btnActualizarAnActionPerformed);
        cardAnimal.add(btnActualizarAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 110, 40));

        btnListarAn.setBackground(new java.awt.Color(255, 255, 255));
        btnListarAn.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnListarAn.setForeground(new java.awt.Color(59, 130, 246));
        btnListarAn.setText("Listar");
        btnListarAn.addActionListener(this::btnListarAnActionPerformed);
        cardAnimal.add(btnListarAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 90, 30));

        btnBuscarAn.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarAn.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnBuscarAn.setForeground(new java.awt.Color(59, 130, 246));
        btnBuscarAn.setText("Buscar");
        btnBuscarAn.addActionListener(this::btnBuscarAnActionPerformed);
        cardAnimal.add(btnBuscarAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 90, 30));

        txtBuscarAn.setToolTipText("");
        txtBuscarAn.setBorder(null);
        cardAnimal.add(txtBuscarAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 140, 20));

        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        cardAnimal.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 140, 10));

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        cardAnimal.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 130, 10));

        pnlCardLayout.add(cardAnimal, "cardAnimal");

        cardReporte.setBackground(new java.awt.Color(255, 255, 255));
        cardReporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("REPORTE");
        cardReporte.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        pnlCardLayout.add(cardReporte, "cardReporte");

        cardZoo.setBackground(new java.awt.Color(255, 255, 255));
        cardZoo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloZoo.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        tituloZoo.setText("ZOOLOGICO");
        cardZoo.add(tituloZoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        btnListarZoo.setBackground(new java.awt.Color(255, 255, 255));
        btnListarZoo.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnListarZoo.setForeground(new java.awt.Color(59, 130, 246));
        btnListarZoo.setText("Listar");
        btnListarZoo.addActionListener(this::btnListarZooActionPerformed);
        cardZoo.add(btnListarZoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 90, 30));

        lbNombreZoo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNombreZoo.setText("Nombre");
        cardZoo.add(lbNombreZoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        txtNombreZoo.setBorder(null);
        cardZoo.add(txtNombreZoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 140, 20));

        lbCiudadZoo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCiudadZoo.setText("Ciudad");
        cardZoo.add(lbCiudadZoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        txtCiudadZoo.setBorder(null);
        cardZoo.add(txtCiudadZoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 140, 20));

        lbDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbDireccion.setText("Direccion");
        cardZoo.add(lbDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        txtDirecZoo.setBorder(null);
        cardZoo.add(txtDirecZoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 140, 20));

        lbTelefonoZoo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTelefonoZoo.setText("Telefono");
        cardZoo.add(lbTelefonoZoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        txtTelefonoZoo.setBorder(null);
        cardZoo.add(txtTelefonoZoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 140, 20));

        lbEmailZoo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbEmailZoo.setText("Email");
        cardZoo.add(lbEmailZoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        txtEmailZoo.setBorder(null);
        cardZoo.add(txtEmailZoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 170, 20));

        btnRegistrarZoo.setBackground(new java.awt.Color(59, 130, 246));
        btnRegistrarZoo.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnRegistrarZoo.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarZoo.setText("Registrar");
        btnRegistrarZoo.addActionListener(this::btnRegistrarZooActionPerformed);
        cardZoo.add(btnRegistrarZoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 110, 40));

        btnActualizarZoo.setBackground(new java.awt.Color(21, 124, 48));
        btnActualizarZoo.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnActualizarZoo.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarZoo.setText("Actualizar");
        btnActualizarZoo.addActionListener(this::btnActualizarZooActionPerformed);
        cardZoo.add(btnActualizarZoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 110, 40));

        btnBuscarZoo.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarZoo.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnBuscarZoo.setForeground(new java.awt.Color(59, 130, 246));
        btnBuscarZoo.setText("Buscar");
        btnBuscarZoo.addActionListener(this::btnBuscarZooActionPerformed);
        cardZoo.add(btnBuscarZoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 90, 30));

        txtBuscarZoo.setBorder(null);
        cardZoo.add(txtBuscarZoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 140, 20));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        cardZoo.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 170, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        cardZoo.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 140, -1));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        cardZoo.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 140, -1));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        cardZoo.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 140, -1));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        cardZoo.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 140, -1));

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        cardZoo.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 140, -1));

        pnlCardLayout.add(cardZoo, "cardZoo");

        bgPnlContent.add(pnlCardLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 800, 290));

        pnlTablas.setBackground(new java.awt.Color(204, 204, 204));
        pnlTablas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        pnlTablas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 760, 160));

        btnLimpiar.setBackground(new java.awt.Color(255, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);
        pnlTablas.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 90, 30));

        bgPnlContent.add(pnlTablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 800, 240));

        bgPnl.add(bgPnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 850, 580));

        getContentPane().add(bgPnl);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCuActionPerformed
        
        if( txtCedula.getText().trim().matches("\\d+")){
            if( txtTelefonoCu.getText().trim().matches("\\d+") ){
                if ( !txtNombreCu.getText().trim().equals("") ){
                    if( !txtApellidoCu.getText().trim().equals("") ){
                        if( !cbGeneroCu.getSelectedItem().toString().equals("Genero") ){
                           if( txtFechaNacimiento.getDate() != null ){
                                
                                Cuidador cu = new Cuidador(Long.parseLong(txtCedula.getText()), Long.parseLong(txtTelefonoCu.getText()),txtNombreCu.getText(),
                                                            txtApellidoCu.getText(),cbGeneroCu.getSelectedItem().toString(), txtEmailCu.getText(), txtFechaNacimiento.getDate());
                                if(cuDAO.registrar(cu))
                                    javax.swing.JOptionPane.showMessageDialog(null, "Cuidador registrado");
                                else
                                    javax.swing.JOptionPane.showMessageDialog(null, "No se pudo registrar el cuidador");

                                txtCedula.setText("");
                                txtTelefonoCu.setText("");
                                txtNombreCu.setText("");
                                txtApellidoCu.setText("");
                                cbGeneroCu.setSelectedIndex(0);
                                txtEmailCu.setText("");
                                txtFechaNacimiento.setDate(null);   
                           } else
                               javax.swing.JOptionPane.showMessageDialog(null, "Fecha de nacimiento obligatoria"); 
                        }else
                            javax.swing.JOptionPane.showMessageDialog(null, "Debe de elegir un genero"); 
                    }else
                        javax.swing.JOptionPane.showMessageDialog(null, "El apellido es obligatorio"); 
                }else
                    javax.swing.JOptionPane.showMessageDialog(null, "EL nombre es obligatorio"); 
            }else
                javax.swing.JOptionPane.showMessageDialog(null, "Telefono obligatorio, solo se aceptan numeros");          
        }else 
            javax.swing.JOptionPane.showMessageDialog(null, "Cedula obligatoria, solo se aceptan numeros");
        
       
        
    }//GEN-LAST:event_btnRegistrarCuActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
         cuDAO.listar(tabla);
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnZooMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnZooMouseClicked
        tabla.setModel(new DefaultTableModel());
        showCard("cardZoo");
    }//GEN-LAST:event_btnZooMouseClicked

    private void pnlBtnZooMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnZooMouseClicked
     
    }//GEN-LAST:event_pnlBtnZooMouseClicked

    private void btnAnimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnimalMouseClicked
        tabla.setModel(new DefaultTableModel());
        cbCuidadorAn.removeAllItems();
        cbCuidadorAn.addItem(null);
        cuDAO.cargarCuidadoresCb(cbCuidadorAn);
        showCard("cardAnimal");
    }//GEN-LAST:event_btnAnimalMouseClicked

    private void btnTransferenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferenciaMouseClicked
        cbAnimalTr.removeAllItems();
        cbAnimalTr.addItem(null);
        anDAO.cargarAnimal(cbAnimalTr);
        cbZoologicoTr.removeAllItems();
        cbZoologicoTr.addItem(null);
        zooDAO.cargarZoo(cbZoologicoTr);
        showCard("cardTrans");
    }//GEN-LAST:event_btnTransferenciaMouseClicked

    private void btnReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteMouseClicked
        showCard("cardReporte");
    }//GEN-LAST:event_btnReporteMouseClicked

    private void btnCuidadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCuidadorMouseClicked
        tabla.setModel(new DefaultTableModel());
        showCard("cardCuidador");
    }//GEN-LAST:event_btnCuidadorMouseClicked

    private void btnListarZooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarZooActionPerformed
        zooDAO.listar(tabla);
    }//GEN-LAST:event_btnListarZooActionPerformed

    private void btnRegistrarZooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarZooActionPerformed
        
        if( !txtNombreZoo.getText().trim().equals("") ){
            if( !txtCiudadZoo.getText().trim().equals("") ){
                if( !txtDirecZoo.getText().trim().equals("") ){
                    if( txtTelefonoZoo.getText().trim().matches("\\d+") ){ 
                        
                       Zoologico zoo = new Zoologico(Long.parseLong(txtTelefonoZoo.getText().trim()), txtNombreZoo.getText().trim(), txtCiudadZoo.getText().trim(),
                                      txtDirecZoo.getText().trim(), txtEmailZoo.getText().trim());
                       
                        if (zooDAO.registrar(zoo))
                                javax.swing.JOptionPane.showMessageDialog(null, "Registro Exitoso");
                        else
                             javax.swing.JOptionPane.showMessageDialog(null, "Fallo al registrar");
                        
                        txtNombreZoo.setText("");
                        txtCiudadZoo.setText("");
                        txtDirecZoo.setText("");
                        txtEmailZoo.setText("");
                        txtTelefonoZoo.setText("");

                    }else
                        javax.swing.JOptionPane.showMessageDialog(null, "El telefono es obligatorio");
                }else
                    javax.swing.JOptionPane.showMessageDialog(null, "La dirreccion es obligatoria");
            }else
                javax.swing.JOptionPane.showMessageDialog(null, "La ciudad es obligatoria");
        }else
            javax.swing.JOptionPane.showMessageDialog(null, "El nombre es obligatorio");
              
    }//GEN-LAST:event_btnRegistrarZooActionPerformed

    private void btnBuscarCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCuActionPerformed
        if( txtBuscarCu.getText().equals("") ) {
            javax.swing.JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
            return;
        }
        long idCuidador = Long.parseLong(txtBuscarCu.getText().trim());
        Cuidador cu = cuDAO.buscar(idCuidador);
        if( cu != null ){
            javax.swing.JOptionPane.showMessageDialog(null, "Cuidador encontrado");
            
            txtCedula.setText(String.valueOf(cu.getCedula()));
            txtNombreCu.setText(cu.getNombre());
            txtApellidoCu.setText(cu.getApellido());
            cbGeneroCu.setSelectedItem(cu.getGenero());
            txtTelefonoCu.setText(String.valueOf( cu.getTelefono()));
            txtEmailCu.setText(cu.getEmail());
            txtFechaNacimiento.setDate(cu.getfNaci());
          
        }else{
            javax.swing.JOptionPane.showMessageDialog(null, "El cuidador con el ID " + idCuidador + " no existe");
        }
        
        txtBuscarCu.setText("");
    }//GEN-LAST:event_btnBuscarCuActionPerformed

    private void btnBuscarZooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarZooActionPerformed
        if(txtBuscarZoo.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
            return;
        }
        
        long idZoo = Long.parseLong(txtBuscarZoo.getText());
        Zoologico zoo = zooDAO.buscar(idZoo);
        
        if( zoo != null ){
            javax.swing.JOptionPane.showMessageDialog(null, "Zoologico encontrado");
            txtNombreZoo.setText(zoo.getNombre());
            txtCiudadZoo.setText(zoo.getCiudad());
            txtDirecZoo.setText(zoo.getDireccion());
            txtTelefonoZoo.setText(String.valueOf(zoo.getTelefono()));
            txtEmailZoo.setText(zoo.getEmail());
        }else{
            javax.swing.JOptionPane.showMessageDialog(null, "El zoologico con el ID " + idZoo + " no existe");
        }
        
        txtBuscarZoo.setText("");
    }//GEN-LAST:event_btnBuscarZooActionPerformed

    private void btnActualizarCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCuActionPerformed
        if( txtCedula.getText().trim().matches("\\d+")){
            if( txtTelefonoCu.getText().trim().matches("\\d+") ){
                if ( !txtNombreCu.getText().trim().equals("") ){
                    if( !txtApellidoCu.getText().trim().equals("") ){
                        if( !cbGeneroCu.getSelectedItem().toString().equals("Genero") ){
                           if( txtFechaNacimiento.getDate() != null ){
                                
                                if(cuDAO.actualizar( txtNombreCu.getText(), txtApellidoCu.getText(),cbGeneroCu.getSelectedItem().toString(),
                                    Long.parseLong(txtTelefonoCu.getText()), txtEmailCu.getText(), txtFechaNacimiento.getDate())){

                                     javax.swing.JOptionPane.showMessageDialog(null, "Cuidador Actualizado");
                                 }else{
                                     javax.swing.JOptionPane.showMessageDialog(null, "No se pudo actualizar el cúuidador");
                                 }
                           } else
                               javax.swing.JOptionPane.showMessageDialog(null, "Fecha de nacimiento obligatoria"); 
                        }else
                            javax.swing.JOptionPane.showMessageDialog(null, "Debe de elegir un genero"); 
                    }else
                        javax.swing.JOptionPane.showMessageDialog(null, "El apellido es obligatorio"); 
                }else
                    javax.swing.JOptionPane.showMessageDialog(null, "EL nombre es obligatorio"); 
            }else
                javax.swing.JOptionPane.showMessageDialog(null, "Telefono obligatorio, solo se aceptan numeros");          
        }else 
            javax.swing.JOptionPane.showMessageDialog(null, "Cedula obligatoria, solo se aceptan numeros");
        
    }//GEN-LAST:event_btnActualizarCuActionPerformed

    private void btnActualizarZooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarZooActionPerformed
         if( !txtNombreZoo.getText().trim().equals("") ){
            if( !txtCiudadZoo.getText().trim().equals("") ){
                if( !txtDirecZoo.getText().trim().equals("") ){
                    if( txtTelefonoZoo.getText().trim().matches("\\d+") ){ 
                        
                       if( zooDAO.actualizar(txtNombreZoo.getText(), txtCiudadZoo.getText(), txtDirecZoo.getText(),
                                txtEmailZoo.getText(), Long.parseLong(txtTelefonoZoo.getText())))

                            javax.swing.JOptionPane.showMessageDialog(null, "Zoologico Actualizado");
                        else
                            javax.swing.JOptionPane.showMessageDialog(null, "Error al actualizar el zoologico");
                        
                        txtNombreZoo.setText("");
                        txtCiudadZoo.setText("");
                        txtDirecZoo.setText("");
                        txtEmailZoo.setText("");
                        txtTelefonoZoo.setText("");

                    }else
                        javax.swing.JOptionPane.showMessageDialog(null, "El telefono es obligatorio");
                }else
                    javax.swing.JOptionPane.showMessageDialog(null, "La dirreccion es obligatoria");
            }else
                javax.swing.JOptionPane.showMessageDialog(null, "La ciudad es obligatoria");
        }else
            javax.swing.JOptionPane.showMessageDialog(null, "El nombre es obligatorio");
         
        
    }//GEN-LAST:event_btnActualizarZooActionPerformed

    private void btnRegistrarAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAnActionPerformed
        
         if( cbCuidadorAn.getSelectedItem() != null ){
           if( !txtNombreAn.getText().trim().equals("") ){
               if( !cbTipoAn.getSelectedItem().toString().trim().equals("Tipo") ){
                   if( !cbGeneroAn.getSelectedItem().toString().trim().equals("Genero") ){
                       if( !cbEstadoAn.getSelectedItem().toString().trim().equals("Estado") ){
                           if( txtFechaAnimal.getDate() != null ){               
                                Cuidador cu = (Cuidador)cbCuidadorAn.getSelectedItem();
                                Animal animal = new Animal(cu.getCedula(), txtNombreAn.getText(), cbTipoAn.getSelectedItem().toString(), cbGeneroAn.getSelectedItem().toString(),
                                                            cbEstadoAn.getSelectedItem().toString(), txtFechaAnimal.getDate());

                                if(anDAO.registrar(animal))
                                    javax.swing.JOptionPane.showMessageDialog(null, "Animal registrado");
                                else
                                    javax.swing.JOptionPane.showMessageDialog(null, "No se pudo registrar el animal");

                                cbCuidadorAn.setSelectedItem(null);
                                txtNombreAn.setText("");
                                cbTipoAn.setSelectedIndex(0);
                                cbGeneroAn.setSelectedIndex(0);
                                cbEstadoAn.setSelectedIndex(0);
                                txtFechaAnimal.setDate(null);
                           }else
                                javax.swing.JOptionPane.showMessageDialog(null, "Fecha de entrada obligatoria");
                       }else 
                           javax.swing.JOptionPane.showMessageDialog(null, "Debe elegir un estado");
                   }else
                       javax.swing.JOptionPane.showMessageDialog(null, "Debe elegir un genero");
               }else
                   javax.swing.JOptionPane.showMessageDialog(null, "Debe elegir un tipo");
           }else
               javax.swing.JOptionPane.showMessageDialog(null, "El nombre es obligatorio");
       }else
           javax.swing.JOptionPane.showMessageDialog(null, "Debe elegir un cuidador");
        
             
    }//GEN-LAST:event_btnRegistrarAnActionPerformed

    private void btnListarAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAnActionPerformed
        anDAO.listar(tabla);
    }//GEN-LAST:event_btnListarAnActionPerformed

    private void btnBuscarAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAnActionPerformed
       
        if(txtBuscarAn.getText().equals("")){
           javax.swing.JOptionPane.showMessageDialog(null, "El campo no puede quedar vacio");
           return;
        }
        
        long idAnimal = Long.parseLong(txtBuscarAn.getText());
        Animal an = anDAO.buscar(idAnimal);
        
        if( an != null ){
            javax.swing.JOptionPane.showMessageDialog(null, "Animal encontrado");
            
            txtNombreAn.setText(an.getNombre());
            cbTipoAn.setSelectedItem(an.getTipo());
            cbGeneroAn.setSelectedItem(an.getGeneroA());
            cbEstadoAn.setSelectedItem(an.getEstadoA());
            
            //recorremos cada cuidador en el comboBox
            for(int i = 1; i < cbCuidadorAn.getItemCount(); i++){
                //creamos un apuntador con cada cuidador
                Cuidador item = cbCuidadorAn.getItemAt(i);
                //validamos si el id del apuntar es igual al idCuidador que tiene asignado el Animal
                if( item.getCedula() == an.getIdCuidador() ){
                    //si son iguales, establecemos en el comboBox el index que corresponda al Cuidador
                    cbCuidadorAn.setSelectedIndex(i);
                    break;
                }
            }
            
            txtFechaAnimal.setDate(an.getfEntrada());           
            
        }else
            javax.swing.JOptionPane.showMessageDialog(null, "El animal con el ID " + idAnimal + " no existe");
        
        txtBuscarAn.setText("");
    }//GEN-LAST:event_btnBuscarAnActionPerformed

    private void btnActualizarAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAnActionPerformed
        
        if( cbCuidadorAn.getSelectedItem() != null ){
           if( !txtNombreAn.getText().trim().equals("") ){
               if( !cbTipoAn.getSelectedItem().toString().trim().equals("Tipo") ){
                   if( !cbGeneroAn.getSelectedItem().toString().trim().equals("Genero") ){
                       if( !cbEstadoAn.getSelectedItem().toString().trim().equals("Estado") ){
                           if( txtFechaAnimal.getDate() != null ){               
                                
                                
                                Cuidador cu = (Cuidador)cbCuidadorAn.getSelectedItem();

                                if( anDAO.actualizar(txtNombreAn.getText(), cbTipoAn.getSelectedItem().toString(), cbGeneroAn.getSelectedItem().toString(), cbEstadoAn.getSelectedItem().toString(), cu.getCedula(), txtFechaAnimal.getDate())){
                                    javax.swing.JOptionPane.showMessageDialog(null, "El animal actualizado");
                                }else
                                    javax.swing.JOptionPane.showMessageDialog(null, "Error al actualizar el animal");
                               
                                cbCuidadorAn.setSelectedItem(null);
                                txtNombreAn.setText("");
                                cbTipoAn.setSelectedIndex(0);
                                cbGeneroAn.setSelectedIndex(0);
                                cbEstadoAn.setSelectedIndex(0);
                                txtFechaAnimal.setDate(null);
                           }else
                                javax.swing.JOptionPane.showMessageDialog(null, "Fecha de entrada obligatoria");
                       }else 
                           javax.swing.JOptionPane.showMessageDialog(null, "Debe elegir un estado");
                   }else
                       javax.swing.JOptionPane.showMessageDialog(null, "Debe elegir un genero");
               }else
                   javax.swing.JOptionPane.showMessageDialog(null, "Debe elegir un tipo");
           }else
               javax.swing.JOptionPane.showMessageDialog(null, "El nombre es obligatorio");
       }else
           javax.swing.JOptionPane.showMessageDialog(null, "Debe elegir un cuidador");
       
    }//GEN-LAST:event_btnActualizarAnActionPerformed

    private void btnRegistrarTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarTrActionPerformed
        
        if(cbAnimalTr.getSelectedItem() != null ){
            if( cbZoologicoTr.getSelectedItem() !=  null ){
                if( txtFechaSalida.getDate() != null){
                    Animal an = (Animal)cbAnimalTr.getSelectedItem();
                    Zoologico zoo = (Zoologico)cbZoologicoTr.getSelectedItem();

                    if(trDAO.registrar(new Transferencia(an.getIdA(), zoo.getId(), txtFechaSalida.getDate())))
                        javax.swing.JOptionPane.showMessageDialog(null, "Transferencia registrada");
                    else
                        javax.swing.JOptionPane.showMessageDialog(null, "Error al registrar transferencia");
                    
                    cbAnimalTr.setSelectedItem(null);
                    cbZoologicoTr.setSelectedItem(null);
                    txtFechaSalida.setDate(null);
                }else
                    javax.swing.JOptionPane.showMessageDialog(null, "Selecciona una fecha");
            }else
                javax.swing.JOptionPane.showMessageDialog(null, "Selecciona un zoologico");
        }else
            javax.swing.JOptionPane.showMessageDialog(null, "Selecciona un animal");
        
        
    }//GEN-LAST:event_btnRegistrarTrActionPerformed

    private void btnListarTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTrActionPerformed
        trDAO.listar(tabla);
    }//GEN-LAST:event_btnListarTrActionPerformed

    private void btnBuscarTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTrActionPerformed
       
        if(txtBuscarTr.getText().equals("")){
           javax.swing.JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
           return;
        }
        
        Transferencia tr = trDAO.buscar(Long.parseLong(txtBuscarTr.getText()));
       
       if( tr != null ){
           javax.swing.JOptionPane.showMessageDialog(null, "Transferencia encontrada");
           
           for( int i = 1; i < cbAnimalTr.getItemCount(); i++ ){
               Animal item = cbAnimalTr.getItemAt(i);
               if( item.getIdA() == tr.getIdAn() ){
                   cbAnimalTr.setSelectedIndex(i);
                   break;
               }
           }
           
           for( int i = 1; i < cbZoologicoTr.getItemCount(); i++){
               Zoologico item = cbZoologicoTr.getItemAt(i);
               if( item.getId() == tr.getIdZoo() ){
                   cbZoologicoTr.setSelectedIndex(i);
                   break;
               }
           }
           
           txtFechaSalida.setDate(tr.getFSalida());
           
           txtBuscarTr.setText("");
           
       }else
           javax.swing.JOptionPane.showMessageDialog(null, "Transferencia con el ID " + txtBuscarTr + " no existe");
    }//GEN-LAST:event_btnBuscarTrActionPerformed

    private void btnActualizarTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTrActionPerformed
    if(cbAnimalTr.getSelectedItem() != null ){
            if( cbZoologicoTr.getSelectedItem() !=  null ){
                if( txtFechaSalida.getDate() != null){
                    Animal an = (Animal)cbAnimalTr.getSelectedItem();
                    Zoologico zoo = (Zoologico)cbZoologicoTr.getSelectedItem();
                    Date fecha = txtFechaSalida.getDate();

                    if( trDAO.actualizar(an.getIdA(), zoo.getId(), fecha))
                        javax.swing.JOptionPane.showMessageDialog(null, "Transferencia actualizado");
                    else
                        javax.swing.JOptionPane.showMessageDialog(null, "Error al actualizar la transferencia");
                    
                    cbAnimalTr.setSelectedItem(null);
                    cbZoologicoTr.setSelectedItem(null);
                    txtFechaSalida.setDate(null);
                }else
                    javax.swing.JOptionPane.showMessageDialog(null, "Selecciona una fecha");
            }else
                javax.swing.JOptionPane.showMessageDialog(null, "Selecciona un zoologico");
        }else
            javax.swing.JOptionPane.showMessageDialog(null, "Selecciona un animal");
    }//GEN-LAST:event_btnActualizarTrActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
//            logger.log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> new FrZoomascotas(int id).setVisible(true));
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPnl;
    private javax.swing.JPanel bgPnlContent;
    private javax.swing.JButton btnActualizarAn;
    private javax.swing.JButton btnActualizarCu;
    private javax.swing.JButton btnActualizarTr;
    private javax.swing.JButton btnActualizarZoo;
    private javax.swing.JLabel btnAnimal;
    private javax.swing.JButton btnBuscarAn;
    private javax.swing.JButton btnBuscarCu;
    private javax.swing.JButton btnBuscarTr;
    private javax.swing.JButton btnBuscarZoo;
    private javax.swing.JLabel btnCuidador;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnListarAn;
    private javax.swing.JButton btnListarTr;
    private javax.swing.JButton btnListarZoo;
    private javax.swing.JButton btnRegistrarAn;
    private javax.swing.JButton btnRegistrarCu;
    private javax.swing.JButton btnRegistrarTr;
    private javax.swing.JButton btnRegistrarZoo;
    private javax.swing.JLabel btnReporte;
    private javax.swing.JLabel btnTransferencia;
    private javax.swing.JLabel btnZoo;
    private javax.swing.JPanel cardAnimal;
    private javax.swing.JPanel cardCuidador;
    private javax.swing.JPanel cardReporte;
    private javax.swing.JPanel cardTransferencia;
    private javax.swing.JPanel cardZoo;
    private javax.swing.JComboBox<Animal> cbAnimalTr;
    private javax.swing.JComboBox<Cuidador> cbCuidadorAn;
    private javax.swing.JComboBox<String> cbEstadoAn;
    private javax.swing.JComboBox<String> cbGeneroAn;
    private javax.swing.JComboBox<String> cbGeneroCu;
    private javax.swing.JComboBox<String> cbTipoAn;
    private javax.swing.JComboBox<Zoologico> cbZoologicoTr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbAnimalTr;
    private javax.swing.JLabel lbApellidoCu;
    private javax.swing.JLabel lbCedula;
    private javax.swing.JLabel lbCiudadZoo;
    private javax.swing.JLabel lbCuidadorAn;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbEmailZoo;
    private javax.swing.JLabel lbFechaAnimal;
    private javax.swing.JLabel lbNombreAn;
    private javax.swing.JLabel lbNombreCu;
    private javax.swing.JLabel lbNombreUser;
    private javax.swing.JLabel lbNombreZoo;
    private javax.swing.JLabel lbTelefonoCu;
    private javax.swing.JLabel lbTelefonoZoo;
    private javax.swing.JLabel lbTituloCu;
    private javax.swing.JLabel lbTraslado;
    private javax.swing.JLabel lbZoologicoTr;
    private javax.swing.JPanel pnlBtnAnimal;
    private javax.swing.JPanel pnlBtnCuidador;
    private javax.swing.JPanel pnlBtnTransfe;
    private javax.swing.JPanel pnlBtnZoo;
    private javax.swing.JPanel pnlCardLayout;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlTablas;
    private javax.swing.JPanel pnlbtnReporte;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel tituloZoo;
    private javax.swing.JTextField txtApellidoCu;
    private javax.swing.JTextField txtBuscarAn;
    private javax.swing.JTextField txtBuscarCu;
    private javax.swing.JTextField txtBuscarTr;
    private javax.swing.JTextField txtBuscarZoo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCiudadZoo;
    private javax.swing.JTextField txtDirecZoo;
    private javax.swing.JTextField txtEmailCu;
    private javax.swing.JTextField txtEmailZoo;
    private com.toedter.calendar.JDateChooser txtFechaAnimal;
    private com.toedter.calendar.JDateChooser txtFechaNacimiento;
    private com.toedter.calendar.JDateChooser txtFechaSalida;
    private javax.swing.JTextField txtNombreAn;
    private javax.swing.JTextField txtNombreCu;
    private javax.swing.JTextField txtNombreZoo;
    private javax.swing.JTextField txtTelefonoCu;
    private javax.swing.JTextField txtTelefonoZoo;
    // End of variables declaration//GEN-END:variables

    public JPanel getPnlMenu(){
        return pnlMenu;
    }
    
    public JPanel getBgPnlContent(){
        return bgPnlContent;
    }
    
    public JPanel getPnlCardLayout(){
        return pnlCardLayout;
    }
    public JPanel getPnlTablas(){
        return pnlTablas;
    }
    
    public JPanel getPnlBtnCuidador(){
        return pnlBtnCuidador;
    }

}
