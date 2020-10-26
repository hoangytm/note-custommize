package com.programming.hoangpn.note.repository;

import com.programming.hoangpn.note.model.UserToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author PhanHoang
 * 9/16/2020
 */
@Repository
public interface UserTokenRepository extends JpaRepository<UserToken, String> {
    List<UserToken> findByToKenAndStatus(String token, Long active);

    List<UserToken> findAllByUserName(String userName);

    UserToken getUserTokenById(String id);
}
