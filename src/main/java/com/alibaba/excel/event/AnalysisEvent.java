package com.alibaba.excel.event;

/**
 * @author zhengjianhui
 * @Created Date: 2/9/19
 * @Description:
 * @Modify by:
 */
public interface AnalysisEvent {

    /**
     * 获取数据
     * @return 事件附带的数据
     */
   Object getData();

    /**
     * 获取事件的类型
     * @return short 事件类型对应的类型
     */
   short getType();
}
