/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package billing_system;

import java.awt.Toolkit;
import javax.swing.*;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mantu
 */
public class seting_form extends javax.swing.JFrame {
Connection con;
String uname,pass;
Vector row,col,row1,col1;
//String field;
    public seting_form() throws ClassNotFoundException {
        super("Show Bill Information...!");
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
        Class.forName("oracle.jdbc.OracleDriver");
        setIconImage(Toolkit.getDefaultToolkit().getImage("icon1.png"));
    }
    public void dbConnect(String uname,String pass)
    {
        try{
            this.uname=uname;
            this.pass=pass;
            String drv="jdbc:oracle:thin:@localhost:1521:XE";
            con=DriverManager.getConnection(drv, this.uname, this.pass);
        }catch(Exception e){
            
        }
    }
    public void setColumnDetail()//This method is used for customer billing
    {
        try{
            row=new Vector();
            col=new Vector();
            row.clear();
            col.add("BID");
            col.add("Customer name");
            col.add("Date");
            //col.add("Product");
            //col.add("Qty");
            //col.add("Price");
            //col.add("Discount");
            col.add("Vat Price");
            col.add("Discount");
            col.add("total");
            col.add("Paid");
            col.add("Bal");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }
    public void setColumns()//detail table columns
    {
        try{
            row1=new Vector();
            col1=new Vector();
            row1.clear();
            //col1.add("BID");
            //col1.add("Customer name");
            //col1.add("Date");
            col1.add("Product");
            col1.add("Qty");
            col1.add("MRP");
            col1.add("MRP.Tot");
            col1.add("Saled");
            col1.add("Sale.Tot");
            col1.add("Discount");
            col1.add("Vat Price");
            col1.add("Net");
            //col1.add("Bal");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }
    public void showBillingDetail()
    {
        try{
            setColumns();
            int sr=jTable1.getSelectedRow();
            String bid=(String)jTable1.getValueAt(sr, 0);
            String sql="select * from salescont_tab where BNO=(select BID from sale_tab where BID='"+bid+"')";
            Statement stm=con.createStatement();
            ResultSet res=stm.executeQuery(sql);
            Vector v;
            while(res.next())
            {
                v=new Vector();
                //v.add(res.getDate("doe"));
                v.add(res.getString("Pname"));
                v.add(res.getInt("quan"));
                v.add(res.getDouble("MRP"));
                v.add(res.getDouble("MRPT"));
                v.add(res.getDouble("RATE"));
                v.add(res.getDouble("RTOT"));
                
                v.add(res.getDouble("DRATE"));
                v.add(res.getDouble("VRATE"));
               //v.add(res.getDouble("TRATE"));
                v.add(res.getDouble("NRATE"));
                row1.add(v);
            }
            jTable2.setModel(new DefaultTableModel(row1, col1));
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }
    public void showDetail(String sql)//Show Total information
    {
        try{
            setColumnDetail();
            Statement stm=con.createStatement();
            ResultSet res=stm.executeQuery(sql);
            Vector v;
            while(res.next()){
                v=new Vector();
                v.add(res.getString("BID"));
                v.add(res.getString("Cname"));
                v.add(res.getDate("DOE").toString());
                v.add(res.getDouble("Vat"));
                v.add(res.getDouble("tdis"));
                v.add(res.getDouble("GTOT"));
                v.add(res.getDouble("PAID"));
                v.add(res.getDouble("BAL"));
                row.add(v);
            }
            jTable1.setModel(new DefaultTableModel(row, col));
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setToolTipText("Select a row for detail informmation");
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                row_selct(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel1.setText("Enter Name / Bill no/ Customer ID (Bill Details):");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jRadioButton1.setText("Billno");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jRadioButton2.setText("Customer Name");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jRadioButton3.setText("Customer ID");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addContainerGap(269, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
      String sql="select * from sale_tab where CNAME='"+jTextField1.getText()+"'";
      showDetail(sql);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
       String sql="select * from sale_tab where BID='"+jTextField1.getText()+"'";
       showDetail(sql);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
      String cid=jTextField1.getText();
      String sql="select * from sale_tab where cname=(select cname from Customer_tab where Cid='"+cid+"')";
      showDetail(sql);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void row_selct(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_row_selct
       showBillingDetail();
    }//GEN-LAST:event_row_selct

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(seting_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seting_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seting_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seting_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new seting_form().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(seting_form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
