package com.rystars.mall.admin.sms.coupon.bean;

import java.util.*;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;
import java.io.Serial;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import com.rystars.mall.admin.frame.base.bean.BaseBean;

/**
 * 【sms_coupon_product_relation(优惠券和产品的关系表)】Bean
 * @author rystars
 * @date 2023-04-13 10:54:23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="sms_coupon_product_relation")
@Schema(description = "sms_coupon_product_relation(优惠券和产品的关系表)")
public class SmsCouponProductRelation extends BaseBean<SmsCouponProductRelation> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "couponId")
    private Long couponId;
    
    @Schema(description = "productId")
    private Long productId;
    
    @Schema(description = "商品名称")
    private String productName;
    
    @Schema(description = "商品编码")
    private String productSn;

}




