package com.bailing.fupin.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HdMedicalUpkeepModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HdMedicalUpkeepModelExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPersonalidIsNull() {
            addCriterion("PERSONALID is null");
            return (Criteria) this;
        }

        public Criteria andPersonalidIsNotNull() {
            addCriterion("PERSONALID is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalidEqualTo(String value) {
            addCriterion("PERSONALID =", value, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidNotEqualTo(String value) {
            addCriterion("PERSONALID <>", value, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidGreaterThan(String value) {
            addCriterion("PERSONALID >", value, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidGreaterThanOrEqualTo(String value) {
            addCriterion("PERSONALID >=", value, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidLessThan(String value) {
            addCriterion("PERSONALID <", value, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidLessThanOrEqualTo(String value) {
            addCriterion("PERSONALID <=", value, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidLike(String value) {
            addCriterion("PERSONALID like", value, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidNotLike(String value) {
            addCriterion("PERSONALID not like", value, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidIn(List<String> values) {
            addCriterion("PERSONALID in", values, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidNotIn(List<String> values) {
            addCriterion("PERSONALID not in", values, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidBetween(String value1, String value2) {
            addCriterion("PERSONALID between", value1, value2, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidNotBetween(String value1, String value2) {
            addCriterion("PERSONALID not between", value1, value2, "personalid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidIsNull() {
            addCriterion("ORGANIZEID is null");
            return (Criteria) this;
        }

        public Criteria andOrganizeidIsNotNull() {
            addCriterion("ORGANIZEID is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizeidEqualTo(String value) {
            addCriterion("ORGANIZEID =", value, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidNotEqualTo(String value) {
            addCriterion("ORGANIZEID <>", value, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidGreaterThan(String value) {
            addCriterion("ORGANIZEID >", value, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZEID >=", value, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidLessThan(String value) {
            addCriterion("ORGANIZEID <", value, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZEID <=", value, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidLike(String value) {
            addCriterion("ORGANIZEID like", value, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidNotLike(String value) {
            addCriterion("ORGANIZEID not like", value, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidIn(List<String> values) {
            addCriterion("ORGANIZEID in", values, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidNotIn(List<String> values) {
            addCriterion("ORGANIZEID not in", values, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidBetween(String value1, String value2) {
            addCriterion("ORGANIZEID between", value1, value2, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidNotBetween(String value1, String value2) {
            addCriterion("ORGANIZEID not between", value1, value2, "organizeid");
            return (Criteria) this;
        }

        public Criteria andModelnameIsNull() {
            addCriterion("MODELNAME is null");
            return (Criteria) this;
        }

        public Criteria andModelnameIsNotNull() {
            addCriterion("MODELNAME is not null");
            return (Criteria) this;
        }

        public Criteria andModelnameEqualTo(String value) {
            addCriterion("MODELNAME =", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotEqualTo(String value) {
            addCriterion("MODELNAME <>", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameGreaterThan(String value) {
            addCriterion("MODELNAME >", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameGreaterThanOrEqualTo(String value) {
            addCriterion("MODELNAME >=", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLessThan(String value) {
            addCriterion("MODELNAME <", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLessThanOrEqualTo(String value) {
            addCriterion("MODELNAME <=", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLike(String value) {
            addCriterion("MODELNAME like", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotLike(String value) {
            addCriterion("MODELNAME not like", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameIn(List<String> values) {
            addCriterion("MODELNAME in", values, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotIn(List<String> values) {
            addCriterion("MODELNAME not in", values, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameBetween(String value1, String value2) {
            addCriterion("MODELNAME between", value1, value2, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotBetween(String value1, String value2) {
            addCriterion("MODELNAME not between", value1, value2, "modelname");
            return (Criteria) this;
        }

        public Criteria andModeltypeIsNull() {
            addCriterion("MODELTYPE is null");
            return (Criteria) this;
        }

        public Criteria andModeltypeIsNotNull() {
            addCriterion("MODELTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andModeltypeEqualTo(String value) {
            addCriterion("MODELTYPE =", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotEqualTo(String value) {
            addCriterion("MODELTYPE <>", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeGreaterThan(String value) {
            addCriterion("MODELTYPE >", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeGreaterThanOrEqualTo(String value) {
            addCriterion("MODELTYPE >=", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeLessThan(String value) {
            addCriterion("MODELTYPE <", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeLessThanOrEqualTo(String value) {
            addCriterion("MODELTYPE <=", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeLike(String value) {
            addCriterion("MODELTYPE like", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotLike(String value) {
            addCriterion("MODELTYPE not like", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeIn(List<String> values) {
            addCriterion("MODELTYPE in", values, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotIn(List<String> values) {
            addCriterion("MODELTYPE not in", values, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeBetween(String value1, String value2) {
            addCriterion("MODELTYPE between", value1, value2, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotBetween(String value1, String value2) {
            addCriterion("MODELTYPE not between", value1, value2, "modeltype");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFbgIsNull() {
            addCriterion("FBG is null");
            return (Criteria) this;
        }

        public Criteria andFbgIsNotNull() {
            addCriterion("FBG is not null");
            return (Criteria) this;
        }

        public Criteria andFbgEqualTo(BigDecimal value) {
            addCriterion("FBG =", value, "fbg");
            return (Criteria) this;
        }

        public Criteria andFbgNotEqualTo(BigDecimal value) {
            addCriterion("FBG <>", value, "fbg");
            return (Criteria) this;
        }

        public Criteria andFbgGreaterThan(BigDecimal value) {
            addCriterion("FBG >", value, "fbg");
            return (Criteria) this;
        }

        public Criteria andFbgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FBG >=", value, "fbg");
            return (Criteria) this;
        }

        public Criteria andFbgLessThan(BigDecimal value) {
            addCriterion("FBG <", value, "fbg");
            return (Criteria) this;
        }

        public Criteria andFbgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FBG <=", value, "fbg");
            return (Criteria) this;
        }

        public Criteria andFbgIn(List<BigDecimal> values) {
            addCriterion("FBG in", values, "fbg");
            return (Criteria) this;
        }

        public Criteria andFbgNotIn(List<BigDecimal> values) {
            addCriterion("FBG not in", values, "fbg");
            return (Criteria) this;
        }

        public Criteria andFbgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBG between", value1, value2, "fbg");
            return (Criteria) this;
        }

        public Criteria andFbgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBG not between", value1, value2, "fbg");
            return (Criteria) this;
        }

        public Criteria andFbgDlIsNull() {
            addCriterion("FBG_DL is null");
            return (Criteria) this;
        }

        public Criteria andFbgDlIsNotNull() {
            addCriterion("FBG_DL is not null");
            return (Criteria) this;
        }

        public Criteria andFbgDlEqualTo(BigDecimal value) {
            addCriterion("FBG_DL =", value, "fbgDl");
            return (Criteria) this;
        }

        public Criteria andFbgDlNotEqualTo(BigDecimal value) {
            addCriterion("FBG_DL <>", value, "fbgDl");
            return (Criteria) this;
        }

        public Criteria andFbgDlGreaterThan(BigDecimal value) {
            addCriterion("FBG_DL >", value, "fbgDl");
            return (Criteria) this;
        }

        public Criteria andFbgDlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FBG_DL >=", value, "fbgDl");
            return (Criteria) this;
        }

        public Criteria andFbgDlLessThan(BigDecimal value) {
            addCriterion("FBG_DL <", value, "fbgDl");
            return (Criteria) this;
        }

        public Criteria andFbgDlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FBG_DL <=", value, "fbgDl");
            return (Criteria) this;
        }

        public Criteria andFbgDlIn(List<BigDecimal> values) {
            addCriterion("FBG_DL in", values, "fbgDl");
            return (Criteria) this;
        }

        public Criteria andFbgDlNotIn(List<BigDecimal> values) {
            addCriterion("FBG_DL not in", values, "fbgDl");
            return (Criteria) this;
        }

        public Criteria andFbgDlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBG_DL between", value1, value2, "fbgDl");
            return (Criteria) this;
        }

        public Criteria andFbgDlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBG_DL not between", value1, value2, "fbgDl");
            return (Criteria) this;
        }

        public Criteria andPressureLIsNull() {
            addCriterion("PRESSURE_L is null");
            return (Criteria) this;
        }

        public Criteria andPressureLIsNotNull() {
            addCriterion("PRESSURE_L is not null");
            return (Criteria) this;
        }

        public Criteria andPressureLEqualTo(BigDecimal value) {
            addCriterion("PRESSURE_L =", value, "pressureL");
            return (Criteria) this;
        }

        public Criteria andPressureLNotEqualTo(BigDecimal value) {
            addCriterion("PRESSURE_L <>", value, "pressureL");
            return (Criteria) this;
        }

        public Criteria andPressureLGreaterThan(BigDecimal value) {
            addCriterion("PRESSURE_L >", value, "pressureL");
            return (Criteria) this;
        }

        public Criteria andPressureLGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRESSURE_L >=", value, "pressureL");
            return (Criteria) this;
        }

        public Criteria andPressureLLessThan(BigDecimal value) {
            addCriterion("PRESSURE_L <", value, "pressureL");
            return (Criteria) this;
        }

        public Criteria andPressureLLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRESSURE_L <=", value, "pressureL");
            return (Criteria) this;
        }

        public Criteria andPressureLIn(List<BigDecimal> values) {
            addCriterion("PRESSURE_L in", values, "pressureL");
            return (Criteria) this;
        }

        public Criteria andPressureLNotIn(List<BigDecimal> values) {
            addCriterion("PRESSURE_L not in", values, "pressureL");
            return (Criteria) this;
        }

        public Criteria andPressureLBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRESSURE_L between", value1, value2, "pressureL");
            return (Criteria) this;
        }

        public Criteria andPressureLNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRESSURE_L not between", value1, value2, "pressureL");
            return (Criteria) this;
        }

        public Criteria andPressureHIsNull() {
            addCriterion("PRESSURE_H is null");
            return (Criteria) this;
        }

        public Criteria andPressureHIsNotNull() {
            addCriterion("PRESSURE_H is not null");
            return (Criteria) this;
        }

        public Criteria andPressureHEqualTo(BigDecimal value) {
            addCriterion("PRESSURE_H =", value, "pressureH");
            return (Criteria) this;
        }

        public Criteria andPressureHNotEqualTo(BigDecimal value) {
            addCriterion("PRESSURE_H <>", value, "pressureH");
            return (Criteria) this;
        }

        public Criteria andPressureHGreaterThan(BigDecimal value) {
            addCriterion("PRESSURE_H >", value, "pressureH");
            return (Criteria) this;
        }

        public Criteria andPressureHGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRESSURE_H >=", value, "pressureH");
            return (Criteria) this;
        }

        public Criteria andPressureHLessThan(BigDecimal value) {
            addCriterion("PRESSURE_H <", value, "pressureH");
            return (Criteria) this;
        }

        public Criteria andPressureHLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRESSURE_H <=", value, "pressureH");
            return (Criteria) this;
        }

        public Criteria andPressureHIn(List<BigDecimal> values) {
            addCriterion("PRESSURE_H in", values, "pressureH");
            return (Criteria) this;
        }

        public Criteria andPressureHNotIn(List<BigDecimal> values) {
            addCriterion("PRESSURE_H not in", values, "pressureH");
            return (Criteria) this;
        }

        public Criteria andPressureHBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRESSURE_H between", value1, value2, "pressureH");
            return (Criteria) this;
        }

        public Criteria andPressureHNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRESSURE_H not between", value1, value2, "pressureH");
            return (Criteria) this;
        }

        public Criteria andRehabilitationGuideIsNull() {
            addCriterion("REHABILITATION_GUIDE is null");
            return (Criteria) this;
        }

        public Criteria andRehabilitationGuideIsNotNull() {
            addCriterion("REHABILITATION_GUIDE is not null");
            return (Criteria) this;
        }

        public Criteria andRehabilitationGuideEqualTo(String value) {
            addCriterion("REHABILITATION_GUIDE =", value, "rehabilitationGuide");
            return (Criteria) this;
        }

        public Criteria andRehabilitationGuideNotEqualTo(String value) {
            addCriterion("REHABILITATION_GUIDE <>", value, "rehabilitationGuide");
            return (Criteria) this;
        }

        public Criteria andRehabilitationGuideGreaterThan(String value) {
            addCriterion("REHABILITATION_GUIDE >", value, "rehabilitationGuide");
            return (Criteria) this;
        }

        public Criteria andRehabilitationGuideGreaterThanOrEqualTo(String value) {
            addCriterion("REHABILITATION_GUIDE >=", value, "rehabilitationGuide");
            return (Criteria) this;
        }

        public Criteria andRehabilitationGuideLessThan(String value) {
            addCriterion("REHABILITATION_GUIDE <", value, "rehabilitationGuide");
            return (Criteria) this;
        }

        public Criteria andRehabilitationGuideLessThanOrEqualTo(String value) {
            addCriterion("REHABILITATION_GUIDE <=", value, "rehabilitationGuide");
            return (Criteria) this;
        }

        public Criteria andRehabilitationGuideLike(String value) {
            addCriterion("REHABILITATION_GUIDE like", value, "rehabilitationGuide");
            return (Criteria) this;
        }

        public Criteria andRehabilitationGuideNotLike(String value) {
            addCriterion("REHABILITATION_GUIDE not like", value, "rehabilitationGuide");
            return (Criteria) this;
        }

        public Criteria andRehabilitationGuideIn(List<String> values) {
            addCriterion("REHABILITATION_GUIDE in", values, "rehabilitationGuide");
            return (Criteria) this;
        }

        public Criteria andRehabilitationGuideNotIn(List<String> values) {
            addCriterion("REHABILITATION_GUIDE not in", values, "rehabilitationGuide");
            return (Criteria) this;
        }

        public Criteria andRehabilitationGuideBetween(String value1, String value2) {
            addCriterion("REHABILITATION_GUIDE between", value1, value2, "rehabilitationGuide");
            return (Criteria) this;
        }

        public Criteria andRehabilitationGuideNotBetween(String value1, String value2) {
            addCriterion("REHABILITATION_GUIDE not between", value1, value2, "rehabilitationGuide");
            return (Criteria) this;
        }

        public Criteria andNursingGuideIsNull() {
            addCriterion("NURSING_GUIDE is null");
            return (Criteria) this;
        }

        public Criteria andNursingGuideIsNotNull() {
            addCriterion("NURSING_GUIDE is not null");
            return (Criteria) this;
        }

        public Criteria andNursingGuideEqualTo(String value) {
            addCriterion("NURSING_GUIDE =", value, "nursingGuide");
            return (Criteria) this;
        }

        public Criteria andNursingGuideNotEqualTo(String value) {
            addCriterion("NURSING_GUIDE <>", value, "nursingGuide");
            return (Criteria) this;
        }

        public Criteria andNursingGuideGreaterThan(String value) {
            addCriterion("NURSING_GUIDE >", value, "nursingGuide");
            return (Criteria) this;
        }

        public Criteria andNursingGuideGreaterThanOrEqualTo(String value) {
            addCriterion("NURSING_GUIDE >=", value, "nursingGuide");
            return (Criteria) this;
        }

        public Criteria andNursingGuideLessThan(String value) {
            addCriterion("NURSING_GUIDE <", value, "nursingGuide");
            return (Criteria) this;
        }

        public Criteria andNursingGuideLessThanOrEqualTo(String value) {
            addCriterion("NURSING_GUIDE <=", value, "nursingGuide");
            return (Criteria) this;
        }

        public Criteria andNursingGuideLike(String value) {
            addCriterion("NURSING_GUIDE like", value, "nursingGuide");
            return (Criteria) this;
        }

        public Criteria andNursingGuideNotLike(String value) {
            addCriterion("NURSING_GUIDE not like", value, "nursingGuide");
            return (Criteria) this;
        }

        public Criteria andNursingGuideIn(List<String> values) {
            addCriterion("NURSING_GUIDE in", values, "nursingGuide");
            return (Criteria) this;
        }

        public Criteria andNursingGuideNotIn(List<String> values) {
            addCriterion("NURSING_GUIDE not in", values, "nursingGuide");
            return (Criteria) this;
        }

        public Criteria andNursingGuideBetween(String value1, String value2) {
            addCriterion("NURSING_GUIDE between", value1, value2, "nursingGuide");
            return (Criteria) this;
        }

        public Criteria andNursingGuideNotBetween(String value1, String value2) {
            addCriterion("NURSING_GUIDE not between", value1, value2, "nursingGuide");
            return (Criteria) this;
        }

        public Criteria andHealthGuideIsNull() {
            addCriterion("HEALTH_GUIDE is null");
            return (Criteria) this;
        }

        public Criteria andHealthGuideIsNotNull() {
            addCriterion("HEALTH_GUIDE is not null");
            return (Criteria) this;
        }

        public Criteria andHealthGuideEqualTo(String value) {
            addCriterion("HEALTH_GUIDE =", value, "healthGuide");
            return (Criteria) this;
        }

        public Criteria andHealthGuideNotEqualTo(String value) {
            addCriterion("HEALTH_GUIDE <>", value, "healthGuide");
            return (Criteria) this;
        }

        public Criteria andHealthGuideGreaterThan(String value) {
            addCriterion("HEALTH_GUIDE >", value, "healthGuide");
            return (Criteria) this;
        }

        public Criteria andHealthGuideGreaterThanOrEqualTo(String value) {
            addCriterion("HEALTH_GUIDE >=", value, "healthGuide");
            return (Criteria) this;
        }

        public Criteria andHealthGuideLessThan(String value) {
            addCriterion("HEALTH_GUIDE <", value, "healthGuide");
            return (Criteria) this;
        }

        public Criteria andHealthGuideLessThanOrEqualTo(String value) {
            addCriterion("HEALTH_GUIDE <=", value, "healthGuide");
            return (Criteria) this;
        }

        public Criteria andHealthGuideLike(String value) {
            addCriterion("HEALTH_GUIDE like", value, "healthGuide");
            return (Criteria) this;
        }

        public Criteria andHealthGuideNotLike(String value) {
            addCriterion("HEALTH_GUIDE not like", value, "healthGuide");
            return (Criteria) this;
        }

        public Criteria andHealthGuideIn(List<String> values) {
            addCriterion("HEALTH_GUIDE in", values, "healthGuide");
            return (Criteria) this;
        }

        public Criteria andHealthGuideNotIn(List<String> values) {
            addCriterion("HEALTH_GUIDE not in", values, "healthGuide");
            return (Criteria) this;
        }

        public Criteria andHealthGuideBetween(String value1, String value2) {
            addCriterion("HEALTH_GUIDE between", value1, value2, "healthGuide");
            return (Criteria) this;
        }

        public Criteria andHealthGuideNotBetween(String value1, String value2) {
            addCriterion("HEALTH_GUIDE not between", value1, value2, "healthGuide");
            return (Criteria) this;
        }

        public Criteria andNutritionGuideIsNull() {
            addCriterion("NUTRITION_GUIDE is null");
            return (Criteria) this;
        }

        public Criteria andNutritionGuideIsNotNull() {
            addCriterion("NUTRITION_GUIDE is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionGuideEqualTo(String value) {
            addCriterion("NUTRITION_GUIDE =", value, "nutritionGuide");
            return (Criteria) this;
        }

        public Criteria andNutritionGuideNotEqualTo(String value) {
            addCriterion("NUTRITION_GUIDE <>", value, "nutritionGuide");
            return (Criteria) this;
        }

        public Criteria andNutritionGuideGreaterThan(String value) {
            addCriterion("NUTRITION_GUIDE >", value, "nutritionGuide");
            return (Criteria) this;
        }

        public Criteria andNutritionGuideGreaterThanOrEqualTo(String value) {
            addCriterion("NUTRITION_GUIDE >=", value, "nutritionGuide");
            return (Criteria) this;
        }

        public Criteria andNutritionGuideLessThan(String value) {
            addCriterion("NUTRITION_GUIDE <", value, "nutritionGuide");
            return (Criteria) this;
        }

        public Criteria andNutritionGuideLessThanOrEqualTo(String value) {
            addCriterion("NUTRITION_GUIDE <=", value, "nutritionGuide");
            return (Criteria) this;
        }

        public Criteria andNutritionGuideLike(String value) {
            addCriterion("NUTRITION_GUIDE like", value, "nutritionGuide");
            return (Criteria) this;
        }

        public Criteria andNutritionGuideNotLike(String value) {
            addCriterion("NUTRITION_GUIDE not like", value, "nutritionGuide");
            return (Criteria) this;
        }

        public Criteria andNutritionGuideIn(List<String> values) {
            addCriterion("NUTRITION_GUIDE in", values, "nutritionGuide");
            return (Criteria) this;
        }

        public Criteria andNutritionGuideNotIn(List<String> values) {
            addCriterion("NUTRITION_GUIDE not in", values, "nutritionGuide");
            return (Criteria) this;
        }

        public Criteria andNutritionGuideBetween(String value1, String value2) {
            addCriterion("NUTRITION_GUIDE between", value1, value2, "nutritionGuide");
            return (Criteria) this;
        }

        public Criteria andNutritionGuideNotBetween(String value1, String value2) {
            addCriterion("NUTRITION_GUIDE not between", value1, value2, "nutritionGuide");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CREATETIME like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CREATETIME not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreateorgIsNull() {
            addCriterion("CREATEORG is null");
            return (Criteria) this;
        }

        public Criteria andCreateorgIsNotNull() {
            addCriterion("CREATEORG is not null");
            return (Criteria) this;
        }

        public Criteria andCreateorgEqualTo(String value) {
            addCriterion("CREATEORG =", value, "createorg");
            return (Criteria) this;
        }

        public Criteria andCreateorgNotEqualTo(String value) {
            addCriterion("CREATEORG <>", value, "createorg");
            return (Criteria) this;
        }

        public Criteria andCreateorgGreaterThan(String value) {
            addCriterion("CREATEORG >", value, "createorg");
            return (Criteria) this;
        }

        public Criteria andCreateorgGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEORG >=", value, "createorg");
            return (Criteria) this;
        }

        public Criteria andCreateorgLessThan(String value) {
            addCriterion("CREATEORG <", value, "createorg");
            return (Criteria) this;
        }

        public Criteria andCreateorgLessThanOrEqualTo(String value) {
            addCriterion("CREATEORG <=", value, "createorg");
            return (Criteria) this;
        }

        public Criteria andCreateorgLike(String value) {
            addCriterion("CREATEORG like", value, "createorg");
            return (Criteria) this;
        }

        public Criteria andCreateorgNotLike(String value) {
            addCriterion("CREATEORG not like", value, "createorg");
            return (Criteria) this;
        }

        public Criteria andCreateorgIn(List<String> values) {
            addCriterion("CREATEORG in", values, "createorg");
            return (Criteria) this;
        }

        public Criteria andCreateorgNotIn(List<String> values) {
            addCriterion("CREATEORG not in", values, "createorg");
            return (Criteria) this;
        }

        public Criteria andCreateorgBetween(String value1, String value2) {
            addCriterion("CREATEORG between", value1, value2, "createorg");
            return (Criteria) this;
        }

        public Criteria andCreateorgNotBetween(String value1, String value2) {
            addCriterion("CREATEORG not between", value1, value2, "createorg");
            return (Criteria) this;
        }

        public Criteria andUpdateorgIsNull() {
            addCriterion("UPDATEORG is null");
            return (Criteria) this;
        }

        public Criteria andUpdateorgIsNotNull() {
            addCriterion("UPDATEORG is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateorgEqualTo(String value) {
            addCriterion("UPDATEORG =", value, "updateorg");
            return (Criteria) this;
        }

        public Criteria andUpdateorgNotEqualTo(String value) {
            addCriterion("UPDATEORG <>", value, "updateorg");
            return (Criteria) this;
        }

        public Criteria andUpdateorgGreaterThan(String value) {
            addCriterion("UPDATEORG >", value, "updateorg");
            return (Criteria) this;
        }

        public Criteria andUpdateorgGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEORG >=", value, "updateorg");
            return (Criteria) this;
        }

        public Criteria andUpdateorgLessThan(String value) {
            addCriterion("UPDATEORG <", value, "updateorg");
            return (Criteria) this;
        }

        public Criteria andUpdateorgLessThanOrEqualTo(String value) {
            addCriterion("UPDATEORG <=", value, "updateorg");
            return (Criteria) this;
        }

        public Criteria andUpdateorgLike(String value) {
            addCriterion("UPDATEORG like", value, "updateorg");
            return (Criteria) this;
        }

        public Criteria andUpdateorgNotLike(String value) {
            addCriterion("UPDATEORG not like", value, "updateorg");
            return (Criteria) this;
        }

        public Criteria andUpdateorgIn(List<String> values) {
            addCriterion("UPDATEORG in", values, "updateorg");
            return (Criteria) this;
        }

        public Criteria andUpdateorgNotIn(List<String> values) {
            addCriterion("UPDATEORG not in", values, "updateorg");
            return (Criteria) this;
        }

        public Criteria andUpdateorgBetween(String value1, String value2) {
            addCriterion("UPDATEORG between", value1, value2, "updateorg");
            return (Criteria) this;
        }

        public Criteria andUpdateorgNotBetween(String value1, String value2) {
            addCriterion("UPDATEORG not between", value1, value2, "updateorg");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(String value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(String value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(String value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(String value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLike(String value) {
            addCriterion("UPDATETIME like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotLike(String value) {
            addCriterion("UPDATETIME not like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<String> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<String> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(String value1, String value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(String value1, String value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("CREATER is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("CREATER is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("CREATER =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("CREATER <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("CREATER >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("CREATER >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("CREATER <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("CREATER <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("CREATER like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("CREATER not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("CREATER in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("CREATER not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("CREATER between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("CREATER not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNull() {
            addCriterion("MODIFIED is null");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNotNull() {
            addCriterion("MODIFIED is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedEqualTo(String value) {
            addCriterion("MODIFIED =", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotEqualTo(String value) {
            addCriterion("MODIFIED <>", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThan(String value) {
            addCriterion("MODIFIED >", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIED >=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThan(String value) {
            addCriterion("MODIFIED <", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThanOrEqualTo(String value) {
            addCriterion("MODIFIED <=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLike(String value) {
            addCriterion("MODIFIED like", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotLike(String value) {
            addCriterion("MODIFIED not like", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedIn(List<String> values) {
            addCriterion("MODIFIED in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotIn(List<String> values) {
            addCriterion("MODIFIED not in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedBetween(String value1, String value2) {
            addCriterion("MODIFIED between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotBetween(String value1, String value2) {
            addCriterion("MODIFIED not between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("DATA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("DATA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("DATA_TYPE =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("DATA_TYPE <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("DATA_TYPE >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_TYPE >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("DATA_TYPE <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("DATA_TYPE <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("DATA_TYPE like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("DATA_TYPE not like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("DATA_TYPE in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("DATA_TYPE not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("DATA_TYPE between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("DATA_TYPE not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNull() {
            addCriterion("DATA_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNotNull() {
            addCriterion("DATA_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceEqualTo(String value) {
            addCriterion("DATA_SOURCE =", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotEqualTo(String value) {
            addCriterion("DATA_SOURCE <>", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThan(String value) {
            addCriterion("DATA_SOURCE >", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_SOURCE >=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThan(String value) {
            addCriterion("DATA_SOURCE <", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThanOrEqualTo(String value) {
            addCriterion("DATA_SOURCE <=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLike(String value) {
            addCriterion("DATA_SOURCE like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotLike(String value) {
            addCriterion("DATA_SOURCE not like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceIn(List<String> values) {
            addCriterion("DATA_SOURCE in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotIn(List<String> values) {
            addCriterion("DATA_SOURCE not in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceBetween(String value1, String value2) {
            addCriterion("DATA_SOURCE between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotBetween(String value1, String value2) {
            addCriterion("DATA_SOURCE not between", value1, value2, "dataSource");
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