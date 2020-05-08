package com.lamdaer.polyv.live.constant;

/**
 * 接口地址
 *
 * @author lamdaer
 * createTime 2020/5/4
 */
public class ApiConstants {

    /**
     * 修改直播频道分类名称
     */
    public static final String CHANGE_CHANNEL_CLASSIFICATION_NAME = "http://api.polyv.net/live/v3/user/category/update-name";

    /**
     * 获取频道抽奖记录列表
     */
    public static final String GET_CHANNEL_LOTTERY_RECORD = "http://api.polyv.net/live/v3/channel/lottery/list-lottery";

    /**
     * 获取频道单场抽奖的中奖记录
     */
    public static final String GET_WINNER_DETAIL = "http://api.polyv.net/live/v3/channel/lottery/get-winner-detail";

    /**
     * 发送点赞
     */
    public static final String GIVE_LIKE = "http://api.polyv.net/live/v2/channels/{channelId}/like";

    /**
     * 发送打赏消息
     */
    public static final String SEND_REWARD_MESSAGE = "http://api.polyv.net/live/v3/channel/chat/send-reward-msg";

    private ApiConstants() {
    }
}
