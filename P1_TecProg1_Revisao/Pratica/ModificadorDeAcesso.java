public class ModificadorDeAcesso {

    /*
    Modificadores de Acesso - Servem para controlar:
    - Quem consegue acessar e utilizar os elementos;
    - O que será herdado, quando for feita uma herança (não vimos ainda).
    */
    
    /*
    Eles podem ser usados em:
    - Classes;
    - Atributos;
    - Métodos;
    */

    /*
    Tipos de modificadores:

    - Public - Permite que um elemento seja utilizado por outro, sem restrição.

    - Private - Permite que um elemento seja utilizado, apenas, 
    pela classe, em que ele foi criado.

    - Protected - Permite que um elemento seja utilizado, apenas, 
    pela classe, em que ele foi criado e as suas classes filhas (herança).

    - Friendly - É a ausência de modificador. Nesse caso, o elemento só pode ser usado por outro, 
    se ambos estiverem na mesma pasta.
    */


  // Exemplos:

  public class Modificador{} // Classe pública
  private String modificador; // Atributo privado
  
  // Método protegido
  protected void mostrarOlaMundo(){
    System.out.println("Olá, mundo!");
  }

  String nomeMod; // Atributo sem modificador (friendly)

}
