package com.anshul;

public class Movie {
    private String movieName;
    private String movieReleaseDate;
    private String movieDirector;
    private ReviewAndRating[] movieReviews;

    public Movie(String movieName, String movieReleaseDate, String movieDirector, ReviewAndRating[] movieReviews) {
        this.movieName = movieName;
        this.movieReleaseDate = movieReleaseDate;
        this.movieDirector = movieDirector;
        this.movieReviews = movieReviews;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieReleaseDate(String movieReleaseDate) {
        this.movieReleaseDate = movieReleaseDate;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public void setMovieReviews(ReviewAndRating[] movieReviews) {
        this.movieReviews = movieReviews;
    }

    public void getMovieDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Movie Release Date: " + movieReleaseDate);
        System.out.println("Movie Director: " + movieDirector);
        System.out.println("Movie Reviews: ");
        for (int i = 0; i < movieReviews.length; i++) {
            System.out.println(movieReviews[i].toString());
        }
    }
}
