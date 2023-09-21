public class MetodoSet {

    /*
    Método Set - É usado para atribuir um valor a um atributo ou alterar ele.

    Esse método:
    - Não tem retorno, porque irá, apenas, mudar o valor de um atributo.
    Então, deve ser usado o comando "void".
    - Ele sempre precisa receber algo, por parâmetro, para ser possível realizar a mudança.
    */

    // Exemplo

    // Atributo
    private String nome;

    // Método que recebe um nome, por parâmetro.
    public void setNome(String nome){
        this.nome = nome; // O atributo nome teve o seu valor mudado. 
    }

}
