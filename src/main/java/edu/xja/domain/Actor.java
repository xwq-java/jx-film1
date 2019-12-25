package edu.xja.domain;

import java.util.Date;

public class Actor {
    private Integer id;

    private String actorName;

    private String actorNation;

    private String actorBirthday;

    private String actorBloodtype;

    private String actorHometown;

    private String actorPosition;

    private String actorSex;

    private String actorConstellation;

    private String actorSchool;

    private String actorIntroduce;

    private Double actorHeight;

    private String actorFansname;

    private String actorNationality;

    private String actorCompany;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Integer deleteFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName == null ? null : actorName.trim();
    }

    public String getActorNation() {
        return actorNation;
    }

    public void setActorNation(String actorNation) {
        this.actorNation = actorNation == null ? null : actorNation.trim();
    }

    public String getActorBirthday() {
        return actorBirthday;
    }

    public void setActorBirthday(String actorBirthday) {
        this.actorBirthday = actorBirthday == null ? null : actorBirthday.trim();
    }

    public String getActorBloodtype() {
        return actorBloodtype;
    }

    public void setActorBloodtype(String actorBloodtype) {
        this.actorBloodtype = actorBloodtype == null ? null : actorBloodtype.trim();
    }

    public String getActorHometown() {
        return actorHometown;
    }

    public void setActorHometown(String actorHometown) {
        this.actorHometown = actorHometown == null ? null : actorHometown.trim();
    }

    public String getActorPosition() {
        return actorPosition;
    }

    public void setActorPosition(String actorPosition) {
        this.actorPosition = actorPosition == null ? null : actorPosition.trim();
    }

    public String getActorSex() {
        return actorSex;
    }

    public void setActorSex(String actorSex) {
        this.actorSex = actorSex == null ? null : actorSex.trim();
    }

    public String getActorConstellation() {
        return actorConstellation;
    }

    public void setActorConstellation(String actorConstellation) {
        this.actorConstellation = actorConstellation == null ? null : actorConstellation.trim();
    }

    public String getActorSchool() {
        return actorSchool;
    }

    public void setActorSchool(String actorSchool) {
        this.actorSchool = actorSchool == null ? null : actorSchool.trim();
    }

    public String getActorIntroduce() {
        return actorIntroduce;
    }

    public void setActorIntroduce(String actorIntroduce) {
        this.actorIntroduce = actorIntroduce == null ? null : actorIntroduce.trim();
    }

    public Double getActorHeight() {
        return actorHeight;
    }

    public void setActorHeight(Double actorHeight) {
        this.actorHeight = actorHeight;
    }

    public String getActorFansname() {
        return actorFansname;
    }

    public void setActorFansname(String actorFansname) {
        this.actorFansname = actorFansname == null ? null : actorFansname.trim();
    }

    public String getActorNationality() {
        return actorNationality;
    }

    public void setActorNationality(String actorNationality) {
        this.actorNationality = actorNationality == null ? null : actorNationality.trim();
    }

    public String getActorCompany() {
        return actorCompany;
    }

    public void setActorCompany(String actorCompany) {
        this.actorCompany = actorCompany == null ? null : actorCompany.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}