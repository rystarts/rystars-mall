package com.rystars.mall.admin.sms.home.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * 【sms_home_recommend_product(人气推荐商品表)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:54:46
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "sms_home_recommend_product")
@Schema(description = "sms_home_recommend_product(人气推荐商品表)")
public class SmsHomeRecommendProduct extends BaseBean<SmsHomeRecommendProduct> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "productId")
    private Long productId;

    @Schema(description = "productName")
    private String productName;

    @Schema(description = "recommendStatus")
    private Integer recommendStatus;

    @Schema(description = "sort")
    private Integer sort;

}



