package animal;

public class Avestruz extends Animal{
    
    public Avestruz(String nome, int idade) {
        super.setNome(nome);
        super.setIdade(idade);
    }
    
    @Override
    public void seLocomove() {
        String msg = "Avestruz: " + getNome() + "\nIdade: " + String.valueOf(getIdade());
        msg += "Correndo com as 2 patas.";
        System.out.println(msg);
    }

    @Override
    public void emiteSom() {
        System.out.println("TAM TAM TAM !");
    }
}
