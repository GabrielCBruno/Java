package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Evento {
    
    private String nome;
    private Date data;
    private Double valorUnico;
    private int capacidade;
    private ArrayList<Ingresso> ingressosVendidos = new ArrayList<Ingresso>();

    public String getNome() {
        return nome;
    }

    public Date getData() {
        return data;
    }

    public Double getValorUnico() {
        return valorUnico;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public ArrayList<Ingresso> getIngressosVendidos() {
        return ingressosVendidos;
    }
    
    public Evento() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.nome = JOptionPane.showInputDialog("Digite o nome do evento");
        this.valorUnico = Double.valueOf(JOptionPane.showInputDialog("Valor do ingresso"));
        this.capacidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a capacidade total do evento"));
        do {
            try {
                this.data = sdf.parse(JOptionPane.showInputDialog("Digite a data: DD/MM/AAAA"));
                break;
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "A data digitada não permitida! Digite uma data correta!");
            }
        }while(true);
    }

    public void venderIngresso() {
        if (ingressosVendidos.size() == this.capacidade) {
            //A capacitade de pessoas neste evento foi atingida!
            JOptionPane.showMessageDialog(null, "Não é possivel vender mais ingresso para este evento! \nEvento: " + this.nome);
        }else {
            //Ainda tem ingresso para este evento!
            ingressosVendidos.add(new Ingresso(this));
            JOptionPane.showMessageDialog(null, "Ingresso Vendido!");
        }
    }
    
    public void mostrarIngressosVendidos() {
        if (!ingressosVendidos.isEmpty()) {
            String msg = "Ingressos Vendidos: " + this.ingressosVendidos.size() + "\nIngressos Restantes: " + String.valueOf(this.capacidade - this.ingressosVendidos.size());
            JOptionPane.showMessageDialog(null, msg);
        }else {
            JOptionPane.showMessageDialog(null, "Não há ingressos vendidos nesse evento!");
        }
    }
    
}
