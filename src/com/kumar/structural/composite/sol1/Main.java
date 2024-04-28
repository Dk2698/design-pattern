package com.kumar.structural.composite.sol1;

public class Main {

    public static void main(String[] args) {
        final Directory movieDirectory = new Directory("movie");

        final File mazeRunner = new File("maze runner");
        movieDirectory.add(mazeRunner);

        final Directory actionMovieDirectory = new Directory("ActionMovie");
        final File xman = new File("x man");
        actionMovieDirectory.add(xman);

        movieDirectory.add(actionMovieDirectory);

        movieDirectory.ls();
    }
}
