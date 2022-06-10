package com.example.FishingReelReviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository(){
        Review president = new Review (1L, "Pflueger President", "images/president.jpg", "Mid-Range Freshwater Spinning Reels", "Wow", " It feels good in the hand, and seems to be well made as are my other pflueger reels. The seven bearings makes this exceptionally smooth-reeling.  The drag is extremely smooth and responsive. Durable aluminum and stainless steel and graphite construction. Spool comes braid-ready! The drag is sealed, so you don't have to worry about your drag corroding. This is hands down the best reel for the money at 60 dollars.", "5/5");
        Review sienna = new Review (2L, "Shimano Sienna", "images/sienna.jpg", "Budget Freshwater Spinning Reels", "Great reel for beginners, with some shortcomings", "For the price, this is an excellent reel. Drag is responsive. Instant anti-reverse works well. For only having 4 ball bearings, it reels fairly smooth. One problem with this product is it is prone to corrosion in the inner components in the drag system and bearing system, due to them not being sealed. Another issue is that the spool doesn't come braid-ready, which means it must be backed with monofilament before it can be spooled with braid. I would recommend this reel for anyone who wants a decent reel for under 40 dollars. Retail price is $34.99. ", "4/5");
        Review fierce = new Review (3L, "Penn Fierce III", "images/fierce.jpg", "Mid-Range Freshwater Spinning Reels", "Great mid-range freshwater reel", "These are great reels for light tackle, mid-low range in price and built to last. The body is durable, and constructed fully out of metal. The spool comes braid-ready. The bail is made out of a heavy-duty aluminum and isn't prone to bending. It only has 4 bearings, but the bearing system is completely shielded and protected from corrosion. It reels quite smooth too! Love this thing! Retails for around $100.00. ", "4.5/5");
        Review carbonX = new Review (4L, "Piscifun Carbon X", "images/carbonx.jpg", "Mid-Range Freshwater Spinning Reels", "Excellent product", "Piscifun makes an excellent product and this is no exception. The carbon body is light weight. The drag and reel are both smooth and responsive. Comes with a braid-ready spool. It is one of the smoothest reeling spinners I've laid my hands on. The 10 bearing are shielded, which prevents corrosion. It looks great too. Retails for around $70.00. ", "4.5/5");
        Review ceymar = new Review (5L, "Okuma Ceymar", "images/ceymar.jpg", "Mid-Range Freshwater Spinning Reels", "Okuma with a win!", "Awesome reel. Probably one of the smoothest-casting reels I own. The drag and reel operate flawlessly. The handle is ergonomic, and the overall style is very attractive. 7 ball bearings, make this a smooth reeling spinner. The multi-disc drag system works amazing as advertised. It retails for around $45.00, which is a steal. My only complaint is, I wish the spool came braid-ready. I had to back mine with monofilament line, in order to spool it with braid, which was annoying. I love this reel!. Retails for around $45.00.", "4.5/5");

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
