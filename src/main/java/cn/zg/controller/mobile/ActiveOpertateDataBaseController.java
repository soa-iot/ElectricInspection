package cn.zg.controller.mobile;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.zg.entity.dataExchange.ResultJson;
import cn.zg.entity.dataExchange.mobile.ActiveDataTable;

/**
 * @ClassName: ActiveOpertateDataBaseController
 * @Description: 移动端动态操作数据库控制层
 * @author zhugang
 * @date 2018年9月25日
 */
@RestController
@RequestMapping( "/mobile" )
public class ActiveOpertateDataBaseController {
	
	@RequestMapping( "/activeData" )
	public ResultJson<String> activeOperateDataTable( 
			@RequestBody ActiveDataTable activeDataTable) {
		String result = "";
		System.out.println("1111111111");
		return new ResultJson<String>( 0 , "操作成功" , result );
	}
}
