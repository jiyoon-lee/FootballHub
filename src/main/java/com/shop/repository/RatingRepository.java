package com.shop.repository;

import com.shop.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    Rating findByMemberIdAndOrderItemId(Long memberId, Long orderItemId);
}
