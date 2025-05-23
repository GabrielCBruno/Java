package classes;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Ingresso {
    
    private String nome;
    private String cpf;
    private CategoriaIngresso categoria;
    private Evento evento;

    public Ingresso(Evento evento) {
        this.nome = JOptionPane.showInputDialog("Informe o nome do comprador");
        this.cpf  = JOptionPane.showInputDialog("Informe o cpf");
        this.categoria = CategoriaIngresso.valueOf(JOptionPane.showInputDialog("Escolha: \nPISTA \nVIP \nCAMAROTE"));
        this.evento = evento;
    }
    
    public Double calcularValorIngresso() {
        Double ValorFinal = this.evento.getValorUnico();
        if (this.categoria == CategoriaIngresso.VIP){
            //Acrescimo de 30% do valor do evento!
            return ValorFinal + (ValorFinal * 3)/10;
        }else if (this.categoria == CategoriaIngresso.CAMAROTE){
            //Acrescimo de 60% do valor do evento!
            return ValorFinal + (ValorFinal * 6)/10;
        }
        //Caso o tipo seja Pista não haverá acrescimo no valor! 
        return ValorFinal;
    }
    
    public String mostraResumo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String msg = "Nome(Dono): " + this.nome + "\nCPF: " + this.cpf + "\nEvento(Nome): ";
        msg += this.evento.getNome() + "\nData: " + sdf.format(this.evento.getData()) + "\n";
        msg += this.imprimirValorIngresso();
        return msg;
    }
    
    public String imprimirValorIngresso() {
        String msg = "Ingresso Tipo: " + this.categoria + "\nValor Final: " + this.calcularValorIngresso() + "\n\n";
        return msg;
    }
}
