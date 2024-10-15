package org.sunbird.models.user.events;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserEvents {

    private static final long serialVersionUID = 1L;
    private boolean active;
    private String addedBy;
    private String batchId;
    private String contentId;
    private String contextId;
    private String delta;
    private Date enrolledDate;
    private String grade;
    private String datetime;
    private String lastReadContentId;
    private String completedon;
    private int lastReadContentStatus;
    private int progress;
    private int status;
    private String userId;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getDelta() {
        return delta;
    }

    public void setDelta(String delta) {
        this.delta = delta;
    }

    public Date getEnrolledDate() {
        return enrolledDate;
    }

    public void setEnrolledDate(Date enrolledDate) {
        this.enrolledDate = enrolledDate;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getLastReadContentId() {
        return lastReadContentId;
    }

    public void setLastReadContentId(String lastReadContentId) {
        this.lastReadContentId = lastReadContentId;
    }

    public int getLastReadContentStatus() {
        return lastReadContentStatus;
    }

    public void setLastReadContentStatus(int lastReadContentStatus) {
        this.lastReadContentStatus = lastReadContentStatus;
    }

    public String getCompletedon() {
        return completedon;
    }

    public void setCompletedon(String completedon) {
        this.completedon = completedon;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContentId() {return contentId;}

    public void setContentId(String contentId) {this.contentId = contentId;}

    public String getContextId() { return contextId; }

    public void setContextId(String contextId) { this.contextId = contextId; }
}
