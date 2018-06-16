package jp.co.systena.tigerscave.WorkIntroduce.application.model;

public abstract class ContractForm {

  abstract String getId();

  abstract void setId(String id);

  abstract String getAddress();

  abstract void setAddress(String address);

  abstract String getWorkForm();

  abstract void setWorkForm(String workForm);

  abstract int getSalary();

  abstract void setSalary(int salary);

  abstract int getBonus();

  abstract void setBonus(int salary);

  abstract String getContractPeriod();

  abstract void setContractPeriod(String contractPeriod);
}
