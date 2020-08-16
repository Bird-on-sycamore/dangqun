package com.neuedu.dangqun01.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ptdreamsolveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ptdreamsolveExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDreamidIsNull() {
            addCriterion("dreamId is null");
            return (Criteria) this;
        }

        public Criteria andDreamidIsNotNull() {
            addCriterion("dreamId is not null");
            return (Criteria) this;
        }

        public Criteria andDreamidEqualTo(Integer value) {
            addCriterion("dreamId =", value, "dreamid");
            return (Criteria) this;
        }

        public Criteria andDreamidNotEqualTo(Integer value) {
            addCriterion("dreamId <>", value, "dreamid");
            return (Criteria) this;
        }

        public Criteria andDreamidGreaterThan(Integer value) {
            addCriterion("dreamId >", value, "dreamid");
            return (Criteria) this;
        }

        public Criteria andDreamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dreamId >=", value, "dreamid");
            return (Criteria) this;
        }

        public Criteria andDreamidLessThan(Integer value) {
            addCriterion("dreamId <", value, "dreamid");
            return (Criteria) this;
        }

        public Criteria andDreamidLessThanOrEqualTo(Integer value) {
            addCriterion("dreamId <=", value, "dreamid");
            return (Criteria) this;
        }

        public Criteria andDreamidIn(List<Integer> values) {
            addCriterion("dreamId in", values, "dreamid");
            return (Criteria) this;
        }

        public Criteria andDreamidNotIn(List<Integer> values) {
            addCriterion("dreamId not in", values, "dreamid");
            return (Criteria) this;
        }

        public Criteria andDreamidBetween(Integer value1, Integer value2) {
            addCriterion("dreamId between", value1, value2, "dreamid");
            return (Criteria) this;
        }

        public Criteria andDreamidNotBetween(Integer value1, Integer value2) {
            addCriterion("dreamId not between", value1, value2, "dreamid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andLocatedidIsNull() {
            addCriterion("locatedId is null");
            return (Criteria) this;
        }

        public Criteria andLocatedidIsNotNull() {
            addCriterion("locatedId is not null");
            return (Criteria) this;
        }

        public Criteria andLocatedidEqualTo(Integer value) {
            addCriterion("locatedId =", value, "locatedid");
            return (Criteria) this;
        }

        public Criteria andLocatedidNotEqualTo(Integer value) {
            addCriterion("locatedId <>", value, "locatedid");
            return (Criteria) this;
        }

        public Criteria andLocatedidGreaterThan(Integer value) {
            addCriterion("locatedId >", value, "locatedid");
            return (Criteria) this;
        }

        public Criteria andLocatedidGreaterThanOrEqualTo(Integer value) {
            addCriterion("locatedId >=", value, "locatedid");
            return (Criteria) this;
        }

        public Criteria andLocatedidLessThan(Integer value) {
            addCriterion("locatedId <", value, "locatedid");
            return (Criteria) this;
        }

        public Criteria andLocatedidLessThanOrEqualTo(Integer value) {
            addCriterion("locatedId <=", value, "locatedid");
            return (Criteria) this;
        }

        public Criteria andLocatedidIn(List<Integer> values) {
            addCriterion("locatedId in", values, "locatedid");
            return (Criteria) this;
        }

        public Criteria andLocatedidNotIn(List<Integer> values) {
            addCriterion("locatedId not in", values, "locatedid");
            return (Criteria) this;
        }

        public Criteria andLocatedidBetween(Integer value1, Integer value2) {
            addCriterion("locatedId between", value1, value2, "locatedid");
            return (Criteria) this;
        }

        public Criteria andLocatedidNotBetween(Integer value1, Integer value2) {
            addCriterion("locatedId not between", value1, value2, "locatedid");
            return (Criteria) this;
        }

        public Criteria andReplyIsNull() {
            addCriterion("reply is null");
            return (Criteria) this;
        }

        public Criteria andReplyIsNotNull() {
            addCriterion("reply is not null");
            return (Criteria) this;
        }

        public Criteria andReplyEqualTo(String value) {
            addCriterion("reply =", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotEqualTo(String value) {
            addCriterion("reply <>", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyGreaterThan(String value) {
            addCriterion("reply >", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyGreaterThanOrEqualTo(String value) {
            addCriterion("reply >=", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLessThan(String value) {
            addCriterion("reply <", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLessThanOrEqualTo(String value) {
            addCriterion("reply <=", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLike(String value) {
            addCriterion("reply like", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotLike(String value) {
            addCriterion("reply not like", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyIn(List<String> values) {
            addCriterion("reply in", values, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotIn(List<String> values) {
            addCriterion("reply not in", values, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyBetween(String value1, String value2) {
            addCriterion("reply between", value1, value2, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotBetween(String value1, String value2) {
            addCriterion("reply not between", value1, value2, "reply");
            return (Criteria) this;
        }

        public Criteria andSolvedlevelIsNull() {
            addCriterion("solvedlevel is null");
            return (Criteria) this;
        }

        public Criteria andSolvedlevelIsNotNull() {
            addCriterion("solvedlevel is not null");
            return (Criteria) this;
        }

        public Criteria andSolvedlevelEqualTo(Integer value) {
            addCriterion("solvedlevel =", value, "solvedlevel");
            return (Criteria) this;
        }

        public Criteria andSolvedlevelNotEqualTo(Integer value) {
            addCriterion("solvedlevel <>", value, "solvedlevel");
            return (Criteria) this;
        }

        public Criteria andSolvedlevelGreaterThan(Integer value) {
            addCriterion("solvedlevel >", value, "solvedlevel");
            return (Criteria) this;
        }

        public Criteria andSolvedlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("solvedlevel >=", value, "solvedlevel");
            return (Criteria) this;
        }

        public Criteria andSolvedlevelLessThan(Integer value) {
            addCriterion("solvedlevel <", value, "solvedlevel");
            return (Criteria) this;
        }

        public Criteria andSolvedlevelLessThanOrEqualTo(Integer value) {
            addCriterion("solvedlevel <=", value, "solvedlevel");
            return (Criteria) this;
        }

        public Criteria andSolvedlevelIn(List<Integer> values) {
            addCriterion("solvedlevel in", values, "solvedlevel");
            return (Criteria) this;
        }

        public Criteria andSolvedlevelNotIn(List<Integer> values) {
            addCriterion("solvedlevel not in", values, "solvedlevel");
            return (Criteria) this;
        }

        public Criteria andSolvedlevelBetween(Integer value1, Integer value2) {
            addCriterion("solvedlevel between", value1, value2, "solvedlevel");
            return (Criteria) this;
        }

        public Criteria andSolvedlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("solvedlevel not between", value1, value2, "solvedlevel");
            return (Criteria) this;
        }

        public Criteria andBack01IsNull() {
            addCriterion("back01 is null");
            return (Criteria) this;
        }

        public Criteria andBack01IsNotNull() {
            addCriterion("back01 is not null");
            return (Criteria) this;
        }

        public Criteria andBack01EqualTo(Integer value) {
            addCriterion("back01 =", value, "back01");
            return (Criteria) this;
        }

        public Criteria andBack01NotEqualTo(Integer value) {
            addCriterion("back01 <>", value, "back01");
            return (Criteria) this;
        }

        public Criteria andBack01GreaterThan(Integer value) {
            addCriterion("back01 >", value, "back01");
            return (Criteria) this;
        }

        public Criteria andBack01GreaterThanOrEqualTo(Integer value) {
            addCriterion("back01 >=", value, "back01");
            return (Criteria) this;
        }

        public Criteria andBack01LessThan(Integer value) {
            addCriterion("back01 <", value, "back01");
            return (Criteria) this;
        }

        public Criteria andBack01LessThanOrEqualTo(Integer value) {
            addCriterion("back01 <=", value, "back01");
            return (Criteria) this;
        }

        public Criteria andBack01In(List<Integer> values) {
            addCriterion("back01 in", values, "back01");
            return (Criteria) this;
        }

        public Criteria andBack01NotIn(List<Integer> values) {
            addCriterion("back01 not in", values, "back01");
            return (Criteria) this;
        }

        public Criteria andBack01Between(Integer value1, Integer value2) {
            addCriterion("back01 between", value1, value2, "back01");
            return (Criteria) this;
        }

        public Criteria andBack01NotBetween(Integer value1, Integer value2) {
            addCriterion("back01 not between", value1, value2, "back01");
            return (Criteria) this;
        }

        public Criteria andBack02IsNull() {
            addCriterion("back02 is null");
            return (Criteria) this;
        }

        public Criteria andBack02IsNotNull() {
            addCriterion("back02 is not null");
            return (Criteria) this;
        }

        public Criteria andBack02EqualTo(Integer value) {
            addCriterion("back02 =", value, "back02");
            return (Criteria) this;
        }

        public Criteria andBack02NotEqualTo(Integer value) {
            addCriterion("back02 <>", value, "back02");
            return (Criteria) this;
        }

        public Criteria andBack02GreaterThan(Integer value) {
            addCriterion("back02 >", value, "back02");
            return (Criteria) this;
        }

        public Criteria andBack02GreaterThanOrEqualTo(Integer value) {
            addCriterion("back02 >=", value, "back02");
            return (Criteria) this;
        }

        public Criteria andBack02LessThan(Integer value) {
            addCriterion("back02 <", value, "back02");
            return (Criteria) this;
        }

        public Criteria andBack02LessThanOrEqualTo(Integer value) {
            addCriterion("back02 <=", value, "back02");
            return (Criteria) this;
        }

        public Criteria andBack02In(List<Integer> values) {
            addCriterion("back02 in", values, "back02");
            return (Criteria) this;
        }

        public Criteria andBack02NotIn(List<Integer> values) {
            addCriterion("back02 not in", values, "back02");
            return (Criteria) this;
        }

        public Criteria andBack02Between(Integer value1, Integer value2) {
            addCriterion("back02 between", value1, value2, "back02");
            return (Criteria) this;
        }

        public Criteria andBack02NotBetween(Integer value1, Integer value2) {
            addCriterion("back02 not between", value1, value2, "back02");
            return (Criteria) this;
        }

        public Criteria andBack03IsNull() {
            addCriterion("back03 is null");
            return (Criteria) this;
        }

        public Criteria andBack03IsNotNull() {
            addCriterion("back03 is not null");
            return (Criteria) this;
        }

        public Criteria andBack03EqualTo(String value) {
            addCriterion("back03 =", value, "back03");
            return (Criteria) this;
        }

        public Criteria andBack03NotEqualTo(String value) {
            addCriterion("back03 <>", value, "back03");
            return (Criteria) this;
        }

        public Criteria andBack03GreaterThan(String value) {
            addCriterion("back03 >", value, "back03");
            return (Criteria) this;
        }

        public Criteria andBack03GreaterThanOrEqualTo(String value) {
            addCriterion("back03 >=", value, "back03");
            return (Criteria) this;
        }

        public Criteria andBack03LessThan(String value) {
            addCriterion("back03 <", value, "back03");
            return (Criteria) this;
        }

        public Criteria andBack03LessThanOrEqualTo(String value) {
            addCriterion("back03 <=", value, "back03");
            return (Criteria) this;
        }

        public Criteria andBack03Like(String value) {
            addCriterion("back03 like", value, "back03");
            return (Criteria) this;
        }

        public Criteria andBack03NotLike(String value) {
            addCriterion("back03 not like", value, "back03");
            return (Criteria) this;
        }

        public Criteria andBack03In(List<String> values) {
            addCriterion("back03 in", values, "back03");
            return (Criteria) this;
        }

        public Criteria andBack03NotIn(List<String> values) {
            addCriterion("back03 not in", values, "back03");
            return (Criteria) this;
        }

        public Criteria andBack03Between(String value1, String value2) {
            addCriterion("back03 between", value1, value2, "back03");
            return (Criteria) this;
        }

        public Criteria andBack03NotBetween(String value1, String value2) {
            addCriterion("back03 not between", value1, value2, "back03");
            return (Criteria) this;
        }

        public Criteria andBack04IsNull() {
            addCriterion("back04 is null");
            return (Criteria) this;
        }

        public Criteria andBack04IsNotNull() {
            addCriterion("back04 is not null");
            return (Criteria) this;
        }

        public Criteria andBack04EqualTo(String value) {
            addCriterion("back04 =", value, "back04");
            return (Criteria) this;
        }

        public Criteria andBack04NotEqualTo(String value) {
            addCriterion("back04 <>", value, "back04");
            return (Criteria) this;
        }

        public Criteria andBack04GreaterThan(String value) {
            addCriterion("back04 >", value, "back04");
            return (Criteria) this;
        }

        public Criteria andBack04GreaterThanOrEqualTo(String value) {
            addCriterion("back04 >=", value, "back04");
            return (Criteria) this;
        }

        public Criteria andBack04LessThan(String value) {
            addCriterion("back04 <", value, "back04");
            return (Criteria) this;
        }

        public Criteria andBack04LessThanOrEqualTo(String value) {
            addCriterion("back04 <=", value, "back04");
            return (Criteria) this;
        }

        public Criteria andBack04Like(String value) {
            addCriterion("back04 like", value, "back04");
            return (Criteria) this;
        }

        public Criteria andBack04NotLike(String value) {
            addCriterion("back04 not like", value, "back04");
            return (Criteria) this;
        }

        public Criteria andBack04In(List<String> values) {
            addCriterion("back04 in", values, "back04");
            return (Criteria) this;
        }

        public Criteria andBack04NotIn(List<String> values) {
            addCriterion("back04 not in", values, "back04");
            return (Criteria) this;
        }

        public Criteria andBack04Between(String value1, String value2) {
            addCriterion("back04 between", value1, value2, "back04");
            return (Criteria) this;
        }

        public Criteria andBack04NotBetween(String value1, String value2) {
            addCriterion("back04 not between", value1, value2, "back04");
            return (Criteria) this;
        }

        public Criteria andSolvedateIsNull() {
            addCriterion("solvedate is null");
            return (Criteria) this;
        }

        public Criteria andSolvedateIsNotNull() {
            addCriterion("solvedate is not null");
            return (Criteria) this;
        }

        public Criteria andSolvedateEqualTo(Date value) {
            addCriterionForJDBCDate("solvedate =", value, "solvedate");
            return (Criteria) this;
        }

        public Criteria andSolvedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("solvedate <>", value, "solvedate");
            return (Criteria) this;
        }

        public Criteria andSolvedateGreaterThan(Date value) {
            addCriterionForJDBCDate("solvedate >", value, "solvedate");
            return (Criteria) this;
        }

        public Criteria andSolvedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("solvedate >=", value, "solvedate");
            return (Criteria) this;
        }

        public Criteria andSolvedateLessThan(Date value) {
            addCriterionForJDBCDate("solvedate <", value, "solvedate");
            return (Criteria) this;
        }

        public Criteria andSolvedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("solvedate <=", value, "solvedate");
            return (Criteria) this;
        }

        public Criteria andSolvedateIn(List<Date> values) {
            addCriterionForJDBCDate("solvedate in", values, "solvedate");
            return (Criteria) this;
        }

        public Criteria andSolvedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("solvedate not in", values, "solvedate");
            return (Criteria) this;
        }

        public Criteria andSolvedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("solvedate between", value1, value2, "solvedate");
            return (Criteria) this;
        }

        public Criteria andSolvedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("solvedate not between", value1, value2, "solvedate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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