package com.ssafy.bid.domain.saving.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SavingUpdateRequest {
	private int no;
	private int depositPrice;
	private int interestRate;
}
