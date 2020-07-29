package com.bc.wechat.server.enums;

/**
 * 返回消息
 *
 * @author zhou
 */
public enum ResponseMsg {
    /**
     * wechat-server接口返回信息
     */
    USER_EXISTS("USER_EXISTS", "用户已存在"),

    GET_VERIFICATION_CODE_SUCCESS("GET_VERIFICATION_CODE_SUCCESS", "获取验证码成功"),
    GET_VERIFICATION_CODE_ERROR("GET_VERIFICATION_CODE_ERROR", "获取验证码失败"),

    UPDATE_USER_NICK_NAME_SUCCESS("UPDATE_USER_NICK_NAME_SUCCESS", "修改昵称成功"),
    UPDATE_USER_NICK_NAME_ERROR("UPDATE_USER_NICK_NAME_ERROR", "修改昵称失败"),

    UPDATE_USER_WX_ID_SUCCESS("UPDATE_USER_WX_ID_SUCCESS", "修改微信号成功"),
    UPDATE_USER_WX_ID_ERROR("UPDATE_USER_WX_ID_ERROR", "修改微信号失败"),

    UPDATE_USER_SEX_SUCCESS("UPDATE_USER_SEX_SUCCESS", "修改性别成功"),
    UPDATE_USER_SEX_ERROR("UPDATE_USER_SEX_ERROR", "修改性别失败"),

    UPDATE_USER_AVATAR_SUCCESS("UPDATE_USER_AVATAR_SUCCESS", "修改头像成功"),
    UPDATE_USER_AVATAR_ERROR("UPDATE_USER_AVATAR_ERROR", "修改头像失败"),

    OLD_PASSWORD_INCORRECT("OLD_PASSWORD_INCORRECT", "原密码不正确"),
    UPDATE_USER_PASSWORD_SUCCESS("UPDATE_USER_PASSWORD_SUCCESS", "密码设置成功"),
    UPDATE_USER_PASSWORD_ERROR("UPDATE_USER_PASSWORD_ERROR", "密码设置失败"),

    UPDATE_USER_SIGN_SUCCESS("UPDATE_USER_SIGN_SUCCESS", "修改签名成功"),
    UPDATE_USER_SIGN_ERROR("UPDATE_USER_SIGN_ERROR", "修改签名失败"),

    REFRESH_USER_QR_CODE_SUCCESS("REFRESH_USER_QR_CODE_SUCCESS", "刷新二维码成功"),
    REFRESH_USER_QR_CODE_ERROR("REFRESH_USER_QR_CODE_ERROR", "刷新二维码失败"),

    ADD_FRIEND_APPLY_SUCCESS("ADD_FRIEND_APPLY_SUCCESS", "好友申请发送成功"),
    ADD_FRIEND_APPLY_ERROR("ADD_FRIEND_APPLY_ERROR", "好友申请发送失败"),

    ACCEPT_FRIEND_APPLY_SUCCESS("ACCEPT_FRIEND_APPLY_SUCCESS", "接受好友申请成功"),
    ACCEPT_FRIEND_APPLY_ERROR("ACCEPT_FRIEND_APPLY_ERROR", "接受好友申请失败"),

    DELETE_FRIEND_SUCCESS("DELETE_FRIEND_SUCCESS", "删除好友成功"),
    DELETE_FRIEND_ERROR("DELETE_FRIEND_ERROR", "删除好友失败"),

    UPDATE_GROUP_NAME_SUCCESS("UPDATE_GROUP_NAME_SUCCESS", "修改群名成功"),
    UPDATE_GROUP_NAME_ERROR("UPDATE_GROUP_NAME_ERROR", "修改群名失败"),

    ADD_USER_ID_LIST_ILLEGAL("ADD_USER_ID_LIST_ILLEGAL", "添加群组成员ID格式不对"),
    REMOVE_USER_ID_LIST_ILLEGAL("REMOVE_USER_ID_LIST_ILLEGAL", "移除群组成员ID格式不对"),

    ADD_OR_REMOVE_MEMBERS_SUCCESS("ADD_OR_REMOVE_MEMBERS_SUCCESS", "添加或删除群组成员失败"),
    ADD_OR_REMOVE_MEMBERS_ERROR("ADD_OR_REMOVE_MEMBERS_ERROR", "添加或删除群组成员失败"),

    ADD_MOMENTS_SUCCESS("ADD_MOMENTS_SUCCESS", "发朋友圈成功"),
    ADD_MOMENTS_ERROR("ADD_MOMENTS_ERROR", "发朋友圈失败"),

    LIKE_MOMENTS_SUCCESS("LIKE_MOMENTS_SUCCESS", "朋友圈点赞成功"),
    LIKE_MOMENTS_ERROR("LIKE_MOMENTS_ERROR", "朋友圈点赞失败"),

    UNLIKE_MOMENTS_SUCCESS("UNLIKE_MOMENTS_SUCCESS", "朋友圈取消点赞成功"),
    UNLIKE_MOMENTS_ERROR("UNLIKE_MOMENTS_ERROR", "朋友圈取消点赞失败"),

    REFRESH_USER_LASTEST_MOMENTS_PHOTOS_SUCCESS("REFRESH_USER_LASTEST_MOMENTS_PHOTOS_SUCCESS", "更新用户最新N张朋友圈图片成功"),
    REFRESH_USER_LASTEST_MOMENTS_PHOTOS_ERROR("REFRESH_USER_LASTEST_MOMENTS_PHOTOS_ERROR", "更新用户最新N张朋友圈图片失败"),

    UPDATE_USER_REMARKS_SUCCESS("UPDATE_USER_REMARKS_SUCCESS", "更新用户备注信息成功"),
    UPDATE_USER_REMARKS_ERROR("UPDATE_USER_REMARKS_ERROR", "更新用户备注信息失败"),

    UPDATE_USER_STAR_FRIEND_SUCCESS("UPDATE_USER_STAR_FRIEND_SUCCESS", "设置或取消星标朋友成功"),
    UPDATE_USER_STAR_FRIEND_ERROR("UPDATE_USER_STAR_FRIEND_ERROR", "设置或取消星标朋友失败"),

    ADD_USER_ADDRESS_SUCCESS("ADD_USER_ADDRESS_SUCCESS", "保存地址成功"),
    ADD_USER_ADDRESS_ERROR("ADD_USER_ADDRESS_ERROR", "保存地址失败"),

    MODIFY_USER_ADDRESS_SUCCESS("MODIFY_USER_ADDRESS_SUCCESS", "修改地址成功"),
    MODIFY_USER_ADDRESS_ERROR("MODIFY_USER_ADDRESS_ERROR", "修改地址失败"),

    DELETE_USER_ADDRESS_SUCCESS("DELETE_USER_ADDRESS_SUCCESS", "删除地址成功"),
    DELETE_USER_ADDRESS_ERROR("DELETE_USER_ADDRESS_ERROR", "删除地址失败"),

    OSS_CREATE_BUCKET_SUCCESS("OSS_CREATE_BUCKET_SUCCESS", "创建存储空间成功"),
    OSS_CREATE_BUCKET_ERROR("OSS_CREATE_BUCKET_ERROR", "创建存储空间失败"),

    OSS_DELETE_BUCKET_SUCCESS("OSS_DELETE_BUCKET_SUCCESS", "删除存储空间成功"),
    OSS_DELETE_BUCKET_ERROR("OSS_DELETE_BUCKET_ERROR", "删除存储空间失败"),

    INIT_AREA_SUCCESS("INIT_AREA_SUCCESS", "初始化省市区成功"),
    INIT_AREA_ERROR("INIT_AREA_ERROR", "初始化省市区失败"),

    UPLOAD_POSITION_INFO_SUCCESS("UPLOAD_POSITION_INFO_SUCCESS", "上传位置信息成功"),
    UPLOAD_POSITION_INFO_ERROR("UPLOAD_POSITION_INFO_ERROR", "上传位置信息失败"),

    DELETE_POSITION_INFO_SUCCESS("DELETE_POSITION_INFO_SUCCESS", "删除位置信息成功"),
    DELETE_POSITION_INFO_ERROR("DELETE_POSITION_INFO_ERROR", "删除位置信息失败"),

    MODIFY_DEVICE_SUCCESS("MODIFY_DEVICE_SUCCESS", "修改登录设备信息成功"),
    MODIFY_DEVICE_ERROR("MODIFY_DEVICE_ERROR", "修改登录设备信息失败"),

    SEND_VERIFICATION_EMAIL_SUCCESS("SEND_VERIFICATION_EMAIL_SUCCESS", "验证邮件发送成功"),
    SEND_VERIFICATION_EMAIL_ERROR("SEND_VERIFICATION_EMAIL_ERROR", "验证邮件发送失败"),

    LINK_EMAIL_SUCCESS("LINK_EMAIL_SUCCESS", "绑定邮箱成功"),
    LINK_EMAIL_ERROR("LINK_EMAIL_ERROR", "绑定邮箱失败"),

    UNLINK_EMAIL_SUCCESS("UNLINK_EMAIL_SUCCESS", "解绑邮箱成功"),
    UNLINK_EMAIL_ERROR("UNLINK_EMAIL_ERROR", "解绑邮箱失败"),

    LINK_QQ_ID_SUCCESS("LINK_QQ_ID_SUCCESS", "绑定QQ号成功"),
    LINK_QQ_ID_ERROR("LINK_QQ_ID_ERROR", "绑定QQ号失败"),

    UNLINK_QQ_ID_SUCCESS("UNLINK_QQ_ID_SUCCESS", "解绑QQ号成功"),
    UNLINK_QQ_ID_ERROR("UNLINK_QQ_ID_ERROR", "解绑QQ号失败"),

    SAVE_SEARCH_HISTORY_SUCCESS("SAVE_SEARCH_HISTORY_SUCCESS", "解绑QQ号成功"),
    SAVE_SEARCH_HISTORY_ERROR("SAVE_SEARCH_HISTORY_ERROR", "解绑QQ号失败"),

    FILE_ITEM_DOCUMENT_CREATE_SUCCESS("FILE_ITEM_DOCUMENT_CREATE_SUCCESS", "文件文档创建成功"),
    FILE_ITEM_DOCUMENT_CREATE_ERROR("FILE_ITEM_DOCUMENT_CREATE_ERROR", "文件文档创建失败"),

    FILE_ITEM_DOCUMENT_BATCH_CREATE_SUCCESS("FILE_ITEM_DOCUMENT_BATCH_CREATE_SUCCESS", "文件文档批量创建成功"),
    FILE_ITEM_DOCUMENT_BATCH_CREATE_ERROR("FILE_ITEM_DOCUMENT_BATCH_CREATE_ERROR", "文件文档批量创建失败"),

    FILE_ITEM_DOCUMENT_DELETE_SUCCESS("FILE_ITEM_DOCUMENT_DELETE_SUCCESS", "文件文档删除成功"),
    FILE_ITEM_DOCUMENT_DELETE_ERROR("FILE_ITEM_DOCUMENT_DELETE_ERROR", "文件文档删除失败"),

    FILE_ITEM_INDEX_DELETE_SUCCESS("FILE_ITEM_INDEX_DELETE_SUCCESS", "文件索引删除成功"),
    FILE_ITEM_INDEX_DELETE_ERROR("FILE_ITEM_INDEX_DELETE_ERROR", "文件索引删除失败"),

    PATH_IS_ILLEGAL("PATH_IS_ILLEGAL", "path应该是个文件路径"),
    ;

    ResponseMsg(String responseCode, String responseMessage) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
    }

    private String responseCode;
    private String responseMessage;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
