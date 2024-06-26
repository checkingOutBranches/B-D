package com.ssafy.bid.domain.reward.dto;

import com.ssafy.bid.domain.reward.Reward;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RewardSaveRequest {
	private String name;
	private int price;

	public Reward toEntity(int gradeNo) {
		return Reward.builder()
			.name(name)
			.price(price)
			.gradeNo(gradeNo)
			.build();
	}
}
