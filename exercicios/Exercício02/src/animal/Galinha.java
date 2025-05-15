package animal;

public class Galinha extends Animal{
    
    public Galinha(String nome, int idade) {
        super.setNome(nome);
        super.setIdade(idade);
    }
    
    @Override
    public void seLocomove() {
        String msg = "Galinha: " + getNome() + "\nIdade: " + String.valueOf(getIdade());
        msg += "Ciscando o chão.";
        System.out.println(msg);
    }

    @Override
    public void emiteSom() {
        System.out.println("có-có-có !");
    }
}
