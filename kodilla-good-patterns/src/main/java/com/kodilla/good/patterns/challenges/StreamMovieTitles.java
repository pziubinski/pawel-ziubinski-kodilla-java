package com.kodilla.good.patterns.challenges;

import java.util.List;

import java.util.stream.Collectors;

public class StreamMovieTitles {
    public static void main(String[] args) {

        String mapa = MovieStore.getMovies().entrySet().stream()
                .map(entry -> entry.getValue())
                .flatMap(List::stream)
                .collect(Collectors.joining(" ! ", "",""));

        System.out.println(mapa);

    }
}
