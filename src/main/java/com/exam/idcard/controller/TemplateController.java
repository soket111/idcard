package com.exam.idcard.controller;

import com.exam.idcard.model.Template;
import com.exam.idcard.service.TemplateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/templates")
public class TemplateController {

    private final TemplateService templateService;

    public TemplateController(TemplateService templateService) {
        this.templateService = templateService;
    }

    @GetMapping
    public List<Template> getAllTemplates() {
        return templateService.getAllTemplates();
    }

    @GetMapping("/{id}")
    public Template getTemplateById(@PathVariable Long id) {
        return templateService.getTemplateById(id);
    }

    @PostMapping
    public Template createTemplate(@RequestBody Template template) {
        return templateService.createTemplate(template);
    }

    @PutMapping("/{id}")
    public Template updateTemplate(@PathVariable Long id, @RequestBody Template template) {
        return templateService.updateTemplate(id, template);
    }

    @DeleteMapping("/{id}")
    public String deleteTemplate(@PathVariable Long id) {
        templateService.deleteTemplate(id);
        return "Template deleted successfully";
    }
}