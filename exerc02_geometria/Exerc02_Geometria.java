// Aluna: NATANY ABREU DIAS 04188294
package exerc02_geometria;

import dimensao.bidimensional.TrianguloRetangulo;

public class Exerc02_Geometria {

    public static void main(String[] args) {
        TrianguloRetangulo tr1 = new TrianguloRetangulo();
        
        // TODO 4 apague as linhas de acesso direto aos atributos
        ///////// sabemos que este tipo de acesso é prejudical para o projeto,
        /// porque viola o princípio do encapsulamento,
        /// tornando o código menos seguro e mais difícil de manter.
        /// O ideal é usar métodos getters e setters para controlar o acesso
        /// e validação dos dados.

        
        // TODO 5 através do set, atribua valor 14.5 para o atributo cateto1
        tr1.setCateto1(14.5);
        // TODO 6 através do set, atribua valor 48.1 para o atributo cateto2
        tr1.setCateto2(48.1);
        // TODO 7 através do set, atribua valor 51.2 para o atributo hipotenusa
        tr1.setHipotenusa(51.2);
        // TODO 8 através do set, atribua valor 12.3 para o atributo alturaHipotenusa
        tr1.setAlturaHipotenusa(12.3);
        
        // TODO 9 comente: as atribuições deram certo? Por quê?
        // Sim, pois usamos os métodos setters, que permitem alterar os
        // valores dos atributos de forma controlada e segura.
        
        // TODO 10 crie aqui uma variável double de nome areaTr1
        double areaTr1;

        // TODO 11 através do objeto tr1, acesse o método calcArea() da classe TrianguloRetangulo 
        ////////// e armazene o valor de retorno do método na variável areaTr1
        areaTr1 = tr1.calcArea();

        // TODO 12 imprima o valor da área da seguinte forma: "Área do triângulo tr1: <VALOR>"
        System.out.println("Área do triângulo tr1: " + areaTr1);

        // TODO 13 comente: por que está dando erro?
        // Pois provavelmente o método calcArea() não está implementado ou não
        // está acessível (pode estar privado ou não existir na classe
        // TrianguloRetangulo).

        // TODO 14 comente: o que pode ser feito para resolver este erro?
        // Para resolver o erro, é necessário implementar o método calcArea()
        // na classe TrianguloRetangulo e garantir que ele seja público.

        // TODO 16 crie aqui uma variável double de nome perimetroTr1
        double perimetroTr1;

        // TODO 17 através do objeto tr1, acesse o método calcPerimetro() da classe TrianguloRetangulo 
        ////////// e armazene o valor de retorno do método na variável perimetroTr1
        perimetroTr1 = tr1.calcPerimetro();

        // TODO 18 imprima o valor do perímetro da seguinte forma: "Perímetro do triângulo tr1: <VALOR>"
        System.out.println("Perímetro do triângulo tr1: " + perimetroTr1);
        
        // TODO 19 comente: por que está dando erro?
        // Está dando erro porque o método calcPerimetro() pode não estar 
        // implementado ou não está acessível na classe TrianguloRetangulo.

        // TODO 20 comente: o que pode ser feito para resolver este erro?
        // Deve-se implementar o método calcPerimetro() na classe 
        // TrianguloRetangulo e torne-o público.
        
        // TODO 21 crie um outro objeto através do construtor, passando um valor inválido
        TrianguloRetangulo tr2 = new TrianguloRetangulo(-5, 0, -10, -2);
        
        // TODO 22 através do objeto da tarefa anterior, chame os métodos calcArea() e calcPerimetro()
        double areaTr2 = tr2.calcArea();
        double perimetroTr2 = tr2.calcPerimetro();
        
        // TODO 23 imprima os valores dos cálculos
        System.out.println("Área do triângulo tr2: " + areaTr2);
        System.out.println("Perímetro do triângulo tr2: " + perimetroTr2);
        
        // TODO 24 comente: o que acontece? o que fazer para consertar este problema?
        // É necessário validar os valores no construtor e nos setters da classe
        // TrianguloRetangulo, impedindo a atribuição de valores negativos ou zero.
        
    }
    
}
