package com.alibaba.excel.event;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jipengfei
 */
public class OneRowAnalysisFinishEvent implements AnalysisEvent {

    public static final short TYPE = 1;

    public OneRowAnalysisFinishEvent(Object content) {
        this.data = content;
    }

    public OneRowAnalysisFinishEvent(String[] content, int length) {
        if (content != null) {
            List<String> ls = new ArrayList<String>(length);
            for (int i = 0; i <= length; i++) {
                ls.add(content[i]);
            }
            data = ls;
        }
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
