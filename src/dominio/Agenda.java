package dominio;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Contato> contatos = new ArrayList<>();

    public void adicinarContact(Contato contato){
        contatos.add(contato);
    }

    public void listarContatos(){
        if(contatos.isEmpty()){
            System.out.println("A lista de contatos está vazia!!!");
        }
        else{
            for(Contato c : contatos){
                System.out.println(c);
            }
        }
    }

    public void removerContact(String nome){
        for (int i = 0; i <contatos.size() ; i++) {
            if (contatos.get(i).getNome().equalsIgnoreCase(nome.trim())) {
                contatos.remove(i);
                System.out.println("Contato removido com sucesso!");
                return;}

        }
        System.out.println("Contato não encontrado!!!");
    }


}
