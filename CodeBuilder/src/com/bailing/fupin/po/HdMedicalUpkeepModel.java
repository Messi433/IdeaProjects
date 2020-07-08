package com.bailing.fupin.po;

import java.math.BigDecimal;

public class HdMedicalUpkeepModel {
    private String id;

    private String personalid;

    private String organizeid;

    private String modelname;

    private String modeltype;

    private String status;

    private BigDecimal fbg;

    private BigDecimal fbgDl;

    private BigDecimal pressureL;

    private BigDecimal pressureH;

    private String rehabilitationGuide;

    private String nursingGuide;

    private String healthGuide;

    private String nutritionGuide;

    private String createtime;

    private String createorg;

    private String updateorg;

    private String updatetime;

    private String creater;

    private String modified;

    private String dataType;

    private String dataSource;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPersonalid() {
        return personalid;
    }

    public void setPersonalid(String personalid) {
        this.personalid = personalid == null ? null : personalid.trim();
    }

    public String getOrganizeid() {
        return organizeid;
    }

    public void setOrganizeid(String organizeid) {
        this.organizeid = organizeid == null ? null : organizeid.trim();
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname == null ? null : modelname.trim();
    }

    public String getModeltype() {
        return modeltype;
    }

    public void setModeltype(String modeltype) {
        this.modeltype = modeltype == null ? null : modeltype.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public BigDecimal getFbg() {
        return fbg;
    }

    public void setFbg(BigDecimal fbg) {
        this.fbg = fbg;
    }

    public BigDecimal getFbgDl() {
        return fbgDl;
    }

    public void setFbgDl(BigDecimal fbgDl) {
        this.fbgDl = fbgDl;
    }

    public BigDecimal getPressureL() {
        return pressureL;
    }

    public void setPressureL(BigDecimal pressureL) {
        this.pressureL = pressureL;
    }

    public BigDecimal getPressureH() {
        return pressureH;
    }

    public void setPressureH(BigDecimal pressureH) {
        this.pressureH = pressureH;
    }

    public String getRehabilitationGuide() {
        return rehabilitationGuide;
    }

    public void setRehabilitationGuide(String rehabilitationGuide) {
        this.rehabilitationGuide = rehabilitationGuide == null ? null : rehabilitationGuide.trim();
    }

    public String getNursingGuide() {
        return nursingGuide;
    }

    public void setNursingGuide(String nursingGuide) {
        this.nursingGuide = nursingGuide == null ? null : nursingGuide.trim();
    }

    public String getHealthGuide() {
        return healthGuide;
    }

    public void setHealthGuide(String healthGuide) {
        this.healthGuide = healthGuide == null ? null : healthGuide.trim();
    }

    public String getNutritionGuide() {
        return nutritionGuide;
    }

    public void setNutritionGuide(String nutritionGuide) {
        this.nutritionGuide = nutritionGuide == null ? null : nutritionGuide.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getCreateorg() {
        return createorg;
    }

    public void setCreateorg(String createorg) {
        this.createorg = createorg == null ? null : createorg.trim();
    }

    public String getUpdateorg() {
        return updateorg;
    }

    public void setUpdateorg(String updateorg) {
        this.updateorg = updateorg == null ? null : updateorg.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified == null ? null : modified.trim();
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }
}