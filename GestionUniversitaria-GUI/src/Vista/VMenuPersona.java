/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Vista;

import Control.Control;

public class VMenuPersona extends javax.swing.JFrame {

    public VMenuPersona(Control c) {
        gestor = c;
        setLocationRelativeTo(null);
        initComponents();
    }

    private void salir() {
        VAdministrador admi = new VAdministrador(gestor);
        admi.init();
        this.dispose();
    }

    public void init() {
        setVisible(true);

    }

    private void eliminarPersona() {
        VEliminarPersona deletePersona = new VEliminarPersona(gestor);
        deletePersona.init();
        this.dispose();
    }

    private void modificarPersona() {
        VModificarPersona modPersona = new VModificarPersona(gestor);
        modPersona.init();
        this.dispose();
    }

    private void agregar(int x) {
        if (x == 1) {
            VAgregarEstudiante addEstudiante = new VAgregarEstudiante(gestor);
            addEstudiante.init();
        } else if (x == 2) {
            VAgregarProfesor addProfesor = new VAgregarProfesor(gestor);
            addProfesor.init();
        } else if (x == 3) {
            VAgregarMatriculador addMatriculador = new VAgregarMatriculador(gestor);
            addMatriculador.init();
        } else {
            VAgregarAdministrador addAdmi = new VAgregarAdministrador(gestor);
            addAdmi.init();
        }

        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAgregarEstudiante = new javax.swing.JButton();
        botonAgregarAdministrador = new javax.swing.JButton();
        botonEliminarPersona = new javax.swing.JButton();
        botonBuscarPersona = new javax.swing.JButton();
        botonModificarPersona = new javax.swing.JButton();
        botonAgregarProfesor = new javax.swing.JButton();
        botonAgregarMatriculador = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENÚ PERSONA");
        setMinimumSize(new java.awt.Dimension(478, 487));
        setResizable(false);
        getContentPane().setLayout(null);

        botonAgregarEstudiante.setText("Agregar Estudiante");
        botonAgregarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregarEstudiante);
        botonAgregarEstudiante.setBounds(0, 0, 160, 88);

        botonAgregarAdministrador.setText("Agregar Administrador");
        botonAgregarAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarAdministradorActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregarAdministrador);
        botonAgregarAdministrador.setBounds(0, 180, 160, 88);

        botonEliminarPersona.setText("Eliminar Persona");
        botonEliminarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarPersonaActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminarPersona);
        botonEliminarPersona.setBounds(0, 360, 160, 88);

        botonBuscarPersona.setText("Buscar Persona");
        botonBuscarPersona.setToolTipText("");
        botonBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarPersonaActionPerformed(evt);
            }
        });
        getContentPane().add(botonBuscarPersona);
        botonBuscarPersona.setBounds(160, 270, 151, 88);

        botonModificarPersona.setText("Modificar Persona");
        botonModificarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarPersonaActionPerformed(evt);
            }
        });
        getContentPane().add(botonModificarPersona);
        botonModificarPersona.setBounds(160, 90, 151, 88);

        botonAgregarProfesor.setText("Agregar Profesor");
        botonAgregarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarProfesorActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregarProfesor);
        botonAgregarProfesor.setBounds(310, 0, 160, 88);

        botonAgregarMatriculador.setText("Agregar Matriculador");
        botonAgregarMatriculador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarMatriculadorActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregarMatriculador);
        botonAgregarMatriculador.setBounds(310, 180, 160, 88);

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir);
        botonSalir.setBounds(310, 360, 160, 88);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarEstudianteActionPerformed
        agregar(1);
    }//GEN-LAST:event_botonAgregarEstudianteActionPerformed

    private void botonAgregarAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarAdministradorActionPerformed
        agregar(4);
    }//GEN-LAST:event_botonAgregarAdministradorActionPerformed

    private void botonEliminarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarPersonaActionPerformed
        eliminarPersona();
    }//GEN-LAST:event_botonEliminarPersonaActionPerformed

    private void botonBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarPersonaActionPerformed

    }//GEN-LAST:event_botonBuscarPersonaActionPerformed

    private void botonModificarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarPersonaActionPerformed
        modificarPersona();
    }//GEN-LAST:event_botonModificarPersonaActionPerformed

    private void botonAgregarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarProfesorActionPerformed
        agregar(2);
    }//GEN-LAST:event_botonAgregarProfesorActionPerformed

    private void botonAgregarMatriculadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarMatriculadorActionPerformed
        agregar(3);
    }//GEN-LAST:event_botonAgregarMatriculadorActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        salir();
    }//GEN-LAST:event_botonSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarAdministrador;
    private javax.swing.JButton botonAgregarEstudiante;
    private javax.swing.JButton botonAgregarMatriculador;
    private javax.swing.JButton botonAgregarProfesor;
    private javax.swing.JButton botonBuscarPersona;
    private javax.swing.JButton botonEliminarPersona;
    private javax.swing.JButton botonModificarPersona;
    private javax.swing.JButton botonSalir;
    // End of variables declaration//GEN-END:variables
private Control gestor;
}
