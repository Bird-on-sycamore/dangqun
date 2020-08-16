package com.neuedu.dangqun01.entity;

import java.util.ArrayList;
import java.util.List;

public class locatedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public locatedExample() {
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

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("areaname is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("areaname is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("areaname =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("areaname <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("areaname >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("areaname >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("areaname <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("areaname <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("areaname like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("areaname not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("areaname in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("areaname not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("areaname between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("areaname not between", value1, value2, "areaname");
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