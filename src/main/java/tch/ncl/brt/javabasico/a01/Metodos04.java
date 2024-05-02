package tch.ncl.brt.javabasico.a01;

public class Metodos04 {
    /*
            Aula 02
    Atributos = variáveis
    Métodos = funções (sub-rotinas)

    > Convenções de nomenclatura
    1. Nomeado como verbo
    2. camelCase

    > Critérios de definir métodos
    1. Reutilização de código
    2. Modularização
    3. Propósito único
    4. Legibilidade
     */
    public class myClass {
        public double soma(double a, double b) {
            //Lógica do método
            return a + b;
        }
    }
    public void metodoVoid() {
        //VOID NÂO TEM RETURN
    }
    private void metodoPrivado() {
        System.out.println("Não pode ser acessado de fora da classe");
    }
}
