/*

1. Criar a classe Contato com os seguintes atributos:
    a. Nome;
    b. Email;
    c. Telefone;
2. Definir uma classe (Pode ser chamada de Agenda) para gerenciar uma agenda telefônica capaz de armazenar 100 contatos.
3. Implementar os seguintes métodos:
    a. adicionar() : recebe um objeto e adiciona no array. Este método deverá
    retornar um boolean indicando se conseguiu ou não fazer a adição do
    contato.
    b. exibirContatos() : Imprimi uma String com os dados de todos os objetos
    contatos.
    c. remover() : remove da lista um contato pelo nome
 */

import Models.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Contatos contato = new Contatos("João", "joao@gmail.com");
        Agenda agenda = new Agenda();
        agenda.adicionar(contato);
        agenda.exibirContatos();
    }
}
