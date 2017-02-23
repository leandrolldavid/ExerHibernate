
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Entity (name = "tbProduto")// torna a classe visivel ao hibernate 
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //ID automatico
    private int identificador;
    @Column(name = "nome_prod")
    private String nome;
    private float preco;
    private String fabricante;

  
    public String getNome() {
        return nome;
    }
  
    public void setNome(String nome) {
        this.nome = nome;
    }
  
    public float getPreco() {
        return preco;
    }
  
    public void setPreco(float preco) {
        this.preco = preco;
    }
   
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    
    
}
