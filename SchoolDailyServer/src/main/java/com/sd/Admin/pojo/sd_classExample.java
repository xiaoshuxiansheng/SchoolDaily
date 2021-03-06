package com.sd.Admin.pojo;

import java.util.ArrayList;
import java.util.List;

public class sd_classExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sd_class
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sd_class
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sd_class
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_class
     *
     * @mbg.generated
     */
    public sd_classExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_class
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_class
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_class
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_class
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_class
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_class
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_class
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_class
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_class
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_class
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sd_class
     *
     * @mbg.generated
     */
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(String value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(String value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(String value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(String value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(String value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLike(String value) {
            addCriterion("class_id like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotLike(String value) {
            addCriterion("class_id not like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<String> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<String> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(String value1, String value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(String value1, String value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassRankIsNull() {
            addCriterion("class_rank is null");
            return (Criteria) this;
        }

        public Criteria andClassRankIsNotNull() {
            addCriterion("class_rank is not null");
            return (Criteria) this;
        }

        public Criteria andClassRankEqualTo(Integer value) {
            addCriterion("class_rank =", value, "classRank");
            return (Criteria) this;
        }

        public Criteria andClassRankNotEqualTo(Integer value) {
            addCriterion("class_rank <>", value, "classRank");
            return (Criteria) this;
        }

        public Criteria andClassRankGreaterThan(Integer value) {
            addCriterion("class_rank >", value, "classRank");
            return (Criteria) this;
        }

        public Criteria andClassRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_rank >=", value, "classRank");
            return (Criteria) this;
        }

        public Criteria andClassRankLessThan(Integer value) {
            addCriterion("class_rank <", value, "classRank");
            return (Criteria) this;
        }

        public Criteria andClassRankLessThanOrEqualTo(Integer value) {
            addCriterion("class_rank <=", value, "classRank");
            return (Criteria) this;
        }

        public Criteria andClassRankIn(List<Integer> values) {
            addCriterion("class_rank in", values, "classRank");
            return (Criteria) this;
        }

        public Criteria andClassRankNotIn(List<Integer> values) {
            addCriterion("class_rank not in", values, "classRank");
            return (Criteria) this;
        }

        public Criteria andClassRankBetween(Integer value1, Integer value2) {
            addCriterion("class_rank between", value1, value2, "classRank");
            return (Criteria) this;
        }

        public Criteria andClassRankNotBetween(Integer value1, Integer value2) {
            addCriterion("class_rank not between", value1, value2, "classRank");
            return (Criteria) this;
        }

        public Criteria andClassMajorIsNull() {
            addCriterion("class_major is null");
            return (Criteria) this;
        }

        public Criteria andClassMajorIsNotNull() {
            addCriterion("class_major is not null");
            return (Criteria) this;
        }

        public Criteria andClassMajorEqualTo(String value) {
            addCriterion("class_major =", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorNotEqualTo(String value) {
            addCriterion("class_major <>", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorGreaterThan(String value) {
            addCriterion("class_major >", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorGreaterThanOrEqualTo(String value) {
            addCriterion("class_major >=", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorLessThan(String value) {
            addCriterion("class_major <", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorLessThanOrEqualTo(String value) {
            addCriterion("class_major <=", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorLike(String value) {
            addCriterion("class_major like", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorNotLike(String value) {
            addCriterion("class_major not like", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorIn(List<String> values) {
            addCriterion("class_major in", values, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorNotIn(List<String> values) {
            addCriterion("class_major not in", values, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorBetween(String value1, String value2) {
            addCriterion("class_major between", value1, value2, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorNotBetween(String value1, String value2) {
            addCriterion("class_major not between", value1, value2, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassGradeIsNull() {
            addCriterion("class_grade is null");
            return (Criteria) this;
        }

        public Criteria andClassGradeIsNotNull() {
            addCriterion("class_grade is not null");
            return (Criteria) this;
        }

        public Criteria andClassGradeEqualTo(Integer value) {
            addCriterion("class_grade =", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeNotEqualTo(Integer value) {
            addCriterion("class_grade <>", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeGreaterThan(Integer value) {
            addCriterion("class_grade >", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_grade >=", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeLessThan(Integer value) {
            addCriterion("class_grade <", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeLessThanOrEqualTo(Integer value) {
            addCriterion("class_grade <=", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeIn(List<Integer> values) {
            addCriterion("class_grade in", values, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeNotIn(List<Integer> values) {
            addCriterion("class_grade not in", values, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeBetween(Integer value1, Integer value2) {
            addCriterion("class_grade between", value1, value2, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("class_grade not between", value1, value2, "classGrade");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(String value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(String value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(String value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(String value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(String value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(String value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLike(String value) {
            addCriterion("student_id like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotLike(String value) {
            addCriterion("student_id not like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<String> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<String> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(String value1, String value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(String value1, String value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sd_class
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sd_class
     *
     * @mbg.generated
     */
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