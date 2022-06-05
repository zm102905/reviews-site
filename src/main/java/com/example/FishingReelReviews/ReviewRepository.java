package com.example.FishingReelReviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository(){
        Review president = new Review (1L, "Pflueger President", "images/president.jpg", "Mid-Range Freshwater Spinning Reels", "Wow", " It feels good in the hand, and seems to be well made as are my other pflueger reels. The seven bearings makes this exceptionally smooth-reeling. The drag is extremely smooth and responsive. Durable aluminum and stainless steel construction. This is hands down the best reel for the money", "5/5");
        Review sienna = new Review (2L, "Shimano Sienna", "images/sienna.jpg", "Budget Freshwater Spinning Reels", "Great reel for beginners, with some shortcomings", "For the price, this is an excellent reel. Drag is responsive. The only problem with this product is it is prone to corrosion in the inner components. I would recommend this reel for anyone who wants a decent reel for under 40 dollars.", "4/5");
        Review fierce = new Review (3L, "Penn Fierce III", "images/fierce.jpg", "Mid-Range Freshwater Spinning Reels", "Great mid-range freshwater reel", "These are great reels for light tackle, mid-low range in price and built to last.", "4.5/5");
        Review carbonX = new Review (4L, "Piscifun Carbon X", "images/carbonx.jpg", "Mid-Range Freshwater Spinning Reels", "Excellent product", "Piscifun makes an excellent product and this is no exception. The carbon body is light weight. The drag and reel are both smooth and responsive. It looks great too.", "4.5/5");
        Review ceymar = new Review (5L, "Okuma Ceymar", "images/ceymar.jpg", "Mid-Range Freshwater Spinning Reels", "Okuma with a win!", "Awesome reel. Probably one of the smoothest-casting reels I own. The drag and reel operate flawlessly. The handle is ergonomic, and the overall style is very attractive. I love this reel!.", "5/5");

        reviewsList.put(president.getId(), president);
        reviewsList.put(sienna.getId(), sienna);
        reviewsList.put(fierce.getId(), fierce);
        reviewsList.put(carbonX.getId(), carbonX);
        reviewsList.put(ceymar.getId(), ceymar);
    }

    public ReviewRepository(Review ...reviewsToAdd) {
        for (Review review: reviewsToAdd) {
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }

}
