package com.sun201.gmall.user.controller;

import com.sun201.gmall.user.bean.UmsMember;
import com.sun201.gmall.user.bean.UmsMemberReceiveAddress;
import com.sun201.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Description:
 *
 * @author sun201
 * @date 2019/10/6 3:57 PM
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "hello user";
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {

        return userService.getUserList();
    }

    @RequestMapping("/getAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getAddressListByMemberId(Long memberId) {
        return userService.getAddressList(memberId);
    }
}
