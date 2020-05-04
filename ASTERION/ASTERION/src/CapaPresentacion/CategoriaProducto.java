/*
 * CategoriaProducto.java
 *
 * Created on 10 de enero de 2007, 08:49 PM
 */

package CapaPresentacion;
import javax.swing.*;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import javax.sql.*;
import java.sql.*;
import javax.swing.table.*;
import javax.swing.event.*;
import java.util.*;
import CapaNegocios.*;
import CapaDatos.*;

/**
 *
 * @author  Gabriela Hernández
 */
public class CategoriaProducto extends javax.swing.JFrame {
    
    /** Creates new form CategoriaProducto */
    public CategoriaProducto() {
        initComponents();
        cConexion MiConexion = new cConexion();
        MiConexion.Conectame();
    }
    
    int iPercCalidad;
    int iTolCalidad;
    int iPercCantidad;
    int iTolSupCantidad;
    int iTolInfCantidad;
    int iPercEntrega;
    int iTolSupEntrega;
    int iTolInfEntrega;
    int iPercDoc;
    
    public void LimpiaForma()
   {
       tbIdCatProd.setText("");
       tbNomCatProd.setText("");
       tbPercCalidad.setText("");
       tbTolCalidad.setText("");
       tbPercCantidad.setText("");
       tbTolSupCantidad.setText("");
       tbTolInfCantidad.setText("");
       tbPercEntrega.setText("");
       tbTolSupEntrega.setText("");
       tbTolInfEntrega.setText("");
       tbPercDoc.setText("");
   }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        btConsultar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        tbIdCatProd = new javax.swing.JTextField();
        tbNomCatProd = new javax.swing.JTextField();
        tbPercCalidad = new javax.swing.JTextField();
        tbTolCalidad = new javax.swing.JTextField();
        tbPercCantidad = new javax.swing.JTextField();
        tbTolSupCantidad = new javax.swing.JTextField();
        tbTolInfCantidad = new javax.swing.JTextField();
        tbPercEntrega = new javax.swing.JTextField();
        tbTolSupEntrega = new javax.swing.JTextField();
        tbTolInfEntrega = new javax.swing.JTextField();
        tbPercDoc = new javax.swing.JTextField();
        lbSumaPorcentajes = new javax.swing.JLabel();
        lbIdCatProd = new javax.swing.JLabel();
        lbNomCatProd = new javax.swing.JLabel();
        lbPorcentajesParaEvaluacion = new javax.swing.JLabel();
        lbPercCalidad = new javax.swing.JLabel();
        lbTolCalidad = new javax.swing.JLabel();
        lbPercCantidad = new javax.swing.JLabel();
        lbTolSupCantidad = new javax.swing.JLabel();
        lbTolInfCantidad = new javax.swing.JLabel();
        lbPercEntrega = new javax.swing.JLabel();
        lbTolSupEntrega = new javax.swing.JLabel();
        lbTolInfEntrega = new javax.swing.JLabel();
        lbPercDoc = new javax.swing.JLabel();
        jspPanel = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Categor\u00edas de productos");
        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        lbIdCatProd.setText("CLAVE:");

        lbNomCatProd.setText("NOMBRE:");

        lbPorcentajesParaEvaluacion.setText("PORCENTAJES PARA EVALUACI\u00d3N:");

        lbPercCalidad.setText("CALIDAD:");

        lbTolCalidad.setText("TOLERANCIA:");

        lbPercCantidad.setText("CANTIDAD:");

        lbTolSupCantidad.setText("TOLERANCIA SUP:");

        lbTolInfCantidad.setText("INF:");

        lbPercEntrega.setText("TIEMPO DE ENTREGA:");

        lbTolSupEntrega.setText("TOLERANCIA SUP:");

        lbTolInfEntrega.setText("INF:");

        lbPercDoc.setText("DOCUMENTACION");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jspPanel.setViewportView(jTextArea1);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btConsultar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btModificar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btGuardar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(54, 54, 54)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(lbIdCatProd)
                            .add(lbNomCatProd))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(tbIdCatProd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(tbNomCatProd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 213, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(145, 145, 145))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(lbPercCalidad)
                            .add(lbPercCantidad)
                            .add(lbPercEntrega)
                            .add(lbPercDoc))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lbPorcentajesParaEvaluacion)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, lbSumaPorcentajes, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, tbPercCalidad)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, tbPercCantidad)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, tbPercEntrega)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, tbPercDoc, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                                .add(16, 16, 16)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(lbTolSupCantidad)
                                    .add(lbTolCalidad)
                                    .add(lbTolSupEntrega))
                                .add(13, 13, 13)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(tbTolSupEntrega)
                                    .add(tbTolSupCantidad)
                                    .add(tbTolCalidad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(13, 13, 13)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(lbTolInfCantidad)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(tbTolInfCantidad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(lbTolInfEntrega)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(tbTolInfEntrega, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                    .add(jspPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 359, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(103, 103, 103)
                        .add(btConsultar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(108, 108, 108)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(lbIdCatProd)
                            .add(tbIdCatProd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(lbNomCatProd)
                            .add(tbNomCatProd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(24, 24, 24)))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(btModificar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btGuardar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lbPorcentajesParaEvaluacion)
                        .add(13, 13, 13)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(lbPercCalidad)
                            .add(tbPercCalidad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(lbTolCalidad)
                            .add(tbTolCalidad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(lbPercCantidad)
                            .add(tbPercCantidad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(lbTolSupCantidad)
                            .add(tbTolSupCantidad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(lbTolInfCantidad)
                            .add(tbTolInfCantidad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lbPercEntrega)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(tbPercEntrega, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(tbTolSupEntrega, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(lbTolSupEntrega)
                                .add(lbTolInfEntrega)
                                .add(tbTolInfEntrega, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(lbPercDoc)
                            .add(tbPercDoc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lbSumaPorcentajes, 0, 0, Short.MAX_VALUE)))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(15, 15, 15)
                        .add(jspPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(19, 19, 19))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
// TODO add your handling code here:
        iPercCalidad = Integer.parseInt(tbPercCalidad.getText());
        iTolCalidad = Integer.parseInt(tbTolCalidad.getText());
        iPercCantidad = Integer.parseInt(tbPercCantidad.getText());
        iTolSupCantidad = Integer.parseInt(tbTolSupCantidad.getText());
        iTolInfCantidad = Integer.parseInt(tbTolInfCantidad.getText());
        iPercEntrega = Integer.parseInt(tbPercEntrega.getText());
        iTolSupEntrega = Integer.parseInt(tbTolSupEntrega.getText());
        iTolInfEntrega = Integer.parseInt(tbTolInfEntrega.getText());
        iPercDoc = Integer.parseInt(tbPercDoc.getText());
        cCat_Prod MiCategoria = new cCat_Prod(tbIdCatProd.getText(),tbNomCatProd.getText(),
                                              iPercCalidad,iTolCalidad,
                                              iPercCantidad, iTolSupCantidad, iTolInfCantidad,
                                              iPercEntrega, iTolSupEntrega, iTolInfEntrega, iPercDoc);
        MiCategoria.GuardarCat_Prod();
        btGuardar.setEnabled(false);
        LimpiaForma();
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
// TODO add your handling code here:
        
        iPercCalidad = Integer.parseInt(tbPercCalidad.getText());
        iTolCalidad = Integer.parseInt(tbTolCalidad.getText());
        iPercCantidad = Integer.parseInt(tbPercCantidad.getText());
        iTolSupCantidad = Integer.parseInt(tbTolSupCantidad.getText());
        iTolInfCantidad = Integer.parseInt(tbTolInfCantidad.getText());
        iPercEntrega = Integer.parseInt(tbPercEntrega.getText());
        iTolSupEntrega = Integer.parseInt(tbTolSupEntrega.getText());
        iTolInfEntrega = Integer.parseInt(tbTolInfEntrega.getText());
        iPercDoc = Integer.parseInt(tbPercDoc.getText());
        cCat_Prod MiCategoria = new cCat_Prod(tbIdCatProd.getText(),tbNomCatProd.getText(),
                                              iPercCalidad,iTolCalidad,
                                              iPercCantidad, iTolSupCantidad, iTolInfCantidad,
                                              iPercEntrega, iTolSupEntrega, iTolInfEntrega, iPercDoc);
        MiCategoria.ModificarCat_Prod();
        btModificar.setEnabled(false);
    }//GEN-LAST:event_btModificarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
// TODO add your handling code here:
        Busqueda formaBusqueda = new  Busqueda();
        formaBusqueda.setVisible(true);
    }//GEN-LAST:event_btConsultarActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoriaProducto().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane jspPanel;
    private javax.swing.JLabel lbIdCatProd;
    private javax.swing.JLabel lbNomCatProd;
    private javax.swing.JLabel lbPercCalidad;
    private javax.swing.JLabel lbPercCantidad;
    private javax.swing.JLabel lbPercDoc;
    private javax.swing.JLabel lbPercEntrega;
    private javax.swing.JLabel lbPorcentajesParaEvaluacion;
    private javax.swing.JLabel lbSumaPorcentajes;
    private javax.swing.JLabel lbTolCalidad;
    private javax.swing.JLabel lbTolInfCantidad;
    private javax.swing.JLabel lbTolInfEntrega;
    private javax.swing.JLabel lbTolSupCantidad;
    private javax.swing.JLabel lbTolSupEntrega;
    private javax.swing.JTextField tbIdCatProd;
    private javax.swing.JTextField tbNomCatProd;
    private javax.swing.JTextField tbPercCalidad;
    private javax.swing.JTextField tbPercCantidad;
    private javax.swing.JTextField tbPercDoc;
    private javax.swing.JTextField tbPercEntrega;
    private javax.swing.JTextField tbTolCalidad;
    private javax.swing.JTextField tbTolInfCantidad;
    private javax.swing.JTextField tbTolInfEntrega;
    private javax.swing.JTextField tbTolSupCantidad;
    private javax.swing.JTextField tbTolSupEntrega;
    // End of variables declaration//GEN-END:variables
    
}
