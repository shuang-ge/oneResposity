package com.atguigu.scw.common.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TProjectVo implements Serializable {
	private static final long serialVersionUID = 1L;
	@ApiModelProperty("项目id")
	private Integer id;
	@ApiModelProperty("项目名")
	private String name;
	@ApiModelProperty("项目备注")
	private String remark;
	@ApiModelProperty("众筹金额")
	private Long money;
	@ApiModelProperty("天数")
	private Integer day;
	@ApiModelProperty("项目状态")
	private String status;
	@ApiModelProperty("项目部署日期")
	private String deploydate;
	@ApiModelProperty("已支持金额")
	private Long supportmoney;
	@ApiModelProperty("项目支持人数")
	private Integer supporter;
	@ApiModelProperty("完成度")
	private Integer completion;
	private Integer memberid;
	@ApiModelProperty("项目创建日期")
	private String createdate;
	@ApiModelProperty("关注人数")
	private Integer follower;
	@ApiModelProperty("项目头部图")
	private String headerImage;
	@ApiModelProperty("项目详情图")
	private List<String> detailsImage = new ArrayList<>();
	// 项目的所有支持档位
	@ApiModelProperty("项目回报档位详情")
	private List<TReturn> returns = new ArrayList<>();
	@ApiModelProperty("发起人的信息")
	private TProjectInitiator initiators;
	
}
