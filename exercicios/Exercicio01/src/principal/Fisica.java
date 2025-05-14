package principal;

import javax.swing.JOptionPane;

public class Fisica extends Pessoa{
    
    private String cpf;
   
    public Fisica() {
        super();
        this.cpf = JOptionPane.showInputDialog("Digite o seu cpf");
    }
    
    public String getCpf() {
        return cpf;
    }

}
