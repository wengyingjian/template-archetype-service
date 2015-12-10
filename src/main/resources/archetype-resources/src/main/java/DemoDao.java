/**
 * 
 */
package ${package}.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ${package}.model.Demo;

/**
 * 
 * @author <a href="mailto:wengyj@59store.com">翁英健</a>
 * @version 1.1 2015年12月10日
 * @since 1.1
 */
@Repository
public class DemoDao {

    @Autowired
    private DemoMapper masterDemoMapper;
    @Autowired
    private DemoMapper slaveDemoMapper;
    
    public Demo getDemoById(Integer id){
        return slaveDemoMapper.getDemoById(id);
    }
}
