package com.anshul;

public class ReviewAndRating {
    private String ReviewId;
    private String ReviewerName;
    private String ReviewDate;
    private Float Rating;

    public ReviewAndRating(String reviewId, String reviewerName, String reviewDate, Float rating) {
        this.ReviewId = reviewId;
        this.ReviewerName = reviewerName;
        this.ReviewDate = reviewDate;
        this.Rating = rating;
    }

    public String getReviewId() {
        return ReviewId;
    }

    public void setReviewId(String reviewId) {
        ReviewId = reviewId;
    }

    public String getReviewerName() {
        return ReviewerName;
    }

    public void setReviewerName(String reviewerName) {
        ReviewerName = reviewerName;
    }

    public String getReviewDate() {
        return ReviewDate;
    }

    public void setReviewDate(String reviewDate) {
        ReviewDate = reviewDate;
    }

    public Float getRating() {
        return Rating;
    }

    public void setRating(Float rating) {
        Rating = rating;
    }

    public String toString() {
        System.out.println(" ReviewId: " + ReviewId);
        System.out.println(" ReviewerName: " + ReviewerName);
        System.out.println(" ReviewDate: " + ReviewDate);
        System.out.println(" Rating: " + Rating);
        return "ReviewId: " + ReviewId + " ReviewerName: " + ReviewerName + " ReviewDate: " + ReviewDate;

    }

}
