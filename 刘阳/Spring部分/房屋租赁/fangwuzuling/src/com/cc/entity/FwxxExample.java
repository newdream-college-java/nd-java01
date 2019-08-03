package com.cc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FwxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FwxxExample() {
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

        public Criteria andFwidIsNull() {
            addCriterion("fwid is null");
            return (Criteria) this;
        }

        public Criteria andFwidIsNotNull() {
            addCriterion("fwid is not null");
            return (Criteria) this;
        }

        public Criteria andFwidEqualTo(Integer value) {
            addCriterion("fwid =", value, "fwid");
            return (Criteria) this;
        }

        public Criteria andFwidNotEqualTo(Integer value) {
            addCriterion("fwid <>", value, "fwid");
            return (Criteria) this;
        }

        public Criteria andFwidGreaterThan(Integer value) {
            addCriterion("fwid >", value, "fwid");
            return (Criteria) this;
        }

        public Criteria andFwidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fwid >=", value, "fwid");
            return (Criteria) this;
        }

        public Criteria andFwidLessThan(Integer value) {
            addCriterion("fwid <", value, "fwid");
            return (Criteria) this;
        }

        public Criteria andFwidLessThanOrEqualTo(Integer value) {
            addCriterion("fwid <=", value, "fwid");
            return (Criteria) this;
        }

        public Criteria andFwidIn(List<Integer> values) {
            addCriterion("fwid in", values, "fwid");
            return (Criteria) this;
        }

        public Criteria andFwidNotIn(List<Integer> values) {
            addCriterion("fwid not in", values, "fwid");
            return (Criteria) this;
        }

        public Criteria andFwidBetween(Integer value1, Integer value2) {
            addCriterion("fwid between", value1, value2, "fwid");
            return (Criteria) this;
        }

        public Criteria andFwidNotBetween(Integer value1, Integer value2) {
            addCriterion("fwid not between", value1, value2, "fwid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andJdidIsNull() {
            addCriterion("jdid is null");
            return (Criteria) this;
        }

        public Criteria andJdidIsNotNull() {
            addCriterion("jdid is not null");
            return (Criteria) this;
        }

        public Criteria andJdidEqualTo(Integer value) {
            addCriterion("jdid =", value, "jdid");
            return (Criteria) this;
        }

        public Criteria andJdidNotEqualTo(Integer value) {
            addCriterion("jdid <>", value, "jdid");
            return (Criteria) this;
        }

        public Criteria andJdidGreaterThan(Integer value) {
            addCriterion("jdid >", value, "jdid");
            return (Criteria) this;
        }

        public Criteria andJdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jdid >=", value, "jdid");
            return (Criteria) this;
        }

        public Criteria andJdidLessThan(Integer value) {
            addCriterion("jdid <", value, "jdid");
            return (Criteria) this;
        }

        public Criteria andJdidLessThanOrEqualTo(Integer value) {
            addCriterion("jdid <=", value, "jdid");
            return (Criteria) this;
        }

        public Criteria andJdidIn(List<Integer> values) {
            addCriterion("jdid in", values, "jdid");
            return (Criteria) this;
        }

        public Criteria andJdidNotIn(List<Integer> values) {
            addCriterion("jdid not in", values, "jdid");
            return (Criteria) this;
        }

        public Criteria andJdidBetween(Integer value1, Integer value2) {
            addCriterion("jdid between", value1, value2, "jdid");
            return (Criteria) this;
        }

        public Criteria andJdidNotBetween(Integer value1, Integer value2) {
            addCriterion("jdid not between", value1, value2, "jdid");
            return (Criteria) this;
        }

        public Criteria andQxidIsNull() {
            addCriterion("qxid is null");
            return (Criteria) this;
        }

        public Criteria andQxidIsNotNull() {
            addCriterion("qxid is not null");
            return (Criteria) this;
        }

        public Criteria andQxidEqualTo(Integer value) {
            addCriterion("qxid =", value, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidNotEqualTo(Integer value) {
            addCriterion("qxid <>", value, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidGreaterThan(Integer value) {
            addCriterion("qxid >", value, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("qxid >=", value, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidLessThan(Integer value) {
            addCriterion("qxid <", value, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidLessThanOrEqualTo(Integer value) {
            addCriterion("qxid <=", value, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidIn(List<Integer> values) {
            addCriterion("qxid in", values, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidNotIn(List<Integer> values) {
            addCriterion("qxid not in", values, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidBetween(Integer value1, Integer value2) {
            addCriterion("qxid between", value1, value2, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidNotBetween(Integer value1, Integer value2) {
            addCriterion("qxid not between", value1, value2, "qxid");
            return (Criteria) this;
        }

        public Criteria andLxidIsNull() {
            addCriterion("lxid is null");
            return (Criteria) this;
        }

        public Criteria andLxidIsNotNull() {
            addCriterion("lxid is not null");
            return (Criteria) this;
        }

        public Criteria andLxidEqualTo(Integer value) {
            addCriterion("lxid =", value, "lxid");
            return (Criteria) this;
        }

        public Criteria andLxidNotEqualTo(Integer value) {
            addCriterion("lxid <>", value, "lxid");
            return (Criteria) this;
        }

        public Criteria andLxidGreaterThan(Integer value) {
            addCriterion("lxid >", value, "lxid");
            return (Criteria) this;
        }

        public Criteria andLxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lxid >=", value, "lxid");
            return (Criteria) this;
        }

        public Criteria andLxidLessThan(Integer value) {
            addCriterion("lxid <", value, "lxid");
            return (Criteria) this;
        }

        public Criteria andLxidLessThanOrEqualTo(Integer value) {
            addCriterion("lxid <=", value, "lxid");
            return (Criteria) this;
        }

        public Criteria andLxidIn(List<Integer> values) {
            addCriterion("lxid in", values, "lxid");
            return (Criteria) this;
        }

        public Criteria andLxidNotIn(List<Integer> values) {
            addCriterion("lxid not in", values, "lxid");
            return (Criteria) this;
        }

        public Criteria andLxidBetween(Integer value1, Integer value2) {
            addCriterion("lxid between", value1, value2, "lxid");
            return (Criteria) this;
        }

        public Criteria andLxidNotBetween(Integer value1, Integer value2) {
            addCriterion("lxid not between", value1, value2, "lxid");
            return (Criteria) this;
        }

        public Criteria andShiIsNull() {
            addCriterion("shi is null");
            return (Criteria) this;
        }

        public Criteria andShiIsNotNull() {
            addCriterion("shi is not null");
            return (Criteria) this;
        }

        public Criteria andShiEqualTo(Integer value) {
            addCriterion("shi =", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiNotEqualTo(Integer value) {
            addCriterion("shi <>", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiGreaterThan(Integer value) {
            addCriterion("shi >", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiGreaterThanOrEqualTo(Integer value) {
            addCriterion("shi >=", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiLessThan(Integer value) {
            addCriterion("shi <", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiLessThanOrEqualTo(Integer value) {
            addCriterion("shi <=", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiIn(List<Integer> values) {
            addCriterion("shi in", values, "shi");
            return (Criteria) this;
        }

        public Criteria andShiNotIn(List<Integer> values) {
            addCriterion("shi not in", values, "shi");
            return (Criteria) this;
        }

        public Criteria andShiBetween(Integer value1, Integer value2) {
            addCriterion("shi between", value1, value2, "shi");
            return (Criteria) this;
        }

        public Criteria andShiNotBetween(Integer value1, Integer value2) {
            addCriterion("shi not between", value1, value2, "shi");
            return (Criteria) this;
        }

        public Criteria andTingIsNull() {
            addCriterion("ting is null");
            return (Criteria) this;
        }

        public Criteria andTingIsNotNull() {
            addCriterion("ting is not null");
            return (Criteria) this;
        }

        public Criteria andTingEqualTo(Integer value) {
            addCriterion("ting =", value, "ting");
            return (Criteria) this;
        }

        public Criteria andTingNotEqualTo(Integer value) {
            addCriterion("ting <>", value, "ting");
            return (Criteria) this;
        }

        public Criteria andTingGreaterThan(Integer value) {
            addCriterion("ting >", value, "ting");
            return (Criteria) this;
        }

        public Criteria andTingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ting >=", value, "ting");
            return (Criteria) this;
        }

        public Criteria andTingLessThan(Integer value) {
            addCriterion("ting <", value, "ting");
            return (Criteria) this;
        }

        public Criteria andTingLessThanOrEqualTo(Integer value) {
            addCriterion("ting <=", value, "ting");
            return (Criteria) this;
        }

        public Criteria andTingIn(List<Integer> values) {
            addCriterion("ting in", values, "ting");
            return (Criteria) this;
        }

        public Criteria andTingNotIn(List<Integer> values) {
            addCriterion("ting not in", values, "ting");
            return (Criteria) this;
        }

        public Criteria andTingBetween(Integer value1, Integer value2) {
            addCriterion("ting between", value1, value2, "ting");
            return (Criteria) this;
        }

        public Criteria andTingNotBetween(Integer value1, Integer value2) {
            addCriterion("ting not between", value1, value2, "ting");
            return (Criteria) this;
        }

        public Criteria andFwxxIsNull() {
            addCriterion("fwxx is null");
            return (Criteria) this;
        }

        public Criteria andFwxxIsNotNull() {
            addCriterion("fwxx is not null");
            return (Criteria) this;
        }

        public Criteria andFwxxEqualTo(String value) {
            addCriterion("fwxx =", value, "fwxx");
            return (Criteria) this;
        }

        public Criteria andFwxxNotEqualTo(String value) {
            addCriterion("fwxx <>", value, "fwxx");
            return (Criteria) this;
        }

        public Criteria andFwxxGreaterThan(String value) {
            addCriterion("fwxx >", value, "fwxx");
            return (Criteria) this;
        }

        public Criteria andFwxxGreaterThanOrEqualTo(String value) {
            addCriterion("fwxx >=", value, "fwxx");
            return (Criteria) this;
        }

        public Criteria andFwxxLessThan(String value) {
            addCriterion("fwxx <", value, "fwxx");
            return (Criteria) this;
        }

        public Criteria andFwxxLessThanOrEqualTo(String value) {
            addCriterion("fwxx <=", value, "fwxx");
            return (Criteria) this;
        }

        public Criteria andFwxxLike(String value) {
            addCriterion("fwxx like", value, "fwxx");
            return (Criteria) this;
        }

        public Criteria andFwxxNotLike(String value) {
            addCriterion("fwxx not like", value, "fwxx");
            return (Criteria) this;
        }

        public Criteria andFwxxIn(List<String> values) {
            addCriterion("fwxx in", values, "fwxx");
            return (Criteria) this;
        }

        public Criteria andFwxxNotIn(List<String> values) {
            addCriterion("fwxx not in", values, "fwxx");
            return (Criteria) this;
        }

        public Criteria andFwxxBetween(String value1, String value2) {
            addCriterion("fwxx between", value1, value2, "fwxx");
            return (Criteria) this;
        }

        public Criteria andFwxxNotBetween(String value1, String value2) {
            addCriterion("fwxx not between", value1, value2, "fwxx");
            return (Criteria) this;
        }

        public Criteria andZjIsNull() {
            addCriterion("zj is null");
            return (Criteria) this;
        }

        public Criteria andZjIsNotNull() {
            addCriterion("zj is not null");
            return (Criteria) this;
        }

        public Criteria andZjEqualTo(Long value) {
            addCriterion("zj =", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotEqualTo(Long value) {
            addCriterion("zj <>", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjGreaterThan(Long value) {
            addCriterion("zj >", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjGreaterThanOrEqualTo(Long value) {
            addCriterion("zj >=", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjLessThan(Long value) {
            addCriterion("zj <", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjLessThanOrEqualTo(Long value) {
            addCriterion("zj <=", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjIn(List<Long> values) {
            addCriterion("zj in", values, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotIn(List<Long> values) {
            addCriterion("zj not in", values, "zj");
            return (Criteria) this;
        }

        public Criteria andZjBetween(Long value1, Long value2) {
            addCriterion("zj between", value1, value2, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotBetween(Long value1, Long value2) {
            addCriterion("zj not between", value1, value2, "zj");
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
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
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

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andConcatIsNull() {
            addCriterion("concat is null");
            return (Criteria) this;
        }

        public Criteria andConcatIsNotNull() {
            addCriterion("concat is not null");
            return (Criteria) this;
        }

        public Criteria andConcatEqualTo(String value) {
            addCriterion("concat =", value, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatNotEqualTo(String value) {
            addCriterion("concat <>", value, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatGreaterThan(String value) {
            addCriterion("concat >", value, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatGreaterThanOrEqualTo(String value) {
            addCriterion("concat >=", value, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatLessThan(String value) {
            addCriterion("concat <", value, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatLessThanOrEqualTo(String value) {
            addCriterion("concat <=", value, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatLike(String value) {
            addCriterion("concat like", value, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatNotLike(String value) {
            addCriterion("concat not like", value, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatIn(List<String> values) {
            addCriterion("concat in", values, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatNotIn(List<String> values) {
            addCriterion("concat not in", values, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatBetween(String value1, String value2) {
            addCriterion("concat between", value1, value2, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatNotBetween(String value1, String value2) {
            addCriterion("concat not between", value1, value2, "concat");
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