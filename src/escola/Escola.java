
package escola;

import java.util.ArrayList;

public class Escola {
    private String nome;
    ArrayList<Turma> turma= new ArrayList<Turma>();
    
    public void exibirTurma(){
        System.out.println(turma);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
