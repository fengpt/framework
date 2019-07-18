package com.freestyle.framework.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;

/**
 * 示例
 * 
 * @author huangxiaohui
 *
 */
@Data
public class Sample implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String sName;
    private BigDecimal sPrice;
    private Map<String, Object> sJson;
    private Date createTime;
    private Date updateTime;

    public Map<String, Object> getsJson() {
        if (sJson == null)
            sJson = new HashMap<>();
        return sJson;
    }

    public void setsJson(Map<String, Object> sJson) {
        this.sJson = sJson;
    }

}
