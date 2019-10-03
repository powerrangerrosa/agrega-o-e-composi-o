
package escola;

import java.util.ArrayList;


class Turma {
    private String nomeTurma;
    ArrayList<Alunos> alunos= new ArrayList<Alunos>();
    
    public void exibirAlunos(){
        System.out.println(alunos);
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }
    
}
