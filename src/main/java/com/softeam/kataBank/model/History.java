package com.softeam.kataBank.model;

import javax.persistence.*;


@Entity
public class History {

    @EmbeddedId
    private HistoryID historyID;

    @ManyToOne
    @MapsId("personId")
    private Person person;


    @ManyToOne
    @MapsId("accountId")
    private Account account;

    public HistoryID getHistoryID() {
        return historyID;
    }

    public void setHistoryID(HistoryID historyID) {
        this.historyID = historyID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
