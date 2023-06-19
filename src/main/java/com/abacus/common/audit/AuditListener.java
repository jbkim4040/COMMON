package com.abacus.common.audit;

import jakarta.persistence.PrePersist;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AuditListener {

    /*@PrePersist
    public <T extends Audit> void setInstInfo(T entity) {

        entity.setDataInptDttm(LocalDateTime.now());
        entity.setDataInptId("");
        entity.setDataUpdtDttm(LocalDateTime.now());
        entity.setDataUpdtId("");
    }*/
}
