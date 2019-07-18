package com.freestyle.framework.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.freestyle.framework.common.ResponseData;
import com.freestyle.framework.entity.Sample;

/**
 * @author huangxiaohui
 *localhost:8080/sample/getAllSample
 */
@RestController
@RequestMapping(value = "/sample")
public class SampleController {
    @RequestMapping(value = "/getAllSample", method = RequestMethod.GET)
    public ResponseData<?> getAllSample() {
        List<Sample> list = new ArrayList<>();
        Sample sample = new Sample();
        sample.setId(1L);
        sample.setSName("hxh test ok 了");
        list.add(sample);
        return new ResponseData<>(list);
    }
    @RequestMapping(value = "/testRight", method = RequestMethod.GET)
    public ResponseData<?> testRight() {
        List<Sample> list = new ArrayList<>();
        Sample sample = new Sample();
        sample.setId(1L);
        sample.setSName("testRight ok 了");
        list.add(sample);
        return new ResponseData<>(list);
    }
}
