
import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ra21551055
 */
@Entity
public class Cliente {
    
    private String nome;
    private String teste;
    private String End;
    private int idade;
    @Id
    private int Ra;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return End;
    }
    public void setEnd(String End) {
        this.End = End;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRa() {
        return Ra;
    }

    public void setRa(int Ra) {
        this.Ra = Ra;
    }
    
}
