package com.jfilter.filter;

import org.springframework.core.MethodParameter;

/**
 * Interface used in FilterFactory for configuring list of filters
 */
@FunctionalInterface
public interface FilterEvent {
    /**
     * Build base {@link BaseFilter}
     *
     * @param methodParameter {@link MethodParameter} method parameter
     * @return object instance of inherited class from {@link BaseFilter}
     */
    BaseFilter build(MethodParameter methodParameter);
}