package com.informatorio.info_market.service.pagerequest.impl;

import com.informatorio.info_market.service.pagerequest.PageRequestService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PageRequestServiceImpl implements PageRequestService {

    private static final int DEFAULT_PAGE = 0;
    private static final int DEFAULT_PAGE_SIZE = 25;


    @Override
    public PageRequest buildPageRequest(Integer pageNumber, Integer pageSize, String propertyToSort) {

        int queryPageNumber;
        int queryPageSize;

        if( pageNumber != null && pageNumber > 0 ){
            queryPageNumber = pageNumber;
        }else {
            queryPageNumber = DEFAULT_PAGE;
        }

        if( pageSize != null && pageSize > 0 ){
            queryPageSize = pageSize;
        }else {
            queryPageSize = DEFAULT_PAGE_SIZE;
        }

        if(propertyToSort != null){
            Sort sortPage = Sort.by(Sort.Order.asc(propertyToSort));

            return PageRequest.of(queryPageNumber, queryPageSize, sortPage);
        }else {
            return PageRequest.of(queryPageNumber, queryPageSize);
        }
    }
}
