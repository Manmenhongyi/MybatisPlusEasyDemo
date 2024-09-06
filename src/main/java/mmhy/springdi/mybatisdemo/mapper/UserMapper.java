package mmhy.springdi.mybatisdemo.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import mmhy.springdi.mybatisdemo.entity.User;
public interface UserMapper extends BaseMapper<User> {
    //mybatis-plus提供的接口,不需要自己实现,直接在启动类上继承即可
}
