package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecordDateType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecordDateType   {
  @JsonProperty("date")
  private String date = null;

  public CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecordDateType date(String date) {
    this.date = date;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Value of the date type 
   * @return date
  **/
  @ApiModelProperty(example = "09-22-2018", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Value of the date type ")
  
    public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecordDateType crCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecordDateType = (CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecordDateType) o;
    return Objects.equals(this.date, crCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecordDateType.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecordDateType {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
