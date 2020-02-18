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
 * CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecord1CustomerCampaignConsumablesInventory
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecord1CustomerCampaignConsumablesInventory   {
  @JsonProperty("customerCampaignConsumableHolding")
  private String customerCampaignConsumableHolding = null;

  public CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecord1CustomerCampaignConsumablesInventory customerCampaignConsumableHolding(String customerCampaignConsumableHolding) {
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
    CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecord1CustomerCampaignConsumablesInventory crCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecord1CustomerCampaignConsumablesInventory = (CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecord1CustomerCampaignConsumablesInventory) o;
    return Objects.equals(this.customerCampaignConsumableHolding, crCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecord1CustomerCampaignConsumablesInventory.customerCampaignConsumableHolding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignConsumableHolding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecord1CustomerCampaignConsumablesInventory {\n");
    
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
