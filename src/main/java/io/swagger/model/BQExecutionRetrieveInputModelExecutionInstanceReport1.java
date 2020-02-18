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
 * BQExecutionRetrieveInputModelExecutionInstanceReport1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQExecutionRetrieveInputModelExecutionInstanceReport1   {
  @JsonProperty("executionInstanceReportReference")
  private String executionInstanceReportReference = null;

  public BQExecutionRetrieveInputModelExecutionInstanceReport1 executionInstanceReportReference(String executionInstanceReportReference) {
    this.executionInstanceReportReference = executionInstanceReportReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return executionInstanceReportReference
  **/
  @ApiModelProperty(example = "704406", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report ")
  
    public String getExecutionInstanceReportReference() {
    return executionInstanceReportReference;
  }

  public void setExecutionInstanceReportReference(String executionInstanceReportReference) {
    this.executionInstanceReportReference = executionInstanceReportReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQExecutionRetrieveInputModelExecutionInstanceReport1 bqExecutionRetrieveInputModelExecutionInstanceReport1 = (BQExecutionRetrieveInputModelExecutionInstanceReport1) o;
    return Objects.equals(this.executionInstanceReportReference, bqExecutionRetrieveInputModelExecutionInstanceReport1.executionInstanceReportReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionInstanceReportReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQExecutionRetrieveInputModelExecutionInstanceReport1 {\n");
    
    sb.append("    executionInstanceReportReference: ").append(toIndentedString(executionInstanceReportReference)).append("\n");
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
