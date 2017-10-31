package com.wjz.web;

import com.wjz.mapper.TestMapper;
import com.wjz.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wangjinzhao on 2017/10/31.
 */
@RestController
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @GetMapping("/test")
    public List<TestVO> test(){
        return testMapper.queryInfo();
    }
}
