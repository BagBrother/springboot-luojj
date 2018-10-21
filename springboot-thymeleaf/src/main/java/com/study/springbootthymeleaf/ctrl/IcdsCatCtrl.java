package com.study.springbootthymeleaf.ctrl;

import com.study.springbootthymeleaf.model.IcdsCat;
import com.study.springbootthymeleaf.service.api.IcdsCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/cat")
public class IcdsCatCtrl {

    @Autowired
    private IcdsCatService icdsCatService;

    @RequestMapping("/list")
    public String list(Model model){
        List<IcdsCat> icdsCats = icdsCatService.findList();
        model.addAttribute("icdsCats", icdsCats);
        return "cat/catList";
    }

    @RequestMapping(value = "/delete")
    public String delete(Integer catId){
        icdsCatService.delete(catId);
        return "redirect:/cat/list";
    }

    @RequestMapping(value = "/toAdd")
    public String toAdd(){
        return "cat/add";
    }

    @RequestMapping(value = "/add")
    public String add(@ModelAttribute(value = "icdsCat") IcdsCat icdsCat){
        icdsCatService.add(icdsCat);
        return "cat/catList";
    }
//    @RequestMapping(value = "/edit")
//    public String add(IcdsCat icdsCat){
//        icdsCatService.add(icdsCat);
//        return "redirect:/cat/list";
//    }
}
