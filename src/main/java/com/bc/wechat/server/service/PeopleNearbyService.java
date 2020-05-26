package com.bc.wechat.server.service;

import com.bc.wechat.server.entity.PeopleNearby;

import java.util.List;

/**
 * 附近的人
 *
 * @author zhou
 */
public interface PeopleNearbyService {

    /**
     * 上传位置信息并获取附近的人列表
     *
     * @param peopleNearby 附近的人(位置信息)
     */
    List<PeopleNearby> getPeopleNearbyList(PeopleNearby peopleNearby);
}
