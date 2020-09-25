package com.example.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import io.ebean.config.ModuleInfo;
import io.ebean.config.ModuleInfoLoader;

@ModuleInfo(entities={"com.example.model.Company"})
public class _ebean$ModuleInfo implements ModuleInfoLoader {

  private List<Class<?>> otherClasses() {
    return Collections.emptyList();
  }

  @Override
  public List<Class<?>> entityClasses() {
    List<Class<?>> entities = new ArrayList<>();
    entities.add(com.example.model.Company.class);
    return entities;
  }

  @Override
  public List<Class<?>> entityClassesFor(String dbName) {

    return Collections.emptyList();
  }

}
