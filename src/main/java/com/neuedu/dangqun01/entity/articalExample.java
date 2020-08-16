package com.neuedu.dangqun01.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class articalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public articalExample() {
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

        public Criteria andKindIsNull() {
            addCriterion("kind is null");
            return (Criteria) this;
        }

        public Criteria andKindIsNotNull() {
            addCriterion("kind is not null");
            return (Criteria) this;
        }

        public Criteria andKindEqualTo(Integer value) {
            addCriterion("kind =", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotEqualTo(Integer value) {
            addCriterion("kind <>", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThan(Integer value) {
            addCriterion("kind >", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThanOrEqualTo(Integer value) {
            addCriterion("kind >=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThan(Integer value) {
            addCriterion("kind <", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThanOrEqualTo(Integer value) {
            addCriterion("kind <=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindIn(List<Integer> values) {
            addCriterion("kind in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotIn(List<Integer> values) {
            addCriterion("kind not in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindBetween(Integer value1, Integer value2) {
            addCriterion("kind between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotBetween(Integer value1, Integer value2) {
            addCriterion("kind not between", value1, value2, "kind");
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNull() {
            addCriterion("checked is null");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNotNull() {
            addCriterion("checked is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedEqualTo(Integer value) {
            addCriterion("checked =", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotEqualTo(Integer value) {
            addCriterion("checked <>", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThan(Integer value) {
            addCriterion("checked >", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThanOrEqualTo(Integer value) {
            addCriterion("checked >=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThan(Integer value) {
            addCriterion("checked <", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThanOrEqualTo(Integer value) {
            addCriterion("checked <=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedIn(List<Integer> values) {
            addCriterion("checked in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotIn(List<Integer> values) {
            addCriterion("checked not in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedBetween(Integer value1, Integer value2) {
            addCriterion("checked between", value1, value2, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotBetween(Integer value1, Integer value2) {
            addCriterion("checked not between", value1, value2, "checked");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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