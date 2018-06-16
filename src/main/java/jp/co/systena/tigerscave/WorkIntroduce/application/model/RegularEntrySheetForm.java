package jp.co.systena.tigerscave.WorkIntroduce.application.model;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class RegularEntrySheetForm extends EntrySheetForm implements Serializable {

  private static final long serialVersionUID = -157143280035400042L;

  @NotBlank
  private String name;

  @NotBlank
  private String address;

  @NotBlank
  private String motivationLetter;

  @NotBlank
  @Pattern(regexp="[0-10]")
  private String experience;


  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
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
  public String getMotivationLetter() {
   return this.motivationLetter;
}

  @Override
  public void setMotivationLetter(String motivationLetter) {
    this.motivationLetter = motivationLetter;
  }

  @Override
   public String getExperience() {
    return this.experience;
  }

  @Override
  public void setExperience(String experience) {
    this.experience = experience;
  }

}
