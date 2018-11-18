/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package billing_system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**
 *
 * @author mantu
 */
public class sales_form extends javax.swing.JFrame {
    int cn=1;
    double gtot=0,gdis=0,gvat=0;
   DefaultTableModel model;
   Connection con;
   Statement stm;
   String rt="dis";
   //ResultSet res;
    public sales_form() throws ClassNotFoundException {
        super("Sales...!");
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new Color(150, 200, 0));
        //setResizable(false);
        //setBounds(150, 50, 595, 650);
        setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
         model=new DefaultTableModel();
        jTable1.setModel(model);
        setColumn();
        Class.forName("oracle.jdbc.OracleDriver");
        setIconImage(Toolkit.getDefaultToolkit().getImage("icon1.png"));
    }
    public void setBillno()
    {
        try{
            String sql="select count(*) from sale_tab";
            Statement pst=con.createStatement();
            //pst.executeQuery(sql);
            ResultSet rs=pst.executeQuery(sql);
            if(rs.next())
            {
                int x=rs.getInt(1);
                jTextField1.setText(String.valueOf(x));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }
    public void getconnection(String uname,String pass)
    {
        try{
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", uname, pass);
            setBillno();
            /*if(con!=null)
                JOptionPane.showMessageDialog(rootPane, "Connected...!");*/
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }
    public void setColumn()//set Column names to the table
    {
        try{
            model.addColumn("sr/no");
            model.addColumn("Product Name");
            model.addColumn("Exp.dt");
            model.addColumn("Pack");
            model.addColumn("MRP");
            model.addColumn("QTY");
            model.addColumn("Tot");
            model.addColumn("Rate");
            model.addColumn("Tot");
            model.addColumn("Tax/Dis");
            model.addColumn("vat");
            model.addColumn("NET");
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }
    public void addData()//add data into the table
    {
        try{
            // setColumn();
           //int quan=Integer.parseInt(jTextField2.getText());
           //double tot=Double.parseDouble(jTextField3.getText())*quan;
           //double vat=tot*(Double.parseDouble(jTextField5.getText())/100);
           //double dis=tot*(Double.parseDouble(jTextField4.getText())/100);
           //double net=tot-dis+vat;
           //jTextField9.setText(String.valueOf(net));
           model.addRow(new Object[]{cn++,jComboBox2.getSelectedItem(),jTextField17.getText()
                   ,jTextField20.getText(),jTextField3.getText(),jTextField2.getText(),
                   jTextField6.getText(),jTextField16.getText(),jTextField21.getText(),
                   jTextField15.getText(),jTextField14.getText(),jTextField9.getText()});
           //jTable1.setModel(model);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField12 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 180, 209));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel14.setText("Total Discount:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel7.setText("VAT:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel15.setText("Grand Total:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel12.setText("Date of Entry:");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N

        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jComboBox1.setToolTipText("select customer name if not then write");
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel5.setText("Discount Percentage:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel8.setText("Total:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel6.setText("MRP:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel2.setText("Bill No:");

        jComboBox2.setEditable(true);
        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jComboBox2.setToolTipText("select Product name if not then write");
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jTextField4.setText("0");
        jTextField4.setToolTipText("Discount Percent");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField7.setText("0");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setText("Balance:");

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jTextField5.setText("14.5");
        jTextField5.setToolTipText("vat Percentage");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel1.setText("Customer Name:");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel11.setText("Net Amount:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel3.setText("Select Product:");

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jTextField10.setText("1-jan-2016");
        jTextField10.setToolTipText("insert date into this format \"dd-mmm-year\" example:-1-jan-2016");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setText("Total VAT:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("Paid:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel4.setText("Quantity:");

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField8.setText("0");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jTextField15.setText("0");
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setMnemonic('S');
        jButton3.setText("Save");
        jButton3.setToolTipText("Save the information");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setMnemonic('E');
        jButton4.setText("Exit");
        jButton4.setToolTipText("Exit the form");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setMnemonic('P');
        jButton5.setText("Print");
        jButton5.setToolTipText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel16.setText("Goods OF Value:");

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel17.setText("Expire Date:");

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel18.setText("Address:");

        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel19.setText("Mobile no:");

        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel20.setText("Packet:");

        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel21.setText("Total Goods of value:");

        jTextField21.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButton6.setText("+");
        buttonGroup1.add(jButton6);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButton7.setText("-");
        buttonGroup1.add(jButton7);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton3)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel14)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jButton4)
                                                .addGap(27, 27, 27)
                                                .addComponent(jButton5))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton2))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel21)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton7)))))
                                .addGap(0, 15, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6)
                        .addComponent(jButton7))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jButton5)))
                .addGap(26, 26, 26))
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       addData();
       gtot+=Double.parseDouble(jTextField9.getText());
       gdis+=Double.parseDouble(jTextField15.getText());
       gvat+=Double.parseDouble(jTextField14.getText());
       jTextField11.setText(String.valueOf(gvat));
       jTextField12.setText(String.valueOf(gdis));
       jTextField13.setText(String.valueOf(gtot));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
       double tot=Double.parseDouble(jTextField21.getText());
       //jTextField6.setText(String.valueOf(tot));
       double vrate=tot*(Double.parseDouble(jTextField5.getText())/100);
       jTextField14.setText(String.valueOf(vrate));
       double net=vrate+tot;
       jTextField9.setText(String.valueOf(net));
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
      
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        gtot-=Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 11).toString());
        gdis-=Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 9).toString());
        gvat-=Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 10).toString());
        jTextField11.setText(String.valueOf(gvat));
        jTextField12.setText(String.valueOf(gdis));
        jTextField13.setText(String.valueOf(gtot));
        model.removeRow(jTable1.getSelectedRow());
        cn--;
    }//GEN-LAST:event_jButton2ActionPerformed
    public void selectSalesPrice()//this method selects the selling price of the product
    {
        try{
            ResultSet res=con.createStatement().executeQuery("select MRP,SRATE,EXD,FORMAT from Purchase_tab where Pname='"+(String)jComboBox2.getSelectedItem()+"'");
            if(res.next()){
                jTextField3.setText(String.valueOf(res.getDouble("MRP")));
                jTextField16.setText(String.valueOf(res.getDouble("SRATE")));
                jTextField17.setText(res.getDate("EXD").toString());
                jTextField20.setText(res.getString("FORMAT"));
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Selling Price not set...!");
            }
            //res.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }
    public void selectPercentage()//select the percentage of the customer
    {
        try{
            String cname=(String)jComboBox1.getSelectedItem();
            String pname=(String)jComboBox2.getSelectedItem();
            String sql="select per from per_tab where cname='"+cname+"' and pname='"+pname+"'";
            Statement stm=con.createStatement();
            ResultSet rs=stm.executeQuery(sql);
            if(rs.next())
            {
                jTextField4.setText(String.valueOf(rs.getDouble("per")));
            }
            else
            {
                jTextField4.setText(String.valueOf(0.0));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }
    public void selectCustomer()//view the customer names
    {
        try{
            Statement pst=con.createStatement();
            ResultSet res=pst.executeQuery("select cname from CUSTOMER_TAB");
            while(res.next())
            {
                jComboBox1.addItem(res.getString("cname"));
            }
            //res.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
        
    }
    public void selectProduct()//set the product name to the product combobox 
    {
        try{
            Statement pst=con.createStatement();
            ResultSet res=pst.executeQuery("select Pname from Purchase_tab");
            while(res.next())
            {
                jComboBox2.addItem(res.getString("Pname"));
            }
            //res.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
        
    }
    public void checkQuantity()//check the storage of nutritions
    {
        try{
            Statement pst=con.createStatement();
            ResultSet res=pst.executeQuery("select quan from purchase_tab where pname='"+(String)jComboBox2.getSelectedItem()+"'");
            int q=0;
            if(res.next())
            {
                q=res.getInt("quan");
            }
            if(q>=Integer.parseInt(jTextField2.getText()))
            {
                jTextField3.setEnabled(true);
                jTextField6.setText(String.valueOf(Double.parseDouble(jTextField3.getText())*Integer.parseInt(jTextField2.getText())));
                jTextField21.setText(String.valueOf(Double.parseDouble(jTextField16.getText())*Integer.parseInt(jTextField2.getText())));
            }
            else
            {
                jTextField3.setEnabled(false);
                JOptionPane.showMessageDialog(rootPane, "Requested goods no avilable...!");
            }
            res.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       productEntry();
       saveTransaction();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        selectProduct();
        selectCustomer();
    }//GEN-LAST:event_formWindowOpened

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
       double bal=Double.parseDouble(jTextField7.getText())-gtot;
       if(bal>=0)
       {
           jTextField8.setText(String.valueOf(0));
       }
       else{
           jTextField8.setText(String.valueOf(gtot-Double.parseDouble(jTextField7.getText())));
       }
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        checkQuantity();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
       double tot=Double.parseDouble(jTextField3.getText())*Integer.parseInt(jTextField2.getText());
       double drate=tot*(Double.parseDouble(jTextField4.getText())/100);
       jTextField15.setText(String.valueOf(drate));
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        selectSalesPrice();
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
            Print_bill pb=new Print_bill();
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
           model1.addRow(new Object[]{"","","","","","Health & Fitness"});
           model1.addRow(new Object[]{"Name:",jComboBox1.getSelectedItem(),"","","","","","","Bill no:",jTextField1.getText(),"",""});
           model1.addRow(new Object[]{"Address:",jTextField18.getText(),"","","","","","","Date:",jTextField10.getText(),"",""});
           model1.addRow(new Object[]{"Mobile no:",jTextField19.getText(),"","","","","","","","","",""});
           model1.addRow(new Object[]{"","","","","","","","","","","",""});
           model1.addRow(new Object[]{"","","","","","","","","","","",""});
           model1.addRow(new Object[]{"","","","","","","","","","","",""});
           model1.addRow(new Object[]{"Sr.no","Particulars","Exp.Dt","Pack","MRP","QTY","TOT","Value Of good","TOT","DIS/TAX","VAT(%)","NET"});
           int rc=jTable1.getRowCount();
           /*TableColumn col1;
           col1=pb.jTable1.getColumn(evt);
           col1.setWidth(150);*/
           
           for(int i=0;i<rc;i++)
           {
            model1.addRow(new Object[]{jTable1.getValueAt(i, 0),jTable1.getValueAt(i, 1),
                jTable1.getValueAt(i, 2),jTable1.getValueAt(i, 3),jTable1.getValueAt(i, 4),
               jTable1.getValueAt(i, 5),jTable1.getValueAt(i, 6),jTable1.getValueAt(i, 7),
               jTable1.getValueAt(i, 8),jTable1.getValueAt(i, 9),jTable1.getValueAt(i, 10),
               jTable1.getValueAt(i, 11)});   
           }
           model1.addRow(new Object[]{"","","","","","","","","","","",""});
           model1.addRow(new Object[]{"","","","","","","","","","","",""});
           model1.addRow(new Object[]{"","","","","","","","Total Vat:",jTextField11.getText()});
           model1.addRow(new Object[]{"","","","","","","","Total Discount:",jTextField12.getText()});
           model1.addRow(new Object[]{"","","","","","","","Net Amount:",jTextField13.getText()});
           model1.addRow(new Object[]{"","","","","","","","Paid:",jTextField7.getText()});
           model1.addRow(new Object[]{"","","","","","","","Balance:",jTextField8.getText()});
           pb.jTable1.setModel(model1);
           pb.jTable1.setFont(new Font("Arial", Font.PLAIN, 11));
           pb.setVisible(rootPaneCheckingEnabled);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    public void selectCustomerInfo()//this method show the information of the costumer
    {
        try{
            String name=(String)jComboBox1.getSelectedItem();
            Statement pst=con.createStatement();
            ResultSet rs=pst.executeQuery("select * from customer_tab where cname='"+name+"'");
            if(rs.next())
            {
                jTextField18.setText(rs.getString("ADDER"));
                jTextField19.setText(rs.getString("MNO"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
      selectCustomerInfo();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       //rt="discount";
      //setColumn();
       double gbv=Double.parseDouble(jTextField21.getText());
       double dis=Double.parseDouble(jTextField4.getText());
       double amnt=gbv*dis/100;
       //double vat=Double.parseDouble(jTextField14.getText());
       jTextField15.setText(String.valueOf(amnt));
       double net=Double.parseDouble(jTextField21.getText());
       jTextField21.setText(String.valueOf(net+amnt));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       //rt="tax";
       //setColumn();
       double gbv=Double.parseDouble(jTextField21.getText());
       double dis=Double.parseDouble(jTextField4.getText());
       double amnt=gbv*dis/100;
       //double vat=Double.parseDouble(jTextField14.getText());
       jTextField15.setText(String.valueOf(amnt));
       double net=Double.parseDouble(jTextField21.getText());
       jTextField21.setText(String.valueOf(net-amnt));
    }//GEN-LAST:event_jButton7ActionPerformed
    public void saveTransaction()
    {
        try{
            String bno=jTextField1.getText();
            String cname=(String)jComboBox1.getSelectedItem();
             gvat=Double.parseDouble(jTextField11.getText());
             gdis=Double.parseDouble(jTextField12.getText());
             gtot=Double.parseDouble(jTextField13.getText());
             double paid=Double.parseDouble(jTextField7.getText());
             double bal=Double.parseDouble(jTextField8.getText());
             String edt=jTextField10.getText();
             String sql="insert into SALE_TAB values('"+bno+"','"+cname+"',"+gvat+","+gdis+","+gtot+","+paid+","+bal+",'"+edt+"')";
             stm=con.createStatement();
             stm.executeQuery(sql);
             updatePurchase();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }
    public void updatePurchase()
    {
        try{
            Statement pst=con.createStatement();
            String sql="update purchase_tab set quan=quan-"+jTextField2.getText()+" where pname='"+(String)jComboBox2.getSelectedItem()+"'";
            pst.execute(sql);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }
    public void productEntry()//product entry for the customer
    {
        try{
            int rcnt=jTable1.getRowCount();
            for(int i=0;i<rcnt;i++)
            {
                String bno=jTextField1.getText();
                String cname=(String)jComboBox1.getSelectedItem();
                String pname=(String)jTable1.getValueAt(i, 1);
                String edt=jTextField10.getText();
                double mrp=Double.parseDouble(jTable1.getValueAt(i, 4).toString());
                int qty=Integer.parseInt(jTable1.getValueAt(i, 5).toString());
                double mrpt=Double.parseDouble(jTable1.getValueAt(i, 6).toString());
                double rate=Double.parseDouble(jTable1.getValueAt(i, 7).toString());
                double trate=Double.parseDouble(jTable1.getValueAt(i, 8).toString());
                double drate=Double.parseDouble(jTable1.getValueAt(i, 9).toString());
                double vat=Double.parseDouble(jTable1.getValueAt(i, 10).toString());
                double net=Double.parseDouble(jTable1.getValueAt(i, 11).toString());
                String sql="insert into SALESCONT_TAB values('"+bno+"','"+cname+"','"+pname+"',"+mrp+","+qty+","+mrpt+","+rate+","+trate+","+drate+","+vat+","+net+",'"+edt+"')";
                stm=con.createStatement();
                stm.execute(sql);
            }
            JOptionPane.showMessageDialog(rootPane, "Add all Data","Data Saved...!",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }
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
            java.util.logging.Logger.getLogger(sales_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sales_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sales_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sales_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new sales_form().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(sales_form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
