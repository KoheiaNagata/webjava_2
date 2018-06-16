package jp.co.systena.tigerscave.WorkIntroduce.application.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.WorkIntroduce.application.model.AllListForm;
import jp.co.systena.tigerscave.WorkIntroduce.application.model.ContractListService;

@Controller
@SessionAttributes(names="reqForm")
public class WorkListController {

  @Autowired
  private ContractListService contractListService;

  @Autowired
  HttpSession session;

  @ModelAttribute
  @RequestMapping(value="/ContractList")
  public ModelAndView show() {
    AllListForm AllEmpList = new AllListForm();
    AllEmpList.regularEmployeeFormList = contractListService.getRegularEmployeeFormList();
    AllEmpList.contractEmployeeFormList = contractListService.getContractEmployeeFormList();

    return new ModelAndView("ContractList","form",AllEmpList);
  }

}
