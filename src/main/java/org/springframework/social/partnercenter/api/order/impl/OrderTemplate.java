package org.springframework.social.partnercenter.api.order.impl;

import org.springframework.social.partnercenter.api.order.OrderOperations;
import org.springframework.social.partnercenter.PartnerCenter;
import org.springframework.social.partnercenter.RestResource;
import org.springframework.social.partnercenter.api.AbstractTemplate;
import org.springframework.social.partnercenter.api.order.Order;

public class OrderTemplate extends AbstractTemplate implements OrderOperations {
	private final RestResource restResource;

	public OrderTemplate(RestResource restResource, boolean isAuthorized) {
		super(isAuthorized);
		this.restResource = restResource;
	}

	@Override
	public Order getById(String customerId, String orderId) {
		return restResource.request()
				.pathSegment(customerId, "orders", orderId)
				.get(Order.class);
	}

	@Override
	protected String getProviderId() {
		return PartnerCenter.PROVIDER_ID;
	}
}