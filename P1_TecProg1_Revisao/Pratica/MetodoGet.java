public class MetodoGet {
    
    /*
    Método Get - É usado para "pegar" ou "obter", um valor contido em um atributo.
        
    Obs: Geralmente, os atributos de uma classe são privados e, ás vezes, 
    a única forma de outra classe acessá-los, é através de um método Get ou Set.
    */

    // Exemplo

    private String nome;

    public String getNome(){
        return nome;
    }

}
