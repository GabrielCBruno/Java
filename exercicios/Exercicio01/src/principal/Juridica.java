package principal;

import javax.swing.JOptionPane;

public class Juridica extends Pessoa{
    
    private String cnpj;
    
   public Juridica() {
       super();
       this.cnpj = JOptionPane.showInputDialog("Digite o seu cnpj");
   }

    public String getCnpj() {
        return cnpj;
    }
   
}
