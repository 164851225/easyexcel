package com.alibaba.excel.event;

/**
 * @author jipengfei
 */
public class MergeAddressEvent implements AnalysisEvent {

    public static final short TYPE = 2;

    public MergeAddressEvent(Object content) {
        this.data = content;
    }


    private Object data;

    @Override
    public Object getData() {
        return data;
    }

    @Override
    public short getType() {
        return TYPE;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
