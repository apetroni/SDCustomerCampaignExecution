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
 * CRCustomerCampaignProcedureRequestInputModelRequestRecordType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CRCustomerCampaignProcedureRequestInputModelRequestRecordType   {
  @JsonProperty("requestInputRecord")
  private Object requestInputRecord = null;

  public CRCustomerCampaignProcedureRequestInputModelRequestRecordType requestInputRecord(Object requestInputRecord) {
    this.requestInputRecord = requestInputRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Request service record (e.g. rework function, refresh record, process workstep) 
   * @return requestInputRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Request service record (e.g. rework function, refresh record, process workstep) ")
  
    public Object getRequestInputRecord() {
    return requestInputRecord;
  }

  public void setRequestInputRecord(Object requestInputRecord) {
    this.requestInputRecord = requestInputRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerCampaignProcedureRequestInputModelRequestRecordType crCustomerCampaignProcedureRequestInputModelRequestRecordType = (CRCustomerCampaignProcedureRequestInputModelRequestRecordType) o;
    return Objects.equals(this.requestInputRecord, crCustomerCampaignProcedureRequestInputModelRequestRecordType.requestInputRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestInputRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerCampaignProcedureRequestInputModelRequestRecordType {\n");
    
    sb.append("    requestInputRecord: ").append(toIndentedString(requestInputRecord)).append("\n");
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
