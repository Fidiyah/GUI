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
public class kuis1 extends javax.swing.JFrame {

    /**
     * Creates new form kuis1
     */
    public kuis1() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Absen = new javax.swing.JTextField();
        Mapel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Nilai = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hasil = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel1.setText("Penilaian Siswa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 10, 230, 40);

        jLabel2.setText("NAMA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 60, 45, 20);

        jLabel3.setText("ABSEN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 110, 49, 20);

        jLabel4.setText("MAPEL");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 160, 49, 20);
        getContentPane().add(Nama);
        Nama.setBounds(140, 60, 260, 26);
        getContentPane().add(Absen);
        Absen.setBounds(140, 110, 260, 26);
        getContentPane().add(Mapel);
        Mapel.setBounds(140, 160, 260, 26);

        jLabel5.setText("NILAI");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 210, 42, 20);
        getContentPane().add(Nilai);
        Nilai.setBounds(140, 210, 260, 26);

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setText("PROSES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 260, 91, 29);

        Hasil.setColumns(20);
        Hasil.setRows(5);
        jScrollPane1.setViewportView(Hasil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 330, 280, 140);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 660, 530);

        setBounds(0, 0, 680, 585);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String nama = Nama.getText();
         String absen = Absen.getText();
         String mapel= Mapel.getText();
         String keterangan;
         int nilai = Integer.parseInt(Nilai.getText());
        
         if(nilai < 75){
             keterangan = "tidak lulus";
         } else if(nilai>= 75 && nilai< 99){
             keterangan = "lulus";
         }else if(nilai == 100 ){
             keterangan = "Sempurna";
         }else{
             keterangan = " Amazing";
         }
          
       Hasil.setText("Nama siswa : "+nama+"\n"+"Absen : "+absen+"\n"+"Mapel : "+mapel+"\n"+"Nilai : "+nilai+"\n"+"Keterangan :"+keterangan);
             
             
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kuis1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JTextArea Hasil;
    private javax.swing.JTextField Mapel;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nilai;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
