/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Vista;

import Control.Control;
import Modelo.Persona;
import javax.swing.JOptionPane;

public class VModificarPersona extends javax.swing.JFrame {

    public VModificarPersona(Control c) {
        gestor = c;
        setLocationRelativeTo(null);
        initComponents();
    }

    public void init() {
        setVisible(true);

    }

    private void salir() {
        VMenuPersona persona = new VMenuPersona(gestor);
        persona.init();
        this.dispose();
    }

    private boolean vacio() {
        if (campoNombre.getText().isEmpty()
                || campoContraseña.getText().isEmpty()
                || campoCorreo.getText().isEmpty()
                || campoTelefono.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private void buscar() {

        if (campoCedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos Vaciós", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (!gestor.existeEst(campoCedula.getText())) {
            JOptionPane.showMessageDialog(null, "Usuario NO EXISTE", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Persona a = new Persona(0);
            gestor.buscarPer(a, campoCedula.getText());
            campoNombre.setText(a.getNombre());
            campoContraseña.setText(a.getClave());
            campoCorreo.setText(a.getEmail());
            campoTelefono.setText(String.valueOf(a.getTelefono()));
        }
    }

    private void modificar() {

        if (vacio()) {
            JOptionPane.showMessageDialog(null, "Campos Vacíos", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            Persona a = new Persona(0);
            a.setCedula(campoCedula.getText());
            a.setNombre(campoNombre.getText());
            a.setClave(campoContraseña.getText());
            a.setEmail(campoCorreo.getText());
            a.setTelefono(Integer.parseInt(campoTelefono.getText()));

            gestor.actualizaP(a);
            salir();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonModificar = new javax.swing.JButton();
        etiquetaNombre = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        etiquetaContraseña = new javax.swing.JLabel();
        etiquetaTelefono = new javax.swing.JLabel();
        etiquetaCorreo = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoContraseña = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        botonVolver = new javax.swing.JButton();
        etiquetaCedula = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MODIFICAR PERSONA");

        botonModificar.setText("Modificar");
        botonModificar.setToolTipText("");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        etiquetaNombre.setText("Nombre");
        etiquetaNombre.setToolTipText("");

        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FINDD.png"))); // NOI18N
        botonBuscar.setToolTipText("");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        etiquetaContraseña.setText("Contraseña");
        etiquetaContraseña.setToolTipText("");

        etiquetaTelefono.setText("Telefono");
        etiquetaTelefono.setToolTipText("");

        etiquetaCorreo.setText("Correo");
        etiquetaCorreo.setToolTipText("");

        campoCedula.setToolTipText("");

        campoNombre.setToolTipText("");

        campoContraseña.setToolTipText("");

        campoTelefono.setToolTipText("");

        campoCorreo.setToolTipText("");

        botonVolver.setText("Volver");
        botonVolver.setToolTipText("");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        etiquetaCedula.setText("Cedula");
        etiquetaCedula.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonModificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(etiquetaCedula)
                    .addComponent(campoCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaContraseña)
                    .addComponent(campoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaTelefono)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaCorreo)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonModificar)
                    .addComponent(botonVolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        salir();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        modificar();
    }//GEN-LAST:event_botonModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoContraseña;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel etiquetaCedula;
    private javax.swing.JLabel etiquetaContraseña;
    private javax.swing.JLabel etiquetaCorreo;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaTelefono;
    // End of variables declaration//GEN-END:variables
private Control gestor;
}
