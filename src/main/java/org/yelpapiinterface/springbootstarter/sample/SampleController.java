package org.yelpapiinterface.springbootstarter.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SampleController {

    @Autowired
    private SampleService service;

    @RequestMapping(value = "/sample")
    public List<SampleObject> sample() {
        return service.getAllObjects();
    }

    @RequestMapping("/sample/{name}")
    public SampleObject getSampleObject(@PathVariable String name) {
        return service.getSampleObject(name);
    }

    @RequestMapping(method=RequestMethod.POST, value="/sample")
    public void addSampleObject(@RequestBody SampleObject object) {
        service.addSampleObject(object);
    }

}
