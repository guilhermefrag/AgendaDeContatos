package Models;

public class Agenda{
    private Contatos[] agenda = new Contatos[100];
    private int contador = 0;

    public Agenda() {
        
    }

    public boolean adicionar(Contatos contato) {
        if (contador < 100) {
            agenda[contador] = contato;
            contador++;
            return true;
        } else {
            return false;
        }
    }
    
    public void exibirContatos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(agenda[i].getNome() + " - " + agenda[i].getEmail() + " - " + agenda[i].getTelefone());
        }
    }

    public void remover(String nome) {
        for (int i = 0; i < contador; i++) {
            if (agenda[i].getNome().equals(nome)) {
                agenda[i] = agenda[contador - 1];
                contador--;
            }
        }
    }
    
}
