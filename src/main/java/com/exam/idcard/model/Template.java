package com.exam.idcard.model;

import jakarta.persistence.*;

@Entity
@Table(name = "templates")
public class Template {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String templateName;

    private String format;

    @Column(length = 5000)
    private String content;

    public Template() {
    }

    public Long getId() {
        return id;
    }

    public String getTemplateName() {
        return templateName;
    }

    public String getFormat() {
        return format;
    }

    public String getContent() {
        return content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setContent(String content) {
        this.content = content;
    }
}