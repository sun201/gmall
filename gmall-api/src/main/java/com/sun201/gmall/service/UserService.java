package com.sun201.gmall.service;


import com.sun201.gmall.bean.UmsMember;
import com.sun201.gmall.bean.UmsMemberReceiveAddress;

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
