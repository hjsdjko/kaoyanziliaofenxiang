package com.entity.model;

import com.entity.KaoyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 考研信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KaoyanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 考研信息标题
     */
    private String kaoyanName;


    /**
     * 考研信息类型
     */
    private Integer kaoyanTypes;


    /**
     * 考研信息封面
     */
    private String kaoyanPhoto;


    /**
     * 考研资料
     */
    private String kaoyanFile;


    /**
     * 考研视频
     */
    private String kaoyanVideo;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 考研详情
     */
    private String kaoyanContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：考研信息标题
	 */
    public String getKaoyanName() {
        return kaoyanName;
    }


    /**
	 * 设置：考研信息标题
	 */
    public void setKaoyanName(String kaoyanName) {
        this.kaoyanName = kaoyanName;
    }
    /**
	 * 获取：考研信息类型
	 */
    public Integer getKaoyanTypes() {
        return kaoyanTypes;
    }


    /**
	 * 设置：考研信息类型
	 */
    public void setKaoyanTypes(Integer kaoyanTypes) {
        this.kaoyanTypes = kaoyanTypes;
    }
    /**
	 * 获取：考研信息封面
	 */
    public String getKaoyanPhoto() {
        return kaoyanPhoto;
    }


    /**
	 * 设置：考研信息封面
	 */
    public void setKaoyanPhoto(String kaoyanPhoto) {
        this.kaoyanPhoto = kaoyanPhoto;
    }
    /**
	 * 获取：考研资料
	 */
    public String getKaoyanFile() {
        return kaoyanFile;
    }


    /**
	 * 设置：考研资料
	 */
    public void setKaoyanFile(String kaoyanFile) {
        this.kaoyanFile = kaoyanFile;
    }
    /**
	 * 获取：考研视频
	 */
    public String getKaoyanVideo() {
        return kaoyanVideo;
    }


    /**
	 * 设置：考研视频
	 */
    public void setKaoyanVideo(String kaoyanVideo) {
        this.kaoyanVideo = kaoyanVideo;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：考研详情
	 */
    public String getKaoyanContent() {
        return kaoyanContent;
    }


    /**
	 * 设置：考研详情
	 */
    public void setKaoyanContent(String kaoyanContent) {
        this.kaoyanContent = kaoyanContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
