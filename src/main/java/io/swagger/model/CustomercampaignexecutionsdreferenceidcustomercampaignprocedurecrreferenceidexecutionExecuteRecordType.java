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
 * CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionExecuteRecordType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionExecuteRecordType   {
  @JsonProperty("executeInputRecord")
  private Object executeInputRecord = null;

  public CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionExecuteRecordType executeInputRecord(Object executeInputRecord) {
    this.executeInputRecord = executeInputRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Execute transaction/record (e.g. deposit, withdrawal, fee/penalty, interest) 
   * @return executeInputRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Execute transaction/record (e.g. deposit, withdrawal, fee/penalty, interest) ")
  
    public Object getExecuteInputRecord() {
    return executeInputRecord;
  }

  public void setExecuteInputRecord(Object executeInputRecord) {
    this.executeInputRecord = executeInputRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionExecuteRecordType customercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionExecuteRecordType = (CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionExecuteRecordType) o;
    return Objects.equals(this.executeInputRecord, customercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionExecuteRecordType.executeInputRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executeInputRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionExecuteRecordType {\n");
    
    sb.append("    executeInputRecord: ").append(toIndentedString(executeInputRecord)).append("\n");
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
