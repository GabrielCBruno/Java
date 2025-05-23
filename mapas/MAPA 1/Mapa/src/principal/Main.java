package principal;

import classes.Evento;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/* Atividade MAPA1

Sabendo disso você foi contratado para desenvolver um sistema de venda de ingressos para shows e eventos. 
Esse sistema deverá conter as seguintes regras:

- Armazenar dados de Evento: evento deverá ter como atributos, nome, data, valor único, capacidade máxima 
e uma lista de ingressos vendidos essas informações são obrigatórias. OK
- Armazenar dados de Ingresso: todo ingresso deverá ser nominal, portanto deverá ter o nome, CPF e o evento
relacionado. OK
- Devem existir 3 categorias de ingresso, Ingresso Pista, Ingresso VIP e Ingresso Camarote. OK
- Nas classes de Ingressos, devem existir um método de calcular valor do ingresso, onde Pista é o valor 
único do evento, no VIP deve-se adicionar 30% sobre o valor único do evento e no Camarote adicionar 60%. OK
- Para ingresso é preciso também um método mostrar resumo, onde mostrará o nome e o CPF do dono do ingresso
e os dados do evento, como nome do evento e a data. OK
- Para cada tipo de ingresso, crie um método imprimirValor que retorna o tipo do ingresso com o valor 
calculado. OK
- Para evento deve existir um método vender ingresso, no qual irá adicionar o ingresso criado na lista, 
verificando se não excede a capacidade máxima do evento. OK
- Para evento deve existir também um método pra mostrar a quantidade de ingressos vendidos. OK

Para funcionamento do programa, poderá ser criado uma classe Principal para que se crie os objetos e 
executem os métodos, sem ter a necessidade da criação de uma interação com usuário, os dados para os 
testes devem ser fictícios.
*/

public class Main {
    public static void main(String[] args) {
        Evento e1 = new Evento();
        e1.venderIngresso();
        e1.venderIngresso();
        e1.venderIngresso();
        e1.mostrarIngressosVendidos();
    }
}
