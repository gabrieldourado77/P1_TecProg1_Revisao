public class CamelCase {
  
  /*
  CamelCase - É um "estilo de programação", que segue algumas regras, 
  para padronizar a codificação.
  */  


  // Regras (com Exemplos)

  // Classe - A primeira letra de cada palavra, é maiúscula.
  public class Camel{}
  
  /* 
  Atributo, Método e Objeto - A primeira palavra é em letras minúsculas e á partir da segunda palavra, 
  a primeira letra de cada palavra, é maiúscula.
    
  Obs: Geralmente, os atributos e os objetos são nomeados com substantivos. 
  Já os métodos, começam com um verbo.
  */

  // Atributos
  private String nome;
  private String nomeCompleto;

  // Método
  public void mostrarNome(){
    System.out.println(nomeCompleto);
  }

  // Objeto
  Camel camelo = new Camel();

  /*
  Método Construtor - Recebe o mesmo nome da classe, em que ele foi criado.
  Portanto, cada palavra do nome dele, deve ter a primeira letra maiúscula.
  */

   public CamelCase(){

   }

}
