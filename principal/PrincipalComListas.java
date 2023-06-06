package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1999);
        meuFilme.avalia(9);
        Serie lost = new Serie("lost", 2000);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        Filme filmeDoPaulo = new Filme("Dogville", 2003);

        filmeDoPaulo.avalia(10);


        List<Titulo> lista = new ArrayList<>(); // usei list para ficar generico e depois defini como Arraylist().
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        //lista.forEach(nome -> System.out.println(nome)); outro jeito de escrever o loop foreach usando lambda
        //lista.forEach(System.out::println); tbm é outro jeito mais compacto ainda.
        for (Titulo item: lista){
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            } //for each com instanceof é legado porque é má pratica, e dentro da instancia, ainda foi passado uma condição em so mostrar filmes com classificação maior que 2
        }
//        for (Titulo item: lista){
//            System.out.println(item);
//            Filme filme = (Filme) item;
//            System.out.println("Classificação: " + filme.getClassificacao());
//
//        }//for each item do titulo(variavel item foi criada por mim), corra a array e printe o nome;
        //Filme filme = (Filme) item; é um casting, ou seja, eu trasformei os items em filme, mas da erro pq a serie n é filme


        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(lista);

        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); //usando Lambda para comparar.
        System.out.println(lista);



    }
}
