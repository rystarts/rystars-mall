package com.rystars.mall.admin.cms.subject.bean;

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
 * 【cms_subject_category(专题分类表)】Bean
 * @author rystars
 * @date 2023-04-13 10:39:09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="cms_subject_category")
@Schema(description = "cms_subject_category(专题分类表)")
public class CmsSubjectCategory extends BaseBean<CmsSubjectCategory> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "name")
    private String name;
    
    @Schema(description = "分类图标")
    private String icon;
    
    @Schema(description = "专题数量")
    private Integer subjectCount;
    
    @Schema(description = "showStatus")
    private Integer showStatus;
    
    @Schema(description = "sort")
    private Integer sort;

}




