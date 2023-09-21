public class VetorDeObjetos {
  
  /*
  Vetor de Objetos - É um vetor, que possui um objeto, em cada espaço dele. 
  Sendo que, esses objetos, geralmente, surgiram da mesma classe.
  */

  // Exemplo

  // Criei um atributo.
  private String nome;

  // Criei dois objetos.
  VetorDeObjetos objeto1 = new VetorDeObjetos();
  VetorDeObjetos objeto2 = new VetorDeObjetos();

  // Criei um vetor.
  String[] pessoas = new String[2];

  // Coloquei cada objeto, numa posição do vetor.
  pessoas[0] = objeto1;
  pessoas[1] = objeto2;

  // No fim, cada posição, tem um objeto e cada objeto, tem o atributo nome.

}
