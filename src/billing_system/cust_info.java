/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package billing_system;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author mantu
 */
public class cust_info extends javax.swing.JFrame {
Connection con;
Vector row,col;
String uname,pass;
    public cust_info() throws ClassNotFoundException {
        super("New Customer...!");
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Class.forName("oracle.jdbc.OracleDriver");
        getContentPane().setBackground(new Color(10,179,79));
        setBounds(150, 100, 485, 600);
        setIconImage(Toolkit.getDefaultToolkit().getImage("icon1.png"));
    }

    public void getconnect(String uname,String pass)
    {
        try{
            this.uname=uname;
            this.pass=pass;
       con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", uname, pass);
        }catch(Exception e){
           JOptionPane.showMessageDialog(rootPane, e.toString()); 
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Customer ID:");

        jLabel2.setText("Customer Name:");

        jLabel3.setText("Mobile NO:");

        jLabel4.setText("Address:");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Exit");

        jComboBox1.setEditable(true);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton4.setText("SetPercentage");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Remove");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void inserCusData()//this method is used to insert the customer information
    {
        try{
            String sql="insert into Customer_tab values(?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, (String)jComboBox1.getSelectedItem());
            pst.setString(2, jTextField2.getText());
            pst.setString(3, jTextField3.getText());
            pst.setString(4, jTextField4.getText());
            int x=pst.executeUpdate();
            if(x>0)
            {
                JOptionPane.showMessageDialog(rootPane, "Data Saved...!");
            }
            pst.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }
     public void setCustomer()//set Customer Names...!
    {
        try{
            ResultSet res=con.createStatement().executeQuery("select Cid from CUSTOMER_TAB");
            while(res.next())
            {
                jComboBox1.addItem(res.getString("Cid"));
            }
            res.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       inserCusData();
       viewCusData();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void setColumn()
     {
         try{
         col=new Vector();
         row=new Vector();
         row.clear();
         col.add("Sl/no");
         col.add("CID");
         col.add("Customer Name");
         col.add("Mobile No");
         col.add("Address");
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(rootPane, e.toString());
         }
     }
     public void viewCusData()//view All the percentage information for a customer
     {
      try{
          setColumn();
          Vector v=null;
          int x=1;
          ResultSet res=con.createStatement().executeQuery("select * from Customer_tab");
          while(res.next()){
              v=new  Vector();
              v.add(x++);
              v.add(res.getString("CID"));
              v.add(res.getString("CNAME"));
              v.add(res.getString("MNO"));
              v.add(res.getString("ADDER"));
              row.add(v);
          }
          jTable1.setModel(new DefaultTableModel(row, col));
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }   
     }
    public void updateCusData()//this method is used to update the customer information
    {
        try{
            String sql="update customer_tab set cname='"+jTextField2.getText()+"',mno='"+jTextField3.getText()+"',adder='"+jTextField4.getText()+"' where cid='"+(String)jComboBox1.getSelectedItem()+"'";
            Statement pst=con.createStatement();
            int x=pst.executeUpdate(sql);
            //pst.executeQuery();
            if(x>0)
            {
                JOptionPane.showMessageDialog(rootPane, "Data Updated...!");
            }
            //JOptionPane.showMessageDialog(rootPane, "Data Updated...!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        updateCusData();
        viewCusData();
    }//GEN-LAST:event_jButton2ActionPerformed
    public void selectCusData()
    {
        try{
            ResultSet res=con.createStatement().executeQuery("select * from customer_tab where cid='"+(String)jComboBox1.getSelectedItem()+"'");
            if(res.next())
            {
                jTextField2.setText(res.getString("Cname"));
                jTextField3.setText(res.getString("Mno"));
                jTextField4.setText(res.getString("Adder"));
                
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Data Not Available...!");
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       setCustomer();
       viewCusData();
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
       selectCusData();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            set_per sp=new set_per();
            sp.setconnect(uname, pass);
            sp.setVisible(rootPaneCheckingEnabled);
            //sp.jComboBox1.setSelectedItem(jTextField2.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    public void removeCusData()
    {
         int res=JOptionPane.showConfirmDialog(rootPane, "Do you Want To Delete ?", "Delete Customer.", JOptionPane.YES_NO_OPTION);
         if(res==JOptionPane.YES_OPTION)
         {
          try{
              Statement pst=con.createStatement();
              int x=pst.executeUpdate("delete  from customer_tab where CID='"+(String)jComboBox1.getSelectedItem()+"'");
              if(x!=0)
              {
                  JOptionPane.showMessageDialog(rootPane, "Delete Successfully...!", "Delete Customer.", JOptionPane.INFORMATION_MESSAGE);
              }
              else
              {
                  JOptionPane.showMessageDialog(rootPane, "Record Not Found...!", "Delete Customer.", JOptionPane.ERROR_MESSAGE);
              }
          }catch(Exception e)
          {
              JOptionPane.showMessageDialog(rootPane,  e.toString(),"Delete Customer.", JOptionPane.ERROR_MESSAGE);
          }
             
         }
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       removeCusData();
       viewCusData();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(cust_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cust_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cust_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cust_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new cust_info().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(cust_info.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
