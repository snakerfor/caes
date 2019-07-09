package com.ruoyi.back.domain;

import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户对象 test_score
 * 
 * @author Snakerfor
 */
public class TestScore extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    private Long scoreId;
    /** 部门ID */
    private String studentId;

    /** 部门父ID */
    private String coureId;

    /** 部门父ID */
    private String coureName;
    
    /** 角色ID */
    private float score;

    public Long getScoreId() {
        return scoreId;
    }

    public void setScoreId(Long scoreId) {
        this.scoreId = scoreId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCoureId() {
        return coureId;
    }

    public void setCoureId(String coureId) {
        this.coureId = coureId;
    }

    public String getCoureName() {
        return coureName;
    }

    public void setCoureName(String coureName) {
        this.coureName = coureName;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }


    @Override
    public String toString() {
        return "TestScore{" +
                "scoreId=" + scoreId +
                ", studentId='" + studentId + '\'' +
                ", coureId='" + coureId + '\'' +
                ", coureName='" + coureName + '\'' +
                ", score=" + score +
                '}';
    }
}
