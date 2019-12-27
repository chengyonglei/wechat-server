package com.bc.wechat.server.service.impl;

import com.bc.wechat.server.entity.User;
import com.bc.wechat.server.entity.UserRela;
import com.bc.wechat.server.mapper.UserRelaMapper;
import com.bc.wechat.server.service.UserRelaService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 用户关系业务类实现类
 *
 * @author zhou
 */
@Service("userRelaService")
public class UserRelaServiceImpl implements UserRelaService {

    @Resource
    private UserRelaMapper userRelaMapper;

    /**
     * 检查是否好友关系
     *
     * @param paramMap 参数map
     * @return true:是  false:否
     */
    @Override
    public boolean checkIsFriend(Map<String, String> paramMap) {
        List<UserRela> userRelaList = userRelaMapper.getUserRelaListByUserIdAndFriendId(paramMap);
        if (CollectionUtils.isEmpty(userRelaList)) {
            return false;
        }
        return true;
    }

    /**
     * 获取好友列表
     *
     * @param userId 用户ID
     * @return 好友列表
     */
    @Override
    public List<User> getFriendList(String userId) {
        return userRelaMapper.getFriendList(userId);
    }

    /**
     * 删除好友
     *
     * @param paramMap 参数map
     *                 包含用户ID和好友ID
     */
    @Override
    public void deleteFriend(Map<String, String> paramMap) {
        userRelaMapper.deleteFriend(paramMap);
    }
}
