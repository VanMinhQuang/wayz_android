package com.wayz.app;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = WayzApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface WayzApplication_GeneratedInjector {
  void injectWayzApplication(WayzApplication wayzApplication);
}
