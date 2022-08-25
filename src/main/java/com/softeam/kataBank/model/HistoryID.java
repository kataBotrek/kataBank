package com.softeam.kataBank.model;


import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class HistoryID implements Serializable {

    private Long personId;
    private Long accountId;

    public HistoryID(Long personId, Long accountId) {
        this.personId = personId;
        this.accountId = accountId;
    }

    public HistoryID() {

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}
