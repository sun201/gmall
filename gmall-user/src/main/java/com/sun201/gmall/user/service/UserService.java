package com.sun201.gmall.user.service;

import com.sun201.gmall.user.bean.UmsMember;
import com.sun201.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * Description:
 *
 * @author sun201
 * @date 2019/10/6 3:58 PM
 */
public interface UserService {

    public List<UmsMember> getUserList();

    public List<UmsMemberReceiveAddress> getAddressList(Long memberId);
}
