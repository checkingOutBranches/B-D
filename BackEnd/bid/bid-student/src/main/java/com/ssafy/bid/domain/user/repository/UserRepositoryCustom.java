package com.ssafy.bid.domain.user.repository;

import java.util.List;
import java.util.Optional;

import com.ssafy.bid.domain.saving.dto.SavingTransferRequest;
import com.ssafy.bid.domain.user.dto.AccountRequest;
import com.ssafy.bid.domain.user.dto.AccountResponse;
import com.ssafy.bid.domain.user.dto.AccountsResponse;
import com.ssafy.bid.domain.user.dto.StudentRequest;
import com.ssafy.bid.domain.user.dto.StudentResponse;
import com.ssafy.bid.domain.user.dto.UserCouponsResponse;

public interface UserRepositoryCustom {
	List<UserCouponsResponse> findUserCoupons(int userNo);

	List<AccountsResponse> findAccounts(int userNo, StudentRequest studentRequest);

	Optional<StudentResponse> findStudent(int userNo);

	List<AccountResponse> findAccount(int userNo, AccountRequest accountRequest);

	List<SavingTransferRequest> findAllByIds(List<Integer> userNos);
}