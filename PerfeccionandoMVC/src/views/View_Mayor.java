/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author PC3
 */
public class View_Mayor extends javax.swing.JPanel {

    /**
     * Creates new form View_Mayor
     */
    public View_Mayor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_numero1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jl_numero3 = new javax.swing.JLabel();
        jtf_numero1 = new javax.swing.JTextField();
        jtf_numero2 = new javax.swing.JTextField();
        jtf_numero3 = new javax.swing.JTextField();
        jl_mayor = new javax.swing.JLabel();
        jtf_mayor = new javax.swing.JTextField();
        jbtn_calcular = new javax.swing.JButton();
        jbtn_limpiar = new javax.swing.JButton();

        jl_numero1.setText("Numero1");

        jLabel1.setText("Numero2");

        jl_numero3.setText("Numero3");

        jtf_numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_numero1ActionPerformed(evt);
            }
        });

        jl_mayor.setText("Numero mayor");

        jbtn_calcular.setText("Calcular");

        jbtn_limpiar.setText("Limpiar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn_calcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtn_limpiar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jl_mayor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf_mayor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_numero3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jl_numero1)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_numero2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jtf_numero1)
                            .addComponent(jtf_numero3)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_numero1)
                    .addComponent(jtf_numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_numero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_numero3)
                    .addComponent(jtf_numero3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_calcular)
                    .addComponent(jbtn_limpiar))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_mayor)
                    .addComponent(jtf_mayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_numero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_numero1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JButton jbtn_calcular;
    public javax.swing.JButton jbtn_limpiar;
    public javax.swing.JLabel jl_mayor;
    public javax.swing.JLabel jl_numero1;
    public javax.swing.JLabel jl_numero3;
    public javax.swing.JTextField jtf_mayor;
    public javax.swing.JTextField jtf_numero1;
    public javax.swing.JTextField jtf_numero2;
    public javax.swing.JTextField jtf_numero3;
    // End of variables declaration//GEN-END:variables
}
