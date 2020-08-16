package com.neuedu.dangqun01.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class activityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public activityExample() {
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

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andRestrictionIsNull() {
            addCriterion("restriction is null");
            return (Criteria) this;
        }

        public Criteria andRestrictionIsNotNull() {
            addCriterion("restriction is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictionEqualTo(String value) {
            addCriterion("restriction =", value, "restriction");
            return (Criteria) this;
        }

        public Criteria andRestrictionNotEqualTo(String value) {
            addCriterion("restriction <>", value, "restriction");
            return (Criteria) this;
        }

        public Criteria andRestrictionGreaterThan(String value) {
            addCriterion("restriction >", value, "restriction");
            return (Criteria) this;
        }

        public Criteria andRestrictionGreaterThanOrEqualTo(String value) {
            addCriterion("restriction >=", value, "restriction");
            return (Criteria) this;
        }

        public Criteria andRestrictionLessThan(String value) {
            addCriterion("restriction <", value, "restriction");
            return (Criteria) this;
        }

        public Criteria andRestrictionLessThanOrEqualTo(String value) {
            addCriterion("restriction <=", value, "restriction");
            return (Criteria) this;
        }

        public Criteria andRestrictionLike(String value) {
            addCriterion("restriction like", value, "restriction");
            return (Criteria) this;
        }

        public Criteria andRestrictionNotLike(String value) {
            addCriterion("restriction not like", value, "restriction");
            return (Criteria) this;
        }

        public Criteria andRestrictionIn(List<String> values) {
            addCriterion("restriction in", values, "restriction");
            return (Criteria) this;
        }

        public Criteria andRestrictionNotIn(List<String> values) {
            addCriterion("restriction not in", values, "restriction");
            return (Criteria) this;
        }

        public Criteria andRestrictionBetween(String value1, String value2) {
            addCriterion("restriction between", value1, value2, "restriction");
            return (Criteria) this;
        }

        public Criteria andRestrictionNotBetween(String value1, String value2) {
            addCriterion("restriction not between", value1, value2, "restriction");
            return (Criteria) this;
        }

        public Criteria andCheckedmaxIsNull() {
            addCriterion("checkedMax is null");
            return (Criteria) this;
        }

        public Criteria andCheckedmaxIsNotNull() {
            addCriterion("checkedMax is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedmaxEqualTo(Integer value) {
            addCriterion("checkedMax =", value, "checkedmax");
            return (Criteria) this;
        }

        public Criteria andCheckedmaxNotEqualTo(Integer value) {
            addCriterion("checkedMax <>", value, "checkedmax");
            return (Criteria) this;
        }

        public Criteria andCheckedmaxGreaterThan(Integer value) {
            addCriterion("checkedMax >", value, "checkedmax");
            return (Criteria) this;
        }

        public Criteria andCheckedmaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkedMax >=", value, "checkedmax");
            return (Criteria) this;
        }

        public Criteria andCheckedmaxLessThan(Integer value) {
            addCriterion("checkedMax <", value, "checkedmax");
            return (Criteria) this;
        }

        public Criteria andCheckedmaxLessThanOrEqualTo(Integer value) {
            addCriterion("checkedMax <=", value, "checkedmax");
            return (Criteria) this;
        }

        public Criteria andCheckedmaxIn(List<Integer> values) {
            addCriterion("checkedMax in", values, "checkedmax");
            return (Criteria) this;
        }

        public Criteria andCheckedmaxNotIn(List<Integer> values) {
            addCriterion("checkedMax not in", values, "checkedmax");
            return (Criteria) this;
        }

        public Criteria andCheckedmaxBetween(Integer value1, Integer value2) {
            addCriterion("checkedMax between", value1, value2, "checkedmax");
            return (Criteria) this;
        }

        public Criteria andCheckedmaxNotBetween(Integer value1, Integer value2) {
            addCriterion("checkedMax not between", value1, value2, "checkedmax");
            return (Criteria) this;
        }

        public Criteria andCheckedcurrentIsNull() {
            addCriterion("checkedCurrent is null");
            return (Criteria) this;
        }

        public Criteria andCheckedcurrentIsNotNull() {
            addCriterion("checkedCurrent is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedcurrentEqualTo(Integer value) {
            addCriterion("checkedCurrent =", value, "checkedcurrent");
            return (Criteria) this;
        }

        public Criteria andCheckedcurrentNotEqualTo(Integer value) {
            addCriterion("checkedCurrent <>", value, "checkedcurrent");
            return (Criteria) this;
        }

        public Criteria andCheckedcurrentGreaterThan(Integer value) {
            addCriterion("checkedCurrent >", value, "checkedcurrent");
            return (Criteria) this;
        }

        public Criteria andCheckedcurrentGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkedCurrent >=", value, "checkedcurrent");
            return (Criteria) this;
        }

        public Criteria andCheckedcurrentLessThan(Integer value) {
            addCriterion("checkedCurrent <", value, "checkedcurrent");
            return (Criteria) this;
        }

        public Criteria andCheckedcurrentLessThanOrEqualTo(Integer value) {
            addCriterion("checkedCurrent <=", value, "checkedcurrent");
            return (Criteria) this;
        }

        public Criteria andCheckedcurrentIn(List<Integer> values) {
            addCriterion("checkedCurrent in", values, "checkedcurrent");
            return (Criteria) this;
        }

        public Criteria andCheckedcurrentNotIn(List<Integer> values) {
            addCriterion("checkedCurrent not in", values, "checkedcurrent");
            return (Criteria) this;
        }

        public Criteria andCheckedcurrentBetween(Integer value1, Integer value2) {
            addCriterion("checkedCurrent between", value1, value2, "checkedcurrent");
            return (Criteria) this;
        }

        public Criteria andCheckedcurrentNotBetween(Integer value1, Integer value2) {
            addCriterion("checkedCurrent not between", value1, value2, "checkedcurrent");
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

        public Criteria andHoldtimeIsNull() {
            addCriterion("holdtime is null");
            return (Criteria) this;
        }

        public Criteria andHoldtimeIsNotNull() {
            addCriterion("holdtime is not null");
            return (Criteria) this;
        }

        public Criteria andHoldtimeEqualTo(Date value) {
            addCriterion("holdtime =", value, "holdtime");
            return (Criteria) this;
        }

        public Criteria andHoldtimeNotEqualTo(Date value) {
            addCriterion("holdtime <>", value, "holdtime");
            return (Criteria) this;
        }

        public Criteria andHoldtimeGreaterThan(Date value) {
            addCriterion("holdtime >", value, "holdtime");
            return (Criteria) this;
        }

        public Criteria andHoldtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("holdtime >=", value, "holdtime");
            return (Criteria) this;
        }

        public Criteria andHoldtimeLessThan(Date value) {
            addCriterion("holdtime <", value, "holdtime");
            return (Criteria) this;
        }

        public Criteria andHoldtimeLessThanOrEqualTo(Date value) {
            addCriterion("holdtime <=", value, "holdtime");
            return (Criteria) this;
        }

        public Criteria andHoldtimeIn(List<Date> values) {
            addCriterion("holdtime in", values, "holdtime");
            return (Criteria) this;
        }

        public Criteria andHoldtimeNotIn(List<Date> values) {
            addCriterion("holdtime not in", values, "holdtime");
            return (Criteria) this;
        }

        public Criteria andHoldtimeBetween(Date value1, Date value2) {
            addCriterion("holdtime between", value1, value2, "holdtime");
            return (Criteria) this;
        }

        public Criteria andHoldtimeNotBetween(Date value1, Date value2) {
            addCriterion("holdtime not between", value1, value2, "holdtime");
            return (Criteria) this;
        }

        public Criteria andTimelengthIsNull() {
            addCriterion("timeLength is null");
            return (Criteria) this;
        }

        public Criteria andTimelengthIsNotNull() {
            addCriterion("timeLength is not null");
            return (Criteria) this;
        }

        public Criteria andTimelengthEqualTo(String value) {
            addCriterion("timeLength =", value, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthNotEqualTo(String value) {
            addCriterion("timeLength <>", value, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthGreaterThan(String value) {
            addCriterion("timeLength >", value, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthGreaterThanOrEqualTo(String value) {
            addCriterion("timeLength >=", value, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthLessThan(String value) {
            addCriterion("timeLength <", value, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthLessThanOrEqualTo(String value) {
            addCriterion("timeLength <=", value, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthLike(String value) {
            addCriterion("timeLength like", value, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthNotLike(String value) {
            addCriterion("timeLength not like", value, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthIn(List<String> values) {
            addCriterion("timeLength in", values, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthNotIn(List<String> values) {
            addCriterion("timeLength not in", values, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthBetween(String value1, String value2) {
            addCriterion("timeLength between", value1, value2, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthNotBetween(String value1, String value2) {
            addCriterion("timeLength not between", value1, value2, "timelength");
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