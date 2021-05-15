package VENTANA;

import LOGICA.Http;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

import LOGICA.Registro;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/**
 *
 * @author LESLIE MORALES
 */
public class Vista extends JFrame {

    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        pnPrincipal = new javax.swing.JPanel();
        pnRegistro = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblCarrera = new javax.swing.JLabel();
        cmbCarrera = new javax.swing.JComboBox<>();
        lblSala = new javax.swing.JLabel();
        cmbSala = new javax.swing.JComboBox<>();
        pnListaRegistro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONTROL DE ACCESO");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(888, 691));
        setMinimumSize(new java.awt.Dimension(898, 650));
        setUndecorated(true);
        setResizable(false);

        jScrollPane2.setMaximumSize(new java.awt.Dimension(888, 691));

        pnPrincipal.setMaximumSize(new java.awt.Dimension(888, 691));

        pnRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACIÓN DEL ESTUDIANTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        pnRegistro.setMaximumSize(new java.awt.Dimension(888, 691));
        pnRegistro.setName(""); // NOI18N

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtCodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombre.setText("Nombres:");

        lblCodigo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCodigo.setText("Codigo:");

        btnEnviar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        lblApellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblApellido.setText("Apellido:");

        txtApellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        lblCarrera.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCarrera.setText("Carrera:");

        cmbCarrera.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cmbCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniería_de_Sistemas", "Ingeniería_de_Alimentos", "Ingeniería_Quimica", "Ingeniería_Civil", " " }));

        lblSala.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSala.setText("Sala de:");

        cmbSala.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cmbSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informatica", "Tutoria", "Estudio", "Entretenimiento" }));

        javax.swing.GroupLayout pnRegistroLayout = new javax.swing.GroupLayout(pnRegistro);
        pnRegistro.setLayout(pnRegistroLayout);
        pnRegistroLayout.setHorizontalGroup(
            pnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegistroLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(pnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRegistroLayout.createSequentialGroup()
                        .addGroup(pnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellido)
                            .addComponent(lblNombre)
                            .addComponent(lblCodigo)
                            .addComponent(lblCarrera)
                            .addComponent(lblSala))
                        .addGap(59, 59, 59)
                        .addGroup(pnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo)
                            .addComponent(txtApellido)
                            .addComponent(txtNombre)
                            .addComponent(cmbCarrera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbSala, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegistroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnRegistroLayout.setVerticalGroup(
            pnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegistroLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(7, 7, 7)
                .addGroup(pnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarrera)
                    .addComponent(cmbCarrera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSala)
                    .addComponent(cmbSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEnviar)
                .addContainerGap())
        );

        pnListaRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTA DE REGISTRO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        pnListaRegistro.setMaximumSize(new java.awt.Dimension(888, 691));

        tabla.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Codigo", "Carrera", "Sala", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(2).setMinWidth(3);
        }

        javax.swing.GroupLayout pnListaRegistroLayout = new javax.swing.GroupLayout(pnListaRegistro);
        pnListaRegistro.setLayout(pnListaRegistroLayout);
        pnListaRegistroLayout.setHorizontalGroup(
            pnListaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
            .addGroup(pnListaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListaRegistroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)))
        );
        pnListaRegistroLayout.setVerticalGroup(
            pnListaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
            .addGroup(pnListaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnListaRegistroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addComponent(pnListaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnListaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(pnPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * SE ENCARGA DE LIMPIAR LOS DATOS INGRESADOS
     */
    public void limpiartexto() {
        txtNombre.setText("");
        txtCodigo.setText("");
        txtApellido.setText("");
        cmbSala.setSelectedIndex(0);
        cmbCarrera.setSelectedIndex(0);

    }

    /**
     * SE ENCARGA DE LIMPIAR LOS DATOS DE LA TABLA
     *
     * @param table
     */
    public void limpiarTabla(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }

    /**
     * SE ENCARGA DE RELLENAR LA TABLA CON LOS DATOS OBTENIDOS DE LA BASE DE
     * DATOS
     *
     * @param cts
     * @param table
     */
    public void actualizarTabla(ArrayList<Registro> cts, JTable table) {

        limpiarTabla(table);
        if (cts.size() > 0) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            String nombre = null, codigo = null, fecha = null, carrera = null, apellido = null, sala = null;

            for (Registro reg : cts) {
                nombre = reg.getNombre();
                apellido = reg.getApellido();
                codigo = reg.getCodigo();
                carrera = reg.getCarrera();
                sala = reg.getSala();
                fecha = reg.getFecha();

                model.addRow(new Object[]{nombre, apellido, codigo, carrera, sala, fecha});
            }
        }
    }

    /**
     * RECIBE LOS DATOS INGRESADOS EN LA VISTA, LOS ENVÍA A LA BASE DE DATOS Y
     * LOS MUESTRA EN LA TABLA
     *
     * @param evt
     */
    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if (!txtNombre.getText().isEmpty() && !txtCodigo.getText().isEmpty() && !txtApellido.getText().isEmpty()) {
            Http a = new Http();
            a.enviar(txtNombre.getText(), txtApellido.getText(), txtCodigo.getText(), cmbCarrera.getSelectedItem().toString(), cmbSala.getSelectedItem().toString());
            cargarDatos();
            limpiartexto();
            JOptionPane.showMessageDialog(this, "Registro guardado!");

        } else {
            JOptionPane.showMessageDialog(this, "FALTAN DATOS!");
        }
    }//GEN-LAST:event_btnEnviarActionPerformed
    /**
     * SE ENCARGA DE REQUERIR LA LISTA DE REGISTROS A TRAVES DE HTTP A LA BASE
     * DE DATOS
     */
    private void cargarDatos() {
        try {
            Http a = new Http();
            buscar(a.listar());
        } catch (InterruptedException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TimeoutException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * SE ENCARGA DE BUSCAR UN REGISTRO EN LA LISTA
     *
     * @param usr
     */
    private void buscar(List<Registro> usr) {
        limpiarTabla(tabla);
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();

        for (Registro i : usr) {
            model.addRow(new Object[]{i.getNombre(), i.getApellido(), i.getCodigo(), i.getCarrera(), i.getSala(), i.getFecha()});

        }

    }

    /**
     * SE ENCARGA DE VERIFICAR QUE LOS DATOS SUMINISTRADOS SEAN NUMERICOS
     *
     * @param evt
     */
    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        SwingUtilities.invokeLater(() -> {
            new Vista().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JComboBox<String> cmbCarrera;
    private javax.swing.JComboBox<String> cmbSala;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSala;
    private javax.swing.JPanel pnListaRegistro;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JPanel pnRegistro;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
