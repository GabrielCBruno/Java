package principal;

import javax.swing.JOptionPane;

class Pessoa {
    
    protected String nomePessoa;
    protected Endereco endereco;
    protected String telefone;

    public Pessoa() {
        this.nomePessoa = JOptionPane.showInputDialog("Digite o seu nome");
        this.endereco = new Endereco();
        this.telefone = JOptionPane.showInputDialog("Digite o seu telefone");
    }
    
}
