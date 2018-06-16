package jp.co.systena.tigerscave.WorkIntroduce.application.model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ContractListService {
  private static final List<RegularEmployeeForm> REGULAR_EMPLOYEE_LIST = new ArrayList<>();
  private static final List<ContractEmployeeForm> CONTRACT_EMPLOYEE_LIST = new ArrayList<>();

  static {
    REGULAR_EMPLOYEE_LIST.add(new RegularEmployeeForm("1","神奈川県横浜市鶴見区","正社員",200000,400000,new SystemEngineerForm()));
    REGULAR_EMPLOYEE_LIST.add(new RegularEmployeeForm("2","神奈川県横浜市港北区","正社員",200000,400000,new AccountingForm()));
    REGULAR_EMPLOYEE_LIST.add(new RegularEmployeeForm("3","神奈川県横浜市港北区","正社員",230000,400000,new SystemEngineerForm()));
    REGULAR_EMPLOYEE_LIST.add(new RegularEmployeeForm("4","神奈川県横浜市港南区","正社員",200000,400000,new AccountingForm()));
    REGULAR_EMPLOYEE_LIST.add(new RegularEmployeeForm("5","神奈川県横浜市港北区","正社員",210000,400000,new SystemEngineerForm()));
    REGULAR_EMPLOYEE_LIST.add(new RegularEmployeeForm("6","神奈川県横浜市港北区","正社員",220000,400000,new AccountingForm()));

    CONTRACT_EMPLOYEE_LIST.add(new ContractEmployeeForm("1","神奈川県横浜市鶴見区","契約社員",200000,"3年間",new SystemEngineerForm()));
    CONTRACT_EMPLOYEE_LIST.add(new ContractEmployeeForm("2","神奈川県横浜市港北区","契約社員",200000,"3年間",new AccountingForm()));
    CONTRACT_EMPLOYEE_LIST.add(new ContractEmployeeForm("3","神奈川県横浜市港北区","契約社員",230000,"3年間",new SystemEngineerForm()));
    CONTRACT_EMPLOYEE_LIST.add(new ContractEmployeeForm("4","神奈川県横浜市港南区","契約社員",200000,"3年間",new AccountingForm()));
    CONTRACT_EMPLOYEE_LIST.add(new ContractEmployeeForm("5","神奈川県横浜市港北区","契約社員",210000,"3年間",new SystemEngineerForm()));
    CONTRACT_EMPLOYEE_LIST.add(new ContractEmployeeForm("6","神奈川県横浜市港北区","契約社員",220000,"3年間",new AccountingForm()));

  }


  public List<RegularEmployeeForm> getRegularEmployeeFormList(){
    return REGULAR_EMPLOYEE_LIST;
  }

  public List<ContractEmployeeForm> getContractEmployeeFormList(){
    return CONTRACT_EMPLOYEE_LIST;
  }

}
