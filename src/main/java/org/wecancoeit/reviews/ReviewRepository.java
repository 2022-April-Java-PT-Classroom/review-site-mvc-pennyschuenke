package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository() {

        Review Bell = new Review(1L, " The Bell",  "6/04/2022 slightly Sweet And Creamy with just a hint of mocha","./images/coffee3.jpg");
        Review Beast = new Review(2L, "the Beast","5/29/2022 sweet strong and full of flavor  ", "/images/coffee1.jpg");
        Review D23 = new Review(3L, "the D23 ","6/2/2022 just what you need to keep you going this is bold and amazing flavor ", "/images/coffee2.jpg");

        reviewList.put(Bell.getId(), Bell);
        reviewList.put(Beast.getId(), Beast);
        reviewList.put(D23.getId(), D23);
    }
    public ReviewRepository(Review... reviewToAdd) {
        for (Review review : reviewToAdd) {
            reviewList.put(review.getId(), review);
        }
    }


    public Review findOne(long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewList.values();
    }




}

