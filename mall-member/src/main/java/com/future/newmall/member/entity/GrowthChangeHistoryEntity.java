package com.future.newmall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 成长值变化历史记录
 * 
 * @author wsq
 * @email 673372988@qq.com
 * @date 2020-09-02 19:30:12
 */
@Data
@TableName("ums_growth_change_history")
public class GrowthChangeHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long memberId;
	/**
	 * $column.comments
	 */
	private Date createTime;
	/**
	 * $column.comments
	 */
	private Integer changeCount;
	/**
	 * $column.comments
	 */
	private String note;
	/**
	 * $column.comments
	 */
	private Integer sourceType;

}
