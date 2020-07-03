package org.yelpapiinterface.springbootstarter.sample;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SampleService {

    private List<SampleObject> objects = new ArrayList<>(Arrays.asList(new SampleObject("first sampleID", "Sample Name", true, 1),
            new SampleObject("sampleID", "Sample Name 2", false, 12)));

    public List<SampleObject> getAllObjects() {
        return this.objects;
    }

    public SampleObject getSampleObject(String name) {
        return objects.stream().filter(object -> object.getName().equals(name)).findFirst().get();
    }

    public void addSampleObject(SampleObject object) {
        objects.add(object);
    }

}
