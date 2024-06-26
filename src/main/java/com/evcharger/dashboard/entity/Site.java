package com.evcharger.dashboard.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("site")
public class Site {
    @TableId
    private String siteId;
    private String street;
    private String postcode;
    private Double coordinatesX;
    private Double coordinatesY;
    private String cityId;
}
