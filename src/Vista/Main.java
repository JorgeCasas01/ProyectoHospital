package Vista;

import java.awt.Image;
import javax.swing.Icon;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Main extends javax.swing.JFrame {
    
    private ImageIcon imagen;
    private Icon icono;

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pintarimagen(this.usuario, "src\\imagenes\\usuario (1).png");
        this.pintarimagen(this.cotraseña, "src\\imagenes\\llave.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        cotraseña = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        cajaUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        contrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(12, 113, 169));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Roboto Black", 2, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Inicio de Sesión");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 280, 30));
        titulo.getAccessibleContext().setAccessibleName("titulo");

        cotraseña.setMaximumSize(new java.awt.Dimension(40, 40));
        cotraseña.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel1.add(cotraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, 50));
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 60, 60));
        jPanel1.add(cajaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 260, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jButton1.setBackground(new java.awt.Color(8, 43, 73));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Entrar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 90, 30));
        jPanel1.add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 252, 260, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(118, 47,91)); 
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
       jButton1.setBackground(new Color(8,43,73));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        String usuario = cajaUsuario.getText();
        String contrasena = new String(this.contrasena.getPassword());
        
        if(usuario.equals("")|| contrasena.equals("")){
             javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
             cajaUsuario.requestFocus();
        }else if(usuario.equals("Juan")|| contrasena.equals("Perro16tonto")){
            javax.swing.JOptionPane.showMessageDialog(this, "Acceso Confirmado\n", "Bienvenido " + usuario, javax.swing.JOptionPane.INFORMATION_MESSAGE);
            menu ventana = new menu();
            this.setVisible(false);
            ventana.setVisible(true);
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "Contraseña o Usuario Incorrectos\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            cajaUsuario.setText("");
            this.contrasena.setText("");
            cajaUsuario.requestFocus();
        }
    }//GEN-LAST:event_jButton1MousePressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    private void pintarimagen(JLabel labl, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(labl.getWidth(), labl.getHeight(), Image.SCALE_DEFAULT));
        labl.setIcon(this.icono);
        this.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cajaUsuario;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JLabel cotraseña;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
