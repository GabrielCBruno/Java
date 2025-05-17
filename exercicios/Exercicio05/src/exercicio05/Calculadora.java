package exercicio05;

import javax.swing.JOptionPane;

public class Calculadora {
    
    public String soma() {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2"));
        float res = num1 + num2;
        return "A soma entre os números " + num1 + " e " + num2 + " é: " + res;
    }
    
    public String subtracao() {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2"));
        float res = num1 - num2;
        return "A subtração entre os números " + num1 + " e " + num2 + " é: " + res;
    }
    
    public String multiplicacao() {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2"));
        float res = num1 * num2;
        return "A multiplicacao entre os números " + num1 + " e " + num2 + " é: " + res;
    }
    
    public String divisao() {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1"));
        do {
           num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2"));
            if (num2 == 0) {
                JOptionPane.showMessageDialog(null, "Não é possível dividir por zero!");
            } 
        }while(num2 == 0);
        float res = num1/num2;
        return "A divisão entre os números " + num1 + " e " + num2 + " é: " + res;
    }
    
    public String quadrado() {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        float res = (float) Math.pow(num, 2);
        return "O quadrado do número " + num + " é: " + res;
    }
}
