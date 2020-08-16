package com.neuedu.dangqun01.entity;

import java.util.ArrayList;
import java.util.List;

public class dreamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public dreamExample() {
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

        public Criteria andUseidIsNull() {
            addCriterion("useid is null");
            return (Criteria) this;
        }

        public Criteria andUseidIsNotNull() {
            addCriterion("useid is not null");
            return (Criteria) this;
        }

        public Criteria andUseidEqualTo(Integer value) {
            addCriterion("useid =", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidNotEqualTo(Integer value) {
            addCriterion("useid <>", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidGreaterThan(Integer value) {
            addCriterion("useid >", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("useid >=", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidLessThan(Integer value) {
            addCriterion("useid <", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidLessThanOrEqualTo(Integer value) {
            addCriterion("useid <=", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidIn(List<Integer> values) {
            addCriterion("useid in", values, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidNotIn(List<Integer> values) {
            addCriterion("useid not in", values, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidBetween(Integer value1, Integer value2) {
            addCriterion("useid between", value1, value2, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidNotBetween(Integer value1, Integer value2) {
            addCriterion("useid not between", value1, value2, "useid");
            return (Criteria) this;
        }

        public Criteria andLocatedIsNull() {
            addCriterion("located is null");
            return (Criteria) this;
        }

        public Criteria andLocatedIsNotNull() {
            addCriterion("located is not null");
            return (Criteria) this;
        }

        public Criteria andLocatedEqualTo(Integer value) {
            addCriterion("located =", value, "located");
            return (Criteria) this;
        }

        public Criteria andLocatedNotEqualTo(Integer value) {
            addCriterion("located <>", value, "located");
            return (Criteria) this;
        }

        public Criteria andLocatedGreaterThan(Integer value) {
            addCriterion("located >", value, "located");
            return (Criteria) this;
        }

        public Criteria andLocatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("located >=", value, "located");
            return (Criteria) this;
        }

        public Criteria andLocatedLessThan(Integer value) {
            addCriterion("located <", value, "located");
            return (Criteria) this;
        }

        public Criteria andLocatedLessThanOrEqualTo(Integer value) {
            addCriterion("located <=", value, "located");
            return (Criteria) this;
        }

        public Criteria andLocatedIn(List<Integer> values) {
            addCriterion("located in", values, "located");
            return (Criteria) this;
        }

        public Criteria andLocatedNotIn(List<Integer> values) {
            addCriterion("located not in", values, "located");
            return (Criteria) this;
        }

        public Criteria andLocatedBetween(Integer value1, Integer value2) {
            addCriterion("located between", value1, value2, "located");
            return (Criteria) this;
        }

        public Criteria andLocatedNotBetween(Integer value1, Integer value2) {
            addCriterion("located not between", value1, value2, "located");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andImgpathIsNull() {
            addCriterion("imgPath is null");
            return (Criteria) this;
        }

        public Criteria andImgpathIsNotNull() {
            addCriterion("imgPath is not null");
            return (Criteria) this;
        }

        public Criteria andImgpathEqualTo(String value) {
            addCriterion("imgPath =", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotEqualTo(String value) {
            addCriterion("imgPath <>", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathGreaterThan(String value) {
            addCriterion("imgPath >", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathGreaterThanOrEqualTo(String value) {
            addCriterion("imgPath >=", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathLessThan(String value) {
            addCriterion("imgPath <", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathLessThanOrEqualTo(String value) {
            addCriterion("imgPath <=", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathLike(String value) {
            addCriterion("imgPath like", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotLike(String value) {
            addCriterion("imgPath not like", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathIn(List<String> values) {
            addCriterion("imgPath in", values, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotIn(List<String> values) {
            addCriterion("imgPath not in", values, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathBetween(String value1, String value2) {
            addCriterion("imgPath between", value1, value2, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotBetween(String value1, String value2) {
            addCriterion("imgPath not between", value1, value2, "imgpath");
            return (Criteria) this;
        }

        public Criteria andAdoptedIsNull() {
            addCriterion("adopted is null");
            return (Criteria) this;
        }

        public Criteria andAdoptedIsNotNull() {
            addCriterion("adopted is not null");
            return (Criteria) this;
        }

        public Criteria andAdoptedEqualTo(Integer value) {
            addCriterion("adopted =", value, "adopted");
            return (Criteria) this;
        }

        public Criteria andAdoptedNotEqualTo(Integer value) {
            addCriterion("adopted <>", value, "adopted");
            return (Criteria) this;
        }

        public Criteria andAdoptedGreaterThan(Integer value) {
            addCriterion("adopted >", value, "adopted");
            return (Criteria) this;
        }

        public Criteria andAdoptedGreaterThanOrEqualTo(Integer value) {
            addCriterion("adopted >=", value, "adopted");
            return (Criteria) this;
        }

        public Criteria andAdoptedLessThan(Integer value) {
            addCriterion("adopted <", value, "adopted");
            return (Criteria) this;
        }

        public Criteria andAdoptedLessThanOrEqualTo(Integer value) {
            addCriterion("adopted <=", value, "adopted");
            return (Criteria) this;
        }

        public Criteria andAdoptedIn(List<Integer> values) {
            addCriterion("adopted in", values, "adopted");
            return (Criteria) this;
        }

        public Criteria andAdoptedNotIn(List<Integer> values) {
            addCriterion("adopted not in", values, "adopted");
            return (Criteria) this;
        }

        public Criteria andAdoptedBetween(Integer value1, Integer value2) {
            addCriterion("adopted between", value1, value2, "adopted");
            return (Criteria) this;
        }

        public Criteria andAdoptedNotBetween(Integer value1, Integer value2) {
            addCriterion("adopted not between", value1, value2, "adopted");
            return (Criteria) this;
        }

        public Criteria andSolvedIsNull() {
            addCriterion("solved is null");
            return (Criteria) this;
        }

        public Criteria andSolvedIsNotNull() {
            addCriterion("solved is not null");
            return (Criteria) this;
        }

        public Criteria andSolvedEqualTo(Integer value) {
            addCriterion("solved =", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedNotEqualTo(Integer value) {
            addCriterion("solved <>", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedGreaterThan(Integer value) {
            addCriterion("solved >", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedGreaterThanOrEqualTo(Integer value) {
            addCriterion("solved >=", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedLessThan(Integer value) {
            addCriterion("solved <", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedLessThanOrEqualTo(Integer value) {
            addCriterion("solved <=", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedIn(List<Integer> values) {
            addCriterion("solved in", values, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedNotIn(List<Integer> values) {
            addCriterion("solved not in", values, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedBetween(Integer value1, Integer value2) {
            addCriterion("solved between", value1, value2, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedNotBetween(Integer value1, Integer value2) {
            addCriterion("solved not between", value1, value2, "solved");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("point is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("point is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Integer value) {
            addCriterion("point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Integer value) {
            addCriterion("point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Integer value) {
            addCriterion("point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Integer value) {
            addCriterion("point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Integer value) {
            addCriterion("point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Integer> values) {
            addCriterion("point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Integer> values) {
            addCriterion("point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Integer value1, Integer value2) {
            addCriterion("point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Integer value1, Integer value2) {
            addCriterion("point not between", value1, value2, "point");
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