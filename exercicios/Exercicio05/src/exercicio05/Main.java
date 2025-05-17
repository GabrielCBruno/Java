package exercicio05;

import javax.swing.JOptionPane;

public class Main {
    
    public static int menu() {
        String msg = "- - Calculadora - - \n1- Soma \n2- Subtração \n3- Multiplicação \n4- Divisão \n5- Quadrado \n0- Sair";
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int op = 1;
        Calculadora c = new Calculadora();
        while(op != 0) {
            op = menu();
            switch(op) {
                case 1:
                    JOptionPane.showMessageDialog(null, c.soma());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, c.subtracao());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, c.multiplicacao());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, c.divisao());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, c.quadrado());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo!!!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!!!");
                    break;
            }
        }
    }
    
}
