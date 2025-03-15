package myapp.with.mysql;
import com.mysql.jdbc.PreparedStatement;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Asp Prothes
 */
public class Main_Window extends javax.swing.JFrame {

    String ImagePath = null;

    // Set Sql Connection
    public Connection getConnection() {
        Connection conn = null;
        String url = "jdbc:mysql://localhost/javawithmysql";
        String user = "root";
        String password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Connected");
            return conn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Not Connected");
            return null;
        }
    }
    
    
    // Resize Images ================
    public ImageIcon ResizeImage(String imagePath, byte[] pic) {
        ImageIcon myImg = null;
        if (imagePath != null) {
            myImg = new ImageIcon(imagePath);
        } else {
            myImg = new ImageIcon(pic);
        }
        Image img = myImg.getImage();
        Image img2 = img.getScaledInstance(imgBox.getWidth(), imgBox.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;
    }

    // Check Input FIelds
    public boolean checkInputs() {
        if (idTextField.getText() == null || nameTextField.getText() == null || priceTextField.getText() == null || dateField.getDate() == null) {
            return false;
        } else {
            try {
                Float.valueOf(priceTextField.getText());
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }
    
    // Check Input
    public boolean checkThreeField(){
        if(idTextField.getText() == null && nameTextField.getText() == null && priceTextField.getText() == null){
            return false;
        }else{
            try{
                Float.valueOf(priceTextField.getText());
                return true;
            }catch(NumberFormatException e){
                return false;
            }
        }
    }

    public Main_Window() {
        initComponents();
        // This Method Write here check connected database purpose
        getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        dateField = new com.toedter.calendar.JDateChooser();
        imgBox = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        chooseBtn = new javax.swing.JButton();
        insertBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        firstBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        previousBtn1 = new javax.swing.JButton();
        lastBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("ID :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Name :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Price :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Add Date :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Image :");

        idTextField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        nameTextField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        priceTextField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        priceTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        dateField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        imgBox.setBackground(new java.awt.Color(204, 255, 255));
        imgBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imgBox.setOpaque(true);

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Add Date"
            }
        ));
        jTable1.setEditingColumn(4);
        jScrollPane1.setViewportView(jTable1);

        chooseBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        chooseBtn.setText("Choose Image");
        chooseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseBtnActionPerformed(evt);
            }
        });

        insertBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        insertBtn.setText("Insert");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        firstBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        firstBtn.setText("First");

        nextBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nextBtn.setText("Next");

        previousBtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previousBtn1.setText("Previous");

        lastBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lastBtn.setText("Last");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chooseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imgBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priceTextField)
                            .addComponent(nameTextField)
                            .addComponent(idTextField))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(insertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(firstBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(previousBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lastBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(imgBox, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(chooseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previousBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1103, 1103, 1103))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));

        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images", "jpg", "png");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            imgBox.setIcon(ResizeImage(path, null));
            ImagePath = path;
        } else {
            System.out.println("No File Selected");
        }
    }//GEN-LAST:event_chooseBtnActionPerformed


    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        
    }//GEN-LAST:event_idTextFieldActionPerformed

    // Insert button
    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        if (checkInputs() && ImagePath != null) {
            try {
                Connection conn = getConnection();
                PreparedStatement ps = (PreparedStatement) conn.prepareStatement("INSERT INTO products(id,name,price,add_date,image)"
                        + "VALUES(?,?,?,?,?)");
                ps.setString(1, idTextField.getText());
                ps.setString(2, nameTextField.getText());
                ps.setString(3, priceTextField.getText());
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String addDate = dateFormat.format(dateField.getDate());
                ps.setString(4, addDate);
                InputStream img = new FileInputStream(new File(ImagePath));
                ps.setBlob(5, img);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Data Inserted");
            } catch (HeadlessException | FileNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "One or More Field Are Empty");
        }
    }//GEN-LAST:event_insertBtnActionPerformed

    // Update Button
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        if (checkInputs() && ImagePath != null) {
            String UpdateQuery = null;
            PreparedStatement ps = null;
            Connection conn = getConnection();
            if (ImagePath == null) {
                try {
                    UpdateQuery = "UPDATE products SET name = ?, price = ?" + ", add_date = ? WHERE id = ?";
                    ps = (PreparedStatement) conn.prepareStatement(UpdateQuery);
                    ps.setString(1, nameTextField.getText());
                    ps.setString(2, priceTextField.getText());
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String addDate = dateFormat.format(dateField.getDate());
                    ps.setString(3, addDate);
                    ps.setInt(4, Integer.parseInt(idTextField.getText()));
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Update Successfully");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }else{
                try {
                    InputStream img = new FileInputStream(new File(ImagePath));
                    UpdateQuery = "UPDATE products SET name = ?, price = ?" + ", add_date = ?, image = ? WHERE id = ?";
                    ps = (PreparedStatement) conn.prepareStatement(UpdateQuery);
                    ps.setString(1, nameTextField.getText());
                    ps.setString(2, priceTextField.getText());
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String addDate = dateFormat.format(dateField.getDate());
                    ps.setString(3, addDate);
                    ps.setBlob(4, img);
                    ps.setInt(5, Integer.parseInt(idTextField.getText()));
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Update Successfully");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }

        }else{
            JOptionPane.showMessageDialog(null, "One or More Fields are Empty Or Wrong");
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    
    
    
    // Delete Data From table
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if (checkThreeField()) {
            String DeleteQuery = null;
            PreparedStatement ps = null;
            Connection conn = getConnection();
            try {
                    DeleteQuery = "DELETE FROM products WHERE id = ? AND name = ? AND price = ?";
                    ps = (PreparedStatement) conn.prepareStatement(DeleteQuery);
//                    ps.setString(1, nameTextField.getText());
//                    ps.setString(2, priceTextField.getText());
//                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//                    String addDate = dateFormat.format(dateField.getDate());
//                    ps.setString(3, addDate);
                    ps.setInt(1, Integer.parseInt(idTextField.getText()));
                    ps.setString(2, nameTextField.getText());
                    ps.setString(3, priceTextField.getText());
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Delete Successfully");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }

        }else{
            JOptionPane.showMessageDialog(null, "One or More Fields are Empty Or Wrong");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseBtn;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton firstBtn;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel imgBox;
    private javax.swing.JButton insertBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton lastBtn;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton previousBtn1;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
