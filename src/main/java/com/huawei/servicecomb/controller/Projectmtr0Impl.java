package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-10-14T07:42:54.712Z")

@RestSchema(schemaId = "projectmtr0")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projectmtr0Impl {

    @Autowired
    private Projectmtr0Delegate userProjectmtr0Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectmtr0Delegate.helloworld(name);
    }

}
