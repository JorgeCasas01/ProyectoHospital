package Vista;
public class lnterfaz extends javax.swing.JFrame {

    /**
     * Creates new form lnterfaz
     */
    public lnterfaz() {
        initComponents();
        this.setTitle("Registro Medico");
        this.setLocationRelativeTo(null);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        VentanaPrincipal = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuMedico = new javax.swing.JMenu();
        RegistrarMedico = new javax.swing.JMenuItem();
        MenuPaciente = new javax.swing.JMenu();
        RegistrarPaciente = new javax.swing.JMenuItem();
        MenuMedicamento = new javax.swing.JMenu();
        RegistrarMedicina = new javax.swing.JMenuItem();
        MenuSala = new javax.swing.JMenu();
        RegistrarSala = new javax.swing.JMenuItem();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VentanaPrincipal.setBackground(new java.awt.Color(204, 255, 255));
        VentanaPrincipal.setToolTipText("");
        VentanaPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Title BD");
        VentanaPrincipal.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 750, 40));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        VentanaPrincipal.add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        getContentPane().add(VentanaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 468));

        MenuMedico.setText("Medico");
        MenuMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMedicoActionPerformed(evt);
            }
        });

        RegistrarMedico.setText("Registrar Medico");
        RegistrarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarMedicoActionPerformed(evt);
            }
        });
        MenuMedico.add(RegistrarMedico);

        jMenuBar1.add(MenuMedico);

        MenuPaciente.setText("Paciente");

        RegistrarPaciente.setText("Registrar Paciente");
        RegistrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarPacienteActionPerformed(evt);
            }
        });
        MenuPaciente.add(RegistrarPaciente);

        jMenuBar1.add(MenuPaciente);

        MenuMedicamento.setText("Medicamento ");

        RegistrarMedicina.setText("Registrar Medicina");
        RegistrarMedicina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarMedicinaActionPerformed(evt);
            }
        });
        MenuMedicamento.add(RegistrarMedicina);

        jMenuBar1.add(MenuMedicamento);

        MenuSala.setText("Sala");

        RegistrarSala.setText("Registrar Sala");
        RegistrarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarSalaActionPerformed(evt);
            }
        });
        MenuSala.add(RegistrarSala);

        jMenuBar1.add(MenuSala);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void MenuMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuMedicoActionPerformed

    private void RegistrarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarMedicoActionPerformed
        Medico ventanaM= new Medico();
        Escritorio.add(ventanaM);
        ventanaM.show();
    }//GEN-LAST:event_RegistrarMedicoActionPerformed

    private void RegistrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarPacienteActionPerformed
        Paciente ventanaP= new Paciente();
        Escritorio.add(ventanaP);
        ventanaP.show();
    }//GEN-LAST:event_RegistrarPacienteActionPerformed

    private void RegistrarMedicinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarMedicinaActionPerformed
        Medicamento ventanaMedicina= new Medicamento();
        Escritorio.add(ventanaMedicina);
        ventanaMedicina.show();
    }//GEN-LAST:event_RegistrarMedicinaActionPerformed

    private void RegistrarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarSalaActionPerformed
        Sala ventanaSala= new Sala();
        Escritorio.add(ventanaSala);
        ventanaSala.show();
    }//GEN-LAST:event_RegistrarSalaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu MenuMedicamento;
    private javax.swing.JMenu MenuMedico;
    private javax.swing.JMenu MenuPaciente;
    private javax.swing.JMenu MenuSala;
    private javax.swing.JMenuItem RegistrarMedicina;
    private javax.swing.JMenuItem RegistrarMedico;
    private javax.swing.JMenuItem RegistrarPaciente;
    private javax.swing.JMenuItem RegistrarSala;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel VentanaPrincipal;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    // End of variables declaration//GEN-END:variables
}
