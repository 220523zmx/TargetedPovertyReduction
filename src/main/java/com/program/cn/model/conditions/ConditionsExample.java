package com.program.cn.model.conditions;

import java.util.ArrayList;
import java.util.List;

public class ConditionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConditionsExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andLevelOfEducationIsNull() {
            addCriterion("level_of_education is null");
            return (Criteria) this;
        }

        public Criteria andLevelOfEducationIsNotNull() {
            addCriterion("level_of_education is not null");
            return (Criteria) this;
        }

        public Criteria andLevelOfEducationEqualTo(String value) {
            addCriterion("level_of_education =", value, "levelOfEducation");
            return (Criteria) this;
        }

        public Criteria andLevelOfEducationNotEqualTo(String value) {
            addCriterion("level_of_education <>", value, "levelOfEducation");
            return (Criteria) this;
        }

        public Criteria andLevelOfEducationGreaterThan(String value) {
            addCriterion("level_of_education >", value, "levelOfEducation");
            return (Criteria) this;
        }

        public Criteria andLevelOfEducationGreaterThanOrEqualTo(String value) {
            addCriterion("level_of_education >=", value, "levelOfEducation");
            return (Criteria) this;
        }

        public Criteria andLevelOfEducationLessThan(String value) {
            addCriterion("level_of_education <", value, "levelOfEducation");
            return (Criteria) this;
        }

        public Criteria andLevelOfEducationLessThanOrEqualTo(String value) {
            addCriterion("level_of_education <=", value, "levelOfEducation");
            return (Criteria) this;
        }

        public Criteria andLevelOfEducationLike(String value) {
            addCriterion("level_of_education like", value, "levelOfEducation");
            return (Criteria) this;
        }

        public Criteria andLevelOfEducationNotLike(String value) {
            addCriterion("level_of_education not like", value, "levelOfEducation");
            return (Criteria) this;
        }

        public Criteria andLevelOfEducationIn(List<String> values) {
            addCriterion("level_of_education in", values, "levelOfEducation");
            return (Criteria) this;
        }

        public Criteria andLevelOfEducationNotIn(List<String> values) {
            addCriterion("level_of_education not in", values, "levelOfEducation");
            return (Criteria) this;
        }

        public Criteria andLevelOfEducationBetween(String value1, String value2) {
            addCriterion("level_of_education between", value1, value2, "levelOfEducation");
            return (Criteria) this;
        }

        public Criteria andLevelOfEducationNotBetween(String value1, String value2) {
            addCriterion("level_of_education not between", value1, value2, "levelOfEducation");
            return (Criteria) this;
        }

        public Criteria andHealthIsNull() {
            addCriterion("health is null");
            return (Criteria) this;
        }

        public Criteria andHealthIsNotNull() {
            addCriterion("health is not null");
            return (Criteria) this;
        }

        public Criteria andHealthEqualTo(String value) {
            addCriterion("health =", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotEqualTo(String value) {
            addCriterion("health <>", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThan(String value) {
            addCriterion("health >", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThanOrEqualTo(String value) {
            addCriterion("health >=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThan(String value) {
            addCriterion("health <", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThanOrEqualTo(String value) {
            addCriterion("health <=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLike(String value) {
            addCriterion("health like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotLike(String value) {
            addCriterion("health not like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthIn(List<String> values) {
            addCriterion("health in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotIn(List<String> values) {
            addCriterion("health not in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthBetween(String value1, String value2) {
            addCriterion("health between", value1, value2, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotBetween(String value1, String value2) {
            addCriterion("health not between", value1, value2, "health");
            return (Criteria) this;
        }

        public Criteria andLaborSkillsIsNull() {
            addCriterion("labor_skills is null");
            return (Criteria) this;
        }

        public Criteria andLaborSkillsIsNotNull() {
            addCriterion("labor_skills is not null");
            return (Criteria) this;
        }

        public Criteria andLaborSkillsEqualTo(String value) {
            addCriterion("labor_skills =", value, "laborSkills");
            return (Criteria) this;
        }

        public Criteria andLaborSkillsNotEqualTo(String value) {
            addCriterion("labor_skills <>", value, "laborSkills");
            return (Criteria) this;
        }

        public Criteria andLaborSkillsGreaterThan(String value) {
            addCriterion("labor_skills >", value, "laborSkills");
            return (Criteria) this;
        }

        public Criteria andLaborSkillsGreaterThanOrEqualTo(String value) {
            addCriterion("labor_skills >=", value, "laborSkills");
            return (Criteria) this;
        }

        public Criteria andLaborSkillsLessThan(String value) {
            addCriterion("labor_skills <", value, "laborSkills");
            return (Criteria) this;
        }

        public Criteria andLaborSkillsLessThanOrEqualTo(String value) {
            addCriterion("labor_skills <=", value, "laborSkills");
            return (Criteria) this;
        }

        public Criteria andLaborSkillsLike(String value) {
            addCriterion("labor_skills like", value, "laborSkills");
            return (Criteria) this;
        }

        public Criteria andLaborSkillsNotLike(String value) {
            addCriterion("labor_skills not like", value, "laborSkills");
            return (Criteria) this;
        }

        public Criteria andLaborSkillsIn(List<String> values) {
            addCriterion("labor_skills in", values, "laborSkills");
            return (Criteria) this;
        }

        public Criteria andLaborSkillsNotIn(List<String> values) {
            addCriterion("labor_skills not in", values, "laborSkills");
            return (Criteria) this;
        }

        public Criteria andLaborSkillsBetween(String value1, String value2) {
            addCriterion("labor_skills between", value1, value2, "laborSkills");
            return (Criteria) this;
        }

        public Criteria andLaborSkillsNotBetween(String value1, String value2) {
            addCriterion("labor_skills not between", value1, value2, "laborSkills");
            return (Criteria) this;
        }

        public Criteria andRuralCooperativeIsNull() {
            addCriterion("rural_cooperative is null");
            return (Criteria) this;
        }

        public Criteria andRuralCooperativeIsNotNull() {
            addCriterion("rural_cooperative is not null");
            return (Criteria) this;
        }

        public Criteria andRuralCooperativeEqualTo(String value) {
            addCriterion("rural_cooperative =", value, "ruralCooperative");
            return (Criteria) this;
        }

        public Criteria andRuralCooperativeNotEqualTo(String value) {
            addCriterion("rural_cooperative <>", value, "ruralCooperative");
            return (Criteria) this;
        }

        public Criteria andRuralCooperativeGreaterThan(String value) {
            addCriterion("rural_cooperative >", value, "ruralCooperative");
            return (Criteria) this;
        }

        public Criteria andRuralCooperativeGreaterThanOrEqualTo(String value) {
            addCriterion("rural_cooperative >=", value, "ruralCooperative");
            return (Criteria) this;
        }

        public Criteria andRuralCooperativeLessThan(String value) {
            addCriterion("rural_cooperative <", value, "ruralCooperative");
            return (Criteria) this;
        }

        public Criteria andRuralCooperativeLessThanOrEqualTo(String value) {
            addCriterion("rural_cooperative <=", value, "ruralCooperative");
            return (Criteria) this;
        }

        public Criteria andRuralCooperativeLike(String value) {
            addCriterion("rural_cooperative like", value, "ruralCooperative");
            return (Criteria) this;
        }

        public Criteria andRuralCooperativeNotLike(String value) {
            addCriterion("rural_cooperative not like", value, "ruralCooperative");
            return (Criteria) this;
        }

        public Criteria andRuralCooperativeIn(List<String> values) {
            addCriterion("rural_cooperative in", values, "ruralCooperative");
            return (Criteria) this;
        }

        public Criteria andRuralCooperativeNotIn(List<String> values) {
            addCriterion("rural_cooperative not in", values, "ruralCooperative");
            return (Criteria) this;
        }

        public Criteria andRuralCooperativeBetween(String value1, String value2) {
            addCriterion("rural_cooperative between", value1, value2, "ruralCooperative");
            return (Criteria) this;
        }

        public Criteria andRuralCooperativeNotBetween(String value1, String value2) {
            addCriterion("rural_cooperative not between", value1, value2, "ruralCooperative");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
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