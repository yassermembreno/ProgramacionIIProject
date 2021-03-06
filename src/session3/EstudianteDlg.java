/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3;

import session2.Estudiante;
import session2.EstudianteModel;

/**
 *
 * @author Docente
 */
public class EstudianteDlg extends java.awt.Dialog {
    private EstudianteModel emodel;
    /**
     * Creates new form EstudianteDlg
     */
    public EstudianteDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @param emodel
     */

    public void setEmodel(EstudianteModel emodel) {
        this.emodel = emodel;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        btnsave = new java.awt.Button();
        btncancel = new java.awt.Button();
        panel2 = new java.awt.Panel();
        label1 = new java.awt.Label();
        txtid = new java.awt.TextField();
        label2 = new java.awt.Label();
        txtname = new java.awt.TextField();
        label3 = new java.awt.Label();
        txtlastname = new java.awt.TextField();
        label4 = new java.awt.Label();
        txtcarnet = new java.awt.TextField();
        label5 = new java.awt.Label();
        txtage = new java.awt.TextField();

        setTitle("Dialogo Estudiante");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(153, 153, 153));
        panel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnsave.setLabel("Guardar");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        panel1.add(btnsave);

        btncancel.setLabel("Cancelar");
        panel1.add(btncancel);

        add(panel1, java.awt.BorderLayout.SOUTH);

        panel2.setLayout(new java.awt.GridLayout(5, 2, 5, 5));

        label1.setAlignment(java.awt.Label.RIGHT);
        label1.setText("ID");
        panel2.add(label1);
        panel2.add(txtid);

        label2.setAlignment(java.awt.Label.RIGHT);
        label2.setText("NOMBRES");
        panel2.add(label2);
        panel2.add(txtname);

        label3.setAlignment(java.awt.Label.RIGHT);
        label3.setText("APELLIDOS");
        panel2.add(label3);
        panel2.add(txtlastname);

        label4.setAlignment(java.awt.Label.RIGHT);
        label4.setText("CARNET");
        panel2.add(label4);
        panel2.add(txtcarnet);

        label5.setAlignment(java.awt.Label.RIGHT);
        label5.setText("EDAD");
        panel2.add(label5);
        panel2.add(txtage);

        add(panel2, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(404, 245));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
       int id,age;
       String name,lastname,carnet;
       
       id = Integer.parseInt(txtid.getText());
       name = txtname.getText();
       lastname = txtlastname.getText();
       carnet = txtcarnet.getText();
       age = Integer.parseInt(txtage.getText());
       
       Estudiante e = new Estudiante(id,name,lastname,carnet,age);
       emodel.add(e);
       this.dispose();
    }//GEN-LAST:event_btnsaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EstudianteDlg dialog = new EstudianteDlg(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btncancel;
    private java.awt.Button btnsave;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.TextField txtage;
    private java.awt.TextField txtcarnet;
    private java.awt.TextField txtid;
    private java.awt.TextField txtlastname;
    private java.awt.TextField txtname;
    // End of variables declaration//GEN-END:variables
}
