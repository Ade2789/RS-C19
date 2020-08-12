/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ADE NURJAMAN
 */
public class home extends javax.swing.JFrame {
    database db = new database();
    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        ImageIcon icon = new ImageIcon("src/img/logo-20x21.png");
        setIconImage(icon.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        logo = new javax.swing.JLabel();
        daftarUser = new javax.swing.JButton();
        loginUser = new javax.swing.JButton();
        textUser = new javax.swing.JFormattedTextField();
        textPass = new javax.swing.JPasswordField();
        nama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        genLaki = new javax.swing.JRadioButton();
        genPerempuan = new javax.swing.JRadioButton();
        inputTempatLahir = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        golDarah = new javax.swing.JComboBox<>();
        nik = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        kenali = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        inputTempatLahir1 = new javax.swing.JTextField();
        tglLahir = new com.toedter.calendar.JDateChooser();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo-112x116.png"))); // NOI18N
        logo.setText("APP COVID-19");
        jDesktopPane1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 30, -1, -1));

        daftarUser.setText("DAFTAR");
        daftarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarUserActionPerformed(evt);
            }
        });
        jDesktopPane1.add(daftarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 520, 103, 32));

        loginUser.setText("LOGIN");
        loginUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginUserMouseClicked(evt);
            }
        });
        loginUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUserActionPerformed(evt);
            }
        });
        jDesktopPane1.add(loginUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1166, 67, 74, 30));
        jDesktopPane1.add(textUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(908, 67, 115, 30));
        jDesktopPane1.add(textPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(1033, 67, 115, 30));

        nama.setToolTipText("");
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        jDesktopPane1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 389, 172, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("SELAMAT DATANG DI POLIKLINIK");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 288, -1, -1));

        gender.add(genLaki);
        genLaki.setText("Laki-Laki");
        genLaki.setActionCommand("LakiLaki");
        genLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genLakiActionPerformed(evt);
            }
        });
        jDesktopPane1.add(genLaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 462, -1, -1));

        gender.add(genPerempuan);
        genPerempuan.setText("Perempuan");
        genPerempuan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane1.add(genPerempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 462, -1, -1));
        jDesktopPane1.add(inputTempatLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 389, 120, 31));

        alamat.setPreferredSize(new java.awt.Dimension(33, 20));
        jDesktopPane1.add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 453, 172, 31));

        golDarah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "AB", "B", "O" }));
        golDarah.setPreferredSize(new java.awt.Dimension(33, 20));
        golDarah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                golDarahActionPerformed(evt);
            }
        });
        jDesktopPane1.add(golDarah, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 458, 59, 31));

        nik.setPreferredSize(new java.awt.Dimension(33, 20));
        jDesktopPane1.add(nik, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 521, 172, 30));
        jDesktopPane1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 521, 118, 31));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home-450p_pngbarn.png"))); // NOI18N
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, -1, -1));

        kenali.setText("KENALI PENYAKIT");
        kenali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kenaliActionPerformed(evt);
            }
        });
        jDesktopPane1.add(kenali, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 640, 132, 35));

        jLabel3.setText("Nama");
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 364, -1, -1));

        jLabel4.setText("Tempat Tanggal Lahir");
        jDesktopPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 364, -1, -1));

        jLabel6.setText("Alamat");
        jDesktopPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 433, -1, -1));

        jLabel7.setText("NIK");
        jDesktopPane1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 500, -1, -1));

        jLabel8.setText("Golongan Darah");
        jDesktopPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 433, -1, -1));

        jLabel9.setText("Jenis Kelamin");
        jDesktopPane1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 433, -1, -1));

        jLabel10.setText("Password");
        jDesktopPane1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 500, -1, -1));

        jLabel5.setText("Username");
        jDesktopPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(908, 47, -1, -1));

        jLabel11.setText("Password");
        jDesktopPane1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1033, 47, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_45p.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jDesktopPane1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 630, -1, -1));
        jDesktopPane1.add(inputTempatLahir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 389, 120, 31));
        jDesktopPane1.add(tglLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 110, 30));

        getContentPane().add(jDesktopPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void daftarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarUserActionPerformed
        // TODO add your handling code here:
        String gender="";
        if(genLaki.isSelected()){
            gender=genLaki.getText();
        }else{
            gender=genPerempuan.getText();
        }
        String sql = "INSERT INTO pendaftaran(nama,nik,alamat,goldarah,gender,password)"
                    +"VALUES('"
                    +nama.getText()+"','"+nik.getText()+"', '"+alamat.getText()+"', '"
//                    +inputTempatLahir.getText()+"','"+inputTglLahir.getDate()+"','"
                    +golDarah.getSelectedItem()+"', '"+gender+"', '"
                    +password.getText()+"')";
        System.out.println(sql);
        System.out.println(tglLahir.getDate());
        try{
            Class.forName("org.postgresql.Driver");
        }catch(Exception ex){
            System.out.println("Driver tidak ditemukan... " + ex);
        }   
        try {
            db.dbCon = DriverManager.getConnection(db.dbURL, db.username, db.password);
            db.stmt = db.dbCon.createStatement();
            db.stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally{
            try {
                 db.stmt.close();
                 db.dbCon.close();
             } catch (SQLException ex) {
                 Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
             }
            dispose();
            
            JOptionPane.showMessageDialog(null,"Data Sudah di-Simpan.", 
                    "Konfirmasi",JOptionPane.INFORMATION_MESSAGE );
        }

    }//GEN-LAST:event_daftarUserActionPerformed

    private void golDarahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_golDarahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_golDarahActionPerformed

    private void loginUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginUserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUserMouseClicked

    private void kenaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kenaliActionPerformed
        // TODO add your handling code here:
        new pengenalan().setVisible(true);
    }//GEN-LAST:event_kenaliActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        new menuAdmin().setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void genLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genLakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genLakiActionPerformed

    private void loginUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUserActionPerformed
        // TODO add your handling code here:
        
        String passUser = new String(textPass.getPassword());
        if(textUser.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Username Tidak Boleh Kosong", 
                    "Information", JOptionPane.WARNING_MESSAGE );
        }else if(passUser.equals("")){
            JOptionPane.showMessageDialog(null,"Password Tidak Boleh Kosong", 
                    "Information", JOptionPane.WARNING_MESSAGE );
        }else{
            if(isLogin(textUser.getText().trim(), passUser) == true){
                JOptionPane.showMessageDialog(null,"Login Sukses", 
                    "Information", JOptionPane.CLOSED_OPTION);
               new menuUser().setVisible(true);
               new menuUser().setEnabled(true);     
            }else{
                JOptionPane.showMessageDialog(null,"Username atau Password Anda Salah", 
                    "Information", JOptionPane.WARNING_MESSAGE );
            }
        }
    }//GEN-LAST:event_loginUserActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setExtendedState(home.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed
    public Boolean isLogin(String nama, String pass) {
        String query ="SELECT * FROM pendaftaran WHERE nama = '" + nama 
                + "' AND password = '" + password + "'";
        Boolean hasil;
        hasil = false;
        try{
            Class.forName("org.postgresql.Driver");
        }catch(Exception ex){
            System.out.println("Driver tidak ditemukan... " + ex);
        }
        try {
            db.dbCon = DriverManager.getConnection(db.dbURL, db.username, db.password);
            db.stmt = db.dbCon.createStatement();
            db.rs = db.stmt.executeQuery(query);
            while(db.rs.next()){
                hasil = true;
            }
        } catch (SQLException ex) {
            System.out.println("Boss Xampp na Acan Aktif" + ex);
        } finally{
           try {
                 db.rs.close();
                 db.stmt.close();
                 db.dbCon.close();
             } catch (SQLException ex) {
                 Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        return hasil;
    }
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new home().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JButton daftarUser;
    private javax.swing.JRadioButton genLaki;
    private javax.swing.JRadioButton genPerempuan;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JComboBox<String> golDarah;
    private javax.swing.JTextField inputTempatLahir;
    private javax.swing.JTextField inputTempatLahir1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton kenali;
    private javax.swing.JButton loginUser;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nik;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField textPass;
    private javax.swing.JFormattedTextField textUser;
    private com.toedter.calendar.JDateChooser tglLahir;
    // End of variables declaration//GEN-END:variables
}