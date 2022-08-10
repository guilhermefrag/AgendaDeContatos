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
