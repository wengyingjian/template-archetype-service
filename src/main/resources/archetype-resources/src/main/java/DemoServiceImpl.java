/**
 * 
 */
package ${package}.service.impl;

import ${package}.remote.DemoService;
import ${package}.model.Demo;
import com.asd.demo.remoting.UserService;
import com.asd.template.common.util.ResultUtil;
import com.asd.template.common.model.Result;
import com.asd.template.hessian.server.annotation.RemoteService;
import com.asd.template.hessian.server.annotation.ServiceType;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author <a href="mailto:wengyingjian@foxmail.com">翁英健</a>
 * @version 1.1 2015年12月10日
 * @since 1.1
 */
@Service
public class DemoServiceImpl implements DemoService {
    
    @Autowired
    private DemoDao demoDao;
   
    @Override
    public Result<Demo> getDemo(Integer id){
        return ResultUtil.genResultWithSuccess(demoDao.getDemoById(id));
    }
}
