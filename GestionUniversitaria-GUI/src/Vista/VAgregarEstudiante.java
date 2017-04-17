/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Vista;

import Control.Control;
import javax.swing.JOptionPane;

public class VAgregarEstudiante extends javax.swing.JFrame {

    public VAgregarEstudiante(Control c) {
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
        if (campoCed.getText() == ""
                || campoNombre.getText() == ""
                || campoContraseña.getText() == ""
                || campoCorreo.getText() == ""
                || campoTel.getText() == ""
                || campoFechNac.getText() == ""
                || campoCodCarrera.getText() == "") {
            return true;
        } else {
            return false;
        }
    }

    private void agregar() {
        if (vacio()) {
            JOptionPane.showMessageDialog(null, "Campos vacios", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            if (!gestor.existeCarrera(campoCodCarrera.getText())) {
                JOptionPane.showMessageDialog(null, "Carrera NO EXISTE", "Error", JOptionPane.ERROR_MESSAGE);

            } else if (gestor.existeEst(campoCed.getText())) {
                JOptionPane.showMessageDialog(null, "Estudiante YA EXISTE ", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                int aux = Integer.parseInt(campoTel.getText());
                gestor.agregarEstudiante(campoNombre.getText(), campoCed.getText(),
                        campoFechNac.getText(), aux, campoCorreo.getText(), campoContraseña.getText(), campoCodCarrera.getText());
                salir();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoFechNac = new javax.swing.JTextField();
        etiquetaCorreo = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoCodCarrera = new javax.swing.JTextField();
        campoCed = new javax.swing.JTextField();
        etiquetaFecnNac = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        etiquetaCodCarrera = new javax.swing.JLabel();
        etiquetaCed = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        campoContraseña = new javax.swing.JTextField();
        etiquetaContraseña = new javax.swing.JLabel();
        campoTel = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        etiquetaTel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGREGAR ESTUDIANTE");
        setResizable(false);

        etiquetaCorreo.setText("Correo");

        etiquetaFecnNac.setText("Fecha Nacimiento");

        etiquetaNombre.setText("Nombre");

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        etiquetaCodCarrera.setText("Código Carrera");

        etiquetaCed.setText("Cédula");

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        etiquetaContraseña.setText("Contraseña");

        etiquetaTel.setText("Teléfono");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAgregar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(etiquetaFecnNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaCed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaTel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaContraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaCodCarrera, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCed, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoFechNac, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(campoCodCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCed)
                    .addComponent(campoCed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaContraseña)
                    .addComponent(campoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTel)
                    .addComponent(campoTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCorreo)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaFecnNac)
                    .addComponent(campoFechNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCodCarrera)
                    .addComponent(campoCodCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver)
                    .addComponent(botonAgregar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        salir();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        agregar();
    }//GEN-LAST:event_botonAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField campoCed;
    private javax.swing.JTextField campoCodCarrera;
    private javax.swing.JTextField campoContraseña;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoFechNac;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTel;
    private javax.swing.JLabel etiquetaCed;
    private javax.swing.JLabel etiquetaCodCarrera;
    private javax.swing.JLabel etiquetaContraseña;
    private javax.swing.JLabel etiquetaCorreo;
    private javax.swing.JLabel etiquetaFecnNac;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaTel;
    // End of variables declaration//GEN-END:variables
private Control gestor;
}
