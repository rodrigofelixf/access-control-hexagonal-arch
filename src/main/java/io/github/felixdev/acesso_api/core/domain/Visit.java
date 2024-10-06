package io.github.felixdev.acesso_api.core.domain;

import java.time.LocalDateTime;

public class Visit {
    private Long id;
    private LocalDateTime timeOffEntry;
    private Long idResident;
    private Long idVisitor;


    public Visit() {
    }

    public Visit(Long id, LocalDateTime timeOffEntry, Long idResident, Long idVisitor) {
        this.id = id;
        this.timeOffEntry = timeOffEntry;
        this.idResident = idResident;
        this.idVisitor = idVisitor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTimeOffEntry() {
        return timeOffEntry;
    }

    public void setTimeOffEntry(LocalDateTime timeOffEntry) {
        this.timeOffEntry = timeOffEntry;
    }

    public Long getIdResident() {
        return idResident;
    }

    public void setIdResident(Long idResident) {
        this.idResident = idResident;
    }

    public Long getIdVisitor() {
        return idVisitor;
    }

    public void setIdVisitor(Long idVisitor) {
        this.idVisitor = idVisitor;
    }
}
