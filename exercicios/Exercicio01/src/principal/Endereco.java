package principal;

import javax.swing.JOptionPane;

class Endereco {
    
    private String rua;
    private int num;
    private String cidade;
    private String UF;
    
    public Endereco() {
        this.cadastrarEndereco();
    }

    public String getRua() {
        return rua;
    }

    public int getNum() {
        return num;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUF() {
        return UF;
    }
    
    public void cadastrarEndereco() {
        this.rua = JOptionPane.showInputDialog("Digite a rua");
        this.num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da casa"));
        this.cidade = JOptionPane.showInputDialog("Digite a cidade");
        this.UF = JOptionPane.showInputDialog("Digite o UF");
    }
}
