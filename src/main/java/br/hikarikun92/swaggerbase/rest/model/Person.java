package br.hikarikun92.swaggerbase.rest.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Person
 */
@Validated
public class Person   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("birthDate")
  private LocalDate birthDate = null;

  @JsonProperty("nationality")
  private String nationality = null;

  @JsonProperty("email")
  private String email = null;

  public Person name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Person birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Get birthDate
   * @return birthDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public Person nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
  **/
  @ApiModelProperty(value = "")
  
    public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public Person email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.name, person.name) &&
        Objects.equals(this.birthDate, person.birthDate) &&
        Objects.equals(this.nationality, person.nationality) &&
        Objects.equals(this.email, person.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, birthDate, nationality, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
