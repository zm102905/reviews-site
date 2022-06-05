package com.example.FishingReelReviews;

public class Review {
    private Long id;
    private String title;
    private String imageUrl;
    private String reviewCategory;
    private String content;
    private String description;
    private String rating;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getReviewCategory() {
        return reviewCategory;
    }

    public String getContent() {
        return content;
    }

    public String getDescription() {
        return description;
    }

    public String getRating() {
        return rating;
    }

    public Review(long id, String title, String imageUrl, String reviewCategory, String content, String description, String rating) {
        this.id=id;
        this.title=title;
        this.imageUrl=imageUrl;
        this.reviewCategory=reviewCategory;
        this.content=content;
        this.description=description;
        this.rating=rating;
    }
}


