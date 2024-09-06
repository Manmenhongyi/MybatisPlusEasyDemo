package mmhy.springdi.mybatisdemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("id")
//lombok注释：自动生成get、set方法，构造方法，toString方法
public class User {
    private int id;
    private String name;
}
