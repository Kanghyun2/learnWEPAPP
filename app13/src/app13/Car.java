package app13;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "car", "car_model", "car_color", "car_model_year", "car_vin", "price", "availability" })
@Generated("jsonschema2pojo")
public class Car {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("car")
	private String car;
	@JsonProperty("car_model")
	private String carModel;
	@JsonProperty("car_color")
	private String carColor;
	@JsonProperty("car_model_year")
	private Integer carModelYear;
	@JsonProperty("car_vin")
	private String carVin;
	@JsonProperty("price")
	private String price;
	@JsonProperty("availability")
	private Boolean availability;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("car")
	public String getCar() {
		return car;
	}

	@JsonProperty("car")
	public void setCar(String car) {
		this.car = car;
	}

	@JsonProperty("car_model")
	public String getCarModel() {
		return carModel;
	}

	@JsonProperty("car_model")
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	@JsonProperty("car_color")
	public String getCarColor() {
		return carColor;
	}

	@JsonProperty("car_color")
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	@JsonProperty("car_model_year")
	public Integer getCarModelYear() {
		return carModelYear;
	}

	@JsonProperty("car_model_year")
	public void setCarModelYear(Integer carModelYear) {
		this.carModelYear = carModelYear;
	}

	@JsonProperty("car_vin")
	public String getCarVin() {
		return carVin;
	}

	@JsonProperty("car_vin")
	public void setCarVin(String carVin) {
		this.carVin = carVin;
	}

	@JsonProperty("price")
	public String getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(String price) {
		this.price = price;
	}

	@JsonProperty("availability")
	public Boolean getAvailability() {
		return availability;
	}

	@JsonProperty("availability")
	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Car.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("id");
		sb.append('=');
		sb.append(((this.id == null) ? "<null>" : this.id));
		sb.append(',');
		sb.append("car");
		sb.append('=');
		sb.append(((this.car == null) ? "<null>" : this.car));
		sb.append(',');
		sb.append("carModel");
		sb.append('=');
		sb.append(((this.carModel == null) ? "<null>" : this.carModel));
		sb.append(',');
		sb.append("carColor");
		sb.append('=');
		sb.append(((this.carColor == null) ? "<null>" : this.carColor));
		sb.append(',');
		sb.append("carModelYear");
		sb.append('=');
		sb.append(((this.carModelYear == null) ? "<null>" : this.carModelYear));
		sb.append(',');
		sb.append("carVin");
		sb.append('=');
		sb.append(((this.carVin == null) ? "<null>" : this.carVin));
		sb.append(',');
		sb.append("price");
		sb.append('=');
		sb.append(((this.price == null) ? "<null>" : this.price));
		sb.append(',');
		sb.append("availability");
		sb.append('=');
		sb.append(((this.availability == null) ? "<null>" : this.availability));
		sb.append(',');
		sb.append("additionalProperties");
		sb.append('=');
		sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

}
