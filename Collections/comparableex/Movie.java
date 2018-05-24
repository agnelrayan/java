package com.expertzlab.Collections.comparableex;

/**
 * Created by agnel on 5/22/18.
 */
public class Movie implements Comparable<Movie> {
    private int rating;
    private String name;
    private int year;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (rating != movie.rating) return false;
        if (year != movie.year) return false;
        return name.equals(movie.name);
    }

    @Override
    public int hashCode() {
        int result = rating;
        result = 31 * result + name.hashCode();
        result = 31 * result + year;
        return result;
    }



    @Override
    public String toString() {
        return "Movie{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }



    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    public Movie(int rating,String name,int year){
        this.rating=rating;
        this.name=name;

    }

    public int compareTo(Movie o) {
       // return this.year-o.year;
        return this.name.compareTo(name);
    }
}
