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
 * BQExecutionRetrieveInputModelExecutionInstanceAnalysis
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQExecutionRetrieveInputModelExecutionInstanceAnalysis   {
  @JsonProperty("executionInstanceAnalysisReference")
  private String executionInstanceAnalysisReference = null;

  public BQExecutionRetrieveInputModelExecutionInstanceAnalysis executionInstanceAnalysisReference(String executionInstanceAnalysisReference) {
    this.executionInstanceAnalysisReference = executionInstanceAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return executionInstanceAnalysisReference
  **/
  @ApiModelProperty(example = "713122", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view ")
  
    public String getExecutionInstanceAnalysisReference() {
    return executionInstanceAnalysisReference;
  }

  public void setExecutionInstanceAnalysisReference(String executionInstanceAnalysisReference) {
    this.executionInstanceAnalysisReference = executionInstanceAnalysisReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQExecutionRetrieveInputModelExecutionInstanceAnalysis bqExecutionRetrieveInputModelExecutionInstanceAnalysis = (BQExecutionRetrieveInputModelExecutionInstanceAnalysis) o;
    return Objects.equals(this.executionInstanceAnalysisReference, bqExecutionRetrieveInputModelExecutionInstanceAnalysis.executionInstanceAnalysisReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionInstanceAnalysisReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQExecutionRetrieveInputModelExecutionInstanceAnalysis {\n");
    
    sb.append("    executionInstanceAnalysisReference: ").append(toIndentedString(executionInstanceAnalysisReference)).append("\n");
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
