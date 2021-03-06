package com.dcf.iqunxing.message2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dcf.iqunxing.message2.entity.PushMessageTemplate;
import com.dcf.iqunxing.message2.entity.PushMessageTemplateExample;

public interface PushMessageTemplateMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table push_message_template
     *
     * @mbggenerated Mon Feb 22 15:01:26 CST 2016
     */
    int countByExample(PushMessageTemplateExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table push_message_template
     *
     * @mbggenerated Mon Feb 22 15:01:26 CST 2016
     */
    int deleteByExample(PushMessageTemplateExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table push_message_template
     *
     * @mbggenerated Mon Feb 22 15:01:26 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table push_message_template
     *
     * @mbggenerated Mon Feb 22 15:01:26 CST 2016
     */
    int insert(PushMessageTemplate record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table push_message_template
     *
     * @mbggenerated Mon Feb 22 15:01:26 CST 2016
     */
    int insertSelective(PushMessageTemplate record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table push_message_template
     *
     * @mbggenerated Mon Feb 22 15:01:26 CST 2016
     */
    List<PushMessageTemplate> selectByExample(PushMessageTemplateExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table push_message_template
     *
     * @mbggenerated Mon Feb 22 15:01:26 CST 2016
     */
    PushMessageTemplate selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table push_message_template
     *
     * @mbggenerated Mon Feb 22 15:01:26 CST 2016
     */
    int updateByExampleSelective(@Param("record") PushMessageTemplate record, @Param("example") PushMessageTemplateExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table push_message_template
     *
     * @mbggenerated Mon Feb 22 15:01:26 CST 2016
     */
    int updateByExample(@Param("record") PushMessageTemplate record, @Param("example") PushMessageTemplateExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table push_message_template
     *
     * @mbggenerated Mon Feb 22 15:01:26 CST 2016
     */
    int updateByPrimaryKeySelective(PushMessageTemplate record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table push_message_template
     *
     * @mbggenerated Mon Feb 22 15:01:26 CST 2016
     */
    int updateByPrimaryKey(PushMessageTemplate record);
}
