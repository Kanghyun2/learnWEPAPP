package app13;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "cars" })
@Generated("jsonschema2pojo")
public class CarData {

	@JsonProperty("cars")
	private List<Car> cars;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	@JsonProperty("cars")
	public List<Car> getCars() {
		return cars;
	}

	@JsonProperty("cars")
	public void setCars(List<Car> cars) {
		this.cars = cars;
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
		sb.append(CarData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("cars");
		sb.append('=');
		sb.append(((this.cars == null) ? "<null>" : this.cars));
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
