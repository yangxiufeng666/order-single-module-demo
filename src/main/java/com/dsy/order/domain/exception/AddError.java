package com.dsy.order.domain.exception;

import com.dsy.sunshine.web.exception.BusinessErrorCode;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-05-06
 * @time 17:14
 */
public class AddError extends BusinessErrorCode {


    public AddError(int code, String msg) {
        super(code, msg);
    }
}
