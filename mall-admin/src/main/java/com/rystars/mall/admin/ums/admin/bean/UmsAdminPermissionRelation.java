package com.rystars.mall.admin.ums.admin.bean;

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
 * 【ums_admin_permission_relation(后台用户和权限关系表(除角色中定义的权限以外的加减权限))】Bean
 * @author rystars
 * @date 2023-04-13 10:58:12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="ums_admin_permission_relation")
@Schema(description = "ums_admin_permission_relation(后台用户和权限关系表(除角色中定义的权限以外的加减权限))")
public class UmsAdminPermissionRelation extends BaseBean<UmsAdminPermissionRelation> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "adminId")
    private Long adminId;
    
    @Schema(description = "permissionId")
    private Long permissionId;
    
    @Schema(description = "type")
    private Integer type;

}




