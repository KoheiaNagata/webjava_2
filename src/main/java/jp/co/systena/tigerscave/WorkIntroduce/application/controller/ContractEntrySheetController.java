package jp.co.systena.tigerscave.WorkIntroduce.application.controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import jp.co.systena.tigerscave.WorkIntroduce.application.model.ContractEntrySheetForm;

@Controller
public class ContractEntrySheetController {

  @RequestMapping(name = "/ContractEmployee", method = { RequestMethod.POST }, params = "Contract")
  public String post(@ModelAttribute("ContractEntrySheetForm") @Valid ContractEntrySheetForm Contractform, BindingResult bindingResult) {
    if(bindingResult.hasErrors()) {
      return "ContractEmployee";
    }
    return "ContractEmployeeConfirm";
  }
  
  

}
