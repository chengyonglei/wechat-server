package com.bc.wechat.server.entity;

import com.bc.wechat.server.utils.CommonUtil;

import java.io.Serializable;
import java.util.List;

/**
 * 用户
 *
 * @author zhou
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private String userId;
    private String userWxId;
    private String userNickName;
    private String userPhone;
    private String userPassword;
    private String userImPassword;
    private String userAvatar;
    private String userHeader;
    private String userSex;
    private String userSign;
    private String userEmail;
    private String userIsEmailLinked;
    private String userQqId;
    private String userQqPassword;
    private String userIsQqLinked;
    private String userQrCode;
    private String isFriend;
    private List<User> friendList;
    private String isOwner;

    private String userWxIdModifyFlag;
    private String userLastestMomentsPhotos;

    private String friendSource;

    /**
     * 好友相关
     */
    private String userFriendPhone;
    private String userFriendRemark;
    private String userFriendDesc;

    private String isStarFriend;

    public User() {

    }

    public User(String userNickName, String userPhone, String userPassword) {
        this.userId = CommonUtil.generateId();
        this.userNickName = userNickName;
        this.userPhone = userPhone;
        this.userPassword = userPassword;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserWxId() {
        return userWxId;
    }

    public void setUserWxId(String userWxId) {
        this.userWxId = userWxId;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserImPassword() {
        return userImPassword;
    }

    public void setUserImPassword(String userImPassword) {
        this.userImPassword = userImPassword;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserHeader() {
        return userHeader;
    }

    public void setUserHeader(String userHeader) {
        this.userHeader = userHeader;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserSign() {
        return userSign;
    }

    public void setUserSign(String userSign) {
        this.userSign = userSign;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserIsEmailLinked() {
        return userIsEmailLinked;
    }

    public void setUserIsEmailLinked(String userIsEmailLinked) {
        this.userIsEmailLinked = userIsEmailLinked;
    }

    public String getUserQqId() {
        return userQqId;
    }

    public void setUserQqId(String userQqId) {
        this.userQqId = userQqId;
    }

    public String getUserQqPassword() {
        return userQqPassword;
    }

    public void setUserQqPassword(String userQqPassword) {
        this.userQqPassword = userQqPassword;
    }

    public String getUserIsQqLinked() {
        return userIsQqLinked;
    }

    public void setUserIsQqLinked(String userIsQqLinked) {
        this.userIsQqLinked = userIsQqLinked;
    }

    public String getUserQrCode() {
        return userQrCode;
    }

    public void setUserQrCode(String userQrCode) {
        this.userQrCode = userQrCode;
    }

    public String getIsFriend() {
        return isFriend;
    }

    public void setIsFriend(String isFriend) {
        this.isFriend = isFriend;
    }

    public List<User> getFriendList() {
        return friendList;
    }

    public void setFriendList(List<User> friendList) {
        this.friendList = friendList;
    }

    public String getIsOwner() {
        return isOwner;
    }

    public void setIsOwner(String isOwner) {
        this.isOwner = isOwner;
    }

    public String getUserWxIdModifyFlag() {
        return userWxIdModifyFlag;
    }

    public void setUserWxIdModifyFlag(String userWxIdModifyFlag) {
        this.userWxIdModifyFlag = userWxIdModifyFlag;
    }

    public String getUserLastestMomentsPhotos() {
        return userLastestMomentsPhotos;
    }

    public void setUserLastestMomentsPhotos(String userLastestMomentsPhotos) {
        this.userLastestMomentsPhotos = userLastestMomentsPhotos;
    }

    public String getFriendSource() {
        return friendSource;
    }

    public void setFriendSource(String friendSource) {
        this.friendSource = friendSource;
    }

    public String getUserFriendPhone() {
        return userFriendPhone;
    }

    public void setUserFriendPhone(String userFriendPhone) {
        this.userFriendPhone = userFriendPhone;
    }

    public String getUserFriendRemark() {
        return userFriendRemark;
    }

    public void setUserFriendRemark(String userFriendRemark) {
        this.userFriendRemark = userFriendRemark;
    }

    public String getUserFriendDesc() {
        return userFriendDesc;
    }

    public void setUserFriendDesc(String userFriendDesc) {
        this.userFriendDesc = userFriendDesc;
    }

    public String getIsStarFriend() {
        return isStarFriend;
    }

    public void setIsStarFriend(String isStarFriend) {
        this.isStarFriend = isStarFriend;
    }
}
