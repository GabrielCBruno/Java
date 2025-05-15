package animal;

public class Cachorro extends Animal{
    
    public Cachorro(String nome, int idade) {
        super.setNome(nome);
        super.setIdade(idade);
    }

    @Override
    public void seLocomove() {
        String msg = "Cachorro: " + getNome() + "\nIdade: " + String.valueOf(getIdade());
        msg += "Cahorro correndo, com suas 4 patas.";
        System.out.println(msg);
    }

    @Override
    public void emiteSom() {
        System.out.println("AU AU !");
    }
    
}
