package com.github.cloud.common.mybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : czk
 * @date 2018-09-29 17:30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pagination {

    /**
     * 当前页
     */
    private long current;

    /**
     * 每页显示个数
     */
    private long pageSize;

    /**
     * 总个数
     */
    private long total;

    /**
     * @param current  当前页
     * @param pageSize 每页显示个数
     * @param total    总条数
     * @return 分页参数
     */
    public static Pagination build(long current, long pageSize, long total) {
        return new Pagination(current, pageSize, total);
    }

}
