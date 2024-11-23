package com.durgasoft;

import com.anshul.Movie;
import com.anshul.ReviewAndRating;

public class Main {
    public static void main(String[] args) {

        ReviewAndRating reviewAndRating1 = new ReviewAndRating("111","anshul","11-12-24",4.5f);
        ReviewAndRating reviewAndRating2 = new ReviewAndRating("222","pradhumn","11-12-24",4.0f);
        ReviewAndRating reviewAndRating3 = new ReviewAndRating("333","gopal","11-12-24",4.2f);
        ReviewAndRating[] reviewAndRatings = {reviewAndRating1, reviewAndRating2, reviewAndRating3};

        Movie movie = new Movie("bahubali", "10-12-24","rajmoli", reviewAndRatings);
        movie.getMovieDetails();
    }
}
