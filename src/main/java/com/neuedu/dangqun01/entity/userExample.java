package com.neuedu.dangqun01.entity;

import java.util.ArrayList;
import java.util.List;

public class userExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public userExample() {
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

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(Integer value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(Integer value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(Integer value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(Integer value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(Integer value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<Integer> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<Integer> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(Integer value1, Integer value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(Integer value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(Integer value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(Integer value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(Integer value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(Integer value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<Integer> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<Integer> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(Integer value1, Integer value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(Integer value1, Integer value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
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

        public Criteria andImgparhIsNull() {
            addCriterion("imgParh is null");
            return (Criteria) this;
        }

        public Criteria andImgparhIsNotNull() {
            addCriterion("imgParh is not null");
            return (Criteria) this;
        }

        public Criteria andImgparhEqualTo(String value) {
            addCriterion("imgParh =", value, "imgparh");
            return (Criteria) this;
        }

        public Criteria andImgparhNotEqualTo(String value) {
            addCriterion("imgParh <>", value, "imgparh");
            return (Criteria) this;
        }

        public Criteria andImgparhGreaterThan(String value) {
            addCriterion("imgParh >", value, "imgparh");
            return (Criteria) this;
        }

        public Criteria andImgparhGreaterThanOrEqualTo(String value) {
            addCriterion("imgParh >=", value, "imgparh");
            return (Criteria) this;
        }

        public Criteria andImgparhLessThan(String value) {
            addCriterion("imgParh <", value, "imgparh");
            return (Criteria) this;
        }

        public Criteria andImgparhLessThanOrEqualTo(String value) {
            addCriterion("imgParh <=", value, "imgparh");
            return (Criteria) this;
        }

        public Criteria andImgparhLike(String value) {
            addCriterion("imgParh like", value, "imgparh");
            return (Criteria) this;
        }

        public Criteria andImgparhNotLike(String value) {
            addCriterion("imgParh not like", value, "imgparh");
            return (Criteria) this;
        }

        public Criteria andImgparhIn(List<String> values) {
            addCriterion("imgParh in", values, "imgparh");
            return (Criteria) this;
        }

        public Criteria andImgparhNotIn(List<String> values) {
            addCriterion("imgParh not in", values, "imgparh");
            return (Criteria) this;
        }

        public Criteria andImgparhBetween(String value1, String value2) {
            addCriterion("imgParh between", value1, value2, "imgparh");
            return (Criteria) this;
        }

        public Criteria andImgparhNotBetween(String value1, String value2) {
            addCriterion("imgParh not between", value1, value2, "imgparh");
            return (Criteria) this;
        }

        public Criteria andCareerIsNull() {
            addCriterion("career is null");
            return (Criteria) this;
        }

        public Criteria andCareerIsNotNull() {
            addCriterion("career is not null");
            return (Criteria) this;
        }

        public Criteria andCareerEqualTo(String value) {
            addCriterion("career =", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotEqualTo(String value) {
            addCriterion("career <>", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerGreaterThan(String value) {
            addCriterion("career >", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerGreaterThanOrEqualTo(String value) {
            addCriterion("career >=", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerLessThan(String value) {
            addCriterion("career <", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerLessThanOrEqualTo(String value) {
            addCriterion("career <=", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerLike(String value) {
            addCriterion("career like", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotLike(String value) {
            addCriterion("career not like", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerIn(List<String> values) {
            addCriterion("career in", values, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotIn(List<String> values) {
            addCriterion("career not in", values, "career");
            return (Criteria) this;
        }

        public Criteria andCareerBetween(String value1, String value2) {
            addCriterion("career between", value1, value2, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotBetween(String value1, String value2) {
            addCriterion("career not between", value1, value2, "career");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
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

        public Criteria andPointEqualTo(Float value) {
            addCriterion("point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Float value) {
            addCriterion("point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Float value) {
            addCriterion("point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Float value) {
            addCriterion("point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Float value) {
            addCriterion("point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Float value) {
            addCriterion("point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Float> values) {
            addCriterion("point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Float> values) {
            addCriterion("point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Float value1, Float value2) {
            addCriterion("point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Float value1, Float value2) {
            addCriterion("point not between", value1, value2, "point");
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