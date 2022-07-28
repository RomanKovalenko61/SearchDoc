package ru.almazrostov.searchdoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.almazrostov.searchdoc.entity.Doc;
import ru.almazrostov.searchdoc.entity.OwnerDoc;
import ru.almazrostov.searchdoc.service.DocService;
import ru.almazrostov.searchdoc.util.GenerateUUIDForDocUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Controller
public class MyController {

    private final DocService docService;

    private static final ArrayList<OwnerDoc> ownerList = new ArrayList<>(Arrays.asList(OwnerDoc.values()));

    @Autowired
    public MyController(DocService docService) {
        this.docService = docService;
    }

    @RequestMapping("/")
    public String showAllDocs(Model model) {
        List<Doc> allDocs = docService.getAllDocs();
        model.addAttribute("allDocs", allDocs);
        return "all-docs.html";
    }

    @GetMapping("/showNewDocForm")
    public String showNewDocForm(Model model) {
        Doc doc = new Doc();
        model.addAttribute("doc", doc);
        model.addAttribute("owners", ownerList);
        return "new_doc.html";
    }

    @PostMapping("/saveDoc")
    public String saveDoc(@ModelAttribute("doc") Doc doc) {
        doc.setUuid(GenerateUUIDForDocUtil.generateUUID(doc));
        docService.saveDoc(doc);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") String uuid, Model model) {
        Doc doc = docService.getDocById(UUID.fromString(uuid));
        model.addAttribute("doc", doc);
        model.addAttribute("owners", ownerList);
        return "update_doc.html";
    }

    @GetMapping("/deleteDoc/{id}")
    public String deleteDoc(@PathVariable(value = "id") String uuid) {
        docService.deleteDocById(UUID.fromString(uuid));
        return "redirect:/";
    }
}
