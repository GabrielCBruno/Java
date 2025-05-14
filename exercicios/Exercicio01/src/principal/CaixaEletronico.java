package principal;

import static java.lang.System.exit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CaixaEletronico {
    
    private Conta c;
    private ArrayList<Conta> contasCadastradas = new ArrayList<Conta>();
    
    public void sacar(float valorSaque) {
        if (c.getSaldo() < valorSaque) {
            JOptionPane.showMessageDialog(null, "Impossível sacar! O valor superior ao da conta!");
        }else {
            JOptionPane.showMessageDialog(null, "Saldo sacado!");
            c.setSaldo(c.getSaldo() - valorSaque);
        }
    }
    
    public void depositar(float ValorDep) {
        c.setSaldo(c.getSaldo() + ValorDep);
        JOptionPane.showMessageDialog(null, "Valor depositado na conta com sucesso!");
    }
    
    public void verificarSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo da conta: " + c.getSaldo());
    }
    
    public void transferir(Conta numContaDestino, float valor) {
        if (contasCadastradas.contains(numContaDestino)) {
            //Conta Encontrada
            int numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua conta"));
            Conta ContaOrigem = null;
            for (int i=0; i < contasCadastradas.size(); i++) { 
                if (numConta == contasCadastradas.get(i).getNumConta()) {
                    //Achou!
                    ContaOrigem = contasCadastradas.get(i);
                }
            }
            if (ContaOrigem == null) {
                JOptionPane.showMessageDialog(null, "A conta não foi encontrada!");
                exit(-1);
            }
            
            numContaDestino.setSaldo(numContaDestino.getSaldo() + valor);
        }else {
            //Conta Não Encontrada
            JOptionPane.showMessageDialog(null, "A conta de destino não foi encontrada! Verifique as credênciais");
        }
    }
}
