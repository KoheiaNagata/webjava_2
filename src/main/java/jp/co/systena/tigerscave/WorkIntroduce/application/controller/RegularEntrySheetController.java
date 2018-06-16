package jp.co.systena.tigerscave.WorkIntroduce.application.controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import jp.co.systena.tigerscave.WorkIntroduce.application.model.RegularEntrySheetForm;

@Controller
public class RegularEntrySheetController {

  @RequestMapping(name = "/RegularEmployee", method = { RequestMethod.POST }, params = "Regular")
  public String post(@ModelAttribute("RegularEntrySheetForm") @Valid RegularEntrySheetForm Regularform, BindingResult bindingResult) {
    if(bindingResult.hasErrors()) {
      return "RegularEmployee";
    }
    return "RegularEmployeeConfirm";
  }



}
