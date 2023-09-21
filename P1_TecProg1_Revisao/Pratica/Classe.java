public class Classe {

  /*
  Classe - É semelhante a um modelo, que pode ter:
  - Atributos (características);
  - Métodos (ações);
  - Objetos (instâncias da classe).
  */

  /*
  O nome da classe sempre tem a primeira letra, de cada palavra, maiúscula.
  */

  // Exemplo:

  public class Classe1 {

    private String nome;

    public void mostrarNome(){
      System.out.println(nome);
    }

  }


  /*
  As classes podem ter modificadores de acesso, que, nesse caso, serviriam para controlar:
  - Quem consegue acessar e utilizar os elementos delas;
  - O que será herdado, quando for feita uma herança (não vimos ainda).
  */

  /*
  Tipos de modificadores de acesso:

  - Public;
  - Private;
  - Protected;
  - Friendly (ausência de modificador).
  */

  // Exemplos:

  public class Classe2{}
  private class Classe3{}
  protected class Classe4{}
  class Classe5{}


  /*
  Classes mais utilizadas nas aulas:
    
  - String (usada na hora de declarar um atributo)
  - Scanner (java.util.Scanner)
  - Math (java.lang.Math)
  */

}
