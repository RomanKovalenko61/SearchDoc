package ru.almazrostov.searchdoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.almazrostov.searchdoc.entity.Doc;
import ru.almazrostov.searchdoc.entity.OwnerDoc;
import ru.almazrostov.searchdoc.entity.Status;
import ru.almazrostov.searchdoc.entity.TypeDoc;
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
    private static final ArrayList<TypeDoc> typeDocList = new ArrayList<>(Arrays.asList(TypeDoc.values()));
    private static final ArrayList<ru.almazrostov.searchdoc.entity.Model> modelList =
            new ArrayList<>(Arrays.asList(ru.almazrostov.searchdoc.entity.Model.values()));
    private static final ArrayList<Status> statusList = new ArrayList<>(Arrays.asList(Status.values()));

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
        putAllGeneralAttributesToModel(model, doc);
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
        putAllGeneralAttributesToModel(model, doc);
        return "update_doc.html";
    }

    @GetMapping("/deleteDoc/{id}")
    public String deleteDoc(@PathVariable(value = "id") String uuid) {
        docService.deleteDocById(UUID.fromString(uuid));
        return "redirect:/";
    }

    private static Model putAllGeneralAttributesToModel(Model model, Doc doc) {
        model.addAttribute("doc", doc);
        model.addAttribute("owners", ownerList);
        model.addAttribute("types", typeDocList);
        model.addAttribute("models", modelList);
        model.addAttribute("statuses", statusList);
        return model;
    }
}
