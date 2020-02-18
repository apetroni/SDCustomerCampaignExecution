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
 * CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory   {
  @JsonProperty("customerCampaignConsumableHolding")
  private String customerCampaignConsumableHolding = null;

  public CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory customerCampaignConsumableHolding(String customerCampaignConsumableHolding) {
    this.customerCampaignConsumableHolding = customerCampaignConsumableHolding;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The tracked inventory of the consumable item 
   * @return customerCampaignConsumableHolding
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The tracked inventory of the consumable item ")
  
    public String getCustomerCampaignConsumableHolding() {
    return customerCampaignConsumableHolding;
  }

  public void setCustomerCampaignConsumableHolding(String customerCampaignConsumableHolding) {
    this.customerCampaignConsumableHolding = customerCampaignConsumableHolding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory crCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory = (CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory) o;
    return Objects.equals(this.customerCampaignConsumableHolding, crCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory.customerCampaignConsumableHolding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignConsumableHolding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory {\n");
    
    sb.append("    customerCampaignConsumableHolding: ").append(toIndentedString(customerCampaignConsumableHolding)).append("\n");
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
