package com.alibaba.excel.event;

import com.alibaba.excel.context.AnalysisContext;

/**
 *
 *
 * @author jipengfei
 */
public abstract class AnalysisEventListener<T> {

    /**
     * when analysis one row trigger invoke function
     *
     * @param object  one row data
     * @param context analysis context
     */
    public abstract void invoke(T object, AnalysisContext context);

    /**
     * if have something to do after all  analysis
     *
     * @param context
     */
    public abstract void doAfterAllAnalysed(AnalysisContext context);


    /**
     * 合并单元格相关事件处理
     * @param object  one merge data
     * @param context analysis context
     */
    public abstract void mergeAnalysed(T object, AnalysisContext context);
}
