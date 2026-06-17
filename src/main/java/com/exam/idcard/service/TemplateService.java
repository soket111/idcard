package com.exam.idcard.service;

import com.exam.idcard.model.Template;
import com.exam.idcard.repository.TemplateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateService {

    private final TemplateRepository templateRepository;

    public TemplateService(TemplateRepository templateRepository) {
        this.templateRepository = templateRepository;
    }

    public List<Template> getAllTemplates() {
        return templateRepository.findAll();
    }

    public Template getTemplateById(Long id) {
        return templateRepository.findById(id).orElse(null);
    }

    public Template createTemplate(Template template) {
        return templateRepository.save(template);
    }

    public Template updateTemplate(Long id, Template data) {
        Template template = templateRepository.findById(id).orElse(null);
        if (template == null) return null;

        template.setTemplateName(data.getTemplateName());
        template.setFormat(data.getFormat());
        template.setContent(data.getContent());

        return templateRepository.save(template);
    }

    public void deleteTemplate(Long id) {
        templateRepository.deleteById(id);
    }
}