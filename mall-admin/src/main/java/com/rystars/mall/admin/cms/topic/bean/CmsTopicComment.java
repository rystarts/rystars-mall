package com.rystars.mall.admin.cms.topic.bean;

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
 * 【cms_topic_comment(专题评论表)】Bean
 * @author rystars
 * @date 2023-04-13 10:39:19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="cms_topic_comment")
@Schema(description = "cms_topic_comment(专题评论表)")
public class CmsTopicComment extends BaseBean<CmsTopicComment> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "memberNickName")
    private String memberNickName;
    
    @Schema(description = "topicId")
    private Long topicId;
    
    @Schema(description = "memberIcon")
    private String memberIcon;
    
    @Schema(description = "content")
    private String content;
    
    @Schema(description = "createTime")
    private Date createTime;
    
    @Schema(description = "showStatus")
    private Integer showStatus;

}




