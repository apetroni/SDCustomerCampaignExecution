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
 * CRCustomerCampaignProcedureExchangeInputModelCustomerCampaignProcedureExchangeActionRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CRCustomerCampaignProcedureExchangeInputModelCustomerCampaignProcedureExchangeActionRequest   {
  @JsonProperty("exchangeActionType")
  private String exchangeActionType = null;

  public CRCustomerCampaignProcedureExchangeInputModelCustomerCampaignProcedureExchangeActionRequest exchangeActionType(String exchangeActionType) {
    this.exchangeActionType = exchangeActionType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of exchange (e.g. accept, reject, verify) 
   * @return exchangeActionType
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of exchange (e.g. accept, reject, verify) ")
  
    public String getExchangeActionType() {
    return exchangeActionType;
  }

  public void setExchangeActionType(String exchangeActionType) {
    this.exchangeActionType = exchangeActionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerCampaignProcedureExchangeInputModelCustomerCampaignProcedureExchangeActionRequest crCustomerCampaignProcedureExchangeInputModelCustomerCampaignProcedureExchangeActionRequest = (CRCustomerCampaignProcedureExchangeInputModelCustomerCampaignProcedureExchangeActionRequest) o;
    return Objects.equals(this.exchangeActionType, crCustomerCampaignProcedureExchangeInputModelCustomerCampaignProcedureExchangeActionRequest.exchangeActionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeActionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerCampaignProcedureExchangeInputModelCustomerCampaignProcedureExchangeActionRequest {\n");
    
    sb.append("    exchangeActionType: ").append(toIndentedString(exchangeActionType)).append("\n");
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
