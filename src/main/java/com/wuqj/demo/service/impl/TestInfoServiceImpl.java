package com.wuqj.demo.service.impl;

import com.wuqj.demo.entity.TestInfo;
import com.wuqj.demo.mapper.TestInfoMapper;
import com.wuqj.demo.service.TestInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 测试表 服务实现类
 * </p>
 *
 * @author wuqj
 * @since 2020-06-14
 */
@Service
public class TestInfoServiceImpl extends ServiceImpl<TestInfoMapper, TestInfo> implements TestInfoService {

}
