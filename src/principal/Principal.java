package principal;

import java.util.ArrayList;
import pessoal.Usuario;


/**
 *
 * @author GeorgeHelioMarcos
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    ArrayList<Usuario> usuarios;
    public Principal() {
        initComponents();
        usuarios = new ArrayList<>();
    }
	

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        inserirClientes = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        relacaoDividas = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Custo Mensal");

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        menuCliente.setText("Login");

        inserirClientes.setText("Cadastrar Clientes");
        inserirClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirClientesActionPerformed(evt);
            }
        });
        menuCliente.add(inserirClientes);

        jMenuItem2.setText("Logar no Sistema");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuCliente.add(jMenuItem2);

        jMenuBar1.add(menuCliente);

        menuRelatorios.setText("Relatórios");
        menuRelatorios.setEnabled(false);

        relacaoDividas.setText("Inserir Dividas");
        relacaoDividas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relacaoDividasActionPerformed(evt);
            }
        });
        menuRelatorios.add(relacaoDividas);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Lista de Dividas");
        menuRelatorios.add(jRadioButtonMenuItem1);

        jMenuBar1.add(menuRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel)
        );

        setSize(new java.awt.Dimension(610, 445));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inserirClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirClientesActionPerformed
        // Ação para instanciar a interface inserir clientes
        Clientes obj = new Clientes(usuarios);
        painel.add (obj);
        obj.setVisible(true);
    }//GEN-LAST:event_inserirClientesActionPerformed

    private void relacaoDividasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relacaoDividasActionPerformed
        // Ação para instanciar a interface dividas dos clientes
        DividasClientes obj = new DividasClientes(usuarios);
        painel.add (obj);
        obj.setVisible(true);
    }//GEN-LAST:event_relacaoDividasActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Ação para Logar no sistema
        Login obj = new Login(usuarios);
        painel.add (obj);
        obj.setVisible(true);        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem inserirClientes;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JDesktopPane painel;
    private javax.swing.JMenuItem relacaoDividas;
    // End of variables declaration//GEN-END:variables
}