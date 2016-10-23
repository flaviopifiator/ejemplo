package laboratorio;

import exception. *;
import fondos.AgregarFondo;
import fondos.Graficos;
import fondos.BuscarFondo;
import fondos.ListadoFondo;
import fondos.InfoFondo;
import fondos.ModificarFondo;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    
    NominaEmpleado ne = new NominaEmpleado();
    int nivel=0;
    boolean lista=true;
    
    public Principal() {
        initComponents();
        Graficos fondo = new Graficos(450,500);
        this.add(fondo, BorderLayout.CENTER);
        this.pack();
        Fecha f = new Fecha();
        jLabel23.setText(f.devolverFecha());
        agregarButton.setFocusPainted(false);
        agregarButton.setBorderPainted(false);
        agregarButton.setContentAreaFilled(false);
        buscarButton.setFocusPainted(false);
        buscarButton.setBorderPainted(false);
        buscarButton.setContentAreaFilled(false);
        listadoButton.setFocusPainted(false);
        listadoButton.setBorderPainted(false);
        listadoButton.setContentAreaFilled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgregarEmpleado = new javax.swing.JFrame();
        Apellido = new javax.swing.JTextField();
        Dni = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Domicilio = new javax.swing.JTextField();
        MesNac = new javax.swing.JTextField();
        AñoNac = new javax.swing.JTextField();
        DiaNac = new javax.swing.JTextField();
        DiaIng = new javax.swing.JTextField();
        MesIng = new javax.swing.JTextField();
        AñoIng = new javax.swing.JTextField();
        Legajo = new javax.swing.JTextField();
        guardarDesdeNuevoButton = new javax.swing.JButton();
        sexo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cancelarDesdeNuevoButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cargo = new javax.swing.JComboBox();
        sucVentas = new javax.swing.JTextField();
        porcVentas = new javax.swing.JTextField();
        area = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        AgregarFamiliar = new javax.swing.JFrame();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        sexoF = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        ApellidoF = new javax.swing.JTextField();
        DniF = new javax.swing.JTextField();
        NombreF = new javax.swing.JTextField();
        DomicilioF = new javax.swing.JTextField();
        MesNacF = new javax.swing.JTextField();
        AñoNacF = new javax.swing.JTextField();
        DiaNacF = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        relacionF = new javax.swing.JComboBox();
        salirDesdeFamiliarButton = new javax.swing.JButton();
        agregarDesdeFamiliarButton = new javax.swing.JButton();
        ListadoEmpleados = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        listadoA = new javax.swing.JTable();
        salirDesdeListado = new javax.swing.JButton();
        infoDesdeListado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ListadoFamiliar = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadoF = new javax.swing.JTable();
        salirDesdeListaFButton = new javax.swing.JButton();
        agregarDesdeListadoFButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        InfoEmpleado = new javax.swing.JFrame();
        modificarDesdeInfoButton = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        familiaresDesdeInfoButton = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        salirDesdeInfoButton = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        apeYNom = new javax.swing.JLabel();
        docu = new javax.swing.JLabel();
        domi = new javax.swing.JLabel();
        feNa = new javax.swing.JLabel();
        feIn = new javax.swing.JLabel();
        nuLe = new javax.swing.JLabel();
        sucu = new javax.swing.JLabel();
        noAr = new javax.swing.JLabel();
        xose = new javax.swing.JLabel();
        goca = new javax.swing.JLabel();
        poVe = new javax.swing.JLabel();
        eliminarDesdeInfoButton = new javax.swing.JButton();
        empleadosDesdeInfoButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ModificarEmpleado = new javax.swing.JFrame();
        LegajoM = new javax.swing.JTextField();
        sucVentasM = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        porcVentasM = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        areaM = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        sexoM = new javax.swing.JComboBox();
        jLabel50 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        ApellidoM = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        DniM = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        NombreM = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        DomicilioM = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        MesNacM = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        AñoNacM = new javax.swing.JTextField();
        DiaNacM = new javax.swing.JTextField();
        DiaIngM = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        cargoM = new javax.swing.JComboBox();
        MesIngM = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        AñoIngM = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        salirDesdeModificarButton = new javax.swing.JButton();
        aceptarDesdeModificarButton = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        BuscarEmpleado = new javax.swing.JFrame();
        jLabel67 = new javax.swing.JLabel();
        campoClave = new javax.swing.JComboBox();
        buscarDesdeBuscarButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listadoB = new javax.swing.JTable();
        jLabel70 = new javax.swing.JLabel();
        salirDesdeBusquedaButton = new javax.swing.JButton();
        infoDesdeBusquedaButton = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        Palabra = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ListadoArea = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        listado1 = new javax.swing.JTable();
        salirDesdeListado1 = new javax.swing.JButton();
        infoDesdeListado1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listado2 = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        nombreJefe = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        agregarButton = new javax.swing.JButton();
        listadoButton = new javax.swing.JButton();
        buscarButton = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();

        AgregarEmpleado.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AgregarEmpleado.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                AgregarEmpleadoWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                AgregarEmpleadoWindowClosing(evt);
            }
        });

        Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoActionPerformed(evt);
            }
        });

        Dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DniActionPerformed(evt);
            }
        });
        Dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DniKeyTyped(evt);
            }
        });

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        Domicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DomicilioActionPerformed(evt);
            }
        });

        MesNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesNacActionPerformed(evt);
            }
        });
        MesNac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MesNacKeyTyped(evt);
            }
        });

        AñoNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñoNacActionPerformed(evt);
            }
        });
        AñoNac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AñoNacKeyTyped(evt);
            }
        });

        DiaNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaNacActionPerformed(evt);
            }
        });
        DiaNac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DiaNacKeyTyped(evt);
            }
        });

        DiaIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaIngActionPerformed(evt);
            }
        });
        DiaIng.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DiaIngKeyTyped(evt);
            }
        });

        MesIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesIngActionPerformed(evt);
            }
        });
        MesIng.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MesIngKeyTyped(evt);
            }
        });

        AñoIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñoIngActionPerformed(evt);
            }
        });
        AñoIng.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AñoIngKeyTyped(evt);
            }
        });

        Legajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LegajoActionPerformed(evt);
            }
        });

        guardarDesdeNuevoButton.setBackground(new java.awt.Color(118, 158, 39));
        guardarDesdeNuevoButton.setForeground(new java.awt.Color(51, 51, 51));
        guardarDesdeNuevoButton.setText("Guardar");
        guardarDesdeNuevoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDesdeNuevoButtonActionPerformed(evt);
            }
        });

        sexo.setForeground(new java.awt.Color(118, 158, 39));
        sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setForeground(new java.awt.Color(118, 158, 39));
        jLabel6.setText("dd/");

        jLabel7.setForeground(new java.awt.Color(118, 158, 39));
        jLabel7.setText("mm/");

        jLabel8.setForeground(new java.awt.Color(118, 158, 39));
        jLabel8.setText("aaaa");

        jLabel10.setForeground(new java.awt.Color(118, 158, 39));
        jLabel10.setText("dd/");

        jLabel11.setForeground(new java.awt.Color(118, 158, 39));
        jLabel11.setText("mm/");

        jLabel12.setForeground(new java.awt.Color(118, 158, 39));
        jLabel12.setText("aaaa");

        cancelarDesdeNuevoButton.setBackground(new java.awt.Color(118, 158, 39));
        cancelarDesdeNuevoButton.setText("Cancelar");
        cancelarDesdeNuevoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarDesdeNuevoButtonActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(118, 158, 39));
        jLabel15.setText("Sin puntos");

        cargo.setForeground(new java.awt.Color(118, 158, 39));
        cargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cargo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cargoItemStateChanged(evt);
            }
        });
        cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoActionPerformed(evt);
            }
        });

        area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                areaKeyReleased(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(204, 0, 0));
        jLabel20.setText("Sólo vendedores*");

        jLabel21.setForeground(new java.awt.Color(204, 0, 0));
        jLabel21.setText("Sólo vendedores*");

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(118, 158, 39));
        jLabel71.setText("Apellidos:");

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(118, 158, 39));
        jLabel72.setText("Nombres:");

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(118, 158, 39));
        jLabel73.setText("Documento:");

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(118, 158, 39));
        jLabel74.setText("Domicilio:");

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(118, 158, 39));
        jLabel75.setText("Fecha de nacimiento:");

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(118, 158, 39));
        jLabel76.setText("Sexo:");

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(118, 158, 39));
        jLabel77.setText("Fecha de ingreso:");

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(118, 158, 39));
        jLabel79.setText("Número de legajo:");

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(118, 158, 39));
        jLabel80.setText("Cargo:");

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(118, 158, 39));
        jLabel81.setText("Sucursal de ventas:");

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(118, 158, 39));
        jLabel82.setText("Porcentaje por ventas:");

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(118, 158, 39));
        jLabel83.setText("Nombre del área:");

        jSeparator1.setBackground(new java.awt.Color(118, 158, 39));

        jSeparator2.setBackground(new java.awt.Color(118, 158, 39));

        jLabel24.setForeground(new java.awt.Color(204, 0, 0));
        jLabel24.setText("No hay Jefe de Area");

        javax.swing.GroupLayout AgregarEmpleadoLayout = new javax.swing.GroupLayout(AgregarEmpleado.getContentPane());
        AgregarEmpleado.getContentPane().setLayout(AgregarEmpleadoLayout);
        AgregarEmpleadoLayout.setHorizontalGroup(
            AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarEmpleadoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgregarEmpleadoLayout.createSequentialGroup()
                        .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel77)
                            .addComponent(jLabel79)
                            .addComponent(jLabel74)
                            .addComponent(jLabel73)
                            .addComponent(jLabel72)
                            .addComponent(jLabel71)
                            .addComponent(jLabel76))
                        .addGap(18, 18, 18)
                        .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AgregarEmpleadoLayout.createSequentialGroup()
                                .addComponent(Dni, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15))
                            .addComponent(Nombre)
                            .addComponent(Domicilio)
                            .addComponent(Apellido)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarEmpleadoLayout.createSequentialGroup()
                                .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Legajo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AgregarEmpleadoLayout.createSequentialGroup()
                                        .addComponent(DiaIng, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(MesIng, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AgregarEmpleadoLayout.createSequentialGroup()
                                        .addComponent(DiaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                        .addComponent(MesNac, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(AgregarEmpleadoLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AñoIng, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12))
                                    .addGroup(AgregarEmpleadoLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(36, 36, 36)
                                        .addComponent(AñoNac, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)))
                                .addGap(8, 8, 8))))
                    .addGroup(AgregarEmpleadoLayout.createSequentialGroup()
                        .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AgregarEmpleadoLayout.createSequentialGroup()
                                .addComponent(jLabel83)
                                .addGap(43, 43, 43)
                                .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(AgregarEmpleadoLayout.createSequentialGroup()
                                        .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(AgregarEmpleadoLayout.createSequentialGroup()
                                        .addComponent(porcVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel21))
                                    .addGroup(AgregarEmpleadoLayout.createSequentialGroup()
                                        .addComponent(sucVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel20))
                                    .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                                .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarEmpleadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarDesdeNuevoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelarDesdeNuevoButton)
                .addContainerGap())
        );
        AgregarEmpleadoLayout.setVerticalGroup(
            AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarEmpleadoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71))
                .addGap(8, 8, 8)
                .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel73))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MesNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AñoNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel75))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarEmpleadoLayout.createSequentialGroup()
                        .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(DiaIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MesIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AñoIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel77))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Legajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sucVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(porcVentas)
                        .addComponent(jLabel82))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel83)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarDesdeNuevoButton)
                    .addComponent(cancelarDesdeNuevoButton))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        AgregarFamiliar.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                AgregarFamiliarWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                AgregarFamiliarWindowClosing(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(118, 158, 39));
        jLabel25.setText("Apellidos:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(118, 158, 39));
        jLabel26.setText("Documento:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(118, 158, 39));
        jLabel27.setText("Nombres:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(118, 158, 39));
        jLabel28.setText("Fecha de nacimiento:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(118, 158, 39));
        jLabel29.setText("Domicilio:");

        sexoF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sexoF.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sexoFItemStateChanged(evt);
            }
        });

        jLabel30.setForeground(new java.awt.Color(118, 158, 39));
        jLabel30.setText("dd/");

        jLabel31.setForeground(new java.awt.Color(118, 158, 39));
        jLabel31.setText("mm/");

        jLabel32.setForeground(new java.awt.Color(118, 158, 39));
        jLabel32.setText("aaaa");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(118, 158, 39));
        jLabel33.setText("Sexo:");

        ApellidoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoFActionPerformed(evt);
            }
        });

        DniF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DniFActionPerformed(evt);
            }
        });
        DniF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DniFKeyTyped(evt);
            }
        });

        NombreF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreFActionPerformed(evt);
            }
        });

        DomicilioF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DomicilioFActionPerformed(evt);
            }
        });

        MesNacF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesNacFActionPerformed(evt);
            }
        });
        MesNacF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MesNacFKeyTyped(evt);
            }
        });

        AñoNacF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñoNacFActionPerformed(evt);
            }
        });
        AñoNacF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AñoNacFKeyTyped(evt);
            }
        });

        DiaNacF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaNacFActionPerformed(evt);
            }
        });
        DiaNacF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DiaNacFKeyTyped(evt);
            }
        });

        jLabel34.setForeground(new java.awt.Color(118, 158, 39));
        jLabel34.setText("Sin puntos");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(118, 158, 39));
        jLabel35.setText("Relación c/empleado:");

        relacionF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        salirDesdeFamiliarButton.setBackground(new java.awt.Color(118, 158, 39));
        salirDesdeFamiliarButton.setText("Salir");
        salirDesdeFamiliarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirDesdeFamiliarButtonActionPerformed(evt);
            }
        });

        agregarDesdeFamiliarButton.setBackground(new java.awt.Color(118, 158, 39));
        agregarDesdeFamiliarButton.setText("Agregar");
        agregarDesdeFamiliarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarDesdeFamiliarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AgregarFamiliarLayout = new javax.swing.GroupLayout(AgregarFamiliar.getContentPane());
        AgregarFamiliar.getContentPane().setLayout(AgregarFamiliarLayout);
        AgregarFamiliarLayout.setHorizontalGroup(
            AgregarFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarFamiliarLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(AgregarFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addComponent(jLabel33)
                    .addComponent(jLabel35))
                .addGap(36, 36, 36)
                .addGroup(AgregarFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(relacionF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AgregarFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(AgregarFamiliarLayout.createSequentialGroup()
                            .addComponent(agregarDesdeFamiliarButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(salirDesdeFamiliarButton))
                        .addGroup(AgregarFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sexoF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AgregarFamiliarLayout.createSequentialGroup()
                                .addComponent(DniF, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel34))
                            .addComponent(NombreF)
                            .addComponent(DomicilioF)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarFamiliarLayout.createSequentialGroup()
                                .addComponent(DiaNacF, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(MesNacF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel31)
                                .addGap(35, 35, 35)
                                .addComponent(AñoNacF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel32)
                                .addGap(8, 8, 8))
                            .addComponent(ApellidoF))))
                .addContainerGap())
        );
        AgregarFamiliarLayout.setVerticalGroup(
            AgregarFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarFamiliarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(AgregarFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApellidoF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(8, 8, 8)
                .addGroup(AgregarFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DniF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DomicilioF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiaNacF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MesNacF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AñoNacF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexoF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(relacionF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salirDesdeFamiliarButton)
                    .addComponent(agregarDesdeFamiliarButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ListadoEmpleados.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                ListadoEmpleadosWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                ListadoEmpleadosWindowClosing(evt);
            }
        });

        listadoA.setBackground(new java.awt.Color(22, 174, 197));
        listadoA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(listadoA);

        salirDesdeListado.setBackground(new java.awt.Color(22, 174, 197));
        salirDesdeListado.setText("Salir");
        salirDesdeListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirDesdeListadoActionPerformed(evt);
            }
        });

        infoDesdeListado.setBackground(new java.awt.Color(22, 174, 197));
        infoDesdeListado.setText("Información");
        infoDesdeListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoDesdeListadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ListadoEmpleadosLayout = new javax.swing.GroupLayout(ListadoEmpleados.getContentPane());
        ListadoEmpleados.getContentPane().setLayout(ListadoEmpleadosLayout);
        ListadoEmpleadosLayout.setHorizontalGroup(
            ListadoEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListadoEmpleadosLayout.createSequentialGroup()
                .addGroup(ListadoEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ListadoEmpleadosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(infoDesdeListado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salirDesdeListado))
                    .addGroup(ListadoEmpleadosLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ListadoEmpleadosLayout.setVerticalGroup(
            ListadoEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListadoEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ListadoEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salirDesdeListado)
                    .addComponent(infoDesdeListado))
                .addGap(7, 7, 7))
            .addGroup(ListadoEmpleadosLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ListadoFamiliar.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                ListadoFamiliarWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                ListadoFamiliarWindowClosing(evt);
            }
        });

        listadoF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(listadoF);

        salirDesdeListaFButton.setBackground(new java.awt.Color(22, 175, 198));
        salirDesdeListaFButton.setText("Salir");
        salirDesdeListaFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirDesdeListaFButtonActionPerformed(evt);
            }
        });

        agregarDesdeListadoFButton.setBackground(new java.awt.Color(22, 175, 198));
        agregarDesdeListadoFButton.setText("Agregar");
        agregarDesdeListadoFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarDesdeListadoFButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ListadoFamiliarLayout = new javax.swing.GroupLayout(ListadoFamiliar.getContentPane());
        ListadoFamiliar.getContentPane().setLayout(ListadoFamiliarLayout);
        ListadoFamiliarLayout.setHorizontalGroup(
            ListadoFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListadoFamiliarLayout.createSequentialGroup()
                .addGroup(ListadoFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListadoFamiliarLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agregarDesdeListadoFButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salirDesdeListaFButton))
                    .addGroup(ListadoFamiliarLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ListadoFamiliarLayout.setVerticalGroup(
            ListadoFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListadoFamiliarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ListadoFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListadoFamiliarLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListadoFamiliarLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addGroup(ListadoFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salirDesdeListaFButton)
                    .addComponent(agregarDesdeListadoFButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        InfoEmpleado.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                InfoEmpleadoWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                InfoEmpleadoWindowClosing(evt);
            }
        });

        modificarDesdeInfoButton.setBackground(new java.awt.Color(154, 2, 20));
        modificarDesdeInfoButton.setForeground(new java.awt.Color(242, 135, 39));
        modificarDesdeInfoButton.setText("Modificar");
        modificarDesdeInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarDesdeInfoButtonActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(154, 2, 20));
        jLabel22.setText("Porcentaje p/ventas:");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(154, 2, 20));
        jLabel36.setText("Apellidos y Nombres: ");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(154, 2, 20));
        jLabel37.setText("Documento:");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(154, 2, 20));
        jLabel39.setText("Nombre del área:");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(154, 2, 20));
        jLabel40.setText("Fecha de nacimiento:");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(154, 2, 20));
        jLabel42.setText("Domicilio:");

        familiaresDesdeInfoButton.setBackground(new java.awt.Color(154, 2, 20));
        familiaresDesdeInfoButton.setForeground(new java.awt.Color(242, 135, 39));
        familiaresDesdeInfoButton.setText("Familiares");
        familiaresDesdeInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familiaresDesdeInfoButtonActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(154, 2, 20));
        jLabel47.setText("Sexo:");

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(154, 2, 20));
        jLabel51.setText("Fecha de ingreso:");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(154, 2, 20));
        jLabel52.setText("Número de legajo:");

        salirDesdeInfoButton.setBackground(new java.awt.Color(154, 2, 20));
        salirDesdeInfoButton.setForeground(new java.awt.Color(242, 135, 39));
        salirDesdeInfoButton.setText("Cancelar");
        salirDesdeInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirDesdeInfoButtonActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(154, 2, 20));
        jLabel54.setText("Cargo:");

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(154, 2, 20));
        jLabel55.setText("Sucursal de ventas:");

        apeYNom.setForeground(new java.awt.Color(242, 135, 39));
        apeYNom.setText("jLabel38");

        docu.setForeground(new java.awt.Color(242, 135, 39));
        docu.setText("jLabel38");

        domi.setForeground(new java.awt.Color(242, 135, 39));
        domi.setText("jLabel38");

        feNa.setForeground(new java.awt.Color(242, 135, 39));
        feNa.setText("jLabel38");

        feIn.setForeground(new java.awt.Color(242, 135, 39));
        feIn.setText("jLabel38");

        nuLe.setForeground(new java.awt.Color(242, 135, 39));
        nuLe.setText("jLabel38");

        sucu.setForeground(new java.awt.Color(242, 135, 39));
        sucu.setText("Solo vendedores*");

        noAr.setForeground(new java.awt.Color(242, 135, 39));
        noAr.setText("jLabel38");

        xose.setForeground(new java.awt.Color(242, 135, 39));
        xose.setText("jLabel38");

        goca.setForeground(new java.awt.Color(242, 135, 39));
        goca.setText("jLabel38");

        poVe.setForeground(new java.awt.Color(242, 135, 39));

        eliminarDesdeInfoButton.setBackground(new java.awt.Color(154, 2, 20));
        eliminarDesdeInfoButton.setForeground(new java.awt.Color(242, 135, 39));
        eliminarDesdeInfoButton.setText("Eliminar");
        eliminarDesdeInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDesdeInfoButtonActionPerformed(evt);
            }
        });

        empleadosDesdeInfoButton.setBackground(new java.awt.Color(154, 2, 20));
        empleadosDesdeInfoButton.setForeground(new java.awt.Color(242, 135, 39));
        empleadosDesdeInfoButton.setText("Empleados");
        empleadosDesdeInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadosDesdeInfoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InfoEmpleadoLayout = new javax.swing.GroupLayout(InfoEmpleado.getContentPane());
        InfoEmpleado.getContentPane().setLayout(InfoEmpleadoLayout);
        InfoEmpleadoLayout.setHorizontalGroup(
            InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoEmpleadoLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfoEmpleadoLayout.createSequentialGroup()
                        .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37)
                            .addComponent(jLabel42))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apeYNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(docu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(domi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(InfoEmpleadoLayout.createSequentialGroup()
                        .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoEmpleadoLayout.createSequentialGroup()
                                .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel52))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(feNa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(feIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nuLe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sucu, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(InfoEmpleadoLayout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(poVe, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(InfoEmpleadoLayout.createSequentialGroup()
                                        .addComponent(jLabel54)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(goca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(InfoEmpleadoLayout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(noAr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(InfoEmpleadoLayout.createSequentialGroup()
                                        .addComponent(jLabel47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(xose, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(InfoEmpleadoLayout.createSequentialGroup()
                                .addComponent(eliminarDesdeInfoButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modificarDesdeInfoButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(empleadosDesdeInfoButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(familiaresDesdeInfoButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salirDesdeInfoButton)))
                        .addContainerGap())))
        );
        InfoEmpleadoLayout.setVerticalGroup(
            InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(apeYNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(docu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(domi))
                .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfoEmpleadoLayout.createSequentialGroup()
                        .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel47)
                                .addComponent(xose))
                            .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel40)
                                .addComponent(feNa)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(feIn))
                        .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InfoEmpleadoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel52)
                                    .addComponent(nuLe)
                                    .addComponent(jLabel39)
                                    .addComponent(noAr)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoEmpleadoLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(InfoEmpleadoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54)
                            .addComponent(goca))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(poVe, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel55)
                        .addComponent(sucu)
                        .addComponent(jLabel22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InfoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarDesdeInfoButton)
                    .addComponent(salirDesdeInfoButton)
                    .addComponent(familiaresDesdeInfoButton)
                    .addComponent(eliminarDesdeInfoButton)
                    .addComponent(empleadosDesdeInfoButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ModificarEmpleado.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                ModificarEmpleadoWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                ModificarEmpleadoWindowClosing(evt);
            }
        });

        LegajoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LegajoMActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(225, 225, 226));
        jLabel38.setText("Porcentaje p/ventas:");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(225, 225, 226));
        jLabel41.setText("Apellidos:");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(225, 225, 226));
        jLabel43.setText("Documento:");

        areaM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                areaMKeyReleased(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(225, 225, 226));
        jLabel44.setText("Nombre:");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(225, 225, 226));
        jLabel45.setText("Nombre del área:");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(225, 225, 226));
        jLabel46.setText("Fecha de nacimiento:");

        jLabel48.setForeground(new java.awt.Color(255, 51, 0));
        jLabel48.setText("Sólo vendedores*");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(225, 225, 226));
        jLabel49.setText("Domicilio:");

        sexoM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel50.setForeground(new java.awt.Color(255, 51, 0));
        jLabel50.setText("Sólo vendedores*");

        jLabel53.setForeground(new java.awt.Color(225, 225, 226));
        jLabel53.setText("dd/");

        jLabel56.setForeground(new java.awt.Color(225, 225, 226));
        jLabel56.setText("mm/");

        jLabel57.setForeground(new java.awt.Color(225, 225, 226));
        jLabel57.setText("aaaa");

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(225, 225, 226));
        jLabel58.setText("Sexo:");

        ApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoMActionPerformed(evt);
            }
        });

        jLabel59.setForeground(new java.awt.Color(225, 225, 226));
        jLabel59.setText("dd/");

        DniM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DniMActionPerformed(evt);
            }
        });
        DniM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DniMKeyTyped(evt);
            }
        });

        jLabel60.setForeground(new java.awt.Color(225, 225, 226));
        jLabel60.setText("mm/");

        NombreM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreMActionPerformed(evt);
            }
        });

        jLabel61.setForeground(new java.awt.Color(225, 225, 226));
        jLabel61.setText("aaaa");

        DomicilioM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DomicilioMActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(225, 225, 226));
        jLabel62.setText("Fecha de ingreso:");

        MesNacM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesNacMActionPerformed(evt);
            }
        });
        MesNacM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MesNacMKeyTyped(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(225, 225, 226));
        jLabel63.setText("Número de legajo:");

        AñoNacM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñoNacMActionPerformed(evt);
            }
        });
        AñoNacM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AñoNacMKeyTyped(evt);
            }
        });

        DiaNacM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaNacMActionPerformed(evt);
            }
        });
        DiaNacM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DiaNacMKeyTyped(evt);
            }
        });

        DiaIngM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaIngMActionPerformed(evt);
            }
        });
        DiaIngM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DiaIngMKeyTyped(evt);
            }
        });

        jLabel64.setForeground(new java.awt.Color(225, 225, 226));
        jLabel64.setText("Sin puntos");

        cargoM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cargoM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cargoMItemStateChanged(evt);
            }
        });
        cargoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoMActionPerformed(evt);
            }
        });

        MesIngM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesIngMActionPerformed(evt);
            }
        });
        MesIngM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MesIngMKeyTyped(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(225, 225, 226));
        jLabel65.setText("Cargo:");

        AñoIngM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñoIngMActionPerformed(evt);
            }
        });
        AñoIngM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AñoIngMKeyTyped(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(225, 225, 226));
        jLabel66.setText("Sucursal de ventas:");

        salirDesdeModificarButton.setBackground(new java.awt.Color(225, 225, 225));
        salirDesdeModificarButton.setText("Cancelar");
        salirDesdeModificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirDesdeModificarButtonActionPerformed(evt);
            }
        });

        aceptarDesdeModificarButton.setBackground(new java.awt.Color(225, 225, 225));
        aceptarDesdeModificarButton.setText("Aceptar");
        aceptarDesdeModificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarDesdeModificarButtonActionPerformed(evt);
            }
        });

        jLabel84.setForeground(new java.awt.Color(255, 51, 0));
        jLabel84.setText("Sólo Admin, Oper o Jefe*");

        javax.swing.GroupLayout ModificarEmpleadoLayout = new javax.swing.GroupLayout(ModificarEmpleado.getContentPane());
        ModificarEmpleado.getContentPane().setLayout(ModificarEmpleadoLayout);
        ModificarEmpleadoLayout.setHorizontalGroup(
            ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarEmpleadoLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarEmpleadoLayout.createSequentialGroup()
                        .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ModificarEmpleadoLayout.createSequentialGroup()
                                .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel45))
                                .addGap(18, 18, 18)
                                .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(porcVentasM, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ModificarEmpleadoLayout.createSequentialGroup()
                                        .addComponent(areaM, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel84))))
                            .addGroup(ModificarEmpleadoLayout.createSequentialGroup()
                                .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel49)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel62)
                                    .addComponent(jLabel63)
                                    .addComponent(jLabel65)
                                    .addComponent(jLabel66))
                                .addGap(18, 18, 18)
                                .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cargoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(LegajoM, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sexoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(ModificarEmpleadoLayout.createSequentialGroup()
                                            .addComponent(DniM, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel64))
                                        .addComponent(NombreM)
                                        .addComponent(DomicilioM)
                                        .addComponent(ApellidoM)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarEmpleadoLayout.createSequentialGroup()
                                            .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(ModificarEmpleadoLayout.createSequentialGroup()
                                                    .addComponent(DiaIngM, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel59)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                                    .addComponent(MesIngM, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(ModificarEmpleadoLayout.createSequentialGroup()
                                                    .addComponent(DiaNacM, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel53)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(MesNacM, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarEmpleadoLayout.createSequentialGroup()
                                                    .addComponent(jLabel56)
                                                    .addGap(35, 35, 35)
                                                    .addComponent(AñoNacM, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel57))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarEmpleadoLayout.createSequentialGroup()
                                                    .addComponent(jLabel60)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(AñoIngM, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel61)))
                                            .addGap(8, 8, 8)))
                                    .addGroup(ModificarEmpleadoLayout.createSequentialGroup()
                                        .addComponent(sucVentasM, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel50)
                                            .addComponent(jLabel48))))))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarEmpleadoLayout.createSequentialGroup()
                        .addComponent(aceptarDesdeModificarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salirDesdeModificarButton)
                        .addContainerGap())))
        );
        ModificarEmpleadoLayout.setVerticalGroup(
            ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(8, 8, 8)
                .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DniM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DomicilioM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiaNacM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MesNacM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AñoNacM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel53)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60)
                    .addComponent(jLabel61)
                    .addComponent(DiaIngM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MesIngM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AñoIngM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LegajoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(sucVentasM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(porcVentasM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel84)
                    .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(areaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel45)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ModificarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salirDesdeModificarButton)
                    .addComponent(aceptarDesdeModificarButton))
                .addContainerGap())
        );

        BuscarEmpleado.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                BuscarEmpleadoWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                BuscarEmpleadoWindowClosing(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(161, 161, 56));
        jLabel67.setText("Buscar por:");

        campoClave.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        campoClave.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                campoClaveItemStateChanged(evt);
            }
        });

        buscarDesdeBuscarButton.setBackground(new java.awt.Color(161, 161, 56));
        buscarDesdeBuscarButton.setText("Buscar");
        buscarDesdeBuscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDesdeBuscarButtonActionPerformed(evt);
            }
        });

        listadoB.setAutoCreateRowSorter(true);
        listadoB.setBackground(new java.awt.Color(161, 161, 56));
        listadoB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(listadoB);

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(161, 161, 56));
        jLabel70.setText("Resultados posibles con:");

        salirDesdeBusquedaButton.setBackground(new java.awt.Color(161, 161, 56));
        salirDesdeBusquedaButton.setText("Salir");
        salirDesdeBusquedaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirDesdeBusquedaButtonActionPerformed(evt);
            }
        });

        infoDesdeBusquedaButton.setBackground(new java.awt.Color(161, 161, 56));
        infoDesdeBusquedaButton.setText("Información");
        infoDesdeBusquedaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoDesdeBusquedaButtonActionPerformed(evt);
            }
        });

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(161, 161, 56));
        jLabel68.setText("Palabra clave:");

        Palabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PalabraActionPerformed(evt);
            }
        });
        Palabra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PalabraKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PalabraKeyTyped(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(161, 161, 56));

        javax.swing.GroupLayout BuscarEmpleadoLayout = new javax.swing.GroupLayout(BuscarEmpleado.getContentPane());
        BuscarEmpleado.getContentPane().setLayout(BuscarEmpleadoLayout);
        BuscarEmpleadoLayout.setHorizontalGroup(
            BuscarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarEmpleadoLayout.createSequentialGroup()
                .addGroup(BuscarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BuscarEmpleadoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BuscarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
                            .addGroup(BuscarEmpleadoLayout.createSequentialGroup()
                                .addGroup(BuscarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BuscarEmpleadoLayout.createSequentialGroup()
                                        .addComponent(jLabel70)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(BuscarEmpleadoLayout.createSequentialGroup()
                                        .addComponent(jLabel67)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel68)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Palabra, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buscarDesdeBuscarButton)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarEmpleadoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(infoDesdeBusquedaButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salirDesdeBusquedaButton)))
                .addContainerGap())
        );
        BuscarEmpleadoLayout.setVerticalGroup(
            BuscarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarEmpleadoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(BuscarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BuscarEmpleadoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(BuscarEmpleadoLayout.createSequentialGroup()
                        .addGroup(BuscarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarDesdeBuscarButton)
                            .addComponent(Palabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68))
                        .addGap(6, 6, 6)
                        .addGroup(BuscarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel70)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BuscarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salirDesdeBusquedaButton)
                    .addComponent(infoDesdeBusquedaButton))
                .addContainerGap())
        );

        ListadoArea.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                ListadoAreaWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                ListadoAreaWindowClosing(evt);
            }
        });

        listado1.setBackground(new java.awt.Color(22, 174, 197));
        listado1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(listado1);

        salirDesdeListado1.setBackground(new java.awt.Color(22, 174, 197));
        salirDesdeListado1.setText("Salir");
        salirDesdeListado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirDesdeListado1ActionPerformed(evt);
            }
        });

        infoDesdeListado1.setBackground(new java.awt.Color(22, 174, 197));
        infoDesdeListado1.setText("Agregar");
        infoDesdeListado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoDesdeListado1ActionPerformed(evt);
            }
        });

        listado2.setBackground(new java.awt.Color(22, 174, 197));
        listado2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(listado2);

        jSeparator3.setBackground(new java.awt.Color(23, 175, 198));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(23, 175, 198));
        jLabel13.setText("Empleados a cargo de ");

        nombreJefe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombreJefe.setForeground(new java.awt.Color(23, 175, 198));
        nombreJefe.setText("Empleados a cargo de ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(23, 175, 198));
        jLabel16.setText("Listado");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(23, 175, 198));
        jLabel17.setText("(Sólo se muestran Administrativos y Operarios, el resto debe modificar el cargo primeramente)");

        javax.swing.GroupLayout ListadoAreaLayout = new javax.swing.GroupLayout(ListadoArea.getContentPane());
        ListadoArea.getContentPane().setLayout(ListadoAreaLayout);
        ListadoAreaLayout.setHorizontalGroup(
            ListadoAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListadoAreaLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ListadoAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListadoAreaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(infoDesdeListado1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salirDesdeListado1))
                    .addComponent(jSeparator3)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addGroup(ListadoAreaLayout.createSequentialGroup()
                        .addGroup(ListadoAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ListadoAreaLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreJefe, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ListadoAreaLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ListadoAreaLayout.setVerticalGroup(
            ListadoAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListadoAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ListadoAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreJefe)
                    .addComponent(jLabel13))
                .addGroup(ListadoAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListadoAreaLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListadoAreaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ListadoAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ListadoAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salirDesdeListado1)
                    .addComponent(infoDesdeListado1))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(246, 205, 205));

        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        listadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoButtonActionPerformed(evt);
            }
        });

        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(listadoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listadoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed

    }//GEN-LAST:event_ApellidoActionPerformed

    private void DniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DniActionPerformed

    }//GEN-LAST:event_DniActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed

    }//GEN-LAST:event_NombreActionPerformed

    private void DomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DomicilioActionPerformed

    }//GEN-LAST:event_DomicilioActionPerformed

    private void MesNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesNacActionPerformed

    }//GEN-LAST:event_MesNacActionPerformed

    private void AñoNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñoNacActionPerformed

    }//GEN-LAST:event_AñoNacActionPerformed

    private void DiaNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaNacActionPerformed

    }//GEN-LAST:event_DiaNacActionPerformed

    private void DiaIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaIngActionPerformed

    }//GEN-LAST:event_DiaIngActionPerformed

    private void MesIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesIngActionPerformed

    }//GEN-LAST:event_MesIngActionPerformed

    private void AñoIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñoIngActionPerformed

    }//GEN-LAST:event_AñoIngActionPerformed

    private void LegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LegajoActionPerformed

    }//GEN-LAST:event_LegajoActionPerformed

    private void guardarDesdeNuevoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDesdeNuevoButtonActionPerformed
        char sex;
        int i=cargo.getSelectedIndex() ,jefe=ne.devolverJefe(area.getText());;
        JefeDeArea jefeDeArea;
        if(sexo.getSelectedIndex()==0)
            sex='m';
        else
            sex='f';
        try{
            if(i==0||i==1){
                ne.agregarAdminOpeJefe(Dni.getText(), Apellido.getText(), Nombre.getText(), Domicilio.getText(),
                new Fecha(Integer.parseInt(DiaNac.getText()), Integer.parseInt(MesNac.getText()), Integer.parseInt(AñoNac.getText())),
                new Fecha(Integer.parseInt(DiaIng.getText()), Integer.parseInt(MesIng.getText()), Integer.parseInt(AñoIng.getText())),
                Legajo.getText(), sex, area.getText(), i, -1);
                if (jefe != -1){
                    jefeDeArea = (JefeDeArea) ne.empleados.get(jefe);
                    if(i==0)
                        jefeDeArea.empleadoEnArea(new Administrativo(
                        Dni.getText(), Apellido.getText(), Nombre.getText(), Domicilio.getText(),
                        new Fecha(Integer.parseInt(DiaNac.getText()), Integer.parseInt(MesNac.getText()), Integer.parseInt(AñoNac.getText())),
                        new Fecha(Integer.parseInt(DiaIng.getText()), Integer.parseInt(MesIng.getText()), Integer.parseInt(AñoIng.getText())),
                        Legajo.getText(), "Administrativo",sex, area.getText()));
                    else
                        jefeDeArea.empleadoEnArea(new Operario(
                        Dni.getText(), Apellido.getText(), Nombre.getText(), Domicilio.getText(),
                        new Fecha(Integer.parseInt(DiaNac.getText()), Integer.parseInt(MesNac.getText()), Integer.parseInt(AñoNac.getText())),
                        new Fecha(Integer.parseInt(DiaIng.getText()), Integer.parseInt(MesIng.getText()), Integer.parseInt(AñoIng.getText())),
                        Legajo.getText(), "Operario",sex, area.getText()));
                }
            }
            if(i==2){
                ne.agregarAdminOpeJefe(Dni.getText(), Apellido.getText(), Nombre.getText(), Domicilio.getText(),
                new Fecha(Integer.parseInt(DiaNac.getText()), Integer.parseInt(MesNac.getText()), Integer.parseInt(AñoNac.getText())),
                new Fecha(Integer.parseInt(DiaIng.getText()), Integer.parseInt(MesIng.getText()), Integer.parseInt(AñoIng.getText())),
                Legajo.getText(), sex, area.getText(), i, -1);
                JefeDeArea jefeNuevo;
                jefeNuevo = (JefeDeArea) ne.empleados.get(ne.empleados.size()-1);
                ne.jefeNuevo(jefeNuevo);
            }
                
            if(i==3)
                ne.agregarGerente(Dni.getText(), Apellido.getText(), Nombre.getText(), Domicilio.getText(),
                new Fecha(Integer.parseInt(DiaNac.getText()), Integer.parseInt(MesNac.getText()), Integer.parseInt(AñoNac.getText())),
                new Fecha(Integer.parseInt(DiaIng.getText()), Integer.parseInt(MesIng.getText()), Integer.parseInt(AñoIng.getText())),
                Legajo.getText(), sex, -1);
            if(i==4)
                ne.agregarVendedor(Dni.getText(), Apellido.getText(), Nombre.getText(), Domicilio.getText(),
                new Fecha(Integer.parseInt(DiaNac.getText()), Integer.parseInt(MesNac.getText()), Integer.parseInt(AñoNac.getText())),
                new Fecha(Integer.parseInt(DiaIng.getText()), Integer.parseInt(MesIng.getText()), Integer.parseInt(AñoIng.getText())),
                Legajo.getText(), sex, Integer.parseInt(sucVentas.getText()), Float.parseFloat(porcVentas.getText()), -1);
            int seleccion = JOptionPane.showOptionDialog(this,
            "¿Desea agregar familiares a cargo?", 
            "Seleccione una opción",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
            new Object[] { "Si", "No"},"Si");
            if (seleccion != -1)
                if((seleccion + 1)==1){
                    this.nivel = 2;
                    AgregarEmpleado.setVisible(false);
                    AgregarFamiliar.setVisible(true);
                } else {
                    this.nivel=0;
                    AgregarEmpleado.setVisible(false);
                    Principal.super.setVisible(true);
                }
        }catch(EmpleadoYaEstaException Ex){
            JOptionPane.showMessageDialog(null, "El empleado con dni:\n"+Dni.getText()+"\nya se encuentra en la base de datos","Error",JOptionPane.PLAIN_MESSAGE);
        }catch(FaltanDatosException Ex){
            JOptionPane.showMessageDialog(null, "Faltan Datos","Error",JOptionPane.PLAIN_MESSAGE);
        }catch(MenorDeEdadException Ex){
            JOptionPane.showMessageDialog(null, "No se permiten empleados menores de edad (+18)","Error",JOptionPane.PLAIN_MESSAGE);
        }catch(IngresoNegativoException Ex){
            JOptionPane.showMessageDialog(null, "Fecha de ingreso no admitida","Error",JOptionPane.PLAIN_MESSAGE);
        }catch(NumberFormatException Ex){
            JOptionPane.showMessageDialog(null, "Datos no válidos","Error",JOptionPane.PLAIN_MESSAGE);
        }catch(JefeYaEstaException Ex){
            JOptionPane.showMessageDialog(null, "Sólo se admite un Jefe de Area por área","Error",JOptionPane.PLAIN_MESSAGE);
        }        
    }//GEN-LAST:event_guardarDesdeNuevoButtonActionPerformed

    private void cancelarDesdeNuevoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarDesdeNuevoButtonActionPerformed
        this.nivel=0;
        AgregarEmpleado.setVisible(false);
        Principal.super.setVisible(true);
    }//GEN-LAST:event_cancelarDesdeNuevoButtonActionPerformed

    private void ApellidoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoFActionPerformed

    }//GEN-LAST:event_ApellidoFActionPerformed

    private void DniFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DniFActionPerformed

    }//GEN-LAST:event_DniFActionPerformed

    private void NombreFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreFActionPerformed

    }//GEN-LAST:event_NombreFActionPerformed

    private void DomicilioFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DomicilioFActionPerformed

    }//GEN-LAST:event_DomicilioFActionPerformed

    private void MesNacFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesNacFActionPerformed

    }//GEN-LAST:event_MesNacFActionPerformed

    private void AñoNacFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñoNacFActionPerformed

    }//GEN-LAST:event_AñoNacFActionPerformed

    private void DiaNacFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaNacFActionPerformed

    }//GEN-LAST:event_DiaNacFActionPerformed

    private void salirDesdeFamiliarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirDesdeFamiliarButtonActionPerformed
        AgregarFamiliar.setVisible(false);
        if(this.nivel==2){
            Principal.super.setVisible(true);
            this.nivel = 0; 
        }
        if(this.nivel==4){
            ListadoFamiliar.setVisible(true);
            this.nivel = 3;
        }
    }//GEN-LAST:event_salirDesdeFamiliarButtonActionPerformed

    private void agregarDesdeFamiliarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarDesdeFamiliarButtonActionPerformed
        int pos;
        char sex;
        String relacion="";
        if(sexoF.getSelectedIndex()==0)
            sex='m';
        else
            sex='f';
        switch (relacionF.getSelectedIndex()){
            case 0:
                relacion = "Hijo/a"; break;
            case 1:
                relacion = "Esposa/o"; break;
            case 2:
                relacion = "Madre"; break;
            case 3:
                relacion = "Padre"; break;
            case 4:
                relacion = "Tío/a"; break;
            case 5:
                relacion = "Abuelo/a"; break;
        }
        try{
            if(this.nivel == 4)
                pos = ne.devolverSegunDni(docu.getText());                
            else{
                pos = ne.empleados.size()-1;
            }
            ne.agregarPariente(DniF.getText(), ApellidoF.getText(), NombreF.getText(), DomicilioF.getText(),
            new Fecha (Integer.parseInt(DiaNacF.getText()), Integer.parseInt(MesNacF.getText()), Integer.parseInt(AñoNacF.getText())),
            sex, relacion, pos);
            JOptionPane.showMessageDialog(null, "Familiar agregado","Mensaje",JOptionPane.PLAIN_MESSAGE);
            AgregarFamiliar.setVisible(false);
            if(this.nivel == 2){
                Principal.super.setVisible(true);
                this.nivel = 0;
            }
            if(this.nivel == 4){
                ListadoFamiliar.setVisible(true);
                this.nivel = 3;
            }
        }catch(ParienteYaEstaException Ex){
            JOptionPane.showMessageDialog(null, "El familiar ya está asociado con éste empelado","Error",JOptionPane.PLAIN_MESSAGE);
        }catch(FaltanDatosException Ex){
            JOptionPane.showMessageDialog(null, "Faltan Datos","Error",JOptionPane.PLAIN_MESSAGE);
        }catch(IngresoNegativoException Ex){
            JOptionPane.showMessageDialog(null, "Fecha de ingreso no admitida","Error",JOptionPane.PLAIN_MESSAGE);
        }catch(NumberFormatException Ex){
            JOptionPane.showMessageDialog(null, "Datos no válidos","Error",JOptionPane.PLAIN_MESSAGE);
        }        
    }//GEN-LAST:event_agregarDesdeFamiliarButtonActionPerformed

    private void sexoFItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sexoFItemStateChanged

    }//GEN-LAST:event_sexoFItemStateChanged

    private void cargoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cargoItemStateChanged
        switch (cargo.getSelectedIndex()){
            case 0:
                sucVentas.setVisible(false);
                jLabel20.setVisible(true);
                porcVentas.setVisible(false);
                jLabel21.setVisible(true);
                area.setText("");
                area.setVisible(true);
                jLabel24.setText("No hay Jefe de Area");
                break;
            case 1:
                sucVentas.setVisible(false);
                jLabel20.setVisible(true);
                porcVentas.setVisible(false);
                jLabel21.setVisible(true);
                area.setText("");
                area.setVisible(true);
                jLabel24.setText("No hay Jefe de Area");
                break;
            case 2:
                sucVentas.setVisible(false);
                jLabel20.setVisible(true);
                porcVentas.setVisible(false);
                jLabel21.setVisible(true);
                area.setText("");
                area.setVisible(true);
                jLabel24.setText("No hay Jefe de Area");
                break;
            case 3:
                sucVentas.setVisible(false);
                jLabel20.setVisible(true);
                porcVentas.setVisible(false);
                jLabel21.setVisible(true);
                area.setVisible(false);
                jLabel24.setText("Sólo Jefe, Admin y Ope*");
                break;
            case 4: 
                sucVentas.setText("");
                sucVentas.setVisible(true);
                jLabel20.setVisible(false);
                porcVentas.setText("");
                porcVentas.setVisible(true);
                jLabel21.setVisible(false);
                area.setVisible(false);
                jLabel24.setText("Sólo Jefe, Admin y Ope*");
                break;
        }     
    }//GEN-LAST:event_cargoItemStateChanged

    private void infoDesdeListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoDesdeListadoActionPerformed
        Administrativo admin;
        Operario ope;
        JefeDeArea jefe;
        Gerente gere;
        Vendedor ven;
        if(ne.sinSeleccionException(listadoA.getSelectedRow())){
            int i = ne.devolverSegunDni(listadoA.getValueAt(listadoA.getSelectedRow(), 1).toString());
            apeYNom.setText(ne.empleados.get(i).getApellido()+", "+ne.empleados.get(i).getNombre());
            docu.setText(ne.empleados.get(i).getDni());
            feIn.setText(ne.empleados.get(i).getFechaIngreso());
            feNa.setText(ne.empleados.get(i).getFecha());
            domi.setText(ne.empleados.get(i).getDomicilio());
            xose.setText(ne.empleados.get(i).getXose());
            goca.setText(ne.empleados.get(i).getCargo());
            nuLe.setText(ne.empleados.get(i).getLegajo());
            if(ne.empleados.get(i) instanceof Administrativo){
                admin = (Administrativo) ne.empleados.get(i);
                noAr.setText(admin.getArea());
                sucu.setText("Sólo Vendedor*");
                poVe.setText("S/Ven*");
                empleadosDesdeInfoButton.setVisible(false);
            }if(ne.empleados.get(i) instanceof Operario){
                ope = (Operario) ne.empleados.get(i);
                noAr.setText(ope.getArea());
                sucu.setText("Sólo Vendedor*");
                poVe.setText("S/Ven*");
                empleadosDesdeInfoButton.setVisible(false);
            }if(ne.empleados.get(i) instanceof JefeDeArea){
                jefe = (JefeDeArea) ne.empleados.get(i);
                noAr.setText(jefe.getArea());
                sucu.setText("Sólo Vendedor*");
                poVe.setText("S/Ven*");
                empleadosDesdeInfoButton.setVisible(true);
            }if(ne.empleados.get(i) instanceof Gerente){
                gere = (Gerente) ne.empleados.get(i);
                noAr.setText("Sólo Jefe, Admin y Ope*");
                sucu.setText("Sólo Vendedor*");
                poVe.setText("S/Ven*");
                empleadosDesdeInfoButton.setVisible(false);
            }if(ne.empleados.get(i) instanceof Vendedor){
                ven = (Vendedor) ne.empleados.get(i);
                noAr.setText("Sólo Jefe, Admin y Ope*");
                String sucursal = String.valueOf(ven.getSucursal());
                sucu.setText(sucursal);
                String porcentaje = String.valueOf(ven.getProcentaje());
                poVe.setText(porcentaje);
                empleadosDesdeInfoButton.setVisible(false);
            }
            ListadoEmpleados.setVisible(false);
            this.nivel = 2;
            InfoEmpleado.setTitle("Información de : "+apeYNom.getText());
            InfoEmpleado.setVisible(true);
        }
    }//GEN-LAST:event_infoDesdeListadoActionPerformed

    private void salirDesdeListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirDesdeListadoActionPerformed
        this.nivel = 0;
        ListadoEmpleados.setVisible(false);
        Principal.super.setVisible(true);
    }//GEN-LAST:event_salirDesdeListadoActionPerformed

    private void modificarDesdeInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarDesdeInfoButtonActionPerformed
        Administrativo admin;
        Operario ope;
        JefeDeArea jefe;
        Gerente gere;
        Vendedor ven;
        int i;
        String v;
        if(listadoA.getSelectedRow()==(-1) && listadoB.getSelectedRow()!=(-1))
            i = ne.devolverSegunDni(listadoB.getValueAt(listadoB.getSelectedRow(), 1).toString());
        else 
            i = ne.devolverSegunDni(listadoA.getValueAt(listadoA.getSelectedRow(), 1).toString());
        sexoM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino"}));
        if (ne.empleados.get(i).getSexo()=='m')
            sexoM.setSelectedIndex(0);
        else
            sexoM.setSelectedIndex(1);
        cargoM.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Administrativo","Operario","Jefe de área","Gerente","Vendedor"}));
        cargoM.setSelectedIndex(ne.devolverCargo(i));
        ApellidoM.setText(ne.empleados.get(i).getApellido());
        NombreM.setText(ne.empleados.get(i).getNombre());
        DniM.setText(ne.empleados.get(i).getDni());
        DomicilioM.setText(ne.empleados.get(i).getDomicilio());
        DiaNacM.setText(ne.empleados.get(i).getDiaSF());
        MesNacM.setText(ne.empleados.get(i).getMesSF());
        AñoNacM.setText(ne.empleados.get(i).getAñoSF());
        DiaIngM.setText(ne.empleados.get(i).getDiaISF());
        MesIngM.setText(ne.empleados.get(i).getMesISF());
        AñoIngM.setText(ne.empleados.get(i).getAñoISF());
        LegajoM.setText(ne.empleados.get(i).getLegajo());
        if(ne.empleados.get(i) instanceof Administrativo){
                admin = (Administrativo) ne.empleados.get(i);
                areaM.setText(admin.getArea());
                sucVentasM.setVisible(false);
                jLabel48.setVisible(true);
                porcVentasM.setVisible(false);
                jLabel50.setVisible(true);
                areaM.setText(admin.getArea());
                jLabel84.setVisible(true);
                jLabel84.setText(ne.buscarJefe(areaM.getText()));
                ne.empleados.add(admin);
            }if(ne.empleados.get(i) instanceof Operario){
                ope = (Operario) ne.empleados.get(i);
                areaM.setText(ope.getArea());
                sucVentasM.setVisible(false);
                jLabel48.setVisible(true);
                porcVentasM.setVisible(false);
                jLabel50.setVisible(true);
                areaM.setText(ope.getArea());
                jLabel84.setVisible(true);
                jLabel84.setText(ne.buscarJefe(areaM.getText()));
                ne.empleados.add(ope);
            }if(ne.empleados.get(i) instanceof JefeDeArea){
                jefe = (JefeDeArea) ne.empleados.get(i);
                areaM.setText(jefe.getArea());
                sucVentasM.setVisible(false);
                jLabel48.setVisible(true);
                porcVentasM.setVisible(false);
                jLabel50.setVisible(true);
                areaM.setText(jefe.getArea());
                jLabel84.setVisible(true);
                jLabel84.setText(ne.buscarJefe(areaM.getText()));
                ne.empleados.add(jefe);
            }if(ne.empleados.get(i) instanceof Gerente){
                gere = (Gerente) ne.empleados.get(i);
                sucVentasM.setVisible(false);
                jLabel48.setVisible(true);
                porcVentasM.setVisible(false);
                jLabel50.setVisible(true);
                areaM.setVisible(false);
                jLabel84.setVisible(true);
                jLabel84.setText("Sólo Jefe, Admin y Ope*");
                ne.empleados.add(gere);
            }if(ne.empleados.get(i) instanceof Vendedor){
                ven = (Vendedor) ne.empleados.get(i);
                sucVentasM.setVisible(true);
                String sucursal = String.valueOf(ven.getSucursal());
                sucVentasM.setText(sucursal);
                jLabel48.setVisible(false);
                porcVentasM.setVisible(true);
                String porcentaje = String.valueOf(ven.getProcentaje());
                porcVentasM.setText(porcentaje);
                jLabel50.setVisible(true);
                areaM.setVisible(false);
                jLabel84.setVisible(true);
                jLabel84.setText("Sólo Jefe, Admin y Ope*");
                ne.empleados.add(ven);
            }
        this.nivel = 3;
        InfoEmpleado.setVisible(false);
        ModificarEmpleado.setVisible(true);
    }//GEN-LAST:event_modificarDesdeInfoButtonActionPerformed

    private void familiaresDesdeInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familiaresDesdeInfoButtonActionPerformed
        InfoEmpleado.setVisible(false);
        this.nivel = 3;
        ListadoFamiliar.setVisible(true);
    }//GEN-LAST:event_familiaresDesdeInfoButtonActionPerformed

    private void salirDesdeInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirDesdeInfoButtonActionPerformed
        InfoEmpleado.setVisible(false);
        if(this.lista)
            ListadoEmpleados.setVisible(true);
        else
            BuscarEmpleado.setVisible(true);
        this.nivel = 1;
    }//GEN-LAST:event_salirDesdeInfoButtonActionPerformed

    private void LegajoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LegajoMActionPerformed

    }//GEN-LAST:event_LegajoMActionPerformed

    private void ApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoMActionPerformed

    }//GEN-LAST:event_ApellidoMActionPerformed

    private void DniMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DniMActionPerformed

    }//GEN-LAST:event_DniMActionPerformed

    private void NombreMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreMActionPerformed

    }//GEN-LAST:event_NombreMActionPerformed

    private void DomicilioMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DomicilioMActionPerformed

    }//GEN-LAST:event_DomicilioMActionPerformed

    private void MesNacMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesNacMActionPerformed

    }//GEN-LAST:event_MesNacMActionPerformed

    private void AñoNacMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñoNacMActionPerformed

    }//GEN-LAST:event_AñoNacMActionPerformed

    private void DiaNacMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaNacMActionPerformed

    }//GEN-LAST:event_DiaNacMActionPerformed

    private void DiaIngMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaIngMActionPerformed

    }//GEN-LAST:event_DiaIngMActionPerformed

    private void cargoMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cargoMItemStateChanged
        switch (cargoM.getSelectedIndex()){
            case 0:
                sucVentasM.setVisible(false);
                jLabel48.setVisible(true);
                porcVentasM.setVisible(false);
                jLabel50.setVisible(true);
                areaM.setText("");
                areaM.setVisible(true);
                jLabel84.setText("No hay Jefe de Area");
                break;
            case 1:
                sucVentasM.setVisible(false);
                jLabel48.setVisible(true);
                porcVentasM.setVisible(false);
                jLabel50.setVisible(true);
                areaM.setText("");
                areaM.setVisible(true);
                jLabel84.setText("No hay Jefe de Area");
                break;
            case 2:
                sucVentasM.setVisible(false);
                jLabel48.setVisible(true);
                porcVentasM.setVisible(false);
                jLabel50.setVisible(true);
                areaM.setText("");
                areaM.setVisible(true);
                jLabel84.setText("No hay Jefe de Area");
                break;
            case 3:
                sucVentasM.setVisible(false);
                jLabel48.setVisible(true);
                porcVentasM.setVisible(false);
                jLabel50.setVisible(true);
                areaM.setVisible(false);
                jLabel84.setText("Sólo Jefe, Admin y Ope*");
                break;
            case 4: 
                sucVentasM.setText("");
                sucVentasM.setVisible(true);
                jLabel48.setVisible(false);
                porcVentasM.setText("");
                porcVentasM.setVisible(true);
                jLabel50.setVisible(false);
                areaM.setVisible(false);
                jLabel84.setText("Sólo Jefe, Admin y Ope*");
                break;
        }
    }//GEN-LAST:event_cargoMItemStateChanged

    private void MesIngMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesIngMActionPerformed

    }//GEN-LAST:event_MesIngMActionPerformed

    private void AñoIngMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñoIngMActionPerformed

    }//GEN-LAST:event_AñoIngMActionPerformed

    private void salirDesdeModificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirDesdeModificarButtonActionPerformed
        ModificarEmpleado.setVisible(false);
        this.nivel = 2;
        ne.quitarSegunPos(ne.empleados.size()-1);
        InfoEmpleado.setVisible(true);
    }//GEN-LAST:event_salirDesdeModificarButtonActionPerformed

    private void cargoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoMActionPerformed

    }//GEN-LAST:event_cargoMActionPerformed

    private void salirDesdeListaFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirDesdeListaFButtonActionPerformed
        ListadoFamiliar.setVisible(false);
        this.nivel = 2;
        InfoEmpleado.setVisible(true);
    }//GEN-LAST:event_salirDesdeListaFButtonActionPerformed

    private void agregarDesdeListadoFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarDesdeListadoFButtonActionPerformed
        ListadoFamiliar.setVisible(false);
        this.nivel = 4;
        AgregarFamiliar.setVisible(true);
    }//GEN-LAST:event_agregarDesdeListadoFButtonActionPerformed

    private void buscarDesdeBuscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDesdeBuscarButtonActionPerformed
        Object [][] n=null;
        switch (campoClave.getSelectedIndex()){
            case 0:
                n=ne.segunApellido(Palabra.getText()); break;
            case 1:
                n=ne.segunDni(Palabra.getText()); break;
            case 2:
                n=ne.segunLegajo(Palabra.getText()); break;
            case 3:
                n=ne.segunArea(Palabra.getText()); break;
            case 4:
                n=ne.segunCargo(Palabra.getText()); break;
            case 5:
                n=ne.ultimosCinco(); break;
        }
        listadoB.setModel(new javax.swing.table.DefaultTableModel(
            n,new String [] {"Apellidos, nombres", "Documento", "Sexo", "Edad", "Fecha de ingreso", "Cargo", "Area"}
        ));
        listadoB.getColumnModel().getColumn(0).setMinWidth(230);
        listadoB.getColumnModel().getColumn(0).setMaxWidth(230);
        listadoB.getColumnModel().getColumn(1).setMinWidth(75);
        listadoB.getColumnModel().getColumn(1).setMaxWidth(75);
        listadoB.getColumnModel().getColumn(2).setMinWidth(70);
        listadoB.getColumnModel().getColumn(2).setMaxWidth(70);
        listadoB.getColumnModel().getColumn(3).setMinWidth(45);
        listadoB.getColumnModel().getColumn(3).setMaxWidth(45);
        listadoB.getColumnModel().getColumn(4).setMinWidth(105);
        listadoB.getColumnModel().getColumn(4).setMaxWidth(105);
        listadoB.getColumnModel().getColumn(5).setMinWidth(80);
        listadoB.getColumnModel().getColumn(5).setMaxWidth(80);
        listadoB.getColumnModel().getColumn(6).setMinWidth(165);
        listadoB.getColumnModel().getColumn(6).setMaxWidth(165);
        jLabel69.setText(Palabra.getText());
    }//GEN-LAST:event_buscarDesdeBuscarButtonActionPerformed

    private void salirDesdeBusquedaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirDesdeBusquedaButtonActionPerformed
        BuscarEmpleado.setVisible(false);
        this.nivel = 0;
        Principal.super.setVisible(true);
    }//GEN-LAST:event_salirDesdeBusquedaButtonActionPerformed

    private void infoDesdeBusquedaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoDesdeBusquedaButtonActionPerformed
        Administrativo admin;
        Operario ope;
        JefeDeArea jefe;
        Gerente gere;
        Vendedor ven;
        if(ne.sinSeleccionException(listadoB.getSelectedRow())){
            int i = ne.devolverSegunDni(listadoB.getValueAt(listadoB.getSelectedRow(), 1).toString());
            apeYNom.setText(ne.empleados.get(i).getApellido()+", "+ne.empleados.get(i).getNombre());
            docu.setText(ne.empleados.get(i).getDni());
            feIn.setText(ne.empleados.get(i).getFechaIngreso());
            feNa.setText(ne.empleados.get(i).getFecha());
            domi.setText(ne.empleados.get(i).getDomicilio());
            xose.setText(ne.empleados.get(i).getXose());
            goca.setText(ne.empleados.get(i).getCargo());
            nuLe.setText(ne.empleados.get(i).getLegajo());
            if(ne.empleados.get(i) instanceof Administrativo){
                admin = (Administrativo) ne.empleados.get(i);
                noAr.setText(admin.getArea());
                sucu.setText("Sólo Vendedor*");
                poVe.setText("S/Ven*");
                empleadosDesdeInfoButton.setVisible(false);
            }if(ne.empleados.get(i) instanceof Operario){
                ope = (Operario) ne.empleados.get(i);
                noAr.setText(ope.getArea());
                sucu.setText("Sólo Vendedor*");
                poVe.setText("S/Ven*");
                empleadosDesdeInfoButton.setVisible(false);
            }if(ne.empleados.get(i) instanceof JefeDeArea){
                jefe = (JefeDeArea) ne.empleados.get(i);
                noAr.setText(jefe.getArea());
                sucu.setText("Sólo Vendedor*");
                poVe.setText("S/Ven*");
                empleadosDesdeInfoButton.setVisible(true);
            }if(ne.empleados.get(i) instanceof Gerente){
                gere = (Gerente) ne.empleados.get(i);
                noAr.setText("Sólo Jefe, Admin y Ope*");
                sucu.setText("Sólo Vendedor*");
                poVe.setText("S/Ven*");
                empleadosDesdeInfoButton.setVisible(false);
            }if(ne.empleados.get(i) instanceof Vendedor){
                ven = (Vendedor) ne.empleados.get(i);
                noAr.setText("Sólo Jefe, Admin y Ope*");
                String sucursal = String.valueOf(ven.getSucursal());
                sucu.setText(sucursal);
                String porcentaje = String.valueOf(ven.getProcentaje());
                poVe.setText(porcentaje);
                empleadosDesdeInfoButton.setVisible(false);
            }
            BuscarEmpleado.setVisible(false);
            InfoEmpleado.setTitle("Información de "+apeYNom.getText());
            InfoEmpleado.setVisible(true);
        }
    }//GEN-LAST:event_infoDesdeBusquedaButtonActionPerformed

    private void aceptarDesdeModificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarDesdeModificarButtonActionPerformed
        int i = ne.devolverSegunDni(docu.getText());
        char sexo;
        int flag = -1, inst=-1;
        String areaAntigua = "";
        try{
            Empleado mod = ne.empleados.get(i);
            Empleado emp = ne.empleados.get(ne.empleados.size()-1);
            int seleccion = JOptionPane.showOptionDialog(this,
            "¿Desea guardar los cambios de\n"+ne.empleados.get(i).getApellido()+", "+ne.empleados.get(i).getNombre()+"?", 
            "Seleccione una opción",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
            new Object[] { "Si", "No"},"Si");
            if (seleccion != -1)
                if((seleccion + 1)==1){
                    if((emp instanceof Administrativo && cargoM.getSelectedIndex() !=0)||
                       (emp instanceof Operario && cargoM.getSelectedIndex() !=1)||
                       (emp instanceof JefeDeArea && cargoM.getSelectedIndex() !=2)||
                       (emp instanceof Gerente && cargoM.getSelectedIndex() !=3)||
                       (emp instanceof Vendedor && cargoM.getSelectedIndex() !=4)){
                        switch (cargoM.getSelectedIndex()){
                            case 0:
                                flag = 0; break;
                            case 1:
                                flag = 1; break;
                            case 2:
                                flag = 2; break;
                            case 3:
                                flag = 3; break;
                            case 4:
                                flag = 4; break;
                        }
                    }
                    if(flag == -1){
                        if(!NombreM.getText().toLowerCase().equals(emp.getNombre().toLowerCase()))
                            mod.setNombre(NombreM.getText());
                        if(!ApellidoM.getText().toLowerCase().equals(emp.getApellido().toLowerCase()))
                            mod.setApellido(ApellidoM.getText());
                        if(!DniM.getText().toLowerCase().equals(emp.getDni().toLowerCase()))
                            ne.setDniSinRepetir(DniM.getText(), i);
                        if(!DomicilioM.getText().toLowerCase().equals(emp.getDomicilio().toLowerCase()))
                            mod.setDomicilio(DomicilioM.getText());
                        if(!emp.getFechaSinFormato().equals(
                           new Fecha(Integer.parseInt(DiaNacM.getText()),Integer.parseInt(MesNacM.getText()),Integer.parseInt(AñoNacM.getText()))))
                            mod.setFecha(new Fecha(Integer.parseInt(DiaNacM.getText()),Integer.parseInt(MesNacM.getText()),Integer.parseInt(AñoNacM.getText())));
                        if(!emp.getFechaIngresoSinFormato().equals(
                           new Fecha(Integer.parseInt(DiaIngM.getText()),Integer.parseInt(MesIngM.getText()),Integer.parseInt(AñoIngM.getText()))))
                            mod.setFechaIngresoSinFormato(new Fecha(Integer.parseInt(DiaIngM.getText()),Integer.parseInt(MesIngM.getText()),Integer.parseInt(AñoIngM.getText())));
                        if(sexoM.getSelectedIndex()==0)
                            sexo='m';
                        else
                            sexo='f';
                        if(emp.getSexo()!=sexo)
                            mod.setSexo(sexo);
                        if(!emp.getLegajo().equals(LegajoM.getText()))
                            mod.setLegajo(LegajoM.getText());
                        if(sucVentasM.isVisible()){
                            Vendedor ven;
                            ven = (Vendedor) mod;
                            if(Integer.parseInt(sucVentasM.getText())!=ven.getSucursal())
                                ven.setSucursal(Integer.parseInt(sucVentasM.getText()));
                            if(Float.parseFloat(porcVentasM.getText())!=ven.getProcentaje())
                                ven.setProcentaje(Float.parseFloat(porcVentasM.getText()));
                        }
                        if(areaM.isVisible()){
                            if(emp instanceof Administrativo){
                                Administrativo sacarArea = (Administrativo) emp;
                                areaAntigua = sacarArea.getArea();
                            }
                            if(emp instanceof Operario){
                                Operario sacarArea = (Operario) emp;
                                areaAntigua = sacarArea.getArea();
                            }
                            if(ne.empleados.get(i) instanceof Administrativo){
                                Administrativo admin;
                                admin = (Administrativo) mod;
                                if(!areaM.getText().toLowerCase().equals(admin.getArea().toLowerCase())){
                                    if(ne.devolverJefe(areaAntigua) != -1){
                                        JefeDeArea jefe = (JefeDeArea) ne.empleados.get(ne.devolverJefe(areaAntigua));
                                        jefe.quitarEmpleado(admin);
                                    }
                                    admin.setArea(areaM.getText());
                                    if(ne.devolverJefe(areaM.getText()) != -1){
                                        JefeDeArea jefe = (JefeDeArea) ne.empleados.get(ne.devolverJefe(areaM.getText()));
                                        jefe.empleadoEnArea(admin);
                                    }
                                }
                            }
                            if(ne.empleados.get(i) instanceof Operario){
                                Operario ope;
                                ope = (Operario) mod;
                                if(!areaM.getText().toLowerCase().equals(ope.getArea().toLowerCase())){
                                    if(ne.devolverJefe(areaAntigua) != -1){
                                        JefeDeArea jefe = (JefeDeArea) ne.empleados.get(ne.devolverJefe(areaAntigua));
                                        jefe.quitarEmpleado(ope);
                                    }
                                    ope.setArea(areaM.getText());
                                    if(ne.devolverJefe(areaM.getText()) != -1){
                                        JefeDeArea jefe = (JefeDeArea) ne.empleados.get(ne.devolverJefe(areaM.getText()));
                                        jefe.empleadoEnArea(ope);
                                    }
                                }
                            }
                            if(ne.empleados.get(i) instanceof JefeDeArea){
                                JefeDeArea jefe;
                                jefe = (JefeDeArea) mod;
                                if(!areaM.getText().toLowerCase().equals(jefe.getArea().toLowerCase())){
                                    for(Empleado e: ne.empleados){
                                         if(e instanceof JefeDeArea){
                                            JefeDeArea jefe2 = (JefeDeArea) e;
                                            if(jefe2.getArea().toLowerCase().equals(areaM.getText().toLowerCase()))
                                                throw new JefeYaEstaException();
                                        }
                                    }
                                    jefe.setArea(areaM.getText());
                                    jefe.quitarEmpleados();
                                    ne.jefeNuevo(jefe);
                                }
                            }
                        }                        
                    } else {
                        ArrayList<Pariente> temp = ne.empleados.get(i).parientes;
                        if(sexoM.getSelectedIndex() == 0)
                            sexo = 'm';
                        else
                            sexo = 'f';
                        if(emp instanceof Administrativo)
                            inst = 0;
                        if(emp instanceof Operario)
                            inst = 1;
                        if(emp instanceof JefeDeArea)
                            inst = 2;
                        if(emp instanceof Gerente)
                            inst = 3;
                        if(emp instanceof Vendedor)
                            inst = 4;
                        //Eliminar
                        if(emp instanceof Administrativo){
                            Administrativo sacarArea = (Administrativo) emp;
                            areaAntigua = sacarArea.getArea();
                        }
                        if(emp instanceof Operario){
                            Operario sacarArea = (Operario) emp;
                            areaAntigua = sacarArea.getArea();
                        }
                        if(emp instanceof JefeDeArea){
                            JefeDeArea sacarArea = (JefeDeArea) emp;
                            areaAntigua = sacarArea.getArea();
                        }
                        switch(flag){
                            case 0:               
                                ne.agregarAdminOpeJefe(DniM.getText(), ApellidoM.getText(), NombreM.getText(), DomicilioM.getText(),
                                new Fecha(Integer.parseInt(DiaNacM.getText()), Integer.parseInt(MesNacM.getText()), Integer.parseInt(AñoNacM.getText())),
                                new Fecha(Integer.parseInt(DiaIngM.getText()), Integer.parseInt(MesIngM.getText()), Integer.parseInt(AñoIngM.getText())),
                                LegajoM.getText(), sexo, areaM.getText(), 0, i);
                                Administrativo admin = (Administrativo) ne.empleados.get(i);
                                if(inst == 1){
                                    if(ne.devolverJefe(areaAntigua)!=-1){
                                        JefeDeArea jefe = (JefeDeArea) ne.empleados.get(ne.devolverJefe(areaAntigua));
                                        jefe.quitarEmpleado(emp);
                                    }
                                    if(ne.devolverJefe(areaM.getText())!=-1){
                                        JefeDeArea jefe = (JefeDeArea) ne.empleados.get(ne.devolverJefe(areaM.getText()));
                                        jefe.empleadoEnArea(admin);
                                    }
                                }
                                if(inst == 2 || inst == 3 || inst == 4)
                                    if(ne.devolverJefe(areaM.getText())!=-1){
                                        JefeDeArea jefe = (JefeDeArea) ne.empleados.get(ne.devolverJefe(areaM.getText()));
                                        jefe.empleadoEnArea(admin);
                                    }
                                break;
                            case 1:
                                ne.agregarAdminOpeJefe(DniM.getText(), ApellidoM.getText(), NombreM.getText(), DomicilioM.getText(),
                                new Fecha(Integer.parseInt(DiaNacM.getText()), Integer.parseInt(MesNacM.getText()), Integer.parseInt(AñoNacM.getText())),
                                new Fecha(Integer.parseInt(DiaIngM.getText()), Integer.parseInt(MesIngM.getText()), Integer.parseInt(AñoIngM.getText())),
                                LegajoM.getText(), sexo, areaM.getText(), 1, i);
                                Operario ope = (Operario) ne.empleados.get(i);
                                if(inst == 0){
                                    if(ne.devolverJefe(areaAntigua)!=-1){
                                        JefeDeArea jefe = (JefeDeArea) ne.empleados.get(ne.devolverJefe(areaAntigua));
                                        jefe.quitarEmpleado(emp);
                                    }
                                    if(ne.devolverJefe(areaM.getText())!=-1){
                                        JefeDeArea jefe = (JefeDeArea) ne.empleados.get(ne.devolverJefe(areaM.getText()));
                                        jefe.empleadoEnArea(ope);
                                    }
                                }
                                if(inst == 2 || inst == 3 || inst == 4)
                                    if(ne.devolverJefe(areaM.getText())!=-1){
                                        JefeDeArea jefe = (JefeDeArea) ne.empleados.get(ne.devolverJefe(areaM.getText()));
                                        jefe.empleadoEnArea(ope);
                                    }
                                break;
                            case 2:
                                ne.agregarAdminOpeJefe(DniM.getText(), ApellidoM.getText(), NombreM.getText(), DomicilioM.getText(),
                                new Fecha(Integer.parseInt(DiaNacM.getText()), Integer.parseInt(MesNacM.getText()), Integer.parseInt(AñoNacM.getText())),
                                new Fecha(Integer.parseInt(DiaIngM.getText()), Integer.parseInt(MesIngM.getText()), Integer.parseInt(AñoIngM.getText())),
                                LegajoM.getText(), sexo, areaM.getText(), 2, i);
                                JefeDeArea jefe = (JefeDeArea) ne.empleados.get(i);
                                for(Empleado e: ne.empleados){
                                    if(e instanceof JefeDeArea){
                                       JefeDeArea jefe2 = (JefeDeArea) e;
                                       if(jefe2.getArea().toLowerCase().equals(areaM.getText().toLowerCase()))
                                           throw new JefeYaEstaException();
                                    }
                                }
                                if(inst == 0 || inst == 1)
                                    if(ne.devolverJefe(areaAntigua)!=-1){
                                        JefeDeArea jefe2 = (JefeDeArea) ne.empleados.get(ne.devolverJefe(areaAntigua));
                                        jefe2.quitarEmpleado(emp);
                                    }
                                ne.jefeNuevo(jefe);
                                break;
                            case 3:
                                ne.agregarGerente(DniM.getText(), ApellidoM.getText(), NombreM.getText(), DomicilioM.getText(),
                                new Fecha(Integer.parseInt(DiaNacM.getText()), Integer.parseInt(MesNacM.getText()), Integer.parseInt(AñoNacM.getText())),
                                new Fecha(Integer.parseInt(DiaIngM.getText()), Integer.parseInt(MesIngM.getText()), Integer.parseInt(AñoIngM.getText())),
                                LegajoM.getText(), sexo, i);
                                if(inst == 0 || inst == 1)
                                    if(ne.devolverJefe(areaAntigua)!=-1){
                                        JefeDeArea jefe2 = (JefeDeArea) ne.empleados.get(ne.devolverJefe(areaAntigua));
                                        jefe2.quitarEmpleado(emp);
                                    }
                                break;
                            case 4:
                                ne.agregarVendedor(DniM.getText(), ApellidoM.getText(), NombreM.getText(), DomicilioM.getText(),
                                new Fecha(Integer.parseInt(DiaNacM.getText()), Integer.parseInt(MesNacM.getText()), Integer.parseInt(AñoNacM.getText())),
                                new Fecha(Integer.parseInt(DiaIngM.getText()), Integer.parseInt(MesIngM.getText()), Integer.parseInt(AñoIngM.getText())),
                                LegajoM.getText(), sexo, Integer.parseInt(sucVentas.getText()), Float.parseFloat(porcVentas.getText()), i);
                                if(inst == 0 || inst == 1)
                                    if(ne.devolverJefe(areaAntigua)!=-1){
                                        JefeDeArea jefe2 = (JefeDeArea) ne.empleados.get(ne.devolverJefe(areaAntigua));
                                        jefe2.quitarEmpleado(emp);
                                    }
                                break;
                        }
                        ne.empleados.get(i).parientes = temp;
                        ne.quitarSegunPos(i+1);
                    }
                    ModificarEmpleado.setVisible(false);
                    this.nivel = 2;
                    ne.quitarSegunPos(ne.empleados.size()-1);
                    if(this.lista)
                        ListadoEmpleados.setVisible(true);
                    else
                        BuscarEmpleado.setVisible(true);
                }
        }catch(EmpleadoYaEstaException Ex){
            JOptionPane.showMessageDialog(null, "El empleado con dni:\n"+DniM.getText()+"\nya se encuentra en la base de datos","Error",JOptionPane.PLAIN_MESSAGE);
        }catch(FaltanDatosException Ex){
            JOptionPane.showMessageDialog(null, "Faltan Datos","Error",JOptionPane.PLAIN_MESSAGE);
        }catch(MenorDeEdadException Ex){
            JOptionPane.showMessageDialog(null, "No se permiten empleados menores de edad (+18)","Error",JOptionPane.PLAIN_MESSAGE);
        }catch(IngresoNegativoException Ex){
            JOptionPane.showMessageDialog(null, "Fecha de ingreso no admitida","Error",JOptionPane.PLAIN_MESSAGE);
        }catch(NumberFormatException Ex){
            JOptionPane.showMessageDialog(null, "Datos no válidos","Error",JOptionPane.PLAIN_MESSAGE);
        }catch(JefeYaEstaException Ex){
            JOptionPane.showMessageDialog(null, "Sólo se admite un Jefe de Area por área","Error",JOptionPane.PLAIN_MESSAGE);
            ne.quitarSegunPos(i);
        }catch(EmpleadoNoExisteException Ex){
            JOptionPane.showMessageDialog(null, "Empleado no existe","Error",JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_aceptarDesdeModificarButtonActionPerformed

    private void cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoActionPerformed

    }//GEN-LAST:event_cargoActionPerformed

    private void campoClaveItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_campoClaveItemStateChanged
        if(campoClave.getSelectedIndex()==5){
            jLabel69.setVisible(false);
            jLabel68.setVisible(false);
            Palabra.setVisible(false);
            jLabel70.setText("Últimos cinco empleados agregados");
        } else {
            jLabel70.setText("Resultados posibles con: ");
            jLabel68.setVisible(true);
            jLabel69.setText("");
            jLabel69.setVisible(true);
            Palabra.setText("");
            Palabra.setVisible(true);
        }
    }//GEN-LAST:event_campoClaveItemStateChanged

    private void DiaNacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DiaNacKeyTyped
        if(DiaNac.getText().length()==2){
            evt.consume();
            DiaNac.transferFocus();
        }
    }//GEN-LAST:event_DiaNacKeyTyped

    private void MesNacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MesNacKeyTyped
        if(MesNac.getText().length()==2){
            evt.consume();
            MesNac.transferFocus();
        }      
    }//GEN-LAST:event_MesNacKeyTyped

    private void AñoNacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AñoNacKeyTyped
        if(AñoNac.getText().length()==4){
            evt.consume();
            AñoNac.transferFocus();
        }
    }//GEN-LAST:event_AñoNacKeyTyped

    private void DiaIngKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DiaIngKeyTyped
        if(DiaIng.getText().length()==2){
            evt.consume();
            DiaIng.transferFocus();
        }
    }//GEN-LAST:event_DiaIngKeyTyped

    private void MesIngKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MesIngKeyTyped
        if(MesIng.getText().length()==2){
            evt.consume();
            MesIng.transferFocus();
        }
    }//GEN-LAST:event_MesIngKeyTyped

    private void AñoIngKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AñoIngKeyTyped
        if(AñoIng.getText().length()==4){
            evt.consume();
            AñoIng.transferFocus();
        }
    }//GEN-LAST:event_AñoIngKeyTyped

    private void DiaNacFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DiaNacFKeyTyped
        if(DiaNacF.getText().length()==2){
            evt.consume();
            DiaNacF.transferFocus();
        }
    }//GEN-LAST:event_DiaNacFKeyTyped

    private void MesNacFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MesNacFKeyTyped
        if(MesNacF.getText().length()==2){
            evt.consume();
            MesNacF.transferFocus();
        }
    }//GEN-LAST:event_MesNacFKeyTyped

    private void AñoNacFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AñoNacFKeyTyped
        if(AñoNacF.getText().length()==4){
            evt.consume();
            AñoNacF.transferFocus();
        }
    }//GEN-LAST:event_AñoNacFKeyTyped

    private void DiaNacMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DiaNacMKeyTyped
        if(DiaNacM.getText().length()==2){
            evt.consume();
            DiaNacM.transferFocus();
        }
    }//GEN-LAST:event_DiaNacMKeyTyped

    private void MesNacMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MesNacMKeyTyped
        if(MesNacM.getText().length()==2){
            evt.consume();
            MesNacM.transferFocus();
        }
    }//GEN-LAST:event_MesNacMKeyTyped

    private void AñoNacMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AñoNacMKeyTyped
        if(AñoNacM.getText().length()==4){
            evt.consume();
            AñoNacM.transferFocus();
        }
    }//GEN-LAST:event_AñoNacMKeyTyped

    private void DiaIngMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DiaIngMKeyTyped
        if(DiaIngM.getText().length()==2){
            evt.consume();
            DiaIngM.transferFocus();
        }
    }//GEN-LAST:event_DiaIngMKeyTyped

    private void MesIngMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MesIngMKeyTyped
        if(MesIngM.getText().length()==2){
            evt.consume();
            MesIngM.transferFocus();
        }
    }//GEN-LAST:event_MesIngMKeyTyped

    private void AñoIngMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AñoIngMKeyTyped
        if(AñoIngM.getText().length()==4){
            evt.consume();
            AñoIngM.transferFocus();
        }
    }//GEN-LAST:event_AñoIngMKeyTyped

    private void PalabraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PalabraKeyTyped

    }//GEN-LAST:event_PalabraKeyTyped

    private void PalabraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PalabraKeyReleased
        Object [][] n=null;
        switch (campoClave.getSelectedIndex()){
            case 0:
                n=ne.segunApellido(Palabra.getText()); break;
            case 1:
                n=ne.segunDni(Palabra.getText()); break;
            case 2:
                n=ne.segunLegajo(Palabra.getText()); break;
            case 3:
                n=ne.segunArea(Palabra.getText()); break;
            case 4:
                n=ne.segunCargo(Palabra.getText()); break;
            case 5:
                n=ne.ultimosCinco(); break;
        }
        listadoB.setModel(new javax.swing.table.DefaultTableModel(
            n,new String [] {"Apellidos, nombres", "Documento", "Sexo", "Edad", "Fecha de ingreso", "Cargo", "Area"}
        ));
        listadoB.getColumnModel().getColumn(0).setMinWidth(230);
        listadoB.getColumnModel().getColumn(0).setMaxWidth(230);
        listadoB.getColumnModel().getColumn(1).setMinWidth(75);
        listadoB.getColumnModel().getColumn(1).setMaxWidth(75);
        listadoB.getColumnModel().getColumn(2).setMinWidth(70);
        listadoB.getColumnModel().getColumn(2).setMaxWidth(70);
        listadoB.getColumnModel().getColumn(3).setMinWidth(45);
        listadoB.getColumnModel().getColumn(3).setMaxWidth(45);
        listadoB.getColumnModel().getColumn(4).setMinWidth(105);
        listadoB.getColumnModel().getColumn(4).setMaxWidth(105);
        listadoB.getColumnModel().getColumn(5).setMinWidth(80);
        listadoB.getColumnModel().getColumn(5).setMaxWidth(80);
        listadoB.getColumnModel().getColumn(6).setMinWidth(165);
        listadoB.getColumnModel().getColumn(6).setMaxWidth(165);
        jLabel69.setText(Palabra.getText());
    }//GEN-LAST:event_PalabraKeyReleased

    private void PalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PalabraActionPerformed

    }//GEN-LAST:event_PalabraActionPerformed

    private void DniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DniKeyTyped
        if(Dni.getText().length()==8){
            evt.consume();
            Dni.transferFocus();
        }
    }//GEN-LAST:event_DniKeyTyped

    private void DniFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DniFKeyTyped
        if(DniF.getText().length()==8){
            evt.consume();
            DniF.transferFocus();
        }
    }//GEN-LAST:event_DniFKeyTyped

    private void DniMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DniMKeyTyped
        if(DniM.getText().length()==8){
            evt.consume();
            DniM.transferFocus();
        }
    }//GEN-LAST:event_DniMKeyTyped

    private void eliminarDesdeInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDesdeInfoButtonActionPerformed
        int i=ne.devolverSegunDni(docu.getText());
        int seleccion = JOptionPane.showOptionDialog(this,
        "¿Está seguro que quiere eliminar a\n"+apeYNom.getText()+"?", "Seleccione una opción",
        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,
        new Object[] { "Si", "No"}, "Si");
        if (seleccion != -1){
            if((seleccion + 1)==1){
                ne.eliminarEmpleado(i);
                InfoEmpleado.setVisible(false);
                if(this.lista)
                    ListadoEmpleados.setVisible(true);
                else
                    BuscarEmpleado.setVisible(true);
                this.nivel = 1;
            }
        }
    }//GEN-LAST:event_eliminarDesdeInfoButtonActionPerformed

    private void empleadosDesdeInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadosDesdeInfoButtonActionPerformed
        InfoEmpleado.setVisible(false);
        this.nivel = 3;
        ListadoArea.setVisible(true);
    }//GEN-LAST:event_empleadosDesdeInfoButtonActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        Principal.super.setVisible(false);
        this.nivel = 1;
        BuscarEmpleado.setVisible(true);
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void listadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoButtonActionPerformed
        Principal.super.setVisible(false);
        this.nivel = 1;
        ListadoEmpleados.setVisible(true);
    }//GEN-LAST:event_listadoButtonActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        Principal.super.setVisible(false);
        Dni.setText("");Apellido.setText("");Nombre.setText("");Domicilio.setText("");DiaNac.setText("");
        MesNac.setText("");AñoNac.setText("");DiaIng.setText("");MesIng.setText("");AñoIng.setText("");
        Legajo.setText("");area.setText("");sucVentas.setText("");porcVentas.setText("");
        sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino"}));
        cargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Administrativo","Operario","Jefe de área","Gerente","Vendedor"}));
        sucVentas.setVisible(false);
        porcVentas.setVisible(false);
        AgregarFondo fondo = new AgregarFondo(505,515);
        AgregarEmpleado.add(fondo, BorderLayout.CENTER);
        AgregarEmpleado.pack();
        AgregarEmpleado.setSize(505, 515);
        AgregarEmpleado.setTitle("Nuevo empleado");
        AgregarEmpleado.setResizable(false);
        AgregarEmpleado.setLocationRelativeTo(null);
        this.nivel=1;
        AgregarEmpleado.setVisible(true);
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void AgregarEmpleadoWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AgregarEmpleadoWindowClosing
        AgregarEmpleado.setVisible(false);
        this.nivel=0;
        Principal.super.setVisible(true);
    }//GEN-LAST:event_AgregarEmpleadoWindowClosing

    private void ListadoEmpleadosWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ListadoEmpleadosWindowClosing
        ListadoEmpleados.setVisible(false);
        this.nivel = 0;
        Principal.super.setVisible(true);
    }//GEN-LAST:event_ListadoEmpleadosWindowClosing

    private void BuscarEmpleadoWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_BuscarEmpleadoWindowClosing
        BuscarEmpleado.setVisible(false);
        this.nivel = 0;
        Principal.super.setVisible(true);
    }//GEN-LAST:event_BuscarEmpleadoWindowClosing

    private void AgregarFamiliarWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AgregarFamiliarWindowClosing
        AgregarFamiliar.setVisible(false);
        if(this.nivel==2){
            Principal.super.setVisible(true);
            this.nivel = 0;
        }
        if(this.nivel==4){
            ListadoFamiliar.setVisible(true);
            this.nivel = 3;
        }
        if(!Principal.super.isVisible()&&!AgregarEmpleado.isVisible()&&!BuscarEmpleado.isVisible()
           &&!InfoEmpleado.isVisible()&&!ListadoEmpleados.isVisible()
           &&!ListadoFamiliar.isVisible()&&!ModificarEmpleado.isVisible()){
            JOptionPane.showMessageDialog(null, "Hubo un error con Viderbus,\nserá redirigido al menú principal","Error",JOptionPane.PLAIN_MESSAGE);
            Principal.super.setVisible(true);
        }
    }//GEN-LAST:event_AgregarFamiliarWindowClosing

    private void areaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaKeyReleased
        jLabel24.setText(ne.buscarJefe(area.getText()));
    }//GEN-LAST:event_areaKeyReleased

    private void InfoEmpleadoWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_InfoEmpleadoWindowClosing
        InfoEmpleado.setVisible(false);
        if(this.lista)
            ListadoEmpleados.setVisible(true);
        else
            BuscarEmpleado.setVisible(true);
        this.nivel = 1;
    }//GEN-LAST:event_InfoEmpleadoWindowClosing

    private void salirDesdeListado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirDesdeListado1ActionPerformed
        ListadoArea.setVisible(false);
        this.nivel = 2;
        InfoEmpleado.setVisible(true);
    }//GEN-LAST:event_salirDesdeListado1ActionPerformed

    private void infoDesdeListado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoDesdeListado1ActionPerformed
        int tipo=-1, pos=-1;
        if(ne.sinSeleccionException(listado2.getSelectedRow())){
            switch(listado2.getValueAt(listado2.getSelectedRow(), 5).toString()){
                case "Administrativo":
                    tipo = 0; break;
                case "Operario":
                    tipo = 1; break;
            }
            int seleccion = JOptionPane.showOptionDialog(this,
            "¿Desea modificar el área de éste empleado?", 
            "Seleccione una opción",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
            new Object[] { "Si", "No"},"Si");
            if (seleccion != -1)
                if((seleccion + 1)==1){
                    pos = ne.devolverSegunDni(listado2.getValueAt(listado2.getSelectedRow(), 1).toString());
                    ne.modificarArea(tipo, noAr.getText(), pos);
                }
        }
        
    }//GEN-LAST:event_infoDesdeListado1ActionPerformed

    private void ListadoAreaWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ListadoAreaWindowClosing
        ListadoArea.setVisible(false);
        this.nivel = 2;
        InfoEmpleado.setVisible(true);
    }//GEN-LAST:event_ListadoAreaWindowClosing

    private void areaMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaMKeyReleased
        jLabel84.setText(ne.buscarJefe(areaM.getText()));
    }//GEN-LAST:event_areaMKeyReleased

    private void AgregarEmpleadoWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AgregarEmpleadoWindowActivated

    }//GEN-LAST:event_AgregarEmpleadoWindowActivated

    private void AgregarFamiliarWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AgregarFamiliarWindowActivated
        sexoF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino"}));
        relacionF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hijo/a", "Esposa/o","Madre","Padre","Tío/a","Abuelo/a"}));
        DniF.setText(""); ApellidoF.setText(""); NombreF.setText(""); DomicilioF.setText(""); 
        DiaNacF.setText(""); MesNacF.setText(""); AñoNacF.setText("");
        AgregarFondo fondo = new AgregarFondo(505,320);
        AgregarFamiliar.add(fondo, BorderLayout.CENTER);
        AgregarFamiliar.pack();
        AgregarFamiliar.setSize(505, 320);
        AgregarFamiliar.setTitle("Nuevo Familiar");
        AgregarFamiliar.setResizable(false);
        AgregarFamiliar.setLocationRelativeTo(null);
    }//GEN-LAST:event_AgregarFamiliarWindowActivated

    private void ListadoEmpleadosWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ListadoEmpleadosWindowActivated
        this.lista = true;
        listadoA.setModel(new javax.swing.table.DefaultTableModel(
            ne.listarEmpleados(),
            new String [] {"Apellidos, nombres", "Documento", "Sexo", "Edad", "Fecha de ingreso", "Cargo", "Area"}
        ));
        listadoA.getColumnModel().getColumn(0).setMinWidth(230);
        listadoA.getColumnModel().getColumn(0).setMaxWidth(230);
        listadoA.getColumnModel().getColumn(1).setMinWidth(75);
        listadoA.getColumnModel().getColumn(1).setMaxWidth(75);
        listadoA.getColumnModel().getColumn(2).setMinWidth(70);
        listadoA.getColumnModel().getColumn(2).setMaxWidth(70);
        listadoA.getColumnModel().getColumn(3).setMinWidth(45);
        listadoA.getColumnModel().getColumn(3).setMaxWidth(45);
        listadoA.getColumnModel().getColumn(4).setMinWidth(105);
        listadoA.getColumnModel().getColumn(4).setMaxWidth(105);
        listadoA.getColumnModel().getColumn(5).setMinWidth(80);
        listadoA.getColumnModel().getColumn(5).setMaxWidth(80);
        listadoA.getColumnModel().getColumn(6).setMinWidth(165);
        listadoA.getColumnModel().getColumn(6).setMaxWidth(165);
        
        ListadoFondo fondo = new ListadoFondo(820,490);
        ListadoEmpleados.add(fondo, BorderLayout.CENTER);
        ListadoEmpleados.pack();
        ListadoEmpleados.setSize(820, 490);
        ListadoEmpleados.setTitle("Listado de empleados");
        ListadoEmpleados.setResizable(false);
        ListadoEmpleados.setLocationRelativeTo(null);
    }//GEN-LAST:event_ListadoEmpleadosWindowActivated

    private void InfoEmpleadoWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_InfoEmpleadoWindowActivated
        InfoFondo fondo = new InfoFondo(600,270);
        InfoEmpleado.add(fondo, BorderLayout.CENTER);
        InfoEmpleado.pack();
        InfoEmpleado.setSize(600, 270);
        InfoEmpleado.setResizable(false);
        InfoEmpleado.setLocationRelativeTo(null);
    }//GEN-LAST:event_InfoEmpleadoWindowActivated

    private void ModificarEmpleadoWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ModificarEmpleadoWindowActivated
        ModificarFondo fondo = new ModificarFondo(505,450);
        ModificarEmpleado.add(fondo, BorderLayout.CENTER);
        ModificarEmpleado.pack();
        ModificarEmpleado.setSize(500, 450);
        ModificarEmpleado.setTitle("Datos de "+ApellidoM.getText()+", "+NombreM.getText());
        ModificarEmpleado.setResizable(false);
        ModificarEmpleado.setLocationRelativeTo(null);
    }//GEN-LAST:event_ModificarEmpleadoWindowActivated

    private void ModificarEmpleadoWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ModificarEmpleadoWindowClosing
        ModificarEmpleado.setVisible(false);
        this.nivel = 2;
        ne.quitarSegunPos(ne.empleados.size()-1);
        InfoEmpleado.setVisible(true);
    }//GEN-LAST:event_ModificarEmpleadoWindowClosing

    private void ListadoAreaWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ListadoAreaWindowActivated
        listado1.setModel(new javax.swing.table.DefaultTableModel(
            ne.empleadosSegunJefe(ne.devolverJefe(noAr.getText())),
            new String [] {"Apellidos, nombres", "Documento", "Sexo", "Edad", "Fecha de ingreso", "Cargo", "Legajo"}
        ));
        listado1.getColumnModel().getColumn(0).setMinWidth(230);
        listado1.getColumnModel().getColumn(0).setMaxWidth(230);
        listado1.getColumnModel().getColumn(1).setMinWidth(75);
        listado1.getColumnModel().getColumn(1).setMaxWidth(75);
        listado1.getColumnModel().getColumn(2).setMinWidth(70);
        listado1.getColumnModel().getColumn(2).setMaxWidth(70);
        listado1.getColumnModel().getColumn(3).setMinWidth(45);
        listado1.getColumnModel().getColumn(3).setMaxWidth(45);
        listado1.getColumnModel().getColumn(4).setMinWidth(105);
        listado1.getColumnModel().getColumn(4).setMaxWidth(105);
        listado1.getColumnModel().getColumn(5).setMinWidth(80);
        listado1.getColumnModel().getColumn(5).setMaxWidth(80);
        listado1.getColumnModel().getColumn(6).setMinWidth(165);
        listado1.getColumnModel().getColumn(6).setMaxWidth(165);
        
        listado2.setModel(new javax.swing.table.DefaultTableModel(
            ne.listaEmpleadosDiferentesAlArea(noAr.getText()),
            new String [] {"Apellidos, nombres", "Documento", "Sexo", "Edad", "Fecha de ingreso", "Cargo", "Legajo"}
        ));
        listado2.getColumnModel().getColumn(0).setMinWidth(230);
        listado2.getColumnModel().getColumn(0).setMaxWidth(230);
        listado2.getColumnModel().getColumn(1).setMinWidth(75);
        listado2.getColumnModel().getColumn(1).setMaxWidth(75);
        listado2.getColumnModel().getColumn(2).setMinWidth(70);
        listado2.getColumnModel().getColumn(2).setMaxWidth(70);
        listado2.getColumnModel().getColumn(3).setMinWidth(45);
        listado2.getColumnModel().getColumn(3).setMaxWidth(45);
        listado2.getColumnModel().getColumn(4).setMinWidth(105);
        listado2.getColumnModel().getColumn(4).setMaxWidth(105);
        listado2.getColumnModel().getColumn(5).setMinWidth(80);
        listado2.getColumnModel().getColumn(5).setMaxWidth(80);
        listado2.getColumnModel().getColumn(6).setMinWidth(165);
        listado2.getColumnModel().getColumn(6).setMaxWidth(165);
        
        nombreJefe.setText(apeYNom.getText());
        ListadoFondo fondo = new ListadoFondo(820,600);
        ListadoArea.add(fondo, BorderLayout.CENTER);
        ListadoArea.pack();
        ListadoArea.setSize(820, 600);
        ListadoArea.setTitle("Listado de empleados del area "+noAr.getText());
        ListadoArea.setResizable(false);
        ListadoArea.setLocationRelativeTo(null);
    }//GEN-LAST:event_ListadoAreaWindowActivated

    private void ListadoFamiliarWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ListadoFamiliarWindowActivated
        listadoF.setModel(new javax.swing.table.DefaultTableModel(
                ne.empleados.get(ne.devolverPosSegunDni(docu.getText())).devolverFamiliares(),
                new String [] {"Apellidos, nombres", "Documento", "Sexo", "Domicilio", "Fecha de nacimiento", "Relación"
                }));
        
        listadoF.getColumnModel().getColumn(0).setMinWidth(230);
        listadoF.getColumnModel().getColumn(0).setMaxWidth(230);
        listadoF.getColumnModel().getColumn(1).setMinWidth(75);
        listadoF.getColumnModel().getColumn(1).setMaxWidth(75);
        listadoF.getColumnModel().getColumn(2).setMinWidth(70);
        listadoF.getColumnModel().getColumn(2).setMaxWidth(70);
        listadoF.getColumnModel().getColumn(3).setMinWidth(193);
        listadoF.getColumnModel().getColumn(3).setMaxWidth(193);
        listadoF.getColumnModel().getColumn(4).setMinWidth(105);
        listadoF.getColumnModel().getColumn(4).setMaxWidth(105);
        listadoF.getColumnModel().getColumn(5).setMinWidth(105);
        listadoF.getColumnModel().getColumn(5).setMaxWidth(105);
        
        ListadoFondo fondo = new ListadoFondo(820,240);
        ListadoFamiliar.add(fondo, BorderLayout.CENTER);
        ListadoFamiliar.pack();
        ListadoFamiliar.setSize(820, 240);
        ListadoFamiliar.setTitle("Familiares de "+apeYNom.getText());
        ListadoFamiliar.setResizable(false);
        ListadoFamiliar.setLocationRelativeTo(null);
    }//GEN-LAST:event_ListadoFamiliarWindowActivated

    private void ListadoFamiliarWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ListadoFamiliarWindowClosing
        ListadoFamiliar.setVisible(false);
        this.nivel = 2;
        InfoEmpleado.setVisible(true);
    }//GEN-LAST:event_ListadoFamiliarWindowClosing

    private void BuscarEmpleadoWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_BuscarEmpleadoWindowActivated
        campoClave.setModel(new javax.swing.DefaultComboBoxModel(new String []
        {"Apellido", "Documento", "Número de legajo", "Area", "Cargo", "Últimos cinco"}));
        listadoB.setModel(new javax.swing.table.DefaultTableModel(
        null,
        new String [] {"Apellidos, nombres", "Documento", "Sexo", "Edad", "Fecha de ingreso", "Cargo", "Area"}
        ));
        listadoB.getColumnModel().getColumn(0).setMinWidth(230);
        listadoB.getColumnModel().getColumn(0).setMaxWidth(230);
        listadoB.getColumnModel().getColumn(1).setMinWidth(75);
        listadoB.getColumnModel().getColumn(1).setMaxWidth(75);
        listadoB.getColumnModel().getColumn(2).setMinWidth(70);
        listadoB.getColumnModel().getColumn(2).setMaxWidth(70);
        listadoB.getColumnModel().getColumn(3).setMinWidth(45);
        listadoB.getColumnModel().getColumn(3).setMaxWidth(45);
        listadoB.getColumnModel().getColumn(4).setMinWidth(105);
        listadoB.getColumnModel().getColumn(4).setMaxWidth(105);
        listadoB.getColumnModel().getColumn(5).setMinWidth(80);
        listadoB.getColumnModel().getColumn(5).setMaxWidth(80);
        listadoB.getColumnModel().getColumn(6).setMinWidth(165);
        listadoB.getColumnModel().getColumn(6).setMaxWidth(165);
        Palabra.setText("");
        BuscarFondo fondo = new BuscarFondo(850,255);
        BuscarEmpleado.add(fondo, BorderLayout.CENTER);
        BuscarEmpleado.pack();
        BuscarEmpleado.setSize(850, 255);
        BuscarEmpleado.setTitle("Buscador de empleados");
        BuscarEmpleado.setResizable(false);
        BuscarEmpleado.setLocationRelativeTo(null);
        this.lista = false;
    }//GEN-LAST:event_BuscarEmpleadoWindowActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame AgregarEmpleado;
    private javax.swing.JFrame AgregarFamiliar;
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField ApellidoF;
    private javax.swing.JTextField ApellidoM;
    private javax.swing.JTextField AñoIng;
    private javax.swing.JTextField AñoIngM;
    private javax.swing.JTextField AñoNac;
    private javax.swing.JTextField AñoNacF;
    private javax.swing.JTextField AñoNacM;
    private javax.swing.JFrame BuscarEmpleado;
    private javax.swing.JTextField DiaIng;
    private javax.swing.JTextField DiaIngM;
    private javax.swing.JTextField DiaNac;
    private javax.swing.JTextField DiaNacF;
    private javax.swing.JTextField DiaNacM;
    private javax.swing.JTextField Dni;
    private javax.swing.JTextField DniF;
    private javax.swing.JTextField DniM;
    private javax.swing.JTextField Domicilio;
    private javax.swing.JTextField DomicilioF;
    private javax.swing.JTextField DomicilioM;
    private javax.swing.JFrame InfoEmpleado;
    private javax.swing.JTextField Legajo;
    private javax.swing.JTextField LegajoM;
    private javax.swing.JFrame ListadoArea;
    private javax.swing.JFrame ListadoEmpleados;
    private javax.swing.JFrame ListadoFamiliar;
    private javax.swing.JTextField MesIng;
    private javax.swing.JTextField MesIngM;
    private javax.swing.JTextField MesNac;
    private javax.swing.JTextField MesNacF;
    private javax.swing.JTextField MesNacM;
    private javax.swing.JFrame ModificarEmpleado;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NombreF;
    private javax.swing.JTextField NombreM;
    private javax.swing.JTextField Palabra;
    private javax.swing.JButton aceptarDesdeModificarButton;
    private javax.swing.JButton agregarButton;
    private javax.swing.JButton agregarDesdeFamiliarButton;
    private javax.swing.JButton agregarDesdeListadoFButton;
    private javax.swing.JLabel apeYNom;
    private javax.swing.JTextField area;
    private javax.swing.JTextField areaM;
    private javax.swing.JButton buscarButton;
    private javax.swing.JButton buscarDesdeBuscarButton;
    private javax.swing.JComboBox campoClave;
    private javax.swing.JButton cancelarDesdeNuevoButton;
    private javax.swing.JComboBox cargo;
    private javax.swing.JComboBox cargoM;
    private javax.swing.JLabel docu;
    private javax.swing.JLabel domi;
    private javax.swing.JButton eliminarDesdeInfoButton;
    private javax.swing.JButton empleadosDesdeInfoButton;
    private javax.swing.JButton familiaresDesdeInfoButton;
    private javax.swing.JLabel feIn;
    private javax.swing.JLabel feNa;
    private javax.swing.JLabel goca;
    private javax.swing.JButton guardarDesdeNuevoButton;
    private javax.swing.JButton infoDesdeBusquedaButton;
    private javax.swing.JButton infoDesdeListado;
    private javax.swing.JButton infoDesdeListado1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable listado1;
    private javax.swing.JTable listado2;
    private javax.swing.JTable listadoA;
    private javax.swing.JTable listadoB;
    private javax.swing.JButton listadoButton;
    private javax.swing.JTable listadoF;
    private javax.swing.JButton modificarDesdeInfoButton;
    private javax.swing.JLabel noAr;
    private javax.swing.JLabel nombreJefe;
    private javax.swing.JLabel nuLe;
    private javax.swing.JLabel poVe;
    private javax.swing.JTextField porcVentas;
    private javax.swing.JTextField porcVentasM;
    private javax.swing.JComboBox relacionF;
    private javax.swing.JButton salirDesdeBusquedaButton;
    private javax.swing.JButton salirDesdeFamiliarButton;
    private javax.swing.JButton salirDesdeInfoButton;
    private javax.swing.JButton salirDesdeListaFButton;
    private javax.swing.JButton salirDesdeListado;
    private javax.swing.JButton salirDesdeListado1;
    private javax.swing.JButton salirDesdeModificarButton;
    private javax.swing.JComboBox sexo;
    private javax.swing.JComboBox sexoF;
    private javax.swing.JComboBox sexoM;
    private javax.swing.JTextField sucVentas;
    private javax.swing.JTextField sucVentasM;
    private javax.swing.JLabel sucu;
    private javax.swing.JLabel xose;
    // End of variables declaration//GEN-END:variables
}
