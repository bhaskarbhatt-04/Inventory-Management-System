
import dao.ConnectorProvider;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author bhask
 */
public class ManageProduct extends javax.swing.JFrame {

    private int productPk = 0;
    private int totalQuantity = 0;

    /**
     * Creates new form ManageProduct
     */
    public ManageProduct() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void getAllCategory() {
        try {
            Connection conn = ConnectorProvider.getCon();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from category");
            jComboBox1.removeAllItems();
            while (rs.next()) {
                jComboBox1.addItem(rs.getString("category_pk") + "-" + rs.getString("name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private boolean validateFields(String formType) {
        if (formType.equals("edit") && !jTextField1.getText().equals("") && !jTextField3.getText().equals("") && !jTextField4.getText().equals("")) {
            return false;
        } else if (formType.equals("new") && !jTextField1.getText().equals("") && !jTextField2.getText().equals("") && !jTextField3.getText().equals("") && !jTextField4.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Manage Products");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 330, -1));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Quantity", "Price", "Description", "Category ID", "Category Name"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 690, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, -1, -1));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 188, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Quantity");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, -1, -1));

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 330, 188, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 360, -1, -1));

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, 188, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Description");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 420, -1, -1));

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 450, 188, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Category");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 550, -1, 20));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 550, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 590, -1, -1));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 590, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 188, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/green-background.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        getAllCategory();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        try {
            Connection conn = ConnectorProvider.getCon();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from product inner join category on product.category_fk=category.category_pk");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("product_pk"), rs.getString("name"), rs.getString("quantity"), rs.getString("price"), rs.getString("description"), rs.getString("category_fk"), rs.getString(8)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        jButton2.setEnabled(false);

    }//GEN-LAST:event_formComponentShown

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        new ManageProduct().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = jTextField1.getText();
        String quantity = jTextField2.getText();
        String price = jTextField3.getText();
        String description = jTextField4.getText();
        String category = (String) jComboBox1.getSelectedItem();
        String categoryId[] = category.split("-", 0);
        if (validateFields("new")) {
            JOptionPane.showMessageDialog(null, "All fields are required!");
        } else {
            try {
                Connection conn = ConnectorProvider.getCon();
                PreparedStatement ps = conn.prepareStatement("insert into product (name,quantity,price,description,category_fk) values(?,?,?,?,?)");
                ps.setString(1, name);
                ps.setString(2, quantity);
                ps.setString(3, price);
                ps.setString(4, description);
                ps.setString(5, categoryId[0]);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Product added successfully!");
                setVisible(false);
                new ManageProduct().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String id = model.getValueAt(index, 0).toString();
        productPk = Integer.parseInt(id);

        String name = model.getValueAt(index, 1).toString();
        jTextField1.setText(name);

        String quantity = model.getValueAt(index, 2).toString();
        totalQuantity = 0;
        jTextField2.setText(quantity);
        totalQuantity = Integer.parseInt(quantity);

        String price = model.getValueAt(index, 3).toString();
        jTextField3.setText(price);

        String description = model.getValueAt(index, 4).toString();
        jTextField4.setText(description);

        jComboBox1.removeAllItems();
        String categoryId = model.getValueAt(index, 5).toString();
        String categoryName = model.getValueAt(index, 6).toString();
        jComboBox1.addItem(categoryId + "-" + categoryName);

        try {
            Connection conn = ConnectorProvider.getCon();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from category");

            while (rs.next()) {
                if (Integer.parseInt(categoryId) != rs.getInt(1)) {
                    jComboBox1.addItem(rs.getString("category_pk") + "-" + rs.getString("name"));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        jButton1.setEnabled(false);
        jButton2.setEnabled(true);


    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String name = jTextField1.getText();
        String quantity = jTextField2.getText();
        String price = jTextField3.getText();
        String description = jTextField4.getText();
        String category = (String) jComboBox1.getSelectedItem();
        String categoryId[] = category.split("-", 0);
        if (validateFields("edit")) {
            JOptionPane.showMessageDialog(null, "All fields are required!");
        } else {
            try {
                if(!quantity.equals("")){
                    totalQuantity = totalQuantity+Integer.parseInt(quantity);
                }
                Connection conn = ConnectorProvider.getCon();
                PreparedStatement ps = conn.prepareStatement("update product set name=?,quantity=?,price=?,description=?,category_fk=? where product_pk=?");
                ps.setString(1, name);
                ps.setInt(2, totalQuantity);
                ps.setString(3, price);
                ps.setString(4, description);
                ps.setString(5, categoryId[0]);
                ps.setInt(6, productPk);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Product updated successfully!");
                setVisible(false);
                new ManageProduct().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
