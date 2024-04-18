package aplicacao;

import model.ArvoreBinaria;

public class Principal {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(70);
        arvore.inserir(60);
        arvore.inserir(80);

        System.out.println("Busca em ordem na árvore:");
        arvore.buscaEmOrdem();

        System.out.println("\nBusca pré-ordem na árvore:");
        arvore.buscaPreOrdem();

        System.out.println("\nBusca pós-ordem na árvore:");
        arvore.buscaPosOrdem();
    }
    
}
