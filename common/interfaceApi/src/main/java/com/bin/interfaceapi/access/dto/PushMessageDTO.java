package com.bin.interfaceapi.access.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * Description: 推送给用户的消息对象
 * Author: <a href="https://github.com/zongzibinbin">abin</a>
 * Date: 2023-08-12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PushMessageDTO implements Serializable {
    /**
     * 推送的ws消息
     */
    private WSBaseResp wsBaseMsg;
    /**
     * 推送的uid
     */
    private List<Long> uidList;

    public PushMessageDTO(Long uid, WSBaseResp wsBaseMsg) {
        this.uidList = Collections.singletonList(uid);
        this.wsBaseMsg = wsBaseMsg;
    }

    public PushMessageDTO(List<Long> uidList, WSBaseResp wsBaseMsg) {
        this.uidList = uidList;
        this.wsBaseMsg = wsBaseMsg;
    }

    public PushMessageDTO(WSBaseResp wsBaseMsg) {
        this.wsBaseMsg = wsBaseMsg;
    }

}
