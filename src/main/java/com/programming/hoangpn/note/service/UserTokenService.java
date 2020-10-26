package com.programming.hoangpn.note.service;

import com.programming.hoangpn.note.model.UserToken;
import com.programming.hoangpn.note.repository.UserTokenRepository;
import com.programming.hoangpn.note.utils.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.programming.hoangpn.note.utils.Constant.*;

/**
 * @author PhanHoang
 * 9/22/2020
 */
@Service
public class UserTokenService {
    @Autowired
    private UserTokenRepository userTokenRepository;

    public List<UserToken> getUserTokens() {
        return userTokenRepository.findAllByUserName(CommonService.getUserInReqest());
    }

    public UserToken getUserTokenById(String id) {
        return userTokenRepository.getUserTokenById(id);

    }

    public UserToken changeStatus(String id) {
        UserToken userToken = getUserTokenById(id);
        userToken.setStatus(userToken.getStatus().equals(ACTIVE) ? IN_ACTIVE : ACTIVE);
        userTokenRepository.save(userToken);
        return userToken;
    }

}
