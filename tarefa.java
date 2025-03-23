import javax.swing.JOptionPane;

public class tarefa {
    public static void main (String [] args ){
        String firstnumber= JOptionPane.showInputDialog("Digite o primeiro numero inteiro");
        String secondnumber= JOptionPane.showInputDialog("Digite o segundo numero inteiro");
        
        int number1= Integer.parseInt(firstnumber);
        int number2= Integer.parseInt(secondnumber);
        
        int sum = number1+number2;
        JOptionPane.showMessageDialog (null,"A soma e "+ sum,"Soma de 2 numeros inteiros", JOptionPane.PLAIN_MESSAGE);
    }
}