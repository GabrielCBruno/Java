package animal;

public class Cavalo extends Animal{

    public Cavalo(String nome, int idade) {
        super.setNome(nome);
        super.setIdade(idade);
    }
    
    @Override
    public void seLocomove() {
        String msg = "Cavalo: " + getNome() + "\nIdade: " + String.valueOf(getIdade());
        msg += "Cavalga, Marcha, Trota";
        System.out.println(msg);
    }

    @Override
    public void emiteSom() {
        System.out.println("Nhiiiiiiiiiii ri ri rin !");
    }
    
}
