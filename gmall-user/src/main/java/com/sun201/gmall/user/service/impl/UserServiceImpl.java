package com.sun201.gmall.user.service.impl;

import com.sun201.gmall.user.bean.UmsMember;
import com.sun201.gmall.user.bean.UmsMemberReceiveAddress;
import com.sun201.gmall.user.mapper.UserMapper;
import com.sun201.gmall.user.mapper.UserReceiveAddress;
import com.sun201.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @author sun201
 * @date 2019/10/6 3:58 PM
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserReceiveAddress userReceiveAddress;

    @Override
    public List<UmsMember> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public List<UmsMemberReceiveAddress> getAddressList(Long memberId) {
        UmsMemberReceiveAddress address = new UmsMemberReceiveAddress();
        address.setMemberId(memberId);
        List<UmsMemberReceiveAddress> select = userReceiveAddress.select(address);


        return select;
//        return userReceiveAddress.selectAll();
    }
}
