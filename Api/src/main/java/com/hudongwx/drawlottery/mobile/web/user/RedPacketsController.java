package com.hudongwx.drawlottery.mobile.web.user;

import com.alibaba.fastjson.JSONObject;
import com.hudongwx.drawlottery.mobile.service.order.IOrdersService;
import com.hudongwx.drawlottery.mobile.service.user.IRedPacketsService;
import com.hudongwx.drawlottery.mobile.web.BaseController;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 开发公司：hudongwx.com<br/>
 * 版权：294786949@qq.com<br/>
 * <p>
 *
 * @author wu
 * @version 1.0, 2016/12/16 <br/>
 * @desc 用户红包管理
 * <p>
 * <p>
 * 创建　wu　2016/12/16 <br/>
 * <p>
 * *******
 * <p>
 * @email 294786949@qq.com
 */
@RestController
@Api(value = "RedPacketsController", description = "用户红包管理")
public class RedPacketsController extends BaseController {

    @Autowired
    IRedPacketsService rpService;
    @Autowired
    IOrdersService oService;

    /**
     * 获取用户不可用的红包
     *
     * @return JSONObject
     */
    @ResponseBody
    @RequestMapping(value = "/api/v1/user/redpacket/show", method = {RequestMethod.POST, RequestMethod.GET})
    public JSONObject queryUserRedPacket() {
        List<Map<String, Object>> infoList = rpService.selectAllByUserAccountId(getUserId());
        return success(infoList);
    }

    /**
     * 用户红包
     *
     * @return JSONObject
     */
    @ResponseBody
    @RequestMapping(value = "/api/v1/user/redpacket/use", method = {RequestMethod.POST, RequestMethod.GET})
    public JSONObject updateUserRedPacket(@RequestParam("price") Integer price) {
        // TODO: 2017/1/6 User---------------
        return success(oService.selectOrders(getUserId(),price));
    }

}
