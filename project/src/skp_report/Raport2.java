/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package skp_report;

import java.awt.Color;
import javax.swing.border.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Random;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author chareq
 */
public class Raport2 extends javax.swing.JFrame {

    int overviewID = 0;

    /**
     * Creates new form MainWindow
     */
    public Raport2() {
        initComponents();
        cityFillData();
    }

    //Funkcja służąca do uzupełnienia pola wyboru dla nazwy miejscowości wartościami z bazy
    public void cityFillData() {
        try {
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            Connection con = DriverManager.getConnection("jdbc:firebirdsql://localhost:3050//databases/skp.fdb", "SYSDBA", "Czarek08#");
            java.sql.Statement stat = con.createStatement();
            String query = "SELECT DISTINCT Miejscowosc FROM Klienci";
            java.sql.ResultSet rs = stat.executeQuery(query);

            while (rs.next()) {
                Miejsce.addItem(rs.getString("Miejscowosc"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
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
        autor = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        generate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tytul = new javax.swing.JLabel();
        back1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Miejsce = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        minwiek = new javax.swing.JSpinner();
        maxwiek = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Raporty dla bazy SKP");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        autor.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        autor.setText("Kacper Owczarek");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo.png"))); // NOI18N

        date.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        date.setText("© 2023");

        generate.setBackground(new java.awt.Color(54, 88, 150));
        generate.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        generate.setForeground(new java.awt.Color(255, 255, 255));
        generate.setText("Generuj raport");
        generate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generateMouseExited(evt);
            }
        });
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(54, 88, 150));

        tytul.setFont(new java.awt.Font("Cantarell", 1, 25)); // NOI18N
        tytul.setForeground(new java.awt.Color(255, 255, 255));
        tytul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tytul.setText("WYKAZ KLIENTÓW W BAZIE SKP");
        tytul.setAlignmentY(0.0F);
        tytul.setMaximumSize(new java.awt.Dimension(340, 35));
        tytul.setMinimumSize(new java.awt.Dimension(340, 35));
        tytul.setPreferredSize(new java.awt.Dimension(350, 50));

        back1.setBackground(new java.awt.Color(54, 88, 150));
        back1.setFont(new java.awt.Font("Cantarell", 1, 30)); // NOI18N
        back1.setForeground(new java.awt.Color(255, 255, 255));
        back1.setText("<");
        back1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        back1.setIconTextGap(0);
        back1.setMargin(null);
        back1.setPreferredSize(new java.awt.Dimension(50, 50));
        back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                back1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                back1MouseExited(evt);
            }
        });
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(726, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(tytul, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(75, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(tytul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        back1.setFocusPainted(false);
        back1.setRolloverEnabled(true);
        back1.setBorder(new LineBorder(Color.WHITE, 2));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel1.setText("Miejscowość:");

        Miejsce.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        Miejsce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiejsceActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel2.setText("Przedział wieku:");

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel3.setText("Do:");

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel4.setText("Od:");

        minwiek.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        minwiek.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        maxwiek.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        maxwiek.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(autor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(date)
                .addGap(179, 179, 179)
                .addComponent(logo)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(328, 328, 328))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(33, 33, 33))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Miejsce, 0, 200, Short.MAX_VALUE)
                            .addComponent(minwiek, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(maxwiek))
                        .addGap(246, 246, 246))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Miejsce, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(minwiek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(maxwiek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(autor)
                            .addComponent(date))
                        .addGap(15, 15, 15)))
                .addGap(15, 15, 15))
        );

        generate.setBorderPainted(false);
        generate.setFocusPainted(false);
        generate.setRolloverEnabled(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MiejsceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiejsceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MiejsceActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        MainWindow mw = new MainWindow();
        mw.show();

        dispose();
    }//GEN-LAST:event_back1ActionPerformed

    private void back1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back1MouseExited
        back1.setBackground(new Color(54, 88, 150));
    }//GEN-LAST:event_back1MouseExited

    private void back1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back1MouseEntered
        back1.setBackground(new Color(135, 162, 212));
    }//GEN-LAST:event_back1MouseEntered

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        try {
            //STEROWNIK POŁĄCZENIA
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            //SPRAWDZENIE POŁĄCZENIA Z BAZĄ
            try (Connection con = DriverManager.getConnection("jdbc:firebirdsql://localhost:3050//databases/skp.fdb", "SYSDBA", "Czarek08#")) {
                //databases/Raporty/Raport1.jrxml
                String reportPath = "/databases/Raporty/Raport2.jrxml";

                //GENEROWANIE IDENTYFIKATORA (KODU) RAPORTU
                String znaki = "abcdefghijklmnopqrstuvwxyz1234567890";
                StringBuilder kodID = new StringBuilder();
                Random random = new Random();
                for (int i = 0; i < 19; i++) {
                    if (i == 4 || i == 9 || i == 14) {
                        kodID.append("-");
                    } else {
                        kodID.append(znaki.charAt(random.nextInt(znaki.length())));
                    }
                }

                //PARAMETRY
                HashMap<String, Object> parametry = new HashMap<String, Object>();
                parametry.put("qrCode", "resources/qr-code.png");
                parametry.put("idCode", kodID.toString());
                parametry.put("miejscowosc", Miejsce.getSelectedItem());
                parametry.put("wiek_min", minwiek.getValue());
                parametry.put("wiek_max", maxwiek.getValue());

                JasperReport jr = JasperCompileManager.compileReport(reportPath);
                JasperPrint jp = JasperFillManager.fillReport(jr, parametry, con);
                JasperViewer.viewReport(jp, false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_generateActionPerformed

    private void generateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateMouseExited
        generate.setBackground(new Color(54, 88, 150));
    }//GEN-LAST:event_generateMouseExited

    private void generateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateMouseEntered
        generate.setBackground(new Color(135, 162, 212));
    }//GEN-LAST:event_generateMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Raport2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Miejsce;
    private javax.swing.JLabel autor;
    private javax.swing.JButton back1;
    private javax.swing.JLabel date;
    private javax.swing.JButton generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JSpinner maxwiek;
    private javax.swing.JSpinner minwiek;
    private javax.swing.JLabel tytul;
    // End of variables declaration//GEN-END:variables
}
