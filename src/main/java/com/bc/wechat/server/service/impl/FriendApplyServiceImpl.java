package com.bc.wechat.server.service.impl;

import com.bc.wechat.server.cons.Constant;
import com.bc.wechat.server.entity.FriendApply;
import com.bc.wechat.server.entity.UserRela;
import com.bc.wechat.server.mapper.FriendApplyMapper;
import com.bc.wechat.server.mapper.UserRelaMapper;
import com.bc.wechat.server.service.FriendApplyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 好友申请业务类实现类
 *
 * @author zhou
 */
@Service("friendApplyService")
public class FriendApplyServiceImpl implements FriendApplyService {

    @Resource
    private FriendApplyMapper friendApplyMapper;

    @Resource
    private UserRelaMapper userRelaMapper;

    /**
     * 新增好友申请
     *
     * @param friendApply 好友申请
     */
    @Override
    public void addFriendApply(FriendApply friendApply) {
        friendApplyMapper.addFriendApply(friendApply);
    }

    /**
     * 接受好友申请
     *
     * @param applyId 申请ID
     */
    @Override
    public void acceptFriendApply(String applyId) {
        friendApplyMapper.acceptFriendApply(applyId);
    }

    /**
     * 根据申请ID获取好友申请
     *
     * @param applyId 申请ID
     * @return 好友申请
     */
    @Override
    public FriendApply getFriendApplyById(String applyId) {
        return friendApplyMapper.getFriendApplyById(applyId);
    }

    /**
     * 交朋友
     *
     * @param fromUserId 第一个用户ID
     * @param toUserId   第二个用户ID
     */
    @Override
    public void makeFriends(String fromUserId, String toUserId) {
        UserRela userRela = new UserRela(fromUserId, toUserId);
        UserRela friendUserRela = new UserRela(toUserId, fromUserId);

        userRela.setRelaStatus(Constant.RELA_STATUS_FRIEND);
        friendUserRela.setRelaStatus(Constant.RELA_STATUS_FRIEND);

        userRelaMapper.addUserRela(userRela);
        userRelaMapper.addUserRela(friendUserRela);
    }
}
