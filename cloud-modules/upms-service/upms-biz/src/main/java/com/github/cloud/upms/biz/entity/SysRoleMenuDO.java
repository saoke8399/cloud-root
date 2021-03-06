package com.github.cloud.upms.biz.entity;

import lombok.Data;

/**
 * 角色菜单
 *
 * @author : czk
 * @date 2018-08-08
 */
@Data
public class SysRoleMenuDO {

    private static final long serialVersionUID = -3269568641540575970L;

    /**
     * ID
     */
    private Long id;
    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 空间位
     */
    private Long idx;

    /**
     * 编码
     */
    private Long code;
}
