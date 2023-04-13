package com.rystars.mall.admin.cms.subject.bean;

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
import java.util.Date;

/**
 * 【cms_subject_comment(专题评论表)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:39:09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "cms_subject_comment")
@Schema(description = "cms_subject_comment(专题评论表)")
public class CmsSubjectComment extends BaseBean<CmsSubjectComment> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "subjectId")
    private Long subjectId;

    @Schema(description = "memberNickName")
    private String memberNickName;

    @Schema(description = "memberIcon")
    private String memberIcon;

    @Schema(description = "content")
    private String content;

    @Schema(description = "createTime")
    private Date createTime;

    @Schema(description = "showStatus")
    private Integer showStatus;

}




