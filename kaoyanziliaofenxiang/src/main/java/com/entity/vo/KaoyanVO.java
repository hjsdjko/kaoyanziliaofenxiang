package com.entity.vo;

import com.entity.KaoyanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 考研信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kaoyan")
public class KaoyanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 考研信息标题
     */

    @TableField(value = "kaoyan_name")
    private String kaoyanName;


    /**
     * 考研信息类型
     */

    @TableField(value = "kaoyan_types")
    private Integer kaoyanTypes;


    /**
     * 考研信息封面
     */

    @TableField(value = "kaoyan_photo")
    private String kaoyanPhoto;


    /**
     * 考研资料
     */

    @TableField(value = "kaoyan_file")
    private String kaoyanFile;


    /**
     * 考研视频
     */

    @TableField(value = "kaoyan_video")
    private String kaoyanVideo;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 考研详情
     */

    @TableField(value = "kaoyan_content")
    private String kaoyanContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：考研信息标题
	 */
    public String getKaoyanName() {
        return kaoyanName;
    }


    /**
	 * 获取：考研信息标题
	 */

    public void setKaoyanName(String kaoyanName) {
        this.kaoyanName = kaoyanName;
    }
    /**
	 * 设置：考研信息类型
	 */
    public Integer getKaoyanTypes() {
        return kaoyanTypes;
    }


    /**
	 * 获取：考研信息类型
	 */

    public void setKaoyanTypes(Integer kaoyanTypes) {
        this.kaoyanTypes = kaoyanTypes;
    }
    /**
	 * 设置：考研信息封面
	 */
    public String getKaoyanPhoto() {
        return kaoyanPhoto;
    }


    /**
	 * 获取：考研信息封面
	 */

    public void setKaoyanPhoto(String kaoyanPhoto) {
        this.kaoyanPhoto = kaoyanPhoto;
    }
    /**
	 * 设置：考研资料
	 */
    public String getKaoyanFile() {
        return kaoyanFile;
    }


    /**
	 * 获取：考研资料
	 */

    public void setKaoyanFile(String kaoyanFile) {
        this.kaoyanFile = kaoyanFile;
    }
    /**
	 * 设置：考研视频
	 */
    public String getKaoyanVideo() {
        return kaoyanVideo;
    }


    /**
	 * 获取：考研视频
	 */

    public void setKaoyanVideo(String kaoyanVideo) {
        this.kaoyanVideo = kaoyanVideo;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：考研详情
	 */
    public String getKaoyanContent() {
        return kaoyanContent;
    }


    /**
	 * 获取：考研详情
	 */

    public void setKaoyanContent(String kaoyanContent) {
        this.kaoyanContent = kaoyanContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
