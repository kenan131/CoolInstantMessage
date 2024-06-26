package com.bin.user.dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bin.user.domain.entity.SensitiveWord;
import com.bin.user.mapper.SensitiveWordMapper;
import org.springframework.stereotype.Service;

/**
 * 敏感词DAO
 *
 * @author zhaoyuhang
 * @since 2023/06/11
 */
@Service
public class SensitiveWordDao extends ServiceImpl<SensitiveWordMapper, SensitiveWord> {

}
