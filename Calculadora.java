import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        try {
            double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º número:"));
            double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º número:"));

            String[] opcoes = {"+", "-", "×", "÷"};
            int opcao = JOptionPane.showOptionDialog(null, "Escolha a operação:", "Calculadora",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            double resultado = 0;
            switch (opcao) {
                case 0 -> resultado = n1 + n2;
                case 1 -> resultado = n1 - n2;
                case 2 -> resultado = n1 * n2;
                case 3 -> {
                    if (n2 == 0) throw new ArithmeticException("Divisão por zero!");
                    resultado = n1 / n2;
                }
            }

            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida!");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
