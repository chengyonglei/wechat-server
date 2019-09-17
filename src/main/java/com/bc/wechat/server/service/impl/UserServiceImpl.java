package com.bc.wechat.server.service.impl;

import com.bc.wechat.server.entity.User;
import com.bc.wechat.server.mapper.UserMapper;
import com.bc.wechat.server.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 用户业务类实现类
 *
 * @author zhou
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 通过用户名和密码获取用户列表(用于登录)
     *
     * @param paramMap 参数map
     * @return 用户列表
     */
    @Override
    public List<User> getUserByLogin(Map<String, String> paramMap) {
        return userMapper.getUserByLogin(paramMap);
    }

    /**
     * 新增用户
     *
     * @param user 用户
     */
    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    /**
     * 修改用户昵称
     *
     * @param paramMap 参数map
     */
    @Override
    public void updateUserNickName(Map<String, String> paramMap) {
        userMapper.updateUserNickName(paramMap);
    }

    /**
     * 修改用户微信号
     *
     * @param paramMap 参数map
     */
    @Override
    public void updateUserWxId(Map<String, String> paramMap) {
        userMapper.updateUserWxId(paramMap);
    }
}
