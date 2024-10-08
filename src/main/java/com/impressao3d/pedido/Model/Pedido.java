package com.impressao3d.pedido.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "andares", nullable = false)
    private int andares;

    @Column(name = "cor1", nullable = false)
    private String cor1;

    @Column(name = "cor2", nullable = false)
    private String cor2;

    @Column(name = "cor3", nullable = false)
    private String cor3;

    @Column(name = "desenho1", nullable = false)
    private String desenho1;

    @Column(name = "desenho2", nullable = false)
    private String desenho2;

    @Column(name = "desenho3", nullable = false)
    private String desenho3;

    // {
    //     "andares": 3, 
    //     "cor1": "vermelho",
    //     "cor2": "azul",
    //     "cor3": "amarelo",
    //     "desenho1": "estrela",
    //     "desenho2": "circulo",
    //     "desenho3": "quadrado"
    //   }

    public Pedido(int andares, String cor1, String cor2, String cor3,
    String desenho1, String desenho2, String desenho3){
        this.andares = andares;
        this.cor1 = cor1;
        this.cor2 = cor2;
        this.cor3 = cor3;
        this.desenho1 = desenho1;
        this.desenho2 = desenho2;
        this.desenho3 = desenho3;
        
    }
      

}
