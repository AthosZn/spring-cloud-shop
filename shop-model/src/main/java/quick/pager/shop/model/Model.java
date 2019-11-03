package quick.pager.shop.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * model 基类
 *
 * @author siguiyang
 */
@Data
public class Model implements Serializable {
    private static final long serialVersionUID = 4400997987429664604L;

    /**
     * 数据库主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 创建人
     */
    private String createUser;
    /**
     * 更新操作人
     */
    private String updateUser;

    /**
     * 数据库记录创建时间
     */
    private Date createTime;
    /**
     * 数据库记录发生更新的时间
     */
    private Date updateTime;
    /**
     * 数据库删除标志<br />
     * 1: 删除
     * 0: 未删除
     */
    private Boolean deleteStatus;
}
