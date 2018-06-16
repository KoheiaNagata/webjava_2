package jp.co.systena.tigerscave.WorkIntroduce.application.model;

public class ContractEmployeeForm extends ContractForm {

  private String id;
  private String address;
  private String workForm;
  private int salary;
  private int bonus;
  private String contractPeriod;

  public WorkForm work;

  public ContractEmployeeForm(final String id, final String address, final String workForm, final int salary, final String contractPeriod, final WorkForm work) {
    this.id = id;
    this.address = address;
    this.workForm = workForm;
    this.salary = salary;
    this.contractPeriod = contractPeriod;
    this.work = work;
  }

  @Override
  public String getId() {
   return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String getAddress() {
   return this.address;
  }

  @Override
  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String getWorkForm() {
    return this.workForm;
  }

  @Override
  public void setWorkForm(String workForm) {
    this.workForm = workForm;
  }

  @Override
  public int getSalary() {
    return this.salary;
  }

  @Override
  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public int getBonus() {
    return this.bonus;
  }

  @Override
  public void setBonus(int bonus) {
    this.bonus = bonus;
  }

  @Override
  public String getContractPeriod() {
    return this.contractPeriod;
  }

  @Override
  public void setContractPeriod(String contractPeriod) {
    this.contractPeriod = contractPeriod;
  }
}
