/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_lanjutan;

/**
 *
 * @author WINDOWS 10
 */
public class latihan1 extends javax.swing.JFrame {

    /**
     * Creates new form latihan1
     */
    public latihan1() {
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

        jLabel7 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Absen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Kelas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Rpl = new javax.swing.JRadioButton();
        Tkj = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        Alamat = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Send = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\WINDOWS 10\\Documents\\logo-ts.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("BIODATA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 20, 190, 35);

        jLabel2.setText("NAMA ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 90, 50, 20);

        jLabel3.setText("ABSEN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 130, 49, 30);

        Nama.setBackground(new java.awt.Color(255, 204, 0));
        getContentPane().add(Nama);
        Nama.setBounds(150, 86, 220, 30);

        Absen.setBackground(new java.awt.Color(255, 204, 0));
        getContentPane().add(Absen);
        Absen.setBounds(150, 130, 220, 30);

        jLabel4.setText("KELAS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 180, 51, 20);

        Kelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X RPL 1", "X RPL 2", "X RPL 3", "X RPL 4", "X RPL 5", "X RPL 6", "X RPL 7", "X TKJ 1", "X TKJ 2", "X TKJ 3", "X TKJ 4", "X TKJ 5", "X TKJ 6", " " }));
        getContentPane().add(Kelas);
        Kelas.setBounds(150, 180, 90, 26);

        jLabel5.setText("JURUSAN");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 240, 80, 20);

        Rpl.setBackground(new java.awt.Color(255, 204, 0));
        Rpl.setText("RPL");
        getContentPane().add(Rpl);
        Rpl.setBounds(170, 230, 59, 29);

        Tkj.setBackground(new java.awt.Color(255, 204, 0));
        Tkj.setText("TKJ");
        getContentPane().add(Tkj);
        Tkj.setBounds(260, 230, 133, 29);

        jLabel6.setText("ALAMAT");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 280, 70, 20);

        Alamat.setBackground(new java.awt.Color(255, 204, 0));
        getContentPane().add(Alamat);
        Alamat.setBounds(150, 280, 210, 26);

        jPanel1.setForeground(new java.awt.Color(204, 255, 153));

        Send.setBackground(new java.awt.Color(255, 204, 51));
        Send.setText("SEND");
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 97, Short.MAX_VALUE)
                .addComponent(Send))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Send)
                .addGap(0, 101, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 350, 170, 130);

        Exit.setBackground(new java.awt.Color(255, 204, 0));
        Exit.setText("EXIT");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(260, 350, 67, 29);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\WINDOWS 10\\Documents\\logo-ts.png")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 520, 500);

        setBounds(0, 0, 540, 554);
    }// </editor-fold>//GEN-END:initComponents

    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed
        // TODO add your handling code here:
        String nama = Nama.getText();
        String absen = Absen.getText();
        String kelas = Kelas.getSelectedItem().toString();
        String jurusan = "";
       String alamat = Alamat.getText();
       if(Rpl.isSelected()){
           jurusan = "RPL";
     
       }
       else if(Tkj.isSelected()){
           jurusan = "TKJ";
       }
       if(Kelas.getSelectedItem()== "X RPL 1"){
           
       } if(Kelas.getSelectedItem()== "X RPL 2"){
           
       } if(Kelas.getSelectedItem()== "X RPL 3"){
           
       } if(Kelas.getSelectedItem()== "X RPL 4"){
           
       } if(Kelas.getSelectedItem()== "X RPL 5"){
           
       } if(Kelas.getSelectedItem()== "X RPL 6"){
           
       } if(Kelas.getSelectedItem()== "X RPL 7"){
           
       } if(Kelas.getSelectedItem()== "X TKJ 1"){
           
       } if(Kelas.getSelectedItem()== "X TKJ 2"){
           
       } if(Kelas.getSelectedItem()== "X TKJ 3 "){
           
       } if(Kelas.getSelectedItem()== "X TKJ 4"){
           
       } if(Kelas.getSelectedItem()== "X TKJ 5"){
           
       } if(Kelas.getSelectedItem()== "X TKJ 6"){
           
       }
       new Frame2(nama,absen,kelas,jurusan,alamat).setVisible(true);
       
       
    }//GEN-LAST:event_SendActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JTextField Alamat;
    private javax.swing.JButton Exit;
    private javax.swing.JComboBox<String> Kelas;
    private javax.swing.JTextField Nama;
    private javax.swing.JRadioButton Rpl;
    private javax.swing.JButton Send;
    private javax.swing.JRadioButton Tkj;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
