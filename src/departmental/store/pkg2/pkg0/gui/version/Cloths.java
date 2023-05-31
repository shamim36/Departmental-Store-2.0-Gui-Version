/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package departmental.store.pkg2.pkg0.gui.version;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Cloths extends javax.swing.JFrame {

    /**
     * Creates new form Cloths
     */
    public Cloths() {
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

        Shirt = new javax.swing.JCheckBox();
        Tshirt = new javax.swing.JCheckBox();
        Pant = new javax.swing.JCheckBox();
        Panjabi = new javax.swing.JCheckBox();
        PantPrice = new javax.swing.JLabel();
        PunjabiPrice = new javax.swing.JLabel();
        ShirtPrice = new javax.swing.JLabel();
        TshirtPrice = new javax.swing.JLabel();
        AddToCartButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        BuyClothLebel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buy Cloth");
        setPreferredSize(new java.awt.Dimension(800, 500));

        Shirt.setText("Shirt");
        Shirt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShirtActionPerformed(evt);
            }
        });

        Tshirt.setText("T-Shirt");

        Pant.setText("Pant");
        Pant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PantActionPerformed(evt);
            }
        });

        Panjabi.setText("Panjabi");
        Panjabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PanjabiActionPerformed(evt);
            }
        });

        PantPrice.setText("BDT 1500/-");

        PunjabiPrice.setText("BDT 1200/-");

        ShirtPrice.setText("BDT 2000/-");

        TshirtPrice.setText("BDT 1800/-");

        AddToCartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/departmental/store/pkg2/pkg0/gui/version/Add to Cart.png"))); // NOI18N
        AddToCartButton.setText("Buy");
        AddToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartButtonActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/departmental/store/pkg2/pkg0/gui/version/previous button.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/departmental/store/pkg2/pkg0/gui/version/exit.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        BuyClothLebel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        BuyClothLebel.setText("Buy Cloths");
        BuyClothLebel.setBorder(new javax.swing.border.MatteBorder(null));
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tshirt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TshirtPrice))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Pant)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PantPrice))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Panjabi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(PunjabiPrice))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Shirt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ShirtPrice)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(BuyClothLebel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddToCartButton)
                .addGap(326, 326, 326))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BuyClothLebel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Shirt)
                    .addComponent(ShirtPrice))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tshirt)
                    .addComponent(TshirtPrice))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pant)
                    .addComponent(PantPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panjabi)
                    .addComponent(PunjabiPrice))
                .addGap(44, 44, 44)
                .addComponent(AddToCartButton)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShirtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShirtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShirtActionPerformed

    private void PantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PantActionPerformed

    private void PanjabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanjabiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PanjabiActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new WelcomingWindow().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(null, "Exiting!!", "Exit Warning", JOptionPane.WARNING_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void AddToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartButtonActionPerformed
        String[] selectedItem = new String[4];
    double[] selectedPrice = new double[4];
    int i = 0;

    if (Shirt.isSelected()) {
        selectedItem[i] = "Shirt";
        selectedPrice[i] = 2000.0;
        i++;
    }
    if (Tshirt.isSelected()) {
        selectedItem[i] = "T-Shirt";
        selectedPrice[i] = 1800.0;
        i++;
    }
    if (Pant.isSelected()) {
        selectedItem[i] = "Pant";
        selectedPrice[i] = 1500.0;
        i++;
    }
    if (Panjabi.isSelected()) {
        selectedItem[i] = "Panjabi";
        selectedPrice[i] = 1200.0;
        i++;
    }

    if (i == 0) {
        JOptionPane.showMessageDialog(null, "Please select an item to add to Buy", "No Item Selected", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Display the selected items and their prices
    String[] message = new String[i];

    for (int j = 0; j < i; j++) {
        message[j] = "Item: " + selectedItem[j] + "\nPrice: BDT " + selectedPrice[j] + "/-";
    }

    JOptionPane.showMessageDialog(null, message, "Product you have purchased", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_AddToCartButtonActionPerformed

    /**
     * @param args the command line arguments
     */


    private String selectedItem[] = new String[4] ;
    private double selectedPrice[] = new double[4];

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToCartButton;
    private javax.swing.JLabel BuyClothLebel;
    private javax.swing.JCheckBox Panjabi;
    private javax.swing.JCheckBox Pant;
    private javax.swing.JLabel PantPrice;
    private javax.swing.JLabel PunjabiPrice;
    private javax.swing.JCheckBox Shirt;
    private javax.swing.JLabel ShirtPrice;
    private javax.swing.JCheckBox Tshirt;
    private javax.swing.JLabel TshirtPrice;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
