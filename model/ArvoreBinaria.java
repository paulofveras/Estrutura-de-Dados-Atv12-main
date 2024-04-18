package model;

public class ArvoreBinaria {
    No raiz;

    public void inserir(int chave) {
        raiz = inserirRec(raiz, chave);
    }

    public No inserirRec(No raiz, int chave) {
        if (raiz == null) {
            raiz = new No(chave);
            return raiz;
        }
        if (chave < raiz.chave)
            raiz.esquerda = inserirRec(raiz.esquerda, chave);
        else if (chave > raiz.chave)
            raiz.direita = inserirRec(raiz.direita, chave);
        return raiz;
    }

    public void buscaEmOrdem() {
        buscaEmOrdemRec(raiz);
    }

    public void buscaEmOrdemRec(No raiz) {
        if (raiz != null) {
            buscaEmOrdemRec(raiz.esquerda);
            System.out.println(raiz.chave);
            buscaEmOrdemRec(raiz.direita);
        }
    }

    public void buscaPreOrdem() {
        buscaPreOrdemRec(raiz);
    }

    public void buscaPreOrdemRec(No raiz) {
        if (raiz != null) {
            System.out.println(raiz.chave);
            buscaPreOrdemRec(raiz.esquerda);
            buscaPreOrdemRec(raiz.direita);
        }
    }

    public void buscaPosOrdem() {
        buscaPosOrdemRec(raiz);
    }

    public void buscaPosOrdemRec(No raiz) {
        if (raiz != null) {
            buscaPosOrdemRec(raiz.esquerda);
            buscaPosOrdemRec(raiz.direita);
            System.out.println(raiz.chave);
        }
    }
}
