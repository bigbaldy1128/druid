package com.wjz.mapper;

import com.wjz.vo.TestVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by wangjinzhao on 2017/10/31.
 */
@Mapper
public interface TestMapper {
    List<TestVO> queryInfo();
}
