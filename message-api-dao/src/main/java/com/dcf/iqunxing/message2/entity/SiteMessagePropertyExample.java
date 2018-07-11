package com.dcf.iqunxing.message2.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SiteMessagePropertyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    protected Integer limitStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    protected Integer limitEnd;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    public SiteMessagePropertyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSiteMessageIdIsNull() {
            addCriterion("site_message_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteMessageIdIsNotNull() {
            addCriterion("site_message_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteMessageIdEqualTo(Long value) {
            addCriterion("site_message_id =", value, "siteMessageId");
            return (Criteria) this;
        }

        public Criteria andSiteMessageIdNotEqualTo(Long value) {
            addCriterion("site_message_id <>", value, "siteMessageId");
            return (Criteria) this;
        }

        public Criteria andSiteMessageIdGreaterThan(Long value) {
            addCriterion("site_message_id >", value, "siteMessageId");
            return (Criteria) this;
        }

        public Criteria andSiteMessageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("site_message_id >=", value, "siteMessageId");
            return (Criteria) this;
        }

        public Criteria andSiteMessageIdLessThan(Long value) {
            addCriterion("site_message_id <", value, "siteMessageId");
            return (Criteria) this;
        }

        public Criteria andSiteMessageIdLessThanOrEqualTo(Long value) {
            addCriterion("site_message_id <=", value, "siteMessageId");
            return (Criteria) this;
        }

        public Criteria andSiteMessageIdIn(List<Long> values) {
            addCriterion("site_message_id in", values, "siteMessageId");
            return (Criteria) this;
        }

        public Criteria andSiteMessageIdNotIn(List<Long> values) {
            addCriterion("site_message_id not in", values, "siteMessageId");
            return (Criteria) this;
        }

        public Criteria andSiteMessageIdBetween(Long value1, Long value2) {
            addCriterion("site_message_id between", value1, value2, "siteMessageId");
            return (Criteria) this;
        }

        public Criteria andSiteMessageIdNotBetween(Long value1, Long value2) {
            addCriterion("site_message_id not between", value1, value2, "siteMessageId");
            return (Criteria) this;
        }

        public Criteria andPropKeyIsNull() {
            addCriterion("prop_key is null");
            return (Criteria) this;
        }

        public Criteria andPropKeyIsNotNull() {
            addCriterion("prop_key is not null");
            return (Criteria) this;
        }

        public Criteria andPropKeyEqualTo(String value) {
            addCriterion("prop_key =", value, "propKey");
            return (Criteria) this;
        }

        public Criteria andPropKeyNotEqualTo(String value) {
            addCriterion("prop_key <>", value, "propKey");
            return (Criteria) this;
        }

        public Criteria andPropKeyGreaterThan(String value) {
            addCriterion("prop_key >", value, "propKey");
            return (Criteria) this;
        }

        public Criteria andPropKeyGreaterThanOrEqualTo(String value) {
            addCriterion("prop_key >=", value, "propKey");
            return (Criteria) this;
        }

        public Criteria andPropKeyLessThan(String value) {
            addCriterion("prop_key <", value, "propKey");
            return (Criteria) this;
        }

        public Criteria andPropKeyLessThanOrEqualTo(String value) {
            addCriterion("prop_key <=", value, "propKey");
            return (Criteria) this;
        }

        public Criteria andPropKeyLike(String value) {
            addCriterion("prop_key like", value, "propKey");
            return (Criteria) this;
        }

        public Criteria andPropKeyNotLike(String value) {
            addCriterion("prop_key not like", value, "propKey");
            return (Criteria) this;
        }

        public Criteria andPropKeyIn(List<String> values) {
            addCriterion("prop_key in", values, "propKey");
            return (Criteria) this;
        }

        public Criteria andPropKeyNotIn(List<String> values) {
            addCriterion("prop_key not in", values, "propKey");
            return (Criteria) this;
        }

        public Criteria andPropKeyBetween(String value1, String value2) {
            addCriterion("prop_key between", value1, value2, "propKey");
            return (Criteria) this;
        }

        public Criteria andPropKeyNotBetween(String value1, String value2) {
            addCriterion("prop_key not between", value1, value2, "propKey");
            return (Criteria) this;
        }

        public Criteria andPropValueIsNull() {
            addCriterion("prop_value is null");
            return (Criteria) this;
        }

        public Criteria andPropValueIsNotNull() {
            addCriterion("prop_value is not null");
            return (Criteria) this;
        }

        public Criteria andPropValueEqualTo(String value) {
            addCriterion("prop_value =", value, "propValue");
            return (Criteria) this;
        }

        public Criteria andPropValueNotEqualTo(String value) {
            addCriterion("prop_value <>", value, "propValue");
            return (Criteria) this;
        }

        public Criteria andPropValueGreaterThan(String value) {
            addCriterion("prop_value >", value, "propValue");
            return (Criteria) this;
        }

        public Criteria andPropValueGreaterThanOrEqualTo(String value) {
            addCriterion("prop_value >=", value, "propValue");
            return (Criteria) this;
        }

        public Criteria andPropValueLessThan(String value) {
            addCriterion("prop_value <", value, "propValue");
            return (Criteria) this;
        }

        public Criteria andPropValueLessThanOrEqualTo(String value) {
            addCriterion("prop_value <=", value, "propValue");
            return (Criteria) this;
        }

        public Criteria andPropValueLike(String value) {
            addCriterion("prop_value like", value, "propValue");
            return (Criteria) this;
        }

        public Criteria andPropValueNotLike(String value) {
            addCriterion("prop_value not like", value, "propValue");
            return (Criteria) this;
        }

        public Criteria andPropValueIn(List<String> values) {
            addCriterion("prop_value in", values, "propValue");
            return (Criteria) this;
        }

        public Criteria andPropValueNotIn(List<String> values) {
            addCriterion("prop_value not in", values, "propValue");
            return (Criteria) this;
        }

        public Criteria andPropValueBetween(String value1, String value2) {
            addCriterion("prop_value between", value1, value2, "propValue");
            return (Criteria) this;
        }

        public Criteria andPropValueNotBetween(String value1, String value2) {
            addCriterion("prop_value not between", value1, value2, "propValue");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeIsNull() {
            addCriterion("DataChange_LastTime is null");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeIsNotNull() {
            addCriterion("DataChange_LastTime is not null");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeEqualTo(Date value) {
            addCriterion("DataChange_LastTime =", value, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeNotEqualTo(Date value) {
            addCriterion("DataChange_LastTime <>", value, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeGreaterThan(Date value) {
            addCriterion("DataChange_LastTime >", value, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DataChange_LastTime >=", value, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeLessThan(Date value) {
            addCriterion("DataChange_LastTime <", value, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeLessThanOrEqualTo(Date value) {
            addCriterion("DataChange_LastTime <=", value, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeIn(List<Date> values) {
            addCriterion("DataChange_LastTime in", values, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeNotIn(List<Date> values) {
            addCriterion("DataChange_LastTime not in", values, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeBetween(Date value1, Date value2) {
            addCriterion("DataChange_LastTime between", value1, value2, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeNotBetween(Date value1, Date value2) {
            addCriterion("DataChange_LastTime not between", value1, value2, "datachangeLasttime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table site_message_property
     *
     * @mbggenerated do_not_delete_during_merge Tue Aug 25 10:28:43 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table site_message_property
     *
     * @mbggenerated Tue Aug 25 10:28:43 CST 2015
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}