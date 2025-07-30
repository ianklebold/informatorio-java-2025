package com.informatorio.info_market.service.pagerequest;

import org.springframework.data.domain.PageRequest;

public interface PageRequestService {
    PageRequest buildPageRequest(Integer pageNumber, Integer pageSize, String propertyToSort);
}