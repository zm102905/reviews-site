package com.example.FishingReelReviews;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {

    private ReviewRepository underTest;
    private Review reviewOne = new Review(1L, "reel one", "url1", "spinning reel", "excellent", "well-designed", "5/5");
    private Review reviewTwo = new Review(2L, "reel two", "url2", "spinning reel","wow", "well-crafted product", "4/5");

    @Test
    public void shouldFindReviewOne(){
        ReviewRepository underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldFindReviewOneAndReviewTwo(){
        ReviewRepository underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review>foundReview = underTest.findAll();
        assertThat(foundReview).contains(reviewOne, reviewTwo);
    }
}
