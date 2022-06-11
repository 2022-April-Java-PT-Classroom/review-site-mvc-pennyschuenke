package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;

public class ReviewRepositoryTest {
    private ReviewRepository underTest;
    private Review reviewOne = new Review(1L, "review one name ", " description","");
    private Review reviewTwo = new Review(2L, "review two name ", " description","");

    @Test
    public void shouldFindReviewOne() {
        ReviewRepository underTest = new ReviewRepository(reviewOne);
        Review foundReviews = underTest.findOne(1L);
        assertEquals(foundReviews, reviewOne);
    }

    @Test
    public void shouldFindReviewsOneAndReviewsTwo() {
        underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);
    }
}
