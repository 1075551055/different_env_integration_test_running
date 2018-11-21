# different_env_integration_test_running

junit test category &amp; maven config for running different enviroment integration test

# Introduction

Just imagine that We have one code base, need to deploy to two or more different environments, but it will have some different integration test & exist some different configs for different environments.This project demo is to solve this.Its general idea is using junit @Category combine with maven test plugin <groups> config.
  
# Usage

  1. Add @Category(groupClass.class) to test method or test class, if the test case is for all environments, no need to add        @Category;
  
  2. maven command for Env1 & Env2:  
      mvn clean install -PEnv1-Test  
      mvn clean install -PEnv2-Test  
