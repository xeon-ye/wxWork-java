package com.miya.service;

import com.miya.entity.MessageGroupChat;
import com.baomidou.mybatisplus.extension.service.IService;
import com.miya.model.message.GroupChatCreateDTO;
import com.miya.model.CommonResult;

/**
 * <p>
 * 群聊 服务类
 * </p>
 *
 * @author CaiXiaowei
 * @since 2020-07-27
 */
public interface IMessageGroupChatService extends IService<MessageGroupChat> {

    /**
     * 创建群聊
     *
     * @param groupChatCreateDTO
     * @return CommonResult
     * @author Caixiaowei
     * @updateTime 2020/9/15 15:04
     */
    CommonResult create(GroupChatCreateDTO groupChatCreateDTO);

    /**
     * 更新群聊
     *
     * @param 
     * @return 
     * @author Caixiaowei
     * @updateTime 2020/9/16 9:40
     */
    CommonResult updateGroupChat(GroupChatCreateDTO groupChatCreateDTO);

}
