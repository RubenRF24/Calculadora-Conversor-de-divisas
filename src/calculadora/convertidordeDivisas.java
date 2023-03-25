/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author ASUS VIVOBOOK
 */
public class convertidordeDivisas extends javax.swing.JFrame {

    private String cadenaNumeros="", cadenaMuestra="";
    private double numero, resultado=0;
    private boolean punto=true;
    private DefaultComboBoxModel<monedas> modelo=new DefaultComboBoxModel();
    private DefaultComboBoxModel<monedas> modelo1= new DefaultComboBoxModel();

    
    /**
     * Creates new form convertidordeDivisas
     */
    public convertidordeDivisas() {
        llenarModeloComboBox();
        initComponents();
    }
    
    public void llenarModeloComboBox(){
        modelo.addElement(new monedas("Peru - Nuevo Sol"));
        modelo.addElement(new monedas("Colombia - Peso Colombiano"));
        modelo.addElement(new monedas("Estados Unidos - Dolar"));
        modelo.addElement(new monedas("Europa - Euro"));
        modelo1.addElement(new monedas("Peru - Nuevo Sol"));
        modelo1.addElement(new monedas("Colombia - Peso Colombiano"));
        modelo1.addElement(new monedas("Estados Unidos - Dolar"));
        modelo1.addElement(new monedas("Europa - Euro"));
    }
    
    public void convertirDivisas(){      
       if(cadenaNumeros!=""){
           if((comboBox1.getSelectedIndex() == 0) &&
                (comboBox2.getSelectedIndex()) == 0){
            cadenaMuestra="S/. "+cadenaNumeros;
            numero=Double.parseDouble(cadenaNumeros);
            etiquetaHistorial.setText(cadenaMuestra);
            resultado= numero*1;
            etiquetaES.setText("S/. "+resultado);
            }  
            else if((comboBox1.getSelectedIndex() == 0) &&
                (comboBox2.getSelectedIndex()) == 1){
            cadenaMuestra="S/. "+cadenaNumeros;
            numero=Double.parseDouble(cadenaNumeros);
            etiquetaHistorial.setText(cadenaMuestra);
            resultado= numero*1157;
            etiquetaES.setText("$ "+resultado);
            }
           else if((comboBox1.getSelectedIndex() == 0) &&
                (comboBox2.getSelectedIndex()) == 2){
            cadenaMuestra="S/. "+cadenaNumeros;
            numero=Double.parseDouble(cadenaNumeros);
            etiquetaHistorial.setText(cadenaMuestra);
            resultado= numero*0.25;
            etiquetaES.setText("$ "+resultado);
            }
           else if((comboBox1.getSelectedIndex() == 0) &&
                (comboBox2.getSelectedIndex()) == 3){
            cadenaMuestra="S/. "+cadenaNumeros;
            numero=Double.parseDouble(cadenaNumeros);
            etiquetaHistorial.setText(cadenaMuestra);
            resultado= numero*0.26;
            etiquetaES.setText("€ "+resultado);
            }
           else if((comboBox1.getSelectedIndex() == 1) &&
                (comboBox2.getSelectedIndex()) == 0){
            cadenaMuestra="$ "+cadenaNumeros;
            numero=Double.parseDouble(cadenaNumeros);
            etiquetaHistorial.setText(cadenaMuestra);
            resultado= numero*0.00088;
            etiquetaES.setText("S/. "+resultado);
            }  
            else if((comboBox1.getSelectedIndex() == 1) &&
                (comboBox2.getSelectedIndex()) == 1){
            cadenaMuestra="$ "+cadenaNumeros;
            numero=Double.parseDouble(cadenaNumeros);
            etiquetaHistorial.setText(cadenaMuestra);
            resultado= numero*1;
            etiquetaES.setText("$ "+resultado);
            }
           else if((comboBox1.getSelectedIndex() == 1) &&
                (comboBox2.getSelectedIndex()) == 2){
            cadenaMuestra="$ "+cadenaNumeros;
            numero=Double.parseDouble(cadenaNumeros);
            etiquetaHistorial.setText(cadenaMuestra);
            resultado= numero*0.00022;
            etiquetaES.setText("$ "+resultado);
            }
           else if((comboBox1.getSelectedIndex() == 1) &&
                (comboBox2.getSelectedIndex()) == 3){
            cadenaMuestra="$ "+cadenaNumeros;
            numero=Double.parseDouble(cadenaNumeros);
            etiquetaHistorial.setText(cadenaMuestra);
            resultado= numero*0.00023;
            etiquetaES.setText("€ "+resultado);
            }
           else if((comboBox1.getSelectedIndex() == 2) &&
                (comboBox2.getSelectedIndex()) == 0){
            cadenaMuestra="$ "+cadenaNumeros;
            numero=Double.parseDouble(cadenaNumeros);
            etiquetaHistorial.setText(cadenaMuestra);
            resultado= numero*3.98;
            etiquetaES.setText("S/. "+resultado);
            }  
            else if((comboBox1.getSelectedIndex() == 2) &&
                (comboBox2.getSelectedIndex()) == 1){
            cadenaMuestra="$ "+cadenaNumeros;
            numero=Double.parseDouble(cadenaNumeros);
            etiquetaHistorial.setText(cadenaMuestra);
            resultado= numero*4610;
            etiquetaES.setText("$ "+resultado);
            }
           else if((comboBox1.getSelectedIndex() == 2) &&
                (comboBox2.getSelectedIndex()) == 2){
            cadenaMuestra="$ "+cadenaNumeros;
            numero=Double.parseDouble(cadenaNumeros);
            etiquetaHistorial.setText(cadenaMuestra);
            resultado= numero*1;
            etiquetaES.setText("$ "+resultado);
            }
           else if((comboBox1.getSelectedIndex() == 2) &&
                (comboBox2.getSelectedIndex()) == 3){
            cadenaMuestra="$ "+cadenaNumeros;
            numero=Double.parseDouble(cadenaNumeros);
            etiquetaHistorial.setText(cadenaMuestra);
            resultado= numero*1.02;
            etiquetaES.setText("€ "+resultado);
            }
           else if((comboBox1.getSelectedIndex() == 3) &&
                (comboBox2.getSelectedIndex()) == 0){
            cadenaMuestra="€ "+cadenaNumeros;
            numero=Double.parseDouble(cadenaNumeros);
            etiquetaHistorial.setText(cadenaMuestra);
            resultado= numero*3.90;
            etiquetaES.setText("S/. "+resultado);
            }  
            else if((comboBox1.getSelectedIndex() == 3) &&
                (comboBox2.getSelectedIndex()) == 1){
            cadenaMuestra="€ "+cadenaNumeros;
            numero=Double.parseDouble(cadenaNumeros);
            etiquetaHistorial.setText(cadenaMuestra);
            resultado= numero*4518;
            etiquetaES.setText("$ "+resultado);
            }
           else if((comboBox1.getSelectedIndex() == 3) &&
                (comboBox2.getSelectedIndex()) == 2){
            cadenaMuestra="€ "+cadenaNumeros;
            numero=Double.parseDouble(cadenaNumeros);
            etiquetaHistorial.setText(cadenaMuestra);
            resultado= numero*0.98;
            etiquetaES.setText("$ "+resultado);
            }
           else if((comboBox1.getSelectedIndex() == 3) &&
                (comboBox2.getSelectedIndex()) == 3){
            cadenaMuestra="€ "+cadenaNumeros;
            numero=Double.parseDouble(cadenaNumeros);
            etiquetaHistorial.setText(cadenaMuestra);
            resultado= numero*1;
            etiquetaES.setText("€ "+resultado);
            }
       }                 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelPantalla = new javax.swing.JPanel();
        etiquetaHistorial = new javax.swing.JLabel();
        etiquetaES = new javax.swing.JLabel();
        comboBox1 = new javax.swing.JComboBox<>();
        comboBox2 = new javax.swing.JComboBox<>();
        panelNumeros = new javax.swing.JPanel();
        botonClear = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUsos = new javax.swing.JMenu();
        itemCalculadora = new javax.swing.JMenuItem();
        itemDivisas = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convertidor de divisas");

        panelPantalla.setLayout(new java.awt.GridBagLayout());

        etiquetaHistorial.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        etiquetaHistorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaHistorial.setText("S/. 0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 20);
        panelPantalla.add(etiquetaHistorial, gridBagConstraints);

        etiquetaES.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        etiquetaES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaES.setText("S/. 0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 20);
        panelPantalla.add(etiquetaES, gridBagConstraints);

        comboBox1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        comboBox1.setModel(modelo);
        comboBox1.setSelectedIndex(0);
        comboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 10);
        panelPantalla.add(comboBox1, gridBagConstraints);

        comboBox2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        comboBox2.setModel(modelo1);
        comboBox2.setSelectedIndex(0);
        comboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 10);
        panelPantalla.add(comboBox2, gridBagConstraints);

        panelNumeros.setLayout(new java.awt.GridBagLayout());

        botonClear.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        botonClear.setText("C");
        botonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelNumeros.add(botonClear, gridBagConstraints);

        botonBorrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        botonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelNumeros.add(botonBorrar, gridBagConstraints);

        boton7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelNumeros.add(boton7, gridBagConstraints);

        boton8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelNumeros.add(boton8, gridBagConstraints);

        boton9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelNumeros.add(boton9, gridBagConstraints);

        boton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelNumeros.add(boton4, gridBagConstraints);

        boton5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelNumeros.add(boton5, gridBagConstraints);

        boton6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelNumeros.add(boton6, gridBagConstraints);

        boton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelNumeros.add(boton1, gridBagConstraints);

        boton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelNumeros.add(boton2, gridBagConstraints);

        boton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelNumeros.add(boton3, gridBagConstraints);

        boton0.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelNumeros.add(boton0, gridBagConstraints);

        botonPunto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        botonPunto.setText(".");
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelNumeros.add(botonPunto, gridBagConstraints);

        menuUsos.setText("Usos");
        menuUsos.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        menuUsos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsosActionPerformed(evt);
            }
        });

        itemCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoCalculadora.png"))); // NOI18N
        itemCalculadora.setText("Calculadora Estándar");
        itemCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCalculadoraActionPerformed(evt);
            }
        });
        menuUsos.add(itemCalculadora);

        itemDivisas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/divisa.png"))); // NOI18N
        itemDivisas.setText("Convertidor de divisas");
        itemDivisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDivisasActionPerformed(evt);
            }
        });
        menuUsos.add(itemDivisas);

        itemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menuUsos.add(itemSalir);

        jMenuBar1.add(menuUsos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 345, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 156, Short.MAX_VALUE)
                    .addComponent(panelNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemDivisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDivisasActionPerformed
        
    }//GEN-LAST:event_itemDivisasActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemSalirActionPerformed

    private void menuUsosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuUsosActionPerformed

    private void itemCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCalculadoraActionPerformed
        calculadora cal= new calculadora();
        dispose();
        cal.setVisible(true);
    }//GEN-LAST:event_itemCalculadoraActionPerformed

    private void botonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClearActionPerformed
        if(cadenaNumeros!=""){
            cadenaNumeros="0";
            punto=true;
            convertirDivisas();
            cadenaNumeros="";
            cadenaMuestra="";
        }
    }//GEN-LAST:event_botonClearActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        try{
            if(cadenaNumeros.charAt(cadenaNumeros.length()-1)=='.'){
                punto=true;
            }
            if(cadenaNumeros.length()==1){                
                cadenaNumeros="0";
                convertirDivisas();
            }
            if(cadenaNumeros!=""){
                cadenaNumeros= cadenaNumeros.substring(0, cadenaNumeros.length()-1);
                convertirDivisas();
            }         
            
        } catch(StringIndexOutOfBoundsException si){

        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        cadenaNumeros+="7";
        convertirDivisas();       
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        cadenaNumeros+="8";
        convertirDivisas();
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        cadenaNumeros+="9";
        convertirDivisas();
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        cadenaNumeros+="4";
        convertirDivisas();
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        cadenaNumeros+="5";
        convertirDivisas();
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        cadenaNumeros+="6";
        convertirDivisas();
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        cadenaNumeros+="1";
        convertirDivisas();
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        cadenaNumeros+="2";
        convertirDivisas();
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        cadenaNumeros+="3";
        convertirDivisas();
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        cadenaNumeros+="0";
        convertirDivisas();
    }//GEN-LAST:event_boton0ActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        if(punto==true){
            if(cadenaNumeros==""){
                cadenaNumeros+="0.";
                convertirDivisas();
            }
            else{
                cadenaNumeros+=".";
                convertirDivisas();
            }
            etiquetaES.setText(cadenaNumeros);
        }

        punto=false;
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void comboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox2ActionPerformed
        switch (comboBox2.getSelectedIndex())
        {
            case 0:
                if(cadenaNumeros!=""){
                  convertirDivisas();  
                }
                else{
                   cadenaNumeros="0";
                    convertirDivisas();
                    cadenaNumeros=""; 
                }                
                break;
            case 1:
                if(cadenaNumeros!=""){
                  convertirDivisas();  
                }
                else{
                   cadenaNumeros="0";
                    convertirDivisas();
                    cadenaNumeros=""; 
                }
                break;
            case 2:
                if(cadenaNumeros!=""){
                  convertirDivisas();  
                }
                else{
                   cadenaNumeros="0";
                    convertirDivisas();
                    cadenaNumeros=""; 
                }
                break;
            case 3:
                if(cadenaNumeros!=""){
                  convertirDivisas();  
                }
                else{
                   cadenaNumeros="0";
                    convertirDivisas();
                    cadenaNumeros=""; 
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_comboBox2ActionPerformed

    private void comboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox1ActionPerformed
        switch (comboBox1.getSelectedIndex())
        {
            case 0:
                if(cadenaNumeros!=""){
                  convertirDivisas();  
                }
                else{
                   cadenaNumeros="0";
                    convertirDivisas();
                    cadenaNumeros=""; 
                }
                break;
            case 1:
                if(cadenaNumeros!=""){
                  convertirDivisas();  
                }
                else{
                   cadenaNumeros="0";
                    convertirDivisas();
                    cadenaNumeros=""; 
                }
                break;
            case 2:
                if(cadenaNumeros!=""){
                  convertirDivisas();  
                }
                else{
                   cadenaNumeros="0";
                    convertirDivisas();
                    cadenaNumeros=""; 
                }
                break;
            case 3:
                if(cadenaNumeros!=""){
                  convertirDivisas();  
                }
                else{
                   cadenaNumeros="0";
                    convertirDivisas();
                    cadenaNumeros=""; 
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_comboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(convertidordeDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(convertidordeDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(convertidordeDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(convertidordeDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new convertidordeDivisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonClear;
    private javax.swing.JButton botonPunto;
    private javax.swing.JComboBox<monedas> comboBox1;
    private javax.swing.JComboBox<monedas> comboBox2;
    private javax.swing.JLabel etiquetaES;
    private javax.swing.JLabel etiquetaHistorial;
    private javax.swing.JMenuItem itemCalculadora;
    private javax.swing.JMenuItem itemDivisas;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuUsos;
    private javax.swing.JPanel panelNumeros;
    private javax.swing.JPanel panelPantalla;
    // End of variables declaration//GEN-END:variables
}
