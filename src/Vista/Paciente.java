package Vista;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
//import java.sql.Connection;
/**
 *
 * @author citla
 */
public class Paciente extends javax.swing.JInternalFrame {

   Conecion conec;
   Connection cn;
    public Paciente() {
        //Conecion conec;
        //Connection cn;
        initComponents();
        conec = new Conecion();
        cn =  (Connection) conec.conectar();
        try{
            GetDatosPaciente();
        }catch(Exception e){
              Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        textField4 = new java.awt.TextField();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        textField5 = new java.awt.TextField();
        textField6 = new java.awt.TextField();
        label7 = new java.awt.Label();
        button1 = new java.awt.Button();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Paciente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NSS", "Nombre", "Apellido", "Curp", "Telefono", "Numero de sala"
            }
        ));
        jScrollPane1.setViewportView(tabla1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 550, 390));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pacientes");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 550, 440));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setName(""); // NOI18N
        label1.setText("NSS: ");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 53, -1));

        label2.setText("Nombre completo");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 107, -1));

        label3.setText("Nombre:");
        jPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 50, -1));

        label4.setText("Apellido:");
        jPanel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 50, -1));
        jPanel1.add(textField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 186, -1));

        label5.setText("Curp:");
        jPanel1.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 40, -1));

        label6.setText("Telefono de emergencia: ");
        jPanel1.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 140, -1));
        jPanel1.add(textField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 180, 190, -1));
        jPanel1.add(textField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 165, -1));

        label7.setText("Sintomas:");
        jPanel1.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        button1.setLabel("Guardar datos");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 120, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 110, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_button1ActionPerformed

    private void GetDatosPaciente() throws SQLException{
        //Conecion conec = new Conecion();
        //Connection con = conec.conectar();
        Statement stm;
        String sql ="select * from Paciente;";
        DefaultTableModel modelo = new DefaultTableModel(){
            public boolean editar(int fila, int columna){
                if(columna==6){
                    return true;
                }else{
                    return false;
                }
            }
        };
        modelo.addColumn("NSS");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Curp");
        modelo.addColumn("Telefono");
        modelo.addColumn("numero De Sala");
        
        tabla1.setModel(modelo);
        String[] datos = new  String[6];
        try{
           stm = cn.createStatement();
           ResultSet resultado = stm.executeQuery(sql);
            while(resultado.next()){
                datos[0]= resultado.getString(1);
                datos[1]= resultado.getString(2);
                datos[2]= resultado.getString(3);
                datos[3]= resultado.getString(4);
                datos[4]= resultado.getString(5);
                datos[5]= resultado.getString(6);
                modelo.addRow(datos);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private javax.swing.JTable tabla1;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    // End of variables declaration//GEN-END:variables
}
