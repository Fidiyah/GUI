/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author WINDOWS 10
 */
public class latihan3 extends javax.swing.JFrame {

    /**
     * Creates new form latihan3
     */
    public latihan3() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Bilangan1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Bilangan2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Kali = new javax.swing.JButton();
        Bagi = new javax.swing.JButton();
        Tambah = new javax.swing.JButton();
        Kurang = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Hasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 16)); // NOI18N
        jLabel1.setText("KALKULATOR SEDERHANA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 10, 300, 40);

        jLabel2.setText("BILANGAN 1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 100, 100, 40);

        Bilangan1.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(Bilangan1);
        Bilangan1.setBounds(240, 70, 160, 90);

        jLabel3.setText("BILANGAN 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 210, 150, 40);

        Bilangan2.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(Bilangan2);
        Bilangan2.setBounds(240, 190, 160, 90);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel4.setText("OPERATOR");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 320, 200, 23);

        Kali.setBackground(new java.awt.Color(255, 255, 0));
        Kali.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        Kali.setText("X");
        Kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaliActionPerformed(evt);
            }
        });
        getContentPane().add(Kali);
        Kali.setBounds(60, 360, 80, 80);

        Bagi.setBackground(new java.awt.Color(255, 255, 51));
        Bagi.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        Bagi.setText(":");
        Bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagiActionPerformed(evt);
            }
        });
        getContentPane().add(Bagi);
        Bagi.setBounds(180, 360, 90, 80);

        Tambah.setBackground(new java.awt.Color(255, 255, 102));
        Tambah.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        Tambah.setText("+");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });
        getContentPane().add(Tambah);
        Tambah.setBounds(310, 360, 80, 80);

        Kurang.setBackground(new java.awt.Color(255, 255, 153));
        Kurang.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        Kurang.setText("-");
        Kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KurangActionPerformed(evt);
            }
        });
        getContentPane().add(Kurang);
        Kurang.setBounds(430, 360, 80, 80);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel5.setText("HASIL");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 480, 60, 30);

        Hasil.setBackground(new java.awt.Color(0, 255, 255));
        getContentPane().add(Hasil);
        Hasil.setBounds(210, 520, 150, 120);

        setBounds(0, 0, 652, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void KaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaliActionPerformed
       int Bil1 = Integer.parseInt(Bilangan1.getText());
       int Bil2 = Integer.parseInt(Bilangan2.getText());
       int hasil1 = Bil1*Bil2;
       Hasil.setText(String.valueOf(hasil1));
       
// TODO add your handling code here:
    }//GEN-LAST:event_KaliActionPerformed

    private void BagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagiActionPerformed
         double Bil1 = Double.parseDouble(Bilangan1.getText());
       double Bil2 = Double.parseDouble(Bilangan2.getText());
       double hasil2 = Bil1/Bil2;
       Hasil.setText(String.valueOf(hasil2));
       
        // TODO add your handling code here:
    }//GEN-LAST:event_BagiActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
 int Bil1 = Integer.parseInt(Bilangan1.getText());
       int Bil2 = Integer.parseInt(Bilangan2.getText());
       int hasil3 = Bil1+Bil2;
       Hasil.setText(String.valueOf(hasil3));
       
        // TODO add your handling code here:
    }//GEN-LAST:event_TambahActionPerformed

    private void KurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KurangActionPerformed

 int Bil1 = Integer.parseInt(Bilangan1.getText());
       int Bil2 = Integer.parseInt(Bilangan2.getText());
       int hasil4 = Bil1-Bil2;
       Hasil.setText(String.valueOf(hasil4));
               // TODO add your handling code here:
    }//GEN-LAST:event_KurangActionPerformed

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
            java.util.logging.Logger.getLogger(latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bagi;
    private javax.swing.JTextField Bilangan1;
    private javax.swing.JTextField Bilangan2;
    private javax.swing.JTextField Hasil;
    private javax.swing.JButton Kali;
    private javax.swing.JButton Kurang;
    private javax.swing.JButton Tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
