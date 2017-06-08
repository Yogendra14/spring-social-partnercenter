package org.springframework.social.partnercenter.api.customer.request;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.social.partnercenter.api.customer.PasswordProfile;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateUserPasswordRequest {
	private PasswordProfile passwordProfile;
	private Map<String, String> attributes;

	public PasswordProfile getPasswordProfile() {
		return passwordProfile;
	}

	public UpdateUserPasswordRequest setPasswordProfile(PasswordProfile passwordProfile) {
		this.passwordProfile = passwordProfile;
		return this;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public UpdateUserPasswordRequest setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
		return this;
	}
}
