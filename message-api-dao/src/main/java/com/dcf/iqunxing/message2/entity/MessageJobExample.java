package com.dcf.iqunxing.message2.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageJobExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
     */
    protected Integer limitStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
     */
    protected Integer limitEnd;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
     */
    public MessageJobExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
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
     * This method corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
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

        public Criteria andLastScheduleTimeIsNull() {
            addCriterion("last_schedule_time is null");
            return (Criteria) this;
        }

        public Criteria andLastScheduleTimeIsNotNull() {
            addCriterion("last_schedule_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastScheduleTimeEqualTo(Date value) {
            addCriterion("last_schedule_time =", value, "lastScheduleTime");
            return (Criteria) this;
        }

        public Criteria andLastScheduleTimeNotEqualTo(Date value) {
            addCriterion("last_schedule_time <>", value, "lastScheduleTime");
            return (Criteria) this;
        }

        public Criteria andLastScheduleTimeGreaterThan(Date value) {
            addCriterion("last_schedule_time >", value, "lastScheduleTime");
            return (Criteria) this;
        }

        public Criteria andLastScheduleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_schedule_time >=", value, "lastScheduleTime");
            return (Criteria) this;
        }

        public Criteria andLastScheduleTimeLessThan(Date value) {
            addCriterion("last_schedule_time <", value, "lastScheduleTime");
            return (Criteria) this;
        }

        public Criteria andLastScheduleTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_schedule_time <=", value, "lastScheduleTime");
            return (Criteria) this;
        }

        public Criteria andLastScheduleTimeIn(List<Date> values) {
            addCriterion("last_schedule_time in", values, "lastScheduleTime");
            return (Criteria) this;
        }

        public Criteria andLastScheduleTimeNotIn(List<Date> values) {
            addCriterion("last_schedule_time not in", values, "lastScheduleTime");
            return (Criteria) this;
        }

        public Criteria andLastScheduleTimeBetween(Date value1, Date value2) {
            addCriterion("last_schedule_time between", value1, value2, "lastScheduleTime");
            return (Criteria) this;
        }

        public Criteria andLastScheduleTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_schedule_time not between", value1, value2, "lastScheduleTime");
            return (Criteria) this;
        }

        public Criteria andLastStartTimeIsNull() {
            addCriterion("last_start_time is null");
            return (Criteria) this;
        }

        public Criteria andLastStartTimeIsNotNull() {
            addCriterion("last_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastStartTimeEqualTo(Date value) {
            addCriterion("last_start_time =", value, "lastStartTime");
            return (Criteria) this;
        }

        public Criteria andLastStartTimeNotEqualTo(Date value) {
            addCriterion("last_start_time <>", value, "lastStartTime");
            return (Criteria) this;
        }

        public Criteria andLastStartTimeGreaterThan(Date value) {
            addCriterion("last_start_time >", value, "lastStartTime");
            return (Criteria) this;
        }

        public Criteria andLastStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_start_time >=", value, "lastStartTime");
            return (Criteria) this;
        }

        public Criteria andLastStartTimeLessThan(Date value) {
            addCriterion("last_start_time <", value, "lastStartTime");
            return (Criteria) this;
        }

        public Criteria andLastStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_start_time <=", value, "lastStartTime");
            return (Criteria) this;
        }

        public Criteria andLastStartTimeIn(List<Date> values) {
            addCriterion("last_start_time in", values, "lastStartTime");
            return (Criteria) this;
        }

        public Criteria andLastStartTimeNotIn(List<Date> values) {
            addCriterion("last_start_time not in", values, "lastStartTime");
            return (Criteria) this;
        }

        public Criteria andLastStartTimeBetween(Date value1, Date value2) {
            addCriterion("last_start_time between", value1, value2, "lastStartTime");
            return (Criteria) this;
        }

        public Criteria andLastStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_start_time not between", value1, value2, "lastStartTime");
            return (Criteria) this;
        }

        public Criteria andLastEndTimeIsNull() {
            addCriterion("last_end_time is null");
            return (Criteria) this;
        }

        public Criteria andLastEndTimeIsNotNull() {
            addCriterion("last_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastEndTimeEqualTo(Date value) {
            addCriterion("last_end_time =", value, "lastEndTime");
            return (Criteria) this;
        }

        public Criteria andLastEndTimeNotEqualTo(Date value) {
            addCriterion("last_end_time <>", value, "lastEndTime");
            return (Criteria) this;
        }

        public Criteria andLastEndTimeGreaterThan(Date value) {
            addCriterion("last_end_time >", value, "lastEndTime");
            return (Criteria) this;
        }

        public Criteria andLastEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_end_time >=", value, "lastEndTime");
            return (Criteria) this;
        }

        public Criteria andLastEndTimeLessThan(Date value) {
            addCriterion("last_end_time <", value, "lastEndTime");
            return (Criteria) this;
        }

        public Criteria andLastEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_end_time <=", value, "lastEndTime");
            return (Criteria) this;
        }

        public Criteria andLastEndTimeIn(List<Date> values) {
            addCriterion("last_end_time in", values, "lastEndTime");
            return (Criteria) this;
        }

        public Criteria andLastEndTimeNotIn(List<Date> values) {
            addCriterion("last_end_time not in", values, "lastEndTime");
            return (Criteria) this;
        }

        public Criteria andLastEndTimeBetween(Date value1, Date value2) {
            addCriterion("last_end_time between", value1, value2, "lastEndTime");
            return (Criteria) this;
        }

        public Criteria andLastEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_end_time not between", value1, value2, "lastEndTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
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
     * This class corresponds to the database table message_job
     *
     * @mbggenerated do_not_delete_during_merge Wed Aug 05 18:13:59 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table message_job
     *
     * @mbggenerated Wed Aug 05 18:13:59 CST 2015
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