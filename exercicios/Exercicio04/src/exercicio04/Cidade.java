package exercicio04;

public class Cidade {
    
    private int codigo;
    private String nome;
    private String uf;
    
    public Cidade(int codigo, String nome, String uf) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setUf(uf);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Codigo " + this.getCodigo() + " Nome: " + this.getNome() + " Estado: " + this.getUf() + "\n\n";
    }
    
}
