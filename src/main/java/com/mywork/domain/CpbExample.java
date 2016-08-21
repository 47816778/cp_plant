package com.mywork.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CpbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CpbExample() {
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

        public Criteria andQhIsNull() {
            addCriterion("qh is null");
            return (Criteria) this;
        }

        public Criteria andQhIsNotNull() {
            addCriterion("qh is not null");
            return (Criteria) this;
        }

        public Criteria andQhEqualTo(String value) {
            addCriterion("qh =", value, "qh");
            return (Criteria) this;
        }

        public Criteria andQhNotEqualTo(String value) {
            addCriterion("qh <>", value, "qh");
            return (Criteria) this;
        }

        public Criteria andQhGreaterThan(String value) {
            addCriterion("qh >", value, "qh");
            return (Criteria) this;
        }

        public Criteria andQhGreaterThanOrEqualTo(String value) {
            addCriterion("qh >=", value, "qh");
            return (Criteria) this;
        }

        public Criteria andQhLessThan(String value) {
            addCriterion("qh <", value, "qh");
            return (Criteria) this;
        }

        public Criteria andQhLessThanOrEqualTo(String value) {
            addCriterion("qh <=", value, "qh");
            return (Criteria) this;
        }

        public Criteria andQhLike(String value) {
            addCriterion("qh like", value, "qh");
            return (Criteria) this;
        }

        public Criteria andQhNotLike(String value) {
            addCriterion("qh not like", value, "qh");
            return (Criteria) this;
        }

        public Criteria andQhIn(List<String> values) {
            addCriterion("qh in", values, "qh");
            return (Criteria) this;
        }

        public Criteria andQhNotIn(List<String> values) {
            addCriterion("qh not in", values, "qh");
            return (Criteria) this;
        }

        public Criteria andQhBetween(String value1, String value2) {
            addCriterion("qh between", value1, value2, "qh");
            return (Criteria) this;
        }

        public Criteria andQhNotBetween(String value1, String value2) {
            addCriterion("qh not between", value1, value2, "qh");
            return (Criteria) this;
        }

        public Criteria andWwsIsNull() {
            addCriterion("wws is null");
            return (Criteria) this;
        }

        public Criteria andWwsIsNotNull() {
            addCriterion("wws is not null");
            return (Criteria) this;
        }

        public Criteria andWwsEqualTo(Integer value) {
            addCriterion("wws =", value, "wws");
            return (Criteria) this;
        }

        public Criteria andWwsNotEqualTo(Integer value) {
            addCriterion("wws <>", value, "wws");
            return (Criteria) this;
        }

        public Criteria andWwsGreaterThan(Integer value) {
            addCriterion("wws >", value, "wws");
            return (Criteria) this;
        }

        public Criteria andWwsGreaterThanOrEqualTo(Integer value) {
            addCriterion("wws >=", value, "wws");
            return (Criteria) this;
        }

        public Criteria andWwsLessThan(Integer value) {
            addCriterion("wws <", value, "wws");
            return (Criteria) this;
        }

        public Criteria andWwsLessThanOrEqualTo(Integer value) {
            addCriterion("wws <=", value, "wws");
            return (Criteria) this;
        }

        public Criteria andWwsIn(List<Integer> values) {
            addCriterion("wws in", values, "wws");
            return (Criteria) this;
        }

        public Criteria andWwsNotIn(List<Integer> values) {
            addCriterion("wws not in", values, "wws");
            return (Criteria) this;
        }

        public Criteria andWwsBetween(Integer value1, Integer value2) {
            addCriterion("wws between", value1, value2, "wws");
            return (Criteria) this;
        }

        public Criteria andWwsNotBetween(Integer value1, Integer value2) {
            addCriterion("wws not between", value1, value2, "wws");
            return (Criteria) this;
        }

        public Criteria andQwsIsNull() {
            addCriterion("qws is null");
            return (Criteria) this;
        }

        public Criteria andQwsIsNotNull() {
            addCriterion("qws is not null");
            return (Criteria) this;
        }

        public Criteria andQwsEqualTo(Integer value) {
            addCriterion("qws =", value, "qws");
            return (Criteria) this;
        }

        public Criteria andQwsNotEqualTo(Integer value) {
            addCriterion("qws <>", value, "qws");
            return (Criteria) this;
        }

        public Criteria andQwsGreaterThan(Integer value) {
            addCriterion("qws >", value, "qws");
            return (Criteria) this;
        }

        public Criteria andQwsGreaterThanOrEqualTo(Integer value) {
            addCriterion("qws >=", value, "qws");
            return (Criteria) this;
        }

        public Criteria andQwsLessThan(Integer value) {
            addCriterion("qws <", value, "qws");
            return (Criteria) this;
        }

        public Criteria andQwsLessThanOrEqualTo(Integer value) {
            addCriterion("qws <=", value, "qws");
            return (Criteria) this;
        }

        public Criteria andQwsIn(List<Integer> values) {
            addCriterion("qws in", values, "qws");
            return (Criteria) this;
        }

        public Criteria andQwsNotIn(List<Integer> values) {
            addCriterion("qws not in", values, "qws");
            return (Criteria) this;
        }

        public Criteria andQwsBetween(Integer value1, Integer value2) {
            addCriterion("qws between", value1, value2, "qws");
            return (Criteria) this;
        }

        public Criteria andQwsNotBetween(Integer value1, Integer value2) {
            addCriterion("qws not between", value1, value2, "qws");
            return (Criteria) this;
        }

        public Criteria andBwsIsNull() {
            addCriterion("bws is null");
            return (Criteria) this;
        }

        public Criteria andBwsIsNotNull() {
            addCriterion("bws is not null");
            return (Criteria) this;
        }

        public Criteria andBwsEqualTo(Integer value) {
            addCriterion("bws =", value, "bws");
            return (Criteria) this;
        }

        public Criteria andBwsNotEqualTo(Integer value) {
            addCriterion("bws <>", value, "bws");
            return (Criteria) this;
        }

        public Criteria andBwsGreaterThan(Integer value) {
            addCriterion("bws >", value, "bws");
            return (Criteria) this;
        }

        public Criteria andBwsGreaterThanOrEqualTo(Integer value) {
            addCriterion("bws >=", value, "bws");
            return (Criteria) this;
        }

        public Criteria andBwsLessThan(Integer value) {
            addCriterion("bws <", value, "bws");
            return (Criteria) this;
        }

        public Criteria andBwsLessThanOrEqualTo(Integer value) {
            addCriterion("bws <=", value, "bws");
            return (Criteria) this;
        }

        public Criteria andBwsIn(List<Integer> values) {
            addCriterion("bws in", values, "bws");
            return (Criteria) this;
        }

        public Criteria andBwsNotIn(List<Integer> values) {
            addCriterion("bws not in", values, "bws");
            return (Criteria) this;
        }

        public Criteria andBwsBetween(Integer value1, Integer value2) {
            addCriterion("bws between", value1, value2, "bws");
            return (Criteria) this;
        }

        public Criteria andBwsNotBetween(Integer value1, Integer value2) {
            addCriterion("bws not between", value1, value2, "bws");
            return (Criteria) this;
        }

        public Criteria andSwsIsNull() {
            addCriterion("sws is null");
            return (Criteria) this;
        }

        public Criteria andSwsIsNotNull() {
            addCriterion("sws is not null");
            return (Criteria) this;
        }

        public Criteria andSwsEqualTo(Integer value) {
            addCriterion("sws =", value, "sws");
            return (Criteria) this;
        }

        public Criteria andSwsNotEqualTo(Integer value) {
            addCriterion("sws <>", value, "sws");
            return (Criteria) this;
        }

        public Criteria andSwsGreaterThan(Integer value) {
            addCriterion("sws >", value, "sws");
            return (Criteria) this;
        }

        public Criteria andSwsGreaterThanOrEqualTo(Integer value) {
            addCriterion("sws >=", value, "sws");
            return (Criteria) this;
        }

        public Criteria andSwsLessThan(Integer value) {
            addCriterion("sws <", value, "sws");
            return (Criteria) this;
        }

        public Criteria andSwsLessThanOrEqualTo(Integer value) {
            addCriterion("sws <=", value, "sws");
            return (Criteria) this;
        }

        public Criteria andSwsIn(List<Integer> values) {
            addCriterion("sws in", values, "sws");
            return (Criteria) this;
        }

        public Criteria andSwsNotIn(List<Integer> values) {
            addCriterion("sws not in", values, "sws");
            return (Criteria) this;
        }

        public Criteria andSwsBetween(Integer value1, Integer value2) {
            addCriterion("sws between", value1, value2, "sws");
            return (Criteria) this;
        }

        public Criteria andSwsNotBetween(Integer value1, Integer value2) {
            addCriterion("sws not between", value1, value2, "sws");
            return (Criteria) this;
        }

        public Criteria andGwsIsNull() {
            addCriterion("gws is null");
            return (Criteria) this;
        }

        public Criteria andGwsIsNotNull() {
            addCriterion("gws is not null");
            return (Criteria) this;
        }

        public Criteria andGwsEqualTo(Integer value) {
            addCriterion("gws =", value, "gws");
            return (Criteria) this;
        }

        public Criteria andGwsNotEqualTo(Integer value) {
            addCriterion("gws <>", value, "gws");
            return (Criteria) this;
        }

        public Criteria andGwsGreaterThan(Integer value) {
            addCriterion("gws >", value, "gws");
            return (Criteria) this;
        }

        public Criteria andGwsGreaterThanOrEqualTo(Integer value) {
            addCriterion("gws >=", value, "gws");
            return (Criteria) this;
        }

        public Criteria andGwsLessThan(Integer value) {
            addCriterion("gws <", value, "gws");
            return (Criteria) this;
        }

        public Criteria andGwsLessThanOrEqualTo(Integer value) {
            addCriterion("gws <=", value, "gws");
            return (Criteria) this;
        }

        public Criteria andGwsIn(List<Integer> values) {
            addCriterion("gws in", values, "gws");
            return (Criteria) this;
        }

        public Criteria andGwsNotIn(List<Integer> values) {
            addCriterion("gws not in", values, "gws");
            return (Criteria) this;
        }

        public Criteria andGwsBetween(Integer value1, Integer value2) {
            addCriterion("gws between", value1, value2, "gws");
            return (Criteria) this;
        }

        public Criteria andGwsNotBetween(Integer value1, Integer value2) {
            addCriterion("gws not between", value1, value2, "gws");
            return (Criteria) this;
        }

        public Criteria andHzIsNull() {
            addCriterion("hz is null");
            return (Criteria) this;
        }

        public Criteria andHzIsNotNull() {
            addCriterion("hz is not null");
            return (Criteria) this;
        }

        public Criteria andHzEqualTo(Integer value) {
            addCriterion("hz =", value, "hz");
            return (Criteria) this;
        }

        public Criteria andHzNotEqualTo(Integer value) {
            addCriterion("hz <>", value, "hz");
            return (Criteria) this;
        }

        public Criteria andHzGreaterThan(Integer value) {
            addCriterion("hz >", value, "hz");
            return (Criteria) this;
        }

        public Criteria andHzGreaterThanOrEqualTo(Integer value) {
            addCriterion("hz >=", value, "hz");
            return (Criteria) this;
        }

        public Criteria andHzLessThan(Integer value) {
            addCriterion("hz <", value, "hz");
            return (Criteria) this;
        }

        public Criteria andHzLessThanOrEqualTo(Integer value) {
            addCriterion("hz <=", value, "hz");
            return (Criteria) this;
        }

        public Criteria andHzIn(List<Integer> values) {
            addCriterion("hz in", values, "hz");
            return (Criteria) this;
        }

        public Criteria andHzNotIn(List<Integer> values) {
            addCriterion("hz not in", values, "hz");
            return (Criteria) this;
        }

        public Criteria andHzBetween(Integer value1, Integer value2) {
            addCriterion("hz between", value1, value2, "hz");
            return (Criteria) this;
        }

        public Criteria andHzNotBetween(Integer value1, Integer value2) {
            addCriterion("hz not between", value1, value2, "hz");
            return (Criteria) this;
        }

        public Criteria andKdIsNull() {
            addCriterion("kd is null");
            return (Criteria) this;
        }

        public Criteria andKdIsNotNull() {
            addCriterion("kd is not null");
            return (Criteria) this;
        }

        public Criteria andKdEqualTo(Integer value) {
            addCriterion("kd =", value, "kd");
            return (Criteria) this;
        }

        public Criteria andKdNotEqualTo(Integer value) {
            addCriterion("kd <>", value, "kd");
            return (Criteria) this;
        }

        public Criteria andKdGreaterThan(Integer value) {
            addCriterion("kd >", value, "kd");
            return (Criteria) this;
        }

        public Criteria andKdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kd >=", value, "kd");
            return (Criteria) this;
        }

        public Criteria andKdLessThan(Integer value) {
            addCriterion("kd <", value, "kd");
            return (Criteria) this;
        }

        public Criteria andKdLessThanOrEqualTo(Integer value) {
            addCriterion("kd <=", value, "kd");
            return (Criteria) this;
        }

        public Criteria andKdIn(List<Integer> values) {
            addCriterion("kd in", values, "kd");
            return (Criteria) this;
        }

        public Criteria andKdNotIn(List<Integer> values) {
            addCriterion("kd not in", values, "kd");
            return (Criteria) this;
        }

        public Criteria andKdBetween(Integer value1, Integer value2) {
            addCriterion("kd between", value1, value2, "kd");
            return (Criteria) this;
        }

        public Criteria andKdNotBetween(Integer value1, Integer value2) {
            addCriterion("kd not between", value1, value2, "kd");
            return (Criteria) this;
        }

        public Criteria andHzwhIsNull() {
            addCriterion("hzwh is null");
            return (Criteria) this;
        }

        public Criteria andHzwhIsNotNull() {
            addCriterion("hzwh is not null");
            return (Criteria) this;
        }

        public Criteria andHzwhEqualTo(Integer value) {
            addCriterion("hzwh =", value, "hzwh");
            return (Criteria) this;
        }

        public Criteria andHzwhNotEqualTo(Integer value) {
            addCriterion("hzwh <>", value, "hzwh");
            return (Criteria) this;
        }

        public Criteria andHzwhGreaterThan(Integer value) {
            addCriterion("hzwh >", value, "hzwh");
            return (Criteria) this;
        }

        public Criteria andHzwhGreaterThanOrEqualTo(Integer value) {
            addCriterion("hzwh >=", value, "hzwh");
            return (Criteria) this;
        }

        public Criteria andHzwhLessThan(Integer value) {
            addCriterion("hzwh <", value, "hzwh");
            return (Criteria) this;
        }

        public Criteria andHzwhLessThanOrEqualTo(Integer value) {
            addCriterion("hzwh <=", value, "hzwh");
            return (Criteria) this;
        }

        public Criteria andHzwhIn(List<Integer> values) {
            addCriterion("hzwh in", values, "hzwh");
            return (Criteria) this;
        }

        public Criteria andHzwhNotIn(List<Integer> values) {
            addCriterion("hzwh not in", values, "hzwh");
            return (Criteria) this;
        }

        public Criteria andHzwhBetween(Integer value1, Integer value2) {
            addCriterion("hzwh between", value1, value2, "hzwh");
            return (Criteria) this;
        }

        public Criteria andHzwhNotBetween(Integer value1, Integer value2) {
            addCriterion("hzwh not between", value1, value2, "hzwh");
            return (Criteria) this;
        }

        public Criteria andJsIsNull() {
            addCriterion("js is null");
            return (Criteria) this;
        }

        public Criteria andJsIsNotNull() {
            addCriterion("js is not null");
            return (Criteria) this;
        }

        public Criteria andJsEqualTo(Integer value) {
            addCriterion("js =", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsNotEqualTo(Integer value) {
            addCriterion("js <>", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsGreaterThan(Integer value) {
            addCriterion("js >", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsGreaterThanOrEqualTo(Integer value) {
            addCriterion("js >=", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsLessThan(Integer value) {
            addCriterion("js <", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsLessThanOrEqualTo(Integer value) {
            addCriterion("js <=", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsIn(List<Integer> values) {
            addCriterion("js in", values, "js");
            return (Criteria) this;
        }

        public Criteria andJsNotIn(List<Integer> values) {
            addCriterion("js not in", values, "js");
            return (Criteria) this;
        }

        public Criteria andJsBetween(Integer value1, Integer value2) {
            addCriterion("js between", value1, value2, "js");
            return (Criteria) this;
        }

        public Criteria andJsNotBetween(Integer value1, Integer value2) {
            addCriterion("js not between", value1, value2, "js");
            return (Criteria) this;
        }

        public Criteria andOsIsNull() {
            addCriterion("os is null");
            return (Criteria) this;
        }

        public Criteria andOsIsNotNull() {
            addCriterion("os is not null");
            return (Criteria) this;
        }

        public Criteria andOsEqualTo(Integer value) {
            addCriterion("os =", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotEqualTo(Integer value) {
            addCriterion("os <>", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThan(Integer value) {
            addCriterion("os >", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThanOrEqualTo(Integer value) {
            addCriterion("os >=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThan(Integer value) {
            addCriterion("os <", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThanOrEqualTo(Integer value) {
            addCriterion("os <=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsIn(List<Integer> values) {
            addCriterion("os in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotIn(List<Integer> values) {
            addCriterion("os not in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsBetween(Integer value1, Integer value2) {
            addCriterion("os between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotBetween(Integer value1, Integer value2) {
            addCriterion("os not between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andZsIsNull() {
            addCriterion("zs is null");
            return (Criteria) this;
        }

        public Criteria andZsIsNotNull() {
            addCriterion("zs is not null");
            return (Criteria) this;
        }

        public Criteria andZsEqualTo(Integer value) {
            addCriterion("zs =", value, "zs");
            return (Criteria) this;
        }

        public Criteria andZsNotEqualTo(Integer value) {
            addCriterion("zs <>", value, "zs");
            return (Criteria) this;
        }

        public Criteria andZsGreaterThan(Integer value) {
            addCriterion("zs >", value, "zs");
            return (Criteria) this;
        }

        public Criteria andZsGreaterThanOrEqualTo(Integer value) {
            addCriterion("zs >=", value, "zs");
            return (Criteria) this;
        }

        public Criteria andZsLessThan(Integer value) {
            addCriterion("zs <", value, "zs");
            return (Criteria) this;
        }

        public Criteria andZsLessThanOrEqualTo(Integer value) {
            addCriterion("zs <=", value, "zs");
            return (Criteria) this;
        }

        public Criteria andZsIn(List<Integer> values) {
            addCriterion("zs in", values, "zs");
            return (Criteria) this;
        }

        public Criteria andZsNotIn(List<Integer> values) {
            addCriterion("zs not in", values, "zs");
            return (Criteria) this;
        }

        public Criteria andZsBetween(Integer value1, Integer value2) {
            addCriterion("zs between", value1, value2, "zs");
            return (Criteria) this;
        }

        public Criteria andZsNotBetween(Integer value1, Integer value2) {
            addCriterion("zs not between", value1, value2, "zs");
            return (Criteria) this;
        }

        public Criteria andHsIsNull() {
            addCriterion("hs is null");
            return (Criteria) this;
        }

        public Criteria andHsIsNotNull() {
            addCriterion("hs is not null");
            return (Criteria) this;
        }

        public Criteria andHsEqualTo(Integer value) {
            addCriterion("hs =", value, "hs");
            return (Criteria) this;
        }

        public Criteria andHsNotEqualTo(Integer value) {
            addCriterion("hs <>", value, "hs");
            return (Criteria) this;
        }

        public Criteria andHsGreaterThan(Integer value) {
            addCriterion("hs >", value, "hs");
            return (Criteria) this;
        }

        public Criteria andHsGreaterThanOrEqualTo(Integer value) {
            addCriterion("hs >=", value, "hs");
            return (Criteria) this;
        }

        public Criteria andHsLessThan(Integer value) {
            addCriterion("hs <", value, "hs");
            return (Criteria) this;
        }

        public Criteria andHsLessThanOrEqualTo(Integer value) {
            addCriterion("hs <=", value, "hs");
            return (Criteria) this;
        }

        public Criteria andHsIn(List<Integer> values) {
            addCriterion("hs in", values, "hs");
            return (Criteria) this;
        }

        public Criteria andHsNotIn(List<Integer> values) {
            addCriterion("hs not in", values, "hs");
            return (Criteria) this;
        }

        public Criteria andHsBetween(Integer value1, Integer value2) {
            addCriterion("hs between", value1, value2, "hs");
            return (Criteria) this;
        }

        public Criteria andHsNotBetween(Integer value1, Integer value2) {
            addCriterion("hs not between", value1, value2, "hs");
            return (Criteria) this;
        }

        public Criteria andWwdsIsNull() {
            addCriterion("wwds is null");
            return (Criteria) this;
        }

        public Criteria andWwdsIsNotNull() {
            addCriterion("wwds is not null");
            return (Criteria) this;
        }

        public Criteria andWwdsEqualTo(Integer value) {
            addCriterion("wwds =", value, "wwds");
            return (Criteria) this;
        }

        public Criteria andWwdsNotEqualTo(Integer value) {
            addCriterion("wwds <>", value, "wwds");
            return (Criteria) this;
        }

        public Criteria andWwdsGreaterThan(Integer value) {
            addCriterion("wwds >", value, "wwds");
            return (Criteria) this;
        }

        public Criteria andWwdsGreaterThanOrEqualTo(Integer value) {
            addCriterion("wwds >=", value, "wwds");
            return (Criteria) this;
        }

        public Criteria andWwdsLessThan(Integer value) {
            addCriterion("wwds <", value, "wwds");
            return (Criteria) this;
        }

        public Criteria andWwdsLessThanOrEqualTo(Integer value) {
            addCriterion("wwds <=", value, "wwds");
            return (Criteria) this;
        }

        public Criteria andWwdsIn(List<Integer> values) {
            addCriterion("wwds in", values, "wwds");
            return (Criteria) this;
        }

        public Criteria andWwdsNotIn(List<Integer> values) {
            addCriterion("wwds not in", values, "wwds");
            return (Criteria) this;
        }

        public Criteria andWwdsBetween(Integer value1, Integer value2) {
            addCriterion("wwds between", value1, value2, "wwds");
            return (Criteria) this;
        }

        public Criteria andWwdsNotBetween(Integer value1, Integer value2) {
            addCriterion("wwds not between", value1, value2, "wwds");
            return (Criteria) this;
        }

        public Criteria andQwdsIsNull() {
            addCriterion("qwds is null");
            return (Criteria) this;
        }

        public Criteria andQwdsIsNotNull() {
            addCriterion("qwds is not null");
            return (Criteria) this;
        }

        public Criteria andQwdsEqualTo(Integer value) {
            addCriterion("qwds =", value, "qwds");
            return (Criteria) this;
        }

        public Criteria andQwdsNotEqualTo(Integer value) {
            addCriterion("qwds <>", value, "qwds");
            return (Criteria) this;
        }

        public Criteria andQwdsGreaterThan(Integer value) {
            addCriterion("qwds >", value, "qwds");
            return (Criteria) this;
        }

        public Criteria andQwdsGreaterThanOrEqualTo(Integer value) {
            addCriterion("qwds >=", value, "qwds");
            return (Criteria) this;
        }

        public Criteria andQwdsLessThan(Integer value) {
            addCriterion("qwds <", value, "qwds");
            return (Criteria) this;
        }

        public Criteria andQwdsLessThanOrEqualTo(Integer value) {
            addCriterion("qwds <=", value, "qwds");
            return (Criteria) this;
        }

        public Criteria andQwdsIn(List<Integer> values) {
            addCriterion("qwds in", values, "qwds");
            return (Criteria) this;
        }

        public Criteria andQwdsNotIn(List<Integer> values) {
            addCriterion("qwds not in", values, "qwds");
            return (Criteria) this;
        }

        public Criteria andQwdsBetween(Integer value1, Integer value2) {
            addCriterion("qwds between", value1, value2, "qwds");
            return (Criteria) this;
        }

        public Criteria andQwdsNotBetween(Integer value1, Integer value2) {
            addCriterion("qwds not between", value1, value2, "qwds");
            return (Criteria) this;
        }

        public Criteria andBwdsIsNull() {
            addCriterion("bwds is null");
            return (Criteria) this;
        }

        public Criteria andBwdsIsNotNull() {
            addCriterion("bwds is not null");
            return (Criteria) this;
        }

        public Criteria andBwdsEqualTo(Integer value) {
            addCriterion("bwds =", value, "bwds");
            return (Criteria) this;
        }

        public Criteria andBwdsNotEqualTo(Integer value) {
            addCriterion("bwds <>", value, "bwds");
            return (Criteria) this;
        }

        public Criteria andBwdsGreaterThan(Integer value) {
            addCriterion("bwds >", value, "bwds");
            return (Criteria) this;
        }

        public Criteria andBwdsGreaterThanOrEqualTo(Integer value) {
            addCriterion("bwds >=", value, "bwds");
            return (Criteria) this;
        }

        public Criteria andBwdsLessThan(Integer value) {
            addCriterion("bwds <", value, "bwds");
            return (Criteria) this;
        }

        public Criteria andBwdsLessThanOrEqualTo(Integer value) {
            addCriterion("bwds <=", value, "bwds");
            return (Criteria) this;
        }

        public Criteria andBwdsIn(List<Integer> values) {
            addCriterion("bwds in", values, "bwds");
            return (Criteria) this;
        }

        public Criteria andBwdsNotIn(List<Integer> values) {
            addCriterion("bwds not in", values, "bwds");
            return (Criteria) this;
        }

        public Criteria andBwdsBetween(Integer value1, Integer value2) {
            addCriterion("bwds between", value1, value2, "bwds");
            return (Criteria) this;
        }

        public Criteria andBwdsNotBetween(Integer value1, Integer value2) {
            addCriterion("bwds not between", value1, value2, "bwds");
            return (Criteria) this;
        }

        public Criteria andSwdsIsNull() {
            addCriterion("swds is null");
            return (Criteria) this;
        }

        public Criteria andSwdsIsNotNull() {
            addCriterion("swds is not null");
            return (Criteria) this;
        }

        public Criteria andSwdsEqualTo(Integer value) {
            addCriterion("swds =", value, "swds");
            return (Criteria) this;
        }

        public Criteria andSwdsNotEqualTo(Integer value) {
            addCriterion("swds <>", value, "swds");
            return (Criteria) this;
        }

        public Criteria andSwdsGreaterThan(Integer value) {
            addCriterion("swds >", value, "swds");
            return (Criteria) this;
        }

        public Criteria andSwdsGreaterThanOrEqualTo(Integer value) {
            addCriterion("swds >=", value, "swds");
            return (Criteria) this;
        }

        public Criteria andSwdsLessThan(Integer value) {
            addCriterion("swds <", value, "swds");
            return (Criteria) this;
        }

        public Criteria andSwdsLessThanOrEqualTo(Integer value) {
            addCriterion("swds <=", value, "swds");
            return (Criteria) this;
        }

        public Criteria andSwdsIn(List<Integer> values) {
            addCriterion("swds in", values, "swds");
            return (Criteria) this;
        }

        public Criteria andSwdsNotIn(List<Integer> values) {
            addCriterion("swds not in", values, "swds");
            return (Criteria) this;
        }

        public Criteria andSwdsBetween(Integer value1, Integer value2) {
            addCriterion("swds between", value1, value2, "swds");
            return (Criteria) this;
        }

        public Criteria andSwdsNotBetween(Integer value1, Integer value2) {
            addCriterion("swds not between", value1, value2, "swds");
            return (Criteria) this;
        }

        public Criteria andGwdsIsNull() {
            addCriterion("gwds is null");
            return (Criteria) this;
        }

        public Criteria andGwdsIsNotNull() {
            addCriterion("gwds is not null");
            return (Criteria) this;
        }

        public Criteria andGwdsEqualTo(Integer value) {
            addCriterion("gwds =", value, "gwds");
            return (Criteria) this;
        }

        public Criteria andGwdsNotEqualTo(Integer value) {
            addCriterion("gwds <>", value, "gwds");
            return (Criteria) this;
        }

        public Criteria andGwdsGreaterThan(Integer value) {
            addCriterion("gwds >", value, "gwds");
            return (Criteria) this;
        }

        public Criteria andGwdsGreaterThanOrEqualTo(Integer value) {
            addCriterion("gwds >=", value, "gwds");
            return (Criteria) this;
        }

        public Criteria andGwdsLessThan(Integer value) {
            addCriterion("gwds <", value, "gwds");
            return (Criteria) this;
        }

        public Criteria andGwdsLessThanOrEqualTo(Integer value) {
            addCriterion("gwds <=", value, "gwds");
            return (Criteria) this;
        }

        public Criteria andGwdsIn(List<Integer> values) {
            addCriterion("gwds in", values, "gwds");
            return (Criteria) this;
        }

        public Criteria andGwdsNotIn(List<Integer> values) {
            addCriterion("gwds not in", values, "gwds");
            return (Criteria) this;
        }

        public Criteria andGwdsBetween(Integer value1, Integer value2) {
            addCriterion("gwds between", value1, value2, "gwds");
            return (Criteria) this;
        }

        public Criteria andGwdsNotBetween(Integer value1, Integer value2) {
            addCriterion("gwds not between", value1, value2, "gwds");
            return (Criteria) this;
        }

        public Criteria andWwdxIsNull() {
            addCriterion("wwdx is null");
            return (Criteria) this;
        }

        public Criteria andWwdxIsNotNull() {
            addCriterion("wwdx is not null");
            return (Criteria) this;
        }

        public Criteria andWwdxEqualTo(Integer value) {
            addCriterion("wwdx =", value, "wwdx");
            return (Criteria) this;
        }

        public Criteria andWwdxNotEqualTo(Integer value) {
            addCriterion("wwdx <>", value, "wwdx");
            return (Criteria) this;
        }

        public Criteria andWwdxGreaterThan(Integer value) {
            addCriterion("wwdx >", value, "wwdx");
            return (Criteria) this;
        }

        public Criteria andWwdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("wwdx >=", value, "wwdx");
            return (Criteria) this;
        }

        public Criteria andWwdxLessThan(Integer value) {
            addCriterion("wwdx <", value, "wwdx");
            return (Criteria) this;
        }

        public Criteria andWwdxLessThanOrEqualTo(Integer value) {
            addCriterion("wwdx <=", value, "wwdx");
            return (Criteria) this;
        }

        public Criteria andWwdxIn(List<Integer> values) {
            addCriterion("wwdx in", values, "wwdx");
            return (Criteria) this;
        }

        public Criteria andWwdxNotIn(List<Integer> values) {
            addCriterion("wwdx not in", values, "wwdx");
            return (Criteria) this;
        }

        public Criteria andWwdxBetween(Integer value1, Integer value2) {
            addCriterion("wwdx between", value1, value2, "wwdx");
            return (Criteria) this;
        }

        public Criteria andWwdxNotBetween(Integer value1, Integer value2) {
            addCriterion("wwdx not between", value1, value2, "wwdx");
            return (Criteria) this;
        }

        public Criteria andQwdxIsNull() {
            addCriterion("qwdx is null");
            return (Criteria) this;
        }

        public Criteria andQwdxIsNotNull() {
            addCriterion("qwdx is not null");
            return (Criteria) this;
        }

        public Criteria andQwdxEqualTo(Integer value) {
            addCriterion("qwdx =", value, "qwdx");
            return (Criteria) this;
        }

        public Criteria andQwdxNotEqualTo(Integer value) {
            addCriterion("qwdx <>", value, "qwdx");
            return (Criteria) this;
        }

        public Criteria andQwdxGreaterThan(Integer value) {
            addCriterion("qwdx >", value, "qwdx");
            return (Criteria) this;
        }

        public Criteria andQwdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("qwdx >=", value, "qwdx");
            return (Criteria) this;
        }

        public Criteria andQwdxLessThan(Integer value) {
            addCriterion("qwdx <", value, "qwdx");
            return (Criteria) this;
        }

        public Criteria andQwdxLessThanOrEqualTo(Integer value) {
            addCriterion("qwdx <=", value, "qwdx");
            return (Criteria) this;
        }

        public Criteria andQwdxIn(List<Integer> values) {
            addCriterion("qwdx in", values, "qwdx");
            return (Criteria) this;
        }

        public Criteria andQwdxNotIn(List<Integer> values) {
            addCriterion("qwdx not in", values, "qwdx");
            return (Criteria) this;
        }

        public Criteria andQwdxBetween(Integer value1, Integer value2) {
            addCriterion("qwdx between", value1, value2, "qwdx");
            return (Criteria) this;
        }

        public Criteria andQwdxNotBetween(Integer value1, Integer value2) {
            addCriterion("qwdx not between", value1, value2, "qwdx");
            return (Criteria) this;
        }

        public Criteria andBwdxIsNull() {
            addCriterion("bwdx is null");
            return (Criteria) this;
        }

        public Criteria andBwdxIsNotNull() {
            addCriterion("bwdx is not null");
            return (Criteria) this;
        }

        public Criteria andBwdxEqualTo(Integer value) {
            addCriterion("bwdx =", value, "bwdx");
            return (Criteria) this;
        }

        public Criteria andBwdxNotEqualTo(Integer value) {
            addCriterion("bwdx <>", value, "bwdx");
            return (Criteria) this;
        }

        public Criteria andBwdxGreaterThan(Integer value) {
            addCriterion("bwdx >", value, "bwdx");
            return (Criteria) this;
        }

        public Criteria andBwdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("bwdx >=", value, "bwdx");
            return (Criteria) this;
        }

        public Criteria andBwdxLessThan(Integer value) {
            addCriterion("bwdx <", value, "bwdx");
            return (Criteria) this;
        }

        public Criteria andBwdxLessThanOrEqualTo(Integer value) {
            addCriterion("bwdx <=", value, "bwdx");
            return (Criteria) this;
        }

        public Criteria andBwdxIn(List<Integer> values) {
            addCriterion("bwdx in", values, "bwdx");
            return (Criteria) this;
        }

        public Criteria andBwdxNotIn(List<Integer> values) {
            addCriterion("bwdx not in", values, "bwdx");
            return (Criteria) this;
        }

        public Criteria andBwdxBetween(Integer value1, Integer value2) {
            addCriterion("bwdx between", value1, value2, "bwdx");
            return (Criteria) this;
        }

        public Criteria andBwdxNotBetween(Integer value1, Integer value2) {
            addCriterion("bwdx not between", value1, value2, "bwdx");
            return (Criteria) this;
        }

        public Criteria andSwdxIsNull() {
            addCriterion("swdx is null");
            return (Criteria) this;
        }

        public Criteria andSwdxIsNotNull() {
            addCriterion("swdx is not null");
            return (Criteria) this;
        }

        public Criteria andSwdxEqualTo(Integer value) {
            addCriterion("swdx =", value, "swdx");
            return (Criteria) this;
        }

        public Criteria andSwdxNotEqualTo(Integer value) {
            addCriterion("swdx <>", value, "swdx");
            return (Criteria) this;
        }

        public Criteria andSwdxGreaterThan(Integer value) {
            addCriterion("swdx >", value, "swdx");
            return (Criteria) this;
        }

        public Criteria andSwdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("swdx >=", value, "swdx");
            return (Criteria) this;
        }

        public Criteria andSwdxLessThan(Integer value) {
            addCriterion("swdx <", value, "swdx");
            return (Criteria) this;
        }

        public Criteria andSwdxLessThanOrEqualTo(Integer value) {
            addCriterion("swdx <=", value, "swdx");
            return (Criteria) this;
        }

        public Criteria andSwdxIn(List<Integer> values) {
            addCriterion("swdx in", values, "swdx");
            return (Criteria) this;
        }

        public Criteria andSwdxNotIn(List<Integer> values) {
            addCriterion("swdx not in", values, "swdx");
            return (Criteria) this;
        }

        public Criteria andSwdxBetween(Integer value1, Integer value2) {
            addCriterion("swdx between", value1, value2, "swdx");
            return (Criteria) this;
        }

        public Criteria andSwdxNotBetween(Integer value1, Integer value2) {
            addCriterion("swdx not between", value1, value2, "swdx");
            return (Criteria) this;
        }

        public Criteria andGwdxIsNull() {
            addCriterion("gwdx is null");
            return (Criteria) this;
        }

        public Criteria andGwdxIsNotNull() {
            addCriterion("gwdx is not null");
            return (Criteria) this;
        }

        public Criteria andGwdxEqualTo(Integer value) {
            addCriterion("gwdx =", value, "gwdx");
            return (Criteria) this;
        }

        public Criteria andGwdxNotEqualTo(Integer value) {
            addCriterion("gwdx <>", value, "gwdx");
            return (Criteria) this;
        }

        public Criteria andGwdxGreaterThan(Integer value) {
            addCriterion("gwdx >", value, "gwdx");
            return (Criteria) this;
        }

        public Criteria andGwdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("gwdx >=", value, "gwdx");
            return (Criteria) this;
        }

        public Criteria andGwdxLessThan(Integer value) {
            addCriterion("gwdx <", value, "gwdx");
            return (Criteria) this;
        }

        public Criteria andGwdxLessThanOrEqualTo(Integer value) {
            addCriterion("gwdx <=", value, "gwdx");
            return (Criteria) this;
        }

        public Criteria andGwdxIn(List<Integer> values) {
            addCriterion("gwdx in", values, "gwdx");
            return (Criteria) this;
        }

        public Criteria andGwdxNotIn(List<Integer> values) {
            addCriterion("gwdx not in", values, "gwdx");
            return (Criteria) this;
        }

        public Criteria andGwdxBetween(Integer value1, Integer value2) {
            addCriterion("gwdx between", value1, value2, "gwdx");
            return (Criteria) this;
        }

        public Criteria andGwdxNotBetween(Integer value1, Integer value2) {
            addCriterion("gwdx not between", value1, value2, "gwdx");
            return (Criteria) this;
        }

        public Criteria andWwjoIsNull() {
            addCriterion("wwjo is null");
            return (Criteria) this;
        }

        public Criteria andWwjoIsNotNull() {
            addCriterion("wwjo is not null");
            return (Criteria) this;
        }

        public Criteria andWwjoEqualTo(Integer value) {
            addCriterion("wwjo =", value, "wwjo");
            return (Criteria) this;
        }

        public Criteria andWwjoNotEqualTo(Integer value) {
            addCriterion("wwjo <>", value, "wwjo");
            return (Criteria) this;
        }

        public Criteria andWwjoGreaterThan(Integer value) {
            addCriterion("wwjo >", value, "wwjo");
            return (Criteria) this;
        }

        public Criteria andWwjoGreaterThanOrEqualTo(Integer value) {
            addCriterion("wwjo >=", value, "wwjo");
            return (Criteria) this;
        }

        public Criteria andWwjoLessThan(Integer value) {
            addCriterion("wwjo <", value, "wwjo");
            return (Criteria) this;
        }

        public Criteria andWwjoLessThanOrEqualTo(Integer value) {
            addCriterion("wwjo <=", value, "wwjo");
            return (Criteria) this;
        }

        public Criteria andWwjoIn(List<Integer> values) {
            addCriterion("wwjo in", values, "wwjo");
            return (Criteria) this;
        }

        public Criteria andWwjoNotIn(List<Integer> values) {
            addCriterion("wwjo not in", values, "wwjo");
            return (Criteria) this;
        }

        public Criteria andWwjoBetween(Integer value1, Integer value2) {
            addCriterion("wwjo between", value1, value2, "wwjo");
            return (Criteria) this;
        }

        public Criteria andWwjoNotBetween(Integer value1, Integer value2) {
            addCriterion("wwjo not between", value1, value2, "wwjo");
            return (Criteria) this;
        }

        public Criteria andQwjoIsNull() {
            addCriterion("qwjo is null");
            return (Criteria) this;
        }

        public Criteria andQwjoIsNotNull() {
            addCriterion("qwjo is not null");
            return (Criteria) this;
        }

        public Criteria andQwjoEqualTo(Integer value) {
            addCriterion("qwjo =", value, "qwjo");
            return (Criteria) this;
        }

        public Criteria andQwjoNotEqualTo(Integer value) {
            addCriterion("qwjo <>", value, "qwjo");
            return (Criteria) this;
        }

        public Criteria andQwjoGreaterThan(Integer value) {
            addCriterion("qwjo >", value, "qwjo");
            return (Criteria) this;
        }

        public Criteria andQwjoGreaterThanOrEqualTo(Integer value) {
            addCriterion("qwjo >=", value, "qwjo");
            return (Criteria) this;
        }

        public Criteria andQwjoLessThan(Integer value) {
            addCriterion("qwjo <", value, "qwjo");
            return (Criteria) this;
        }

        public Criteria andQwjoLessThanOrEqualTo(Integer value) {
            addCriterion("qwjo <=", value, "qwjo");
            return (Criteria) this;
        }

        public Criteria andQwjoIn(List<Integer> values) {
            addCriterion("qwjo in", values, "qwjo");
            return (Criteria) this;
        }

        public Criteria andQwjoNotIn(List<Integer> values) {
            addCriterion("qwjo not in", values, "qwjo");
            return (Criteria) this;
        }

        public Criteria andQwjoBetween(Integer value1, Integer value2) {
            addCriterion("qwjo between", value1, value2, "qwjo");
            return (Criteria) this;
        }

        public Criteria andQwjoNotBetween(Integer value1, Integer value2) {
            addCriterion("qwjo not between", value1, value2, "qwjo");
            return (Criteria) this;
        }

        public Criteria andBwjoIsNull() {
            addCriterion("bwjo is null");
            return (Criteria) this;
        }

        public Criteria andBwjoIsNotNull() {
            addCriterion("bwjo is not null");
            return (Criteria) this;
        }

        public Criteria andBwjoEqualTo(Integer value) {
            addCriterion("bwjo =", value, "bwjo");
            return (Criteria) this;
        }

        public Criteria andBwjoNotEqualTo(Integer value) {
            addCriterion("bwjo <>", value, "bwjo");
            return (Criteria) this;
        }

        public Criteria andBwjoGreaterThan(Integer value) {
            addCriterion("bwjo >", value, "bwjo");
            return (Criteria) this;
        }

        public Criteria andBwjoGreaterThanOrEqualTo(Integer value) {
            addCriterion("bwjo >=", value, "bwjo");
            return (Criteria) this;
        }

        public Criteria andBwjoLessThan(Integer value) {
            addCriterion("bwjo <", value, "bwjo");
            return (Criteria) this;
        }

        public Criteria andBwjoLessThanOrEqualTo(Integer value) {
            addCriterion("bwjo <=", value, "bwjo");
            return (Criteria) this;
        }

        public Criteria andBwjoIn(List<Integer> values) {
            addCriterion("bwjo in", values, "bwjo");
            return (Criteria) this;
        }

        public Criteria andBwjoNotIn(List<Integer> values) {
            addCriterion("bwjo not in", values, "bwjo");
            return (Criteria) this;
        }

        public Criteria andBwjoBetween(Integer value1, Integer value2) {
            addCriterion("bwjo between", value1, value2, "bwjo");
            return (Criteria) this;
        }

        public Criteria andBwjoNotBetween(Integer value1, Integer value2) {
            addCriterion("bwjo not between", value1, value2, "bwjo");
            return (Criteria) this;
        }

        public Criteria andSwjoIsNull() {
            addCriterion("swjo is null");
            return (Criteria) this;
        }

        public Criteria andSwjoIsNotNull() {
            addCriterion("swjo is not null");
            return (Criteria) this;
        }

        public Criteria andSwjoEqualTo(Integer value) {
            addCriterion("swjo =", value, "swjo");
            return (Criteria) this;
        }

        public Criteria andSwjoNotEqualTo(Integer value) {
            addCriterion("swjo <>", value, "swjo");
            return (Criteria) this;
        }

        public Criteria andSwjoGreaterThan(Integer value) {
            addCriterion("swjo >", value, "swjo");
            return (Criteria) this;
        }

        public Criteria andSwjoGreaterThanOrEqualTo(Integer value) {
            addCriterion("swjo >=", value, "swjo");
            return (Criteria) this;
        }

        public Criteria andSwjoLessThan(Integer value) {
            addCriterion("swjo <", value, "swjo");
            return (Criteria) this;
        }

        public Criteria andSwjoLessThanOrEqualTo(Integer value) {
            addCriterion("swjo <=", value, "swjo");
            return (Criteria) this;
        }

        public Criteria andSwjoIn(List<Integer> values) {
            addCriterion("swjo in", values, "swjo");
            return (Criteria) this;
        }

        public Criteria andSwjoNotIn(List<Integer> values) {
            addCriterion("swjo not in", values, "swjo");
            return (Criteria) this;
        }

        public Criteria andSwjoBetween(Integer value1, Integer value2) {
            addCriterion("swjo between", value1, value2, "swjo");
            return (Criteria) this;
        }

        public Criteria andSwjoNotBetween(Integer value1, Integer value2) {
            addCriterion("swjo not between", value1, value2, "swjo");
            return (Criteria) this;
        }

        public Criteria andGwjoIsNull() {
            addCriterion("gwjo is null");
            return (Criteria) this;
        }

        public Criteria andGwjoIsNotNull() {
            addCriterion("gwjo is not null");
            return (Criteria) this;
        }

        public Criteria andGwjoEqualTo(Integer value) {
            addCriterion("gwjo =", value, "gwjo");
            return (Criteria) this;
        }

        public Criteria andGwjoNotEqualTo(Integer value) {
            addCriterion("gwjo <>", value, "gwjo");
            return (Criteria) this;
        }

        public Criteria andGwjoGreaterThan(Integer value) {
            addCriterion("gwjo >", value, "gwjo");
            return (Criteria) this;
        }

        public Criteria andGwjoGreaterThanOrEqualTo(Integer value) {
            addCriterion("gwjo >=", value, "gwjo");
            return (Criteria) this;
        }

        public Criteria andGwjoLessThan(Integer value) {
            addCriterion("gwjo <", value, "gwjo");
            return (Criteria) this;
        }

        public Criteria andGwjoLessThanOrEqualTo(Integer value) {
            addCriterion("gwjo <=", value, "gwjo");
            return (Criteria) this;
        }

        public Criteria andGwjoIn(List<Integer> values) {
            addCriterion("gwjo in", values, "gwjo");
            return (Criteria) this;
        }

        public Criteria andGwjoNotIn(List<Integer> values) {
            addCriterion("gwjo not in", values, "gwjo");
            return (Criteria) this;
        }

        public Criteria andGwjoBetween(Integer value1, Integer value2) {
            addCriterion("gwjo between", value1, value2, "gwjo");
            return (Criteria) this;
        }

        public Criteria andGwjoNotBetween(Integer value1, Integer value2) {
            addCriterion("gwjo not between", value1, value2, "gwjo");
            return (Criteria) this;
        }

        public Criteria andWw012lIsNull() {
            addCriterion("ww012l is null");
            return (Criteria) this;
        }

        public Criteria andWw012lIsNotNull() {
            addCriterion("ww012l is not null");
            return (Criteria) this;
        }

        public Criteria andWw012lEqualTo(Integer value) {
            addCriterion("ww012l =", value, "ww012l");
            return (Criteria) this;
        }

        public Criteria andWw012lNotEqualTo(Integer value) {
            addCriterion("ww012l <>", value, "ww012l");
            return (Criteria) this;
        }

        public Criteria andWw012lGreaterThan(Integer value) {
            addCriterion("ww012l >", value, "ww012l");
            return (Criteria) this;
        }

        public Criteria andWw012lGreaterThanOrEqualTo(Integer value) {
            addCriterion("ww012l >=", value, "ww012l");
            return (Criteria) this;
        }

        public Criteria andWw012lLessThan(Integer value) {
            addCriterion("ww012l <", value, "ww012l");
            return (Criteria) this;
        }

        public Criteria andWw012lLessThanOrEqualTo(Integer value) {
            addCriterion("ww012l <=", value, "ww012l");
            return (Criteria) this;
        }

        public Criteria andWw012lIn(List<Integer> values) {
            addCriterion("ww012l in", values, "ww012l");
            return (Criteria) this;
        }

        public Criteria andWw012lNotIn(List<Integer> values) {
            addCriterion("ww012l not in", values, "ww012l");
            return (Criteria) this;
        }

        public Criteria andWw012lBetween(Integer value1, Integer value2) {
            addCriterion("ww012l between", value1, value2, "ww012l");
            return (Criteria) this;
        }

        public Criteria andWw012lNotBetween(Integer value1, Integer value2) {
            addCriterion("ww012l not between", value1, value2, "ww012l");
            return (Criteria) this;
        }

        public Criteria andQw012lIsNull() {
            addCriterion("qw012l is null");
            return (Criteria) this;
        }

        public Criteria andQw012lIsNotNull() {
            addCriterion("qw012l is not null");
            return (Criteria) this;
        }

        public Criteria andQw012lEqualTo(Integer value) {
            addCriterion("qw012l =", value, "qw012l");
            return (Criteria) this;
        }

        public Criteria andQw012lNotEqualTo(Integer value) {
            addCriterion("qw012l <>", value, "qw012l");
            return (Criteria) this;
        }

        public Criteria andQw012lGreaterThan(Integer value) {
            addCriterion("qw012l >", value, "qw012l");
            return (Criteria) this;
        }

        public Criteria andQw012lGreaterThanOrEqualTo(Integer value) {
            addCriterion("qw012l >=", value, "qw012l");
            return (Criteria) this;
        }

        public Criteria andQw012lLessThan(Integer value) {
            addCriterion("qw012l <", value, "qw012l");
            return (Criteria) this;
        }

        public Criteria andQw012lLessThanOrEqualTo(Integer value) {
            addCriterion("qw012l <=", value, "qw012l");
            return (Criteria) this;
        }

        public Criteria andQw012lIn(List<Integer> values) {
            addCriterion("qw012l in", values, "qw012l");
            return (Criteria) this;
        }

        public Criteria andQw012lNotIn(List<Integer> values) {
            addCriterion("qw012l not in", values, "qw012l");
            return (Criteria) this;
        }

        public Criteria andQw012lBetween(Integer value1, Integer value2) {
            addCriterion("qw012l between", value1, value2, "qw012l");
            return (Criteria) this;
        }

        public Criteria andQw012lNotBetween(Integer value1, Integer value2) {
            addCriterion("qw012l not between", value1, value2, "qw012l");
            return (Criteria) this;
        }

        public Criteria andBw012lIsNull() {
            addCriterion("bw012l is null");
            return (Criteria) this;
        }

        public Criteria andBw012lIsNotNull() {
            addCriterion("bw012l is not null");
            return (Criteria) this;
        }

        public Criteria andBw012lEqualTo(Integer value) {
            addCriterion("bw012l =", value, "bw012l");
            return (Criteria) this;
        }

        public Criteria andBw012lNotEqualTo(Integer value) {
            addCriterion("bw012l <>", value, "bw012l");
            return (Criteria) this;
        }

        public Criteria andBw012lGreaterThan(Integer value) {
            addCriterion("bw012l >", value, "bw012l");
            return (Criteria) this;
        }

        public Criteria andBw012lGreaterThanOrEqualTo(Integer value) {
            addCriterion("bw012l >=", value, "bw012l");
            return (Criteria) this;
        }

        public Criteria andBw012lLessThan(Integer value) {
            addCriterion("bw012l <", value, "bw012l");
            return (Criteria) this;
        }

        public Criteria andBw012lLessThanOrEqualTo(Integer value) {
            addCriterion("bw012l <=", value, "bw012l");
            return (Criteria) this;
        }

        public Criteria andBw012lIn(List<Integer> values) {
            addCriterion("bw012l in", values, "bw012l");
            return (Criteria) this;
        }

        public Criteria andBw012lNotIn(List<Integer> values) {
            addCriterion("bw012l not in", values, "bw012l");
            return (Criteria) this;
        }

        public Criteria andBw012lBetween(Integer value1, Integer value2) {
            addCriterion("bw012l between", value1, value2, "bw012l");
            return (Criteria) this;
        }

        public Criteria andBw012lNotBetween(Integer value1, Integer value2) {
            addCriterion("bw012l not between", value1, value2, "bw012l");
            return (Criteria) this;
        }

        public Criteria andSw012lIsNull() {
            addCriterion("sw012l is null");
            return (Criteria) this;
        }

        public Criteria andSw012lIsNotNull() {
            addCriterion("sw012l is not null");
            return (Criteria) this;
        }

        public Criteria andSw012lEqualTo(Integer value) {
            addCriterion("sw012l =", value, "sw012l");
            return (Criteria) this;
        }

        public Criteria andSw012lNotEqualTo(Integer value) {
            addCriterion("sw012l <>", value, "sw012l");
            return (Criteria) this;
        }

        public Criteria andSw012lGreaterThan(Integer value) {
            addCriterion("sw012l >", value, "sw012l");
            return (Criteria) this;
        }

        public Criteria andSw012lGreaterThanOrEqualTo(Integer value) {
            addCriterion("sw012l >=", value, "sw012l");
            return (Criteria) this;
        }

        public Criteria andSw012lLessThan(Integer value) {
            addCriterion("sw012l <", value, "sw012l");
            return (Criteria) this;
        }

        public Criteria andSw012lLessThanOrEqualTo(Integer value) {
            addCriterion("sw012l <=", value, "sw012l");
            return (Criteria) this;
        }

        public Criteria andSw012lIn(List<Integer> values) {
            addCriterion("sw012l in", values, "sw012l");
            return (Criteria) this;
        }

        public Criteria andSw012lNotIn(List<Integer> values) {
            addCriterion("sw012l not in", values, "sw012l");
            return (Criteria) this;
        }

        public Criteria andSw012lBetween(Integer value1, Integer value2) {
            addCriterion("sw012l between", value1, value2, "sw012l");
            return (Criteria) this;
        }

        public Criteria andSw012lNotBetween(Integer value1, Integer value2) {
            addCriterion("sw012l not between", value1, value2, "sw012l");
            return (Criteria) this;
        }

        public Criteria andGw012lIsNull() {
            addCriterion("gw012l is null");
            return (Criteria) this;
        }

        public Criteria andGw012lIsNotNull() {
            addCriterion("gw012l is not null");
            return (Criteria) this;
        }

        public Criteria andGw012lEqualTo(Integer value) {
            addCriterion("gw012l =", value, "gw012l");
            return (Criteria) this;
        }

        public Criteria andGw012lNotEqualTo(Integer value) {
            addCriterion("gw012l <>", value, "gw012l");
            return (Criteria) this;
        }

        public Criteria andGw012lGreaterThan(Integer value) {
            addCriterion("gw012l >", value, "gw012l");
            return (Criteria) this;
        }

        public Criteria andGw012lGreaterThanOrEqualTo(Integer value) {
            addCriterion("gw012l >=", value, "gw012l");
            return (Criteria) this;
        }

        public Criteria andGw012lLessThan(Integer value) {
            addCriterion("gw012l <", value, "gw012l");
            return (Criteria) this;
        }

        public Criteria andGw012lLessThanOrEqualTo(Integer value) {
            addCriterion("gw012l <=", value, "gw012l");
            return (Criteria) this;
        }

        public Criteria andGw012lIn(List<Integer> values) {
            addCriterion("gw012l in", values, "gw012l");
            return (Criteria) this;
        }

        public Criteria andGw012lNotIn(List<Integer> values) {
            addCriterion("gw012l not in", values, "gw012l");
            return (Criteria) this;
        }

        public Criteria andGw012lBetween(Integer value1, Integer value2) {
            addCriterion("gw012l between", value1, value2, "gw012l");
            return (Criteria) this;
        }

        public Criteria andGw012lNotBetween(Integer value1, Integer value2) {
            addCriterion("gw012l not between", value1, value2, "gw012l");
            return (Criteria) this;
        }

        public Criteria andZhdxIsNull() {
            addCriterion("zhdx is null");
            return (Criteria) this;
        }

        public Criteria andZhdxIsNotNull() {
            addCriterion("zhdx is not null");
            return (Criteria) this;
        }

        public Criteria andZhdxEqualTo(Integer value) {
            addCriterion("zhdx =", value, "zhdx");
            return (Criteria) this;
        }

        public Criteria andZhdxNotEqualTo(Integer value) {
            addCriterion("zhdx <>", value, "zhdx");
            return (Criteria) this;
        }

        public Criteria andZhdxGreaterThan(Integer value) {
            addCriterion("zhdx >", value, "zhdx");
            return (Criteria) this;
        }

        public Criteria andZhdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhdx >=", value, "zhdx");
            return (Criteria) this;
        }

        public Criteria andZhdxLessThan(Integer value) {
            addCriterion("zhdx <", value, "zhdx");
            return (Criteria) this;
        }

        public Criteria andZhdxLessThanOrEqualTo(Integer value) {
            addCriterion("zhdx <=", value, "zhdx");
            return (Criteria) this;
        }

        public Criteria andZhdxIn(List<Integer> values) {
            addCriterion("zhdx in", values, "zhdx");
            return (Criteria) this;
        }

        public Criteria andZhdxNotIn(List<Integer> values) {
            addCriterion("zhdx not in", values, "zhdx");
            return (Criteria) this;
        }

        public Criteria andZhdxBetween(Integer value1, Integer value2) {
            addCriterion("zhdx between", value1, value2, "zhdx");
            return (Criteria) this;
        }

        public Criteria andZhdxNotBetween(Integer value1, Integer value2) {
            addCriterion("zhdx not between", value1, value2, "zhdx");
            return (Criteria) this;
        }

        public Criteria andZhdsIsNull() {
            addCriterion("zhds is null");
            return (Criteria) this;
        }

        public Criteria andZhdsIsNotNull() {
            addCriterion("zhds is not null");
            return (Criteria) this;
        }

        public Criteria andZhdsEqualTo(Integer value) {
            addCriterion("zhds =", value, "zhds");
            return (Criteria) this;
        }

        public Criteria andZhdsNotEqualTo(Integer value) {
            addCriterion("zhds <>", value, "zhds");
            return (Criteria) this;
        }

        public Criteria andZhdsGreaterThan(Integer value) {
            addCriterion("zhds >", value, "zhds");
            return (Criteria) this;
        }

        public Criteria andZhdsGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhds >=", value, "zhds");
            return (Criteria) this;
        }

        public Criteria andZhdsLessThan(Integer value) {
            addCriterion("zhds <", value, "zhds");
            return (Criteria) this;
        }

        public Criteria andZhdsLessThanOrEqualTo(Integer value) {
            addCriterion("zhds <=", value, "zhds");
            return (Criteria) this;
        }

        public Criteria andZhdsIn(List<Integer> values) {
            addCriterion("zhds in", values, "zhds");
            return (Criteria) this;
        }

        public Criteria andZhdsNotIn(List<Integer> values) {
            addCriterion("zhds not in", values, "zhds");
            return (Criteria) this;
        }

        public Criteria andZhdsBetween(Integer value1, Integer value2) {
            addCriterion("zhds between", value1, value2, "zhds");
            return (Criteria) this;
        }

        public Criteria andZhdsNotBetween(Integer value1, Integer value2) {
            addCriterion("zhds not between", value1, value2, "zhds");
            return (Criteria) this;
        }

        public Criteria andLhIsNull() {
            addCriterion("lh is null");
            return (Criteria) this;
        }

        public Criteria andLhIsNotNull() {
            addCriterion("lh is not null");
            return (Criteria) this;
        }

        public Criteria andLhEqualTo(Integer value) {
            addCriterion("lh =", value, "lh");
            return (Criteria) this;
        }

        public Criteria andLhNotEqualTo(Integer value) {
            addCriterion("lh <>", value, "lh");
            return (Criteria) this;
        }

        public Criteria andLhGreaterThan(Integer value) {
            addCriterion("lh >", value, "lh");
            return (Criteria) this;
        }

        public Criteria andLhGreaterThanOrEqualTo(Integer value) {
            addCriterion("lh >=", value, "lh");
            return (Criteria) this;
        }

        public Criteria andLhLessThan(Integer value) {
            addCriterion("lh <", value, "lh");
            return (Criteria) this;
        }

        public Criteria andLhLessThanOrEqualTo(Integer value) {
            addCriterion("lh <=", value, "lh");
            return (Criteria) this;
        }

        public Criteria andLhIn(List<Integer> values) {
            addCriterion("lh in", values, "lh");
            return (Criteria) this;
        }

        public Criteria andLhNotIn(List<Integer> values) {
            addCriterion("lh not in", values, "lh");
            return (Criteria) this;
        }

        public Criteria andLhBetween(Integer value1, Integer value2) {
            addCriterion("lh between", value1, value2, "lh");
            return (Criteria) this;
        }

        public Criteria andLhNotBetween(Integer value1, Integer value2) {
            addCriterion("lh not between", value1, value2, "lh");
            return (Criteria) this;
        }

        public Criteria andSjIsNull() {
            addCriterion("sj is null");
            return (Criteria) this;
        }

        public Criteria andSjIsNotNull() {
            addCriterion("sj is not null");
            return (Criteria) this;
        }

        public Criteria andSjEqualTo(Date value) {
            addCriterionForJDBCDate("sj =", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotEqualTo(Date value) {
            addCriterionForJDBCDate("sj <>", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThan(Date value) {
            addCriterionForJDBCDate("sj >", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sj >=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThan(Date value) {
            addCriterionForJDBCDate("sj <", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sj <=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjIn(List<Date> values) {
            addCriterionForJDBCDate("sj in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotIn(List<Date> values) {
            addCriterionForJDBCDate("sj not in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sj between", value1, value2, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sj not between", value1, value2, "sj");
            return (Criteria) this;
        }

        public Criteria andQsbzIsNull() {
            addCriterion("qsbz is null");
            return (Criteria) this;
        }

        public Criteria andQsbzIsNotNull() {
            addCriterion("qsbz is not null");
            return (Criteria) this;
        }

        public Criteria andQsbzEqualTo(Integer value) {
            addCriterion("qsbz =", value, "qsbz");
            return (Criteria) this;
        }

        public Criteria andQsbzNotEqualTo(Integer value) {
            addCriterion("qsbz <>", value, "qsbz");
            return (Criteria) this;
        }

        public Criteria andQsbzGreaterThan(Integer value) {
            addCriterion("qsbz >", value, "qsbz");
            return (Criteria) this;
        }

        public Criteria andQsbzGreaterThanOrEqualTo(Integer value) {
            addCriterion("qsbz >=", value, "qsbz");
            return (Criteria) this;
        }

        public Criteria andQsbzLessThan(Integer value) {
            addCriterion("qsbz <", value, "qsbz");
            return (Criteria) this;
        }

        public Criteria andQsbzLessThanOrEqualTo(Integer value) {
            addCriterion("qsbz <=", value, "qsbz");
            return (Criteria) this;
        }

        public Criteria andQsbzIn(List<Integer> values) {
            addCriterion("qsbz in", values, "qsbz");
            return (Criteria) this;
        }

        public Criteria andQsbzNotIn(List<Integer> values) {
            addCriterion("qsbz not in", values, "qsbz");
            return (Criteria) this;
        }

        public Criteria andQsbzBetween(Integer value1, Integer value2) {
            addCriterion("qsbz between", value1, value2, "qsbz");
            return (Criteria) this;
        }

        public Criteria andQsbzNotBetween(Integer value1, Integer value2) {
            addCriterion("qsbz not between", value1, value2, "qsbz");
            return (Criteria) this;
        }

        public Criteria andQsszIsNull() {
            addCriterion("qssz is null");
            return (Criteria) this;
        }

        public Criteria andQsszIsNotNull() {
            addCriterion("qssz is not null");
            return (Criteria) this;
        }

        public Criteria andQsszEqualTo(Integer value) {
            addCriterion("qssz =", value, "qssz");
            return (Criteria) this;
        }

        public Criteria andQsszNotEqualTo(Integer value) {
            addCriterion("qssz <>", value, "qssz");
            return (Criteria) this;
        }

        public Criteria andQsszGreaterThan(Integer value) {
            addCriterion("qssz >", value, "qssz");
            return (Criteria) this;
        }

        public Criteria andQsszGreaterThanOrEqualTo(Integer value) {
            addCriterion("qssz >=", value, "qssz");
            return (Criteria) this;
        }

        public Criteria andQsszLessThan(Integer value) {
            addCriterion("qssz <", value, "qssz");
            return (Criteria) this;
        }

        public Criteria andQsszLessThanOrEqualTo(Integer value) {
            addCriterion("qssz <=", value, "qssz");
            return (Criteria) this;
        }

        public Criteria andQsszIn(List<Integer> values) {
            addCriterion("qssz in", values, "qssz");
            return (Criteria) this;
        }

        public Criteria andQsszNotIn(List<Integer> values) {
            addCriterion("qssz not in", values, "qssz");
            return (Criteria) this;
        }

        public Criteria andQsszBetween(Integer value1, Integer value2) {
            addCriterion("qssz between", value1, value2, "qssz");
            return (Criteria) this;
        }

        public Criteria andQsszNotBetween(Integer value1, Integer value2) {
            addCriterion("qssz not between", value1, value2, "qssz");
            return (Criteria) this;
        }

        public Criteria andQsdzIsNull() {
            addCriterion("qsdz is null");
            return (Criteria) this;
        }

        public Criteria andQsdzIsNotNull() {
            addCriterion("qsdz is not null");
            return (Criteria) this;
        }

        public Criteria andQsdzEqualTo(Integer value) {
            addCriterion("qsdz =", value, "qsdz");
            return (Criteria) this;
        }

        public Criteria andQsdzNotEqualTo(Integer value) {
            addCriterion("qsdz <>", value, "qsdz");
            return (Criteria) this;
        }

        public Criteria andQsdzGreaterThan(Integer value) {
            addCriterion("qsdz >", value, "qsdz");
            return (Criteria) this;
        }

        public Criteria andQsdzGreaterThanOrEqualTo(Integer value) {
            addCriterion("qsdz >=", value, "qsdz");
            return (Criteria) this;
        }

        public Criteria andQsdzLessThan(Integer value) {
            addCriterion("qsdz <", value, "qsdz");
            return (Criteria) this;
        }

        public Criteria andQsdzLessThanOrEqualTo(Integer value) {
            addCriterion("qsdz <=", value, "qsdz");
            return (Criteria) this;
        }

        public Criteria andQsdzIn(List<Integer> values) {
            addCriterion("qsdz in", values, "qsdz");
            return (Criteria) this;
        }

        public Criteria andQsdzNotIn(List<Integer> values) {
            addCriterion("qsdz not in", values, "qsdz");
            return (Criteria) this;
        }

        public Criteria andQsdzBetween(Integer value1, Integer value2) {
            addCriterion("qsdz between", value1, value2, "qsdz");
            return (Criteria) this;
        }

        public Criteria andQsdzNotBetween(Integer value1, Integer value2) {
            addCriterion("qsdz not between", value1, value2, "qsdz");
            return (Criteria) this;
        }

        public Criteria andQsbsIsNull() {
            addCriterion("qsbs is null");
            return (Criteria) this;
        }

        public Criteria andQsbsIsNotNull() {
            addCriterion("qsbs is not null");
            return (Criteria) this;
        }

        public Criteria andQsbsEqualTo(Integer value) {
            addCriterion("qsbs =", value, "qsbs");
            return (Criteria) this;
        }

        public Criteria andQsbsNotEqualTo(Integer value) {
            addCriterion("qsbs <>", value, "qsbs");
            return (Criteria) this;
        }

        public Criteria andQsbsGreaterThan(Integer value) {
            addCriterion("qsbs >", value, "qsbs");
            return (Criteria) this;
        }

        public Criteria andQsbsGreaterThanOrEqualTo(Integer value) {
            addCriterion("qsbs >=", value, "qsbs");
            return (Criteria) this;
        }

        public Criteria andQsbsLessThan(Integer value) {
            addCriterion("qsbs <", value, "qsbs");
            return (Criteria) this;
        }

        public Criteria andQsbsLessThanOrEqualTo(Integer value) {
            addCriterion("qsbs <=", value, "qsbs");
            return (Criteria) this;
        }

        public Criteria andQsbsIn(List<Integer> values) {
            addCriterion("qsbs in", values, "qsbs");
            return (Criteria) this;
        }

        public Criteria andQsbsNotIn(List<Integer> values) {
            addCriterion("qsbs not in", values, "qsbs");
            return (Criteria) this;
        }

        public Criteria andQsbsBetween(Integer value1, Integer value2) {
            addCriterion("qsbs between", value1, value2, "qsbs");
            return (Criteria) this;
        }

        public Criteria andQsbsNotBetween(Integer value1, Integer value2) {
            addCriterion("qsbs not between", value1, value2, "qsbs");
            return (Criteria) this;
        }

        public Criteria andQszlIsNull() {
            addCriterion("qszl is null");
            return (Criteria) this;
        }

        public Criteria andQszlIsNotNull() {
            addCriterion("qszl is not null");
            return (Criteria) this;
        }

        public Criteria andQszlEqualTo(Integer value) {
            addCriterion("qszl =", value, "qszl");
            return (Criteria) this;
        }

        public Criteria andQszlNotEqualTo(Integer value) {
            addCriterion("qszl <>", value, "qszl");
            return (Criteria) this;
        }

        public Criteria andQszlGreaterThan(Integer value) {
            addCriterion("qszl >", value, "qszl");
            return (Criteria) this;
        }

        public Criteria andQszlGreaterThanOrEqualTo(Integer value) {
            addCriterion("qszl >=", value, "qszl");
            return (Criteria) this;
        }

        public Criteria andQszlLessThan(Integer value) {
            addCriterion("qszl <", value, "qszl");
            return (Criteria) this;
        }

        public Criteria andQszlLessThanOrEqualTo(Integer value) {
            addCriterion("qszl <=", value, "qszl");
            return (Criteria) this;
        }

        public Criteria andQszlIn(List<Integer> values) {
            addCriterion("qszl in", values, "qszl");
            return (Criteria) this;
        }

        public Criteria andQszlNotIn(List<Integer> values) {
            addCriterion("qszl not in", values, "qszl");
            return (Criteria) this;
        }

        public Criteria andQszlBetween(Integer value1, Integer value2) {
            addCriterion("qszl between", value1, value2, "qszl");
            return (Criteria) this;
        }

        public Criteria andQszlNotBetween(Integer value1, Integer value2) {
            addCriterion("qszl not between", value1, value2, "qszl");
            return (Criteria) this;
        }

        public Criteria andZsbzIsNull() {
            addCriterion("zsbz is null");
            return (Criteria) this;
        }

        public Criteria andZsbzIsNotNull() {
            addCriterion("zsbz is not null");
            return (Criteria) this;
        }

        public Criteria andZsbzEqualTo(Integer value) {
            addCriterion("zsbz =", value, "zsbz");
            return (Criteria) this;
        }

        public Criteria andZsbzNotEqualTo(Integer value) {
            addCriterion("zsbz <>", value, "zsbz");
            return (Criteria) this;
        }

        public Criteria andZsbzGreaterThan(Integer value) {
            addCriterion("zsbz >", value, "zsbz");
            return (Criteria) this;
        }

        public Criteria andZsbzGreaterThanOrEqualTo(Integer value) {
            addCriterion("zsbz >=", value, "zsbz");
            return (Criteria) this;
        }

        public Criteria andZsbzLessThan(Integer value) {
            addCriterion("zsbz <", value, "zsbz");
            return (Criteria) this;
        }

        public Criteria andZsbzLessThanOrEqualTo(Integer value) {
            addCriterion("zsbz <=", value, "zsbz");
            return (Criteria) this;
        }

        public Criteria andZsbzIn(List<Integer> values) {
            addCriterion("zsbz in", values, "zsbz");
            return (Criteria) this;
        }

        public Criteria andZsbzNotIn(List<Integer> values) {
            addCriterion("zsbz not in", values, "zsbz");
            return (Criteria) this;
        }

        public Criteria andZsbzBetween(Integer value1, Integer value2) {
            addCriterion("zsbz between", value1, value2, "zsbz");
            return (Criteria) this;
        }

        public Criteria andZsbzNotBetween(Integer value1, Integer value2) {
            addCriterion("zsbz not between", value1, value2, "zsbz");
            return (Criteria) this;
        }

        public Criteria andZsszIsNull() {
            addCriterion("zssz is null");
            return (Criteria) this;
        }

        public Criteria andZsszIsNotNull() {
            addCriterion("zssz is not null");
            return (Criteria) this;
        }

        public Criteria andZsszEqualTo(Integer value) {
            addCriterion("zssz =", value, "zssz");
            return (Criteria) this;
        }

        public Criteria andZsszNotEqualTo(Integer value) {
            addCriterion("zssz <>", value, "zssz");
            return (Criteria) this;
        }

        public Criteria andZsszGreaterThan(Integer value) {
            addCriterion("zssz >", value, "zssz");
            return (Criteria) this;
        }

        public Criteria andZsszGreaterThanOrEqualTo(Integer value) {
            addCriterion("zssz >=", value, "zssz");
            return (Criteria) this;
        }

        public Criteria andZsszLessThan(Integer value) {
            addCriterion("zssz <", value, "zssz");
            return (Criteria) this;
        }

        public Criteria andZsszLessThanOrEqualTo(Integer value) {
            addCriterion("zssz <=", value, "zssz");
            return (Criteria) this;
        }

        public Criteria andZsszIn(List<Integer> values) {
            addCriterion("zssz in", values, "zssz");
            return (Criteria) this;
        }

        public Criteria andZsszNotIn(List<Integer> values) {
            addCriterion("zssz not in", values, "zssz");
            return (Criteria) this;
        }

        public Criteria andZsszBetween(Integer value1, Integer value2) {
            addCriterion("zssz between", value1, value2, "zssz");
            return (Criteria) this;
        }

        public Criteria andZsszNotBetween(Integer value1, Integer value2) {
            addCriterion("zssz not between", value1, value2, "zssz");
            return (Criteria) this;
        }

        public Criteria andZsdzIsNull() {
            addCriterion("zsdz is null");
            return (Criteria) this;
        }

        public Criteria andZsdzIsNotNull() {
            addCriterion("zsdz is not null");
            return (Criteria) this;
        }

        public Criteria andZsdzEqualTo(Integer value) {
            addCriterion("zsdz =", value, "zsdz");
            return (Criteria) this;
        }

        public Criteria andZsdzNotEqualTo(Integer value) {
            addCriterion("zsdz <>", value, "zsdz");
            return (Criteria) this;
        }

        public Criteria andZsdzGreaterThan(Integer value) {
            addCriterion("zsdz >", value, "zsdz");
            return (Criteria) this;
        }

        public Criteria andZsdzGreaterThanOrEqualTo(Integer value) {
            addCriterion("zsdz >=", value, "zsdz");
            return (Criteria) this;
        }

        public Criteria andZsdzLessThan(Integer value) {
            addCriterion("zsdz <", value, "zsdz");
            return (Criteria) this;
        }

        public Criteria andZsdzLessThanOrEqualTo(Integer value) {
            addCriterion("zsdz <=", value, "zsdz");
            return (Criteria) this;
        }

        public Criteria andZsdzIn(List<Integer> values) {
            addCriterion("zsdz in", values, "zsdz");
            return (Criteria) this;
        }

        public Criteria andZsdzNotIn(List<Integer> values) {
            addCriterion("zsdz not in", values, "zsdz");
            return (Criteria) this;
        }

        public Criteria andZsdzBetween(Integer value1, Integer value2) {
            addCriterion("zsdz between", value1, value2, "zsdz");
            return (Criteria) this;
        }

        public Criteria andZsdzNotBetween(Integer value1, Integer value2) {
            addCriterion("zsdz not between", value1, value2, "zsdz");
            return (Criteria) this;
        }

        public Criteria andZsbsIsNull() {
            addCriterion("zsbs is null");
            return (Criteria) this;
        }

        public Criteria andZsbsIsNotNull() {
            addCriterion("zsbs is not null");
            return (Criteria) this;
        }

        public Criteria andZsbsEqualTo(Integer value) {
            addCriterion("zsbs =", value, "zsbs");
            return (Criteria) this;
        }

        public Criteria andZsbsNotEqualTo(Integer value) {
            addCriterion("zsbs <>", value, "zsbs");
            return (Criteria) this;
        }

        public Criteria andZsbsGreaterThan(Integer value) {
            addCriterion("zsbs >", value, "zsbs");
            return (Criteria) this;
        }

        public Criteria andZsbsGreaterThanOrEqualTo(Integer value) {
            addCriterion("zsbs >=", value, "zsbs");
            return (Criteria) this;
        }

        public Criteria andZsbsLessThan(Integer value) {
            addCriterion("zsbs <", value, "zsbs");
            return (Criteria) this;
        }

        public Criteria andZsbsLessThanOrEqualTo(Integer value) {
            addCriterion("zsbs <=", value, "zsbs");
            return (Criteria) this;
        }

        public Criteria andZsbsIn(List<Integer> values) {
            addCriterion("zsbs in", values, "zsbs");
            return (Criteria) this;
        }

        public Criteria andZsbsNotIn(List<Integer> values) {
            addCriterion("zsbs not in", values, "zsbs");
            return (Criteria) this;
        }

        public Criteria andZsbsBetween(Integer value1, Integer value2) {
            addCriterion("zsbs between", value1, value2, "zsbs");
            return (Criteria) this;
        }

        public Criteria andZsbsNotBetween(Integer value1, Integer value2) {
            addCriterion("zsbs not between", value1, value2, "zsbs");
            return (Criteria) this;
        }

        public Criteria andZszlIsNull() {
            addCriterion("zszl is null");
            return (Criteria) this;
        }

        public Criteria andZszlIsNotNull() {
            addCriterion("zszl is not null");
            return (Criteria) this;
        }

        public Criteria andZszlEqualTo(Integer value) {
            addCriterion("zszl =", value, "zszl");
            return (Criteria) this;
        }

        public Criteria andZszlNotEqualTo(Integer value) {
            addCriterion("zszl <>", value, "zszl");
            return (Criteria) this;
        }

        public Criteria andZszlGreaterThan(Integer value) {
            addCriterion("zszl >", value, "zszl");
            return (Criteria) this;
        }

        public Criteria andZszlGreaterThanOrEqualTo(Integer value) {
            addCriterion("zszl >=", value, "zszl");
            return (Criteria) this;
        }

        public Criteria andZszlLessThan(Integer value) {
            addCriterion("zszl <", value, "zszl");
            return (Criteria) this;
        }

        public Criteria andZszlLessThanOrEqualTo(Integer value) {
            addCriterion("zszl <=", value, "zszl");
            return (Criteria) this;
        }

        public Criteria andZszlIn(List<Integer> values) {
            addCriterion("zszl in", values, "zszl");
            return (Criteria) this;
        }

        public Criteria andZszlNotIn(List<Integer> values) {
            addCriterion("zszl not in", values, "zszl");
            return (Criteria) this;
        }

        public Criteria andZszlBetween(Integer value1, Integer value2) {
            addCriterion("zszl between", value1, value2, "zszl");
            return (Criteria) this;
        }

        public Criteria andZszlNotBetween(Integer value1, Integer value2) {
            addCriterion("zszl not between", value1, value2, "zszl");
            return (Criteria) this;
        }

        public Criteria andHsbzIsNull() {
            addCriterion("hsbz is null");
            return (Criteria) this;
        }

        public Criteria andHsbzIsNotNull() {
            addCriterion("hsbz is not null");
            return (Criteria) this;
        }

        public Criteria andHsbzEqualTo(Integer value) {
            addCriterion("hsbz =", value, "hsbz");
            return (Criteria) this;
        }

        public Criteria andHsbzNotEqualTo(Integer value) {
            addCriterion("hsbz <>", value, "hsbz");
            return (Criteria) this;
        }

        public Criteria andHsbzGreaterThan(Integer value) {
            addCriterion("hsbz >", value, "hsbz");
            return (Criteria) this;
        }

        public Criteria andHsbzGreaterThanOrEqualTo(Integer value) {
            addCriterion("hsbz >=", value, "hsbz");
            return (Criteria) this;
        }

        public Criteria andHsbzLessThan(Integer value) {
            addCriterion("hsbz <", value, "hsbz");
            return (Criteria) this;
        }

        public Criteria andHsbzLessThanOrEqualTo(Integer value) {
            addCriterion("hsbz <=", value, "hsbz");
            return (Criteria) this;
        }

        public Criteria andHsbzIn(List<Integer> values) {
            addCriterion("hsbz in", values, "hsbz");
            return (Criteria) this;
        }

        public Criteria andHsbzNotIn(List<Integer> values) {
            addCriterion("hsbz not in", values, "hsbz");
            return (Criteria) this;
        }

        public Criteria andHsbzBetween(Integer value1, Integer value2) {
            addCriterion("hsbz between", value1, value2, "hsbz");
            return (Criteria) this;
        }

        public Criteria andHsbzNotBetween(Integer value1, Integer value2) {
            addCriterion("hsbz not between", value1, value2, "hsbz");
            return (Criteria) this;
        }

        public Criteria andHsszIsNull() {
            addCriterion("hssz is null");
            return (Criteria) this;
        }

        public Criteria andHsszIsNotNull() {
            addCriterion("hssz is not null");
            return (Criteria) this;
        }

        public Criteria andHsszEqualTo(Integer value) {
            addCriterion("hssz =", value, "hssz");
            return (Criteria) this;
        }

        public Criteria andHsszNotEqualTo(Integer value) {
            addCriterion("hssz <>", value, "hssz");
            return (Criteria) this;
        }

        public Criteria andHsszGreaterThan(Integer value) {
            addCriterion("hssz >", value, "hssz");
            return (Criteria) this;
        }

        public Criteria andHsszGreaterThanOrEqualTo(Integer value) {
            addCriterion("hssz >=", value, "hssz");
            return (Criteria) this;
        }

        public Criteria andHsszLessThan(Integer value) {
            addCriterion("hssz <", value, "hssz");
            return (Criteria) this;
        }

        public Criteria andHsszLessThanOrEqualTo(Integer value) {
            addCriterion("hssz <=", value, "hssz");
            return (Criteria) this;
        }

        public Criteria andHsszIn(List<Integer> values) {
            addCriterion("hssz in", values, "hssz");
            return (Criteria) this;
        }

        public Criteria andHsszNotIn(List<Integer> values) {
            addCriterion("hssz not in", values, "hssz");
            return (Criteria) this;
        }

        public Criteria andHsszBetween(Integer value1, Integer value2) {
            addCriterion("hssz between", value1, value2, "hssz");
            return (Criteria) this;
        }

        public Criteria andHsszNotBetween(Integer value1, Integer value2) {
            addCriterion("hssz not between", value1, value2, "hssz");
            return (Criteria) this;
        }

        public Criteria andHsdzIsNull() {
            addCriterion("hsdz is null");
            return (Criteria) this;
        }

        public Criteria andHsdzIsNotNull() {
            addCriterion("hsdz is not null");
            return (Criteria) this;
        }

        public Criteria andHsdzEqualTo(Integer value) {
            addCriterion("hsdz =", value, "hsdz");
            return (Criteria) this;
        }

        public Criteria andHsdzNotEqualTo(Integer value) {
            addCriterion("hsdz <>", value, "hsdz");
            return (Criteria) this;
        }

        public Criteria andHsdzGreaterThan(Integer value) {
            addCriterion("hsdz >", value, "hsdz");
            return (Criteria) this;
        }

        public Criteria andHsdzGreaterThanOrEqualTo(Integer value) {
            addCriterion("hsdz >=", value, "hsdz");
            return (Criteria) this;
        }

        public Criteria andHsdzLessThan(Integer value) {
            addCriterion("hsdz <", value, "hsdz");
            return (Criteria) this;
        }

        public Criteria andHsdzLessThanOrEqualTo(Integer value) {
            addCriterion("hsdz <=", value, "hsdz");
            return (Criteria) this;
        }

        public Criteria andHsdzIn(List<Integer> values) {
            addCriterion("hsdz in", values, "hsdz");
            return (Criteria) this;
        }

        public Criteria andHsdzNotIn(List<Integer> values) {
            addCriterion("hsdz not in", values, "hsdz");
            return (Criteria) this;
        }

        public Criteria andHsdzBetween(Integer value1, Integer value2) {
            addCriterion("hsdz between", value1, value2, "hsdz");
            return (Criteria) this;
        }

        public Criteria andHsdzNotBetween(Integer value1, Integer value2) {
            addCriterion("hsdz not between", value1, value2, "hsdz");
            return (Criteria) this;
        }

        public Criteria andHsbsIsNull() {
            addCriterion("hsbs is null");
            return (Criteria) this;
        }

        public Criteria andHsbsIsNotNull() {
            addCriterion("hsbs is not null");
            return (Criteria) this;
        }

        public Criteria andHsbsEqualTo(Integer value) {
            addCriterion("hsbs =", value, "hsbs");
            return (Criteria) this;
        }

        public Criteria andHsbsNotEqualTo(Integer value) {
            addCriterion("hsbs <>", value, "hsbs");
            return (Criteria) this;
        }

        public Criteria andHsbsGreaterThan(Integer value) {
            addCriterion("hsbs >", value, "hsbs");
            return (Criteria) this;
        }

        public Criteria andHsbsGreaterThanOrEqualTo(Integer value) {
            addCriterion("hsbs >=", value, "hsbs");
            return (Criteria) this;
        }

        public Criteria andHsbsLessThan(Integer value) {
            addCriterion("hsbs <", value, "hsbs");
            return (Criteria) this;
        }

        public Criteria andHsbsLessThanOrEqualTo(Integer value) {
            addCriterion("hsbs <=", value, "hsbs");
            return (Criteria) this;
        }

        public Criteria andHsbsIn(List<Integer> values) {
            addCriterion("hsbs in", values, "hsbs");
            return (Criteria) this;
        }

        public Criteria andHsbsNotIn(List<Integer> values) {
            addCriterion("hsbs not in", values, "hsbs");
            return (Criteria) this;
        }

        public Criteria andHsbsBetween(Integer value1, Integer value2) {
            addCriterion("hsbs between", value1, value2, "hsbs");
            return (Criteria) this;
        }

        public Criteria andHsbsNotBetween(Integer value1, Integer value2) {
            addCriterion("hsbs not between", value1, value2, "hsbs");
            return (Criteria) this;
        }

        public Criteria andHszlIsNull() {
            addCriterion("hszl is null");
            return (Criteria) this;
        }

        public Criteria andHszlIsNotNull() {
            addCriterion("hszl is not null");
            return (Criteria) this;
        }

        public Criteria andHszlEqualTo(Integer value) {
            addCriterion("hszl =", value, "hszl");
            return (Criteria) this;
        }

        public Criteria andHszlNotEqualTo(Integer value) {
            addCriterion("hszl <>", value, "hszl");
            return (Criteria) this;
        }

        public Criteria andHszlGreaterThan(Integer value) {
            addCriterion("hszl >", value, "hszl");
            return (Criteria) this;
        }

        public Criteria andHszlGreaterThanOrEqualTo(Integer value) {
            addCriterion("hszl >=", value, "hszl");
            return (Criteria) this;
        }

        public Criteria andHszlLessThan(Integer value) {
            addCriterion("hszl <", value, "hszl");
            return (Criteria) this;
        }

        public Criteria andHszlLessThanOrEqualTo(Integer value) {
            addCriterion("hszl <=", value, "hszl");
            return (Criteria) this;
        }

        public Criteria andHszlIn(List<Integer> values) {
            addCriterion("hszl in", values, "hszl");
            return (Criteria) this;
        }

        public Criteria andHszlNotIn(List<Integer> values) {
            addCriterion("hszl not in", values, "hszl");
            return (Criteria) this;
        }

        public Criteria andHszlBetween(Integer value1, Integer value2) {
            addCriterion("hszl between", value1, value2, "hszl");
            return (Criteria) this;
        }

        public Criteria andHszlNotBetween(Integer value1, Integer value2) {
            addCriterion("hszl not between", value1, value2, "hszl");
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