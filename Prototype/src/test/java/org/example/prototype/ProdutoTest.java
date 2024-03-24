package org.example.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Produto produto = new Produto(123, "Camisa", new Modelo("Esportiva", 4));

        Produto produtoClone = produto.clone();
        produtoClone.setCodigo(456);
        produtoClone.setNome("Camiseta");
        produtoClone.getModelo().setQuantidade(2);

        assertEquals("Produto{código = 123, nome ='Camisa', Modelo =Modelo{modelo ='Esportiva', Quantidade =4}}", produto.toString());
        assertEquals("Produto{código = 456, nome ='Camiseta', Modelo =Modelo{modelo ='Esportiva', Quantidade =2}}", produtoClone.toString());
    }

}