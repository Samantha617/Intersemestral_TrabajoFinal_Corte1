/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Mascota;
import modelo.Propietario;

/**
 *
 * @author MI PC
 */
public class VentanaMascota extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMascota
     */
//---------------Constructor de la ventana-------------------------------
    public VentanaMascota() {
        // Inicializa los componentes del formulario
        initComponents();
        setTitle("Registro de Mascotas");
        //ubicacion de la ventana
        setLocationRelativeTo(null);
        // Cierra solo esta ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        limpiarCampos();
        llenarTabla();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreMascota = new javax.swing.JTextField();
        cbEspecie = new javax.swing.JComboBox<>();
        txtEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPropietario = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMascotas = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "..........................Registro de Mascotas.........................", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Gabriola", 0, 36), new java.awt.Color(0, 0, 0))); // NOI18N

        jTabbedPane1.setBackground(new java.awt.Color(51, 255, 153));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(0, 255, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Especie:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Edad:");

        txtNombreMascota.setBackground(new java.awt.Color(0, 153, 102));
        txtNombreMascota.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtNombreMascota.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreMascota.setToolTipText("Ingresa nombre de la mascota");

        cbEspecie.setBackground(new java.awt.Color(0, 153, 102));
        cbEspecie.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cbEspecie.setForeground(new java.awt.Color(0, 0, 0));
        cbEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Gato", "Perro", "Gallina", "Hamster", "Tortuga", "Otro.." }));

        txtEdad.setBackground(new java.awt.Color(0, 153, 102));
        txtEdad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre del Propietario:");

        txtPropietario.setBackground(new java.awt.Color(0, 153, 102));
        txtPropietario.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtPropietario.setForeground(new java.awt.Color(0, 0, 0));

        btnEliminar.setBackground(new java.awt.Color(0, 102, 102));
        btnEliminar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 102, 102));
        btnGuardar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 102, 102));
        btnEditar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 102, 102));
        btnBuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Raza:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Peso:");

        txtRaza.setBackground(new java.awt.Color(0, 153, 102));
        txtRaza.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtRaza.setForeground(new java.awt.Color(0, 0, 0));

        txtPeso.setBackground(new java.awt.Color(0, 153, 102));
        txtPeso.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEdad)
                            .addComponent(cbEspecie, 0, 222, Short.MAX_VALUE)
                            .addComponent(txtNombreMascota)
                            .addComponent(txtRaza)
                            .addComponent(txtPeso))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar)
                                .addGap(29, 29, 29)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 84, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar)
                    .addComponent(btnBuscar))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registro", jPanel3);

        jPanel1.setBackground(new java.awt.Color(102, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "..........................................................Mascotas...........................................................................", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        tblMascotas.setBackground(new java.awt.Color(102, 255, 153));
        tblMascotas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tblMascotas.setForeground(new java.awt.Color(0, 0, 0));
        tblMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre de la Mascota", "Especie", "Edad", "Raza", "Peso", "Nombre del Propietario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMascotas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tabla", jPanel1);

        btnRegresar.setBackground(new java.awt.Color(0, 153, 51));
        btnRegresar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnRegresar.setText("Regresar ");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Ventana1 v1 = new Ventana1();
        v1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nombreBuscado = txtNombreMascota.getText();
        //-------------buscamos la mascota si esta vacio en el campo de texto----------
        if (nombreBuscado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre de la mascota a buscar.");
            return;
        }
        //--------------recorremos las dos listas para conseguir el nombre del propietario y las mascota-------
        for (Propietario propi : Propietario.listaPropietarios) {
            for (Mascota mascota : propi.getListaMascotas()) {

                //----si la mascota se encuentra lleno la informacion en los campos----
                if (mascota.getNombreM().equalsIgnoreCase(nombreBuscado)) {

                    txtNombreMascota.setText(mascota.getNombreM());
                    cbEspecie.setSelectedItem(mascota.getEspecie());
                    txtEdad.setText(String.valueOf(mascota.getEdad()));
                    txtRaza.setText(mascota.getRaza());
                    txtPeso.setText(String.valueOf(mascota.getPeso()));
                    txtPropietario.setText(propi.getNombreP());

                    //-------muestro un mensaje de exito----------
                    JOptionPane.showMessageDialog(this, "Mascota encontrada");
                    return;
                }
            }
        }
        //-----------si no se encuentra la mascota----------------
        JOptionPane.showMessageDialog(this, "Lo sentimos " + nombreBuscado + " No fue encontrado!");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //----------Obtener datos desde los campos de la interfaz----------------
        String nombreM = txtNombreMascota.getText();
        String especie = cbEspecie.getSelectedItem().toString();
        String edadTexto = txtEdad.getText();
        String raza = txtRaza.getText();
        String pesoTexto = txtPeso.getText();
        String nombreP = txtPropietario.getText();

        //------------------miro si los campos estan vacios-----------------------
        if (nombreM.isEmpty() || especie.equals("...") || raza.isEmpty()
            || edadTexto.isEmpty() || pesoTexto.isEmpty() || nombreP.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos",
                "Campos vacios", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //-------------Convertir edad y peso a numero-------------------------
        int edad, peso;
        try {
            edad = Integer.parseInt(edadTexto);
            peso = Integer.parseInt(pesoTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Edad y peso deben ser numeros validos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //------------------Validación del modelo-----------------------------
        String error = Mascota.validarDatosMascota(nombreM, especie, edad, raza, peso, nombreP);
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Validacion", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //----------Buscar al propietario y editar la mascota asociada--------
        for (Propietario propi : Propietario.listaPropietarios) {
            if (propi.getNombreP().equalsIgnoreCase(nombreP)) {

                // Llamamos al metodo del modelo para editar la mascota
                boolean editado = propi.editarMascota(nombreM, especie, edad, raza, peso);

                if (editado) {
                    JOptionPane.showMessageDialog(this, "tu mascota ha sido editada!");
                    limpiarCampos();
                    llenarTabla();
                } else {
                    JOptionPane.showMessageDialog(this, nombreM + " no fue encontrada.");
                }
                return;
            }
        }

        //---------Si no se encontro el propietario-----------------
        JOptionPane.showMessageDialog(null, "Propietario no encontrado.");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // Obtener los valores de los campos del formulario
        String nombreM = txtNombreMascota.getText();
        String especie = cbEspecie.getSelectedItem().toString();
        String edadTexto = txtEdad.getText();
        String raza = txtRaza.getText();
        String pesoTexto = txtPeso.getText();
        String nombreP = txtPropietario.getText();

        //---------------Validar que ningún campo este vacio o tenga error-----------------
        if (nombreM.isEmpty() || especie.equals("...") || raza.isEmpty()
            || edadTexto.isEmpty() || pesoTexto.isEmpty() || nombreP.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos",
                "Campos vacios", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //------------------Validar que la edad y el peso--------------------------------
        int edad, peso;
        try {
            edad = Integer.parseInt(edadTexto);
            peso = Integer.parseInt(pesoTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Edad y peso deben ser números enteros.");
            return;
        }

        //---------------------Validacion del modelo------------------------------------
        String error = Mascota.validarDatosMascota(nombreM, especie, edad, raza, peso, nombreP);
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Validación", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //----------------Buscar si el propietario ya existe en la lista------------
        Propietario propietarioExistente = null;
        for (Propietario p : Propietario.listaPropietarios) {
            if (p.getNombreP().equalsIgnoreCase(nombreP)) {
                propietarioExistente = p;
                break;
            }
        }

        // Si no existe, lo creamos y lo agregamos
        if (propietarioExistente == null) {
            JOptionPane.showMessageDialog(this,
                "No se encontro el propietario... Registrelo primero!",
                "Propietario no encontrado", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //----------------------Crear y guardar la mascota---------------------------
        Mascota mascota = new Mascota(nombreM, especie, edad, raza, peso);
        propietarioExistente.agregarMascota(mascota);

        //----------------------------Limpiar los campos-----------------------------------
        limpiarCampos();

        //-----------------llenar la tabla-------------------------------------------------
        llenarTabla();
        //------------------Mostrar un resumen de confirmación---------------------------
        JOptionPane.showMessageDialog(this,
            "-----------Mascota registrada--------------\n"
            + "Nombre: " + nombreM + "\n"
            + "Especie: " + especie + "\n"
            + "Edad: " + edad + "\n"
            + "Raza: " + raza + "\n"
            + "Peso: " + peso + " kg\n"
            + "Propietario: " + nombreP
        );
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String nombreM = txtNombreMascota.getText();

        if (nombreM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre de la mascota que desea eliminar");
            return;
        }

        for (Propietario propietario : Propietario.listaPropietarios) {
            // Verificamos si la mascota existe antes de confirmar
            if (propietario.existeMascota(nombreM)) {

                //creo una variable para poder confirmar si quiere eliminar la mascota
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quieres eliminar la mascota " + nombreM + "?",
                    "confirmar", JOptionPane.YES_NO_OPTION);

                if (confirmacion == JOptionPane.YES_OPTION) {
                    // Eliminamos
                    propietario.eliminarMascotaPorNombre(nombreM);
                    JOptionPane.showMessageDialog(null, nombreM + " ha sido eliminado");
                    limpiarCampos();
                    llenarTabla();
                } else {
                    JOptionPane.showMessageDialog(null, nombreM + " No se elimino");
                }

                return;
            }
        }
        //----sino encuentra la mascota con ese nombre---------
        JOptionPane.showMessageDialog(null, nombreM + "No fue encontrado");
    }//GEN-LAST:event_btnEliminarActionPerformed

//-----------creo metodo de limpiar campos----------------------
    private void limpiarCampos() {
        txtNombreMascota.setText("");
        cbEspecie.setSelectedIndex(0);
        txtEdad.setText("");
        txtRaza.setText("");
        txtPeso.setText("");
        txtPropietario.setText("");
    }
//------------creo metodo de llenar tabla------------------------

    private void llenarTabla() {

        DefaultTableModel modelo = (DefaultTableModel) tblMascotas.getModel();
        modelo.setRowCount(0); // Limpia la tabla primero

        for (Propietario propi : Propietario.listaPropietarios) {
            for (Mascota masco : propi.getListaMascotas()) {
                modelo.addRow(new Object[]{
                    masco.getNombreM(),
                    masco.getEspecie(),
                    masco.getEdad(),
                    masco.getRaza(),
                    masco.getPeso(),
                    propi.getNombreP()
                });
            }
        }
    }

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
            java.util.logging.Logger.getLogger(VentanaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMascota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbEspecie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblMascotas;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPropietario;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
