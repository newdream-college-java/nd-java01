package com.yb.entity;

import java.util.ArrayList;
import java.util.List;

public class FwlxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FwlxExample() {
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

        public Criteria andFwlxIsNull() {
            addCriterion("fwlx is null");
            return (Criteria) this;
        }

        public Criteria andFwlxIsNotNull() {
            addCriterion("fwlx is not null");
            return (Criteria) this;
        }

        public Criteria andFwlxEqualTo(String value) {
            addCriterion("fwlx =", value, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxNotEqualTo(String value) {
            addCriterion("fwlx <>", value, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxGreaterThan(String value) {
            addCriterion("fwlx >", value, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxGreaterThanOrEqualTo(String value) {
            addCriterion("fwlx >=", value, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxLessThan(String value) {
            addCriterion("fwlx <", value, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxLessThanOrEqualTo(String value) {
            addCriterion("fwlx <=", value, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxLike(String value) {
            addCriterion("fwlx like", value, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxNotLike(String value) {
            addCriterion("fwlx not like", value, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxIn(List<String> values) {
            addCriterion("fwlx in", values, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxNotIn(List<String> values) {
            addCriterion("fwlx not in", values, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxBetween(String value1, String value2) {
            addCriterion("fwlx between", value1, value2, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxNotBetween(String value1, String value2) {
            addCriterion("fwlx not between", value1, value2, "fwlx");
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