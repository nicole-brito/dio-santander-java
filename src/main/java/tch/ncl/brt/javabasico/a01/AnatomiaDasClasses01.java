package tch.ncl.brt.javabasico.a01;

public class AnatomiaDasClasses01 {
    //Aula 01
    //Se é uma classe executável, tem que ter um método main (psvm)
    public static void main(String[] args) {

/*         Aula 02
    Variável: camelCase
    Classe: PascalCase
    Constante: UPPERCASE
    Método: camelCase
    Pacote: lowercase

    final String BR = "Brasil" = final não pode ser alterada (é uppercase = constante)
    final double PI = 3.14159;
    int ANO_2021 = 2021;

    int num$um = 1; //não é recomendado, mas é permitido
    int _numUm = 1; //não é recomendado, mas é permitido
    int numUm = 1; //recomendado
    int num1 = 1; //recomendado
*/
        int num$1 = 1;
        System.out.println(num$1);

/*          Aula 03
    Declaração de variáveis e métodos
    int idade = 10;
    double preco = 10.5;
    Dog spike; //declaração de variável sem valor, pois não foi instanciada

            Declaração de Método      ↆ = "Falar, Fazer, Agir"
        TipoRetorno NomeObjetivonoInfinitivo(TipoParametro nomeParametro) {
            //corpo do método
            return null;
        }
 */
        String nome = "Nicole";
        String sobrenome = "Brito";

        System.out.println(nomeCompleto(nome, sobrenome));
    }
    public static String nomeCompleto (String nome, String sobrenome) {
        //return nome + " " + sobrenome;
        return "Resultado do método: " + nome.concat(" ").concat(sobrenome);
    }

/*          Aula 05
    Java Beans
    Formas de escrita universal para classes, atributos, métodos e pacotes. Como por ex: Deve ser sempre em apenas um idioma.

    > Variáveis: Devem ser no singular, exceto se for um array ou coleção. Ex: nome, email
    > Métodos: Devem ser no infinitivo, como verbos. Ex: calcularSalario()
    > Classes: Devem ser substantivos. Ex: Aluno
    > Pacotes: Devem ser em minúsculo. Ex: edu.nicole
    > Constantes: Devem ser em maiúsculo. Ex: PI
*/
}
