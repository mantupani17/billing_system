/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package billing_system;

//import com.itextpdf.text.*;
//import com.itextpdf.text.pdf.PdfAWriter;
//import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfWriter;
import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.io.FileOutputStream;
import java.text.MessageFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**
 *
 * @author mantu
 */
public class Print_bill extends javax.swing.JFrame  {

    /**
     * Creates new form Print_bill
     */
    public Print_bill() {
        super("Print Bill...!");
        initComponents();
        setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        TableColumn col1;
           col1=jTable1.getColumnModel().getColumn(1);
           col1.setPreferredWidth(150);
           setIconImage(Toolkit.getDefaultToolkit().getImage("icon1.png"));
    }
    /*public void setColumns()
    {
        try{
             DefaultTableModel model1=new DefaultTableModel();
           model1.addColumn("");
           model1.addColumn("");
           model1.addColumn("");
           model1.addColumn("");
           model1.addColumn("");
           model1.addColumn("");
           model1.addColumn("");
           model1.addColumn("");
           model1.addColumn("");
           model1.addColumn("");
           model1.addColumn("");
           model1.addColumn("");
           model1.addRow(new Object[]{"","","","","","","Health & Fitness","","","","",""});
           model1.addRow(new Object[]{"Name:",jComboBox1.getSelectedItem(),"","","","","","","Bill no:",jTextField1.getText(),"",""});
           model1.addRow(new Object[]{"Address:",jTextField18.getText(),"","","","","","","Date:",jTextField10.getText(),"",""});
           model1.addRow(new Object[]{"Mobile no:",jTextField19.getText(),"","","","","","","","","",""});
           model1.addRow(new Object[]{"","","","","","","","","","","",""});
           model1.addRow(new Object[]{"Sr.no","Particulars","Exp.Dt","Pack","MRP","QTY","TOT","Value Of good","TOT","Discount","VAT(%)","NET"});
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }*/
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, "", "", "", "", null, null, null, null},
                {"Name:", null, null, null, null, null, null, null, "Bill no", null, null, null},
                {"Address:", null, null, null, null, null, null, null, "Date:", null, null, null},
                {"Mob No:", null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {"SRno", "Product", "Exp.Dt", "Pack", "MRP", "QTY", "TOT", "Value of Good", "TOT", "Discount", "Vat(%)", "NET"}
            },
            new String [] {
                "", "", "", "", "", "", "", "", "", "", "", ""
            }
        ));
        jTable1.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTable1.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Create Pdf");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int res=JOptionPane.showConfirmDialog(rootPane, "Are you wish to print ?", "Printing Form", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_OPTION);
        if(res==JOptionPane.YES_OPTION)
        {
            try{
                MessageFormat head=new MessageFormat("Handshake Gym");
                MessageFormat foot=new MessageFormat("PAGE{0}");
                //jTable1.setSize(500, 500);
                jTable1.print(JTable.PrintMode.FIT_WIDTH, head, foot);
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Printing Error...!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Print Cancelled...!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
           /* Document doc=new Document();
            String fname=jTable1.getValueAt(1, 9)+".pdf";
            PdfWriter.getInstance(doc, new FileOutputStream(fname));
            doc.open();
            PdfPTable table=new PdfPTable(jTable1.getColumnCount());
            PdfPTable table1=new PdfPTable(1);
            Paragraph par=new  ListItem("Name:       "+jTable1.getValueAt(1, 1).toString());
            Paragraph par1=new Paragraph("Address:   "+jTable1.getValueAt(2, 1).toString());
            Paragraph par2=new Paragraph("Mobile No: "+jTable1.getValueAt(3, 1).toString());
            Paragraph par3=new Paragraph("Date:      "+jTable1.getValueAt(2, 9).toString());
            Paragraph par4=new Paragraph("Bill NO:   "+jTable1.getValueAt(1, 9).toString());
            //par.add("Berhampur");
            Paragraph par5=new Paragraph(" ");
            doc.add(par);
            doc.add(par1);
            doc.add(par2);
            doc.add(par3);
            doc.add(par4);
            doc.add(par5);
            table1.addCell("");
            //com.itextpdf.text.Font f=new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.COURIER, 25.0, com.itextpdf.text.Font.BOLD, com.itextpdf.text.BaseColor.BLUE);
            //table.setSummary("Mantu");
            for(int i=6;i<jTable1.getRowCount();i++)
            {
                for(int j=0;j<jTable1.getColumnCount();j++)
                {
                    if(jTable1.getValueAt(i, j)==null)
                    {
                    table.addCell("");
                    }
                    else
                    {
                        table.addCell(jTable1.getValueAt(i, j).toString());
                    }
                }
            }
            table.setWidthPercentage(100);
            table1.addCell(table);
            table1.setWidthPercentage(100);
            doc.add(table1);
            doc.close();
            JOptionPane.showMessageDialog(rootPane, fname+" Pdf Created...!");*/
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Print_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Print_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Print_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Print_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Print_bill().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

   
}
