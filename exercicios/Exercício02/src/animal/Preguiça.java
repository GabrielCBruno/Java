package animal;

public class Preguiça extends Animal{

    public Preguiça(String nome, int idade) {
        super.setNome(nome);
        super.setIdade(idade);
    }
    
    @Override
    public void seLocomove() {
        String msg = "Preguiça: " + getNome() + "\nIdade: " + String.valueOf(getIdade());
        msg += "Subindo na Árvore";
        System.out.println(msg);
    }

    @Override
    public void emiteSom() {
        System.out.println("GRRRRRRRrrrrrrr");
    }
    
}
