package mmhy.springdi.mybatisdemo.controller;
import mmhy.springdi.mybatisdemo.entity.User;
import mmhy.springdi.mybatisdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//定义springMVC服务端的控制器组件
public class IdController {
    @Autowired
    UserMapper userMapper;
    //增
    @RequestMapping(value = "/insert")
    public String insert(Integer id,String name){
        return userMapper.insert(new User(id,name))>0?"success":"fail";
        //调用idMapper的insert方法，并使用insert方法返回值（大于0表示插入成功）作为参数来判断是否删除成功
    }
    //删
    @RequestMapping(value = "/delete")
    public String deleteById(Integer id){
        return userMapper.deleteById(id)>0?"success":"fail";
        //调用idMapper的deleteById方法，并使用deleteById方法返回值（大于0表示删除成功）作为参数来判断是否删除成功
    }
    //todo:改
    @RequestMapping(value = "/update")
    public String updateById(Integer id,String name){

        return userMapper.updateById(new User(id,name))>0?"success":"fail";
        //调用idMapper的updateById方法，并使用updateById方法返回值（大于0表示更新成功）作为参数来判断是否更新成功
    }
    //查
    @RequestMapping(value="/select")
    public User selectById(Integer id){
        if(userMapper == null){
            System.out.println("此ID不存在");
            return null;
        }
        else return userMapper.selectById(id);
        //调用idMapper的selectById方法，并使用selectById方法返回值（Id对象）作为参数来判断是否查询成功
    }
}