package principal;

import java.util.ArrayList;
import pessoal.Usuario;

/**
 *
 * @author GeorgeHelioMarcos
 */
public class Login extends javax.swing.JInternalFrame {

    /**
     * Creates new form Login
     */
    ArrayList<Usuario> usuarios;
    public Login(ArrayList<Usuario> usuarios) {
        initComponents();
        this.usuarios = usuarios;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblSenha = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblNotificar = new javax.swing.JTextArea();

        setClosable(true);
        setTitle("Login do Sistema");

        jLabel1.setText("Email do Usuário:");

        jLabel2.setText("Senha: ");

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogin.setText("Enviar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblNotificar.setColumns(20);
        lblNotificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNotificar.setLineWrap(true);
        lblNotificar.setRows(5);
        lblNotificar.setAutoscrolls(false);
        jScrollPane1.setViewportView(lblNotificar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(lblSenha)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Verificando Cadastros de Clientes
        String email = lblEmail.getText();
	String senha = lblSenha.getText();
	
        Usuario usuarioEncontrado = buscarUsuario(email, senha, usuarios);
		if(usuarioEncontrado != null){
		      lblNotificar.setText("Usuário encontrado! \nAperte X para fechar");
                      
                   }else{
			lblNotificar.setText("Usuário não encontrado! \nOu os dados estão inválidos!");
		}
        
	
    }//GEN-LAST:event_btnLoginActionPerformed
    public Usuario buscarUsuario(String email, String senha, ArrayList<Usuario>usuarios){
        Usuario encontrado = null;

        for (Usuario usuario : usuarios) {
                if(usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)){
                        encontrado = usuario;
                        break;
                }
        }

        return encontrado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblEmail;
    private javax.swing.JTextArea lblNotificar;
    private javax.swing.JPasswordField lblSenha;
    // End of variables declaration//GEN-END:variables
}
