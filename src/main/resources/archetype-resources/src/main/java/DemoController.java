/**
 * 
 */
package ${package}.service.impl;

import ${package}.remote.DemoService;
import com.asd.demo.remoting.UserService;
import com.asd.template.hessian.server.annotation.RemoteService;
import com.asd.template.hessian.server.annotation.ServiceType;
/**
 * 
 * @author <a href="mailto:wengyingjian@foxmail.com">翁英健</a>
 * @version 1.1 2015年12月10日
 * @since 1.1
 */
@RemoteService(serviceType = ServiceType.HESSIAN, serviceInterface = UserService.class, exportPath = "/userService")
public class DemoServiceImpl implements DemoService {
    
    @Override
    public demo
}
