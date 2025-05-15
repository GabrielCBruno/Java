package animal;

public class Gato extends Animal{
    
    public Gato(String nome, int idade) {
        super.setNome(nome);
        super.setIdade(idade);
    }
    
    @Override
    public void seLocomove() {
        String msg = "Gato: " + getNome() + "\nIdade: " + String.valueOf(getIdade());
        msg += "Andandando cautelosamente.";
        System.out.println(msg);
    }

    @Override
    public void emiteSom() {
        System.out.println("MIAU MIAU !");
    }
}
